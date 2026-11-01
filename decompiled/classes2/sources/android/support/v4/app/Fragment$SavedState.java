package android.support.v4.app;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes2.dex */
public class Fragment$SavedState implements android.os.Parcelable {
    public static final android.os.Parcelable.Creator CREATOR = new kw(1);
    public final android.os.Bundle a;

    public Fragment$SavedState(android.os.Parcel parcel, java.lang.ClassLoader classLoader) {
        android.os.Bundle bundle = parcel.readBundle();
        this.a = bundle;
        if (classLoader == null || bundle == null) {
            return;
        }
        bundle.setClassLoader(classLoader);
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(android.os.Parcel parcel, int i) {
        parcel.writeBundle(this.a);
    }

    public Fragment$SavedState(android.os.Bundle bundle) {
        this.a = bundle;
    }
}
