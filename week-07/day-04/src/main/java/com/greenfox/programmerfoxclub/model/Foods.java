package com.greenfox.programmerfoxclub.model;

    public enum Foods {
        NONE(""),
        HAMBURGER("Hamburger"),
        PIZZA("Pizza"),
        HOTDOG("Hotdog"),
        SALAD("Salad");

        private String name;

        Foods(String name) {
            this.name = name;
        }

        @Override
        public String toString() {
            return name;
        }
    }
