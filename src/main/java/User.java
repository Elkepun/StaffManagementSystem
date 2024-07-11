
public class User {
		protected String name;
		protected String password;
		protected String email;
		protected String phone;
		protected String occupation;
		protected String language;
		public User(String name, String password, String email, String phone, String occupation, String language) {
			super();
			this.name = name;
			this.password = password;
			this.email = email;
			this.phone = phone;
			this.occupation = occupation;
			this.language = language;
		}
		public String getName() {
			return name;
		}
		public void setName(String name) {
			this.name = name;
		}
		public String getPassword() {
			return password;
		}
		public void setPassword(String password) {
			this.password = password;
		}
		public String getEmail() {
			return email;
		}
		public void setEmail(String email) {
			this.email = email;
		}
		public String getPhone() {
			return phone;
		}
		public void setPhone(String phone) {
			this.phone = phone;
		}
		public String getOccupation() {
			return occupation;
		}
		public void setOccupation(String occupation) {
			this.occupation = occupation;
		}
		public String getLanguage() {
			return language;
		}
		public void setLanguage(String language) {
			this.language = language;
		}
}
