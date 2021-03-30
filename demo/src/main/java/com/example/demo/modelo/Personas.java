
package com.example.demo.modelo;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@Entity
public class Personas {
 @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
  private Long id;
  private String manuel;
  private String antonio;
  private String arita;
  private String portillo;   
}
