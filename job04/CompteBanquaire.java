public class CompteBanquaire {
    public static void main(String[] args) {
        Account account = new Account();

        account.printMoney();
        account.add(100);
        account.remove(50);
        account.remove(100);
    }
}

class Account {
    String firstname = "John";
    String lastname = "Cena";
    float money = 0;

    public void printMoney() {
        System.out.println("Vous avez " + this.money + "€ sur votre compte.");
    }

    public void add(float addedMoney) {
        this.money += addedMoney;
        System.out.println("Vous avez ajouté " + addedMoney + "€ sur votre compte.");
        printMoney();
    }

    public void remove(float removedMoney) {
        if (this.money - removedMoney < 0) {
            System.out.println("Tentative de retrait... Solde insuffisant.");
        }
        else {
            this.money -= removedMoney;
            System.out.println("Vous avez retiré " + removedMoney + "€ sur votre compte.");
            printMoney();
        }
    }
}