package wndud.o.springbootdeveloper;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.Id;
import lombok.AccessLevel;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;

@NoArgsConstructor(access = AccessLevel.PROTECTED)
@AllArgsConstructor
@Getter
@Entity
public class Member {
    @Id
    @GeneratedValue
    @Column(name = "id", updatable = false)
    private Long id; //DB테이블의 'id' 칼럼과 매칭

    @Column(name = "name", nullable = false)
    private String name; //DB테이블의 'name' 칼럼과 매칭
}
