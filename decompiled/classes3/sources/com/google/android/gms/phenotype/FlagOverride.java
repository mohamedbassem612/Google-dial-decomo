package com.google.android.gms.phenotype;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes3.dex */
public class FlagOverride extends com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable {
    public static final android.os.Parcelable.Creator CREATOR = new defpackage.aask(13);
    public final java.lang.String a;
    public final java.lang.String b;
    public final com.google.android.gms.phenotype.Flag c;
    public final boolean d;

    public FlagOverride(java.lang.String str, java.lang.String str2, com.google.android.gms.phenotype.Flag flag, boolean z) {
        this.a = str;
        this.b = str2;
        this.c = flag;
        this.d = z;
    }

    final void a(java.lang.StringBuilder sb) {
        sb.append("FlagOverride(");
        sb.append(this.a);
        sb.append(", ");
        sb.append(this.b);
        sb.append(", ");
        this.c.d(sb);
        sb.append(", ");
        sb.append(this.d);
        sb.append(')');
    }

    public final boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof com.google.android.gms.phenotype.FlagOverride) {
            com.google.android.gms.phenotype.FlagOverride flagOverride = (com.google.android.gms.phenotype.FlagOverride) obj;
            if (anty.H(this.a, flagOverride.a) && anty.H(this.b, flagOverride.b) && anty.H(this.c, flagOverride.c) && this.d == flagOverride.d) {
                return true;
            }
        }
        return false;
    }

    public final java.lang.String toString() {
        java.lang.StringBuilder sb = new java.lang.StringBuilder();
        a(sb);
        return sb.toString();
    }

    public final void writeToParcel(android.os.Parcel parcel, int i) {
        int iF = aais.f(parcel, 20293);
        aais.A(parcel, 2, this.a);
        aais.A(parcel, 3, this.b);
        aais.z(parcel, 4, this.c, i);
        aais.h(parcel, 5, this.d);
        aais.g(parcel, iF);
    }
}
