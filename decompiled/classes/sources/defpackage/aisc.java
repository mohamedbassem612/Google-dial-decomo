package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes.dex */
public final class aisc {
    public final java.lang.String a;
    public final char[] b;
    final int c;
    final int d;
    final int e;
    final int f;
    public final byte[] g;
    public final boolean h;
    private final boolean[] i;

    /* JADX WARN: Code duplicated, block: B:20:0x0063 A[LOOP:0: B:18:0x005f->B:20:0x0063, LOOP_END] */
    private aisc(java.lang.String str, char[] cArr, byte[] bArr, boolean z) {
        int iNumberOfLeadingZeros;
        boolean[] zArr;
        this.a = str;
        cArr.getClass();
        this.b = cArr;
        try {
            int length = cArr.length;
            java.math.RoundingMode roundingMode = java.math.RoundingMode.UNNECESSARY;
            if (length <= 0) {
                throw new java.lang.IllegalArgumentException("x (0) must be > 0");
            }
            switch (defpackage.aiyv.a[roundingMode.ordinal()]) {
                case 1:
                    defpackage.aiql.ad(((length + (-1)) & length) == 0);
                case 2:
                case 3:
                    iNumberOfLeadingZeros = 31 - java.lang.Integer.numberOfLeadingZeros(length);
                    this.d = iNumberOfLeadingZeros;
                    int iNumberOfTrailingZeros = java.lang.Integer.numberOfTrailingZeros(iNumberOfLeadingZeros);
                    int i = 1 << (3 - iNumberOfTrailingZeros);
                    this.e = i;
                    this.f = iNumberOfLeadingZeros >> iNumberOfTrailingZeros;
                    this.c = length - 1;
                    this.g = bArr;
                    zArr = new boolean[i];
                    for (int i2 = 0; i2 < this.f; i2++) {
                        zArr[defpackage.aiql.ak(i2 << 3, this.d, java.math.RoundingMode.CEILING)] = true;
                    }
                    this.i = zArr;
                    this.h = z;
                    return;
                case 4:
                case 5:
                    iNumberOfLeadingZeros = 32 - java.lang.Integer.numberOfLeadingZeros(length - 1);
                    this.d = iNumberOfLeadingZeros;
                    int iNumberOfTrailingZeros2 = java.lang.Integer.numberOfTrailingZeros(iNumberOfLeadingZeros);
                    int i3 = 1 << (3 - iNumberOfTrailingZeros2);
                    this.e = i3;
                    this.f = iNumberOfLeadingZeros >> iNumberOfTrailingZeros2;
                    this.c = length - 1;
                    this.g = bArr;
                    zArr = new boolean[i3];
                    while (i2 < this.f) {
                        zArr[defpackage.aiql.ak(i2 << 3, this.d, java.math.RoundingMode.CEILING)] = true;
                    }
                    this.i = zArr;
                    this.h = z;
                    return;
                case defpackage.eft.STRING_SET_FIELD_NUMBER /* 6 */:
                case defpackage.eft.DOUBLE_FIELD_NUMBER /* 7 */:
                case defpackage.eft.BYTES_FIELD_NUMBER /* 8 */:
                    int iNumberOfLeadingZeros2 = java.lang.Integer.numberOfLeadingZeros(length);
                    iNumberOfLeadingZeros = (31 - iNumberOfLeadingZeros2) + ((((-1257966797) >>> iNumberOfLeadingZeros2) - length) >>> 31);
                    this.d = iNumberOfLeadingZeros;
                    int iNumberOfTrailingZeros3 = java.lang.Integer.numberOfTrailingZeros(iNumberOfLeadingZeros);
                    int i4 = 1 << (3 - iNumberOfTrailingZeros3);
                    this.e = i4;
                    this.f = iNumberOfLeadingZeros >> iNumberOfTrailingZeros3;
                    this.c = length - 1;
                    this.g = bArr;
                    zArr = new boolean[i4];
                    while (i2 < this.f) {
                        zArr[defpackage.aiql.ak(i2 << 3, this.d, java.math.RoundingMode.CEILING)] = true;
                    }
                    this.i = zArr;
                    this.h = z;
                    return;
                default:
                    throw new java.lang.AssertionError();
            }
        } catch (java.lang.ArithmeticException e) {
            throw new java.lang.IllegalArgumentException("Illegal alphabet length " + cArr.length, e);
        }
    }

    final char a(int i) {
        return this.b[i];
    }

    final int b(char c) throws defpackage.aisf {
        if (c > 127) {
            throw new defpackage.aisf("Unrecognized character: 0x".concat(java.lang.String.valueOf(java.lang.Integer.toHexString(c))));
        }
        byte b = this.g[c];
        if (b != -1) {
            return b;
        }
        if (c <= ' ' || c == 127) {
            throw new defpackage.aisf("Unrecognized character: 0x".concat(java.lang.String.valueOf(java.lang.Integer.toHexString(c))));
        }
        throw new defpackage.aisf("Unrecognized character: " + c);
    }

    public final defpackage.aisc c() {
        if (this.h) {
            return this;
        }
        byte[] bArr = this.g;
        byte[] bArrCopyOf = java.util.Arrays.copyOf(bArr, bArr.length);
        for (int i = 65; i <= 90; i++) {
            int i2 = i | 32;
            byte b = bArr[i];
            byte b2 = bArr[i2];
            if (b == -1) {
                bArrCopyOf[i] = b2;
            } else {
                char c = (char) i;
                char c2 = (char) i2;
                if (b2 != -1) {
                    throw new java.lang.IllegalStateException(defpackage.ahvr.bK("Can't ignoreCase() since '%s' and '%s' encode different values", java.lang.Character.valueOf(c), java.lang.Character.valueOf(c2)));
                }
                bArrCopyOf[i2] = b;
            }
        }
        return new defpackage.aisc(this.a.concat(".ignoreCase()"), this.b, bArrCopyOf, true);
    }

    public final boolean d() {
        int i = 0;
        while (true) {
            char[] cArr = this.b;
            if (i >= cArr.length) {
                return false;
            }
            if (defpackage.ahvr.s(cArr[i])) {
                return true;
            }
            i++;
        }
    }

    public final boolean e() {
        int i = 0;
        while (true) {
            char[] cArr = this.b;
            if (i >= cArr.length) {
                return false;
            }
            if (defpackage.ahvr.t(cArr[i])) {
                return true;
            }
            i++;
        }
    }

    public final boolean equals(java.lang.Object obj) {
        if (!(obj instanceof defpackage.aisc)) {
            return false;
        }
        defpackage.aisc aiscVar = (defpackage.aisc) obj;
        return this.h == aiscVar.h && java.util.Arrays.equals(this.b, aiscVar.b);
    }

    final boolean f(long j) {
        return this.i[(int) (j % ((long) this.e))];
    }

    public final int hashCode() {
        return java.util.Arrays.hashCode(this.b) + (true != this.h ? 1237 : 1231);
    }

    public final java.lang.String toString() {
        return this.a;
    }

    /* JADX WARN: Illegal instructions before constructor call */
    public aisc(java.lang.String str, char[] cArr) {
        byte[] bArr = new byte[128];
        java.util.Arrays.fill(bArr, (byte) -1);
        for (int i = 0; i < cArr.length; i++) {
            char c = cArr[i];
            boolean z = true;
            defpackage.ahvr.bO(c < 128, "Non-ASCII character: %s", c);
            if (bArr[c] != -1) {
                z = false;
            }
            defpackage.ahvr.bO(z, "Duplicate character: %s", c);
            bArr[c] = (byte) i;
        }
        this(str, cArr, bArr, false);
    }
}
