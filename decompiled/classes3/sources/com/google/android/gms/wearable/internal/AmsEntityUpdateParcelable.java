package com.google.android.gms.wearable.internal;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes3.dex */
public class AmsEntityUpdateParcelable extends com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable {
    public static final android.os.Parcelable.Creator CREATOR = new defpackage.aatx(20);
    public final byte a;
    public final byte b;
    public final java.lang.String c;

    public AmsEntityUpdateParcelable(byte b, byte b2, java.lang.String str) {
        this.a = b;
        this.b = b2;
        this.c = str;
    }

    public final boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && getClass() == obj.getClass()) {
            com.google.android.gms.wearable.internal.AmsEntityUpdateParcelable amsEntityUpdateParcelable = (com.google.android.gms.wearable.internal.AmsEntityUpdateParcelable) obj;
            if (this.a == amsEntityUpdateParcelable.a && this.b == amsEntityUpdateParcelable.b && this.c.equals(amsEntityUpdateParcelable.c)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return ((((this.a + 31) * 31) + this.b) * 31) + this.c.hashCode();
    }

    public final java.lang.String toString() {
        return "AmsEntityUpdateParcelable{, mEntityId=" + ((int) this.a) + ", mAttributeId=" + ((int) this.b) + ", mValue='" + this.c + "'}";
    }

    public final void writeToParcel(android.os.Parcel parcel, int i) {
        int iF = aais.f(parcel, 20293);
        aais.i(parcel, 2, this.a);
        aais.i(parcel, 3, this.b);
        aais.A(parcel, 4, this.c);
        aais.g(parcel, iF);
    }
}
