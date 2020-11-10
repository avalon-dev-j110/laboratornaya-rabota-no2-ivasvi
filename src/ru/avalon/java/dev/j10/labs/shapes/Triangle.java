package ru.avalon.java.dev.j10.labs.shapes;

/**
 * Представление о треугольнике.
 * <p>
 * Треуго́льник (в евклидовом пространстве) — геометрическая
 * фигура, образованная тремя отрезками, которые соединяют
 * три точки, не лежащие на одной прямой. Указанные три
 * точки называются вершинами треугольника, а отрезки —
 * сторонами треугольника. Часть плоскости, ограниченная
 * сторонами, называется внутренностью треугольника: нередко
 * треугольник рассматривается вместе со своей внутренностью
 * (например, для определения понятия площади).
 *
 * @see <a href="https://ru.wikipedia.org/wiki/%D0%A2%D1%80%D0%B5%D1%83%D0%B3%D0%BE%D0%BB%D1%8C%D0%BD%D0%B8%D0%BA">Треугольник</a>
 */
public class Triangle implements Polygon{

    /*
     * TODO: Реализовать класс 'Triangle'
     * 1. Используйте наследование.
     * 2. Реализуйте все абстрактные методы.
     */
    private Vertex a, b, c; //вершины треугольника
    private float ab, bc, ac; //длины сторон
    
    // конструктор по координатам вершин
    public Triangle(float ax, float ay, float bx, float by, float cx, float cy)
    {
        a = new Vertex(ax, ay);
        b = new Vertex(bx, by);
        c = new Vertex(cx, cy);
        ab = (float)Math.sqrt(Math.pow(Math.abs(bx - ax), 2) + Math.pow(Math.abs(by - ay), 2));
        bc = (float)Math.sqrt(Math.pow(Math.abs(bx - cx), 2) + Math.pow(Math.abs(by - cy), 2));
        ac = (float)Math.sqrt(Math.pow(Math.abs(ax - cx), 2) + Math.pow(Math.abs(ay - cy), 2));
    }
    
    // конструктор по вершинам
    public Triangle(Vertex a, Vertex b, Vertex c)
    {
        this(a.getX(), a.getY(), b.getX(), b.getY(), c.getX(), c.getY());
    }
    
    @Override
    public float getArea()
    {
        float p = getPerimeter()/2; // полупериметр
        float s = (float)Math.sqrt(p*(p - ab)*(p - bc)*(p - ac));// вычисление площади по формуле Герона
        
        return s;
    }
    
    @Override
    public float getPerimeter()
    {
        float[] lines = {ab, bc, ac};
        return getPerimeter(lines);
    }
    
    @Override
    public String whoAmI()
    {
        return "I am Triangle ";
    }
}
