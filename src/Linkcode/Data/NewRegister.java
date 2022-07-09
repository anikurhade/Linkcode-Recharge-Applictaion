package Linkcode.Data;

public class NewRegister {
	private String UserName;
	private String Pass;
	
	private String Name;
	private String Email;
	private long PhoneNo;
	private String Address;
	private String City;
	private int Pincode;
	private String Gender;
	public NewRegister(String userName, String pass, String name, String email,  String address,
			String city, String gender) {
		UserName = userName;
		Pass = pass;
		Name = name;
		Email = email;
		Address = address;
		City = city;
		Gender = gender;
	}
	public String getUserName() {
		return UserName;
	}
	public String getPass() {
		return Pass;
	}
	public String getName() {
		return Name;
	}
	public String getEmail() {
		return Email;
	}
	public long getPhoneNo() {
		return PhoneNo;
	}
	public String getAddress() {
		return Address;
	}
	public String getCity() {
		return City;
	}
	public int getPincode() {
		return Pincode;
	}
	public String getGender() {
		return Gender;
	}
	
	
}
