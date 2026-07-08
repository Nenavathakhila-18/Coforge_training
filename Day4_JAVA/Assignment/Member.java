package co.coforge.assignments.day4;

public class Member {

    private int memberId;
    private String memberName;

    public Member(int memberId, String memberName) {
        this.memberId = memberId;
        this.memberName = memberName;
    }

    @Override
    public String toString() {
        return "Member ID: " + memberId +
               ", Member Name: " + memberName;
    }
}