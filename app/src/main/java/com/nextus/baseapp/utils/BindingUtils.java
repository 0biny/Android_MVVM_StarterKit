package com.nextus.baseapp.utils;

/**
 * @author ReStartAllKill
 * @created on 2018-09-20
 * @modified by
 * @updated on
 */
public final class BindingUtils {

    private BindingUtils() {
        // This class is not publicly instantiable
    }

 /*  Example

    @BindingAdapter({"eventLogAdapter"})
    public static void setEventLogAdapter(RecyclerView recyclerView, List<EventLog> eventLogList) {
        EventLogRecyclerAdapter adapter = (EventLogRecyclerAdapter) recyclerView.getAdapter();
        if(adapter != null) {
            adapter.clearItems();
            adapter.addItems(eventLogList);
        }
    }

    @BindingAdapter("imageUrl")
    public static void setImageUrl(ImageView imageView, String url) {
        Context context = imageView.getContext();
        Glide.with(context).load(url).into(imageView);
    }

    */

}
