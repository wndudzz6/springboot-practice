package wndud.o.springbootdeveloper;

import jakarta.persistence.*;
import lombok.AccessLevel;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
@Entity //Member객체를 JPA가 관리하는 엔티티로 지정 (Member객체와 DB의 테이블 매핑) (name="테이블이름")을 추가해서 매핑 가능
@Getter
@NoArgsConstructor(access = AccessLevel.PROTECTED)
//기본 생성자 엔티티는 반드시 기본 생성자가 있어야함. 접근제어자는 public or protected
@AllArgsConstructor


public class Member {
    @Id //id필드를 기본키로 지정
    @GeneratedValue(strategy = GenerationType.IDENTITY) //기본키를 자동으로 1씩 증가
    @Column(name = "id", updatable = false)
    private Long id; //DB테이블의 'id' 칼럼과 매칭

    @Column(name = "name", nullable = false) //name이라는 not null 컬럼과 매핑
    private String name; //DB테이블의 'name' 칼럼과 매칭
}
