package com.google.android.gms.people.cpg.callingcard;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes3.dex */
public final class CallingCardMetadata extends com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable {
    public static final android.os.Parcelable.Creator CREATOR = new defpackage.aalx(6);
    public final com.google.android.gms.people.cpg.callingcard.CallingCardFontData a;
    public final com.google.android.gms.people.cpg.callingcard.CallingCardFullScreenImageData b;

    public CallingCardMetadata(com.google.android.gms.people.cpg.callingcard.CallingCardFontData callingCardFontData, com.google.android.gms.people.cpg.callingcard.CallingCardFullScreenImageData callingCardFullScreenImageData) {
        this.a = callingCardFontData;
        this.b = callingCardFullScreenImageData;
    }

    public final boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof com.google.android.gms.people.cpg.callingcard.CallingCardMetadata) {
            com.google.android.gms.people.cpg.callingcard.CallingCardMetadata callingCardMetadata = (com.google.android.gms.people.cpg.callingcard.CallingCardMetadata) obj;
            if (j$.util.Objects.equals(this.a, callingCardMetadata.a) && j$.util.Objects.equals(this.b, callingCardMetadata.b)) {
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
