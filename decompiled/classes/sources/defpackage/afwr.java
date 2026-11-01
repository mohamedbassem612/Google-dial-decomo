package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes.dex */
public final class afwr implements android.os.Parcelable.Creator {
    private final /* synthetic */ int $cid;

    public afwr(int i) {
        this.$cid = i;
    }

    @Override // android.os.Parcelable.Creator
    public final /* synthetic */ java.lang.Object createFromParcel(android.os.Parcel parcel) {
        int i = this.$cid;
        if (i != 0) {
            return i != 1 ? new com.google.android.material.slider.BaseSlider.SliderState(parcel) : new com.google.android.material.badge.BadgeState.State(parcel);
        }
        return new com.google.android.material.navigation.NavigationBarPresenter$SavedState(parcel);
    }

    @Override // android.os.Parcelable.Creator
    public final /* synthetic */ java.lang.Object[] newArray(int i) {
        int i2 = this.$cid;
        if (i2 != 0) {
            return i2 != 1 ? new com.google.android.material.slider.BaseSlider.SliderState[i] : new com.google.android.material.badge.BadgeState.State[i];
        }
        return new com.google.android.material.navigation.NavigationBarPresenter$SavedState[i];
    }
}
