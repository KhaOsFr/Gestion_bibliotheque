package bibliotheque.mvc.view;

import bibliotheque.metier.Auteur;
import bibliotheque.metier.Exemplaire;
import bibliotheque.metier.TypeLivre;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

import static bibliotheque.utilitaires.Utilitaire.*;
import static bibliotheque.utilitaires.Utilitaire.affListe;

/*
public class ExemplaireViewConsole extends AbstractViewExemplaire{
    Scanner sc = new Scanner(System.in);


    @Override
    public void menu() {
        update(exemplaireController.getAll());
        List options = Arrays.asList("ajouter", "retirer", "rechercher","modifier","fin");
        do {
            int ch = choixListe(options);

            switch (ch) {
                case 1:
                    ajouter();
                    break;
                case 2:
                    retirer();
                    break;
                case 3:
                    rechercher();
                    break;
                case 4:
                    modifier();
                    break;
                case 5:
                    return;
            }
        } while (true);
    }

    private void retirer() {
        int nl = choixElt(le)-1;
        Exemplaire e = le.get(nl);
        boolean ok = exemplaireController.remove(e);
        if(ok) affMsg("client effacé");
        else affMsg("client non effacé");
    }

    private void affMsg(String msg) {
        System.out.println(msg);
    }


    public void rechercher() {
        try {
            System.out.print("Matricule : ");
            String mat = sc.nextLine();
            Exemplaire rech = new Exemplaire(mat);
            Exemplaire a = exemplaireController.search(rech);
            if(a==null) affMsg("auteur inconnu");
            else {
                affMsg(a.toString());
                special(a);
            }
        }catch(Exception e){
            System.out.println("erreur : "+e);
        }

    }


    public void modifier() {
        int choix = choixElt(le);
        Exemplaire a = le.get(choix-1);
        do {
            try {
                String nom = modifyIfNotBlank("nom", a.getNom());
                String prenom = modifyIfNotBlank("prénom", a.getPrenom());
                String nat = modifyIfNotBlank("nationalité", a.getNationalite());
                a.setNom(nom);
                a.setPrenom(prenom);
                a.setNationalite(nat);
                break;
            } catch (Exception e) {
                System.out.println("erreur :" + e);
            }
        }while(true);
        auteurController.update(a);
    }


    public void ajouter() {
        Auteur a;
        do {
            try {
                System.out.println("nom ");
                String nom = sc.nextLine();
                System.out.println("prénom ");
                String prenom = sc.nextLine();
                System.out.println("nationalité");
                String nat = sc.nextLine();
                a = new Auteur(nom, prenom, nat);
                break;
            } catch (Exception e) {
                System.out.println("une erreur est survenue : "+e.getMessage());
            }
        }while(true);
        auteurController.add(a);
    }

    public void special(Auteur a) {

        List options = Arrays.asList("lister ouvrages", "lister livres", "lister par genre","fin");
        do {
            int ch = choixListe(options);

            switch (ch) {

                case 1:
                    listerOuvrages(a);
                    break;
                case 2:
                    listerLivres(a);
                    break;
                case 3:
                    listerGenre(a);
                    break;
                case 4 :return;
            }
        } while (true);

    }


    public void listerGenre(Auteur a) {
        System.out.println("genre :");
        String genre = sc.nextLine();
        affListe(new ArrayList(auteurController.listerOuvrages(a,genre)));
    }


    public void listerOuvrages(Auteur a){
        affList(new ArrayList(auteurController.listerOuvrages(a)));
    }


    public void listerLivres(Auteur a){
        TypeLivre[] tlv = TypeLivre.values();
        int ch2 = choixListe(List.of(tlv));
        TypeLivre tl = tlv[ch2-1];
        affList(new ArrayList(auteurController.listerLivre(a,tl)));
    }

    @Override
    public void affList(List la) {
        affListe(la);
    }
}
*/