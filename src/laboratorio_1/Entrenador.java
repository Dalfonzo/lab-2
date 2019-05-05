/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package laboratorio_1;

/**
 *
 * @author LAB_A613
 */
public class Entrenador extends Persona{
    private int experiencia;
    private String especialidad;

    public Entrenador(int experiencia, String especialidad, int cedula, String nombre, int edad, char sexo, float peso, float altura, String direccion) {
        super(cedula, nombre, edad, sexo, peso, altura, direccion);
        this.experiencia = experiencia;
        this.especialidad = especialidad;
    }

    public Entrenador() {
        this.experiencia = 0;
        this.especialidad = "";
    }
    
    public void determinarRutina(int grasaCorpo, String tipoEjer){
        
        if(grasaCorpo == -1)
            System.out.println("Yoga");
        else if(grasaCorpo == 0)
            System.out.println("Bailoterapia");
        else 
            System.out.println("Cardio");               
    }
    
    public void determinarRutina(String tipoEjer, int grasaCorpo){
        
        if(grasaCorpo == -1)
            System.out.println("Meditacion");
        else if(grasaCorpo == 0)
            System.out.println("Pesas");
        else 
            System.out.println("Spinning");                
    }
}