package com.google.android.gms.people.cpg.cpgex;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes3.dex */
public final class CpgExFeatureSupportResult extends com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable implements com.google.android.gms.common.internal.ReflectedParcelable {
    public static final android.os.Parcelable.Creator CREATOR = new defpackage.aarr(5);
    public final int a;
    public final boolean b;

    public CpgExFeatureSupportResult(int i, boolean z) {
        this.a = i;
        this.b = z;
    }

    public final boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof com.google.android.gms.people.cpg.cpgex.CpgExFeatureSupportResult) {
            com.google.android.gms.people.cpg.cpgex.CpgExFeatureSupportResult cpgExFeatureSupportResult = (com.google.android.gms.people.cpg.cpgex.CpgExFeatureSupportResult) obj;
            if (this.a == cpgExFeatureSupportResult.a && this.b == cpgExFeatureSupportResult.b) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return j$.util.Objects.hash(new java.lang.Object[]{java.lang.Integer.valueOf(this.a), java.lang.Boolean.valueOf(this.b)});
    }

    public final void writeToParcel(android.os.Parcel parcel, int i) {
        int i2 = this.a;
        int iF = aais.f(parcel, 20293);
        aais.l(parcel, 1, i2);
        aais.h(parcel, 2, this.b);
        aais.g(parcel, iF);
    }
}
