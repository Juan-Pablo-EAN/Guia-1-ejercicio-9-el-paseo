package el.paseo;

import java.util.Scanner;
public class ElPaseo {

    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        int gordos = 0;
        int flacos = 0;
        int dias = 0;
        
        System.out.println("¿Cuantos estudiantes gordos iran al paseo?");
        gordos = entrada.nextInt();
        System.out.println("¿Cuantos estudiantes flacos iran al paseo?");
        flacos = entrada.nextInt();
        System.out.println("¿Cuantos días durará el paseo?");
        dias = entrada.nextInt();
        
        int buses = Math.round((gordos*2)+flacos)/60;
        int nplatos = (gordos*5)+(flacos*3);
        int cplatos = ((gordos*5)+(flacos*3))*10000;
        int ctplatos = cplatos*dias;
        int nhabt = (gordos+flacos)/4;
        int chabt = nhabt*25000;
        int cthabt = chabt*dias;
        
        System.out.println("");
        System.out.println("Número de buses:" + buses);
        System.out.println("Número de platos por día:" + " " + nplatos);
        System.out.println("Costo de platos por día" + " " + "$" + cplatos);
        System.out.println("Costo total de platos:" + " " + "$" + ctplatos);
        System.out.println("Número de habitaciones:" + " " + nhabt);
        System.out.println("Costo de habitaciones por día:" + " " + "$" + chabt);
        System.out.println("Costo total de las habitaciones:" + " " + "$" + cthabt);
    }
    
}
