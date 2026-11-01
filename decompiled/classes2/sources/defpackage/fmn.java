package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes2.dex */
public final class fmn {
    public final java.util.List a;
    public final int b;
    public final java.lang.String c;
    public final int d;

    private fmn(java.util.List list, int i, java.lang.String str, int i2) {
        this.a = list;
        this.b = i;
        this.c = str;
        this.d = i2;
    }

    public static defpackage.fmn a(defpackage.etx etxVar) {
        int iN;
        int iN2;
        int i;
        int i2;
        char c;
        int i3;
        int i4 = 1;
        try {
            if (etxVar.i() != 0) {
                throw new defpackage.era("Unsupported VVC version", null, true, 1);
            }
            int iN3 = etxVar.n();
            int i5 = ((iN3 >> 1) & 3) + 1;
            char c2 = 2;
            java.lang.String str = "L";
            if ((iN3 & 1) != 0) {
                etxVar.R(1);
                int iN4 = etxVar.n() >> 4;
                iN = etxVar.n() >> 5;
                int iN5 = etxVar.n() & 63;
                int iN6 = etxVar.n();
                i = iN6 >> 1;
                str = (iN6 & 1) != 0 ? "H" : "L";
                iN2 = etxVar.n();
                etxVar.R(iN5);
                int i6 = iN4 & 7;
                if (i6 > 1) {
                    int iN7 = etxVar.n();
                    for (int i7 = 0; i7 < i6 - 1; i7++) {
                        if (((iN7 >> (7 - i7)) & 1) != 0) {
                            etxVar.R(1);
                        }
                    }
                }
                etxVar.R(etxVar.n() << 2);
                etxVar.R(6);
            } else {
                iN = 0;
                iN2 = 0;
                i = 0;
            }
            int iN8 = etxVar.n();
            int i8 = etxVar.c;
            int i9 = 0;
            int i10 = 0;
            while (true) {
                i2 = 12;
                c = c2;
                i3 = 13;
                if (i9 >= iN8) {
                    break;
                }
                int i11 = i4;
                int iN9 = etxVar.n() & 31;
                int iS = (iN9 == 13 || iN9 == 12) ? i11 : etxVar.s();
                for (int i12 = 0; i12 < iS; i12++) {
                    int iS2 = etxVar.s();
                    i10 += iS2 + 4;
                    etxVar.R(iS2);
                }
                i9++;
                c2 = c;
                i4 = i11;
            }
            int i13 = i4;
            etxVar.Q(i8);
            byte[] bArr = new byte[i10];
            int i14 = 0;
            int i15 = 0;
            while (i14 < iN8) {
                int iN10 = etxVar.n() & 31;
                int iS3 = (iN10 == i3 || iN10 == i2) ? i13 : etxVar.s();
                for (int i16 = 0; i16 < iS3; i16++) {
                    int iS4 = etxVar.s();
                    java.lang.System.arraycopy(defpackage.evc.a, 0, bArr, i15, 4);
                    int i17 = i15 + 4;
                    etxVar.L(bArr, i17, iS4);
                    i15 = i17 + iS4;
                }
                i14++;
                i3 = 13;
                i2 = 12;
            }
            java.util.Locale locale = java.util.Locale.US;
            java.lang.Integer numValueOf = java.lang.Integer.valueOf(i);
            java.lang.Integer numValueOf2 = java.lang.Integer.valueOf(iN2);
            java.lang.Object[] objArr = new java.lang.Object[3];
            objArr[0] = numValueOf;
            objArr[i13] = str;
            objArr[c] = numValueOf2;
            return new defpackage.fmn(aify.p(bArr), i5, java.lang.String.format(locale, "vvc1.%d.%s%d", objArr), iN + 8);
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            throw new defpackage.era("Error parsing VVC configuration", e, true, 1);
        }
    }
}
