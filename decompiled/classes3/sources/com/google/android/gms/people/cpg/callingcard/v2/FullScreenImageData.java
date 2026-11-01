package com.google.android.gms.people.cpg.callingcard.v2;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes3.dex */
public final class FullScreenImageData extends com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable {
    public static final android.os.Parcelable.Creator CREATOR = new defpackage.aalx(15);
    public final java.lang.Float a;
    public final java.lang.Float b;
    public final java.lang.Float c;

    public FullScreenImageData(java.lang.Float f, java.lang.Float f2, java.lang.Float f3) {
        this.a = f;
        this.b = f2;
        this.c = f3;
    }

    public final boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof com.google.android.gms.people.cpg.callingcard.v2.FullScreenImageData) {
            com.google.android.gms.people.cpg.callingcard.v2.FullScreenImageData fullScreenImageData = (com.google.android.gms.people.cpg.callingcard.v2.FullScreenImageData) obj;
            if (j$.util.Objects.equals(this.a, fullScreenImageData.a) && j$.util.Objects.equals(this.b, fullScreenImageData.b) && j$.util.Objects.equals(this.c, fullScreenImageData.c)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return j$.util.Objects.hash(new java.lang.Object[]{this.a, this.b, this.c});
    }

    public final void writeToParcel(android.os.Parcel parcel, int i) {
        java.lang.Float f = this.a;
        int iF = aais.f(parcel, 20293);
        aais.t(parcel, 1, f);
        aais.t(parcel, 2, this.b);
        aais.t(parcel, 3, this.c);
        aais.g(parcel, iF);
    }
}
