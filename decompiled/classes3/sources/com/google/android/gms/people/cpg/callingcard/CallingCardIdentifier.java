package com.google.android.gms.people.cpg.callingcard;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes3.dex */
public class CallingCardIdentifier extends com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable implements com.google.android.gms.common.internal.ReflectedParcelable {
    public static final android.os.Parcelable.Creator CREATOR = new defpackage.aalx(5);
    public final long a;

    public CallingCardIdentifier(long j) {
        this.a = j;
    }

    public final boolean equals(java.lang.Object obj) {
        if (this != obj) {
            return (obj instanceof com.google.android.gms.people.cpg.callingcard.CallingCardIdentifier) && this.a == ((com.google.android.gms.people.cpg.callingcard.CallingCardIdentifier) obj).a;
        }
        return true;
    }

    public final int hashCode() {
        long j = this.a;
        return (int) (j ^ (j >>> 32));
    }

    public final void writeToParcel(android.os.Parcel parcel, int i) {
        long j = this.a;
        int iF = aais.f(parcel, 20293);
        aais.m(parcel, 1, j);
        aais.g(parcel, iF);
    }
}
