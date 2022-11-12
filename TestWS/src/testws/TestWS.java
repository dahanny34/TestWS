
package testws;

public class TestWS {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        System.out.println("hola web service");
        String mensaje_salida = "";
        mensaje_salida=getInformacion("Dahanny", "24356", "dahanny@gmail.com");
        System.out.println(mensaje_salida);
    }

    private static String getInformacion(java.lang.String nombre, java.lang.String codigo, java.lang.String correo) {
        cibertec.Alumno_Service service = new cibertec.Alumno_Service();
        cibertec.Alumno port = service.getAlumnoPort();
        return port.getInformacion(nombre, codigo, correo);
    }
    
}
