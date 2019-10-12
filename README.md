<<<<<<< HEAD
**1. Projektötlet:**

Éttermi rendelő felület elkészítése

**Funkcionális követelmények:**

-   Alkalmazott bejelentkezés

-   Ételt és ital kategóriák listázása

-   Ételek listázása

-   Italok listázása

-   Ételek és italok keresése

-   Vendég rendelhet ételt és italt

-   Vendég jelezheti, ha egyéb kérése van (esetleg takarítást, új evőeszközt
    kér)

-   Vendég kérheti a számlát

-   Vendég lekérdezheti a számla jelenlegi részösszegét

-   Vendég adhat megjegyzést az adott rendeléshez

-   Vendég módosíthatja a rendelését (a rendelés feldolgozása előtt!)

-   Vendég adhat meg kupon vagy törzsvendég kódot

-   Alkalmazott hozzáadhat ételt és italt az étlaphoz/itallaphoz

-   Alkalmazott módosíthatja a rendelés állapotát

-   Alkalmazott módosíthatja az elérhető ételek, italok kínálatát

-   Alkalmazott módosíthatja az árakat (ha nincs vendég az étteremben)

-   Alkalmazott kijelentkezés

**Nem funkcionális követelmények:**

-   1-sok kapcsolat használata

-   sok-sok kapcsolat használata

-   h2 adatbázis-kezelő alkalmazása

-   Java Spring Boot technológia használata

-   MVC modell

-   REST API

-   authorizált végpontok használata

**Szakterületi fogalomjegyzék:**

-   Étel és ital kategóriák: Egy szűkítő lista, mely segít a keresett étel
    gyorsabb megtalálásában (pl.: saláta, leves, üdítő)

-   Étel: Az elérhető ennivalók

-   Ital: Az elérhető innivalók, űrmértékkel és alkoholszázalékkal feltüntetve

-   Ár: Egy adag étel, ital költsége Forintban

-   Számla: A vendég fogyasztásának végösszegét tartalmazó dokumentum

-   Asztalkód: Minden asztalnak van egy rendelő felülete egy egyedi
    azonosítóval, így a vendégek kényelmesen, bejelentkezés nélkül tudják
    igénybe venni az étterem szolgáltatásait

-   Alkalmazott: Az étterem működtetéséhez szükséges jogosultságokkal rendelkező
    user

-   Vendég: Az étterem szolgáltatásait igénybe venni képes jogosultságokkal
    rendelkező user

**Szerepkör:**

-   Alkalmazott: Jogában áll az étel és itallap tartalmát és árát módosítani, a
    rendelés állapotát frissíteni

-   Vendég: Ételeket, italokat tud keresni, rendelni, melyhez tud megjegyzést
    fűzni vagy azt módosítani. Kérheti a számlát és jelezheti ha egyéb igénye
    volna.
=======
**1. Projektötlet:**

Éttermi rendelő felület elkészítése

**Funkcionális követelmények:**

-   Alkalmazott bejelentkezés

-   Ételt és ital kategóriák listázása

-   Ételek listázása

-   Italok listázása

-   Ételek és italok keresése

-   Vendég rendelhet ételt és italt

-   Vendég jelezheti, ha egyéb kérése van (esetleg takarítást, új evőeszközt
    kér)

-   Vendég kérheti a számlát

-   Vendég lekérdezheti a számla jelenlegi részösszegét

-   Vendég adhat megjegyzést az adott rendeléshez

-   Vendég módosíthatja a rendelését (a rendelés feldolgozása előtt!)

-   Vendég adhat meg kupon vagy törzsvendég kódot

-   Alkalmazott hozzáadhat ételt és italt az étlaphoz/itallaphoz

-   Alkalmazott módosíthatja a rendelés állapotát

-   Alkalmazott módosíthatja az elérhető ételek, italok kínálatát

-   Alkalmazott módosíthatja az árakat (ha nincs vendég az étteremben)

-   Alkalmazott kijelentkezés

**Nem funkcionális követelmények:**

-   1-sok kapcsolat használata

-   sok-sok kapcsolat használata

-   h2 adatbázis-kezelő alkalmazása

-   Java Spring Boot technológia használata

-   MVC modell

-   REST API

-   authorizált végpontok használata

**Szakterületi fogalomjegyzék:**

-   Étel és ital kategóriák: Egy szűkítő lista, mely segít a keresett étel
    gyorsabb megtalálásában (pl.: saláta, leves, üdítő)

-   Étel: Az elérhető ennivalók, hozzávalókkal és allergénekkel feltüntetve

-   Ital: Az elérhető innivalók, űrmértékkel és alkoholszázalékkal feltüntetve

-   Ár: Egy adag étel, ital költsége Forintban

-   Számla: A vendég fogyasztásának végösszegét tartalmazó dokumentum

-   Asztalkód: Minden asztalnak van egy rendelő felülete egy egyedi
    azonosítóval, így a vendégek kényelmesen, bejelentkezés nélkül tudják
    igénybe venni az étterem szolgáltatásait

-   Alkalmazott: Az étterem működtetéséhez szükséges jogosultságokkal rendelkező
    user

-   Vendég: Az étterem szolgáltatásait igénybe venni képes jogosultságokkal
    rendelkező user

**Szerepkör:**

-   Alkalmazott: Jogában áll az étel és itallap tartalmát és árát módosítani, a
    rendelés állapotát frissíteni

-   Vendég: Ételeket, italokat tud keresni, rendelni, melyhez tud megjegyzést
    fűzni vagy azt módosítani. Kérheti a számlát és jelezheti ha egyéb igénye
    volna.
>>>>>>> Add base of project
