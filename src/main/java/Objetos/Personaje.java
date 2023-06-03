package Objetos;

import java.util.ArrayList;

public abstract class Personaje {
    
    protected String nombre;//Nombre
    protected int numUniverso;// Numero de universo
    protected int edad;//Edad
    protected int salud;//salud
    protected int fuerza;//fuerza
    protected int heroismo;//villano o heroe escala, entre 1 y 10.
    protected ArrayList<String> poderes;//Lista de poderes del personaje
    protected String historia;// Historia del personaje.
    protected String historiaComics;//Primera aparicion comics.
    
    public abstract void lanzarTelarania();
    public abstract void SentidoAracnido();
    public abstract void usarPoder();

    public Personaje() {
    }

    public Personaje(String nombre, int numUniverso, int edad, int salud, int fuerza, int heroismo, ArrayList<String> poderes, String historia, String historiaComics) {
        this.nombre = nombre;
        this.numUniverso = numUniverso;
        this.edad = edad;
        this.salud = salud;
        this.fuerza = fuerza;
        this.heroismo = heroismo;
        this.poderes = poderes;
        this.historia = historia;
        this.historiaComics = historiaComics;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public int getNumUniverso() {
        return numUniverso;
    }

    public void setNumUniverso(int numUniverso) {
        this.numUniverso = numUniverso;
    }

    public int getEdad() {
        return edad;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }

    public int getHeroismo() {
        return heroismo;
    }

    public void setHeroismo(int heroismo) {
        this.heroismo = heroismo;
    }

    public ArrayList<String> getPoderes() {
        return poderes;
    }

    public void setPoderes(ArrayList<String> poderes) {
        this.poderes = poderes;
    }

    public String getHistoria() {
        return historia;
    }

    public void setHistoria(String historia) {
        this.historia = historia;
    }

    public String getHistoriaComics() {
        return historiaComics;
    }

    public void setHistoriaComics(String historiaComics) {
        this.historiaComics = historiaComics;
    }

    @Override
    public String toString() {
        return "\n Nombre:" + nombre +
                "\n Numero de Universo:" + numUniverso + 
                "\n Edad:" + edad + 
                "\n Heroismo:" + heroismo +
                "\n Poderes:" + poderes + 
                "\n Historia:" + historia + 
                "\n Historia en los Comics:" + historiaComics;
    }
}
