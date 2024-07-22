package com.example.draggerhiltdome.di

class SocketOFTwoDifferentVersion {

//    Ensure you have both versions of the Socket.IO dependencies added in your build.gradle file:

    // this is for groovy

//    dependencies {
//        implementation 'io.socket:socket.io-client:2.0.0'
//        implementation 'io.socket:socket.io-client:0.8.3'
//    }

    //Define custom qualifiers to differentiate between the versions:

    // this code is in java

//    import javax.inject.Qualifier;
//
//    @Qualifier
//    @Retention(RetentionPolicy.RUNTIME)
//    public @interface SocketV200 { }
//
//    @Qualifier
//    @Retention(RetentionPolicy.RUNTIME)
//    public @interface SocketV083 { }

//    Provide instances of the Socket.IO clients with different versions using the custom qualifiers:


//    import dagger.Module;
//    import dagger.Provides;
//    import dagger.hilt.InstallIn;
//    import dagger.hilt.components.SingletonComponent;
//    import io.socket.client.IO;
//    import io.socket.client.Socket;
//    import java.net.URISyntaxException;
//
//    @Module
//    @InstallIn(SingletonComponent.class)
//            public class SocketModule {
//
//        @SocketV200
//        @Provides
//        public Socket provideSocketV200() throws URISyntaxException {
//            return IO.socket("http://your.server.url:2000");
//        }
//
//        @SocketV083
//        @Provides
//        public Socket provideSocketV083() throws URISyntaxException {
//            return IO.socket("http://your.server.url:0830");
//        }
//    }


//    Inject the different versions of the Socket.IO clients using the qualifiers:


//    import javax.inject.Inject;
//    import androidx.appcompat.app.AppCompatActivity;
//    import dagger.hilt.android.AndroidEntryPoint;
//    import io.socket.client.Socket;
//
//    @AndroidEntryPoint
//    public class MainActivity extends AppCompatActivity {
//
//        @Inject
//        @SocketV200
//        Socket socketV200;
//
//        @Inject
//        @SocketV083
//        Socket socketV083;
//
//        @Override
//        protected void onCreate(Bundle savedInstanceState) {
//            super.onCreate(savedInstanceState);
//            setContentView(R.layout.activity_main);
//
//            // Use socketV200 or socketV083 as needed
//            socketV200.connect();
//            socketV083.connect();
//        }
//    }



}