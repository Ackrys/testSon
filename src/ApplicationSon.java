

import info1.mvc.vue.FenetreSon;
import info1.mvc.vue.controleur.boutonSonControleur;


public class ApplicationSon {
    public static void main(String[] args) throws Exception {
        FenetreSon fenetre = new FenetreSon("Explosion!");

        fenetre.fixeListenerBoutonSon(new boutonSonControleur(fenetre));
        fenetre.setVisible(true);
        fenetre.pack();
    }
}
