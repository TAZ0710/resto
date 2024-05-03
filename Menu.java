/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.resto;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import javax.annotation.processing.SupportedSourceVersion;
import javax.lang.model.SourceVersion;


/**
 *
 * @author O.Khichane
 */







 class Resto {

    public static void main(String[] args) {
        System.out.println("Hello World!");
    }
}


// Classe Restaurant
 class Restaurant {
    private final Table[] tables;
    private final Commande[] commandes;

    public Restaurant(Carte carte, int nombreTables) {
        this.tables = new Table[nombreTables];
        this.commandes = new Commande[nombreTables];
        for (int i = 0; i < nombreTables; i++) {
            this.tables[i] = new Table(i + 1);
            this.commandes[i] = new Commande();
        }
    }

    // Méthode pour prendre une commande à une table donnée
    public void prendreCommande(int numeroTable, String plat) {
        commandes[numeroTable - 1].ajouterPlat(plat);
    }

    // Autres méthodes pour gérer la caisse, la carte, etc.
}

// Classe Table
class Table {

    public Table(int numero) {
    }

    // Méthodes pour gérer les états de la table (occupée, libre, etc.)
}

// Classe Commande
 class Commande{
    private final List<String> plats;

    public Commande() {
        this.plats = new ArrayList<>();
    }

    public void ajouterPlat(String plat) {
        plats.add(plat);
    }

    // Autres méthodes pour gérer la commande (supprimer un plat, calculer le total, etc.)

    public SourceVersion getSupportedSourceVersion() {
        return SourceVersion.latest();
    }

    
       
    }

  
  


// Classe Carte (à définir)
public class Carte {
    // Définir les plats disponibles sur la carte
}



// Menu.java
public class Menu {
    private final Map<String, Double> items;

    public Menu() {
        items = new HashMap<>();
    }

    public void addItem(String name, double price) {
        items.put(name, price);
    }

    public Double getItemPrice(String name) {
        return items.get(name);
    }
}

// Commande.java
 class Commande {
    private int tableNumber;
    private List<String> items;

    public Commande(int tableNumber) {
        this.tableNumber = tableNumber;
        items = new ArrayList<>();
    }

    public void addItem(String item) {
        items.add(item);
    }

    // Getters and setters
}

// Main.java
public class Main {
    public static void main(String[] args) {
        // Initialisation du menu
        Menu menu = new Menu();
        menu.addItem("Pizza", 10.0);
        menu.addItem("Salade", 5.0);

        // Prise d'une commande
        Commande commande = new Commande(1);
        commande.addItem("Pizza");
        // ...
    }
}