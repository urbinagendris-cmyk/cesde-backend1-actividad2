package com.example;


public class Main {
    public static void main(String[] args) {
        System.out.println("--- PRUEBA CLASE LIBRO ---");
        Libro libroDefecto = new Libro();
        Libro libroParametros = new Libro("El Señor de los Anillos", "J.R.R. Tolkien", 1200);
        
        libroDefecto.mostrarDetalles();
        libroParametros.mostrarDetalles();

        System.out.println("\n--- PRUEBA CLASE CUENTABANCARIA ---");
        CuentaBancaria cuenta = new CuentaBancaria("12345", 500.0, "Ahorros");
        System.out.println("Saldo inicial: " + cuenta.getSaldo());
        cuenta.depositar(200.0);
        System.out.println("Saldo tras depósito: " + cuenta.getSaldo());
        cuenta.retirar(800.0); // Esto debe activar el mensaje de error
        System.out.println("Saldo final: " + cuenta.getSaldo());

        System.out.println("\n--- PRUEBA CLASE ESTUDIANTE ---");
        Estudiante est1 = new Estudiante("Juan", 20); // Usa constructor de 2 parámetros
        Estudiante est2 = new Estudiante("Maria", 22, "Ingeniería"); // Usa constructor completo
        
        est1.mostrarInfo();
        est2.mostrarInfo();
    }
}