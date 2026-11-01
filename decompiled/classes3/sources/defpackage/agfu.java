package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes3.dex */
public final class agfu implements android.os.Parcelable.Creator {
    @Override // android.os.Parcelable.Creator
    public final /* bridge */ /* synthetic */ java.lang.Object createFromParcel(android.os.Parcel parcel) {
        return new com.google.android.setupcompat.logging.CustomEvent(parcel.readLong(), (com.google.android.setupcompat.logging.MetricKey) parcel.readParcelable(com.google.android.setupcompat.logging.MetricKey.class.getClassLoader()), parcel.readPersistableBundle(com.google.android.setupcompat.logging.MetricKey.class.getClassLoader()), parcel.readPersistableBundle(com.google.android.setupcompat.logging.MetricKey.class.getClassLoader()));
    }

    @Override // android.os.Parcelable.Creator
    public final /* synthetic */ java.lang.Object[] newArray(int i) {
        return new com.google.android.setupcompat.logging.CustomEvent[i];
    }
}
