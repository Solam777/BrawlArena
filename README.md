# Nom du Projet : Brawler Arena

![Java](https://img.shields.io/badge/Java-ED8B00?style=flat&logo=openjdk&logoColor=white) 
![SQLite](https://img.shields.io/badge/SQLite-003B57?style=flat&logo=sqlite&logoColor=white) 
![Markdown](https://img.shields.io/badge/Markdown-000000?style=flat&logo=markdown&logoColor=white)    

---

## Auteurs

- Groupe D122  
- g62368 Solam  
- g62415 Darlin  

---

## Description du Projet

**Brawler Arena** est une application Java qui permet de scanner des images de personnages du jeu *Brawl Stars*, d'extraire automatiquement leurs caractéristiques (santé, attaque, super, rareté) via OCR, de créer des équipes personnalisées et de simuler des affrontements entre elles.  
Le projet mêle traitement d’image, base de données, logique métier et interface graphique moderne en JavaFX.

---

## Diagramme de Classe

Le diagramme de classe ci-dessous illustre la structure du modèle de l'application.

📎 _[À insérer : diagramme_classe.png dans le dossier /images]_  

![Diagramme de classe](./images/diagramme_classe.png)

---

## Choix de l'Architecture

L’architecture retenue est le **pattern MVC (Model - View - Controller)**.  
Ce choix permet de séparer clairement :
- La logique métier (`Model`)
- L’interface utilisateur (`View`, via fichiers FXML)
- Le contrôle des interactions (`Controller`)

---

## Plan de Tests Fonctionnels

Les tests fonctionnels élémentaires pour le projet sont les suivants :

- [ ] Le scan OCR d’un Brawler extrait correctement toutes les stats.
- [ ] L’ajout à une équipe est limité à 3 Brawlers.
- [ ] La simulation d’un match retourne bien le vainqueur selon les stats.
- [ ] L’historique d’affrontements est bien sauvegardé et affiché.
- [ ] L’image d’un Brawler s’affiche correctement dans la vue Galerie.

---

## Calendrier Hebdomadaire des Tâches

### Semaine 1 - 6H

| Qui       | Description  
|--         | --
| Tous      | Analyse du projet, choix des fonctionnalités
| Solam     | Initialisation de Git, dépôt et README
| Darlin    | Rédaction de la description des besoins

### Semaine 2 - 6H

| Qui       | Description  
|--         | --
| Solam     | Implémentation de la structure de la base de données
| Darlin    | Intégration de la librairie OCR (Tesseract)

### Semaine 3 - 6H

| Qui       | Description  
|--         | --
| ...       | _À compléter_

---

## Installation et utilisation

Pour utiliser l'application, suivez les étapes suivantes :

1. Clonez ce repository :
   ```bash
   git clone <lien_du_projet>