/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package aco_max_min;

import java.util.Date;
import ecuacion.Ecuacion;

/**
 *
 * @author usuario
 */
public class ACO_MAX_MIN {

    private Ecuacion ecuacion;
    private Ants arrayAnts[];
    private Matriz pheromoneMatriz;
    private int[] bestGlobal_Solution;
    private int cantCicle;
    private int cantAnts;
    private int alpha;
    private int beta;
    private double pBest;
    private int iteration;

    public ACO_MAX_MIN(double pBest, double constEvaporacion, int cantAnts, int cantCicle, Ecuacion e) {
        this.ecuacion = e;
        this.pheromoneMatriz = new Matriz(ecuacion, constEvaporacion);
        this.cantAnts = cantAnts;
        this.beta = beta;
        this.alpha = alpha;
        this.cantCicle = cantCicle;
        this.pBest = pBest;
    }

    public ACO_MAX_MIN(double constEvaporacion, int cantAnts, int cantCicle, Ecuacion e) {
        this.ecuacion = e;
        this.pheromoneMatriz = new Matriz(ecuacion, constEvaporacion);
        this.cantAnts = cantAnts;
        this.cantCicle = cantCicle;

    }

    //seria evaluar la mejor solucion y copararla con la mejor global
    //calcular coste globar, debe ser el metodo eval function, en la clase medio
    private boolean CompareGlobalSolution(int bestCycle_Solution[]) {
        double sumSolutioAux = 0;
        double sumGlobalSolutio = 0;
        if (this.bestGlobal_Solution != null) {
            sumSolutioAux = calculateCoste_Global(bestCycle_Solution);        //seria eval function con solution mejor
            sumGlobalSolutio = calculateCoste_Global(this.bestGlobal_Solution);//seria eval funtion con solution mejor global
            if (sumGlobalSolutio > sumSolutioAux) {
                return true;
            }
            return false;
        } else {
            return true;
        }
    }

    public String[] PrintGlobalSolution() {


        return imprimir_Global(this.bestGlobal_Solution);
    }

    //busqueda del optimo
    private int[] localSerch2_opt(int[] soluction) {
//
        int[] arraytemp = new int[soluction.length];
        double soluction_result;

        for (int i = 0; i < soluction.length; i++) {
            arraytemp[i] = soluction[i];
        }
        soluction_result = calculateCoste_Global(soluction);

        for (int i = 0; i < this.arrayAnts.length; i++) {
            for (int j = 0; j < soluction.length; j++) {
                arraytemp[j] = this.arrayAnts[i].returnTour()[j];
                /*1*/
//                   arraytemp = this.informationMedio.acotar(arraytemp); //acotarrrrrrrrrrrrrr
                   /*1*/
                if (esAcotado(arraytemp)) {
                    if (soluction_result > calculateCoste_Global(arraytemp)) {
                        soluction[j] = arraytemp[j];
                        soluction_result = calculateCoste_Global(soluction);
                    } else {
                        arraytemp[j] = soluction[j];
                    }
                } else {
                    arraytemp[j] = soluction[j];
                }
            }
        }
        return arraytemp;
    }

    public void executeAsTSP() {

        this.arrayAnts = new Ants[this.cantAnts];
        int cantState = getSizeProblem();
        this.pheromoneMatriz.printMaxMinPheromone();

        for (int i = 0; i < cantCicle; i++) { // cantidad de ciclos (iteraciones)
            for (int j = 0; j < this.cantAnts; j++) { // inicializacion del arreglo de hormigas y del estado inicial
                arrayAnts[j] = new Ants(cantState);
                arrayAnts[j].nextStep(ecuacion, this.pheromoneMatriz);
            }

            int k = 1;
            //recorro # de fila
            while (k++ < cantState) {
                for (int j = 0; j < this.cantAnts; j++) {// movimiento de las hormigas
                    arrayAnts[j].nextStep(ecuacion, this.pheromoneMatriz);
                }
            }

            // find a local solution

            /*1*/
            for (int j = 0; j < cantAnts; j++) {
                arrayAnts[j].setTourMemory(this.acotar(arrayAnts[j].returnTour()));   //acotarrrrrr
            }
            /*1*/

            int[] localSolution = this.arrayAnts[0].returnTour();
            for (int j = 1; j < this.cantAnts; j++) {
                if (calculateCoste_Global(localSolution) > calculateCoste_Global(this.arrayAnts[j].returnTour())) {
                    localSolution = this.arrayAnts[j].returnTour();
                }
            }

            localSolution = localSerch2_opt(localSolution);
//            localSolution = this.localSerch2_opt(localSolution);
            if (this.CompareGlobalSolution(localSolution)) {
                this.bestGlobal_Solution = localSolution;
                this.iteration = i;
            }

            double coste = calculateCoste_Global(localSolution);
            this.pheromoneMatriz.updatePheromone_Global(coste, localSolution);
            this.pheromoneMatriz.calculate_PheromoneMaxMin(coste, this.pBest);
            this.pheromoneMatriz.regulate_PheromoneMaxMin();
            
            
            //codigo jfree
            
            
            //
        }

        this.arrayAnts = new Ants[0];

        double[] ds = ecuacion.construir_variable(bestGlobal_Solution);

        for (int i = 0; i < ds.length; i++) {
            System.out.print(ds[i] + "\t");
        }
        System.out.println();
//        System.out.println();
//        this.informationMedio.printMatrixPheromone();

    }

    public int getSizeProblem() {
        return ecuacion.getSize();
    }

    public double calculateCoste_Global(int tour[]) {
        double cost = 0;
        //crear vector sol
        double[] variable = ecuacion.construir_variable(tour);
        cost = ecuacion.eval_funcion(variable);
        return cost;
    }

    public String[] imprimir_Global(int tour[]) {
        double cost = 0;

        //crear vector sol
        double[] variable = ecuacion.construir_variable(tour);
        String[] cadena = new String[variable.length + 1];
        for (int i = 1; i < (variable.length + 1); i++) {
            cadena[i] = variable[i - 1] + "";
        }
        cost = ecuacion.eval_funcion(variable);
        cadena[0] = cost + "";
        return cadena;
    }

    public boolean esAcotado(int tour[]) {
        boolean b = true;
        int[] newtour = new int[tour.length];
        for (int i = 0; i < tour.length; i++) {
            newtour[i] = tour[i];
        }
        int fila = 0;
        double num = 0;
        int count = -1; //cuenta la cant de variables continuas


        //conformo el numero para compararlo com max, min
        for (int i = 0; i < ecuacion.getVariable().length; i++) {
            if (ecuacion.getType()[i].compareToIgnoreCase("continua") == 0) {
                count++;
                //conformo el numero
                num = 0;
                //tomo el valor que refleja tour[fila en el dominio]
                num += Double.parseDouble(ecuacion.getDominio()[i][tour[fila]]);
                for (int k = 0; k < ecuacion.getGl(); k++) {
                    ////////////////////////////////////////////////////////////////////////////////////////////////////////////////
                    if (Double.parseDouble(ecuacion.getDominio()[i][tour[fila]]) < 0 || ecuacion.getDominio()[i][tour[fila]].compareToIgnoreCase("-0") == 0) {
                        num += -1 * tour[fila + k + 1] / (Math.pow(10, k + 1));
                    } else {
                        num += tour[fila + k + 1] / (Math.pow(10, k + 1));
                    }
                }

                num = Math.round(num * Math.pow(10, ecuacion.getGl())) / Math.pow(10, ecuacion.getGl());

                //verifico si no esta en el rango
                if (num < ecuacion.getMin()[count] || num > ecuacion.getMax()[count]) {
                    b = b && false;
                }
                fila += ecuacion.getGl();
            }
            fila++;
        }
        return b;
    }

    public int[] acotar(int tour[]) {
        int[] newtour = new int[tour.length];
        for (int i = 0; i < tour.length; i++) {
            newtour[i] = tour[i];
        }
        int fila = 0;
        double num = 0;
        int count = -1; //cuenta la cant de variables continuas
        int tmpnum = 0;
        int signo = 1;

        //conformo el numero para compararlo com max, min
        for (int i = 0; i < ecuacion.getVariable().length; i++) {
            if (ecuacion.getType()[i].compareToIgnoreCase("continua") == 0) {
                count++;
                //conformo el numero
                num = 0;
                //tomo el valor que refleja tour[fila en el dominio]
                num += Double.parseDouble(ecuacion.getDominio()[i][tour[fila]]);
                for (int k = 0; k < ecuacion.getGl(); k++) {
                    ////////////////////////////////////////////////////////////////////////////////////////////////////////////////
                    if (Double.parseDouble(ecuacion.getDominio()[i][tour[fila]]) < 0 || ecuacion.getDominio()[i][tour[fila]].compareToIgnoreCase("-0") == 0) {
                        num += -1 * tour[fila + k + 1] / (Math.pow(10, k + 1));
                    } else {
                        num += tour[fila + k + 1] / (Math.pow(10, k + 1));
                    }
                }

                num = Math.round(num * Math.pow(10, ecuacion.getGl())) / Math.pow(10, ecuacion.getGl());

                //verifico si no esta en el rango
                if (num < ecuacion.getMin()[count] || num > ecuacion.getMax()[count]) {
                    signo = 1;
                    if (num < ecuacion.getMin()[count]) {
                        if (ecuacion.getMin()[count] < 0) {
                            signo = -1;
                        }
                        tmpnum = (int) (ecuacion.getMin()[count] * Math.pow(10, ecuacion.getGl()));
                    } else {
                        if (ecuacion.getMax()[count] < 0) {
                            signo = -1;
                        }
                        tmpnum = (int) (ecuacion.getMax()[count] * Math.pow(10, ecuacion.getGl()));
                    }

                    ////////////////////////////////////////////////////////////////////////////////////////////////////////////////
//
//                    if (tmpnum < 0) {
//                        signo = -1;
//                    }

                    //inserto max o min
                    tmpnum = signo * tmpnum;
                    for (int k = ecuacion.getGl(); k > 0; k--) {
                        newtour[fila + k] = tmpnum % 10;
                        tmpnum = (tmpnum - (tmpnum % 10)) / 10;
                    }


                    //el valor se indexa segun el dominio
//                    if (num < ecuacion.getMin()[count]) {
//                        newtour[fila] = 0;
//                    } else {
//                        newtour[fila] = ecuacion.getDominio()[i].length - 1;
//                    }

                }
                fila += ecuacion.getGl();
            }
            fila++;
        }
        return newtour;
    }
}
