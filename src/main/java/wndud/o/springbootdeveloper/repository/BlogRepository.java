package wndud.o.springbootdeveloper.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import wndud.o.springbootdeveloper.domain.Article;

public interface BlogRepository extends JpaRepository<Article, Long> {
}
//JpaRepository클래스를 상속받을 때 엔티티Article과 엔티티의 PK타입 Long을 인수로 넣음.
// 이제 이 리포지토리를 사용할 때 JpaRepository에서 제공하는 여러 메서드를 사용할 수 있음 6.2.3