package kr.ac.hansung.ecse;

import lombok.Data;
import org.springframework.stereotype.Component;

@Data
@Component
public class Product {
    private String name;
    private int price;
}
