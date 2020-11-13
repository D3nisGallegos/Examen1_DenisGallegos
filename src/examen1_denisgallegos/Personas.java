/*Clase para elobjeto PERSONAS
 */
package examen1_denisgallegos;


public class Personas {
    
    private String nombre; 
    private int edad; 
    private String sexo; 
    private Arma arma; 

    public Personas() {
    }

    public Personas(String nombre, int edad, String sexo, Arma arma) {
        this.nombre = nombre;
        this.edad = edad;
        this.sexo = sexo;
        this.arma = arma;
    }
    
    //MUTADORES: 

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

    public String getSexo() {
        return sexo;
    }

    public void setSexo(String sexo) {
        this.sexo = sexo;
    }

    public Arma getArma() {
        return arma;
    }

    public void setArma(Arma arma) {
        this.arma = arma;
    }
    
    //MA: 
    public String toStringPersonas(){
        return "Nombre: "+nombre+" Edad: "+edad+" Sexo: "+sexo+"  Arma:"+arma.toStringArma();
    }
    
    
     
    
}//Fin de la clase.
