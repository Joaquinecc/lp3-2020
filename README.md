# lp3-2020
/api*
## Usuarios
Campos:
String username;
String email;
String passw;
 
#### post /user
#### put /user/id
#### delete /user/id
#### get /user
#### get by id /user/{id_user}

### Admin
Extends from user

#### post /admin
#### put /admin/{id_user}
#### delete /admin/{id_user}
#### get /admin
#### get by id /admin/{id_user}

### Curador

#### post /curador
#### put /curador/{id_user}
#### delete /curador/{id_user}
#### get /curador
#### get by id /curador/{id_user}

### UserPremium
Extends from user <br/>
Campos: ArrayList <Long> PromotionsId.  Listas de id de las promociones asignada al usuario premium

#### post /user_premium
#### put /user_premium/{id_user}
#### delete /user_premium/{id_user}
#### delete /user_premium/{id_user}
#### get /user_premium
#### get by id /user_premium/{id_user}

### Spectator
Extends from user <br/>

#### post /spectator
#### put /spectator/{id_user}
#### delete /spectator/{id_user}
#### get /spectator
#### get by id /spectator/{id_user}

### ReviewEntity
Campos 	protected String site;	protected String Name;

#### post /entityReview
#### put /entityReview/{id}
#### delete /entityReview/{id}
#### get /entityReview
#### get by id /entityReview/{id}

### Movie
Campos:
String category;
String title;


#### post /content
#### put /content/{content_id}
#### delete /content/{content_id}
#### get /content
#### get by id /content/{content_id}

### Movie
Extend from content
Campos:
String[] directors;
String [] Actors;


#### post /movie
#### put /movie/{content_id}
#### delete /movie/{content_id}
#### get /movie
#### get by id /movie/{content_id}


### Review 
campos :	protected Long content_id;
	protected Long revEntity_id;
#### post /review
#### put /review/id
#### delete /review/id
#### get /review
#### get by id /review/{id}
#### get by ReviewEntity /review/site/{reviewName}


### Promotion
campos:	protected String name;
	protected String site;
	protected boolean isvalid

#### post /promotion
#### put /promotion/{promotion_id}
#### delete /promotion/{promotion_id}
#### get /promotion
#### get by id /promotion/{promotion_id}

### Cupons
Extended from Promotion <br/>
campos:int Qavailable;

#### post /cupons
#### put /cupons/{promotion_id}
#### delete /cupons/{promotion_id}
#### get /cupons
#### get by id /cupons/{promotion_id}


### Discount
Extended from Promotion <br/>
campos: float discount;

#### post /discount
#### put /discount/{promotion_id}
#### delete /discount/{promotion_id}
#### get /discount
#### get by id /discount/{promotion_id}

### Preaccess
Extended from Promotion <br/>
Campos:Date dateofPremiere; Movie movie;
  
#### post /preaccess
#### put /preaccess/{promotion_id}
#### delete /preaccess/{promotion_id}
#### get /preaccess
#### get by id /preaccess/{promotion_id}



