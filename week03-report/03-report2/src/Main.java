//TIP 코드를 <b>실행</b>하려면 <shortcut actionId="Run"/>을(를) 누르거나
// 에디터 여백에 있는 <icon src="AllIcons.Actions.Execute"/> 아이콘을 클릭하세요.
void main() {
    Teacher person = new Teacher();
    Doctor doctor = new Doctor();
    Engineer engineer = new Engineer();

    person.introduce();
    doctor.introduce();
    engineer.introduce();

    person.teach();
    person.grade();


    doctor.treat();
    doctor.surgery();


    engineer.develop();
    engineer.fixBug();
}
