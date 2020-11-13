/*Clase para el objeto JASON.
 */
package examen1_denisgallegos;

import java.util.ArrayList;


public class Papichulocastigador extends Personas{
    
    private int muertos; 
    
    //CONSTRUCTORES: 

    public Papichulocastigador() {
        super();
    }

    public Papichulocastigador(int muertos, String nombre, int edad, String sexo, Arma arma) {
        super(nombre, edad, sexo, arma);
        this.muertos = muertos;
    }
    public int getMuertos(){
        return muertos; 
    }

    //MUTADORES:
    public void setMuertos(int muertos) {
        this.muertos = muertos;
    }

    //MA:
    public String toStringPapichulocastigador() {
        return toStringPersonas()+"Desaparecidos: "+muertos;
    }
    
    
    
}//Fin de la clase.
