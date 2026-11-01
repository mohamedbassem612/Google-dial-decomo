package com.google.android.gms.phenotype;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes.dex */
public class Configuration extends com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable implements java.lang.Comparable {
    public static final android.os.Parcelable.Creator CREATOR = new defpackage.ccu(20);
    public final int a;
    public final com.google.android.gms.phenotype.Flag[] b;
    public final java.lang.String[] c;
    public final java.util.Map d = new java.util.TreeMap();

    public Configuration(int i, com.google.android.gms.phenotype.Flag[] flagArr, java.lang.String[] strArr) {
        this.a = i;
        this.b = flagArr;
        for (com.google.android.gms.phenotype.Flag flag : flagArr) {
            this.d.put(flag.a, flag);
        }
        this.c = strArr;
        if (strArr != null) {
            java.util.Arrays.sort(strArr);
        }
    }

    @Override // java.lang.Comparable
    public final /* bridge */ /* synthetic */ int compareTo(java.lang.Object obj) {
        return this.a - ((com.google.android.gms.phenotype.Configuration) obj).a;
    }

    public final boolean equals(java.lang.Object obj) {
        if (!(obj instanceof com.google.android.gms.phenotype.Configuration)) {
            return false;
        }
        com.google.android.gms.phenotype.Configuration configuration = (com.google.android.gms.phenotype.Configuration) obj;
        return this.a == configuration.a && defpackage.anty.H(this.d, configuration.d) && java.util.Arrays.equals(this.c, configuration.c);
    }

    public final java.lang.String toString() {
        java.lang.StringBuilder sb = new java.lang.StringBuilder("Configuration(");
        sb.append(this.a);
        sb.append(", (");
        java.util.Iterator it = this.d.values().iterator();
        while (it.hasNext()) {
            sb.append((com.google.android.gms.phenotype.Flag) it.next());
            sb.append(", ");
        }
        sb.append("), (");
        java.lang.String[] strArr = this.c;
        if (strArr != null) {
            for (java.lang.String str : strArr) {
                sb.append(str);
                sb.append(", ");
            }
        } else {
            sb.append("null");
        }
        sb.append("))");
        return sb.toString();
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(android.os.Parcel parcel, int i) {
        int iF = defpackage.aais.f(parcel, 20293);
        defpackage.aais.l(parcel, 2, this.a);
        defpackage.aais.D(parcel, 3, this.b, i);
        defpackage.aais.B(parcel, 4, this.c);
        defpackage.aais.g(parcel, iF);
    }
}
