package kh.edu.istad.postgres_diagram_m1.Model;

import jakarta.persistence.*;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import org.hibernate.annotations.Audited;

import java.math.BigDecimal;
import java.time.LocalDateTime;

@Getter
@Setter
@NoArgsConstructor
@Entity
@Table (name="courses")

public class Course {
    @Id

    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(nullable = false, length = 4)
    private long id;
    private Integer count_rating;
    @Column(nullable = false,unique = true, length = 6)
    private LocalDateTime craete_at;
    @Column(nullable = false,length = 255)
    private String description;
    @Column(nullable = false,columnDefinition = "FLOAT(4)")
    private Float discount_percent;
    @Column(nullable = false, columnDefinition = "TINYINT(1) DEFAULT 1")
    private boolean active = true;
    private Boolean is_public;
    @Column(nullable = false,length = 255)
    private String keyword;
    @Column(nullable = false,length = 255)
    private Integer level;
    @Column( precision = 38, scale = 2, nullable = false)
    private BigDecimal price;
    @Column(nullable = false,length = 255)
    private String slug;
    @Column(nullable = false,unique = true, length = 6)
    private Float star_rating;
    @Column(nullable = false, length = 500)
    private String thumbnailUrl;
    @Column(nullable = false,length = 255)
    private String title;
    @Column( precision = 10, scale = 2)
    private BigDecimal totalHours;
    @Column(nullable = false,updatable = false)
    private LocalDateTime update_at;
    @Column(nullable = false,unique = true,length = 4)
    private Integer category_id;
    @Column(nullable = false,unique = true,length = 255)
    private String instructor_id;



}
