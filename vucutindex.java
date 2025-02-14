package vucutkitleindeksi;

import java.util.Scanner;

public class vucutindex {
    public static void main(String[] args) {
        Scanner oku=new Scanner(System.in);
        System.out.print("kilonuzu giriniz=");
        double kilo= oku.nextDouble();

        System.out.print("boyunuz giriniz=");
        double boy= oku.nextDouble();

        double vucutkitleindexi=kilo/(boy*boy);
        System.out.println("vucutkitleindexi = " + vucutkitleindexi);
        if (vucutkitleindexi<18.5){
            System.out.println("zayıf");
        } else if (vucutkitleindexi>=18.5 && vucutkitleindexi<24.9) {
            System.out.println("normal kilolu");

        } else if (vucutkitleindexi>=25.0 && vucutkitleindexi<29.9) {
            System.out.println("fazla kilolusunuz ve sağlığınıza dikkat etmelisiniz");

        } else if (vucutkitleindexi>=30.0 && vucutkitleindexi<34.9) {
            System.out.println("1.derece obezsiniz ve doktora başvurmalısınız");

        }
        else {
            System.out.println("aşırı obezsiniz ve derhal doktor yardımı almalısınız");
        }

    }
}
