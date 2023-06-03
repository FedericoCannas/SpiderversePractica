package Objetos;

import java.util.ArrayList;

public class Spiderman extends Personaje {

    protected String identidadSecreta;

    public Spiderman() {
    }

    public Spiderman(String identidadSecreta) {
        this.identidadSecreta = identidadSecreta;
    }

    public Spiderman(String identidadSecreta, String nombre, int numUniverso, int edad, int salud, int fuerza, int heroismo, ArrayList<String> poderes, String historia, String historiaComics) {
        super(nombre, numUniverso, edad, salud, fuerza, heroismo, poderes, historia, historiaComics);
        this.identidadSecreta = identidadSecreta;
    }

    public String getIdentidadSecreta() {
        return identidadSecreta;
    }

    public void setIdentidadSecreta(String identidadSecreta) {
        this.identidadSecreta = identidadSecreta;
    }

    @Override
    public String getNombre() {
        return nombre;
    }

    @Override
    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    @Override
    public int getNumUniverso() {
        return numUniverso;
    }

    @Override
    public void setNumUniverso(int numUniverso) {
        this.numUniverso = numUniverso;
    }

    @Override
    public int getEdad() {
        return edad;
    }

    @Override
    public void setEdad(int edad) {
        this.edad = edad;
    }

    public int getSalud() {
        return salud;
    }

    public void setSalud(int salud) {
        this.salud = salud;
    }

    public int getFuerza() {
        return fuerza;
    }

    public void setFuerza(int fuerza) {
        this.fuerza = fuerza;
    }

    @Override
    public int getHeroismo() {
        return heroismo;
    }

    @Override
    public void setHeroismo(int heroismo) {
        this.heroismo = heroismo;
    }

    @Override
    public ArrayList<String> getPoderes() {
        return poderes;
    }

    @Override
    public void setPoderes(ArrayList<String> poderes) {
        this.poderes = poderes;
    }

    @Override
    public String getHistoria() {
        return historia;
    }

    @Override
    public void setHistoria(String historia) {
        this.historia = historia;
    }

    @Override
    public String getHistoriaComics() {
        return historiaComics;
    }

    @Override
    public void setHistoriaComics(String historiaComics) {
        this.historiaComics = historiaComics;
    }

    @Override
    public void lanzarTelarania() {
        System.out.println("Spiderman Lanza telarañas");
    }

    @Override
    public void SentidoAracnido() {
        System.out.println("Spiderman,tu sentido aracnido esta alerta!");
    }

    @Override
    public void usarPoder() {
        System.out.println("Spiderman usa sus poderes" + poderes);
    }

    @Override
    public String toString() {
        return super.toString()+
                "\n La identidad secreta es:"+identidadSecreta;
    }


    
}
