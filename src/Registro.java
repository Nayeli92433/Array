public class Registro {

    public double[] getGrades(String[] subjectGrades) {

        double[] grades = new double[subjectGrades.length];
        for (int i = 0; i < subjectGrades.length; i++) {
            int op = subjectGrades[i].indexOf(" ");
            String gradeStr = subjectGrades[i].substring(op + 1);
            grades[i] = Double.parseDouble(gradeStr);
        }
        return grades;
    }

    public String[] registroMaterias(String[] calificaciones) {
        String[] materias = new String[calificaciones.length];
        for (int i = 0; i < calificaciones.length; i++) {
            int op2 = calificaciones[i].indexOf(" ");
            String materia = calificaciones[i].substring(0, op2);
            materias[i] = materia;
        }
        return materias;
    }
    }




