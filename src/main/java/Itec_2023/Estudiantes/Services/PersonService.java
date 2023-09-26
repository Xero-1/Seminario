package Itec_2023.Estudiantes.Services;

import Itec_2023.Estudiantes.Models.Person;
import Itec_2023.Estudiantes.Dtos.PersonRequest;
import Itec_2023.Estudiantes.Repositories.PersonRepository;
import Itec_2023.Estudiantes.Mappers.PersonMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;

@Service
public class PersonService
{
    @Autowired
    private PersonRepository personRepository;
    @Autowired
    private PersonMapper personMapper;

    public ResponseEntity setPerson(PersonRequest personRequest)
    {
        Person person=personMapper.personRequestToPerson(personRequest);
        personRepository.save(person);
        return ResponseEntity.ok("Person saved: "+person.getName()+ "" +person.getLastName());
    }

}
