package j$.time.format;

/* JADX INFO: compiled from: r8-map-id-3adb9db301d96c2361dbb0b6577526ae53bce59ce57ea3dca6dd17a1bcfda15c */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes5.dex */
public final class f extends j$.time.format.i {
    public final boolean g;

    public f(j$.time.temporal.a aVar, int i, int i2, boolean z) {
        this(aVar, i, i2, z, 0);
        j$.util.Objects.requireNonNull(aVar, "field");
        j$.time.temporal.o oVar = aVar.b;
        if (oVar.a != oVar.b || oVar.c != oVar.d) {
            j$.time.g.b("Field must have a fixed set of values: ".concat(java.lang.String.valueOf(aVar)));
            throw null;
        }
        if (i < 0 || i > 9) {
            j$.time.g.g("Minimum width must be from 0 to 9 inclusive but was ", i);
            throw null;
        }
        if (i2 < 1 || i2 > 9) {
            j$.time.g.g("Maximum width must be from 1 to 9 inclusive but was ", i2);
            throw null;
        }
        if (i2 >= i) {
            return;
        }
        throw new java.lang.IllegalArgumentException("Maximum width must exceed or equal the minimum width but " + i2 + " < " + i);
    }

    @Override // j$.time.format.i
    public final boolean b(j$.time.format.v vVar) {
        return vVar.c && this.b == this.c && !this.g;
    }

    @Override // j$.time.format.i
    public final j$.time.format.i d() {
        if (this.e == -1) {
            return this;
        }
        return new j$.time.format.f(this.a, this.b, this.c, this.g, -1);
    }

    @Override // j$.time.format.i
    public final j$.time.format.i e(int i) {
        return new j$.time.format.f(this.a, this.b, this.c, this.g, this.e + i);
    }

    @Override // j$.time.format.i, j$.time.format.e
    public final boolean h(j$.time.format.w wVar, java.lang.StringBuilder sb) {
        j$.time.temporal.l lVar = this.a;
        java.lang.Long lA = wVar.a(lVar);
        if (lA == null) {
            return false;
        }
        j$.time.format.a0 a0Var = wVar.b.c;
        long jLongValue = lA.longValue();
        j$.time.temporal.o oVarRange = lVar.range();
        oVarRange.b(jLongValue, lVar);
        java.math.BigDecimal bigDecimalValueOf = java.math.BigDecimal.valueOf(oVarRange.a);
        java.math.BigDecimal bigDecimalAdd = java.math.BigDecimal.valueOf(oVarRange.d).subtract(bigDecimalValueOf).add(java.math.BigDecimal.ONE);
        java.math.BigDecimal bigDecimalSubtract = java.math.BigDecimal.valueOf(jLongValue).subtract(bigDecimalValueOf);
        java.math.RoundingMode roundingMode = java.math.RoundingMode.FLOOR;
        java.math.BigDecimal bigDecimalDivide = bigDecimalSubtract.divide(bigDecimalAdd, 9, roundingMode);
        java.math.BigDecimal bigDecimal = java.math.BigDecimal.ZERO;
        if (bigDecimalDivide.compareTo(bigDecimal) != 0) {
            bigDecimal = bigDecimalDivide.signum() == 0 ? new java.math.BigDecimal(java.math.BigInteger.ZERO, 0) : bigDecimalDivide.stripTrailingZeros();
        }
        int iScale = bigDecimal.scale();
        boolean z = this.g;
        int i = this.b;
        if (iScale != 0) {
            java.lang.String strSubstring = bigDecimal.setScale(java.lang.Math.min(java.lang.Math.max(bigDecimal.scale(), i), this.c), roundingMode).toPlainString().substring(2);
            a0Var.getClass();
            if (z) {
                sb.append('.');
            }
            sb.append(strSubstring);
        } else if (i > 0) {
            if (z) {
                a0Var.getClass();
                sb.append('.');
            }
            for (int i2 = 0; i2 < i; i2++) {
                a0Var.getClass();
                sb.append('0');
            }
        }
        return true;
    }

    /* JADX WARN: Code restructure failed: missing block: B:34:0x0060, code lost:
    
        if (r5 < r0) goto L35;
     */
    @Override // j$.time.format.i, j$.time.format.e
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final int k(j$.time.format.v r13, java.lang.CharSequence r14, int r15) {
        /*
            r12 = this;
            boolean r0 = r13.c
            j$.time.format.DateTimeFormatter r1 = r13.a
            j$.time.format.a0 r1 = r1.c
            r2 = 0
            if (r0 != 0) goto L11
            boolean r0 = r12.b(r13)
            if (r0 != 0) goto L11
            r0 = r2
            goto L13
        L11:
            int r0 = r12.b
        L13:
            boolean r3 = r13.c
            r4 = 9
            if (r3 != 0) goto L21
            boolean r3 = r12.b(r13)
            if (r3 != 0) goto L21
            r3 = r4
            goto L23
        L21:
            int r3 = r12.c
        L23:
            int r5 = r14.length()
            if (r15 != r5) goto L2c
            if (r0 <= 0) goto La9
            goto L3d
        L2c:
            boolean r6 = r12.g
            if (r6 == 0) goto L41
            char r6 = r14.charAt(r15)
            r1.getClass()
            r7 = 46
            if (r6 == r7) goto L3f
            if (r0 <= 0) goto La9
        L3d:
            int r15 = ~r15
            goto La9
        L3f:
            int r15 = r15 + 1
        L41:
            r10 = r15
            int r0 = r0 + r10
            if (r0 > r5) goto L62
            int r3 = r3 + r10
            int r15 = java.lang.Math.min(r3, r5)
            r3 = r2
            r11 = r10
        L4c:
            if (r11 >= r15) goto L69
            int r5 = r11 + 1
            char r6 = r14.charAt(r11)
            r1.getClass()
            int r6 = r6 + (-48)
            if (r6 < 0) goto L5d
            if (r6 <= r4) goto L5e
        L5d:
            r6 = -1
        L5e:
            if (r6 >= 0) goto L64
            if (r5 >= r0) goto L69
        L62:
            int r15 = ~r10
            goto La9
        L64:
            int r3 = r3 * 10
            int r3 = r3 + r6
            r11 = r5
            goto L4c
        L69:
            java.math.BigDecimal r14 = new java.math.BigDecimal
            r14.<init>(r3)
            int r15 = r11 - r10
            java.math.BigDecimal r14 = r14.movePointLeft(r15)
            j$.time.temporal.l r15 = r12.a
            j$.time.temporal.o r15 = r15.range()
            long r0 = r15.a
            java.math.BigDecimal r0 = java.math.BigDecimal.valueOf(r0)
            long r3 = r15.d
            java.math.BigDecimal r15 = java.math.BigDecimal.valueOf(r3)
            java.math.BigDecimal r15 = r15.subtract(r0)
            java.math.BigDecimal r1 = java.math.BigDecimal.ONE
            java.math.BigDecimal r15 = r15.add(r1)
            java.math.BigDecimal r14 = r14.multiply(r15)
            java.math.RoundingMode r15 = java.math.RoundingMode.FLOOR
            java.math.BigDecimal r14 = r14.setScale(r2, r15)
            java.math.BigDecimal r14 = r14.add(r0)
            long r8 = r14.longValueExact()
            j$.time.temporal.l r7 = r12.a
            r6 = r13
            int r15 = r6.f(r7, r8, r10, r11)
        La9:
            return r15
        */
        throw new UnsupportedOperationException("Method not decompiled: j$.time.format.f.k(j$.time.format.v, java.lang.CharSequence, int):int");
    }

    @Override // j$.time.format.i
    public final java.lang.String toString() {
        java.lang.String str = this.g ? ",DecimalPoint" : "";
        return "Fraction(" + java.lang.String.valueOf(this.a) + "," + this.b + "," + this.c + str + ")";
    }

    public f(j$.time.temporal.l lVar, int i, int i2, boolean z, int i3) {
        super(lVar, i, i2, j$.time.format.d0.NOT_NEGATIVE, i3);
        this.g = z;
    }
}
