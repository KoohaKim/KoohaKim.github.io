package Class.Week4.Week4_0508;

public class User {
  String name;
  String phonenumber;   //왜  string? --> 01072212038  앞에 0 짤려서;
  int age;

  public User(String name, String phonenumber, int age) {
    this.name = name;
    this.phonenumber = phonenumber;
    this.age = age;
  }

  public User() {

  }
//GETTER
  public String getName() {
    return name;
  }
  public String getPhonenumber() {
    return phonenumber;
  }
  public int getAge() {
    return age;
  }
//SETTER
  public void setName(String name) {
    this.name = name;
  }
  public void setPhonenumber(String phonenumber) {
    this.phonenumber = phonenumber;
  }
  public void setAge(int age) {
    this.age = age;
  }



  boolean isAdult(){
    return age >=18;
  }
}
