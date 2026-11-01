package com.google.android.gms.wearable.internal;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes3.dex */
public class AccountConsentRecordParcelable extends com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable {
    public static final android.os.Parcelable.Creator CREATOR = new defpackage.aatx(17);
    public final java.lang.String a;
    private final boolean b;

    public AccountConsentRecordParcelable(java.lang.String str, boolean z) {
        this.a = str;
        this.b = z;
    }

    public final boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof com.google.android.gms.wearable.internal.AccountConsentRecordParcelable) {
            com.google.android.gms.wearable.internal.AccountConsentRecordParcelable accountConsentRecordParcelable = (com.google.android.gms.wearable.internal.AccountConsentRecordParcelable) obj;
            if (this.a.equals(accountConsentRecordParcelable.a) && this.b == accountConsentRecordParcelable.b) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return j$.util.Objects.hash(new java.lang.Object[]{this.a, java.lang.Boolean.valueOf(this.b)});
    }

    public final void writeToParcel(android.os.Parcel parcel, int i) {
        java.lang.String str = this.a;
        int iF = aais.f(parcel, 20293);
        aais.A(parcel, 1, str);
        boolean z = this.b;
        java.lang.Boolean.valueOf(z).getClass();
        aais.h(parcel, 2, z);
        aais.g(parcel, iF);
    }
}
