package Itec_2023.Estudiantes.Models;

public class Person//Persona
{
    private long idPerson;
    private String name;
    private String lastName;
    private String dni;
    private String phone;
    private String email;
    private String address;
    //Constructors
    public Person()
    {
        this.idPerson=0;
        this.name="";
        this.lastName="";
        this.dni="";
        this.phone="";
        this.email="";
        this.address="";
    }
    public Person(long idPerson,String name,String lastName,String dni,String phone,String email,String address)
    {
        this.idPerson=idPerson;
        this.name=name;
        this.lastName=lastName;
        this.dni=dni;
        this.phone=phone;
        this.email=email;
        this.address=address;
    }
    //Getters and setters
    public long getIdPerson(){return this.idPerson;}
    public String getName(){return this.name;}
    public String getLastName(){return this.lastName;}
    public String getDni(){return this.dni;}
    public String getPhone(){return this.phone;}
    public String getEmail(){return this.email;}
    public String getAddress(){return this.address;}
    public void setIdPerson(long idPerson){this.idPerson=idPerson;}
    public void setName(String name){this.name=name;}
    public void setLastName(String lastName){this.lastName=lastName;}
    public void setDni(String dni){this.dni=dni;}
    public void setPhone(String phone){this.phone=phone;}
    public void setAddress(String address){this.address=address;}


}
