package com.onssoft.baseapp.data;

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

    public Single<JsonObject> updateJackPotMoney(String jackPotMoney) {
        return Rx2AndroidNetworking.post(MAIN_SERVER_URL+"updateJackPot")
                .addBodyParameter("jackPotMoney", jackPotMoney)
                .build()
                .getObjectSingle(JsonObject.class);
    }

    public Single<List<Feed>> getMyFeedList(String uid) {
        return Rx2AndroidNetworking.get(DB_BASE_URL+"/user-posts/"+uid+".json")
                .build()
                .getObjectListSingle(Feed.class);
    }

    public Single<JsonObject> minusPoint(String uid, String money) {
        return Rx2AndroidNetworking.post(MAIN_SERVER_URL+"minusPoint")
                .addBodyParameter("uid", uid)
                .addBodyParameter("money", money)
                .build()
                .getObjectSingle(JsonObject.class);
    }

    public Single<List<SolarUser>> getSolarUsers() {
        return Rx2AndroidNetworking.get(MAIN_SERVER_URL+"getUserData")
                .build()
                .getObjectListSingle(SolarUser.class);
    }

    public Single<List<EventLog>> getEventLog() {
        return Rx2AndroidNetworking.get(MAIN_SERVER_URL+"getEventLog")
                .build()
                .getObjectListSingle(EventLog.class);
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


    public Single<JsonArray> isUser(String uid) {
        return Rx2AndroidNetworking.post(IS_USER)
                .addBodyParameter("uid", uid)
                .build()
                .getObjectSingle(JsonArray.class);
    }
    public Single<List<PicZone>> getPicZone() {
        return Rx2AndroidNetworking.get(GET_PICZONE)
                .doNotCacheResponse()
                .build()
                .getObjectListSingle(PicZone.class);
    }
    public Single<List<PicZone>> getSeperatedData(String page) {
        return Rx2AndroidNetworking.post(GET_SEPERATED_DATA)
                .addBodyParameter("skip", page)
                .build()
                .getObjectListSingle(PicZone.class);
    }
    public Single<List<PicZone>> getPrePicZone() {
        return Rx2AndroidNetworking.get(GET_PREPICZONE)
                .doNotCacheResponse()
                .build()
                .getObjectListSingle(PicZone.class);
    }
    public Single<List<PicZone>> getSectionPcizoneData(String section) {
        return Rx2AndroidNetworking.post(GET_SECTION_DATA)
                .addBodyParameter("section", section)
                .build()
                .getObjectListSingle(PicZone.class);
    }
    public Single<List<CommentData>> getCommentData(String pid) {
        return Rx2AndroidNetworking.post(GET_COMMENT_DATA)
                .addBodyParameter("pid", pid)
                .build()
                .getObjectListSingle(CommentData.class);
    }
    public Single<JsonObject> addCommentData(String pid, String uid, String comment, String date, String nickname, String url) {
        return Rx2AndroidNetworking.post(WRITE_COMMENT_DATA)
                .addBodyParameter("pid", pid)
                .addBodyParameter("uid", uid)
                .addBodyParameter("comment", comment)
                .addBodyParameter("date", date)
                .addBodyParameter("nickname", nickname)
                .addBodyParameter("url", url)
                .build()
                .getObjectSingle(JsonObject.class);
    }
    public Single<JsonObject> removeComment(String commentID, String pid) {
        return Rx2AndroidNetworking.post(REMOVE_COMMENT_DATA)
                .addBodyParameter("commentID", commentID)
                .addBodyParameter("pid", pid)
                .build()
                .getObjectSingle(JsonObject.class);
    }
    public Single<JsonObject> addLike(String pic_id, String uid) {
        return Rx2AndroidNetworking.post(ADD_LIKE)
                .addBodyParameter("pic_id", pic_id)
                .addBodyParameter("uid", uid)
                .build()
                .getObjectSingle(JsonObject.class);
    }
    public Single<JsonObject> disLike(String pic_id, String uid) {
        return Rx2AndroidNetworking.post(DISLIKE)
                .addBodyParameter("pic_id", pic_id)
                .addBodyParameter("uid", uid)
                .build()
                .getObjectSingle(JsonObject.class);
    }
    public Single<JsonArray> hasNickname(String nickname) {
        return Rx2AndroidNetworking.post(DUPLICATION_CHECK)
                .addBodyParameter("nickname", nickname)
                .build()
                .getObjectSingle(JsonArray.class);
    }
    public Single<JsonObject> addUser(String uid, String nickname, String email, String url, String sex, String age, String section01, String section02, String region, String advertising) {
        return Rx2AndroidNetworking.post(ADD_USER)
                .addBodyParameter("uid", uid)
                .addBodyParameter("nickname", nickname)
                .addBodyParameter("url", url)
                .addBodyParameter("email", email)
                .addBodyParameter("sex", sex)
                .addBodyParameter("age", age)
                .addBodyParameter("section01", section01)
                .addBodyParameter("section02", section02)
                .addBodyParameter("region", region)
                .addBodyParameter("advertising", advertising)
                .build()
                .getObjectSingle(JsonObject.class);
    }
*/
}
