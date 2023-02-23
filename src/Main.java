public class Main {
    public static void main(String[] args) throws Exception {
        Produit a1 = new Produit(1,7000);
        Produit a2 = new Produit(2,5000);

        ProduitEnSolde as1 = new ProduitEnSolde(4,5000,30);
        ProduitEnSolde as2 = new ProduitEnSolde(3,8600,05);

//        Boutique m = new Boutique();

       as1.setRemise(200);
        System.out.println(as1.getRemise());

//        m.ajouter(a1);
//        m.ajouter(a2);
//        m.ajouter(as1);
//        m.ajouter(as2);
//
//        m.ajouter(as1);
    }
}