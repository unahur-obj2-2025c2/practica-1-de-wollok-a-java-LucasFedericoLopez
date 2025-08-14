package ar.edu.unahur.obj2.wtoj.contenido;
//Singleton / Objeto
public class IDRA {
    //2- Generamos una instancia del Singleton.
    private static IDRA instance = new IDRA();
    //4- Doy valor correspondiente del Singleton.
    private Double valor = 0.5;
    //1- Ocultar el constructor
    private IDRA() {
    }
    //3- Definimos getter de la instancia.
    public static IDRA getInstance() {
        return instance;
    }
    //5- Genero getters y setters.
    public Double getValor() {
        return valor;
    }

    public void setValor(Double valor) {
        this.valor = valor;
    }
    
}
