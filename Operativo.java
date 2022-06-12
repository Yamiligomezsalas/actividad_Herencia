
package EmpleadosClass;


    public class Operativo extends Empleado {
    
     
    public Operativo(String nombre){
        super(nombre);
    }
        
    public String toString(){
        String s = "Operativo-->  ";
        s += this.getNombre();
        return super.toString() + "   " + s;
    }
}

