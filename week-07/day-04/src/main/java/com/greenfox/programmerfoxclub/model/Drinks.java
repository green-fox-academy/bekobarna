package com.greenfox.programmerfoxclub.model;

    public enum Drinks {
        BEER("Beer"),
        WHISKEY("Whiskey"),
        VODKA("Vodka"),
        WATER("Water");

        private String name;

        Drinks(String name) {
            this.name = name;
        }

        @Override
        public String toString() {
            return name;
        }
    }

