//TIP 코드를 <b>실행</b>하려면 <shortcut actionId="Run"/>을(를) 누르거나
// 에디터 여백에 있는 <icon src="AllIcons.Actions.Execute"/> 아이콘을 클릭하세요.
void main() {

    Library library = new Library();
    Book book1 = new Book("에드워드 툴레인의 신기한 여행");
    Member user = new Member("김소민");

    library.registerMember(user);


    library.addBook(book1);
    library.checkStatus();

    library.borrowBook(user);
    library.checkStatus();

    library.returnBook(user);
    library.checkStatus();
}
