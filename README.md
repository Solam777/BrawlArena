# Projet Java - Brawler Arena


## Auteurs

- g62368 **Solam**  
- g62415 **Darlin**

---

## Description du Projet

**Brawler Arena** est une application Java inspirée de l'univers du jeu *Brawl Stars*. Elle permet de :

- Scanner des images de Brawlers via OCR (grâce à Tesseract).  
- Former une équipe personnalisée de Brawlers à travers 3 rounds.  
- Simuler des combats sur plusieurs tours avec stratégie d’attaque ou défense.  
- Sauvegarder et consulter les matchs passés via une base de données SQLite.  
- Le tout avec une interface moderne JavaFX en plusieurs vues FXML.  

---

## Fonctionnement global

1. À l'ouverture, l’utilisateur choisit :  
   - Scanner des Brawlers pour former une team (3 brawlers à la fois).  
   - Charger l’historique des matchs enregistrés.  

2. Phase de combat en 3 rounds :  
   - **Round 1** : choisir 3 brawlers à faible rareté parmi ceux scannés.  
   - **Round 2 et 3** : choisir 1 Brawler à plus forte rareté (possibilité de re-scan).  
   - Chaque round oppose les deux équipes, en offrant à l’utilisateur un choix attaque / défense.  
   - À la fin des 3 rounds, un vainqueur global est désigné.  

---

## Diagramme de Classe

Le diagramme ci-dessous illustre les principales entités du modèle de données :

![Diagramme de classe](Diagram_Brawler_Arena_V1.png)

---

## Architecture de l'application

L'application respecte le **design pattern MVC** :  

- **Model** : logique métier (Brawler, Team, Match…)  
- **View** : vues graphiques FXML (Accueil, Scan, Combat, Historique…)  
- **Controller** : classes Java associées aux vues, gestion des événements  

---

## Plan de Tests Fonctionnels

### Tests OCR

| ID    | Description                         | Donnée d'entrée             | Résultat attendu                                   |
|-------|-------------------------------------|------------------------------|----------------------------------------------------|
| OCR-1 | Scan de 3 Brawlers via image        | Image de 3 cartes brawlers   | Données extraites et enregistrées                  |
| OCR-2 | Changer les brawlers proposés       | Clic sur flèche              | 3 nouveaux brawlers affichés                       |
| OCR-3 | Scan d’image floue ou incorrecte    | Image floue, texte illisible | Message d’erreur + refus de sauvegarde             |

### Tests Équipe

| ID     | Description                               | Donnée d'entrée             | Résultat attendu                |
|--------|-------------------------------------------|------------------------------|---------------------------------|
| TEAM-1 | Sélection de brawlers pour Round 1        | 3 brawlers de rareté faible  | L’équipe est créée et validée   |
| TEAM-2 | Sélection d’1 brawler pour Round 2 ou 3   | 1 brawler rare/moyen/élevé   | Ajout au combat autorisé        |
| TEAM-3 | Lancer un match sans équipe               | Aucun brawler sélectionné    | Message d’erreur, blocage match |

### Tests de Combat

| ID       | Description                  | Action utilisateur      | Résultat attendu                   |
|----------|------------------------------|-------------------------|------------------------------------|
| BATTLE-1 | Combat Round 1               | Cliquer sur "Lancer"    | Affichage animation / scores       |
| BATTLE-2 | Choisir d'attaquer           | Clic bouton "Attaque"   | Calcul des dégâts + mise à jour    |
| BATTLE-3 | Choisir de se défendre       | Clic bouton "Défense"   | Réduction des dégâts subis         |
| BATTLE-4 | Victoire après 3 rounds      | Gagner 2 rounds sur 3   | Affichage du vainqueur + sauvegarde |

### Tests Base de Données

| ID    | Description                     | Action                    | Résultat attendu                           |
|-------|---------------------------------|---------------------------|--------------------------------------------|
| DB-1  | Enregistrement du match en base | Fin d’un combat           | Match sauvegardé avec équipes, score, date |
| DB-2  | Affichage de l’historique       | Clic sur "Voir Historique"| Liste des matchs passés affichée           |

---

## Planning hebdomadaire

### Semaine 1

| Qui    | Tâche                                               |
|--------|-----------------------------------------------------|
| Tous   | Analyse des besoins et rédaction de la description  |
| Solam  | Choix OCR, rédaction et test de l’OCRService        |
| Darlin | Git init, structure SQLite + diagramme UML          |

### Semaine 2

| Qui    | Tâche                                               |
|--------|-----------------------------------------------------|
| Solam  | Intégration OCR + ScanController                    |
| Darlin | DatabaseManager + Repository + entités modèles      |

### Semaine 3

| Qui    | Tâche                                               |
|--------|-----------------------------------------------------|
| Solam  | Création des vues FXML (Accueil, Scan, Combat)      |
| Darlin | Gestion équipes + enregistrement match              |

### Semaine 4

| Qui    | Tâche                                               |
|--------|-----------------------------------------------------|
| Solam  | Simulateur de match + logique attaque/défense       |
| Darlin | Vue Historique + affichage résultats                |

### Semaine 5

| Qui    | Tâche                                               |
|--------|-----------------------------------------------------|
| Solam  | Nettoyage OCR + commentaires + vidéo de démo        |
| Darlin | Tests fonctionnels + README final + corrections     |

---

## Installation et Lancement

1. Clone this repository:

   ```bash
   git clone https://github.com/Solam777/BrawlArena.git
   ```

2. Navigate to the project directory:

   ```bash
   cd 
   ```

3. Start the project using Maven:

   ```bash
   mvn javafx:run
   ```

Make sure you have **Maven** and **Java** installed.
