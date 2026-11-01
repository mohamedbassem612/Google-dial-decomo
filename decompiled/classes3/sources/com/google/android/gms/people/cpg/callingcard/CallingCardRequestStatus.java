package com.google.android.gms.people.cpg.callingcard;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes3.dex */
public class CallingCardRequestStatus extends com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable implements com.google.android.gms.common.internal.ReflectedParcelable {
    public static final android.os.Parcelable.Creator CREATOR = new defpackage.aalx(7);
    public final int a;

    public CallingCardRequestStatus(int i) {
        this.a = i;
    }

    public final boolean equals(java.lang.Object obj) {
        if (this != obj) {
            return (obj instanceof com.google.android.gms.people.cpg.callingcard.CallingCardRequestStatus) && this.a == ((com.google.android.gms.people.cpg.callingcard.CallingCardRequestStatus) obj).a;
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
