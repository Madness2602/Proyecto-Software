
package Modelo;

public class Usuario {
    private String usuario;
    private String contra;
    private String privilegio;

    public Usuario() {
    }

    public Usuario(String usuario, String contra, String privilegio) {
        this.usuario = usuario;
        this.contra = contra;
        this.privilegio = privilegio;
    }

    public String getPrivilegio() {
        return privilegio;
    }

    public void setPrivilegio(String privilegio) {
        this.privilegio = privilegio;
    }

    public String getUsuario() {
        return usuario;
    }

    public void setUsuario(String usuario) {
        this.usuario = usuario;
    }

    public String getContra() {
        return contra;
    }

    public void setContra(String contra) {
        this.contra = contra;
    }

    @Override
    public String toString() {
        return "Usuario{" + "usuario=" + usuario + ", contra=" + contra + ", privilegio=" + privilegio + '}';
    }
    
}
