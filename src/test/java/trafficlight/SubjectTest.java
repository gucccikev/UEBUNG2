package trafficlight;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import java.lang.reflect.Method;

import static org.junit.jupiter.api.Assertions.*;

public class SubjectTest {

    @Test
    @DisplayName("Does addObserver method exist?")
    public void addObserverTest(){
        try {
            Method m = Subject.class.getMethod("addObserver", Observer.class);
        } catch (Exception e){
            e.printStackTrace();
            fail("addObserver method missing");
        }
    }

    @Test
    @DisplayName("Does removeObserver method exist?")
    public void removeObserverTest(){
        try {
            Method m = Subject.class.getMethod("removeObserver", Observer.class);

        } catch (Exception e){
            e.printStackTrace();
            fail("removeObserver method missing");
        }
    }

    @Test
    @DisplayName("Does notifyObserver method exist?")
    public void notifyObserverTest(){
        try {
            Method m = Subject.class.getMethod("notifyObserver");
        } catch (Exception e){
            e.printStackTrace();
            fail("notifyObserver method missing");
        }
    }
}
