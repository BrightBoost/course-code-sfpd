package com.company.day5;

public enum Color {
    BLUE("like the sky"), PURPLE("like eggplants"), YELLOW("like bananas"), GREEN("like grass");

    private String description;
    public String getDescription(){
        return description;
    }

    Color(String description){
        this.description = description;
    }

}
