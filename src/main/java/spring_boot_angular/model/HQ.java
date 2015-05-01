package spring_boot_angular.model;

import java.io.Serializable;
import java.time.LocalDateTime;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

@Entity
public class HQ implements Serializable {

    @Id
    @GeneratedValue
    private Long id;
    private String titulo;
    private String autor;
    private LocalDateTime dataPublicacao;


}
