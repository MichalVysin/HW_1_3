package com.company;

public enum Table {
    TABLE_1 ("Stůl č.1"), TABLE_2 ("Stůl č.2"), TABLE_3 ("Stůl č.3"), TABLE_4 ("Stůl č.4"),
    TABLE_5 ("Stůl č.5");

    private final String description;

    Table(String description) {
        this.description = description;
    }

    public String getDescription() {
        return description;
    }
}
