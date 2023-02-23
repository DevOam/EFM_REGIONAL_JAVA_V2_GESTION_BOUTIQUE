import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.ArrayList;

public class Boutique {

    // arryliste pour ajoute les articles du boutique
    ArrayList<Produit> listeArticle = new ArrayList<>();

    // la methode ajouter() permettant d'ajouiter un prodouit
    public void ajouter(Produit p) throws Exception {
        if(listeArticle.contains(p)){
            throw new Exception(("this article already exists"));
        }else{
            listeArticle.add(p);
        }
    }

    // la methode idiceDe() permettant de retourner l'indice du prodouit
    public int idiceDe(int code){
        int indice = -1;
        for (int i=0 ;i <listeArticle.size(); i++){
            if(listeArticle.get(i).getCode() == code){
                indice = i;
            }
        }
        return indice;
    }

    // la methode supprimer() permettant de supprimer le prodouit a partire son nom
    public boolean supprimer(int code){
        
        boolean isSupprimer = false;
        for (Produit i : listeArticle){
            if(i.getCode() == code){
                listeArticle.remove(i) ;
                isSupprimer = true;
                break;
            }
        }
        return isSupprimer;
    }

    // la methode supprimer() permettant de supprimer le prodouit a partire le nom de l'objet prodouit
    public boolean supprimer(Produit p){
        if(listeArticle.contains(p)){
            listeArticle.remove(p) ;
            return true;
        }else{
            return false;
        }
    }

    // la methode nobreArticleEnSolde() permettant de retourner le nombre des prodouit de type ProduitEnSolde
    public int nobreArticleEnSolde(){
        int nobreArticleEnSolde = 0;
        for (Produit i : listeArticle){
            if(i.getClass() == ProduitEnSolde.class){
                nobreArticleEnSolde ++ ;
            }
        }
        return nobreArticleEnSolde;
    }

    // la methode enregistrer() permettant de souvegarder les prodouits dans le fichier chemin
    public void enregistrer(String chemin) throws IOException {
        File myfile = new File(chemin);
        FileWriter fileWriter = new FileWriter(myfile);
        PrintWriter printWriter = new PrintWriter(fileWriter);
        printWriter.println(listeArticle);
        printWriter.close();
    }

    // la methode supprimerFichier() permettant de ssupprimer le fichier chemin
    public void supprimerFichier(String chemin) throws IOException {
        File myfile = new File(chemin);
        myfile.delete();
    }

}
