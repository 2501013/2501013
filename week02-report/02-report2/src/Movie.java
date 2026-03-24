public class Movie {
    private  int number;
    private  String title;
    private  String director;
    private  int open;
    private  String mainActor;
    private  double rankPoint;

    public Movie(int number, String title, String director, int open, String mainActor, double rankPoint) {
        this.number = number;
        this.title = title;
        this.director = director;
        this.open = open;
        this.mainActor = mainActor;
        this.rankPoint = rankPoint;
    }

    public void setRankPoint(double rankPoint) {
        this.rankPoint = rankPoint;
    }

    public String getDirector() {
        return director;
    }


    @Override
    public String toString() {
        return String.format("==== Movie %d =====\n" +
                "제목 : %s \n" +
                "감독 : %s\n" +
                "개봉 : %d \n" +
                "주연 : %s\n" +
                "평점 : %.1f ", number,title,director,open,mainActor,rankPoint);
    }
}
