package net.aidanjameskelly.quickcombat;

public class Encounter {

    public static final String TABLE_NAME = "encounters";

    public static final String COLUMN_ENCID = "encID";
    public static final String COLUMN_NAME = "name";
    public static final String COLUMN_PLAYERS = "numOfPlayers";

    private int encID;
    private String name;
    private int numOfPlayers;

    public static final String CREATE_TABLE =
            "CREATE TABLE " + TABLE_NAME + "("
                    + COLUMN_ENCID + " INTEGER PRIMARY KEY AUTOINCREMENT,"
                    + COLUMN_NAME + " TEXT,"
                    + COLUMN_PLAYERS + " INTEGER"
                    + ")";

    public Encounter(){
    }

    public Encounter(int encID, String name, int numOfPlayers){
        this.encID = encID;
        this.name = name;
        this.numOfPlayers = numOfPlayers;
    }

    public int getEncID(){
        return encID;
    }

    public void setEncID(int encID){
        this.encID = encID;
    }

    public String getName(){
        return name;
    }

    public void setName(String name){
        this.name = name;
    }

    public int getNumOfPlayers(){
        return numOfPlayers;
    }

    public void setNumOfPlayers(int numOfPlayers){
        this.numOfPlayers = numOfPlayers;
    }


}
