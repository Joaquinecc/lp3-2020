# lp3-2020
/api*
## Usuarios
Campos:<br/>
username:String<br/>
email:String<br/>
passw:String<br/>
  <br/>
#### post /user
#### put /user/id
#### delete /user/id
#### get /user
#### get by id /user/{id_user}
 <br/> <br/>
### Admin
Extends from user
 <br/>
#### post /admin
#### put /admin/{id_user}
#### delete /admin/{id_user}
#### get /admin
#### get by id /admin/{id_user}
 <br/> <br/>
### Curador
Extends from user <br/>
 <br/>
#### post /curador
#### put /curador/{id_user}
#### delete /curador/{id_user}
#### get /curador
#### get by id /curador/{id_user}
 <br/> <br/>
### UserPremium
Extends from user <br/>
Campos:<br/>
promotionsId:Array[Long] .  Listas de id de las promociones asignada al usuario premium
 <br/>
#### post /user_premium
#### put /user_premium/{id_user}
#### delete /user_premium/{id_user}
#### delete /user_premium/{id_user}
#### get /user_premium
#### get by id /user_premium/{id_user}
 <br/> <br/>
### Spectator
Extends from user <br/>
"historialReviewId":Array[Long] // Id de los reviews que consumio el espectador <br/>
 <br/>
#### post /spectator
#### put /spectator/{id_user}
#### delete /spectator/{id_user}
#### get /spectator
#### get by id /spectator/{id_user}
 <br/> <br/>
### ReviewEntity
Campos:<br/>
site:String<br/>
Name:String<br/>
 <br/> 
#### post /entityReview
#### put /entityReview/{id}
#### delete /entityReview/{id}
#### get /entityReview
#### get by id /entityReview/{id}
 <br/> <br/>
### Content
Campos:<br/>
category:String <br/>
title:String <br/>
 <br/>

#### post /content
#### put /content/{content_id}
#### delete /content/{content_id}
#### get /content
#### get by id /content/{content_id}
 <br/> <br/>
### Movie
Extend from content
Campos:<br/>
directors: array(string )<br/>
Actors:array(string )<br/>

 <br/>
#### post /movie
#### put /movie/{content_id}
#### delete /movie/{content_id}
#### get /movie
#### get by id /movie/{content_id}

 <br/> <br/>
### Review 
Campos :	<br/>
content_id:Long <br/> --> Id del contenido al que se le hace el review
revEntity_id:Long <br/> --> La entidad que hace el revie
rating:Float --> El Puntaje <br/>
 <br/>
#### post /review
#### put /review/id
#### delete /review/id
#### get /review
#### get by id /review/{id}
#### get by ReviewEntity /review/site/{reviewName}

 <br/> <br/>
### Promotion
campos:	<br/>
name:String <br/>
site:String <br/>
isvalid:boolean<br/>
 <br/>
#### post /promotion
#### put /promotion/{promotion_id}
#### delete /promotion/{promotion_id}
#### get /promotion
#### get by id /promotion/{promotion_id}
 <br/> <br/>
### Cupons
Extended from Promotion <br/>
campos:<br/>
Qavailable:Long --> Cantidad de Cupones
 <br/>
#### post /cupons
#### put /cupons/{promotion_id}
#### delete /cupons/{promotion_id}
#### get /cupons
#### get by id /cupons/{promotion_id}
 <br/> <br/>

### Discount
Extended from Promotion <br/>
campos:<br/>
discount:Float<br/>
 <br/>
#### post /discount
#### put /discount/{promotion_id}
#### delete /discount/{promotion_id}
#### get /discount
#### get by id /discount/{promotion_id}
 <br/> <br/>
### Preaccess
Extended from Promotion <br/>
Campos:<br/>
dateofPremiere:Date <br/>
movie:Movie <br/>
 <br/>
#### post /preaccess
#### put /preaccess/{promotion_id}
#### delete /preaccess/{promotion_id}
#### get /preaccess
#### get by id /preaccess/{promotion_id}



