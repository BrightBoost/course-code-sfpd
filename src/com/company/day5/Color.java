package com.company.day5;

    public enum Color{
        BLUE("'like sky"), PURPLE("like night"), YELLOW ("like banan"),GREEN ("like grass");

        private String description;

        public String getDescription() {
            return description;
        }

        Color(String description){
            this.description= description;
        }
     }
