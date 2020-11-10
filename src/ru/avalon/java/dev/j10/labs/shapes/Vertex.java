
package ru.avalon.java.dev.j10.labs.shapes;

// Создал класс для вершин фигур, т.к. не понял, как по-другому использовать интерфейс Point
public class Vertex implements Point{
    
    private float x;
    private float y;
    
    public Vertex(float x, float y)
    {
        this.x = x;
        this.y = y;
    }
    
    public void setX(float x)
    {
        this.x = x;
    }
    
    public void setY(float y)
    {
        this.y = y;
    }
    
    @Override
    public float getX()
    {
        return x;
    }
    
    @Override
    public float getY()
    {
        return y;
    }    
}
