import io.socket.client.IO;
import io.socket.client.Socket;
import java.net.URISyntaxException;

public class MainActivity extends AppCompatActivity {
    private Socket mSocket;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        try {
            mSocket = IO.socket("https://ludo-game.onrender.com");
            mSocket.connect();
        } catch (URISyntaxException e) {
            e.printStackTrace();
        }
    }
}


mSocket.on("playerJoined", args -> {
runOnUiThread(() -> {
        Toast.makeText(MainActivity.this, "New player joined!", Toast.LENGTH_SHORT).show();
    });
            });



            mSocket.emit("playerMove", "player1", 3);
