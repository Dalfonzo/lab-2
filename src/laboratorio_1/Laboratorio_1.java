
package laboratorio_1;
import java.util.Scanner;

/**
 * @authors 
 * Maria Ortiz, David Perez
 */

public class Laboratorio_1 {
     
    public static void msjPeso(int val){
        if(val == -1)
            System.out.println("Está muy delgada");
        else if(val == 0)
            System.out.println("Tiene exceso de grasa corporal");
        else
            System.out.println("Tiene peso ideal");
    }
    
    public static void msjRitmoCard(boolean value) {
         

        if (value)
            System.out.println("El deportista puede hacer ejercicios");
        else
            System.out.println("No puede realizar ejercicios"); 
    
    }
    
    public static void llenarVarGlobales(Persona per, Scanner read, String nombre, int edad, char sexo, float peso, float altura, float ritmoCard, String frecEntr, String tipoEjer, int experiencia, String especialidad){
            String[] EjOp={"tonificación", "reducción de peso", "reducción de medidas", "cardio", "pesas","flexibilidad y equilibrio", "relajación"};
            int op=0;
            
            System.out.println("Inserte nombre: ");
            nombre = read.nextLine();

            System.out.println("Inserte edad: ");
            edad = read.nextInt();

            
            do{
                System.out.println("Inserte sexo (M o F): ");
                sexo = read.next().charAt(0);
            }while(!per.comprobarSexo(sexo));

            System.out.println("Inserte peso: ");
            peso = read.nextFloat();

            System.out.println("Inserte altura: ");
            altura = read.nextFloat();
            
            System.out.println("Inserte Ritmo Cardiaco");
            ritmoCard = read.nextFloat();
            
            read.nextLine();
            
            
            do{
                System.out.println("Indique la frecuencia de entrenamiento (diario o semanal): ");
                frecEntr = read.nextLine();   
     
            } while(!frecEntr.equals("diario") && !frecEntr.equals("semanal"));
            
           
           
            System.out.println("Indique el tipo de ejercicio que realiza");
            System.out.println("Seleccione una opción");
            
            for(int i=0;i<EjOp.length; i++){
                System.out.println("Opcion "+ i + ". "+EjOp[i]);
            }
            
            System.out.println("Opcion -1. Introducir su propio tipo de entrenamiento ");
            
            op = read.nextInt();
            
            if(op>=0 && op<=EjOp.length){
                
                 tipoEjer= EjOp[op];
                
            } else {
                System.out.println("Introduzca su tipo de ejercicio");
                read.nextLine();
                tipoEjer = read.nextLine().toLowerCase();
            }
            
            
            if(per instanceof Entrenador){
                System.out.println("Indica tus años de experiencia: ");
                experiencia = read.nextInt();
            
                read.nextLine();
            
                System.out.println("Indica tu especialidad ");
                especialidad = read.nextLine();
            
            }
                
        
    }
    
    public static void main(String[] args) {
    
         
        String nombre="";
        int edad=0;
        char sexo=' ';
        float peso=0;
        float altura=0;
        float ritmoCard=0;
        String frecEntr="";
        String tipoEjer="";
        int experiencia=0;
        String especialidad="";
      
        /*Instancia de la clase scanner*/
        Scanner read = new Scanner( System.in );
        
        Deportista depor1= new Deportista();
        Entrenador entre1 = new Entrenador();
        
        System.out.println("Rellene los datos del deportista 2: ");
        llenarVarGlobales(depor1,read,nombre,edad,sexo,peso,altura,ritmoCard,frecEntr,tipoEjer,experiencia,especialidad);
        
        
        Deportista depor2= new Deportista(ritmoCard, frecEntr, tipoEjer, 0 , nombre,edad, sexo, peso, altura, "");
        
        /*Chequear si puede hacer ejercicio*/
        msjRitmoCard(depor2.calcRitmoCard());
        
        /*Revisar grasa corporal*/
        msjPeso(depor2.calcularIMC());
        
        
        read.nextLine();
        
        System.out.println("Rellene los datos del entrenador 2:");
        llenarVarGlobales(entre1,read,nombre,edad,sexo,peso,altura,ritmoCard,frecEntr,tipoEjer,experiencia,especialidad);     
        Entrenador entre2 = new Entrenador(experiencia,especialidad, 0 , nombre,edad, sexo, peso, altura, "");
        
        System.out.println("Rutinas recomendadas al deportista por parte del entrenador:");
        System.out.println("Rutina 1:");
        entre2.determinarRutina(depor2.getTipoEj(), depor2.calcularIMC());
        System.out.println("Rutina 2:");
        entre2.determinarRutina(depor2.calcularIMC(), depor2.getTipoEj());
            
        
            
    }
    
    
  
    
    
     
    //private String[] frecEnt={"diario", "semanal"};
   // private String[] TipoEj={"tonificación", "reducción de peso", "reducción de medidas", "cardio", "pesas",
//"flexibilidad y equilibrio", "relajación"};
    
}


