`5. September 2023` - `neueFische - Java Development Bootcamp`


# DerShop
#### Erstelle eine Klasse ProductRepo, die eine Liste von Product-Objekten enthält.
1. _Schritt 1_: Erstelle einen Record Product mit den benötigten Attributen.
2. _Schritt 2_: Implementiere die ProductRepo-Klasse mit einer Liste zur Speicherung von Produkten.
3. _Schritt 3_: Implementiere Methoden zum Hinzufügen, Entfernen und Abfragen von Produkten.
#### Erstelle eine Klasse OrderListRepo, die eine Liste von Order-Objekten enthält.
5. _Schritt 1_: Erstelle einen Record Order mit den benötigten Attributen.
6. _Schritt 2_: Implementiere die OrderListRepo-Klasse mit einer Liste zur Speicherung von Bestellungen.
7. _Schritt 3_: Implementiere Methoden zum Hinzufügen, Entfernen und Abfragen von Bestellungen.
#### Erstelle eine Klasse ShopService, über die wir neue Bestellungen aufgeben können.
8. _Schritt 1_: Implementiere eine Methode, um eine neue Bestellung aufzugeben.
9. _Schritt 2_: Überprüfe, ob die bestellten Produkte existieren. Wenn nicht gebe ein System.out.println aus.

<br><br>
10. _Schritt 1_: Erstelle ein OrderRepo-Interface mit den Methoden aus dem OrderListRepo (Hinzufügen, Entfernen und Abfragen von Bestellungen)
    <br><br>

11. Erstelle eine Klasse OrderMapRepo, über die wir neue Bestellungen aufgeben können.
12. Diese Klasse soll auch das OrderRepo-Interface implementieren.
13. Erstelle in der main-Methode entweder das OrderMapRepo oder das OrderListRepo und gib es dem Konstruktor von ShopService (in einen Konstruktor-Parameter, der das Interface nutzt) mit.
## Bonus Aufgabe
#### Für diejenigen mit Vorwissen oder zusätzlichem Interesse an Herausforderungen.
14. Füge ein Preis zum Produkt und einen Gesamtpreis für eine Bestellung hinzu.
15. Erlaube es dem Nutzer, die Anzahl der Produkte in einer Bestellung anzugeben und zu ändern.

##### Tests
16. Schreibe sinnvolle Tests für die Klassen ProductRepo, OrderListRepo und ShopService.
17. Nutze assertj matchers in deinen Tests.
##### Kommandozeilen-Interface
18. Nutze einen Scanner um von System.in zu lesen. Baue eine interaktive Produktverwaltung mit allen Extras.
##### Kommandozeilen-Farben
19. Gestalte die Kommandozeilenausgabe farbig mit sinnvollen, hilfreichen Farben und Formen.
##### EAN-Datenbank
20. Suche im Internet eine EAN-Datenbank als CSV (oder lass eine von ChatGPT generieren). Nutze diese CSV-Datei als Input
##### Bestandsinfos
21. Speichert pro Produkt, wie viele davon noch auf Lager sind. Wenn ein Produkt bestellt wird, wird der Bestand verringert. Wenn ein Produkt nicht mehr auf Lager ist, kann es nicht mehr bestellt werden.
##### Warenein- und ausgänge
22. Ermöglicht zusätzliche Workflows für Warenein- und ausgänge. Wenn Ware eingelagert wird, wird der Bestand erhöht. Wenn Ware ausgelagert wird (z.B. nach einem Wasserschaden oder Diebstahl), wird der Bestand verringert.
##### Bestandsprotokoll
23. Notiere für den Warenbestand ein Protokoll aller Warenbestandsänderungen mit Verknüpfungen zu den Bestellungen (oder Warenein- oder ausgängen), die diese Änderungen verursacht haben.








