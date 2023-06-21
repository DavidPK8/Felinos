public class Tigre extends Felinos{
    private String patron_rayas;

    public Tigre(){
        super();
    }

    public Tigre(String nombre, int edad, double peso, String patron_rayas) {
        super(nombre, edad, peso);
        this.patron_rayas = patron_rayas;
    }

    public String getPatron_rayas() {
        return patron_rayas;
    }

    public void setPatron_rayas(String patron_rayas) {
        this.patron_rayas = patron_rayas;
    }

    public void nadar(){
        System.out.println("Este es el metodo nadar del tigre");
    }
}
