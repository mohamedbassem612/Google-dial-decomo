package com.google.android.gms.people.cpg.callingcard.v2;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes3.dex */
public class AccountInfo extends com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable {
    public static final android.os.Parcelable.Creator CREATOR = new defpackage.aalx(11);
    public final java.lang.String a;
    public final java.lang.String b;
    public final java.lang.String c;

    public AccountInfo(java.lang.String str, java.lang.String str2, java.lang.String str3) {
        this.a = str;
        this.b = str2;
        this.c = str3;
    }

    public final boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof com.google.android.gms.people.cpg.callingcard.v2.AccountInfo) {
            com.google.android.gms.people.cpg.callingcard.v2.AccountInfo accountInfo = (com.google.android.gms.people.cpg.callingcard.v2.AccountInfo) obj;
            if (j$.util.Objects.equals(this.a, accountInfo.a) && j$.util.Objects.equals(this.b, accountInfo.b) && j$.util.Objects.equals(this.c, accountInfo.c)) {
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
