package Assignment3;

public class Person {
	public String name;
    public String address;


    public String getName() { return name; }
    public String getAddress() { return address; }


    public void setAddress(String address) { this.address = address; }
    public void setName(String name) { this.name = name; }


    public String toString() {
        return "Person[name= " + this.getName() + ", address= " + this.getAddress();
    }

}
