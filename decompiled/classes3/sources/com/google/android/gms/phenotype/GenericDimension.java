package com.google.android.gms.phenotype;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes3.dex */
public class GenericDimension extends com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable implements java.lang.Comparable {
    public static final android.os.Parcelable.Creator CREATOR = new defpackage.aask(15);
    public final int a;
    public final int b;

    public GenericDimension(int i, int i2) {
        this.a = i;
        this.b = i2;
    }

    @Override // java.lang.Comparable
    /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
    public final int compareTo(com.google.android.gms.phenotype.GenericDimension genericDimension) {
        int i = this.a;
        int i2 = genericDimension.a;
        if (i < i2) {
            return -1;
        }
        if (i <= i2) {
            int i3 = this.b;
            int i4 = genericDimension.b;
            if (i3 < i4) {
                return -1;
            }
            if (i3 <= i4) {
                return 0;
            }
        }
        return 1;
    }

    public final boolean equals(java.lang.Object obj) {
        return (obj instanceof com.google.android.gms.phenotype.GenericDimension) && compareTo((com.google.android.gms.phenotype.GenericDimension) obj) == 0;
    }

    public final int hashCode() {
        return (this.a * 31) + this.b;
    }

    public final java.lang.String toString() {
        return "GenericDimension(" + this.a + ", " + this.b + ')';
    }

    public final void writeToParcel(android.os.Parcel parcel, int i) {
        int iF = aais.f(parcel, 20293);
        aais.l(parcel, 1, this.a);
        aais.l(parcel, 2, this.b);
        aais.g(parcel, iF);
    }
}
