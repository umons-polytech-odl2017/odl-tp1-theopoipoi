package exercise1;

public class Exercise1 {
	static Person createPerson(String name, int age) {
		// Ajoutez les champs name et age à la classe Person.
		// Créez un constructeur public permettant d'initialiser ces valeurs au moment de la construction.
		// Créez des getters publics pour lire ces valeurs une fois la classe construite.
		return new Person (name, age);
	}

	public static void main(String[] args) {
		System.out.println("Hello!");
		System.out.print("What's your name? ");
		//Person perso1 = new Person(System.in);
		//String name = perso1.getName();
		//System.out.format("Hello %s!\nHave a nice day!\n", name);
		// Considérant que cette classe est démarrée en ligne de commande avec un premier paramètre donnant le nom
		// et un second donnant l'âge (nombre entier), créez un objet Person sur base de ceux-ci.
		// Ecrivez ensuite le nom et l'âge de cette personne sur la sortie standard.
	}
}
