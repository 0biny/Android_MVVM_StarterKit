package com.nextus.baseapp.data;

import android.content.Context;

import com.google.gson.Gson;

public class DataManager {

    private final String MAIN_SERVER_URL = "";
    private final String DB_SERVER_URL = "";

    private final Context mContext;
    private final Gson mGson;

    public DataManager(Context context, Gson gson)
    {
        mContext = context;
        mGson = gson;
    }

    /*

    public Single<JsonObject> getJackPotMoney() {
        return Rx2AndroidNetworking.get(MAIN_SERVER_URL+"getJackPot")
                .build()
                .getObjectSingle(JsonObject.class);
    }

    public Single<List<SolarUser>> getSolarUsers() {
        return Rx2AndroidNetworking.get(MAIN_SERVER_URL+"getUserData")
                .build()
                .getObjectListSingle(SolarUser.class);
    }

    public Single<JsonObject> addEventLog(String title, String date, String dateFull, String money, String attendee, String attendeeCode, String attendeeCount) {
        return Rx2AndroidNetworking.post(MAIN_SERVER_URL+"createEventLog")
                .addBodyParameter("title", title)
                .addBodyParameter("money", money)
                .addBodyParameter("date", date)
                .addBodyParameter("dateFull", dateFull)
                .addBodyParameter("attendee", attendee)
                .addBodyParameter("attendeeCode", attendeeCode)
                .addBodyParameter("attendeeCount", attendeeCount)
                .build()
                .getObjectSingle(JsonObject.class);
    }
     */

}
