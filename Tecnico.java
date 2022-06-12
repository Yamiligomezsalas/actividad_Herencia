
package EmpleadosClass;


public class Tecnico extends Operativo {
    
    public Tecnico(String nombre){
        super(nombre);
    }
        
    public String toString(){
        String s = "Tecnico-->  ";
        s += this.getNombre();
        return super.toString() + "   " + s;
    }
    
}
