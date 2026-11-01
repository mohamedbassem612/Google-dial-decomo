package com.google.android.gms.phenotype;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes.dex */
public class Configurations extends com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable {
    public static final android.os.Parcelable.Creator CREATOR = new defpackage.aaso(1);
    public final java.lang.String a;
    public final byte[] b;
    public final java.lang.String c;
    public final com.google.android.gms.phenotype.Configuration[] d;
    public final java.util.Map e = new java.util.TreeMap();
    public final boolean f;
    public final long g;

    public Configurations(java.lang.String str, java.lang.String str2, com.google.android.gms.phenotype.Configuration[] configurationArr, boolean z, byte[] bArr, long j) {
        this.a = str;
        this.c = str2;
        this.d = configurationArr;
        this.f = z;
        this.b = bArr;
        this.g = j;
        for (com.google.android.gms.phenotype.Configuration configuration : configurationArr) {
            this.e.put(java.lang.Integer.valueOf(configuration.a), configuration);
        }
    }

    public final boolean equals(java.lang.Object obj) {
        if (!(obj instanceof com.google.android.gms.phenotype.Configurations)) {
            return false;
        }
        com.google.android.gms.phenotype.Configurations configurations = (com.google.android.gms.phenotype.Configurations) obj;
        return defpackage.anty.H(this.a, configurations.a) && defpackage.anty.H(this.c, configurations.c) && this.e.equals(configurations.e) && this.f == configurations.f && java.util.Arrays.equals(this.b, configurations.b) && this.g == configurations.g;
    }

    public final int hashCode() {
        return java.util.Arrays.hashCode(new java.lang.Object[]{this.a, this.c, this.e, java.lang.Boolean.valueOf(this.f), this.b, java.lang.Long.valueOf(this.g)});
    }

    public final java.lang.String toString() {
        java.lang.StringBuilder sb = new java.lang.StringBuilder("Configurations('");
        sb.append(this.a);
        sb.append("', '");
        sb.append(this.c);
        sb.append("', (");
        java.util.Iterator it = this.e.values().iterator();
        while (it.hasNext()) {
            sb.append((com.google.android.gms.phenotype.Configuration) it.next());
            sb.append(", ");
        }
        sb.append("), ");
        sb.append(this.f);
        sb.append(", ");
        byte[] bArr = this.b;
        sb.append(bArr == null ? "null" : android.util.Base64.encodeToString(bArr, 3));
        sb.append(", ");
        sb.append(this.g);
        sb.append(')');
        return sb.toString();
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(android.os.Parcel parcel, int i) {
        int iF = defpackage.aais.f(parcel, 20293);
        defpackage.aais.A(parcel, 2, this.a);
        defpackage.aais.A(parcel, 3, this.c);
        defpackage.aais.D(parcel, 4, this.d, i);
        defpackage.aais.h(parcel, 5, this.f);
        defpackage.aais.q(parcel, 6, this.b);
        defpackage.aais.m(parcel, 7, this.g);
        defpackage.aais.g(parcel, iF);
    }
}
