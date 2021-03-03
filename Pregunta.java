import java.util.Scanner;
/**
 *
 * @author Luis Gonzalez
 */
public class Pregunta {
    //ATRIBUTOS
    private  int idPregunta;
    private Respuesta respuesta;
    private String titulo;
    private String contenido;
    private float fechaPublicacion;
    private String autor;
    private String estado;
    private int recompensa;
    private String pregunta;
    /**
     * CONSTRUCTOR
     */
    public Pregunta() {

        Scanner preguntaUsuario = new Scanner(System.in);
        System.out.println("Ingrese su pregunta: ");
        this.pregunta = preguntaUsuario.nextLine();


        this.idPregunta = idPregunta;
        this.respuesta = respuesta;
        this.titulo = titulo;
        this.contenido = contenido;
        this.fechaPublicacion = fechaPublicacion;
        this.autor = autor;
        this.estado = estado;
        this.recompensa = recompensa;
    }
    //GETTER AND SETTER
    public String getPregunta() {
        return pregunta;
    }

    public void setPregunta(String pregunta) {
        this.pregunta = pregunta;
    }

    public int getIdPregunta() {
        return idPregunta;
    }

    public void setIdPregunta(int idPregunta) {
        this.idPregunta = idPregunta;
    }

    public Respuesta getRespuesta() {
        return respuesta;
    }

    public void setRespuesta(Respuesta respuesta) {
        this.respuesta = respuesta;
    }

    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public String getContenido() {
        return contenido;
    }

    public void setContenido(String contenido) {
        this.contenido = contenido;
    }

    public float getFechaPublicacion() {
        return fechaPublicacion;
    }

    public void setFechaPublicacion(float fechaPublicacion) {
        this.fechaPublicacion = fechaPublicacion;
    }

    public String getAutor() {
        return autor;
    }

    public void setAutor(String autor) {
        this.autor = autor;
    }

    public String getEstado() {
        return estado;
    }

    public void setEstado(String estado) {
        this.estado = estado;
    }

    public int getRecompensa() {
        return recompensa;
    }

    public void setRecompensa(int recompensa) {
        this.recompensa = recompensa;
    }

}
