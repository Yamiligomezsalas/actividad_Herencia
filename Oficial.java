
package EmpleadosClass;

  public class Oficial extends Operativo {
    
     
    public Oficial (String nombre){
        super(nombre);
    }
        
    public String toString(){
        String s = "Oficial-->  ";
        s += this.getNombre();
        return super.toString() + "  " + s;
    }
}     

