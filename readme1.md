`12. September 2023` - `neueFische - Java Development Bootcamp`
## Recap ShopService
## Vorbereitung
##### Heute dreht sich alles um die ShopService Aufgabe. Ergänzt oder schreibt für alle Schritte in der Aufgabe Tests, außer es ist anders angegeben.
1. Klont Euch die Musterlösung: [ShopService](https://github.com/Flooooooooooorian/Recap-Project-Objektorientierung-ShopService). Ihr arbeitet heute in neuen Gruppenkonstellationen und sollt Erfahrung im Arbeiten mit fremden Code sammeln. Deshalb arbeitet bitte heute auf Basis der Musterlösung aus dem letzten Modul.
2. Nun entfernt die Verknüpfung zu Florians Github-Repository, in dem Ihr im Menü unter "Git" "Manage Remotes" auswählt und dort den Eintrag "origin" entfernt.
3. Ladet das Projekt als neues Repository auf GitHub in einen von Euren eigenen GitHub-Accounts hoch: In IntelliJ wählt bei dem geklonten Projekt im Menü "Git", unter "GitHub", "Share Project on GitHub" aus.
4. Die Musterlösung ist nun der main-Branch Eures GitHub-Repositories.
## Aufgaben
### 📦 Bestellstatus
1. Fügt einen Bestellstatus zu der Order hinzu (PROCESSING, IN_DELIVERY, COMPLETED), um den Status der Order zu bestimmen.
###### Legt dazu einen neuen Branch an, erstellt und pusht die Commits, erstellt einen Pull-Request, reviewet den PR und merged ihn in den main-Branch.
2. Schreibt in dem ShopService eine Methode, die alle Bestellungen mit einem bestimmten Bestellstatus (Parameter) in einer Liste zurückgibt. Nutzt dafür Streams.
### 📦 Optional Product
3. Bearbeitet die Methode 'getProductById' in eurem ProductRepo, sodass sie ein Optional<Product> zurückgibt, wenn das Produkt existiert, andernfalls ein leeres Optional.
### 📦 Exceptions
4. Bearbeitet die Methode 'addOrder' im ShopService, sodass eine Exception geworfen wird, wenn das Product nicht vorhanden ist.
### 📦 Lombok
5. Fügt eine 'updateOrder' Methode im ShopService hinzu, die anhand einer orderId und einem neuen Bestellstatus die Order aktualisiert. Nutze dafür Lombok @With Annotation.
### 📦 Bestelldatum
6. Erweitert das Order-Objekt um ein Feld, das den Bestellzeitpunkt speichert. In der 'addOrder' Methode soll dieses Feld mit dem aktuellen Zeitpunkt befüllt werden.
###### Dieser Zeitpunkt soll vor Gericht als Nachweis verwendet werden können, wenn Besteller*innen behaupten, die Bestellung gar nicht aufgegeben zu haben. Überlegt Euch, welcher Datentyp dafür am besten geeignet ist - auch wenn Besteller*innen aus dem Ausland bestellen.

## Bonus Aufgaben
### ⭐️ in Main Repo festlegen
1. Erstellt eine Main-Klasse mit main-Methode. In dieser Methode erstellt eine Instanz des Shop-Services.
2. Auch die konkreten Instanzen für OrderRepo und ShopRepo sollen hier in der main-Methode erstellt werden. Übergebt sie dem ShopService-Konstruktor. Nutzt die `@RequiredArgsConstructor`-Annotation im Shop-Service um einen entsprechenden Konstruktor zu generieren.
3. Legt drei konkrete Bestellungen fest und fügt sie alle dem ShopService hinzu.
### ⭐️ ID-Erstellung
4. Erstellt für die Erstellung einer ID einen `IdService`, der in der Methode `generateId` jeweils eine neue UUID zurückgibt (mithilfe von `java.util.UUID`). Erstellt eine konkrete Implementierung des IdService in der main-Methode und übergebt sie dem ShopService-Konstruktor.
### ⭐️ Liegengebliebenes
5. Schreibt eine Methode `getOldestOrderPerStatus`, die eine Map mit dem ältesten Order-Objekt pro Status zurückgibt.
### ⭐️ Transaktions-File
6. Lass die Main-Methode eine Datei `transactions.txt` einlesen, in diesem Format:
```java
addOrder A 1 2 3
addOrder B 4 1
setStatus A COMPLETED
printOrders
```
7. Diese Datei soll eine Liste von Befehlszeilen enthalten, die der ShopService ausführen soll.
8. Folgende Befehlszeilen sollen unterstützt werden:

`addOrder` & `setStatus`
### addOrder
9. Fügt eine neue Bestellung hinzu. Die Bestellung soll die übergebenen Produkt-IDs enthalten. Die Bestellung soll den Status `PROCESSING haben.
```java
addOrder <alias for order within file> <productId> [<productId> ...]
```
10. Speichert die OrderID, die Euch der ShopService zurückgibt, in einer Datenstruktur (zu dem angegebenen, frei wählbaren Alias), sodass Ihr später den Status der Bestellung ändern könnt.
### setStatus
11. Setzt den Status einer Bestellung.
```java
setStatus <alias for order within file> <status>
```
### printOrders
12. Gibt alle Bestellungen aus.
### ⭐️ Mengenangaben und Lagerbestände
13. Fügt eine Mengenangabe zu den Produkten hinzu. Wenn ein Produkt bestellt wird, wird die Menge des Produkts verringert. Wenn ein Produkt nicht mehr auf Lager ist, kann es nicht mehr bestellt werden. Lasse auch Fließkommazahlen zu. Und erweitere die Befehlsverarbeitung mit `transactions.txt entsprechend.