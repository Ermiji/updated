package com.example.demo;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

import java.net.URI;
import java.net.URL;

@JsonIgnoreProperties
public class User {

    private String login;
    private long id;
    private String repos_url;
    private int followers;
    private int following;



    public int getFollowing() {
        return following;
    }

    public void setFollowing(int following) {
        this.following = following;
    }


    public String getRepos_url() {
        return repos_url;
    }

    public void setRepos_url(String repos_url) {
        this.repos_url = repos_url;
    }

    public User() {
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

    @Override
    public String toString(){
        return "{" +
                "login='"+ login + '\''+
                ", id=" + id +
                ", repos_ur= " + repos_url+
                ", followers= " + followers +
                ", following= " + following+
                "\n}";
    }

    public int getFollowers() {
        return followers;
    }

    public void setFollowers(int followers) {
        this.followers = followers;
    }
}
