package com.google.android.gms.phenotype;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes.dex */
public class Flag extends com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable implements java.lang.Comparable {
    public static final android.os.Parcelable.Creator CREATOR = new defpackage.aaso(2);
    public final java.lang.String a;
    final long b;
    final boolean c;
    final double d;
    final java.lang.String e;
    final byte[] f;
    public final int g;
    public final int h;
    public final int i;

    public Flag(java.lang.String str, long j, boolean z, double d, java.lang.String str2, byte[] bArr, int i, int i2, int i3) {
        this.a = str;
        this.b = j;
        this.c = z;
        this.d = d;
        this.e = str2;
        this.f = bArr;
        this.g = i;
        this.h = i2;
        this.i = i3;
    }

    private static int g(int i, int i2) {
        if (i < i2) {
            return -1;
        }
        return i != i2 ? 1 : 0;
    }

    public final double a() {
        if (this.g == 3) {
            return this.d;
        }
        throw new java.lang.IllegalArgumentException("Not a double type");
    }

    public final long b() {
        if (this.g == 1) {
            return this.b;
        }
        throw new java.lang.IllegalArgumentException("Not a long type");
    }

    public final java.lang.String c() {
        if (this.g != 4) {
            throw new java.lang.IllegalArgumentException("Not a String type");
        }
        java.lang.String str = this.e;
        defpackage.aais.as(str);
        return str;
    }

    /* JADX WARN: Code restructure failed: missing block: B:36:0x0072, code lost:
    
        if (r6 != false) goto L43;
     */
    /* JADX WARN: Code restructure failed: missing block: B:41:0x007f, code lost:
    
        if (r4 == r6) goto L42;
     */
    @Override // java.lang.Comparable
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final /* bridge */ /* synthetic */ int compareTo(java.lang.Object r7) {
        /*
            r6 = this;
            com.google.android.gms.phenotype.Flag r7 = (com.google.android.gms.phenotype.Flag) r7
            java.lang.String r0 = r7.a
            java.lang.String r1 = r6.a
            int r0 = r1.compareTo(r0)
            if (r0 != 0) goto L84
            int r0 = r6.g
            int r1 = r7.g
            int r1 = g(r0, r1)
            if (r1 != 0) goto L7d
            r1 = -1
            r2 = 0
            r3 = 1
            if (r0 == r3) goto L75
            r4 = 2
            if (r0 == r4) goto L6c
            r4 = 3
            if (r0 == r4) goto L63
            r4 = 4
            if (r0 == r4) goto L54
            r4 = 5
            if (r0 != r4) goto L48
            byte[] r6 = r6.f
            byte[] r7 = r7.f
            if (r6 == r7) goto L81
            if (r6 == 0) goto L7d
            if (r7 == 0) goto L83
        L31:
            int r0 = r7.length
            int r1 = r6.length
            int r3 = java.lang.Math.min(r1, r0)
            if (r2 >= r3) goto L43
            r0 = r6[r2]
            r1 = r7[r2]
            int r0 = r0 - r1
            if (r0 != 0) goto L84
            int r2 = r2 + 1
            goto L31
        L43:
            int r0 = g(r1, r0)
            goto L84
        L48:
            java.lang.AssertionError r6 = new java.lang.AssertionError
            java.lang.String r7 = "Invalid enum value: "
            java.lang.String r7 = defpackage.a.bj(r0, r7)
            r6.<init>(r7)
            throw r6
        L54:
            java.lang.String r6 = r6.e
            java.lang.String r7 = r7.e
            if (r6 == r7) goto L81
            if (r6 == 0) goto L7d
            if (r7 == 0) goto L83
            int r0 = r6.compareTo(r7)
            goto L84
        L63:
            double r0 = r6.d
            double r6 = r7.d
            int r0 = java.lang.Double.compare(r0, r6)
            goto L84
        L6c:
            boolean r6 = r6.c
            boolean r7 = r7.c
            if (r6 == r7) goto L81
            if (r6 == 0) goto L7d
            goto L83
        L75:
            long r4 = r6.b
            long r6 = r7.b
            int r6 = (r4 > r6 ? 1 : (r4 == r6 ? 0 : -1))
            if (r6 >= 0) goto L7f
        L7d:
            r0 = r1
            goto L84
        L7f:
            if (r6 != 0) goto L83
        L81:
            r0 = r2
            goto L84
        L83:
            r0 = r3
        L84:
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.phenotype.Flag.compareTo(java.lang.Object):int");
    }

    final void d(java.lang.StringBuilder sb) {
        sb.append("Flag(");
        java.lang.String str = this.a;
        sb.append(str);
        sb.append(", ");
        int i = this.g;
        if (i == 1) {
            sb.append(this.b);
        } else if (i == 2) {
            sb.append(this.c);
        } else if (i == 3) {
            sb.append(this.d);
        } else if (i == 4) {
            sb.append('\'');
            java.lang.String str2 = this.e;
            defpackage.aais.as(str2);
            sb.append(str2);
            sb.append('\'');
        } else {
            if (i != 5) {
                throw new java.lang.AssertionError(defpackage.a.bu(i, str, "Invalid type: ", ", "));
            }
            sb.append('\'');
            byte[] bArr = this.f;
            defpackage.aais.as(bArr);
            sb.append(android.util.Base64.encodeToString(bArr, 3));
            sb.append('\'');
        }
        sb.append(", ");
        sb.append(i);
        sb.append(", ");
        sb.append(this.h);
        sb.append(", ");
        sb.append(this.i);
        sb.append(')');
    }

    public final boolean e() {
        if (this.g == 2) {
            return this.c;
        }
        throw new java.lang.IllegalArgumentException("Not a boolean type");
    }

    public final boolean equals(java.lang.Object obj) {
        int i;
        if (!(obj instanceof com.google.android.gms.phenotype.Flag)) {
            return false;
        }
        com.google.android.gms.phenotype.Flag flag = (com.google.android.gms.phenotype.Flag) obj;
        if (!defpackage.anty.H(this.a, flag.a) || (i = this.g) != flag.g || this.h != flag.h || this.i != flag.i) {
            return false;
        }
        if (i != 1) {
            if (i != 2) {
                if (i != 3) {
                    if (i == 4) {
                        return defpackage.anty.H(this.e, flag.e);
                    }
                    if (i == 5) {
                        return java.util.Arrays.equals(this.f, flag.f);
                    }
                    throw new java.lang.AssertionError(defpackage.a.bj(i, "Invalid enum value: "));
                }
                if (this.d != flag.d) {
                    return false;
                }
            } else if (this.c != flag.c) {
                return false;
            }
        } else if (this.b != flag.b) {
            return false;
        }
        return true;
    }

    public final byte[] f() {
        if (this.g != 5) {
            throw new java.lang.IllegalArgumentException("Not a bytes type");
        }
        byte[] bArr = this.f;
        defpackage.aais.as(bArr);
        return bArr;
    }

    public final java.lang.String toString() {
        java.lang.StringBuilder sb = new java.lang.StringBuilder();
        d(sb);
        return sb.toString();
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(android.os.Parcel parcel, int i) {
        int iF = defpackage.aais.f(parcel, 20293);
        java.lang.String str = this.a;
        if (!defpackage.aaso.b(str)) {
            defpackage.aais.A(parcel, 2, str);
        }
        long j = this.b;
        if (j != 0) {
            defpackage.aais.m(parcel, 3, j);
        }
        if (this.c) {
            defpackage.aais.h(parcel, 4, true);
        }
        double d = this.d;
        if (d != 0.0d) {
            defpackage.aais.j(parcel, 5, d);
        }
        java.lang.String str2 = this.e;
        if (!defpackage.aaso.b(str2)) {
            defpackage.aais.A(parcel, 6, str2);
        }
        byte[] bArr = this.f;
        if (!defpackage.aaso.b(bArr)) {
            defpackage.aais.q(parcel, 7, bArr);
        }
        int i2 = this.g;
        if (!defpackage.aaso.a(i2)) {
            defpackage.aais.l(parcel, 8, i2);
        }
        int i3 = this.h;
        if (!defpackage.aaso.a(i3)) {
            defpackage.aais.l(parcel, 9, i3);
        }
        int i4 = this.i;
        if (!defpackage.aaso.a(i4)) {
            defpackage.aais.l(parcel, 10, i4);
        }
        defpackage.aais.g(parcel, iF);
    }
}
