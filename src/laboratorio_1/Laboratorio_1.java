
package laboratorio_1;
import java.util.Scanner;

/**
 * @authors 
 * Maria Ortiz, David Perez
 */

public class Laboratorio_1 {
    
    public static Persona inputDatosPersona (Persona pDef, Scanner read){
        
        System.out.println("Inserte nombre: ");
        String nombre = read.nextLine();
        
        System.out.println("Inserte edad: ");
        int edad = read.nextInt();
        
        char sexo;
        do{
            System.out.println("Inserte sexo: ");
            sexo = read.next().charAt(0);
        }while(!pDef.comprobarSexo(sexo));
        
        System.out.println("Inserte peso: ");
        float peso = read.nextFloat();
        
        System.out.println("Inserte altura: ");
        float altura = read.nextFloat();
        
        Persona pIn = new Persona(0, nombre, edad, sexo, peso, altura, "");
       
        return pIn;
    }
    
    public static Deportista inputDeportista(Persona pIn, Scanner read){
    
        String[] EjOp={"tonificación", "reducción de peso", "reducción de medidas", "cardio", "pesas","flexibilidad y equilibrio", "relajación"};
        int op=0;
        String frecEntr;
        String tipoEjer;
        
        System.out.println("Inserte Ritmo Cardiaco");
        float ritmoCard = read.nextFloat();
        
        read.nextLine();
        
        do{
            System.out.println("Indique la frecuencia de entrenamiento (diario o semanal): ");
            frecEntr = read.nextLine();   

        } while(!frecEntr.equals("diario") && !frecEntr.equals("semanal"));

        System.out.println("Indique el tipo de ejercicio que realiza");
        System.out.println("Seleccione una opción");

        for(int i = 0;i < EjOp.length; i++){
            System.out.println("Opcion "+ i + ". "+ EjOp[i]);
        }

        System.out.println("Opcion -1. Introducir su propio tipo de entrenamiento ");

        op = read.nextInt();
        
        if(op >= 0 && op <= EjOp.length){
            tipoEjer= EjOp[op];

        } else {
            System.out.println("Introduzca su tipo de ejercicio");
            read.nextLine();
            tipoEjer = read.nextLine().toLowerCase();
        }
        
        Deportista dep = new Deportista(ritmoCard, frecEntr, tipoEjer, pIn.cedula, pIn.nombre, pIn.edad, pIn.sexo, pIn.peso, pIn.altura, pIn.direccion);
        return dep;
    }
    
    public static Entrenador inputEntrenador(Persona pIn, Scanner read){
       
        System.out.println("Indica tus años de experiencia: ");
        int experiencia = read.nextInt();

        read.nextLine();
        
        System.out.println("Indica tu especialidad ");
        String especialidad = read.nextLine();
        
        Entrenador ent = new Entrenador(experiencia, especialidad, pIn.cedula , pIn.nombre, pIn.edad, pIn.sexo, pIn.peso, pIn.altura, pIn.direccion);
        return ent;
    }
    
    
    public static void main(String[] args) {
        
        Scanner read = new Scanner( System.in );
        
        /*Objeto con valores por default*/
        Persona pDef = new Persona();
        
        /*Objeto con valores del input*/
        Persona pIn = inputDatosPersona(pDef, read);
        
        System.out.println("\nDatos del Deportista: ");
        Deportista dep = inputDeportista(pIn, read);
        dep.calcRitmoCard();
        
        System.out.println("\nDatos del entrenador: ");
        Entrenador ent = inputEntrenador(pIn, read);
        
        System.out.println("\nRutina 1: ");
        ent.determinarRutina(dep.getTipoEj(), dep.calcularIMC());
        System.out.println("\nRutina 2: ");
        ent.determinarRutina(dep.calcularIMC(), dep.getTipoEj());    
        
    }
    
}
