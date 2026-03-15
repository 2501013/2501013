public class Club {
    private String name;
    private int member;

    public Club(String name, int member) {
        this.name = name;
        this.member = member;
    }

    @Override
    public String toString() {
        return String.format("%s 클럽(club)에 참여 하였고, 클럽 인원(clubMember)은 %d명이다.", name, member);

    }
}
