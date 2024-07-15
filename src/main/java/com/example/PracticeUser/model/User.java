package com.example.PracticeUser.model;


import jakarta.persistence.*;
import lombok.*;

@Entity
@Data
@Table(name="usuarios")
@NoArgsConstructor
@AllArgsConstructor
@Builder
@Getter
@Setter
@ToString
public class User {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long empId;
    private String name;
    private String phone;
    private String street;
    private String colony;
    private Integer zip;

}
