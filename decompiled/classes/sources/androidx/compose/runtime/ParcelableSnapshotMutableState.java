package androidx.compose.runtime;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes.dex */
public final class ParcelableSnapshotMutableState extends defpackage.cem implements android.os.Parcelable {
    public static final android.os.Parcelable.Creator CREATOR = new defpackage.ccv();

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(android.os.Parcel parcel, int i) {
        int i2;
        parcel.writeValue(a());
        defpackage.cen cenVar = ((defpackage.cem) this).a;
        if (defpackage.aooh.n(cenVar, defpackage.cdu.b)) {
            i2 = 0;
        } else if (defpackage.aooh.n(cenVar, defpackage.cdu.c)) {
            i2 = 1;
        } else {
            if (!defpackage.aooh.n(cenVar, defpackage.cdu.a)) {
                throw new java.lang.IllegalStateException("Only known types of MutableState's SnapshotMutationPolicy are supported");
            }
            i2 = 2;
        }
        parcel.writeInt(i2);
    }
}
