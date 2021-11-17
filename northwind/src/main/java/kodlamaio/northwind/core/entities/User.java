package kodlamaio.northwind.core.entities;

import com.sun.istack.NotNull;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;
import javax.validation.constraints.Email;
import javax.validation.constraints.NotBlank;

@Entity//Veri tabanıı nesnesi
@Data
@Table(name="users")
@AllArgsConstructor
@NoArgsConstructor
public class User {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name="id")
    private int id;

    @Email
    @NotBlank//Boş geçilmesini istemiyorum " "
    @NotNull
    @Column(name="email")
    private String email;

    @NotBlank
    @NotNull
    @Column(name="password")
    private String password;
}
