package member;

import java.io.Serializable;

public class MemberDTO implements Serializable , Comparable<MemberDTO> {

	private String name;
	private int age;
	private String phone;
	private String address;
	
	public MemberDTO(String name, int age, String phone, String address) {
		super();
		this.name = name;
		this.age = age;
		this.phone = phone;
		this.address = address;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}

	public String getPhone() {
		return phone;
	}

	public void setPhone(String phone) {
		this.phone = phone;
	}

	public String getAddress() {
		return address;
	}

	public void setAddress(String address) {
		this.address = address;
	}
	
	@Override
	public String toString() {
		return name+"\t"+age+"\t"+phone+"\t"+address;
		
	}
	@Override
	public int compareTo(MemberDTO m) { //비교대상자(this)가 더 크면(<) -1, 같다면(==) 0, 작으면(>) 1을 반환시켜줍니다.
		if(this.age < m.age) return 1;
		else if(this.age > m.age) return -1;
		else return 0;
	}
}
