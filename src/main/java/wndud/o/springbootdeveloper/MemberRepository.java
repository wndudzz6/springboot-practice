package wndud.o.springbootdeveloper;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

//리포지토리는 엔티티에 있는 데이터들을 조회하거나 저장, 변경, 삭제를 할 때 사용하는 인터페이스,
//스프링 데이터 JPA에서 제공하는 인터페이스인 JpaRepository클래스를 상속받아 간단하게 구현
@Repository
public interface MemberRepository extends JpaRepository<Member, Long> {
}
