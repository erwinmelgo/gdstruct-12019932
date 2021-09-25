package com.erwinmelgo;

import java.util.Objects;

public class Card {
    private int energyCost;
    private String name;

    public Card(int energyCost, String name) {
        this.energyCost = energyCost;
        this.name = name;
    }

    public int getEnergyCost() {
        return energyCost;
    }

    public void setEnergyCost(int energyCost) {
        this.energyCost = energyCost;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Override
    public String toString() {
        return "Card{" +
                "Energy Cost = " + energyCost +
                ", Name = '" + name + '\'' +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Card card = (Card) o;
        return energyCost == card.energyCost && Objects.equals(name, card.name);
    }

    @Override
    public int hashCode() {
        return Objects.hash(energyCost, name);
    }
}
