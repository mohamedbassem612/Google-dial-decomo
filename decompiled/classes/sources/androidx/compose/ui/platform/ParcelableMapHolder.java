package androidx.compose.ui.platform;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes.dex */
public final class ParcelableMapHolder implements android.os.Parcelable {
    public static final android.os.Parcelable.Creator CREATOR = new defpackage.kw(3);
    public final java.util.Map a;

    public ParcelableMapHolder(java.util.Map map) {
        this.a = map;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(android.os.Parcel parcel, int i) {
        java.util.Map map = this.a;
        parcel.writeInt(map.size());
        for (java.util.Map.Entry entry : map.entrySet()) {
            java.lang.String str = (java.lang.String) entry.getKey();
            java.util.List list = (java.util.List) entry.getValue();
            parcel.writeString(str);
            parcel.writeValue(list);
        }
    }
}
