package ir.navaco.daggertest.dagger;

import dagger.Component;
import ir.navaco.daggertest.screens.MainActivity;

@Component
public interface UserComponent {

    void inject(MainActivity mainActivity);

}
