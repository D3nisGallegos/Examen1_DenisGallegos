/*Clase para el objeto ARMA
 */
package examen1_denisgallegos;


public class Arma {
    
    private String tipo; 
    private double porcentage; 

    public Arma() {
    }

    public Arma(String tipo, double porcentage) {
        this.tipo = tipo;
        this.porcentage = porcentage;
    }
    
    //MUTADORES: 

    public String getTipo() {
        return tipo;
    }

    public void setTipo(String tipo) {
        this.tipo = tipo;
    }

    public double getPorcentage() {
        return porcentage;
    }

    public void setPorcentage(double porcentage) {
        this.porcentage = porcentage;
    }
    
    //MA: 
    public String toStringArma(){
        return "Tipo: "+tipo+" Damage: "+porcentage; 
    }
    
    
    
    
}//Fin de la clase.
