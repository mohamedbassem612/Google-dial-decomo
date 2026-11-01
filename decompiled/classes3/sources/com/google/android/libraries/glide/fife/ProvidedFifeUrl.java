package com.google.android.libraries.glide.fife;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes3.dex */
public final class ProvidedFifeUrl implements com.google.android.libraries.glide.fife.FifeUrl {
    public static final android.os.Parcelable.Creator CREATOR = new defpackage.acay(1);
    public final java.lang.String b;

    public ProvidedFifeUrl(java.lang.String str) {
        if (!defpackage.afbo.a(str)) {
            throw new java.lang.IllegalArgumentException("baseUrl is not a fife Url: ".concat(java.lang.String.valueOf(str)));
        }
        this.b = str;
    }

    @Override // defpackage.xuo
    public final void a(java.security.MessageDigest messageDigest) {
        throw new java.lang.UnsupportedOperationException();
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    @Override // defpackage.xuo
    public final boolean equals(java.lang.Object obj) {
        if (obj instanceof com.google.android.libraries.glide.fife.ProvidedFifeUrl) {
            return this.b.equals(((com.google.android.libraries.glide.fife.ProvidedFifeUrl) obj).b);
        }
        return false;
    }

    @Override // defpackage.xuo
    public final int hashCode() {
        return this.b.hashCode();
    }

    public final java.lang.String toString() {
        return "ProvidedFifeUrl{baseUrl='" + this.b + "'}";
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(android.os.Parcel parcel, int i) {
        parcel.writeString(this.b);
    }

    public ProvidedFifeUrl(android.os.Parcel parcel) {
        this.b = parcel.readString();
    }
}
