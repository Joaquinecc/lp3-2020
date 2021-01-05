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
#### put /admin/id
#### delete /admin/id
#### get /admin
#### get by id /admin/{id_user}
### Curador

#### post /curador
#### put /curador/id
#### delete /curador/id
#### get /curador
#### get by id /curador/{id_user}

### UserPremium
Extends from user <br/>
Campos: ArrayList <Long> PromotionsId.  Listas de id de las promociones asignada al usuario premium

#### post /user_premium
#### put /user_premium/id
#### delete /user_premium/id
#### delete /user_premium/id
#### get /user_premium
#### get by id /user_premium/{id_user}

### Spectator
Extends from user <br/>

#### post /spectator
#### put /spectator/id
#### delete /spectator/id
#### get /spectator
#### get by id /spectator/{id_user}

### ReviewEntity
Campos 	protected String site;	protected String Name;

#### post /entityReview
#### put /entityReview/id
#### delete /entityReview/id
#### get /entityReview
#### get by id /entityReview/{id}

### Movie
Extend from content
Campos:
protected String[] directors;
	protected String [] Actors;


#### post /movie
#### put /movie/{content_id}
### delete /movie/{content_id}
#### get /movie
#### get by id /movie/{content_id}


### Review 
campos :	protected Long content_id;
	protected Long revEntity_id;
#### post /review
#### put /review/id
### delete /review/id
#### get /review
#### get by id /review/{id}
#### get by ReviewEntity /review/site/{reviewName}


### Promotion
campos:	protected String name;
	protected String site;
	protected boolean isvalid

#### post /promotion
#### put /promotion/id
### delete /promotion/id
#### get /promotion
#### get by id /promotion/{id}

### Cupons
Extended from Promotion <br/>
campos:int Qavailable;

#### post /cupons
#### put /cupons/id
### delete /cupons/id
#### get /cupons
#### get by id /cupons/{id}


### Discount
Extended from Promotion <br/>
campos: float discount;

#### post /discount
#### put /discount/id
### delete /discount/id
#### get /discount
#### get by id /discount/{id}

### Preaccess
Extended from Promotion <br/>
Campos:Date dateofPremiere; Movie movie;
  
#### post /preaccess
#### put /preaccess/id
### delete /preaccess/id
#### get /preaccess
#### get by id /preaccess/{id}



