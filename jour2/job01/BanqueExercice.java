public class BanqueExercice {
    public static void main(String[] args) {
        Account account = new Account();

        if (args.length == 3) {
            try {
                float soldeCompteCourant = Float.parseFloat(args[0]);
                float soldeCompteEpargne = Float.parseFloat(args[1]);
                float interets = Float.parseFloat(args[2]);

                account.interet = interets;
                account.add_to_courant(soldeCompteCourant);
                account.add_to_epargne(soldeCompteEpargne);
            }
            catch (NumberFormatException e) {
                System.out.println("Les arguments doivent être des nombres.");
            }
        }
        else {
            System.out.println("Vous devez entrer la somme du compte courant, puis celle de l'epargne et enfin les interets (ex : java BanqueExercice 100 200 4).");
        }
        
    }
}

class Account {
    String firstname = "John";
    String lastname = "Cena";
    float courant = 0;
    float epargne = 0;
    float interet = 0;

    public void printMoney() {
        System.out.println("Solde du compte courant : " + this.courant + "€." + "\nSolde du compte épargne : " + this.epargne + "€.");
        System.out.println("Interets ajoutés : " + epargne * interet / 100 + "€. Nouveau solde du compte épargne : " + (epargne + epargne * interet / 100) + "€.");
    }

    public void add_to_courant(float addedMoney) {
        this.courant += addedMoney;
        System.out.println("Solde du compte courant : " + this.courant + "€.");
    }

    public void add_to_epargne(float addedMoney) {
        this.epargne += addedMoney;
        System.out.println("Interets ajoutés : " + epargne * interet / 100 + "€. \nNouveau solde du compte épargne : " + (epargne + epargne * interet / 100) + "€.");
        this.epargne += epargne * interet / 100;
    }

    public void remove_from_courant(float removedMoney) {
        if (this.courant - removedMoney < 0) {
            System.out.println("Tentative de retrait... Solde insuffisant.");
        }
        else {
            this.courant -= removedMoney;
            System.out.println("Vous avez retiré " + removedMoney + "€ sur votre compte courant.");
            printMoney();
        }
    }

    public void remove_from_epargne(float removedMoney) {
        if (this.epargne - removedMoney < 0) {
            System.out.println("Tentative de retrait... Solde insuffisant.");
        }
        else {
            this.epargne -= removedMoney;
            System.out.println("Vous avez retiré " + removedMoney + "€ sur votre compte épargne.");
            printMoney();
        }
    }
}