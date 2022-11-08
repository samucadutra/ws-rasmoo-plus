package com.client.ws.rasmooplus.model;

import lombok.*;
import org.hibernate.annotations.GeneratorType;

import javax.persistence.*;
import java.io.Serializable;

@Entity
@Table(name = "user_type")
@Data
@Builder
@NoArgsConstructor
@AllArgsConstructor
public class UserType implements Serializable {

    @Id
    @Column(name = "user_type_id")
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;

    private String name;

    private String description;
}
