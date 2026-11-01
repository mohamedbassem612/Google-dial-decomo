package android.support.v7.widget;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes2.dex */
public class ActionMenuPresenter$SavedState implements android.os.Parcelable {
    public static final android.os.Parcelable.Creator CREATOR = new defpackage.v(6);
    public int a;

    public ActionMenuPresenter$SavedState(android.os.Parcel parcel) {
        this.a = parcel.readInt();
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(android.os.Parcel parcel, int i) {
        parcel.writeInt(this.a);
    }

    public ActionMenuPresenter$SavedState() {
    }
}
