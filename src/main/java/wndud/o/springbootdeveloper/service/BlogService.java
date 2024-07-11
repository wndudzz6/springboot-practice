package wndud.o.springbootdeveloper.service;


import jakarta.transaction.Transactional;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;
import wndud.o.springbootdeveloper.domain.Article;
import wndud.o.springbootdeveloper.dto.AddArticleRequest;
import wndud.o.springbootdeveloper.dto.UpdateArticleRequest;
import wndud.o.springbootdeveloper.repository.BlogRepository;

import java.util.List;

@RequiredArgsConstructor //final이 붙거나 @NotNull이 붙은 필드의 생성자 추가
//빈을 생성자로 생성하는 롬복에서 지원하는 애너테이션
@Service //해당 클래스를 빈으로 서블릿 컨테이너에 등록해줌.
public class BlogService {

    private final BlogRepository blogRepository;

    //블로그 글 추가 메서드
    public Article save(AddArticleRequest request) { //save()메서드 AddArticleRequest 클래스에 저장된 값 -> article DB에 저장
        return blogRepository.save(request.toEntity());
    }

    //DB에 저장되어있는 글을 모두 갖고오는 findAll() 메서드 (JPA지원)
    public List<Article> findAll(){
        return blogRepository.findAll();
    }

    public Article findById(long id) {
        return blogRepository.findById(id)
                .orElseThrow(()->new IllegalArgumentException("not found: "+id));
    }

    public void delete(long id) {
        blogRepository.deleteById(id);
    }

    @Transactional //트랜잭션 메서드
    public Article update(long id, UpdateArticleRequest request) {
        Article article = blogRepository.findById(id)
                .orElseThrow(()-> new IllegalArgumentException("not found: "+id));

        article.update(request.getTitle(), request.getContent());

        return article;
    }
}
