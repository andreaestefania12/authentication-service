package co.com.bancolombia.r2dbc.entity;


import lombok.Data;
import org.springframework.data.annotation.Id;
import org.springframework.data.relational.core.mapping.Table;

import java.math.BigDecimal;

@Data
@Table(name = "users")
public class UserEntity {
    @Id
    private Long id;
    private String firstName;
    private String lastName;
    private String email;
    private String identification;
    private String phoneNumber;
    private BigDecimal baseSalary;
    private Long idRole;
}
