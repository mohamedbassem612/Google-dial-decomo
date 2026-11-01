package com.google.android.gms.wearable.internal;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes3.dex */
public class BooleanResponse extends com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable {
    public static final android.os.Parcelable.Creator CREATOR = new defpackage.aawm(4);
    public final int a;
    public final boolean b;

    public BooleanResponse(int i, boolean z) {
        this.a = i;
        this.b = z;
    }

    public final boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof com.google.android.gms.wearable.internal.BooleanResponse) {
            com.google.android.gms.wearable.internal.BooleanResponse booleanResponse = (com.google.android.gms.wearable.internal.BooleanResponse) obj;
            if (this.a == booleanResponse.a && this.b == booleanResponse.b) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return j$.util.Objects.hash(new java.lang.Object[]{java.lang.Integer.valueOf(this.a), java.lang.Boolean.valueOf(this.b)});
    }

    public final void writeToParcel(android.os.Parcel parcel, int i) {
        int iF = aais.f(parcel, 20293);
        aais.l(parcel, 1, this.a);
        aais.h(parcel, 2, this.b);
        aais.g(parcel, iF);
    }
}
