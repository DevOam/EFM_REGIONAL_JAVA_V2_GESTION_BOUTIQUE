public class Produit {
    private int code;
    private double prix;

    // constructer
    Produit(int code, double prix){
        this.code = code;
        this.prix = prix;
    }

    // getter ands setter
    public int getCode() {
        return code;
    }

    public void setCode(int code) {
        this.code = code;
    }

    public double getPrix() {
        return prix;
    }

    public void setPrix(double prix) {
        this.prix = prix;
    }

    @Override
    public String toString() {
        return "Produit : code=" + code + "; solde = " + prix;
    }

    public boolean equals(Produit obj) {
        if (this.code == obj.code) return true;
        else return false;
    }

    public double prixArticle() {
        return prix;
    }



}
