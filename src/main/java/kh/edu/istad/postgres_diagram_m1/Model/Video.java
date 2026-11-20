package kh.edu.istad.postgres_diagram_m1.Model;

import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;
import lombok.NoArgsConstructor;

@Setter
@Getter
@NoArgsConstructor
@Entity
@Table(name = "videos")
public class Video {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;

    @Column(nullable = false)
    private String duration;

    @Column(nullable = false)
    private Boolean is_deleted;

    @Column(nullable = false)
    private Boolean is_published;

    @Column(unique = true, nullable = false)
    private String slug;

    @Column(nullable = false)
    private String thumbnail;

    @Column(nullable = false)
    private String title;

    @Column(nullable = false)
    private String youtube;

    private Integer course_id;

    @ManyToOne
    private Enrollment enrollment;
}