import android.content.Intent
import com.connectapp.MainActivity2
import com.facebook.react.bridge.ReactApplicationContext
import com.facebook.react.bridge.ReactContextBaseJavaModule
import com.facebook.react.bridge.ReactMethod

class OpenActivity(context: ReactApplicationContext?) : ReactContextBaseJavaModule(context) {
    override fun getName(): String {
        return "openAct"
    }

    @ReactMethod
    fun openScreen() {
        val intent = Intent(
            currentActivity,
            MainActivity2::class.java
        )
        currentActivity!!.startActivity(intent)
    }
}
