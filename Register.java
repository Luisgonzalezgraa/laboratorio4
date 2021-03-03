import javax.crypto.NullCipher;
import java.util.ArrayList;
/**
 *
 * @author Luis Gonzalez
 */

public class Register {
    //ATRIBUTOS
    private ArrayList<Usuario> listadeUsuarios;
    private ArrayList<Pregunta> listaPreguntas;
    /**
     * CONSTRUCTOR
     */
    public Register() {
        this.listadeUsuarios = new ArrayList<>();
    }
    //GETTER AND SETTER
    public ArrayList<Usuario> getListadeUsuarios() {
        return listadeUsuarios;
    }

    public void setListadeUsuarios(ArrayList<Usuario> listadeUsuarios) {
        this.listadeUsuarios = listadeUsuarios;
    }


    public void agregarUsuario(Usuario usuario){
        Integer i = 0;
        Usuario usuarioAux;
        String nombreAux;
        String nombre = usuario.getNombre();
        Integer largo = listadeUsuarios.size();
        while (i < largo){
            usuarioAux = listadeUsuarios.get(i);
            nombreAux = usuarioAux.getNombre();

            if(nombre.equals(nombreAux)){
                i = largo+1;
                System.out.println("Usuario ya registrado, intente con otro nombre");


            }
            i++;
        }
        if (i.intValue() == largo.intValue() ){
            listadeUsuarios.add(usuario);
            System.out.println("Usuario Registrado con exito");
        }

    }





}

