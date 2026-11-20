package kh.edu.istad.postgres_diagram_m1.Model;


import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
@Entity
@Table(name = "app_students")
public class StudentProfile {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long id;
    @Column( nullable = false, length = 200)
    private String biography;
    @Column(nullable = false,length = 255)
    private String facebook_link;
    @Column(nullable = false,length = 255)
    private String github_link;
    @Column(nullable = false,unique = true, length = 255)
    private String major;
    @Column(nullable = false,unique = true, length = 255)
    private String phone_number;
    @Column(nullable = false,unique = true, length = 255)
    private String university;
}
