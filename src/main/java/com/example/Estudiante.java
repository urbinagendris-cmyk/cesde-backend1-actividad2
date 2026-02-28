package com.example;


public class Estudiante {
    private String nombre;
    private int edad;
    private String curso;

    // Constructor con 2 parámetros
    public Estudiante(String nombre, int edad) {
        this(nombre, edad, "Ninguno"); // Llama al constructor de 3 parámetros
    }

    // Constructor con 3 parámetros (Completo)
    public Estudiante(String nombre, int edad, String curso) {
        this.nombre = nombre;
        this.edad = edad;
        this.curso = curso;
    }

    public void mostrarInfo() {
        System.out.println("Nombre: " + nombre + ", Edad: " + edad + ", Curso: " + curso);
    }
}