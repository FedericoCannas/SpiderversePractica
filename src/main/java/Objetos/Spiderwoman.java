package Objetos;

import java.util.ArrayList;

public class Spiderwoman extends Personaje {

    protected boolean volar ;//Nombre

    public Spiderwoman() {
    }

    public Spiderwoman(boolean volar) {
        this.volar = volar;
    }

    public Spiderwoman(boolean volar, String nombre, int numUniverso, int edad, int salud, int fuerza, int heroismo, ArrayList<String> poderes, String historia, String historiaComics) {
        super(nombre, numUniverso, edad, salud, fuerza, heroismo, poderes, historia, historiaComics);
        this.volar = volar;
    }

    public boolean isVolar() {
        return volar;
    }

    public void setVolar(boolean volar) {
        this.volar = volar;
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
    public void lanzarTelarania() {
        System.out.println("SpiderWoman Lanza Telaraña"); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

    @Override
    public void SentidoAracnido() {
        System.out.println("El sentido aracnido esta titilando Spiderwoman!"); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

    @Override
    public void usarPoder() {
        System.out.println("Spiderwoman usa su poder"+poderes); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

    @Override
    public String toString() {
        
        return super.toString()+
                "\n Vuelo:"+volar;   
    }
    
}
