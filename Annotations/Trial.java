import java.lang.annotation.*;
import java.lang.reflect.*;

@interface MyAnnotation{
	int value() default 10;
}

class Base
{
	@MyAnnotation public void main(String args[])
	{
		System.out.print("Hello World "+ getAnnotation(MyAnnotation.class));
	}	

}