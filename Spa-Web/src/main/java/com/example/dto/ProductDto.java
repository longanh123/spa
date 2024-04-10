package com.example.dto;
import jakarta.persistence.Column;
import jakarta.persistence.Embeddable;
import lombok.Data;
import java.util.Date;
import java.util.List;

@Data
@Embeddable
public class ProductDto {
    private String  codes;
    @Column(length = 1000)
    private List<String> images;
    private String name_;
    private Long price;
    private Date createdate;
}
