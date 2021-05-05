package ir.navaco.daggertest.dagger;

import javax.inject.Named;

import dagger.BindsInstance;
import dagger.Component;
import ir.navaco.daggertest.screens.MainActivity;

@Component
public interface UserComponent {

    void inject(MainActivity mainActivity);

    @Component.Builder
    interface Builder {

        @BindsInstance
        Builder firstName(@Named("firstName") String firstName);

        @BindsInstance
        Builder lastName(@Named("lastName") String lastName);

        UserComponent build();
    }

}
