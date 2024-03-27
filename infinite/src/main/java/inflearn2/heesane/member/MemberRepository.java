package inflearn2.heesane.member;

public interface MemberRepository {
    void save(Member member);
    Member findById(Long memberId);

}