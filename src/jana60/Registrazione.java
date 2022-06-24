package jana60;

import java.util.Scanner;

public class Registrazione {
	/*
	 * Creare una classe Registrazione con metodo main in cui, tramite Scanner,
	 * vengono chieste le informazioni all’utente e si prova a creare un nuovo
	 * oggetto Utente. Gestire tramite try e catch eventuali errori in fase di
	 * creazione in modo che il programma non si interrompa bruscamente ma chieda
	 * all’utente di inserire dei dati corretti.
	 */
	public static void main(String[] args) {

		Scanner scan = new Scanner(System.in);

		System.out.println("Benvenuto! Crea il tuo nuovo profilo:");

		boolean flag = false;

		do {
			System.out.print("Inserisci nome: ");
			String nome = scan.nextLine();
			System.out.print("Inserisci cognome: ");
			String cognome = scan.nextLine();
			try {
				System.out.print("Inserisci email: ");
				String email = scan.nextLine();

				System.out.print("Inserisci password: ");
				String password = scan.nextLine();

				System.out.print("Inserisci età: ");
				int eta = Integer.parseInt(scan.nextLine());

				Utente nuovoUtente = new Utente(nome, cognome, email, password, eta);

				System.out.println(nuovoUtente);
				flag = true;
			} catch (NumberFormatException nfe) {
				System.out.println("Impossibile completare la registrazione.");
				System.out.println(nfe.getMessage());
			} catch (Exception e) {
				System.out.println("Impossibile completare la registrazione.");
				System.out.println(e.getMessage());
			}
		} while (!flag);
		scan.close();
	}

}
