/*Clase para el objeto CAMPISTAS.
 */
package examen1_denisgallegos;


public class Campistas extends Personas{
    
    private String tipodecampista; 
    private String estado; 

    public Campistas() {
        super();
    }

    public Campistas(String tipodecampista, String estado, String nombre, int edad, String sexo, Arma arma) {
        super(nombre, edad, sexo, arma);
        this.tipodecampista = tipodecampista;
        this.estado = estado;
    }
    
    //MUTADORES: 
    public String getTipodecampista() {
        return tipodecampista;
    }

    public void setTipodecampista(String tipodecampista) {
        this.tipodecampista = tipodecampista;
    }

    public String getEstado() {
        return estado;
    }

    public void setEstado(String estado) {
        this.estado = estado;
    }
    
    //MA: 
    public String toString(){
        return toStringPersonas()+"Campista: "+tipodecampista+" Estado: "+estado;
    }
    
    
}//Fin de la clase.
