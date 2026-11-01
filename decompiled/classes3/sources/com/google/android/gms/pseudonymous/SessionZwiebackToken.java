package com.google.android.gms.pseudonymous;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes3.dex */
public final class SessionZwiebackToken extends com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable {
    public static final android.os.Parcelable.Creator CREATOR = new defpackage.aask(18);
    private final java.lang.String a;
    private final java.lang.String b;

    public SessionZwiebackToken(android.os.Parcel parcel) {
        this.a = parcel.readString();
        java.lang.String string = parcel.readString();
        aais.as(string);
        this.b = string;
    }

    public final boolean equals(java.lang.Object obj) {
        if (!(obj instanceof com.google.android.gms.pseudonymous.SessionZwiebackToken)) {
            return false;
        }
        com.google.android.gms.pseudonymous.SessionZwiebackToken sessionZwiebackToken = (com.google.android.gms.pseudonymous.SessionZwiebackToken) obj;
        return j$.util.Objects.equals(this.a, sessionZwiebackToken.a) && j$.util.Objects.equals(this.b, sessionZwiebackToken.b);
    }

    public final int hashCode() {
        return j$.util.Objects.hash(new java.lang.Object[]{this.a, this.b});
    }

    public final void writeToParcel(android.os.Parcel parcel, int i) {
        parcel.writeString(this.a);
        parcel.writeString(this.b);
    }
}
