package member_ver1;

import java.util.Collection;

public class MemberInfoService {
    private MemberDAO memberDAO;

    public MemberInfoService(MemberDAO memberDAO) {
        this.memberDAO = memberDAO;
    }

    public void printMemberInfo(String email) {
        // 이메일에 해당하는 회원 정보 찾아 출력하는 메소드
        MemberVO foundMember = memberDAO.selectOne(email);

        // 이메일에 해당하는 회원 정보 출력
        if (foundMember != null) {
            System.out.println("이메일: " + foundMember.getEmail());
            System.out.println("이름: " + foundMember.getName());
            System.out.println("비밀번호: " + foundMember.getPwd());
            System.out.println("등록일자: " + foundMember.getFormattedRegDate());
            // 추가 정보가 있다면 여기에 계속해서 출력
        } else {
            System.out.println("해당하는 이메일 주소의 사용자가 없습니다.");
        }
    }

    // 필요한 다른 메소드들을 구현해야 합니다.
}
