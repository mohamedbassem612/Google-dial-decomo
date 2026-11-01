package com.google.android.gms.people.cpg.callingcard.v2;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes3.dex */
public final class Metadata extends com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable {
    public static final android.os.Parcelable.Creator CREATOR = new defpackage.aalx(18);
    public final com.google.android.gms.people.cpg.callingcard.v2.FontData a;
    public final com.google.android.gms.people.cpg.callingcard.v2.FullScreenImageData b;

    public Metadata(com.google.android.gms.people.cpg.callingcard.v2.FontData fontData, com.google.android.gms.people.cpg.callingcard.v2.FullScreenImageData fullScreenImageData) {
        this.a = fontData;
        this.b = fullScreenImageData;
    }

    public final boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof com.google.android.gms.people.cpg.callingcard.v2.Metadata) {
            com.google.android.gms.people.cpg.callingcard.v2.Metadata metadata = (com.google.android.gms.people.cpg.callingcard.v2.Metadata) obj;
            if (j$.util.Objects.equals(this.a, metadata.a) && j$.util.Objects.equals(this.b, metadata.b)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return j$.util.Objects.hash(new java.lang.Object[]{this.a, this.b});
    }

    public final void writeToParcel(android.os.Parcel parcel, int i) {
        com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable abstractSafeParcelable = this.a;
        int iF = aais.f(parcel, 20293);
        aais.z(parcel, 1, abstractSafeParcelable, i);
        aais.z(parcel, 2, this.b, i);
        aais.g(parcel, iF);
    }
}
