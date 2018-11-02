/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Programa;


public class Metodos {

    public static double DescSalud(double sal) {
        double preciTotal;
        preciTotal = sal * 0.04;
        return preciTotal;
    }

    public static double DescPension(double sal) {
        double preciTotal;
        preciTotal = sal * 0.04;
        return preciTotal;
    }

    public static double DescAportes(double sal) {
        double preciTotal;
        preciTotal = sal * 0.02;
        return preciTotal;
    }

    public static double TotalDesc(double sal) {
        double total = DescAportes(sal) + DescPension(sal) + DescSalud(sal);
        return total;
    }

    public static double SalNeto(double sal) {
        double neto = sal - (DescAportes(sal) + DescPension(sal) + DescSalud(sal));
        return neto;
    }
}
