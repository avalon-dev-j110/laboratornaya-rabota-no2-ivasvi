package ru.avalon.java.dev.j10.labs.shapes;

/**
 * Представление об окружности.
 * <p>
 * Окру́жность — замкнутая плоская кривая, которая состоит из
 * всех точек на плоскости, равноудалённых от заданной точки.
 *
 * @see <a href="https://ru.wikipedia.org/wiki/%D0%9E%D0%BA%D1%80%D1%83%D0%B6%D0%BD%D0%BE%D1%81%D1%82%D1%8C">Окружность</a>
 */
public class Circle implements Shape, Ellipse{

    /*
     * TODO: Реализовать класс 'Circle'
     * 1. Используйте наследование.
     * 2. Реализуйте все абстрактные методы.
     */
    
    private Vertex center;
    private float radius;
    
    // конструктор по координатам центра и радиусу
    public Circle(float cx, float cy, float radius)
    {

        center = new Vertex(cx, cy);
        this.radius = radius;
    }
    
    // конструктор по центру и радиусу
    public Circle(Vertex xy, float radius)
    {
        center = xy;
        this.radius = radius;
    }
    
    @Override
    public float getArea()
    {
        return (float)(2*Math.PI*radius);
    }
    
    @Override
    public float getLength()
    {
        return (float)(Math.PI*radius*radius);
    }
    
    @Override
    public String whoAmI()
    {
        return "I am Circle   ";
    }
}
