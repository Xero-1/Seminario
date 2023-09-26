package Itec_2023.Estudiantes.Dtos;

import lombok.Data;

@Data
public class PersonRequest
{
    private long idPerson;
    private String name;
    private String lastName;
    private String dni;
    private String phone;
    private String email;
    private String address;
}
