
package EmpleadosClass;

        public class Directivo extends Empleado {
    
     
    public Directivo(String nombre){
        super(nombre);
    }
        
    public String toString(){
        String s = "Directivo-->  ";
        s += this.getNombre();
        return super.toString() + "  " + s;
    }
}