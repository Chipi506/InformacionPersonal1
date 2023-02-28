package com.mycompany.informacionpersonal1;

/**
 *
 * @author gonza
 */
public class InformacionPersonal1 {

    String nombre = "Brandon Macbeth",
            apellido_paterno = "Benitez",
            apellido_materno = "Castillo";
    int edad = 23;
    String fecha_nacimiento = "24/Octubre/1999";
    String hobbies = "jugar videojuegos, ver peliculas y series";
    String Semestre = "2° semestre";
    String Materias = "Cálculo, Crcuitos Eléctricos, Teoría de sistemas, Teoría de algoritmos, Inglés y Programación";

    public void InformacionN() {
        System.out.println("El nombre completo de la persona es: " + nombre + " " + apellido_paterno + " " + apellido_materno);
        System.out.println("Su edad es: " + edad + " años ");
        System.out.println("Su fecha de nacimiento es: " + fecha_nacimiento);
        System.out.println("Su pasatiempo es: " + hobbies);
        System.out.println("Cursa el: " + Semestre);
        System.out.println("Toma las materias de: " + Materias);
    }

    public static void main(String[] args) {
        InformacionPersonal1 informacion = new InformacionPersonal1();
        informacion.InformacionN();
    }
}
