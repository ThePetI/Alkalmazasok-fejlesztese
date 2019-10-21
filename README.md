****1. Projektötlet:****

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
	
**RestApi dokumentáció:**	


* **URL**

  /drinks

* **Method:**

  `GET`
  
*  **URL Params**

	None

* **Data Params**

	None

* **Success Response:**

  * **Code:** 200 <br />
    **Content:** `[
					  {
						"id": 2,
						"title": "Bartos ezerjĂł",
						"imageUrl": "",
						"description": "A hĂ­res magyar youtuber, Bartos Cs. IstvĂˇn utĂˇn elnevezett 100% gyĂĽmĂ¶lcstartalmĂş, biĂł Ă©s vegĂˇn termelĹ‘i bor.",
						"category": "Bor",
						"price": 2990,
						"size_of_drink": 100,
						"alcohol": 10,
						"created_at": "2019-10-19T13:34:33.946",
						"updated_at": "2019-10-19T13:34:33.946",
						"_available": true
					  },
					  {
						"id": 3,
						"title": "Cola",
						"imageUrl": "",
						"description": null,
						"category": "ĂśdĂ­tĹ‘",
						"price": 390,
						"size_of_drink": 2,
						"alcohol": 25,
						"created_at": "2019-10-19T13:34:33.946",
						"updated_at": "2019-10-19T13:34:33.946",
						"_available": true
					  },
					  {
						"id": 4,
						"title": "Whisky",
						"imageUrl": "",
						"description": "Jim Beam/Ballentines",
						"category": "TĂ¶mĂ©ny",
						"price": 890,
						"size_of_drink": 1,
						"alcohol": 40,
						"created_at": "2019-10-19T13:34:33.946",
						"updated_at": "2019-10-19T13:34:33.946",
						"_available": true
					  },
					  {
						"id": 5,
						"title": "LafiKobra",
						"imageUrl": "",
						"description": "A bajnokok napindĂ­tĂłja.",
						"category": "Kevert",
						"price": 590,
						"size_of_drink": 5,
						"alcohol": 8,
						"created_at": "2019-10-19T13:34:33.946",
						"updated_at": "2019-10-19T13:34:33.946",
						"_available": true
					  },
					  {
						"id": 6,
						"title": "Soproni",
						"imageUrl": "",
						"description": null,
						"category": "Sor",
						"price": 590,
						"size_of_drink": 5,
						"alcohol": 5,
						"created_at": "2019-10-19T13:46:30.461",
						"updated_at": "2019-10-19T13:46:30.462",
						"_available": true
					  }
					]
 
* **Error Response:**

  * **Code:** 404 NOT FOUND <br />
    **Content:** `{ error : "Error" }`

  OR

  * **Code:** 401 UNAUTHORIZED <br />
    **Content:** `{ error : "You are unauthorized to make this request." }`
	
###

* **URL**

  /drinks

* **Method:**

  `GET`
  
*  **URL Params**

	/id

* **Data Params**

	None

* **Success Response:**

  * **Code:** 200 <br />
    **Content:** 
				  {
					"id": 5,
					"title": "LafiKobra",
					"imageUrl": "",
					"description": "A bajnokok napindĂ­tĂłja.",
					"category": "Kevert",
					"price": 590,
					"size_of_drink": 5,
					"alcohol": 8,
					"created_at": "2019-10-19T13:34:33.946",
					"updated_at": "2019-10-19T13:34:33.946",
					"_available": true
				  },
 
* **Error Response:**

  * **Code:** 404 NOT FOUND <br />
    **Content:** `{ error : "Error" }`

  OR

  * **Code:** 401 UNAUTHORIZED <br />
    **Content:** `{ error : "You are unauthorized to make this request." }`

###

* **URL**

  /drinks

* **Method:**

  `POST`
  
*  **URL Params**

	None

* **Data Params**

	
	body: 
	  {
		"title": "Soproni",
		"imageUrl": "",
		"description": null,
		"category": "Sor",
		"price": 590,
		"size_of_drink": 5,
		"alcohol": 5,
		"created_at": "2019-10-19T13:46:30.461",
		"updated_at": "2019-10-19T13:46:30.462",
		"_available": true
	  }

* **Success Response:**

  * **Code:** 200 <br />
    **Content:** 
			  {
				"id": 6,
				"title": "Soproni",
				"imageUrl": "",
				"description": null,
				"category": "Sor",
				"price": 590,
				"size_of_drink": 5,
				"alcohol": 5,
				"created_at": "2019-10-19T13:46:30.461",
				"updated_at": "2019-10-19T13:46:30.462",
				"_available": true
			  }
		 
* **Error Response:**

  * **Code:** 404 NOT FOUND <br />
    **Content:** `{ error : "Error" }`

  OR

  * **Code:** 401 UNAUTHORIZED <br />
    **Content:** `{ error : "You are unauthorized to make this request." }`###

* **URL**

  /drinks

* **Method:**

  `PUT`
  
*  **URL Params**

	/id

* **Data Params**

	
	body: 
	  {
		"title": "Soproni",
		"imageUrl": "",
		"description": null,
		"category": "Sor",
		"price": 590,
		"size_of_drink": 5,
		"alcohol": 5,
		"created_at": "2019-10-19T13:46:30.461",
		"updated_at": "2019-10-19T13:46:30.462",
		"_available": true
	  }

* **Success Response:**

  * **Code:** 200 <br />
    **Content:** 
			  {
				"id": 6,
				"title": "Soproni",
				"imageUrl": "",
				"description": null,
				"category": "Sor",
				"price": 590,
				"size_of_drink": 5,
				"alcohol": 5,
				"created_at": "2019-10-19T13:46:30.461",
				"updated_at": "2019-10-19T13:46:30.462",
				"_available": true
			  }
		 
* **Error Response:**

  * **Code:** 404 NOT FOUND <br />
    **Content:** `{ error : "Error" }`

  OR

  * **Code:** 401 UNAUTHORIZED <br />
    **Content:** `{ error : "You are unauthorized to make this request." }`###
	
###

* **URL**

  /drinks

* **Method:**

  `DELETE`
  
*  **URL Params**

	/id

* **Data Params**

	None

* **Success Response:**

  * **Code:** 200 <br />
    **Content:** None
 
* **Error Response:**

  * **Code:** 404 NOT FOUND <br />
    **Content:** `{ error : "Error" }`

  OR

  * **Code:** 401 UNAUTHORIZED <br />
    **Content:** `{ error : "You are unauthorized to make this request." }`
	
* **URL**

* **URL**

  /employees

* **Method:**

  `GET`
  
*  **URL Params**

	None

* **Data Params**

	None

* **Success Response:**

  * **Code:** 200 <br />
    **Content:** [
					{
						"id": 1,
						"_name": "Krisztian",
						"pos": "Vezerigazgato"
					},
					{
						"id": 2,
						"_name": "Peti",
						"pos": "mosogato"
					},
					{
						"id": 3,
						"_name": "Elek Zoltan",
						"pos": "fo-szakacs"
					},
					{
						"id": 4,
						"_name": "Gordon Ramsey",
						"pos": "kukta"
					}
				]`
 
* **Error Response:**

  * **Code:** 404 NOT FOUND <br />
    **Content:** `{ error : "Error" }`

  OR

  * **Code:** 401 UNAUTHORIZED <br />
    **Content:** `{ error : "You are unauthorized to make this request." }`
	
###

* **URL**

  /employees

* **Method:**

  `POST`
  
*  **URL Params**

	None

* **Data Params**

	
	body: 
	{
		"_name": "Jani",
		"pos": "takarito"
	}

* **Success Response:**

  * **Code:** 200 <br />
    **Content:** 
				{
					"id": 5,
					"_name": "Jani",
					"pos": "takarito"
				}
 
* **Error Response:**

  * **Code:** 404 NOT FOUND <br />
    **Content:** `{ error : "Error" }`

  OR

  * **Code:** 401 UNAUTHORIZED <br />
    **Content:** `{ error : "You are unauthorized to make this request." }`###

* **URL**

  /employees

* **Method:**

  `POST`
  
*  **URL Params**

	None

* **Data Params**

	
	body: 
	{
		"_name": "Jani",
		"pos": "takarito"
	}

* **Success Response:**

  * **Code:** 200 <br />
    **Content:** 
				{
					"id": 5,
					"_name": "Jani",
					"pos": "takarito"
				}
 
* **Error Response:**

  * **Code:** 404 NOT FOUND <br />
    **Content:** `{ error : "Error" }`

  OR

  * **Code:** 401 UNAUTHORIZED <br />
    **Content:** `{ error : "You are unauthorized to make this request." }`

###

* **URL**

  /employees

* **Method:**

  `PUT`
  
*  **URL Params**

	/id

* **Data Params**

	
	body: 
	{
		"_name": "Jani",
		"pos": "felszolgalo"
	}

* **Success Response:**

  * **Code:** 200 <br />
    **Content:** 
				{
					"id": 5,
					"_name": "Jani",
					"pos": "felszolgalo"
				}
 
* **Error Response:**

  * **Code:** 404 NOT FOUND <br />
    **Content:** `{ error : "Error" }`

  OR

  * **Code:** 401 UNAUTHORIZED <br />
    **Content:** `{ error : "You are unauthorized to make this request." }`
	
###

* **URL**

  /employees

* **Method:**

  `GET`
  
*  **URL Params**

	/id

* **Data Params**

	None

* **Success Response:**

  * **Code:** 200 <br />
    **Content:** 
				{
					"id": 5,
					"_name": "Jani",
					"pos": "felszolgalo"
				}
 
* **Error Response:**

  * **Code:** 404 NOT FOUND <br />
    **Content:** `{ error : "Error" }`

  OR

  * **Code:** 401 UNAUTHORIZED <br />
    **Content:** `{ error : "You are unauthorized to make this request." }`

###

* **URL**

  /employees

* **Method:**

  `DELETE`
  
*  **URL Params**

	/id

* **Data Params**

	None

* **Success Response:**

  * **Code:** 200 <br />
    **Content:** None
 
* **Error Response:**

  * **Code:** 404 NOT FOUND <br />
    **Content:** `{ error : "Error" }`

  OR

  * **Code:** 401 UNAUTHORIZED <br />
    **Content:** `{ error : "You are unauthorized to make this request." }`
	
* **URL**

  /foods

* **Method:**

  `GET`
  
*  **URL Params**

	None

* **Data Params**

	None

* **Success Response:**

  * **Code:** 200 <br />
    **Content:** [
					  {
						"id": 1,
						"title": "GulyĂˇsleves",
						"imgUrl": "saddsaasd",
						"description": "Klasszikus magyar gulyĂˇsleves, sertĂ©skarajbĂłl, sĂˇrgaburgonyĂˇbĂłl.",
						"category": "Leves",
						"price": 1190,
						"is_available": true,
						"created_at": "2019-10-19T13:34:33.946",
						"updated_at": "2019-10-19T13:34:33.946"
					  },
					  {
						"id": 2,
						"title": "Cordon blue hasĂˇbburgyonĂˇval",
						"imgUrl": "saddsaasd",
						"description": "RĂˇntott pulykamell sajttal Ă©s sonkĂˇval tĂ¶ltve, egyedi fĹ±szerezĂ©ssel.",
						"category": "SzĂˇrnyas",
						"price": 2390,
						"is_available": false,
						"created_at": "2019-10-19T13:34:33.946",
						"updated_at": "2019-10-19T13:34:33.946"
					  },
					  {
						"id": 3,
						"title": "Kereszti KrisztiĂˇn KalĂˇcsa",
						"imgUrl": "saddsaasd",
						"description": "HĂ­res informatikai kĂĽlĂ¶nlegessĂ©g, melyet a kedvenc fejlesztĹ‘i kĂ¶rnyezetĂĽnk - a NetBeans - hasznĂˇlata kĂ¶zben ajĂˇnlunk fogyasztani.",
						"category": "Desszert",
						"price": 790,
						"is_available": true,
						"created_at": "2019-10-19T13:34:33.946",
						"updated_at": "2019-10-19T13:34:33.946"
					  },
					  {
						"id": 4,
						"title": "TĂ¶mlĹ‘ssajtos rĂˇntot pĂˇrizsi",
						"imgUrl": "saddsaasd",
						"description": "A magyar youtube legnĂ©pszerĹ±bb Ă©tele, melyet minden igaz magyarnak kikell prĂłbĂˇlnia legalĂˇbb egyszer.",
						"category": "990",
						"price": 100,
						"is_available": true,
						"created_at": "2019-10-19T13:34:33.946",
						"updated_at": "2019-10-19T13:34:33.946"
					  },
					  {
						"id": 5,
						"title": "DĂ©li bĂĽfĂ© szendvics",
						"imgUrl": "saddsaasd",
						"description": "Klasszikus mirelithĂşsos csoda, melyet 3 napja kĂ©szĂ­tettĂĽnk vacsorĂˇra, de rĂˇnk maradt.",
						"category": "9990",
						"price": 100,
						"is_available": true,
						"created_at": "2019-10-19T13:34:33.946",
						"updated_at": "2019-10-19T13:34:33.946"
					  }
					]
 
* **Error Response:**

  * **Code:** 404 NOT FOUND <br />
    **Content:** `{ error : "Error" }`

  OR

  * **Code:** 401 UNAUTHORIZED <br />
    **Content:** `{ error : "You are unauthorized to make this request." }`
	
###

* **URL**

  /foods

* **Method:**

  `GET`
  
*  **URL Params**

	/id

* **Data Params**

	None

* **Success Response:**

  * **Code:** 200 <br />
    **Content:** 
				  {
					"id": 5,
					"title": "DĂ©li bĂĽfĂ© szendvics",
					"imgUrl": "saddsaasd",
					"description": "Klasszikus mirelithĂşsos csoda, melyet 3 napja kĂ©szĂ­tettĂĽnk vacsorĂˇra, de rĂˇnk maradt.",
					"category": "9990",
					"price": 100,
					"is_available": true,
					"created_at": "2019-10-19T13:34:33.946",
					"updated_at": "2019-10-19T13:34:33.946"
				  }
 
* **Error Response:**

  * **Code:** 404 NOT FOUND <br />
    **Content:** `{ error : "Error" }`

  OR

  * **Code:** 401 UNAUTHORIZED <br />
    **Content:** `{ error : "You are unauthorized to make this request." }`

###

* **URL**

  /foods

* **Method:**

  `POST`
  
*  **URL Params**

	None

* **Data Params**

	
	body: 
	  {
		"title": "DĂ©li bĂĽfĂ© szendvics",
		"imgUrl": "saddsaasd",
		"description": "Klasszikus mirelithĂşsos csoda, melyet 3 napja kĂ©szĂ­tettĂĽnk vacsorĂˇra, de rĂˇnk maradt.",
		"category": "9990",
		"price": 100,
		"is_available": true,
		"created_at": "2019-10-19T13:34:33.946",
		"updated_at": "2019-10-19T13:34:33.946"
	  }

* **Success Response:**

  * **Code:** 200 <br />
    **Content:** 
			  {
				"id": 5,
				"title": "DĂ©li bĂĽfĂ© szendvics",
				"imgUrl": "saddsaasd",
				"description": "Klasszikus mirelithĂşsos csoda, melyet 3 napja kĂ©szĂ­tettĂĽnk vacsorĂˇra, de rĂˇnk maradt.",
				"category": "9990",
				"price": 100,
				"is_available": true,
				"created_at": "2019-10-19T13:34:33.946",
				"updated_at": "2019-10-19T13:34:33.946"
			  }
		 
* **Error Response:**

  * **Code:** 404 NOT FOUND <br />
    **Content:** `{ error : "Error" }`

  OR

  * **Code:** 401 UNAUTHORIZED <br />
    **Content:** `{ error : "You are unauthorized to make this request." }`###

* **URL**

  /foods

* **Method:**

  `PUT`
  
*  **URL Params**

	/id

* **Data Params**

	
	body: 
		  {
			"title": "DĂ©li bĂĽfĂ© szendvics",
			"imgUrl": "saddsaasd",
			"description": "Klasszikus mirelithĂşsos csoda, melyet 3 napja kĂ©szĂ­tettĂĽnk vacsorĂˇra, de rĂˇnk maradt.",
			"category": "9990",
			"price": 100,
			"is_available": true,
			"created_at": "2019-10-19T13:34:33.946",
			"updated_at": "2019-10-19T13:34:33.946"
		  }

* **Success Response:**

  * **Code:** 200 <br />
    **Content:** 
			  {
				"id": 5,
				"title": "DĂ©li bĂĽfĂ© szendvics",
				"imgUrl": "saddsaasd",
				"description": "Klasszikus mirelithĂşsos csoda, melyet 3 napja kĂ©szĂ­tettĂĽnk vacsorĂˇra, de rĂˇnk maradt.",
				"category": "9990",
				"price": 100,
				"is_available": true,
				"created_at": "2019-10-19T13:34:33.946",
				"updated_at": "2019-10-19T13:34:33.946"
			  }
		 
* **Error Response:**

  * **Code:** 404 NOT FOUND <br />
    **Content:** `{ error : "Error" }`

  OR

  * **Code:** 401 UNAUTHORIZED <br />
    **Content:** `{ error : "You are unauthorized to make this request." }`###
	
###

* **URL**

  /foods

* **Method:**

  `DELETE`
  
*  **URL Params**

	/id

* **Data Params**

	None

* **Success Response:**

  * **Code:** 200 <br />
    **Content:** None
 
* **Error Response:**

  * **Code:** 404 NOT FOUND <br />
    **Content:** `{ error : "Error" }`

  OR

  * **Code:** 401 UNAUTHORIZED <br />
    **Content:** `{ error : "You are unauthorized to make this request." }`
	
* **URL**

  /guests

* **Method:**

  `GET`
  
*  **URL Params**

	None

* **Data Params**

	None

* **Success Response:**

  * **Code:** 200 <br />
    **Content:** 	[
					  {
						"id": 1,
						"bill": "8765",
						"code": null
					  },
					  {
						"id": 2,
						"bill": "3650",
						"code": null
					  },
					  {
						"id": 3,
						"bill": "8765",
						"code": "aezakmi"
					  }
					]
 
* **Error Response:**

  * **Code:** 404 NOT FOUND <br />
    **Content:** `{ error : "Error" }`

  OR

  * **Code:** 401 UNAUTHORIZED <br />
    **Content:** `{ error : "You are unauthorized to make this request." }`
	
###

* **URL**

  /guests

* **Method:**

  `GET`
  
*  **URL Params**

	/id

* **Data Params**

	None

* **Success Response:**

  * **Code:** 200 <br />
    **Content:** 
				  {
					"id": 3,
					"bill": "8765",
					"code": "aezakmi"
				  }
 
* **Error Response:**

  * **Code:** 404 NOT FOUND <br />
    **Content:** `{ error : "Error" }`

  OR

  * **Code:** 401 UNAUTHORIZED <br />
    **Content:** `{ error : "You are unauthorized to make this request." }`

###

* **URL**

  /guests

* **Method:**

  `POST`
  
*  **URL Params**

	None

* **Data Params**

				  {
					"bill": "8765",
					"code": "aezakmi"
				  }

* **Success Response:**

  * **Code:** 200 <br />
    **Content:** 
				  {
					"id": 3,
					"bill": "8765",
					"code": "aezakmi"
				  }
		 
* **Error Response:**

  * **Code:** 404 NOT FOUND <br />
    **Content:** `{ error : "Error" }`

  OR

  * **Code:** 401 UNAUTHORIZED <br />
    **Content:** `{ error : "You are unauthorized to make this request." }`###

* **URL**

  /guests

* **Method:**

  `PUT`
  
*  **URL Params**

	/id

* **Data Params**

	
	body: 
	  {
		"bill": "8765",
		"code": "aezakmi"
	  }

* **Success Response:**

  * **Code:** 200 <br />
    **Content:** 
			  {
				"id": 3,
				"bill": "8765",
				"code": "aezakmi"
			  }
* **Error Response:**

  * **Code:** 404 NOT FOUND <br />
    **Content:** `{ error : "Error" }`

  OR

  * **Code:** 401 UNAUTHORIZED <br />
    **Content:** `{ error : "You are unauthorized to make this request." }`###
	
###

* **URL**

  /guests

* **Method:**

  `DELETE`
  
*  **URL Params**

	/id

* **Data Params**

	None

* **Success Response:**

  * **Code:** 200 <br />
    **Content:** None
 
* **Error Response:**

  * **Code:** 404 NOT FOUND <br />
    **Content:** `{ error : "Error" }`

  OR

  * **Code:** 401 UNAUTHORIZED <br />
    **Content:** `{ error : "You are unauthorized to make this request." }`
	
* **URL**

###

  /orders

* **Method:**

  `GET`
  
*  **URL Params**

	None

* **Data Params**

	None

* **Success Response:**

  * **Code:** 200 <br />
    **Content:** 	[
						  {
							"id": 1,
							"order_id": 1,
							"title": "Staropramen",
							"price": 690,
							"created_at": "2019-10-19T13:34:33.962",
							"updated_at": "2019-10-19T13:34:33.962"
						  },
						  {
							"id": 2,
							"order_id": 2,
							"title": "GulyĂˇsleves",
							"price": 1190,
							"created_at": "2019-10-19T13:34:33.962",
							"updated_at": "2019-10-19T13:34:33.962"
						  },
						  {
							"id": 3,
							"order_id": 3,
							"title": "Cordon Blue",
							"price": 2390,
							"created_at": "2019-10-19T13:34:33.962",
							"updated_at": "2019-10-19T13:34:33.962"
						  }
					]
 
* **Error Response:**

  * **Code:** 404 NOT FOUND <br />
    **Content:** `{ error : "Error" }`

  OR

  * **Code:** 401 UNAUTHORIZED <br />
    **Content:** `{ error : "You are unauthorized to make this request." }`
	
###

* **URL**

  /orders

* **Method:**

  `GET`
  
*  **URL Params**

	/id

* **Data Params**

	None

* **Success Response:**

  * **Code:** 200 <br />
    **Content:** 
				  {
					"id": 3,
					"order_id": 3,
					"title": "Cordon Blue",
					"price": 2390,
					"created_at": "2019-10-19T13:34:33.962",
					"updated_at": "2019-10-19T13:34:33.962"
				  }
* **Error Response:**

  * **Code:** 404 NOT FOUND <br />
    **Content:** `{ error : "Error" }`

  OR

  * **Code:** 401 UNAUTHORIZED <br />
    **Content:** `{ error : "You are unauthorized to make this request." }`

###

* **URL**

  /orders

* **Method:**

  `POST`
  
*  **URL Params**

	None

* **Data Params**

				  {
					"order_id": 3,
					"title": "Cordon Blue",
					"price": 2390,
					"created_at": "2019-10-19T13:34:33.962",
					"updated_at": "2019-10-19T13:34:33.962"
				  }

* **Success Response:**

  * **Code:** 200 <br />
    **Content:** 
				  {
					"id": 3,
					"order_id": 3,
					"title": "Cordon Blue",
					"price": 2390,
					"created_at": "2019-10-19T13:34:33.962",
					"updated_at": "2019-10-19T13:34:33.962"
				  }
		 
* **Error Response:**

  * **Code:** 404 NOT FOUND <br />
    **Content:** `{ error : "Error" }`

  OR

  * **Code:** 401 UNAUTHORIZED <br />
    **Content:** `{ error : "You are unauthorized to make this request." }`###

* **URL**

  /orders

* **Method:**

  `PUT`
  
*  **URL Params**

	/id

* **Data Params**

	
	body: 
		  {
			"id": 3,
			"order_id": 3,
			"title": "Cordon Blue",
			"price": 2390,
			"created_at": "2019-10-19T13:34:33.962",
			"updated_at": "2019-10-19T13:34:33.962"
		  }

* **Success Response:**

  * **Code:** 200 <br />
    **Content:** 
			  {
				"id": 3,
				"order_id": 3,
				"title": "Cordon Blue",
				"price": 2390,
				"created_at": "2019-10-19T13:34:33.962",
				"updated_at": "2019-10-19T13:34:33.962"
			  }
* **Error Response:**

  * **Code:** 404 NOT FOUND <br />
    **Content:** `{ error : "Error" }`

  OR

  * **Code:** 401 UNAUTHORIZED <br />
    **Content:** `{ error : "You are unauthorized to make this request." }`###
	
###

* **URL**

  /orders

* **Method:**

  `DELETE`
  
*  **URL Params**

	/id

* **Data Params**

	None

* **Success Response:**

  * **Code:** 200 <br />
    **Content:** None
 
* **Error Response:**

  * **Code:** 404 NOT FOUND <br />
    **Content:** `{ error : "Error" }`

  OR

  * **Code:** 401 UNAUTHORIZED <br />
    **Content:** `{ error : "You are unauthorized to make this request." }`
	
