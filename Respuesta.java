import java.util.ArrayList;
/**
 *
 * @author Luis Gonzalez
 */
public class Respuesta {
    //ATRIBUTOS
    private String respuesta;
    private String clasificacion;
    private Pregunta pregunta;
    private ArrayList<Pregunta> listadePreguntas;
    /**
     * CONSTRUCTOR
     */
    public Respuesta() {
        this.respuesta = respuesta;
        this.clasificacion = clasificacion;
        this.pregunta = pregunta;
        this.listadePreguntas = listadePreguntas;
    }
    //GETTER AND SETTER
    public String getRespuesta() {
        return respuesta;
    }

    public void setRespuesta(String respuesta) {
        this.respuesta = respuesta;
    }

    public String getClasificacion() {
        return clasificacion;
    }

    public void setClasificacion(String clasificacion) {
        this.clasificacion = clasificacion;
    }

    public Pregunta getPregunta() {
        return pregunta;
    }

    public void setPregunta(Pregunta pregunta) {
        this.pregunta = pregunta;
    }

    public ArrayList<Pregunta> getListadePreguntas() {
        return listadePreguntas;
    }

    public void setListadePreguntas(ArrayList<Pregunta> listadePreguntas) {
        this.listadePreguntas = listadePreguntas;
    }
}
