package jana60;

public class Utente {
	/*
	 * Creare una classe Utente con attributi nome, cognome, email, password ed età.
	 * Aggiungere un costruttore con parametri e metodi getter e setter.
	 * Implementare dei metodi di validazione in modo che: - email contenga un
	 * carattere @ e un . - password sia lunga tra 8 e 12 caratteri - età sia
	 * maggiore di 18 anni In caso i parametri non siano validi, impedire che
	 * vengano valorizzati gli attributi nei metodi e nel costruttore, sollevando
	 * opportune eccezioni.
	 */

	// attributi
	private String nome, cognome, email, password;
	private int eta;

	// costruttore
	public Utente(String nome, String cognome, String email, String password, int eta) throws Exception {
		super();

		if (password.length() < 18 && password.length() > 12) {
			throw new Exception("La password deve essere minimo di 8 e massimo di 12 caratteri");
		}
		if (eta < 18) {
			throw new Exception("L'utente deve essere maggiorenne per potersi registrare");
		}
		if (!email.contains("@")) {
			throw new Exception("L'email deve contenere il carattere @");
		}
		if (!email.contains(".")) {
			throw new Exception("L'emeil deve contenere un .");
		}

		this.nome = nome;
		this.cognome = cognome;
		this.email = email;
		this.password = password;
		this.eta = eta;
	}

	// getter e setter

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public String getCognome() {
		return cognome;
	}

	public void setCognome(String cognome) {
		this.cognome = cognome;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	public int getEta() {
		return eta;
	}

	public void setEta(int eta) {
		this.eta = eta;
	}

}
