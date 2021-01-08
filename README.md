# lp3-2020
/api*
## Usuarios
Campos:<br/>
username:String<br/>
email:String<br/>
passw:String<br/>
 
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
Campos:<br/>
promotionsId:Array[Long] .  Listas de id de las promociones asignada al usuario premium

#### post /user_premium
#### put /user_premium/{id_user}
#### delete /user_premium/{id_user}
#### delete /user_premium/{id_user}
#### get /user_premium
#### get by id /user_premium/{id_user}

### Spectator
Extends from user <br/>
"historialReviewId":Array[Long] // Id de los reviews que consumio el espectador
#### post /spectator
#### put /spectator/{id_user}
#### delete /spectator/{id_user}
#### get /spectator
#### get by id /spectator/{id_user}

### ReviewEntity
Campos:<br/>
site:String<br/>
Name:String<br/>

#### post /entityReview
#### put /entityReview/{id}
#### delete /entityReview/{id}
#### get /entityReview
#### get by id /entityReview/{id}

### Content
Campos:<br/>
category:String <br/>
title:String <br/>


#### post /content
#### put /content/{content_id}
#### delete /content/{content_id}
#### get /content
#### get by id /content/{content_id}

### Movie
Extend from content
Campos:<br/>
directors: array(string )<br/>
Actors:array(string )<br/>


#### post /movie
#### put /movie/{content_id}
#### delete /movie/{content_id}
#### get /movie
#### get by id /movie/{content_id}


### Review 
Campos :	<br/>
content_id:Long <br/>
revEntity_id:Long <br/>

#### post /review
#### put /review/id
#### delete /review/id
#### get /review
#### get by id /review/{id}
#### get by ReviewEntity /review/site/{reviewName}


### Promotion
campos:	<br/>
name:String <br/>
site:String <br/>
isvalid:boolean<br/>

#### post /promotion
#### put /promotion/{promotion_id}
#### delete /promotion/{promotion_id}
#### get /promotion
#### get by id /promotion/{promotion_id}

### Cupons
Extended from Promotion <br/>
campos:<br/>
Qavailable:Long --> Cantidad de Cupones

#### post /cupons
#### put /cupons/{promotion_id}
#### delete /cupons/{promotion_id}
#### get /cupons
#### get by id /cupons/{promotion_id}


### Discount
Extended from Promotion <br/>
campos:<br/>
discount:Float<br/>

#### post /discount
#### put /discount/{promotion_id}
#### delete /discount/{promotion_id}
#### get /discount
#### get by id /discount/{promotion_id}

### Preaccess
Extended from Promotion <br/>
Campos:<br/>
dateofPremiere:Date <br/>
movie:Movie <br/>
  
#### post /preaccess
#### put /preaccess/{promotion_id}
#### delete /preaccess/{promotion_id}
#### get /preaccess
#### get by id /preaccess/{promotion_id}



