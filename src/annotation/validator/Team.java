package annotation.validator;

public class Team {
    @NotEmpty(message = "이름이 비었습니다.")
    private String name;
    @Range(min= 1, max = 999, message = "회원수는 1 과 999 사이여야 합니다.")
    private int memberCount;

    public Team() {
    }

    public Team(String name, int memberCount) {
        this.name = name;
        this.memberCount = memberCount;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getMemberCount() {
        return memberCount;
    }

    public void setMemberCount(int memberCount) {
        this.memberCount = memberCount;
    }
}
