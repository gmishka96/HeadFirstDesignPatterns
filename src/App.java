import i_simuduck.a_initial.SimUDuck_Initial;
import i_simuduck.b_fly_update.SimUDuck_FlyUpdate;
import i_simuduck.c_interfaceables.SimUDuck_Interfaceables;
import i_simuduck.d_behaviors.SimUDuck_Behaviors;
import ii_duck_call.TestDuckCall;
import ii_observer.i_weatherstation.ii_weatherstation_first.WeatherStationFirst;
import ii_observer.i_weatherstation.iii_weatherstation_javautil.WeatherStationJavaUtil;
import iii_action_adventure_game.TestActionAdventureGame;

public class App {
    public static void main(String[] args) throws Exception {
        SimUDuck_Initial.run();
        SimUDuck_FlyUpdate.run();
        SimUDuck_Interfaceables.run();
        SimUDuck_Behaviors.run();
        TestDuckCall.run();
        TestActionAdventureGame.run();
        WeatherStationFirst.run();
        WeatherStationJavaUtil.run();
    }
}
