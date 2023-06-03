package Main;

import Objetos.Personaje;
import Objetos.Spiderman;
import Objetos.Spiderwoman;
import java.util.ArrayList;

public class SpiderVerseMain {

    public static void main(String[] args) {
        ArrayList<String> poderesSpiderman = new ArrayList();
        poderesSpiderman.add("Super Salto");
        poderesSpiderman.add("Stickiness");
        
        ArrayList<String> poderesSpiderWoman = new ArrayList();
        poderesSpiderWoman.add("Rayo aracnido");
        poderesSpiderWoman.add("Rayo envenenador");

        Personaje spiderman = new Spiderman("Peter Parker", "Spiderman", 1999, 23, 100, 110, 10, poderesSpiderman, "Un joven genio con poderes de araña.", "La historia de Spiderman comenzó con su creación "
                + "\n por parte del escritor Stan Lee y el dibujante Steve Ditko, "
                + "\n quienes lo presentaron por primera vez en \"Amazing Fantasy\" #15 en agosto de 1962.");
        Personaje spiderwoman = new Spiderwoman(true, "SpiderWoman", 12356, 22, 100, 95, 9, poderesSpiderWoman, "Su padre uso un suero en ella que le dio poderes.", "Julia era una madre soltera y exatleta olímpica que, a través de una serie de eventos, "
                + "\n obtuvo poderes similares a los de Spider-Man y Spider-Woman."
                + "\n Estos poderes incluían fuerza sobrehumana, agilidad, reflejos rápidos y la capacidad de trepar paredes.");

        ArrayList<Personaje> spiderverse = new ArrayList<>();
        spiderverse.add(spiderman);
        spiderverse.add(spiderwoman);
        
        for (Personaje personaje : spiderverse) {
            personaje.SentidoAracnido();
            personaje.lanzarTelarania();
            personaje.usarPoder();
            System.out.println(personaje);
            System.out.println("*******************");
        }
    }
}
