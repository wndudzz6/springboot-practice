package wndud.o.springbootdeveloper;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

//사용자가 /testGet요청을 하면 "Hello world!" 문자열을 반환하게 해줌.
//프레젠테이션 계층 코드
//빈이 어떻게 등록될까?
@RestController //라우터 역할을 하는 애너테이션 (라우터 : HTTP 요청과 메서드를 연결하는 장치)
public class TestController {
//    @GetMapping("/test") // /test GET요청이 오면 test()메서드 실행
//    public String test() {
//        return "Hello, world!";
//    }

    @Autowired
    TestService testService;

    @GetMapping("/test")
    public List<Member> getAllMembers() {
        List<Member> members = testService.getAllMembers();
        return members;
    }
}
