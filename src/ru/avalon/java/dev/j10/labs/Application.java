package ru.avalon.java.dev.j10.labs;

import ru.avalon.java.dev.j10.labs.shapes.Shape;
import ru.avalon.java.dev.j10.labs.shapes.Triangle;
import ru.avalon.java.dev.j10.labs.shapes.Circle;
import ru.avalon.java.dev.j10.labs.shapes.Rectangle;
import ru.avalon.java.dev.j10.labs.shapes.Vertex;
import java.util.Random;

public class Application {

    private static Shape findMax(Shape[] shapes)
    {
        int mark = 0;
        Shape max = shapes[0];
        for (int i = 0; i < shapes.length; i++)
        {
            if (shapes[i].getArea()> max.getArea())
            {
                mark = i;
                max = shapes[i];
            }
        }
        return shapes[mark];    
    }   
    
    private static Vertex randomVertex()
    {
        Random random = new Random();
        return new Vertex(20*random.nextFloat(), 20*random.nextFloat());
    }
    
    private static Circle randomCircle()
    {
        Random random = new Random();
        return new Circle(randomVertex(), 20*random.nextFloat()); 
    }
    
    private static Rectangle randomRectangle()
    {
        Random random = new Random();
        return new Rectangle(randomVertex(), 30*random.nextFloat(), 30*random.nextFloat(), 90*random.nextDouble());
    }
    
    private static Triangle randomTriangle()
    {
        Random random = new Random();
        return new Triangle(randomVertex(), randomVertex(), randomVertex()); 
    }
    
    private static Shape[] generateRandomShapes(int size)
    {
        Shape[] shapes = new Shape[size];
        Random random = new Random();
        for (int i=0; i<shapes.length; i++)
        {
            int typeOfShape = random.nextInt(3);
            switch(typeOfShape)
            {
                case 0:
                    shapes[i] = randomRectangle();
                    break;
                case 1:
                    shapes[i] = randomCircle();
                    break;
                case 2:
                    shapes[i] = randomTriangle();
            }
            
            System.out.print(shapes[i].whoAmI()+ "     ");          
            System.out.println("Shape["+i+"] area = " + shapes[i].getArea());
         
        }
       
        
        return shapes;
    }
    
    public static void main(String[] args) {
        Shape[] shapes = null;
        
//        Triangle T1 = new Triangle(0.0F, 0.0F, 3.0F, 0.0F, 0.0F, 4.0F);
//        Circle C1 = new Circle(1.3F, 3.4F, 10.0F);
//        Rectangle R1 = new Rectangle(0.0F, 0.0F, 4.0F, 5.0F, 30);
//        System.out.println(T1.getArea());
//        System.out.println(R1.getArea());        
//        System.out.println(C1.getArea());    
        
        
        /*
         * TODO: Выполнить действия над массивом 'shapes'
         *
         * 1. Проинициализировать переменную 'shapes' массивом
         *    содержащим 10 произвольных фигур. Массив должен
         *    содержать экземпляры классов Circle, Rectangle
         *    и Triangle.
         *
         * 2. Найти в массиве 'shapes' фигуру с максимальной
         *    площадью. Для поиска фигуры необходимо создать
         *    статический метод в текущем классе (Application).
         */
        
        shapes = generateRandomShapes(10);
        Shape maxshape = findMax(shapes);
        System.out.println("maxshape area = " + maxshape.getArea() );
    }
}
