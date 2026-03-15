public class FastFood {
    private String name;
    private float radius;
    private float PI;

    public FastFood(String name, float radius) {
        this.name = name;
        this.radius = radius;
        this.PI = 3.141592f;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public float getRadius() {
        return radius;
    }

    public void setRadius(float radius) {
        this.radius = radius;
    }

    private float area(){
        return PI * radius * radius;
    }



    @Override
    public String toString() {
        return String.format(" 이름 : %s, 반지름 = %.2f Cm, 면적 : %.2f\u33A0", name, radius, area());
    }
}
