package ArrayListSorting;

import java.util.*;
/**
 *
 * @author Luis_
 */

interface AnonClass{
    public void anonMethod();
}

public class Main {
    
    public static void main(String[] args){
        ArrayList<String> myList = new ArrayList<>();
        myList.add("Volkswagen");
        myList.add("Toyota");
        myList.add("Porsche");
        myList.add("Ferrari");
        myList.add("Mercedez-Benz");
        myList.add("Audi");
        myList.add("Rolls-Royce");
        myList.add("BMW");
        myList.add("Ford");
        myList.add("Chevrolet");
        System.out.println("List before sorting: " + myList);
               
        //Por longitud clase anónima
        AnonClass anonClass = new AnonClass(){
            public void anonMethod(){
                myList.sort(Comparator.comparingInt(String::length));
                System.out.println("Por longitud con clase anonima");
                System.out.println(myList);
            }
        };
        anonClass.anonMethod();
        //Por longitud expresion lambda
        AnonClass lambdaExpresion = () -> {
            System.out.println("Por longitud expresion lambda");
            System.out.println(myList);
        };
        lambdaExpresion.anonMethod();
        //Por longitud metodo de referencia
        System.out.println("Por longitud metodo de referencia");
        myList.sort(Comparator.comparingInt(String::length));
        System.out.println(myList);
        //por orden alfabetico clase anonima
        AnonClass lambdaExpresion2 = new AnonClass(){
            public void anonMethod(){
                myList.sort(String::compareToIgnoreCase);
                System.out.println("Por orden alfabetico clase anonima");
                System.out.println(myList);
            }
        };
        lambdaExpresion2.anonMethod();
        //por orden alfabetico expresion lambda
        AnonClass anonClass2 = () -> {
            myList.sort(String::compareToIgnoreCase);
            System.out.println("Por orden alfabetico clase anonima");
            System.out.println(myList);
        };
        anonClass2.anonMethod();
        //por orden alfabetico metodo de referencia
        System.out.println("Por orden alfabetico metodo de referencia");
        myList.sort(String::compareToIgnoreCase);
        System.out.println(myList);
    }
}
