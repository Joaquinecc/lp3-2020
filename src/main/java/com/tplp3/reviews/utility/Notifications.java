package com.tplp3.reviews.utility;

import java.util.ArrayList;
import java.util.Calendar;
import java.util.Date;
import java.util.Iterator;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.tplp3.reviews.domain.User;
import com.tplp3.reviews.repository.UserRepository;

@Service
public class Notifications {
	@Autowired
	private UserRepository userRepository;
    public  Date addDays(Date date, int days)
    {
  
        Calendar cal = Calendar.getInstance();
        cal.setTime(date);
        cal.add(Calendar.DATE, days); //minus number would decrement the days
        return cal.getTime();
    }
	public  List<User> ExpireCredentialUsers(){
		Date today=new Date(); 
		List<User> users = new ArrayList<>();
		Iterator<User> iterator = userRepository.findAll().iterator();
		int i=0;
		while (iterator.hasNext()) {
			User tempUser=iterator.next();
			Date temp=addDays(tempUser.getCredentialDate(),30); //Le sumamos 30 dias de la ultima vez que se actualizo los credemnciales, cada 30 dias se deberian renovar	
			if(today.after(temp)) {//Si paso la fecha almacenamos en la lista
				users.add(tempUser);	
			}
		}
		return users;
		
		
	}
	
	public  List<User> NotifyExpireUsers() {
		List<User> users = ExpireCredentialUsers();
		
		for (User user : users) {
		    System.out.println(user.getUsername() + " sus credenciales estan por expirar"); 
		}
		return users;
	}

}
