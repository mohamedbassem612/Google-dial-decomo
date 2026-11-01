package androidx.compose.foundation.lazy.layout;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes.dex */
public final class DefaultLazyKey implements android.os.Parcelable {
    public static final android.os.Parcelable.Creator CREATOR = new defpackage.ccu(1);
    private final int a;

    public DefaultLazyKey(int i) {
        this.a = i;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(java.lang.Object obj) {
        if (this != obj) {
            return (obj instanceof androidx.compose.foundation.lazy.layout.DefaultLazyKey) && this.a == ((androidx.compose.foundation.lazy.layout.DefaultLazyKey) obj).a;
        }
        return true;
    }

    public final int hashCode() {
        return this.a;
    }

    public final java.lang.String toString() {
        return "DefaultLazyKey(index=" + this.a + ')';
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(android.os.Parcel parcel, int i) {
        parcel.writeInt(this.a);
    }
}
