package com.tplp3.reviews.utility;

import java.util.ArrayList;
import java.util.Calendar;
import java.util.Date;
import java.util.Iterator;
import java.util.List;

import org.springframework.boot.SpringApplication;

import com.tplp3.reviews.TpLp3Application;
import com.tplp3.reviews.domain.User;
import com.tplp3.reviews.repository.UserRepository;


public class Notifications {
	private static UserRepository userRepository;
	
	public static void main(String[] args) {
		NotifyExpireUsers();
	}
    public static Date addDays(Date date, int days)
    {
        Calendar cal = Calendar.getInstance();
        cal.setTime(date);
        cal.add(Calendar.DATE, days); //minus number would decrement the days
        return cal.getTime();
    }
	public static List<User> ExpireCredentialUsers(){
		Date today=new Date(); 
		List<User> users = new ArrayList<>();
		Iterator<User> iterator = userRepository.findAll().iterator();
		while (iterator.hasNext()) {
			Date temp=addDays(iterator.next().getCredentialDate(),90); //Le sumamos 90 dias de la ultima vez que se actualizo los credemnciales
			if(today.compareTo(temp)<=0) //Si ya paso la fecha
				users.add(iterator.next());//Almacenamos en una lista
		}
		return users;
		
		
	}
	
	public static void NotifyExpireUsers() {
		List<User> users = ExpireCredentialUsers();
		for (User user : users) {
		    System.out.println(user.getUsername() + " Los credenciales estan por expirar"); 
		}
	}

}
