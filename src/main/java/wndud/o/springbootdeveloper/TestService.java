package wndud.o.springbootdeveloper;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

//비즈니스 계층 코드
@Service
public class TestService {

    @Autowired
    MemberRepository memberRepository; //빈 주입

    public List<Member> getAllMembers() {
        return memberRepository.findAll();
        //멤버 목록 얻기 78p
    }
}