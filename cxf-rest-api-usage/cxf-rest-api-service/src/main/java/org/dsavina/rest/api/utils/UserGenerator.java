package org.dsavina.rest.api.utils;

import java.security.SecureRandom;

import org.dsavina.rest.api.resources.User;

public class UserGenerator {

    private SecureRandom sr = new SecureRandom();
    private final String ab = "ABCDEFGHIJKLMNOPQRSTUVWXYZabcdefghijklmnopqrstuvwxyz";
    private final String digits = "0123456789";
    private final int defaultLen = 5;
    private int lastId = 0;


    private int generateId(int lastId) {
        lastId ++;
        this.lastId = lastId;
        return lastId;
    }
    private String generateLogin(int length) {
        StringBuffer sb = new StringBuffer();
        int i = 0;
        while (i < length) {
            sb.append(ab.charAt(sr.nextInt(ab.length())));
            i++;
        }
        return sb.toString();
    }
    private String generatePassword(int length) {
        StringBuffer sb = new StringBuffer();
        int i = 0;
        String abDig = ab+digits;
        while (i < length) {
            sb.append((abDig).charAt(sr.nextInt(abDig.length())));
            i++;
        }
        return sb.toString();
    }

    private String generateFirstName() {
        StringBuffer sb = new StringBuffer();
        int i = 0;
        while (i < 5) {
            sb.append(ab.charAt(sr.nextInt(ab.length())));
            i++;
        }
        return sb.toString();
    }

    private String generateLastName() {
        StringBuffer sb = new StringBuffer();
        int i = 0;
        while (i < 5) {
            sb.append(ab.charAt(sr.nextInt(ab.length())));
            i++;
        }
        return sb.toString();
    }
    public User generateUser(){
        return new User(generateId(lastId), 
                generateLogin(defaultLen),
                generatePassword(defaultLen),
                generateFirstName(),
                generateLastName());
    } 
    
    public User generateUser(int lastId, int lenght){
        return new User(generateId(lastId), 
                generateLogin(lenght),
                generatePassword(lenght),
                generateFirstName(),
                generateLastName());
    } 
}
