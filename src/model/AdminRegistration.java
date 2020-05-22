package model;

public class AdminRegistration {
	

			public String Name;
			public String email;
			public String password;
			public String confirmPassword;
			public String mobile;
			public AdminRegistration(){}
			public AdminRegistration(String Name, String email, String password, String confirmPassword, String mobile) 
			{
				this.Name = Name;
				this.email = email;
				this.password = password;
				this.confirmPassword = confirmPassword;
				this.mobile = mobile;
			}

			public String getName() {
				return Name;
			}

			public void setName(String Name) {
				this.Name = Name;
			}

			public String getEmail() {
				return email;
			}

			public void setEmail(String email) {
				this.email = email;
			}

			public String getPassword() {
				return password;
			}

			public void setPassword(String password) {
				this.password = password;
			}

			public String getConfirmPassword() {
				return confirmPassword;
			}

			public void setConfirmPassword(String confirmPassword) {
				this.confirmPassword = confirmPassword;
			}

			public String getMobile() {
				return mobile;
			}

			public void setMobile(String mobile) {
				this.mobile = mobile;
			}
		}



