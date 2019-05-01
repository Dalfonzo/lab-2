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
public class Deportista extends Persona {
    private float ritmoCard;
    private String frecEnt;
    private String tipoEj;
    
   

    public Deportista() {
        this.ritmoCard = 0;
        this.frecEnt = "";
        this.tipoEj = "";
    }

    public Deportista(float ritmoCard, String frecEnt, String tipoEj, int cedula, String nombre, int edad, char sexo, float peso, float altura, String direccion) {
        super(cedula, nombre, edad, sexo, peso, altura, direccion);
        this.ritmoCard = ritmoCard;
        this.frecEnt = frecEnt;
        this.tipoEj = tipoEj;
    }
         
    public boolean calcRitmoCard(){
        return !(this.ritmoCard>=100);
    }

    public String getTipoEj() {
        return tipoEj;
    }
    

    @Override
    public int calcularIMC() {
        int valorSexo=0;
       
        if(this.sexo =='M'|| this.sexo =='m')
           valorSexo = 1;
       
        float imc= this.peso / (this.altura * this.altura);
           
        float grasaCorporal=(float)((1.20*imc)+(0.23*this.edad)-(10.8*valorSexo)-5.4);
        
        if(valorSexo==1){
            
            if(grasaCorporal<0.15)
                return -1;
            else if(grasaCorporal>=0.15 && grasaCorporal<0.20)
                return 0;
            else 
                return 1;
            
        } else {
            
            if(grasaCorporal<0.25)
                return -1;
            else if(grasaCorporal>=0.25 && grasaCorporal<0.35)
                return 0;
            else 
                return 1;
               
        }
        
    }
    
    
    
}
