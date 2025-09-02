package co.com.bancolombia.model.user;
import co.com.bancolombia.model.role.Role;
import lombok.*;

import java.math.BigDecimal;

@Data
public class User {
    private Long id;
    private String firstName;
    private String lastName;
    private String email;
    private String identification;
    private String phoneNumber;
    private BigDecimal baseSalary;
    private Role idRole;
}
