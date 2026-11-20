package kh.edu.istad.postgres_diagram_m1.Model;

import jakarta.persistence.*;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.time.LocalDateTime;
import java.util.List;

@Setter
@Getter
@NoArgsConstructor
@Entity
@Table(name="enrollments")
public class Enrollment {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;
    @Column(unique = true , nullable = false)
    private LocalDateTime enrolled_at ;
    @Column(unique = true , nullable = false)
    private LocalDateTime payment_at ;
    @Column(unique = true , nullable = false)
    private  String payment_method;
    @Column(unique = true , nullable = false)
    private Boolean payment_status ;
    @Column(unique = true , nullable = false)
    private Integer course_id;
    @Column(unique = true , nullable = false)
    private Integer student_id;

    @OneToMany(mappedBy = "enrollment")
    private List<StudentProfile> studentProfiles;
    @OneToMany(mappedBy = "enrollment")
    private List<Course> courses;
    @OneToMany(mappedBy = "enrollment")
    private List<Category> categories;
    @OneToMany(mappedBy = "enrollment")
    private List<Video> videos;
    @OneToMany(mappedBy = "enrollment")
    private List<Comment> comments ;
    @OneToMany(mappedBy = "enrollment")
    private List<InstructorProfile> instructorProfiles;


}
