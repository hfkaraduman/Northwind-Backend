package kodlamaio.northwind.entities.concretes;



import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;

@Data
@Entity
@Table(name ="products")
@AllArgsConstructor//parametreli constructor
@NoArgsConstructor//parametresiz constructor
public class Product {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)//id'nin 1  1 arttırılacağını söylüyor
    @Column(name = "product_id", nullable = false)
    private int id;

    //@Column(name="category_id")
    //private int categoryId;

    @Column(name = "product_name")
    private String productName;

    @Column(name = "unit_price")
    private double unitPrice;

    @Column(name = "units_in_stock")
    private short unitsInStock;

    @Column(name="quantity_per_unit")
    private String quantityPerUnit;

    @ManyToOne()
    @JoinColumn(name = "category_id")
    private Category category;
}
