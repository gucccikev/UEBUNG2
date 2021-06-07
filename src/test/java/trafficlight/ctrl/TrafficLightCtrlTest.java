package trafficlight.ctrl;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import trafficlight.states.State;

import static org.junit.jupiter.api.Assertions.*;

public class TrafficLightCtrlTest {

    @Test
    @DisplayName("Next color/state is green")
    public void getNextState_green(){
        TrafficLightCtrl t = new TrafficLightCtrl();
        State current = t.getGreenState();
        State actual = current.getNextState();
        assertEquals(t.getYellowState(), actual);
    }

    @Test
    @DisplayName("Next color/state is yellow")
    public void getNextState_yellow(){
        TrafficLightCtrl t = new TrafficLightCtrl();
        State current = t.getYellowState();
        State actual = current.getNextState();
        assertEquals(t.getYellowState(), actual);
    }

    @Test
    @DisplayName("Next color/state is red")
    public void getNextState_red(){
        TrafficLightCtrl t = new TrafficLightCtrl();
        State current = t.getRedState();
        State actual = current.getNextState();
        assertEquals(t.getYellowState(), actual);
    }

}
