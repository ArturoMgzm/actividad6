class Alumno {

    public String nombre;
    public double[] calificaciones = new double [5];

    // Constructores
    public Alumno(){}
    public Alumno(String nombre, double[] calificaciones) {
        this.nombre = nombre;
        this.calificaciones = calificaciones;
    }

    //obtener Promedio
    //se utiliza sobrecarga de metodos, en un metodo se calcula el promedio de calificaciones dadas
    //en el otro se calcula el promedio del objeto actual
    public double obtenerPromedio(double[] calificaciones){
        return ((calificaciones[0] + calificaciones[1] +calificaciones[2] + calificaciones[3] + calificaciones[4]) / 5 );
    }
    public double obtenerPromedio(){
        return ((this.calificaciones[0] + this.calificaciones[1] + this.calificaciones[2] + this.calificaciones[3] + this.calificaciones[4]) / 5 );
    }

    //obtener Calificacion Final
    //se utiliza sobrecarga de metodos, en un metodo se calcula la calificacion de un promedio dado
    //en el otro se utiliza el metodo anterior para calcular la calificacion del objeto actual
    public char obtenerCalificacionFinal(double promedio){
        if(promedio > 90 && promedio <= 100){
            return 'A';
        }
        else if(promedio > 80 && promedio <= 90){
            return 'B';
        }
        else if(promedio > 70 && promedio <= 80){
            return 'C';
        }
        else if(promedio > 60 && promedio <= 70){
            return 'D';
        }
        else if(promedio > 50 && promedio <= 60){
            return 'E';
        }
        else if(promedio >= 0 && promedio <= 50){
            return 'F';
        }
        else{
            return '?';
        }
    }
    public char obtenerCalificacionFinal(){
        double promedio = this.obtenerPromedio();
        if(promedio > 90 && promedio <= 100){
            return 'A';
        }
        else if(promedio > 80 && promedio <= 90){
            return 'B';
        }
        else if(promedio > 70 && promedio <= 80){
            return 'C';
        }
        else if(promedio > 60 && promedio <= 70){
            return 'D';
        }
        else if(promedio > 50 && promedio <= 60){
            return 'E';
        }
        else if(promedio >= 0 && promedio <= 50){
            return 'F';
        }
        else{
            return '?';
        }
    }

    //metodo que imprime resultados, utiliza sobrecarga
    //el primero imprime los parametros
    //el segundo imprime los atributos y resultado del los metodos del objeto
    public void imprimirResultados(String nombre, double[] calificaciones, double promedio, char calificacion){
        System.out.println("Nombre del estudiante: " + nombre);
        System.out.println("Calificación 1: " + calificaciones[0]);
        System.out.println("Calificación 2: " + calificaciones[1]);
        System.out.println("Calificación 3: " + calificaciones[2]);
        System.out.println("Calificación 4: " + calificaciones[3]);
        System.out.println("Calificación 5: " + calificaciones[4]);
        System.out.println("Promedio: " + promedio);
        System.out.println("Calificación: " + calificacion);
    }
    public void imprimirResultados(){
        System.out.println("Nombre del estudiante: " + this.nombre);
        System.out.println("Calificación 1: " + this.calificaciones[0]);
        System.out.println("Calificación 2: " + this.calificaciones[1]);
        System.out.println("Calificación 3: " + this.calificaciones[2]);
        System.out.println("Calificación 4: " + this.calificaciones[3]);
        System.out.println("Calificación 5: " + this.calificaciones[4]);
        System.out.println("Promedio: " + this.obtenerPromedio());
        System.out.println("Calificación: " + this.obtenerCalificacionFinal());
    }
}

public class Actividad6 {

    public static void main(String[] args) {

        //caso de prueba con parametros explicitos
        Alumno alumno_A = new Alumno();
        alumno_A.nombre = "Arturo";
        alumno_A.calificaciones[0] = 87.0;
        alumno_A.calificaciones[1] = 99.0;
        alumno_A.calificaciones[2] = 93.0;
        alumno_A.calificaciones[3] = 100.0;
        alumno_A.calificaciones[4] = 77.0;

        alumno_A.imprimirResultados(alumno_A.nombre,alumno_A.calificaciones,alumno_A.obtenerPromedio(alumno_A.calificaciones),alumno_A.obtenerCalificacionFinal(alumno_A.obtenerPromedio(alumno_A.calificaciones)));

        //caso de prueba con parametros explicitos
        Alumno alumno_B = new Alumno("Fernando", new double[] {70,87,92,74,69});
        alumno_B.imprimirResultados();
    }

}
