package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes.dex */
public final class alcj {
    public static final defpackage.alcj a = new defpackage.alcj(0, new int[0], new java.lang.Object[0], false);
    public int b;
    public int[] c;
    public java.lang.Object[] d;
    public int e;
    private boolean f;

    public alcj(int i, int[] iArr, java.lang.Object[] objArr, boolean z) {
        this.e = -1;
        this.b = i;
        this.c = iArr;
        this.d = objArr;
        this.f = z;
    }

    public final int a() {
        int iNumberOfLeadingZeros;
        int iNumberOfLeadingZeros2;
        int iNumberOfLeadingZeros3;
        int i = this.e;
        if (i != -1) {
            return i;
        }
        int i2 = 0;
        for (int i3 = 0; i3 < this.b; i3++) {
            int i4 = this.c[i3];
            int i5 = i4 >>> 3;
            int i6 = i4 & 7;
            if (i6 != 0) {
                if (i6 == 1) {
                    ((java.lang.Long) this.d[i3]).longValue();
                    iNumberOfLeadingZeros3 = ((352 - (java.lang.Integer.numberOfLeadingZeros(i5 << 3) * 9)) >>> 6) + 8;
                } else if (i6 == 2) {
                    defpackage.akzc akzcVar = (defpackage.akzc) this.d[i3];
                    int iNumberOfLeadingZeros4 = java.lang.Integer.numberOfLeadingZeros(i5 << 3) * 9;
                    int iC = akzcVar.c();
                    iNumberOfLeadingZeros3 = ((352 - iNumberOfLeadingZeros4) >>> 6) + ((352 - (java.lang.Integer.numberOfLeadingZeros(iC) * 9)) >>> 6) + iC;
                } else if (i6 == 3) {
                    int iNumberOfLeadingZeros5 = java.lang.Integer.numberOfLeadingZeros(i5 << 3) * 9;
                    iNumberOfLeadingZeros2 = ((defpackage.alcj) this.d[i3]).a();
                    iNumberOfLeadingZeros = ((352 - iNumberOfLeadingZeros5) >>> 6) << 1;
                } else {
                    if (i6 != 5) {
                        throw new java.lang.IllegalStateException(new defpackage.alay());
                    }
                    ((java.lang.Integer) this.d[i3]).intValue();
                    iNumberOfLeadingZeros3 = ((352 - (java.lang.Integer.numberOfLeadingZeros(i5 << 3) * 9)) >>> 6) + 4;
                }
                i2 += iNumberOfLeadingZeros3;
            } else {
                long jLongValue = ((java.lang.Long) this.d[i3]).longValue();
                iNumberOfLeadingZeros = (352 - (java.lang.Integer.numberOfLeadingZeros(i5 << 3) * 9)) >>> 6;
                iNumberOfLeadingZeros2 = (640 - (java.lang.Long.numberOfLeadingZeros(jLongValue) * 9)) >>> 6;
            }
            iNumberOfLeadingZeros3 = iNumberOfLeadingZeros + iNumberOfLeadingZeros2;
            i2 += iNumberOfLeadingZeros3;
        }
        this.e = i2;
        return i2;
    }

    final void b() {
        if (!this.f) {
            throw new java.lang.UnsupportedOperationException();
        }
    }

    public final void c(int i) {
        int[] iArr = this.c;
        if (i > iArr.length) {
            int i2 = this.b;
            int i3 = i2 + (i2 / 2);
            if (i3 >= i) {
                i = i3;
            }
            if (i < 8) {
                i = 8;
            }
            this.c = java.util.Arrays.copyOf(iArr, i);
            this.d = java.util.Arrays.copyOf(this.d, i);
        }
    }

    public final void d() {
        if (this.f) {
            this.f = false;
        }
    }

    final void e(int i, java.lang.Object obj) {
        b();
        c(this.b + 1);
        int[] iArr = this.c;
        int i2 = this.b;
        iArr[i2] = i;
        this.d[i2] = obj;
        this.b = i2 + 1;
    }

    public final boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && (obj instanceof defpackage.alcj)) {
            defpackage.alcj alcjVar = (defpackage.alcj) obj;
            int i = this.b;
            if (i == alcjVar.b && defpackage.anty.F(this.c, alcjVar.c, i) && defpackage.anty.E(this.d, alcjVar.d, this.b)) {
                return true;
            }
        }
        return false;
    }

    public final void f(defpackage.ajyk ajykVar) {
        if (this.b != 0) {
            for (int i = 0; i < this.b; i++) {
                int i2 = this.c[i];
                java.lang.Object obj = this.d[i];
                int i3 = i2 >>> 3;
                int i4 = i2 & 7;
                if (i4 == 0) {
                    ajykVar.y(i3, ((java.lang.Long) obj).longValue());
                } else if (i4 == 1) {
                    ajykVar.u(i3, ((java.lang.Long) obj).longValue());
                } else if (i4 == 2) {
                    ajykVar.q(i3, (defpackage.akzc) obj);
                } else if (i4 == 3) {
                    defpackage.akzk akzkVar = (defpackage.akzk) ajykVar.b;
                    akzkVar.t(i3, 3);
                    ((defpackage.alcj) obj).f(ajykVar);
                    akzkVar.t(i3, 4);
                } else {
                    if (i4 != 5) {
                        throw new java.lang.RuntimeException(new defpackage.alay());
                    }
                    ajykVar.t(i3, ((java.lang.Integer) obj).intValue());
                }
            }
        }
    }

    public final int hashCode() {
        int i = this.b;
        return ((((i + 527) * 31) + defpackage.anty.C(this.c, i)) * 31) + defpackage.anty.D(this.d, this.b);
    }

    public alcj() {
        this(0, new int[8], new java.lang.Object[8], true);
    }
}
