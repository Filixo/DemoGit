package model;

public class Personne {

private String prenom;
private int age;
private String nom;


public Personne(String prenom, int age, String nom) {
	super();
	this.prenom = prenom;
	this.age= age;
}


public String getPrenom() {
	return prenom;
}


public void setPrenom(String prenom) {
	this.prenom = prenom;
}


public int getAge() {
	return age;
}


public void setAge(int age) {
	this.age = age;
}


public String getNom() {
	return nom;
}


public void setNom(String nom) {
	this.nom = nom;
}


@Override
public String toString() {
	return "Personne [prenom=" + prenom + ", age=" + age + ", nom=" + nom + "]";
}


	
	
}
