package com.google.android.gms.people.cpg.cpgex;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes3.dex */
public final class Account extends com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable implements com.google.android.gms.common.internal.ReflectedParcelable {
    public static final android.os.Parcelable.Creator CREATOR = new defpackage.aarr(0);
    public final java.lang.String a;
    public final java.lang.String b;
    public final java.lang.String c;

    public Account(java.lang.String str, java.lang.String str2, java.lang.String str3) {
        this.a = str;
        this.b = str2;
        this.c = str3;
    }

    public final boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof com.google.android.gms.people.cpg.cpgex.Account) {
            com.google.android.gms.people.cpg.cpgex.Account account = (com.google.android.gms.people.cpg.cpgex.Account) obj;
            if (j$.util.Objects.equals(this.a, account.a) && j$.util.Objects.equals(this.b, account.b) && j$.util.Objects.equals(this.c, account.c)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return j$.util.Objects.hash(new java.lang.Object[]{this.a, this.b, this.c});
    }

    public final void writeToParcel(android.os.Parcel parcel, int i) {
        java.lang.String str = this.a;
        int iF = aais.f(parcel, 20293);
        aais.A(parcel, 1, str);
        aais.A(parcel, 2, this.b);
        aais.A(parcel, 3, this.c);
        aais.g(parcel, iF);
    }
}
