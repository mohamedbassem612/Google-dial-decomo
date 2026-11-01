package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes.dex */
public final class kw implements android.os.Parcelable.ClassLoaderCreator {
    private final /* synthetic */ int $cid;

    public kw(int i) {
        this.$cid = i;
    }

    public static final androidx.compose.ui.platform.ParcelableMapHolder a(android.os.Parcel parcel, java.lang.ClassLoader classLoader) {
        if (classLoader == null) {
            classLoader = androidx.compose.ui.platform.ParcelableMapHolder.class.getClassLoader();
        }
        int i = parcel.readInt();
        defpackage.adw adwVar = new defpackage.adw(i);
        for (int i2 = 0; i2 < i; i2++) {
            java.lang.String string = parcel.readString();
            if (string != null) {
                java.lang.Object value = parcel.readValue(classLoader);
                defpackage.aooh.d(value, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                adwVar.n(string, (java.util.List) value);
            }
        }
        return new androidx.compose.ui.platform.ParcelableMapHolder(adwVar.b());
    }

    public static final androidx.customview.view.AbsSavedState b(android.os.Parcel parcel, java.lang.ClassLoader classLoader) {
        if (parcel.readParcelable(classLoader) == null) {
            return androidx.customview.view.AbsSavedState.c;
        }
        throw new java.lang.IllegalStateException("superState must be null");
    }

    @Override // android.os.Parcelable.Creator
    public final /* synthetic */ java.lang.Object createFromParcel(android.os.Parcel parcel) {
        switch (this.$cid) {
            case 0:
                return new android.support.v7.widget.RecyclerView.SavedState(parcel, null);
            case 1:
                return new android.support.v4.app.Fragment.SavedState(parcel, (java.lang.ClassLoader) null);
            case 2:
                return new android.support.v7.widget.Toolbar.SavedState(parcel, null);
            case 3:
                return a(parcel, null);
            case 4:
                return new androidx.coordinatorlayout.widget.CoordinatorLayout.SavedState(parcel, null);
            case 5:
                return b(parcel, null);
            case defpackage.eft.STRING_SET_FIELD_NUMBER /* 6 */:
                return new androidx.drawerlayout.widget.DrawerLayout.SavedState(parcel, null);
            case defpackage.eft.DOUBLE_FIELD_NUMBER /* 7 */:
                return new androidx.viewpager.widget.ViewPager.SavedState(parcel, (java.lang.ClassLoader) null);
            case defpackage.eft.BYTES_FIELD_NUMBER /* 8 */:
                return new com.google.android.material.search.SearchBar.SavedState(parcel, null);
            default:
                return new com.google.android.material.search.SearchView.SavedState(parcel, (java.lang.ClassLoader) null);
        }
    }

    @Override // android.os.Parcelable.Creator
    public final /* synthetic */ java.lang.Object[] newArray(int i) {
        switch (this.$cid) {
            case 0:
                return new android.support.v7.widget.RecyclerView.SavedState[i];
            case 1:
                return new android.support.v4.app.Fragment.SavedState[i];
            case 2:
                return new android.support.v7.widget.Toolbar.SavedState[i];
            case 3:
                return new androidx.compose.ui.platform.ParcelableMapHolder[i];
            case 4:
                return new androidx.coordinatorlayout.widget.CoordinatorLayout.SavedState[i];
            case 5:
                return new androidx.customview.view.AbsSavedState[i];
            case defpackage.eft.STRING_SET_FIELD_NUMBER /* 6 */:
                return new androidx.drawerlayout.widget.DrawerLayout.SavedState[i];
            case defpackage.eft.DOUBLE_FIELD_NUMBER /* 7 */:
                return new androidx.viewpager.widget.ViewPager.SavedState[i];
            case defpackage.eft.BYTES_FIELD_NUMBER /* 8 */:
                return new com.google.android.material.search.SearchBar.SavedState[i];
            default:
                return new com.google.android.material.search.SearchView.SavedState[i];
        }
    }

    @Override // android.os.Parcelable.ClassLoaderCreator
    public final /* synthetic */ java.lang.Object createFromParcel(android.os.Parcel parcel, java.lang.ClassLoader classLoader) {
        switch (this.$cid) {
            case 0:
                return new android.support.v7.widget.RecyclerView.SavedState(parcel, classLoader);
            case 1:
                return new android.support.v4.app.Fragment.SavedState(parcel, classLoader);
            case 2:
                return new android.support.v7.widget.Toolbar.SavedState(parcel, classLoader);
            case 3:
                return a(parcel, classLoader);
            case 4:
                return new androidx.coordinatorlayout.widget.CoordinatorLayout.SavedState(parcel, classLoader);
            case 5:
                return b(parcel, classLoader);
            case defpackage.eft.STRING_SET_FIELD_NUMBER /* 6 */:
                return new androidx.drawerlayout.widget.DrawerLayout.SavedState(parcel, classLoader);
            case defpackage.eft.DOUBLE_FIELD_NUMBER /* 7 */:
                return new androidx.viewpager.widget.ViewPager.SavedState(parcel, classLoader);
            case defpackage.eft.BYTES_FIELD_NUMBER /* 8 */:
                return new com.google.android.material.search.SearchBar.SavedState(parcel, classLoader);
            default:
                return new com.google.android.material.search.SearchView.SavedState(parcel, classLoader);
        }
    }
}
