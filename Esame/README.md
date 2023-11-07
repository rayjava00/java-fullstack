**Creazione Database con comandi sqlite3**

-creazione database utilizzando il seguente comando nella directory desiderata.

```
 sqlite3 database.db
```

**Creazione Tabella con comandi sqlite3**
_Creazione Tabella_: creiamo il tabella utilizzando il seguente comando:

```
sqlite> create table compagni('nome' text, 'cognome' text, 'email' text);

```

-Dopo l'esecuzione del comando verrà creata una tabella con il nome da noi stabilito (compagni), all'interno della tabella troviamo
i campi inseriti (nome , cognome , email) e va specificato il tipo di dato che verrà inserito (text).

**Inserimento Dati con comandi sqlite3**
-Per questione di comodità ho deciso di inserire i dati attraverso il prompt utilizzando i seguenti comandi:

```
sqlite> insert into compagni values('cris','thompson','ciao@gmail.com');
sqlite> insert into compagni values('giorgio','bruzzone','ciao1@gmail.com');
sqlite> insert into compagni values('gianluca','ciceri','ciao2@gmail.com');
sqlite>  insert into compagni values('simone','rizzo','ciao3@gmail.com');
sqlite>  insert into compagni values('alessandro','degiacobbi','ciao4@gmail.com');
sqlite>  insert into compagni values('davide','rivolta','ciao5@gmail.com');
sqlite>  insert into compagni values('emanuele','boh','ciao6@gmail.com');
sqlite>  insert into compagni values('greta','greta','ciao7@gmail.com');
sqlite>  insert into compagni values('tiziano','jessa','ciao8@gmail.com');
sqlite>  insert into compagni values('andrea','andrea','ciao9@gmail.com');

```
