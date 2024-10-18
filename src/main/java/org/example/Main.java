package org.example;

import java.text.NumberFormat;
import java.util.Locale;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner leerDato = new Scanner(System.in);
        double monto;
        int operacion;
        double conversion;
        double tasaDeCambio = 4246.33;
        System.out.print("Ingrese el monto: ");
        monto = leerDato.nextDouble();
        System.out.println("OPCION 1: COP a USD");
        System.out.println("OPCION 2: USD a COP");
        System.out.print("Dijite el numero de una opcion: ");
        operacion = leerDato.nextInt();

        NumberFormat formatoMonedaUsa = NumberFormat.getCurrencyInstance(new Locale("en", "US"));
        formatoMonedaUsa.setMaximumFractionDigits(2);  // Para asegurar solo 2 decimales

        NumberFormat formatoMonedaCol = NumberFormat.getCurrencyInstance(new Locale("es", "CO"));
        formatoMonedaCol.setMaximumFractionDigits(2);  // Para asegurar solo 2 decimales

        if (operacion == 1){

            conversion = monto/tasaDeCambio;
            System.out.println(formatoMonedaCol.format(monto) + "COP son " + formatoMonedaUsa.format(conversion) + "USD");
        }else{

            conversion = monto*tasaDeCambio;
            System.out.println(formatoMonedaUsa.format(monto) + "USD son " + formatoMonedaCol.format(conversion) + "COP");
        }
    }
}