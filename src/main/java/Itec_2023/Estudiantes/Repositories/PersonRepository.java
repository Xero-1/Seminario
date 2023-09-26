package Itec_2023.Estudiantes.Repositories;

import Itec_2023.Estudiantes.Models.Person;
import org.springframework.data.jpa.repository.JpaRepository;

public interface PersonRepository extends JpaRepository<Person, Long>
{

}
