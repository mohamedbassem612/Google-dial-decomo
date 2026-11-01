package com.google.android.gms.people.cpg.callingcard.v2;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes3.dex */
public final class PurgeCallingCardsRequest extends com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable {
    public static final android.os.Parcelable.Creator CREATOR = new defpackage.aalx(19);
    public final int a;

    public PurgeCallingCardsRequest(int i) {
        this.a = i;
    }

    public final boolean equals(java.lang.Object obj) {
        if (this != obj) {
            return (obj instanceof com.google.android.gms.people.cpg.callingcard.v2.PurgeCallingCardsRequest) && this.a == ((com.google.android.gms.people.cpg.callingcard.v2.PurgeCallingCardsRequest) obj).a;
        }
        return true;
    }

    public final int hashCode() {
        return this.a;
    }

    public final void writeToParcel(android.os.Parcel parcel, int i) {
        int i2 = this.a;
        int iF = aais.f(parcel, 20293);
        aais.l(parcel, 1, i2);
        aais.g(parcel, iF);
    }
}
