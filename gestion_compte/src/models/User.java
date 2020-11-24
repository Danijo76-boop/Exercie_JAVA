/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package models;

/**
 *
 * @author GABZO THIAW
 */
public class User {
    protected int id;
    protected String login;
    protected String pwd;

    //creation de l'objet(constructeur)

    public User() {
    }

    public User(String login, String pwd) {
        this.login = login;
        this.pwd = pwd;
    }

    public User(int id, String login, String pwd) {
        this.id = id;
        this.login = login;
        this.pwd = pwd;
    }
    
    //creation de getter
    public int getId() {
        return id;
    }

    public String getLogin() {
        return login;
    }

    public String getPwd() {
        return pwd;
    }
    
    //creation de setter
    public void setId(int id) {
        this.id = id;
    }

    public void setLogin(String login) {
        this.login = login;
    }

    public void setPwd(String pwd) {
        this.pwd = pwd;
    }
}
