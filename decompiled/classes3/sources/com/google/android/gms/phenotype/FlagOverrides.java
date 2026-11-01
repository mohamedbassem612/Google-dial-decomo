package com.google.android.gms.phenotype;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes3.dex */
public class FlagOverrides extends com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable {
    public static final android.os.Parcelable.Creator CREATOR = new defpackage.aask(14);
    public final java.util.List a;

    public FlagOverrides(java.util.List list) {
        this.a = list;
    }

    public final boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof com.google.android.gms.phenotype.FlagOverrides) {
            return this.a.equals(((com.google.android.gms.phenotype.FlagOverrides) obj).a);
        }
        return false;
    }

    public final java.lang.String toString() {
        java.lang.StringBuilder sb = new java.lang.StringBuilder("FlagOverrides(");
        boolean z = true;
        for (com.google.android.gms.phenotype.FlagOverride flagOverride : this.a) {
            if (!z) {
                sb.append(", ");
            }
            flagOverride.a(sb);
            z = false;
        }
        sb.append(')');
        return sb.toString();
    }

    public final void writeToParcel(android.os.Parcel parcel, int i) {
        int iF = aais.f(parcel, 20293);
        aais.E(parcel, 2, this.a);
        aais.g(parcel, iF);
    }
}
