package co.com.bancolombia.r2dbc.entity;


import lombok.Data;
import org.springframework.data.annotation.Id;
import org.springframework.data.relational.core.mapping.Column;
import org.springframework.data.relational.core.mapping.Table;

import java.math.BigDecimal;

@Data
@Table(name = "users")
public class UserEntity {
    @Id
    private Long id;

    @Column("first_name")
    private String firstName;

    @Column("last_name")
    private String lastName;

    @Column("email")
    private String email;

    @Column("identification")
    private String identification;

    @Column("phone_number")
    private String phoneNumber;

    @Column("base_salary")
    private BigDecimal baseSalary;

    @Column("role_id")
    private Long idRole;
}
