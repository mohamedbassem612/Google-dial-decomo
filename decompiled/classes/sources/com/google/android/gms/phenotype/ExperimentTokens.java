package com.google.android.gms.phenotype;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes.dex */
public class ExperimentTokens extends com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable {
    public static final android.os.Parcelable.Creator CREATOR = new defpackage.aaso(0);
    public static final byte[][] a;
    public static final com.google.android.gms.phenotype.ExperimentTokens b;
    public final java.lang.String c;
    public final byte[] d;
    public final byte[][] e;
    public final byte[][] f;
    public final byte[][] g;
    public final byte[][] h;
    public final int[] i;
    public final byte[][] j;
    public final int[] k;
    public final byte[][] l;

    static {
        byte[][] bArr = new byte[0][];
        a = bArr;
        b = new com.google.android.gms.phenotype.ExperimentTokens("", null, bArr, bArr, bArr, bArr, null, null, null, null);
    }

    public ExperimentTokens(java.lang.String str, byte[] bArr, byte[][] bArr2, byte[][] bArr3, byte[][] bArr4, byte[][] bArr5, int[] iArr, byte[][] bArr6, int[] iArr2, byte[][] bArr7) {
        this.c = str;
        this.d = bArr;
        this.e = bArr2;
        this.f = bArr3;
        this.g = bArr4;
        this.h = bArr5;
        this.i = iArr;
        this.j = bArr6;
        this.k = iArr2;
        this.l = bArr7;
    }

    public static byte[][] a(java.util.List list, defpackage.aasn aasnVar) {
        byte[][] bArrA;
        byte[][] bArrA2;
        java.util.Iterator it = list.iterator();
        int length = 0;
        while (it.hasNext()) {
            com.google.android.gms.phenotype.ExperimentTokens experimentTokens = (com.google.android.gms.phenotype.ExperimentTokens) it.next();
            if (experimentTokens != null && (bArrA2 = aasnVar.a(experimentTokens)) != null) {
                length += bArrA2.length;
            }
        }
        if (length == 0) {
            return a;
        }
        byte[][] bArr = new byte[length][];
        java.util.Iterator it2 = list.iterator();
        int i = 0;
        while (it2.hasNext()) {
            com.google.android.gms.phenotype.ExperimentTokens experimentTokens2 = (com.google.android.gms.phenotype.ExperimentTokens) it2.next();
            if (experimentTokens2 != null && (bArrA = aasnVar.a(experimentTokens2)) != null) {
                for (byte[] bArr2 : bArrA) {
                    if (bArr2 != null) {
                        bArr[i] = bArr2;
                        i++;
                    }
                }
            }
        }
        return bArr;
    }

    private static java.util.List b(int[] iArr) {
        if (iArr == null) {
            return java.util.Collections.EMPTY_LIST;
        }
        java.util.ArrayList arrayList = new java.util.ArrayList(iArr.length >> 1);
        for (int i = 0; i < iArr.length; i += 2) {
            arrayList.add(new com.google.android.gms.phenotype.GenericDimension(iArr[i], iArr[i + 1]));
        }
        java.util.Collections.sort(arrayList);
        return arrayList;
    }

    private final java.util.Set c() {
        java.util.ArrayList arrayList = new java.util.ArrayList();
        byte[][] bArr = this.j;
        if (bArr != null) {
            java.util.Collections.addAll(arrayList, bArr);
        }
        byte[] bArr2 = this.d;
        if (bArr2 != null) {
            arrayList.add(bArr2);
        }
        return e((byte[][]) arrayList.toArray(new byte[0][]));
    }

    private static java.util.Set d(int[] iArr) {
        int length;
        if (iArr == null || (length = iArr.length) == 0) {
            return java.util.Collections.EMPTY_SET;
        }
        java.util.HashSet hashSetAp = defpackage.ahvr.ap(length);
        for (int i : iArr) {
            hashSetAp.add(java.lang.Integer.valueOf(i));
        }
        return hashSetAp;
    }

    private static java.util.Set e(byte[][] bArr) {
        int length;
        if (bArr == null || (length = bArr.length) == 0) {
            return java.util.Collections.EMPTY_SET;
        }
        java.util.HashSet hashSetAp = defpackage.ahvr.ap(length);
        for (byte[] bArr2 : bArr) {
            defpackage.aais.as(bArr2);
            hashSetAp.add(android.util.Base64.encodeToString(bArr2, 3));
        }
        return hashSetAp;
    }

    private static void f(java.lang.StringBuilder sb, java.lang.String str, byte[][] bArr) {
        sb.append(str);
        sb.append('=');
        if (bArr == null) {
            sb.append("null");
            return;
        }
        sb.append('(');
        boolean z = true;
        int i = 0;
        while (i < bArr.length) {
            byte[] bArr2 = bArr[i];
            if (!z) {
                sb.append(", ");
            }
            sb.append('\'');
            defpackage.aais.as(bArr2);
            sb.append(android.util.Base64.encodeToString(bArr2, 3));
            sb.append('\'');
            i++;
            z = false;
        }
        sb.append(')');
    }

    public final boolean equals(java.lang.Object obj) {
        if (!(obj instanceof com.google.android.gms.phenotype.ExperimentTokens)) {
            return false;
        }
        com.google.android.gms.phenotype.ExperimentTokens experimentTokens = (com.google.android.gms.phenotype.ExperimentTokens) obj;
        return defpackage.anty.H(this.c, experimentTokens.c) && defpackage.anty.H(c(), experimentTokens.c()) && defpackage.anty.H(e(this.e), e(experimentTokens.e)) && defpackage.anty.H(e(this.f), e(experimentTokens.f)) && defpackage.anty.H(e(this.g), e(experimentTokens.g)) && defpackage.anty.H(e(this.h), e(experimentTokens.h)) && defpackage.anty.H(d(this.i), d(experimentTokens.i)) && defpackage.anty.H(b(this.k), b(experimentTokens.k)) && defpackage.anty.H(e(this.l), e(experimentTokens.l));
    }

    public final java.lang.String toString() {
        java.lang.String str;
        java.lang.StringBuilder sb = new java.lang.StringBuilder("ExperimentTokens");
        sb.append('(');
        java.lang.String str2 = this.c;
        if (str2 == null) {
            str = "null";
        } else {
            str = "'" + str2 + '\'';
        }
        sb.append(str);
        byte[] bArr = this.d;
        sb.append(", direct==");
        if (bArr == null) {
            sb.append("null");
        } else {
            sb.append('\'');
            sb.append(android.util.Base64.encodeToString(bArr, 3));
            sb.append('\'');
        }
        sb.append(", ");
        f(sb, "GAIA=", this.e);
        sb.append(", ");
        f(sb, "PSEUDO=", this.f);
        sb.append(", ");
        f(sb, "ALWAYS=", this.g);
        sb.append(", ");
        f(sb, "OTHER=", this.h);
        sb.append(", weak=");
        sb.append(java.util.Arrays.toString(this.i));
        sb.append(", ");
        f(sb, "directs=", this.j);
        sb.append(", genDims=");
        sb.append(java.util.Arrays.toString(b(this.k).toArray()));
        sb.append(", ");
        f(sb, "external=", this.l);
        sb.append(')');
        return sb.toString();
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(android.os.Parcel parcel, int i) {
        int iF = defpackage.aais.f(parcel, 20293);
        java.lang.String str = this.c;
        if (str != null) {
            int iF2 = defpackage.aais.f(parcel, 2);
            parcel.writeString(str);
            defpackage.aais.g(parcel, iF2);
        }
        byte[] bArr = this.d;
        if (bArr != null) {
            int iF3 = defpackage.aais.f(parcel, 3);
            parcel.writeByteArray(bArr);
            defpackage.aais.g(parcel, iF3);
        }
        defpackage.aais.r(parcel, 4, this.e);
        defpackage.aais.r(parcel, 5, this.f);
        defpackage.aais.r(parcel, 6, this.g);
        defpackage.aais.r(parcel, 7, this.h);
        int[] iArr = this.i;
        if (iArr != null) {
            int iF4 = defpackage.aais.f(parcel, 8);
            parcel.writeIntArray(iArr);
            defpackage.aais.g(parcel, iF4);
        }
        defpackage.aais.r(parcel, 9, this.j);
        int[] iArr2 = this.k;
        if (iArr2 != null) {
            int iF5 = defpackage.aais.f(parcel, 10);
            parcel.writeIntArray(iArr2);
            defpackage.aais.g(parcel, iF5);
        }
        defpackage.aais.r(parcel, 11, this.l);
        defpackage.aais.g(parcel, iF);
    }
}
