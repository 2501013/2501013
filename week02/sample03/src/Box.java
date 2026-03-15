public class Box {
    private int height;
    private int width;
    private int depth;
    private String color;
    private String title;

    public Box(int height, int width, int depth, String color, String title) {
        this.height = height;
        this.width = width;
        this.depth = depth;
        this.color = color;
        this.title = title;
    }

    private int volume() {
        return width * height * depth;
    }


    @Override
    public String toString() {
        return String.format("==== %s Box =====\n" +
                "\t 가로 : %d Cm\n" +
                "\t 세로 : %d Cm\n" +
                "\t 높이 : %d Cm\n" +
                "\t 문구 : %s\n" +
                "\n 부피 : %,d \u33a4", color, height, width, depth, title, volume());

    }
}
