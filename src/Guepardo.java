public class Guepardo extends Felinos{
    private int velocidad_maxima;

    public Guepardo(){
        super();
    }

    public Guepardo(String nombre, int edad, double peso, int velocidad_maxima) {
        super(nombre, edad, peso);
        this.velocidad_maxima = velocidad_maxima;
    }

    public int getVelocidad_maxima() {
        return velocidad_maxima;
    }

    public void setVelocidad_maxima(int velocidad_maxima) {
        this.velocidad_maxima = velocidad_maxima;
    }

    public void correr(){
        System.out.println("Este es el metodo correr del guepardo");
    }
}
