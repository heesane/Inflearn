package inflearn2.heesane.member;

public interface MemberService {
    void join(Member member);
    Member findMember(Long memberId);
}
