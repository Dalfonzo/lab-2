
package laboratorio_1;

public class Persona {
  
    protected int cedula;
    protected String nombre;
    protected int edad;
    protected char sexo;
    protected float peso;
    protected float altura;
    protected String direccion;

    public Persona() {
        this(0, "", 0, ' ', 0.0f, 0.0f, "");
    }
    
    public Persona(int cedula, String nombre, int edad, char sexo, float peso, float altura, String direccion) {
        this.cedula = cedula;
        this.nombre = nombre;
        this.edad = edad;
        this.sexo = sexo;
        this.peso = peso;
        this.altura = altura;
        this.direccion = direccion;
    }
    
    public int calcularIMC() {
        
        float IMC;
        IMC = this.peso / (this.altura * this.altura);
        
        if (IMC >= 18 && IMC <= 25 ) {
            return 0;
        } else if (IMC < 18) {
            return -1;
        } else if (IMC > 25 && IMC < 35) {
            return 1;
        }
        
        return 2;
    }

    public boolean esMayorDeEdad(){
        return this.edad >= 18;
    }
    
    public boolean comprobarSexo(char sexo){
        return (sexo == 'f' || sexo == 'm' || sexo == 'F' || sexo == 'M');
    }
    
    public boolean validarDireccion(String direccion){
        return !direccion.matches("(.*)[^a-zA-Z0-9\\.\\#](.*)");
    }
    
    public void imprimirDatosPer() {
        System.out.println("Cedula: " + this.cedula);
        System.out.println("Nombre: "+ this.nombre);
        System.out.println("Edad: " + this.edad);
        System.out.println("Sexo: " + this.sexo);
        System.out.println("Peso: " + this.peso);
        System.out.println("Altura: " + this.altura);
        System.out.println("Direccion: " + this.direccion);   
    }
    
    public int getCedula() {
        return cedula;
    }

    public void setCedula(int cedula) {
        this.cedula = cedula;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public int getEdad() {
        return edad;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }

    public char getSexo() {
        return sexo;
    }

    public void setSexo(char sexo) {
        this.sexo = sexo;
    }

    public float getPeso() {
        return peso;
    }

    public void setPeso(float peso) {
        this.peso = peso;
    }

    public float getAltura() {
        return altura;
    }

    public void setAltura(float altura) {
        this.altura = altura;
    }

    public String getDireccion() {
        return direccion;
    }

    public void setDireccion(String direccion) {
        this.direccion = direccion;
    }
    
    
    
    
}
