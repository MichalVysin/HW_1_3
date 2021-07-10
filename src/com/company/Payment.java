package com.company;

public enum Payment {
    CARD ("Platební karta"), CASH ("Hotově");

    private final String description;

    Payment(String description) {
        this.description = description;
    }

    public String getDescription() {
        return description;
    }
}




