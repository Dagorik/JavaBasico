import android.service.autofill.FillEventHistory;

import java.sql.SQLOutput;
import java.util.ArrayList;
import java.util.List;
import java.util.SplittableRandom;

import dagorik.mariachi.com.ohanahome.Adapters.ViewHolders.ViewHolderGastos;
import dagorik.mariachi.com.ohanahome.Carro;

/**
 * Created by Dagorik on 29/08/17.
 */

public class ClaseJava {


    public static void main(String[] args) {

        Carro ferrari = new Carro("AZUL",200,"8 CILINDORS");
        ferrari.acelera();
        ferrari.frena();
        ferrari.detallesCarro();
        String color = ferrari.getColor();
        System.out.println("EL COLOR ES : " + color);
        int velocidaFerrari = ferrari.getVelocidad();
        System.out.println("LA VELOCIDAD DEL FERRARI ES: " + velocidaFerrari);


        System.out.println("-------------------------------------");

        Carro carroPorDefecto = new Carro();
        carroPorDefecto.acelera();
        carroPorDefecto.frena();
        carroPorDefecto.detallesCarro();
        String colorCarro = carroPorDefecto.getColor();
        System.out.println("EL COLOR ES : " + colorCarro);
        int carroPorDefectoVelocidad = carroPorDefecto.getVelocidad();
        System.out.println("LA VELOCIDAD DEL CARRO ES: " + carroPorDefectoVelocidad);



    }



    public static void suma(int x, int y) {

        double suma = (x + y);

        System.out.println(suma);
    }

    public static void resta(int x, int y) {

        int resta = x - y;

        System.out.println(resta);

    }

    public static void div(double x, double y) {
        double div = x / y;

        System.out.println(div);
    }

    public static void sentencias(int numero, int numero2) {

        if (numero == 3 || numero2 == 2) {
            System.out.println("Se cumplio la sentencia");
        } else if (numero == 6) {
            System.out.println("Es 6!!!");
        } else {
            System.out.println("No cumple");
        }

        for (int i = 0; i < 10; i++) {

            int x = numero2 + i;

            System.out.println(i);
        }

    }


    public static void list() {


        List<Integer> integerList = new ArrayList<>();

        integerList.add(3);
        integerList.add(5);
        integerList.add(4);
        integerList.add(7);
        integerList.add(8);
        integerList.add(1);
        integerList.add(4);
        integerList.add(6);
        integerList.add(4);
        integerList.add(8);

        int suma = 0;
        for (int i = 0; i < integerList.size(); i++) {
            suma = suma + integerList.get(i);

        }

        System.out.println(suma);

    }

}
