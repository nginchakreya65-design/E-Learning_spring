package kh.edu.istad.postgres_diagram_m1.Model;

import jakarta.persistence.*;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import java.math.BigDecimal;
import java.time.LocalDateTime;

@Setter
@Getter
@NoArgsConstructor
@Entity
@Table(name="courses")
public class Course {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;
    @Column(unique = true , nullable = false)
    private  Integer count_rating;
    @Column(unique = true , nullable = false)
    private LocalDateTime created_at;
    @Column(unique = true , nullable = false)
    private  String description;
    @Column(unique = true , nullable = false)
    private  Float discount_percent;
    @Column(unique = true , nullable = false)
    private  Boolean is_deleted;
    @Column(unique = true , nullable = false)
    private  Boolean is_published;
    @Column(unique = true , nullable = false)
    private  String keywords;
    @Column(unique = true , nullable = false)
    private  String level;
    @Column(unique = true , nullable = false,length = 38)
    private BigDecimal price;
    @Column(unique = true , nullable = false)
    private  String slug;
    @Column(unique = true , nullable = false)
    private Float star_rating ;
    @Column(unique = true , nullable = false)
    private  String thumbnail;
    @Column(unique = true , nullable = false)
    private  String title;
    @Column(unique = true , nullable = false)
    private  Float total_hours;
    @Column(unique = true , nullable = false)
    private  LocalDateTime updated_at;
    @Column(unique = true , nullable = false)
    private  Integer category_id;
    @Column(unique = true , nullable = false)
    private  String instructor_id;
    @ManyToOne
    private  Enrollment enrollment;
}