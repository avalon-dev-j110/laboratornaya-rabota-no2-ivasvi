package ru.avalon.java.dev.j10.labs.shapes;

/**
 * Представление о прямоугольнике.
 * <p>
 * Прямоугольник — четырехугольник, у которого все углы
 * прямые (равны 90 градусам).
 *
 * @see <a href="https://ru.wikipedia.org/wiki/%D0%9F%D1%80%D1%8F%D0%BC%D0%BE%D1%83%D0%B3%D0%BE%D0%BB%D1%8C%D0%BD%D0%B8%D0%BA">Прямоугольник</a>
 */
public class Rectangle implements Polygon{

    /*
     * TODO: Реализовать класс 'Rectangle'
     * 1. Используйте наследование.
     * 2. Реализуйте все абстрактные методы.
     */
    
    // Прямоугольник с вершинами a,b,c,d
    private Vertex a;
    private Vertex b;
    private Vertex c;
    private Vertex d;
    
    // длины сторон прямоугольника
    private float ab;
    private float ad;
    
    // Конструктор для задания прямоугольника с помощью координат вершины a, длин сторон ab и ad, а также угла angle между стороной ad и осью Х
    public Rectangle(float x, float y, float ab, float ad, double angle)
    {

        this.ab = ab;
        this.ad = ad;

        a = new Vertex(x, y);
        float cos = (float)Math.cos(angle);
        float sin = (float)Math.sin(angle);

        b = new Vertex(x - ab*sin, y + ab*cos);
        d = new Vertex(x + ad*cos, y + ad*sin);
        c = new Vertex(d.getX() + b.getX() - a.getX(), d.getY() - a.getY() + b.getY());
    }
    
    // конструктор, в котором вершина задается через класс Vertex
    public Rectangle(Vertex xy, float ab, float ad, double angle)
    {
        this(xy.getX(), xy.getY(), ab, ad, angle);
    }
    
    @Override
    public float getArea()
    {
        return ab*ad;
    }
    @Override
    public float getPerimeter()
    {
        float lines[]={ab,ad,ab,ad};
        return getPerimeter(lines);       
    }
    
    @Override
    public String whoAmI()
    {
        return "I am Rectangle";
    }
}
