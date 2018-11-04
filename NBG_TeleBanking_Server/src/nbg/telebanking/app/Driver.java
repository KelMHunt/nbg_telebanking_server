package nbg.telebanking.app;

import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Date;

import nbg.telebanking.database.DBProvider;
import nbg.telebanking.models.User;

public class Driver {

	public static void main(String[] args) {
		 DBProvider db = DBProvider.getInstance();
		 DateFormat dateFormat = new SimpleDateFormat("yyyy/MM/dd HH:mm:ss");
		 Date date = new Date();
	     System.out.println(db.createUser(new User("test", "test", "email", "pass", date)));
	}

}
