package com.onssoft.baseapp.utils;

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
 /*
    @BindingAdapter({"eventLogAdapter"})
    public static void setEventLogAdapter(RecyclerView recyclerView, List<EventLog> eventLogList) {
        EventLogRecyclerAdapter adapter = (EventLogRecyclerAdapter) recyclerView.getAdapter();
        if(adapter != null) {
            adapter.clearItems();
            adapter.addItems(eventLogList);
        }
    }

    @BindingAdapter({"pointAdapter"})
    public static void setPointAdapter(RecyclerView recyclerView, List<SolarUser> solarUserList) {
        PointRecyclerAdapter adapter = (PointRecyclerAdapter) recyclerView.getAdapter();
        if(adapter != null) {
            adapter.clearItems();
            adapter.addItems(solarUserList);
        }
    }

    @BindingAdapter({"attendeeAdapter"})
    public static void setAttendeeAdapter(RecyclerView recyclerView, List<SolarUser> solarUserList) {
        AttendeeRecyclerAdapter adapter = (AttendeeRecyclerAdapter) recyclerView.getAdapter();
        if(adapter != null) {
            adapter.clearItems();;
            adapter.addItems(solarUserList);
        }
    }

    @BindingAdapter({"commentAdapter"})
    public static void setCommentAdapter(RecyclerView recyclerView, List<CommentData> commentDataList) {
        CommentRecyclerAdapter adapter = (CommentRecyclerAdapter) recyclerView.getAdapter();
        if(adapter != null) {
            adapter.clearItems();
            adapter.addItems(commentDataList);
        }
    }

    @BindingAdapter({"feedAdapter"})
    public static void addFeedListAdapter(RecyclerView recyclerView, List<Feed> picZoneList) {
        FeedRecyclerAdapter adapter = (FeedRecyclerAdapter) recyclerView.getAdapter();
        if (adapter != null) {
            adapter.clearItems();
            adapter.addItems(picZoneList);
        }
    }

    @BindingAdapter({"myFeedAdapter"})
    public static void setMyFeedAdapter(RecyclerView recyclerView, List<Feed> myFeedList) {
        MyFeedRecyclerAdapter adapter = (MyFeedRecyclerAdapter) recyclerView.getAdapter();
        if(adapter != null) {
            adapter.clearItems();
            adapter.addItems(myFeedList);
        }
    }

    @BindingAdapter("firebaseImageUrl")
    public static void setFirebaseImageUrl(ImageView imageView, StorageReference url) {
        Context context = imageView.getContext();
        GlideApp.with(context).load(url).diskCacheStrategy(DiskCacheStrategy.ALL).into(imageView);
    }

    @BindingAdapter("imageUrl")
    public static void setImageUrl(ImageView imageView, String url) {
        if(url != null && !url.contentEquals("") && !url.contentEquals("http://mud-kage.kakao.co.kr"))
        {
            Context context = imageView.getContext();
            Glide.with(context).load(url).into(imageView);
        }
    }


    @BindingAdapter({"picListAdapter"})
    public static void addPicZoneListAdapter(RecyclerView recyclerView, List<PicZone> picZoneList) {
        PicZoneListAdapter adapter = (PicZoneListAdapter) recyclerView.getAdapter();
        if (adapter != null) {
            adapter.clearItems();
            adapter.addItems(picZoneList);
        }
    }
    @BindingAdapter({"recommendedAdapter"})
    public static void recommendedListAdapter(RecyclerView recyclerView, List<PicZone> picZoneList) {
        RecommendedRecyclerAdapter adapter = (RecommendedRecyclerAdapter) recyclerView.getAdapter();
        if (adapter != null) {
            adapter.clearItems();
            adapter.addItems(picZoneList);
        }
    }
    @BindingAdapter({"sectionAdapter"})
    public static void addSectionPiczoneItem(RecyclerView recyclerView, List<PicZone> picZoneList) {
        SectionRecyclerAdapter adapter = (SectionRecyclerAdapter) recyclerView.getAdapter();
        if (adapter != null) {
            adapter.clearItems();
            adapter.addItems(picZoneList);
        }
    }
    @BindingAdapter({"aroundAdapter"})
    public static void addAroundItem(ViewPager viewPager, List<PicZone> picZoneList) {
        AroundViewPagerAdapter adapter = (AroundViewPagerAdapter) viewPager.getAdapter();
        if (adapter != null) {
            adapter.clearItems();
            adapter.addItems(picZoneList);
            viewPager.setCurrentItem(adapter.getCount()/2);
        }
    }
    @BindingAdapter({"commentListAdapter"})
    public static void addCommentListData(RecyclerView recyclerView, List<CommentData> commentDataList) {
        CommentListRecyclerAdapter adapter = (CommentListRecyclerAdapter) recyclerView.getAdapter();
        if (adapter != null) {
            adapter.clearItems();
            adapter.addItems(commentDataList);
        }
    }
    @BindingAdapter({"commentAdapter"})
    public static void addCommentData(RecyclerView recyclerView, List<CommentData> commentDataList) {
        CommentRecyclerAdapter adapter = (CommentRecyclerAdapter) recyclerView.getAdapter();
        if (adapter != null) {
            adapter.clearItems();
            adapter.addItems(commentDataList);
        }
    }
    @BindingAdapter({"adapter2"})
    public static void addLocalPiczoneItem(RecyclerView recyclerView, List<PicZone> picZoneList) {
        LocalPiczoneAdapter adapter = (LocalPiczoneAdapter) recyclerView.getAdapter();
        if (adapter != null) {
            adapter.clearItems();
            adapter.addItems(picZoneList);
        }
    }
    @BindingAdapter("imageUrl")
    public static void setImageUrl(ImageView imageView, String url) {
        Context context = imageView.getContext();
        Glide.with(context).load(url).into(imageView);
    }
*/
    /*
    @BindingAdapter({"adapter"})
    public static void addOpenSourceItems(RecyclerView recyclerView, List<OpenSourceItemViewModel> openSourceItems) {
        OpenSourceAdapter adapter = (OpenSourceAdapter) recyclerView.getAdapter();
        if (adapter != null) {
            adapter.clearItems();
            adapter.addItems(openSourceItems);
        }
    }
    @BindingAdapter({"adapter", "action"})
    public static void addQuestionItems(SwipePlaceHolderView mCardsContainerView, List<QuestionCardData> mQuestionList, int mAction) {
        if (mAction == MainViewModel.ACTION_ADD_ALL) {
            if (mQuestionList != null) {
                mCardsContainerView.removeAllViews();
                for (QuestionCardData question : mQuestionList) {
                    if (question != null && question.options != null && question.options.size() == 3) {
                        mCardsContainerView.addView(new QuestionCard(question));
                    }
                }
                ViewAnimationUtils.scaleAnimateView(mCardsContainerView);
            }
        }
    }
    @BindingAdapter("imageUrl")
    public static void setImageUrl(ImageView imageView, String url) {
        Context context = imageView.getContext();
        Glide.with(context).load(url).into(imageView);
    }
    */

}
