package wndud.o.springbootdeveloper.dto;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;

@NoArgsConstructor
@AllArgsConstructor
@Getter
public class UpdateArticleRequest { //수정해야하는 내용은 제목과 내용. 그에 맞는 필드 구성

    private String title;
    private String content;

}
