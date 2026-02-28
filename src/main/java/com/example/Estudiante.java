package com.example;

public class Estudiante {
    private String nombre;
    private int edad;
    private double promedio;

    // 1. Constructor Vacío
    public Estudiante() {
        this.nombre = "Sin nombre";
        this.edad = 0;
        this.promedio = 0.0;
    }

    // 2. Constructor Completo
    public Estudiante(String nombre, int edad, double promedio) {
        this.nombre = nombre;
        setEdad(edad); // Usamos el setter para validar desde el constructor
        this.promedio = promedio;
    }

    // Getters y Setters con validación
    public String getNombre() { return nombre; }
    public void setNombre(String nombre) { this.nombre = nombre; }

    public int getEdad() { return edad; }
    public void setEdad(int edad) {
        if (edad > 0) {
            this.edad = edad;
        } else {
            this.edad = 0; // Validación requerida
        }
    }

    public double getPromedio() { return promedio; }
    public void setPromedio(double promedio) { this.promedio = promedio; }

    // Método lógico solicitado
    public boolean haAprobado() {
        return this.promedio >= 3.0;
    }

    public void mostrarInfo() {
        String estado = haAprobado() ? "Aprobado" : "Reprobado";
        System.out.println("Estudiante: " + nombre + " | Edad: " + edad + " | Promedio: " + promedio + " | Estado: " + estado);
    }
}