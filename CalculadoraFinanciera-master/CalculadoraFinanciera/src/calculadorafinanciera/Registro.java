/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package calculadorafinanciera;

/**
 *
 * @author jhon
 */
public class Registro {
    //Atributos
    private int no;
    private double ci,i,p,abo,cf;

    public Registro(int no, double ci, double i, double p, double abo, double cf) {
        this.no = no;
        this.ci = ci;
        this.i = i;
        this.abo = abo;
        this.p = p;
        this.cf = cf;
    }

    public int getNo() {
        return no;
    }

    public double getCi() {
        return ci;
    }

    public double getI() {
        return i;
    }

    public double getP() {
        return p;
    }

    public double getAbo() {
        return abo;
    }

    public double getCf() {
        return cf;
    }

    public void setNo(int no) {
        this.no = no;
    }

    public void setCi(double ci) {
        this.ci = ci;
    }

    public void setI(double i) {
        this.i = i;
    }

    public void setP(double p) {
        this.p = p;
    }

    public void setAbo(double abo) {
        this.abo = abo;
    }

    public void setCf(double cf) {
        this.cf = cf;
    }
       
}
