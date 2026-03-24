import java.util.ArrayList;

public class Library {
    Book myBook;
    ArrayList<Member> members = new ArrayList<>();

    void registerMember(Member m) {
        members.add(m);
        System.out.println(m.name + "님이 회원으로 가입되었습니다.");
    }

    void addBook(Book b) {
        this.myBook = b;
        System.out.println("[" + b.title + "] 책이 입고되었습니다.");
    }

    void borrowBook(Member m) {
        if (myBook.isAvailable) {
            myBook.isAvailable = false;
            System.out.println(m.name + "님이 '" + myBook.title + "'을(를) 대출했습니다.");
        } else {
            System.out.println("에러: 이미 다른 사람이 빌려갔습니다.");
        }
    }

    void returnBook(Member m) {
        myBook.isAvailable = true;
        System.out.println(m.name + "님이 '" + myBook.title + "'을(를) 반납했습니다.");
    }

    void checkStatus() {
        System.out.println("\n--- 현재 대출 상황 ---");
        System.out.println("도서명: " + myBook.title);
        System.out.println("상태: " + (myBook.isAvailable ? "도서관에 있음" : "대출 중"));
        System.out.println("---------------------\n");
    }
}