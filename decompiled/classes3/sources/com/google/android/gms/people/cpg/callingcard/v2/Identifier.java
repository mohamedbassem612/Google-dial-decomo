package com.google.android.gms.people.cpg.callingcard.v2;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes3.dex */
public class Identifier extends com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable implements com.google.android.gms.common.internal.ReflectedParcelable {
    public static final android.os.Parcelable.Creator CREATOR = new defpackage.aalx(17);
    public final int a;
    public final java.lang.Long b;
    public final java.lang.String c;
    public final com.google.android.gms.people.cpg.callingcard.v2.AccountInfo d;

    public Identifier(int i, java.lang.Long l, java.lang.String str, com.google.android.gms.people.cpg.callingcard.v2.AccountInfo accountInfo) {
        this.a = i;
        this.b = l;
        this.c = str;
        this.d = accountInfo;
    }

    public final boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof com.google.android.gms.people.cpg.callingcard.v2.Identifier) {
            com.google.android.gms.people.cpg.callingcard.v2.Identifier identifier = (com.google.android.gms.people.cpg.callingcard.v2.Identifier) obj;
            if (this.a == identifier.a && j$.util.Objects.equals(this.b, identifier.b) && j$.util.Objects.equals(this.c, identifier.c) && j$.util.Objects.equals(this.d, identifier.d)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return j$.util.Objects.hash(new java.lang.Object[]{java.lang.Integer.valueOf(this.a), this.b, this.c, this.d});
    }

    public final void writeToParcel(android.os.Parcel parcel, int i) {
        int i2 = this.a;
        int iF = aais.f(parcel, 20293);
        aais.l(parcel, 1, i2);
        aais.y(parcel, 2, this.b);
        aais.A(parcel, 3, this.c);
        aais.z(parcel, 4, this.d, i | 1);
        aais.g(parcel, iF);
    }
}
