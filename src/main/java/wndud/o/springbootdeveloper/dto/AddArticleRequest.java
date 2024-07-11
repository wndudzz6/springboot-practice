package wndud.o.springbootdeveloper.dto;

//DTO : data transfer object 계층끼리 데이터를 교환하기 위해 사용하는 객체. 전달자 역할만 하므로 별도의 비즈니스 로직x
//DAO : DB와 연결되고 데이터를 조회, 수정하는데 사용하는 객체. 데이터 수정 관련된 로직 포함

//6.3.1. 블로그에 글을 추가하는 코드를 서비스 계층에 작성
//서비스 계층에서 요청을 받을 객체인 AddArticleRequest 객체를 생성하고,
// BlogService 클래스를 생성한 다음에 블로그 글 추가 메서드인 save()메서드 구현

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import wndud.o.springbootdeveloper.domain.Article;

@NoArgsConstructor //기본 생성자 추가
@AllArgsConstructor // 모든 필드 값을 파라미터로 받는 생성자 추가
@Getter
public class AddArticleRequest {

    private String title;
    private String content;

    public Article toEntity(){ //생성자를 사용해 객체 생성. 빌더 패턴으로 DTO를 엔티티로 만들어주는 메서드
        return Article.builder()
                .title(title)
                .content(content)
                .build();
    }//추후 블로그에 글을 추가할 때 저장할 엔티티로 변환하는 용도로 사용

}
