package wndud.o.springbootdeveloper.domain;

import jakarta.persistence.*;
import lombok.AccessLevel;
import lombok.Builder;
import lombok.Getter;
import lombok.NoArgsConstructor;

@Entity //엔티티로 지정
@Getter
@NoArgsConstructor(access = AccessLevel.PROTECTED)
public class Article {

    @Id //id필드를 기본키로 지정
    @GeneratedValue(strategy = GenerationType.IDENTITY) //기본키를 자동으로 1씩 증가
    @Column(name = "id", updatable = false)
    private Long id;

    @Column(name = "title", nullable = false)
    private String title;

    @Column(name = "content", nullable = false)
    private String content;

    @Builder //빌더 패턴으로 객체 생성. 롬복에서 지원하는 애너테이션 ~ 어느 필드에 어느 값이 들어가는지 파악 가능 가독성 굿
    public Article(String title, String content) {
        this.title = title;
        this.content = content;
    }

    public void update(String title, String content) {
        this.title = title;
        this.content = content;
    }

//    protected Article(){ //기본 생성자 @NoArgsConstructor 애너테이션으로 대치 -> 가독성 상승
//    }
//
//    //게터 @Getter 애너테이션으로 대치 -> 가독성 상승
//    public Long getId(){
//        return id;
//    }
//    public String getTitle(){
//        return title;
//    }
//
//    public String getContent(){
//        return content;
//    }

}
