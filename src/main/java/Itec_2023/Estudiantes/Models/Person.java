package Itec_2023.Estudiantes.Models;

import lombok.Getter;
import lombok.Setter;
import jakarta.persistence.*;


@Table(name="person")
@Entity
@Getter
@Setter
public class Person//Persona
{
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(name="id")
    private long idPerson;
    private String name;
    private String lastName;
    private String dni;
    private String phone;
    private String email;
    private String address;
    /*
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
    */
}
