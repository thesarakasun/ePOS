/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package epos2;

/**
 *
 * @author Thesara
 */
public class SessionManager {
    public static boolean isLoggedIn = false; // Tracks login status
    
    private static int userID;

    public static void setUserID(int id) {
        userID = id;
    }

    public static int getUserID() {
        return userID;
    }
}
