package springmvcsearch;

import java.util.Date;
import java.util.List;

public class Student {
	private String email;
	private String password;
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
	private String name;
	private Long id;
	private Date date;
	private List<String> courses;
	private String type;
	

	@Override
	public String toString() {
		return "Student [email=" + email + ", password=" + password + ", name=" + name + ", id=" + id + ", date=" + date
				+ ", courses=" + courses + ", type=" + type + ",]";
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	} 
	public Long getId() {
		return id;
	}
	public void setId(Long id) {
		this.id = id;
	}
	public Date getDate() {
		return date;
	}
	public void setDate(Date date) {
		this.date = date;
	}
	public List<String> getCourses() {
		return courses;
	}
	public void setCourses(List<String> courses) {
		this.courses = courses;
	}
	public String getType() {
		return type;
	}
	public void setType(String type) {
		this.type = type;
	}
}
