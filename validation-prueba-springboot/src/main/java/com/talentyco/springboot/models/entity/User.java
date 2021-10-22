package com.talentyco.springboot.models.entity;

import org.springframework.format.annotation.DateTimeFormat;

import javax.persistence.*;
import javax.validation.constraints.*;
import java.io.Serializable;
import java.util.Date;

/**
 * Java Title
 *
 * @author Emmanuel Nieto Muñoz
 * @version: xx/10/2021/1.0
 * @see <a href = "" />  </a>
 */

@Entity
@Table(name = "users")
public class User implements Serializable {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @NotBlank
    @Size(min = 3, max = 50, message = "Ingrese su nombre por favor")
    private String nombre;

    @NotBlank
    @Size(min = 3, max = 50, message = "Ingrese su apellido por favor")
    private String apellido;

    @NotBlank
    @Email(message = "Ingrese un correo electronico correcto")
    private String email;

    @NotBlank
    @Size(min = 8, max = 15)
    private String password;

    @NotBlank
    private String profesion;

    @Size(max = 1024)
    @Lob
    private String nota;

    @NotBlank
    private String sexo;

    @DateTimeFormat(pattern = "yyyy-mm-dd")
    private Date nacimiento;

    @AssertTrue
    private boolean estadoCivil;

    @Min(value = 10_000)
    @Max(value = 100_000_000)
    private long sueldo;




}
