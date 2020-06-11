package zcm.com.github.SpringSecurity.entity;

import lombok.Getter;
import lombok.Setter;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import java.io.Serializable;
import java.math.BigDecimal;

@Entity
@Getter
@Setter
public class Item implements Serializable {

    @Id
    @GeneratedValue
    private Long id;
    private String name;
    private BigDecimal price;

}
