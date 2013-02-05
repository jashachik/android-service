import android.app.Service;
import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.os.IBinder;
import android.util.Log;
import android.widget.Toast;

public class MyService extends Service {
  private static final String TAG = "MyService";
 
	@Override
	public IBinder onBind(Intent intent) {
		return null;
	}
 
	@Override
	public void onCreate() {
		Toast.makeText(this, "My Service Created", Toast.LENGTH_SHORT).show();
		Log.d(TAG, "onCreate");
        
	}
 
	@Override
	public void onDestroy() {
		Toast.makeText(this, "My Service Stopped", Toast.LENGTH_SHORT).show();
		Log.d(TAG, "onDestroy");
		
	}
 
	@Override
	public void onStart(Intent intent, int startid) {
		Toast.makeText(this, "My Service Started", Toast.LENGTH_SHORT).show();
		Log.d(TAG, "onStart");
		
	}
}
