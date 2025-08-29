
package clases;

import java.util.HashSet;
import java.util.Objects;

/**
 *
 * @author AnaQuevedo
 */
public class Alumno {
    private int legajo;
    private String apellido;
    private String nombre;
    private HashSet<Materia> materias;

    public Alumno(int legajo, String apellido, String nombre) {
        this.legajo = legajo;
        this.apellido = apellido;
        this.nombre = nombre;
        this.materias=new HashSet();
    }

    public int getLegajo() {
        return legajo;
    }

    public void setLegajo(int legajo) {
        this.legajo = legajo;
    }

    public String getApellido() {
        return apellido;
    }

    public void setApellido(String apellido) {
        this.apellido = apellido;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

   public void agregarMateria(Materia m){
       materias.add(m);
   }
   
   public int cantidadMaterias(){
       return materias.size();
   }

    @Override
    public int hashCode() {
        return Objects.hash(legajo);
    }

    @Override
    public boolean equals(Object obj) {
          if (this == obj) return true;
        if (obj == null || getClass() != obj.getClass()) return false;
        Alumno alumno = (Alumno) obj;
        return legajo == alumno.legajo;
    }

    
   
   
    
    
}
