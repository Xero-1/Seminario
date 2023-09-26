package Itec_2023.Estudiantes.Mappers;

import Itec_2023.Estudiantes.Models.Person;
import Itec_2023.Estudiantes.Dtos.PersonRequest;
import org.springframework.stereotype.Service;

@Service
public class PersonMapper
{
    public Person personRequestToPerson(PersonRequest personRequest)
    {
        Person person=new Person();
        person.setIdPerson(personRequest.getIdPerson());
        person.setName(personRequest.getName());
        person.setLastName(personRequest.getLastName());
        person.setDni(personRequest.getDni());
        person.setPhone(personRequest.getPhone());
        person.setAddress(personRequest.getAddress());

        return person;
    }
}
