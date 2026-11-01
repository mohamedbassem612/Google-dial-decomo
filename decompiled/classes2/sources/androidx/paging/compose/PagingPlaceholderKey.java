package androidx.paging.compose;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes2.dex */
public final class PagingPlaceholderKey implements android.os.Parcelable {
    public static final android.os.Parcelable.Creator CREATOR = new defpackage.v(20);
    private final int a;

    public PagingPlaceholderKey(int i) {
        this.a = i;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(java.lang.Object obj) {
        if (this != obj) {
            return (obj instanceof androidx.paging.compose.PagingPlaceholderKey) && this.a == ((androidx.paging.compose.PagingPlaceholderKey) obj).a;
        }
        return true;
    }

    public final int hashCode() {
        return this.a;
    }

    public final java.lang.String toString() {
        return "PagingPlaceholderKey(index=" + this.a + ')';
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(android.os.Parcel parcel, int i) {
        parcel.writeInt(this.a);
    }
}
