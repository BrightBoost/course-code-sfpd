package com.company.day5;

public enum Color {
    BLUE("like the sky", 4),
    PURPLE("like eggplants", 6),
    YELLOW("like bananas", 534),
    GREEN("like grass", 8);

    private int something;
    private String description;
    public String getDescription(){
        return description;
    }
    public int getSomething(){
        return something;
    }

    Color(String description, int something){
        this.description = description;
        this.something = something;
    }

}
