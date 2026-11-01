package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes3.dex */
public final class afqt implements android.os.Parcelable.ClassLoaderCreator {
    private final /* synthetic */ int $cid;

    public afqt(int i) {
        this.$cid = i;
    }

    @Override // android.os.Parcelable.Creator
    public final /* synthetic */ java.lang.Object createFromParcel(android.os.Parcel parcel) {
        switch (this.$cid) {
            case 0:
                return new com.google.android.material.bottomsheet.BottomSheetBehavior.SavedState(parcel, (java.lang.ClassLoader) null);
            case 1:
                return new com.google.android.material.appbar.AppBarLayout.BaseBehavior.SavedState(parcel, null);
            case 2:
                return new com.google.android.material.button.MaterialButton.SavedState(parcel, null);
            case 3:
                return new com.google.android.material.internal.CheckableImageButton.SavedState(parcel, null);
            case org.chromium.net.UrlRequest$Status.WAITING_FOR_CACHE /* 4 */:
                return new com.google.android.material.internal.ParcelableSparseArray(parcel, (java.lang.ClassLoader) null);
            case org.chromium.net.UrlRequest$Status.DOWNLOADING_PAC_FILE /* 5 */:
                return new com.google.android.material.navigation.NavigationBarView.SavedState(parcel, (java.lang.ClassLoader) null);
            case org.chromium.net.UrlRequest$Status.RESOLVING_PROXY_FOR_URL /* 6 */:
                return new com.google.android.material.navigation.NavigationView.SavedState(parcel, (java.lang.ClassLoader) null);
            case org.chromium.net.UrlRequest$Status.RESOLVING_HOST_IN_PAC_FILE /* 7 */:
                return new com.google.android.material.navigationrail.NavigationRailView$SavedState(parcel, null);
            case org.chromium.net.UrlRequest$Status.ESTABLISHING_PROXY_TUNNEL /* 8 */:
                return new com.google.android.material.stateful.ExtendableSavedState(parcel, null);
            default:
                return new com.google.android.material.textfield.TextInputLayout.SavedState(parcel, null);
        }
    }

    @Override // android.os.Parcelable.Creator
    public final /* synthetic */ java.lang.Object[] newArray(int i) {
        switch (this.$cid) {
            case 0:
                return new com.google.android.material.bottomsheet.BottomSheetBehavior.SavedState[i];
            case 1:
                return new com.google.android.material.appbar.AppBarLayout.BaseBehavior.SavedState[i];
            case 2:
                return new com.google.android.material.button.MaterialButton.SavedState[i];
            case 3:
                return new com.google.android.material.internal.CheckableImageButton.SavedState[i];
            case org.chromium.net.UrlRequest$Status.WAITING_FOR_CACHE /* 4 */:
                return new com.google.android.material.internal.ParcelableSparseArray[i];
            case org.chromium.net.UrlRequest$Status.DOWNLOADING_PAC_FILE /* 5 */:
                return new com.google.android.material.navigation.NavigationBarView.SavedState[i];
            case org.chromium.net.UrlRequest$Status.RESOLVING_PROXY_FOR_URL /* 6 */:
                return new com.google.android.material.navigation.NavigationView.SavedState[i];
            case org.chromium.net.UrlRequest$Status.RESOLVING_HOST_IN_PAC_FILE /* 7 */:
                return new com.google.android.material.navigationrail.NavigationRailView$SavedState[i];
            case org.chromium.net.UrlRequest$Status.ESTABLISHING_PROXY_TUNNEL /* 8 */:
                return new com.google.android.material.stateful.ExtendableSavedState[i];
            default:
                return new com.google.android.material.textfield.TextInputLayout.SavedState[i];
        }
    }

    @Override // android.os.Parcelable.ClassLoaderCreator
    public final /* synthetic */ java.lang.Object createFromParcel(android.os.Parcel parcel, java.lang.ClassLoader classLoader) {
        switch (this.$cid) {
            case 0:
                return new com.google.android.material.bottomsheet.BottomSheetBehavior.SavedState(parcel, classLoader);
            case 1:
                return new com.google.android.material.appbar.AppBarLayout.BaseBehavior.SavedState(parcel, classLoader);
            case 2:
                return new com.google.android.material.button.MaterialButton.SavedState(parcel, classLoader);
            case 3:
                return new com.google.android.material.internal.CheckableImageButton.SavedState(parcel, classLoader);
            case org.chromium.net.UrlRequest$Status.WAITING_FOR_CACHE /* 4 */:
                return new com.google.android.material.internal.ParcelableSparseArray(parcel, classLoader);
            case org.chromium.net.UrlRequest$Status.DOWNLOADING_PAC_FILE /* 5 */:
                return new com.google.android.material.navigation.NavigationBarView.SavedState(parcel, classLoader);
            case org.chromium.net.UrlRequest$Status.RESOLVING_PROXY_FOR_URL /* 6 */:
                return new com.google.android.material.navigation.NavigationView.SavedState(parcel, classLoader);
            case org.chromium.net.UrlRequest$Status.RESOLVING_HOST_IN_PAC_FILE /* 7 */:
                return new com.google.android.material.navigationrail.NavigationRailView$SavedState(parcel, classLoader);
            case org.chromium.net.UrlRequest$Status.ESTABLISHING_PROXY_TUNNEL /* 8 */:
                return new com.google.android.material.stateful.ExtendableSavedState(parcel, classLoader);
            default:
                return new com.google.android.material.textfield.TextInputLayout.SavedState(parcel, classLoader);
        }
    }
}
