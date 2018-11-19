package com.example.demo;

import java.net.URL;
import java.util.HashSet;
import java.util.Set;

public class Orgs {

    private String login;
    private long id;
    private URL members_url;
    private Set<User> users;


    public Set<User> getUsers() {
        return users;
    }

    public void setUsers(Set<User> users) {
        this.users = users;
    }


    public Orgs() {
        this.users = new HashSet<>();
    }

    public String getLogin() {
        return login;
    }

    public void setLogin(String login) {
        this.login = login;
    }

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public URL getMembers_url() {
        return members_url;
    }

    public void setMembers_url(URL members_url) {
        this.members_url = members_url;
    }
}
