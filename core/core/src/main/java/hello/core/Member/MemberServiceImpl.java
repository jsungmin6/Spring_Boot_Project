package hello.core.Member;

public class MemberServiceImpl implements MemberService{

    private final MemberRepository memberRepository = new MemoryMemeberRepository();

    @Override
    public void join(Member member) {
        memberRepository.save(member);
    }

    @Override
    public Member findMember(Long memberId) {
        return memberRepository.findById((memberId));
    }
}
