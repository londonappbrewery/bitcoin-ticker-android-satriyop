package com.londonappbrewery.bitcointicker;

import org.json.JSONException;
import org.json.JSONObject;

/**
 * Created by satriyopamungkas on 9/10/17.
 */

public class BitcoinDataModel {
    private String mTimestamp;
    private String mAsk;

    public static BitcoinDataModel fromJson(JSONObject jsonObject) {
        try {

            BitcoinDataModel BitcoinData = new BitcoinDataModel();
            BitcoinData.mTimestamp = jsonObject.getString("display_timestamp");
            BitcoinData.mAsk = jsonObject.getString("ask");
            return  BitcoinData;
        } catch (JSONException e) {
            e.printStackTrace();
            return null;
        }
    }

    //Getter Method
    public String getTimestamp() {
        return mTimestamp;
    }

    public String getAsk() {
        return mAsk;
    }
}






