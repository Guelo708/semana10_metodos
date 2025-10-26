package com.example;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

         Scanner scanner = new Scanner(System.in);
        while (true) {
            menu();
            int opcion = scanner.nextInt();

            if (opcion == 0) {
                break;
            }
            
            switch (opcion) {
                case 1:
                    ejercicio1();
                    break;
                case 2:
                    ejercicio2();
                    break;
                case 3:
                    ejercicio3();
                    break;
                case 4:
                    ejercicio4();
                    break;
                case 5:
                    ejercicio5();
                    break;
                case 6:
                    ejercicio6();
                    break;
                case 7:
                    ejercicio7();
                    break;
                case 8:
                    ejercicio8();
                    break;
                case 9:
                    ejercicio9();
                    break;
                case 10:
                    ejercicio10();
                    break;
                default:
                    System.out.println("Opción Inválida");
            }

        }
        System.out.println("Fin del programa");
        //scanner.close();
    }

    public static void menu() {
        System.out.println("--------------------------------");
        System.out.println("Bienvenido a la aplicación de la semana 10");
        System.out.println("1. Ejercicio 1");
        System.out.println("2. Ejercicio 2");
        System.out.println("3. Ejercicio 3");
        System.out.println("4. Ejercicio 4");
        System.out.println("5. Ejercicio 5");
        System.out.println("6. Ejercicio 6");
        System.out.println("7. Ejercicio 7");
        System.out.println("8. Ejercicio 8");
        System.out.println("9. Ejercicio 9");
        System.out.println("10. Ejercicio 10");
        System.out.println("0. para salir");
        System.out.println("Selecciona una opción: ");
        System.out.println("--------------------------------");
    }

    public static void ejercicio1() {
        System.out.println("Ejercicio 1: Calculadora de descuentos en Tienda");
    double descuentoTotalCompra = 0.0;
    double precioUnitario = 10000.0;
    int cantidadProductos = 500;

    // Descuento por volumen (orden corregido)
    if (cantidadProductos > 20){
        descuentoTotalCompra = 0.20;
    } else if (cantidadProductos > 10){
        descuentoTotalCompra = 0.15;
    } else if (cantidadProductos > 5){
        descuentoTotalCompra = 0.10;
    }

    double totalCompra = (precioUnitario * cantidadProductos) * (1 - descuentoTotalCompra);

    // Descuento adicional por monto
    if (totalCompra > 100000){
        totalCompra = totalCompra * (1 - 0.05);
    }

    System.out.println("Precio final a pagar: $" + totalCompra);
}



    public static void ejercicio2() {

    

   
    int edad = 25;
    double ingresos = 2500000;
    double gastos = 900000;

    boolean ingresosValidos = ingresos >= 2000000;
    boolean edadValida = edad >= 18 && edad <= 65;
    boolean gastosValidos = gastos <= ingresos * 0.7;


            if (ingresosValidos && edadValida && gastosValidos) {
            double montoMaximoCredito = ingresos * 5;
            System.out.println("¡Crédito aprobado!");
            System.out.println("Monto máximo del crédito: $" + montoMaximoCredito);
        } else {
            System.out.println("Crédito no aprobado. No cumple con todos los criterios.");
        }


    



 


        System.out.println("Ejercicio 2");
    }

    public static void ejercicio3() {
        System.out.println("Ejercicio 3");
    }

    public static void ejercicio4() {

        double tiempoBus = 20.0;
        double tiempoMetro = 15.0;
        double tiempoCaminata = 10.0;

        boolean traficoPesado = true;
        boolean lluvia = true;

        if (traficoPesado){
            tiempoBus *= 1.5;
        }
        if (lluvia){
            tiempoCaminata *= 2;
        }

        double tiempoViaje = tiempoBus + tiempoMetro + tiempoCaminata;
        
        System.out.println("El tiempo total de viaje fue: " + tiempoViaje +" Minutos");
    }

    public static void ejercicio5() {
        System.out.println("Ejercicio 5");
    }

    public static void ejercicio6() {
        System.out.println("Ejercicio 6");
    }

    public static void ejercicio7() {
        System.out.println("Ejercicio 7");
    }

    public static void ejercicio8() {
        System.out.println("Ejercicio 8");
    }

    public static void ejercicio9() {

        Scanner scanner = new Scanner(System.in);

        System.out.println("🎓 Ejercicio 9: Calculadora de Notas y Promedio Estudiantil");
        System.out.println("Área de Aplicación: Educación\n");

        for (int i = 1; i <= 3; i++) {
            System.out.println(" Estudiante " + i + ":");

            System.out.print("Ingrese nota de parciales (0.0 - 5.0): ");
            double parciales = scanner.nextDouble();

            System.out.print("Ingrese nota del proyecto final (0.0 - 5.0): ");
            double proyecto = scanner.nextDouble();

            System.out.print("Ingrese nota de participación (0.0 - 5.0): ");
            double participacion = scanner.nextDouble();

            // Calcular promedio ponderado
            double promedio = (parciales * 0.3) + (proyecto * 0.4) + (participacion * 0.3);

            // Mostrar resultado
            System.out.printf("📊 Promedio final: %.2f\n", promedio);

            if (promedio >= 4.0) {
                System.out.println("✅ Estado: Aprobado");
            } else if (promedio >= 3.5) {
                System.out.println("📝 Estado: Supletorio");
            } else {
                System.out.println("❌ Estado: Reprobado");
            }

            System.out.println(); // Espacio entre estudiantes
        }
    }

    

    
    


    public static void ejercicio10() {
        System.out.println("Ejercicio 10: Simulación de riego automático para una granja");

    java.util.Random random = new java.util.Random();

    for (int dia = 1; dia <= 7; dia++) {
        System.out.println("\n Día " + dia + ":");

        // Simular condiciones climáticas
        boolean llovio = random.nextBoolean(); // true o false
        int humedad = random.nextInt(101);     // 0 a 100%
        int temperatura = 15 + random.nextInt(21); // 15°C a 35°C

        System.out.println("Lluvia en últimas 24h: " + (llovio ? "Sí" : "No"));
        System.out.println("Humedad del suelo: " + humedad + "%");
        System.out.println("Temperatura: " + temperatura + "°C");

        // Lógica de activación del riego
        if (llovio) {
            System.out.println(" No se activa el riego por lluvia reciente.");
        } else if (humedad < 30) {
            System.out.println(" Riego activado por 60 minutos (humedad < 30%).");
        } else if (temperatura > 25 && humedad < 50) {
            System.out.println("Riego activado por 30 minutos (alta temperatura y humedad moderada).");
        } else {
            System.out.println(" No se requiere riego hoy.");
        }
    }
}


        
}


