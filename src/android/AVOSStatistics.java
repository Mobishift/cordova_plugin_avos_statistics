package com.mobishift.avosstatistics;

import org.apache.cordova.CordovaPlugin;
import org.apache.cordova.CallbackContext;

import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

/**
 * This class echoes a string called from JavaScript.
 */
public class AVOSStatistics extends CordovaPlugin {
    private static final String PAGE_START = "pageStart";
    private static final String PAGE_END = "pageEnd";

    @Override
    public boolean execute(String action, JSONArray args, CallbackContext callbackContext) throws JSONException {
        if(action.equals(PAGE_START)){

            return true;
        }else if(action.equals(PAGE_END)) {
            return true;
        }
        if (action.equals("coolMethod")) {
            String message = args.getString(0);
            this.coolMethod(message, callbackContext);
            return true;
        }
        return false;
    }

}
