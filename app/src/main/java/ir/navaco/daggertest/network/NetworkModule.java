package ir.navaco.daggertest.network;

import dagger.Module;
import dagger.Provides;

@Module
public class NetworkModule {

    @Provides
    ApiInterface provideApiService() {
        return new Retrofit.Builder()
                .baseUrl("https://jsonplaceholder.typicode.com")
                .addConverterFactory(GsonConverterFactory.create())
                .build()
                .create(ApiInterface.class);
    }
}
