package kh.edu.istad.postgres_diagram_m1.Model;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import lombok.Getter;
import lombok.Setter;
import org.hibernate.annotations.AnyDiscriminatorImplicitValues;

import java.time.LocalDateTime;

@Getter
@Setter
@Entity

public class Enrollment {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long id;
    private LocalDateTime enrolled_at;
    private LocalDateTime payment_method;
    private Boolean payment_status;
    private Integer course_id;
    private String student_id;
}
