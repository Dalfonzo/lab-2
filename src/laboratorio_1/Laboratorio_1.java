
package laboratorio_1;
import java.util.Scanner;

/**
 * @authors 
 * Maria Ortiz, David Perez
 */

public class Laboratorio_1 {
    
    public static void msjEdad(boolean val){
       
       if(val)
            System.out.println("Es mayor de Edad");
        else
            System.out.println("No es mayor de Edad"); 
    }
    
    public static void msjPeso(int val){
    
        if(val == 0)
            System.out.println("Tiene peso ideal");
        else if(val == -1)
            System.out.println("Tiene bajo peso");
        else if(val == 1)
            System.out.println("Tiene SobrePeso");
        else
            System.out.println("Tiene obesidad");

    }
    
    public static void msjRitmoCard(boolean value) {
        if (value)
            System.out.println("Puedes hacer ejercicios");
        else
            System.out.println("NO PUEDES HACER EJERCICIO"); 
    
    }
    
    public static void main(String[] args) {
        
//        /*Objeto con valores por default*/
//        Persona pDef = new Persona();
//        
//        /*Asignacion de nuevos valores , usando setters, al objeto con valores default*/
//        pDef.setAltura(2.00f);
//        pDef.setCedula(12345678);
//        pDef.setDireccion("St. Street none of your business Apt #4");
//        pDef.setEdad(27);
//        pDef.setNombre("Abraham Duke");
//        pDef.setPeso(90);
//        pDef.setSexo('M');
//        
//        System.out.println("<--- Objeto Default --->");
//        msjEdad(pDef.esMayorDeEdad());
//        msjPeso(pDef.calcularIMC());
//        pDef.imprimirDatosPer();
//        
//        
        /*Inputs del segundo Objeto*/
        Scanner read = new Scanner( System.in );
        
//        System.out.println("Inserte nombre: ");
//        String nombre = read.nextLine();
//        
//        System.out.println("Inserte edad: ");
//        int edad = read.nextInt();
//        
//        char sexo;
//        do{
//            System.out.println("Inserte sexo: ");
//            sexo = read.next().charAt(0);
//        }while(!pDef.comprobarSexo(sexo));
//        
//        System.out.println("Inserte peso: ");
//        float peso = read.nextFloat();
//        
//        System.out.println("Inserte altura: ");
//        float altura = read.nextFloat();
//        
//        /*Objeto con valores del Input*/
//        Persona pIn = new Persona(0, nombre, edad, sexo, peso, altura, "");
//        
//        System.out.println("<--- Objeto Input --->");
//        msjEdad(pIn.esMayorDeEdad());
//        msjPeso(pIn.calcularIMC());
//        pIn.imprimirDatosPer();
        
            //
            Deportista depor1= new Deportista();
            
            System.out.println("Inserte nombre: ");
            String nombre = read.nextLine();

            System.out.println("Inserte edad: ");
            int edad = read.nextInt();

            char sexo;
            do{
                System.out.println("Inserte sexo: ");
                sexo = read.next().charAt(0);
            }while(!depor1.comprobarSexo(sexo));

            System.out.println("Inserte peso: ");
            float peso = read.nextFloat();

            System.out.println("Inserte altura: ");
            float altura = read.nextFloat();
            
            System.out.println("Inserte Ritmo Cardiaco");
            float ritmoCard = read.nextFloat();
            
            read.nextLine();
            
            String frecEntr;
            do{
                System.out.println("Indique la frecuencia de entrenamieno: ");
                frecEntr = read.nextLine();
                System.out.println(frecEntr);
            }while(frecEntr.compareToIgnoreCase("diario")!= 0 );
            
           
            System.out.println("Indique el tipo de ejercicio que realiza");
            String tipoEjer = read.nextLine().toLowerCase();
            
            
            Deportista depor2= new Deportista(ritmoCard, frecEntr, tipoEjer, 0 , nombre,edad, sexo, peso, altura, "");
            
            msjRitmoCard(depor2.calcRitmoCard());
            
            Entrenador entre1 = new Entrenador();
            
            System.out.println("Indica tus años de experiencia: ");
            int experiencia = read.nextInt();
            System.out.println("Indica tu especialidad ");
            String especialidad = read.nextLine();
            
            Entrenador entre2 = new Entrenador(experiencia,especialidad, 0 , nombre,edad, sexo, peso, altura, "");
           
            System.out.println("Rutina 1");
            entre2.determinarRutina(depor2.getTipoEj(), depor2.calcularIMC());
            System.out.println("Rutina 2");
            entre2.determinarRutina(depor2.calcularIMC(), depor2.getTipoEj());
            
        
        
        
    }
    
    
  
    
    
     
    //private String[] frecEnt={"diario", "semanal"};
   // private String[] TipoEj={"tonificación", "reducción de peso", "reducción de medidas", "cardio", "pesas",
//"flexibilidad y equilibrio", "relajación"};
    
}


