package khadygueye.teccart.doctorappointment;

import android.icu.text.DateFormat;
import android.provider.ContactsContract;

public class Patient {
    private String nom;
    private  String prenom ;
    private  boolean genre;
    private boolean Homme;
    private  boolean femme ;
    private int Ncivqiue;
    private int Rue;
    private int Appart;
    private String Ville ;
    private String Cpost;
    private  int Tel ;
    private int TelTrav;
    private int cel;
    private DateFormat Date;
    private String NAS;
    private ContactsContract.CommonDataKinds.Email Couriel;
    private Integer NAM;

    public Patient( String nom,String prenom ,boolean genre,boolean Homme,boolean femme,int Ncivqiue,int Rue,int Appart,String Ville,String Cpost,
                    int Tel ,int TelTrav,int cel,DateFormat Date,String NAS,ContactsContract.CommonDataKinds.Email Couriel,Integer NAM)
    {

        this.nom=nom;
        this.prenom=prenom;
        this.genre=genre;


    }

    public String getNom() {
        return nom;
    }

    public void setNom(String nom) {
        this.nom = nom;
    }

    public String getPrenom() {
        return prenom;
    }

    public void setPrenom(String prenom) {
        this.prenom = prenom;
    }

    public boolean isGenre() {
        return genre;
    }

    public void setGenre(boolean genre) {
        this.genre = genre;
    }

    public boolean isHomme() {
        return Homme;
    }

    public void setHomme(boolean homme) {
        Homme = homme;
    }

    public boolean isFemme() {
        return femme;
    }

    public void setFemme(boolean femme) {
        this.femme = femme;
    }

    public int getNcivqiue() {
        return Ncivqiue;
    }

    public void setNcivqiue(int ncivqiue) {
        Ncivqiue = ncivqiue;
    }

    public int getRue() {
        return Rue;
    }

    public void setRue(int rue) {
        Rue = rue;
    }

    public int getAppart() {
        return Appart;
    }

    public void setAppart(int appart) {
        Appart = appart;
    }

    public String getVille() {
        return Ville;
    }

    public void setVille(String ville) {
        Ville = ville;
    }

    public String getCpost() {
        return Cpost;
    }

    public void setCpost(String cpost) {
        Cpost = cpost;
    }

    public int getTel() {
        return Tel;
    }

    public void setTel(int tel) {
        Tel = tel;
    }

    public int getTelTrav() {
        return TelTrav;
    }

    public void setTelTrav(int telTrav) {
        TelTrav = telTrav;
    }

    public int getCel() {
        return cel;
    }

    public void setCel(int cel) {
        this.cel = cel;
    }

    public DateFormat getDate() {
        return Date;
    }

    public void setDate(DateFormat date) {
        Date = date;
    }

    public String getNAS() {
        return NAS;
    }

    public void setNAS(String NAS) {
        this.NAS = NAS;
    }

    public ContactsContract.CommonDataKinds.Email getCouriel() {
        return Couriel;
    }

    public void setCouriel(ContactsContract.CommonDataKinds.Email couriel) {
        Couriel = couriel;
    }

    public Integer getNAM() {
        return NAM;
    }

    public void setNAM(Integer NAM) {
        this.NAM = NAM;
    }
}
