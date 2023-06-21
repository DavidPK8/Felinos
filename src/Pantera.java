public class Pantera extends Felinos{
    private int longitud_cuerpo;

    public Pantera(){
        super();
    }

    public Pantera(String nombre, int edad, double peso, int longitud_cuerpo) {
        super(nombre, edad, peso);
        this.longitud_cuerpo = longitud_cuerpo;
    }

    public int getLongitud_cuerpo() {
        return longitud_cuerpo;
    }

    public void setLongitud_cuerpo(int longitud_cuerpo) {
        this.longitud_cuerpo = longitud_cuerpo;
    }

    public void acechar(){
        System.out.println("Este es el metodo de acechar de la Pantera");
    }
}
