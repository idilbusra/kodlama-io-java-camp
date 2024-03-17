package kolama.io.rentACar.entities.concretes;

import jakarta.persistence.*;
import lombok.*;

@Table(name = "brands")
@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@Entity
public class Brand {

    @Id//PK
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id")//PK
    private int id;
    @Column(name = "name")
    private String name;


}
