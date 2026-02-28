package com.example;

public class Main {
    public static void main(String[] args) {
        // Prueba Libro
        Libro l1 = new Libro("Hábitos Atómicos", "James Clear"); // El que faltaba
        l1.mostrarDetalles();

        // Prueba Cuenta Bancaria
        CuentaBancaria cuenta = new CuentaBancaria("Andrés Urbina", 1000.0);
        cuenta.retirar(500);
        System.out.println("Titular: " + cuenta.getTitular() + " | Saldo: " + cuenta.getSaldo());

        // Prueba Estudiante
        Estudiante est = new Estudiante("Camilo", 19, 4.5);
        est.mostrarInfo();
    }
}