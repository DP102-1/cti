package com.example.cti;

public class Candidate {
    private int image;
    private String name;
    private int vote;
    private String group;
    private String talk;

    public int getImage() {
        return image;
    }

    public void setImage(int image) {
        this.image = image;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getVote() {
        return vote;
    }

    public void setVote(int vote) {
        this.vote = vote;
    }

    public String getGroup() {
        return group;
    }

    public void setGroup(String group) {
        this.group = group;
    }

    public String getTalk() {
        return talk;
    }

    public void setTalk(String talk) {
        this.talk = talk;
    }

    public Candidate(int image, String name, int vote, String group, String talk) {
        this.image = image;
        this.name = name;
        this.vote = vote;
        this.group = group;
        this.talk = talk;
    }
}
