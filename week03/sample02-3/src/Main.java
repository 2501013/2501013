void main() {
    Book book = new Book("자바의 정석");
    Student lee = new Student("이영희");
    Teacher kim = new Teacher("김철수", "JAVA");

    ClassRoom classRoom = new ClassRoom(kim, lee);
    classRoom.startClass(book);

}