package com.example.qriffic;

import java.util.ArrayList;

/**
 * This class defines a player profile
 */
public class PlayerProfile {

    private String username;
    private String uuid;
    private ContactInfo contactInfo;
    private int highScore;
    private int lowScore;
    private ArrayList<QRCode> captured;

    /**
     * This is the constructor for a PlayerProfile object
     * @param username
     * The player's ID info as a Player object
     * @param contactInfo
     * The player's contact info as a ContactInfo object
     */
    public PlayerProfile(String username, String uuid, ContactInfo contactInfo) {

        this.username = username;
        this.uuid = uuid;
        this.contactInfo = contactInfo;
        highScore = 0;
        lowScore = 0;
        captured = new ArrayList<QRCode>();
    }

    /**
     * This method returns the username of a PlayerProfile object
     * @return
     * The player's username as a string
     */
    public String getUsername() {
        return username;
    }

    /**
     * This method returns the uuid of a PlayerProfile object
     * @return
     * The player's uuid as a string
     */
    public String getUuid() {
        return uuid;
    }

    /**
     * This method returns the contact info of a PlayerProfile object
     * @return
     * The contact info as a ContactInfo object
     */
    public ContactInfo getContactInfo() {
        return contactInfo;
    }

    /**
     * This method returns the high score of a PlayerProfile object
     * @return
     * The high score as an integer
     */
    public int getHighScore() {
        return highScore;
    }

    /**
     * This method returns the high score of a PlayerProfile object
     * @return
     * The high score as an integer
     */
    public int getLowScore() {
        return lowScore;
    }

    /**
     * This method returns the list of captured QRCodes of a PlayerProfile object
     * @return
     * The captured QRCodes as an ArrayList of QRCode objects
     */
    public ArrayList<QRCode> getCaptured() {
        return captured;
    }

    /**
     * This method adds a QRCode object to the list of captured QRCodes of a PlayerProfile object
     * @param qrCode
     * The QRCode object to be added to the ArrayList of QRCode objects
     */
    public void addQRCode(QRCode qrCode) {

        // do we allow players to add identical QRCodes? Do we cap the amount of QR codes you can collect?
        captured.add(qrCode);
    }
}
