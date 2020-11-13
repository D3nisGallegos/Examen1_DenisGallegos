/*Clase para el objeto JASON.
 */
package examen1_denisgallegos;

import java.util.ArrayList;


public class Jason extends Personas{
    
    private ArrayList <Campistas> muertos = new ArrayList(); 

    public Jason() {
        super();
    }

    public Jason(String nombre, int edad, String sexo, Arma arma) {
        super(nombre, edad, sexo, arma);
    }
    
    //MUTADORES: 
    public ArrayList<Campistas> getMuertos() {
        return muertos;
    }

    public void setMuertos(ArrayList<Campistas> muertos) {
        this.muertos = muertos;
    }
    
    //MA: 
    public String toString(){
        String n ="";
        for (int c = 0; c < muertos.size();c++){
            n += muertos.get(c);
            n+= "\n";
        }
        return toStringPersonas()+n; 
    }
    
    
    
}//Fin de la clase.
