package model;

public class UserLogin {

	
		String Name;
		String Password;
		
		
		UserLogin(){}
		UserLogin(String name, String password){
			this.Name=name;
			this.Password=password;
		}
		public String getName() {
			return Name;
		}
		public void setName(String name) {
			Name = name;
		}
		public String getPassword() {
			return Password;
		}
		public void setPassword(String password) {
			Password = password;
		}
		
		

}
