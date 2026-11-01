package com.google.android.gms.people.cpg.callingcard;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes3.dex */
public final class CallingCardFullScreenImageData extends com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable {
    public static final android.os.Parcelable.Creator CREATOR = new defpackage.aalx(4);
    public final float a;
    public final float b;
    public final float c;

    public CallingCardFullScreenImageData(float f, float f2, float f3) {
        this.a = f;
        this.b = f2;
        this.c = f3;
    }

    public final boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof com.google.android.gms.people.cpg.callingcard.CallingCardFullScreenImageData) {
            com.google.android.gms.people.cpg.callingcard.CallingCardFullScreenImageData callingCardFullScreenImageData = (com.google.android.gms.people.cpg.callingcard.CallingCardFullScreenImageData) obj;
            if (this.a == callingCardFullScreenImageData.a && this.b == callingCardFullScreenImageData.b && this.c == callingCardFullScreenImageData.c) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return j$.util.Objects.hash(new java.lang.Object[]{java.lang.Float.valueOf(this.a), java.lang.Float.valueOf(this.b), java.lang.Float.valueOf(this.c)});
    }

    public final void writeToParcel(android.os.Parcel parcel, int i) {
        float f = this.a;
        int iF = aais.f(parcel, 20293);
        aais.k(parcel, 1, f);
        aais.k(parcel, 2, this.b);
        aais.k(parcel, 3, this.c);
        aais.g(parcel, iF);
    }
}
