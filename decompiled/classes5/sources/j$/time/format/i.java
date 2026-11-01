package j$.time.format;

/* JADX INFO: compiled from: r8-map-id-3adb9db301d96c2361dbb0b6577526ae53bce59ce57ea3dca6dd17a1bcfda15c */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes5.dex */
public class i implements j$.time.format.e {
    public static final long[] f = {0, 10, 100, 1000, 10000, 100000, 1000000, 10000000, 100000000, 1000000000, 10000000000L};
    public final j$.time.temporal.l a;
    public final int b;
    public final int c;
    public final j$.time.format.d0 d;
    public final int e;

    public i(j$.time.temporal.l lVar, int i, int i2, j$.time.format.d0 d0Var) {
        this.a = lVar;
        this.b = i;
        this.c = i2;
        this.d = d0Var;
        this.e = 0;
    }

    public boolean b(j$.time.format.v vVar) {
        int i = this.e;
        return i == -1 || (i > 0 && this.b == this.c && this.d == j$.time.format.d0.NOT_NEGATIVE);
    }

    public int c(j$.time.format.v vVar, long j, int i, int i2) {
        return vVar.f(this.a, j, i, i2);
    }

    public j$.time.format.i d() {
        if (this.e == -1) {
            return this;
        }
        return new j$.time.format.i(this.a, this.b, this.c, this.d, -1);
    }

    public j$.time.format.i e(int i) {
        return new j$.time.format.i(this.a, this.b, this.c, this.d, this.e + i);
    }

    @Override // j$.time.format.e
    public boolean h(j$.time.format.w wVar, java.lang.StringBuilder sb) {
        j$.time.temporal.l lVar = this.a;
        java.lang.Long lA = wVar.a(lVar);
        if (lA == null) {
            return false;
        }
        long jA = a(wVar, lA.longValue());
        j$.time.format.a0 a0Var = wVar.b.c;
        java.lang.String string = jA == Long.MIN_VALUE ? "9223372036854775808" : java.lang.Long.toString(java.lang.Math.abs(jA));
        int length = string.length();
        int i = this.c;
        if (length > i) {
            throw new j$.time.DateTimeException("Field " + java.lang.String.valueOf(lVar) + " cannot be printed as the value " + jA + " exceeds the maximum print width of " + i);
        }
        a0Var.getClass();
        int i2 = this.b;
        j$.time.format.d0 d0Var = this.d;
        if (jA >= 0) {
            int i3 = j$.time.format.b.a[d0Var.ordinal()];
            if (i3 != 1) {
                if (i3 == 2) {
                    sb.append('+');
                }
            } else if (i2 < 19 && jA >= f[i2]) {
                sb.append('+');
            }
        } else {
            int i4 = j$.time.format.b.a[d0Var.ordinal()];
            if (i4 == 1 || i4 == 2 || i4 == 3) {
                sb.append('-');
            } else if (i4 == 4) {
                throw new j$.time.DateTimeException("Field " + java.lang.String.valueOf(lVar) + " cannot be printed as the value " + jA + " cannot be negative according to the SignStyle");
            }
        }
        for (int i5 = 0; i5 < i2 - string.length(); i5++) {
            sb.append('0');
        }
        sb.append(string);
        return true;
    }

    /* JADX WARN: Code duplicated, block: B:101:0x015e A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:104:0x0163  */
    /* JADX WARN: Code duplicated, block: B:106:0x016b  */
    /* JADX WARN: Code duplicated, block: B:108:0x017e  */
    /* JADX WARN: Code duplicated, block: B:110:0x011e A[ADDED_TO_REGION, REMOVE, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:112:0x0122 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:113:0x015c A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:114:0x0100 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:115:0x00c4 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:41:0x0077  */
    /* JADX WARN: Code duplicated, block: B:44:0x007f  */
    /* JADX WARN: Code duplicated, block: B:47:0x0084  */
    /* JADX WARN: Code duplicated, block: B:49:0x0088  */
    /* JADX WARN: Code duplicated, block: B:55:0x009f  */
    /* JADX WARN: Code duplicated, block: B:57:0x00ac  */
    /* JADX WARN: Code duplicated, block: B:59:0x00bd  */
    /* JADX WARN: Code duplicated, block: B:61:0x00c1  */
    /* JADX WARN: Code duplicated, block: B:65:0x00c8  */
    /* JADX WARN: Code duplicated, block: B:67:0x00ce A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:68:0x00d0  */
    /* JADX WARN: Code duplicated, block: B:70:0x00ec  */
    /* JADX WARN: Code duplicated, block: B:75:0x0108 A[ADDED_TO_REGION] */
    /* JADX WARN: Code duplicated, block: B:81:0x012f A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:82:0x0131  */
    /* JADX WARN: Code duplicated, block: B:84:0x0139  */
    /* JADX WARN: Code duplicated, block: B:87:0x0142  */
    /* JADX WARN: Code duplicated, block: B:89:0x0146  */
    /* JADX WARN: Code duplicated, block: B:92:0x014c  */
    /* JADX WARN: Code duplicated, block: B:94:0x0150  */
    /* JADX WARN: Code duplicated, block: B:98:0x0158 A[DONT_INVERT] */
    /* JADX WARN: Code restructure failed: missing block: B:101:0x015e, code lost:
    
        if (r6 > r10) goto L100;
     */
    /* JADX WARN: Code restructure failed: missing block: B:98:0x0158, code lost:
    
        if (r6 <= r10) goto L99;
     */
    @Override // j$.time.format.e
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public int k(j$.time.format.v r27, java.lang.CharSequence r28, int r29) {
        /*
            Method dump skipped, instruction units count: 389
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: j$.time.format.i.k(j$.time.format.v, java.lang.CharSequence, int):int");
    }

    public java.lang.String toString() {
        j$.time.temporal.l lVar = this.a;
        j$.time.format.d0 d0Var = this.d;
        int i = this.c;
        int i2 = this.b;
        if (i2 == 1 && i == 19 && d0Var == j$.time.format.d0.NORMAL) {
            return j$.desugar.sun.nio.fs.h.a("Value(", java.lang.String.valueOf(lVar), ")");
        }
        if (i2 == i && d0Var == j$.time.format.d0.NOT_NEGATIVE) {
            return "Value(" + java.lang.String.valueOf(lVar) + "," + i2 + ")";
        }
        return "Value(" + java.lang.String.valueOf(lVar) + "," + i2 + "," + i + "," + java.lang.String.valueOf(d0Var) + ")";
    }

    public i(j$.time.temporal.l lVar, int i, int i2, j$.time.format.d0 d0Var, int i3) {
        this.a = lVar;
        this.b = i;
        this.c = i2;
        this.d = d0Var;
        this.e = i3;
    }

    public long a(j$.time.format.w wVar, long j) {
        return j;
    }
}
