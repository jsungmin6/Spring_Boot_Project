package hello.hellospring.repository;

import hello.hellospring.domain.Member;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.Test;

import java.util.List;

import static org.assertj.core.api.Assertions.*;

public class MemoryMemberRepositoryTest {

    MemoryMemberRepository repostitory = new MemoryMemberRepository();

    @AfterEach
    public void afterEach(){
        repostitory.clearStore();
    }

    @Test
    public void save(){
        Member member = new Member();
        member.setName("spring");

        repostitory.save(member);

        Member result = repostitory.findById(member.getId()).get();
        assertThat(member).isEqualTo(result);
    }
    @Test
    public void findByName(){
        Member member1 = new Member();
        member1.setName("spring1");

        repostitory.save(member1);

        Member member2 = new Member();
        member2.setName("spring2");

        repostitory.save(member2);

        Member result = repostitory.findByName("spring1").get();

        assertThat(result).isEqualTo(member1);

    }

    @Test
    public void findAll(){
        Member member1 = new Member();
        member1.setName("spring1");
        repostitory.save(member1);

        Member member2 = new Member();
        member2.setName("spring2");
        repostitory.save(member2);

        List<Member> result = repostitory.findAll();

        assertThat(result.size()).isEqualTo(2);
    }

}
