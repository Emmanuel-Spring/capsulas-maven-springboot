package com.talentyco.springboot.models.entity;

import javax.persistence.*;
import javax.validation.constraints.Email;
import javax.validation.constraints.NotBlank;
import javax.validation.constraints.NotEmpty;
import javax.validation.constraints.Size;
import java.io.Serializable;

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
    private long id;

    // User nam should not be null or empty
    // User name should have at least 2 characters

    @Column(name = "name_users", nullable = false)
    @NotEmpty
    @Size(min = 2, message = "Nombre de usuario debe tener almenos 2 caracteres")
    private String nombre;

    @Column(name = "last_name_users", nullable = false)
    @NotEmpty
    @Size(min = 2, message = "Apellido de usuario debe tener almenos 2 caracteres")
    private String apellido;

    // email should be a valid email format
    // email should not be or empty

    @NotEmpty
    @Email
    private String email;

    // password should not be null or empty
    // password should have at least 8 characters
    @NotEmpty
    @Size(min = 8, message = "password debe tener 8 caracteres")
    private String password;

    public User() {
    }

    public User(String nombre, String apellido, String email, String password) {
        this.nombre = nombre;
        this.apellido = apellido;
        this.email = email;
        this.password = password;
    }

    public long getId() {
        return id;
    }

    public void setId(long id) {
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
}
