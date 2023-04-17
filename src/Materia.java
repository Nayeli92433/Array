public class Materia {
    String materia;
    int calificacion;

    public String getMateria() {return materia;}
    public void setMateria(String Materia) {this.materia = Materia;}
    public int getCalificacion() {return calificacion;}
    public void setCalificacion(int calificacion) {this.calificacion = calificacion;}

    @Override
    public String toString() {

        return "---Materia: " + materia + "---Calificación: " + calificacion;
    }
}
