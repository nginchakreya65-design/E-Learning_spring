package kh.edu.istad.postgres_diagram_m1.Model;



import jakarta.persistence.*;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.time.LocalDateTime;

@Setter
@Getter
@NoArgsConstructor
@Entity
@Table(name="comments")
public class Comment {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;
    @Column(unique = true , nullable = false)
    private  Integer parent_id ;
    @Column(unique = true , nullable = false)
    private Integer video_id;
    @Column(nullable = false)
    private  String text;
    @Column(unique = true , nullable = false)
    private LocalDateTime create_at ;
    @Column(unique = true , nullable = false)
    private Boolean is_deleted ;
    @ManyToOne
    private  Enrollment enrollment;
}
