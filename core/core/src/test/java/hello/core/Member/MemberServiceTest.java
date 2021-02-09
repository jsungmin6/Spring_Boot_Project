package hello.core.Member;

import org.assertj.core.api.Assertions;
import org.junit.jupiter.api.Test;

public class MemberServiceTest {


    MemberService memberService = new MemberServiceImpl();
    @Test
    void join(){
        //given :이렇게 주어지고
        Member member = new Member(1L, "memeberA", Grade.VIP);
        //when :이렇게 했을 때
        memberService.join(member);
        Member findMemeber = memberService.findMember(1L);

        //then : 이렇게 된다.
        Assertions.assertThat(member).isEqualTo(findMemeber);
    }
}
