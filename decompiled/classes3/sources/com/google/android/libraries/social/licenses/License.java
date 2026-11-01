package com.google.android.libraries.social.licenses;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes3.dex */
public final class License implements java.lang.Comparable, android.os.Parcelable {
    public static final android.os.Parcelable.Creator CREATOR = new defpackage.acay(8);
    public final java.lang.String a;
    public final long b;
    public final int c;

    public License(android.os.Parcel parcel) {
        this.a = parcel.readString();
        this.b = parcel.readLong();
        this.c = parcel.readInt();
    }

    @Override // java.lang.Comparable
    public final /* bridge */ /* synthetic */ int compareTo(java.lang.Object obj) {
        return this.a.compareTo(((com.google.android.libraries.social.licenses.License) obj).a);
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(java.lang.Object obj) {
        if (obj instanceof com.google.android.libraries.social.licenses.License) {
            return this.a.equals(((com.google.android.libraries.social.licenses.License) obj).a);
        }
        return false;
    }

    public final int hashCode() {
        return this.a.hashCode();
    }

    public final java.lang.String toString() {
        return this.a;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(android.os.Parcel parcel, int i) {
        parcel.writeString(this.a);
        parcel.writeLong(this.b);
        parcel.writeInt(this.c);
    }

    public License(java.lang.String str, long j, int i) {
        this.a = str;
        this.b = j;
        this.c = i;
    }
}
