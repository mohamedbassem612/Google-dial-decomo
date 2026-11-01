package com.google.android.gms.libs.identity;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes3.dex */
public final class ClientIdentity extends com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable {
    public static final android.os.Parcelable.Creator CREATOR = new defpackage.aalp(7);
    public final int a;
    public final java.lang.String b;
    public final java.lang.String c;
    public final java.lang.String d;
    public final java.util.List e;
    public final com.google.android.gms.libs.identity.ClientIdentity f;

    static {
        android.os.Process.myUid();
        android.os.Process.myPid();
    }

    public ClientIdentity(int i, java.lang.String str, java.lang.String str2, java.lang.String str3, java.util.List list, com.google.android.gms.libs.identity.ClientIdentity clientIdentity) {
        if (clientIdentity != null && clientIdentity.a()) {
            throw new java.lang.IllegalArgumentException("Failed requirement.");
        }
        this.a = i;
        this.b = str;
        this.c = str2;
        if (str3 == null) {
            str3 = clientIdentity != null ? clientIdentity.d : null;
        }
        this.d = str3;
        if (list == null) {
            list = clientIdentity != null ? clientIdentity.e : null;
            if (list == null) {
                list = aike.a;
                aooh.e(list, "of(...)");
            }
        }
        this.e = ahvr.bv(list);
        this.f = clientIdentity;
    }

    public final boolean a() {
        return this.f != null;
    }

    public final boolean equals(java.lang.Object obj) {
        if (!(obj instanceof com.google.android.gms.libs.identity.ClientIdentity)) {
            return false;
        }
        com.google.android.gms.libs.identity.ClientIdentity clientIdentity = (com.google.android.gms.libs.identity.ClientIdentity) obj;
        return this.a == clientIdentity.a && aooh.n(this.b, clientIdentity.b) && aooh.n(this.c, clientIdentity.c) && aooh.n(this.d, clientIdentity.d) && aooh.n(this.f, clientIdentity.f) && aooh.n(this.e, clientIdentity.e);
    }

    public final int hashCode() {
        return j$.util.Objects.hash(new java.lang.Object[]{java.lang.Integer.valueOf(this.a), this.b, this.c, this.d, this.f});
    }

    public final java.lang.String toString() {
        java.lang.String str = this.b;
        int length = str.length() + 18;
        java.lang.String str2 = this.c;
        java.lang.StringBuilder sb = new java.lang.StringBuilder(length + (str2 != null ? str2.length() : 0));
        sb.append(this.a);
        sb.append('/');
        sb.append(str);
        if (str2 != null) {
            sb.append('[');
            if (aoov.ad(str2, str)) {
                sb.append((java.lang.CharSequence) str2, str.length(), str2.length());
            } else {
                sb.append(str2);
            }
            sb.append(']');
        }
        java.lang.String str3 = this.d;
        if (str3 != null) {
            sb.append('/');
            sb.append(java.lang.Integer.toHexString(str3.hashCode()));
        }
        return sb.toString();
    }

    public final void writeToParcel(android.os.Parcel parcel, int i) {
        aooh.f(parcel, "dest");
        int i2 = this.a;
        int iF = aais.f(parcel, 20293);
        aais.l(parcel, 1, i2);
        aais.A(parcel, 3, this.b);
        aais.A(parcel, 4, this.c);
        aais.A(parcel, 6, this.d);
        aais.z(parcel, 7, this.f, i);
        aais.E(parcel, 8, this.e);
        aais.g(parcel, iF);
    }
}
