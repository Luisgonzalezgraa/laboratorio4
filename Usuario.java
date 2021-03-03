import java.util.Scanner;
/**
 *
 * @author Luis Gonzalez
 */
    public class Usuario {
    //ATRIBUTOS
        private String nombre;
        private String contrasenia;
        private int reputacion;
    /**
     * CONSTRUCTOR
     */
        public Usuario() {
            Scanner name = new Scanner(System.in);
            System.out.println("Ingrese su Nombre: ");
            this.nombre = name.nextLine();
            Scanner password = new Scanner(System.in);
            System.out.println("Ingrese su Contraseña: ");
            this.contrasenia = password.nextLine();
            this.nombre = this.nombre;
            this.contrasenia = this.contrasenia;
            this.reputacion = 0;
        }
    //GETTER AND SETTER
        public String getNombre() {
            return this.nombre;
        }

        public void setNombre(String nombre) {
            this.nombre = nombre;
        }

        public String getContrasenia() {
            return this.contrasenia;
        }

        public void setContrasenia(String contrasenia) {
            this.contrasenia = contrasenia;
        }

        public int getReputacion() {
            return this.reputacion;
        }

        public void setReputacion(int reputacion) {
            this.reputacion = reputacion;
        }


}
