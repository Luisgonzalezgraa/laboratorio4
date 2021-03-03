import java.util.ArrayList;
import java.util.Scanner;
/**
 *
 * @author Luis Gonzalez
 */
public class Stack {
    /**
     * @param args the command line arguments
     */

    //ATRIBUTOS
    private String pregunta;
    private String respuesta;
    private Register registro;

    private String etiqueta;

    /**
     * CONSTRUCTOR
     */

    public Stack() {
        this.pregunta = "";
        this.respuesta = "";
        this.registro = new Register();


    }
    //GETTER AND SETTER
    public String getPregunta() {
        return pregunta;
    }

    public void setPregunta(String pregunta) {
        this.pregunta = pregunta;
    }

    public String getRespuesta() {
        return respuesta;
    }

    public void setRespuesta(String respuesta) {
        this.respuesta = respuesta;
    }

    public Register getRegistro() {
        return registro;
    }

    public void setRegistro(Register registro) {
        this.registro = registro;
    }



    public void crearUsuario(){
        Usuario nuevoUsuario = new Usuario();
        registro.agregarUsuario(nuevoUsuario);
    }
    public void ingresar(ArrayList<Usuario> listadeUsuarios){

        Usuario usuario;
        Integer i;
        int opcionIngresada2 = 0;
        Scanner opcion2;
        Integer largo = listadeUsuarios.size();
        String nombre;
        String contrasenia;

        Usuario usuarioAux;
        String nombreAux;
        String contraseniaAux;
        boolean quiebre = true;
        while (quiebre == true){
            i = 0;
            usuario = new Usuario();
            nombre = usuario.getNombre();
            contrasenia = usuario.getContrasenia();
        while (i < largo) {
            usuarioAux = listadeUsuarios.get(i);
            nombreAux = usuarioAux.getNombre();
            contraseniaAux = usuarioAux.getContrasenia();
            if (nombre.equals(nombreAux) && contrasenia.equals(contraseniaAux)) {
                quiebre = false;
                i = largo + 1;
                while (opcionIngresada2 != 5) {
                    System.out.println("### SISTEMA DE PREGUNTAS Y RESPUESTAS ###");
                    System.out.println("## Registrado como: " + nombre);
                    System.out.println("Escoja su opción: ");
                    System.out.println("1. Agregar nueva pregunta");
                    System.out.println("2. Responder pregunta");
                    System.out.println("3. Dar recompensa");
                    System.out.println("4. Aceptar respuesta");
                    System.out.println("5. Cerrar sesión");
                    System.out.println("INTRODUZCA SU OPCIÓN: ");
                    opcion2 = new Scanner(System.in);
                    opcionIngresada2 = opcion2.nextInt();
                    switch (opcionIngresada2) {
                        case 1:
                            Pregunta pregunta = new Pregunta();
                            System.out.println("####Pregunta Ingresada correctamente####");
                            break;
                        case 2:
                            System.out.println("####FIN DE SIMULACIÓN####");
                            break;
                        case 3:
                            System.out.println("####FIN DE SIMULACIÓN####");
                            break;
                        case 4:
                            System.out.println("####FIN DE SIMULACIÓN####");
                            break;
                        case 5:
                            System.out.println("####SESIÓN CERRADA#####");
                            break;
                        default:
                            System.out.println("Opción ingresada invalida.");
                            break;
                    }

                }
                i++;

            }
            else if (i.intValue() == largo.intValue()) {
                System.out.printf("####Usuario o Contraseña incorreto####\n");

            }
            else{
                System.out.printf("####Usuario o Contraseña incorreto####\n");
                break;
            }
            if(opcionIngresada2 == 5){
                break;
            }

        }

        }

    }

}
