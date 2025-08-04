package com.example.toast;

import android.widget.Toast;
import org.apache.cordova.*;
import org.json.JSONArray;
import org.json.JSONException;

public class ToastPlugin extends CordovaPlugin {
    @Override
    public boolean execute(String action, JSONArray args, CallbackContext callbackContext) throws JSONException {
        if ("show".equals(action)) {
            String message = args.getString(0);
            String duration = args.getString(1);
            showToast(message, duration);
            callbackContext.success();
            return true;
        }
        return false;
    }

    private void showToast(final String message, final String duration) {
        cordova.getActivity().runOnUiThread(() -> {
            int toastDuration = "long".equals(duration) ? Toast.LENGTH_LONG : Toast.LENGTH_SHORT;
            Toast.makeText(cordova.getActivity(), message, toastDuration).show();
        });
    }
}
