package model;

public class Personne {

private String prenom;


public Personne(String prenom) {
	super();
	this.prenom = prenom;
}

public String getprenom() {
	return prenom;
}

public void setprenom(String prenom) {
	this.prenom = prenom;
}

@Override
public String toString() {
	return "Personne [prenom=" + prenom + "]";
}
	
	
}
