package kh.edu.istad.postgres_diagram_m1.Model;



import jakarta.persistence.*;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Setter
@Getter
@NoArgsConstructor
@Entity
@Table(name = "instructor_profiles")
public class InstructorProfile {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;
    @Column(unique = true , nullable = false)
    private String biography ;
    @Column(unique = true , nullable = false)
    private String facebook_link ;
    @Column(unique = true , nullable = false)
    private String  github_link;
    @Column(unique = true , nullable = false)
    private String  jon_title;
    @Column(unique = true , nullable = false)
    private String  phone_number;
    @ManyToOne
    private  Enrollment enrollment;
}
