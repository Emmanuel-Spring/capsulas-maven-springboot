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

    public User() {
    }

    public User(String nombre, String apellido, String email, String password, String profesion, String nota, String sexo, Date nacimiento, boolean estadoCivil, long sueldo) {
        this.nombre = nombre;
        this.apellido = apellido;
        this.email = email;
        this.password = password;
        this.profesion = profesion;
        this.nota = nota;
        this.sexo = sexo;
        this.nacimiento = nacimiento;
        this.estadoCivil = estadoCivil;
        this.sueldo = sueldo;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getApellido() {
        return apellido;
    }

    public void setApellido(String apellido) {
        this.apellido = apellido;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getProfesion() {
        return profesion;
    }

    public void setProfesion(String profesion) {
        this.profesion = profesion;
    }

    public String getNota() {
        return nota;
    }

    public void setNota(String nota) {
        this.nota = nota;
    }

    public String getSexo() {
        return sexo;
    }

    public void setSexo(String sexo) {
        this.sexo = sexo;
    }

    public Date getNacimiento() {
        return nacimiento;
    }

    public void setNacimiento(Date nacimiento) {
        this.nacimiento = nacimiento;
    }

    public boolean isEstadoCivil() {
        return estadoCivil;
    }

    public void setEstadoCivil(boolean estadoCivil) {
        this.estadoCivil = estadoCivil;
    }

    public long getSueldo() {
        return sueldo;
    }

    public void setSueldo(long sueldo) {
        this.sueldo = sueldo;
    }

    @Override
    public String toString() {
        return "User{" +
                "id=" + id +
                ", nombre='" + nombre + '\'' +
                ", apellido='" + apellido + '\'' +
                ", email='" + email + '\'' +
                ", password='" + password + '\'' +
                ", profesion='" + profesion + '\'' +
                ", nota='" + nota + '\'' +
                ", sexo='" + sexo + '\'' +
                ", nacimiento=" + nacimiento +
                ", estadoCivil=" + estadoCivil +
                ", sueldo=" + sueldo +
                '}';
    }
}
