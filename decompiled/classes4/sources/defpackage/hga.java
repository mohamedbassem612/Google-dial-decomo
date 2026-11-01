package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes4.dex */
public final class hga extends hfz {
    private static final appb f;
    private static final appb g;
    private static final appb h;
    private static final appb i;
    private static final appb j;
    private final appa k;
    private final apoy l;
    private int m = 0;
    private long n;
    private int o;
    private java.lang.String p;

    static {
        appb appbVar = appb.a;
        f = aoov.aQ("'\\");
        g = aoov.aQ("\"\\");
        h = aoov.aQ("{}[]:, \n\t\r\f/\\;#=");
        i = aoov.aQ("\n\r");
        j = aoov.aQ("*/");
    }

    public hga(appa appaVar) {
        this.k = appaVar;
        this.l = ((appx) appaVar).b;
        k(6);
    }

    /* JADX INFO: Thrown type has an unknown type hierarchy: hfy */
    /* JADX WARN: Code duplicated, block: B:30:0x0039  */
    private final boolean A(int i2) throws hfy {
        if (i2 != 9 && i2 != 10 && i2 != 12 && i2 != 13 && i2 != 32) {
            if (i2 == 35) {
                w();
            } else if (i2 != 44) {
                if (i2 == 47 || i2 == 61) {
                    w();
                } else if (i2 != 123 && i2 != 125 && i2 != 58) {
                    if (i2 != 59) {
                        switch (i2) {
                            case 92:
                                w();
                            case 91:
                            case 93:
                                return false;
                            default:
                                return true;
                        }
                    } else {
                        w();
                    }
                }
            }
        }
        return false;
    }

    private final int B(java.lang.String str, kvt kvtVar) {
        java.lang.String[] strArr = (java.lang.String[]) kvtVar.a;
        int length = strArr.length;
        for (int i2 = 0; i2 < length; i2++) {
            if (str.equals(strArr[i2])) {
                this.m = 0;
                this.d[this.b - 1] = str;
                return i2;
            }
        }
        return -1;
    }

    /* JADX INFO: Thrown type has an unknown type hierarchy: hfy */
    private final char r() throws hfy, java.io.EOFException {
        int i2;
        appa appaVar = this.k;
        if (!appaVar.C(1L)) {
            throw c("Unterminated escape sequence");
        }
        apoy apoyVar = this.l;
        byte bD = apoyVar.d();
        if (bD == 10 || bD == 34 || bD == 39 || bD == 47 || bD == 92) {
            return (char) bD;
        }
        if (bD == 98) {
            return '\b';
        }
        if (bD == 102) {
            return '\f';
        }
        if (bD == 110) {
            return '\n';
        }
        if (bD == 114) {
            return '\r';
        }
        if (bD == 116) {
            return '\t';
        }
        if (bD != 117) {
            throw c("Invalid escape sequence: \\" + ((char) bD));
        }
        if (!appaVar.C(4L)) {
            throw new java.io.EOFException("Unterminated escape sequence at path ".concat(d()));
        }
        char c = 0;
        for (int i3 = 0; i3 < 4; i3++) {
            byte bC = apoyVar.c(i3);
            char c2 = (char) (c << 4);
            if (bC >= 48 && bC <= 57) {
                i2 = bC - 48;
            } else if (bC >= 97 && bC <= 102) {
                i2 = bC - 87;
            } else {
                if (bC < 65 || bC > 70) {
                    throw c("\\u".concat(apoyVar.p(4L)));
                }
                i2 = bC - 55;
            }
            c = (char) (c2 + i2);
        }
        apoyVar.A(4L);
        return c;
    }

    /* JADX INFO: Thrown type has an unknown type hierarchy: hfy */
    /* JADX WARN: Code duplicated, block: B:126:0x01a1  */
    /* JADX WARN: Code duplicated, block: B:127:0x01a3  */
    /* JADX WARN: Code duplicated, block: B:129:0x01a9 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:131:0x01ac  */
    /* JADX WARN: Code duplicated, block: B:134:0x01b1 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:135:0x01b3  */
    /* JADX WARN: Code duplicated, block: B:138:0x01b7  */
    /* JADX WARN: Code duplicated, block: B:142:0x01c4 A[DONT_INVERT, PHI: r1
      0x01c4: PHI (r1v35 char) = (r1v34 char), (r1v38 char) binds: [B:125:0x019f, B:141:0x01c3] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Code duplicated, block: B:143:0x01c6  */
    /* JADX WARN: Code duplicated, block: B:156:0x01e1  */
    /* JADX WARN: Code duplicated, block: B:158:0x01e4  */
    /* JADX WARN: Code duplicated, block: B:161:0x01e9  */
    /* JADX WARN: Code duplicated, block: B:167:0x01f4  */
    /* JADX WARN: Code duplicated, block: B:169:0x0200  */
    /* JADX WARN: Code duplicated, block: B:171:0x020a  */
    /* JADX WARN: Code duplicated, block: B:173:0x0211  */
    /* JADX WARN: Code duplicated, block: B:180:0x022e A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:181:0x0230 A[ADDED_TO_REGION] */
    /* JADX WARN: Code duplicated, block: B:187:0x0241  */
    /* JADX WARN: Code duplicated, block: B:190:0x024f  */
    /* JADX WARN: Code duplicated, block: B:226:0x01f1 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:227:0x019f A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:245:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:41:0x009b  */
    /* JADX WARN: Code duplicated, block: B:43:0x009f  */
    /* JADX WARN: Code duplicated, block: B:84:0x012a  */
    /* JADX WARN: Code duplicated, block: B:87:0x013b  */
    /* JADX WARN: Code duplicated, block: B:89:0x0144  */
    private final int s() throws hfy, java.io.EOFException {
        int i2;
        int i3;
        int iT;
        int i4;
        java.lang.String str;
        java.lang.String str2;
        int i5;
        long j2;
        char c;
        boolean z;
        long j3;
        char c2;
        int i6;
        int i7;
        int i8;
        int i9;
        int i10;
        byte bC;
        char c3;
        int[] iArr = this.c;
        int i11 = this.b - 1;
        int i12 = iArr[i11];
        long j4 = 0;
        int i13 = 2;
        int i14 = 1;
        if (i12 != 1) {
            if (i12 != 2) {
                if (i12 == 3 || i12 == 5) {
                    iArr[i11] = 4;
                    if (i12 == 5) {
                        int iT2 = t(true);
                        this.l.d();
                        if (iT2 != 44) {
                            if (iT2 == 59) {
                                w();
                            } else if (iT2 != 125) {
                                throw c("Unterminated object");
                            }
                            this.m = i13;
                            return i13;
                        }
                    }
                    int iT3 = t(true);
                    if (iT3 == 34) {
                        this.l.d();
                        this.m = 13;
                        return 13;
                    }
                    if (iT3 == 39) {
                        this.l.d();
                        w();
                        this.m = 12;
                        return 12;
                    }
                    if (iT3 == 125) {
                        if (i12 == 5) {
                            throw c("Expected name");
                        }
                        this.l.d();
                        this.m = 2;
                        return 2;
                    }
                    w();
                    if (!A((char) iT3)) {
                        throw c("Expected name");
                    }
                    i2 = 14;
                } else if (i12 == 4) {
                    iArr[i11] = 5;
                    int iT4 = t(true);
                    apoy apoyVar = this.l;
                    apoyVar.d();
                    if (iT4 != 58) {
                        if (iT4 != 61) {
                            throw c("Expected ':'");
                        }
                        w();
                        if (this.k.C(1L) && apoyVar.c(0L) == 62) {
                            apoyVar.d();
                        }
                    }
                } else if (i12 == 6) {
                    iArr[i11] = 7;
                } else {
                    i3 = 0;
                    if (i12 == 7) {
                        if (t(false) == -1) {
                            i2 = 18;
                        } else {
                            w();
                        }
                    } else if (i12 == 8) {
                        throw new java.lang.IllegalStateException("JsonReader is closed");
                    }
                }
                i13 = i2;
                this.m = i13;
                return i13;
            }
            int iT5 = t(true);
            this.l.d();
            if (iT5 != 44) {
                if (iT5 != 59) {
                    if (iT5 != 93) {
                        throw c("Unterminated array");
                    }
                    i13 = 4;
                    this.m = i13;
                    return i13;
                }
                w();
            }
            iT = t(true);
            if (iT != 34) {
                this.l.d();
                this.m = 9;
                return 9;
            }
            if (iT != 39) {
                if (iT != 44 || iT == 59) {
                    if (i12 == 1 && i12 != 2) {
                        throw c("Unexpected value");
                    }
                    w();
                    i14 = 7;
                    this.m = 7;
                } else if (iT == 91) {
                    this.l.d();
                    i4 = 3;
                    this.m = 3;
                } else if (iT != 93) {
                    apoy apoyVar2 = this.l;
                    if (iT != 123) {
                        byte bC2 = apoyVar2.c(0L);
                        if (bC2 == 116 || bC2 == 84) {
                            str = "TRUE";
                            str2 = "true";
                            i5 = 5;
                        } else {
                            if (bC2 != 102 && bC2 != 70) {
                                if (bC2 == 110 || bC2 == 78) {
                                    str = "NULL";
                                    str2 = "null";
                                    i5 = 7;
                                } else {
                                    j2 = 0;
                                }
                                if (i3 == 0) {
                                    return i3;
                                }
                                z = true;
                                j3 = j2;
                                c2 = 0;
                                i6 = 0;
                                i7 = 0;
                                while (true) {
                                    i8 = i6 + 1;
                                    if (!this.k.C(i8)) {
                                        bC = apoyVar2.c(i6);
                                        if (bC != 43) {
                                            if (bC != 69 || bC == 101) {
                                                if (c2 != 2 || c2 == 4) {
                                                    c2 = 5;
                                                    i6 = i8;
                                                } else {
                                                    i10 = 0;
                                                }
                                            } else if (bC == 45) {
                                                c3 = 6;
                                                if (c2 == 0) {
                                                    c2 = 1;
                                                    i7 = 1;
                                                } else {
                                                    if (c2 != 5) {
                                                        i10 = 0;
                                                    }
                                                    c2 = c3;
                                                }
                                                i6 = i8;
                                            } else if (bC != 46) {
                                                if (bC >= 48 && bC <= 57) {
                                                    if (c2 == 1 || c2 == 0) {
                                                        j3 = -(bC - 48);
                                                        c2 = 2;
                                                    } else if (c2 == 2) {
                                                        if (j3 != j2) {
                                                            long j5 = (10 * j3) - ((long) (bC - 48));
                                                            z &= j3 > -922337203685477580L || (j3 == -922337203685477580L && j5 < j3);
                                                            j3 = j5;
                                                        }
                                                    } else if (c2 == 3) {
                                                        c2 = 4;
                                                    } else if (c2 == 5 || c2 == 6) {
                                                        c2 = 7;
                                                    }
                                                    i6 = i8;
                                                } else if (!A(bC)) {
                                                }
                                                i10 = 0;
                                            } else if (c2 == 2) {
                                                c2 = 3;
                                                i6 = i8;
                                            } else {
                                                i10 = 0;
                                            }
                                            if (i10 != 0) {
                                                return i10;
                                            }
                                            if (!A(apoyVar2.c(j2))) {
                                                throw c("Expected value");
                                            }
                                            w();
                                            this.m = 10;
                                            return 10;
                                        }
                                        c3 = 6;
                                        if (c2 != 5) {
                                            i10 = 0;
                                            if (i10 != 0) {
                                                return i10;
                                            }
                                            if (!A(apoyVar2.c(j2))) {
                                                throw c("Expected value");
                                            }
                                            w();
                                            this.m = 10;
                                            return 10;
                                        }
                                        c2 = c3;
                                        i6 = i8;
                                    }
                                    if (c2 != 2) {
                                        if (c2 != 2 || c2 == 4 || c2 == 7) {
                                            this.o = i6;
                                            i9 = 17;
                                            this.m = 17;
                                        } else {
                                            i10 = 0;
                                        }
                                        if (i10 != 0) {
                                            return i10;
                                        }
                                        if (!A(apoyVar2.c(j2))) {
                                            throw c("Expected value");
                                        }
                                        w();
                                        this.m = 10;
                                        return 10;
                                    }
                                    if (z) {
                                        if (j3 == Long.MIN_VALUE) {
                                            i14 = i7;
                                        } else if (i7 != 0) {
                                        }
                                        if (j3 == j2) {
                                            if (i14 == 0) {
                                                i14 = 0;
                                            }
                                        }
                                        long j6 = i6;
                                        if (i14 == 0) {
                                            j3 = -j3;
                                        }
                                        this.n = j3;
                                        apoyVar2.A(j6);
                                        i9 = 16;
                                        this.m = 16;
                                    }
                                    c2 = 2;
                                    if (c2 != 2) {
                                    }
                                    this.o = i6;
                                    i9 = 17;
                                    this.m = 17;
                                    i10 = i9;
                                    if (i10 != 0) {
                                        return i10;
                                    }
                                    if (!A(apoyVar2.c(j2))) {
                                        throw c("Expected value");
                                    }
                                    w();
                                    this.m = 10;
                                    return 10;
                                }
                            }
                            str = "FALSE";
                            str2 = "false";
                            i5 = 6;
                        }
                        int i15 = 1;
                        while (true) {
                            int length = str2.length();
                            appa appaVar = this.k;
                            if (i15 >= length) {
                                j2 = j4;
                                long j7 = length;
                                if (!appaVar.C(length + 1) || !A(apoyVar2.c(j7))) {
                                    apoyVar2.A(j7);
                                    this.m = i5;
                                    i3 = i5;
                                    break;
                                }
                                i3 = 0;
                                break;
                            }
                            int i16 = i15 + 1;
                            j2 = j4;
                            if (!appaVar.C(i16) || ((c = apoyVar2.c(i15)) != str2.charAt(i15) && c != str.charAt(i15))) {
                                break;
                            }
                            i15 = i16;
                            j4 = j2;
                        }
                        if (i3 == 0) {
                            return i3;
                        }
                        z = true;
                        j3 = j2;
                        c2 = 0;
                        i6 = 0;
                        i7 = 0;
                        while (true) {
                            i8 = i6 + 1;
                            if (!this.k.C(i8)) {
                                bC = apoyVar2.c(i6);
                                if (bC != 43) {
                                    if (bC != 69) {
                                        if (c2 != 2) {
                                        }
                                        c2 = 5;
                                        i6 = i8;
                                    } else {
                                        if (c2 != 2) {
                                        }
                                        c2 = 5;
                                        i6 = i8;
                                    }
                                    if (i10 != 0) {
                                        return i10;
                                    }
                                    if (!A(apoyVar2.c(j2))) {
                                        throw c("Expected value");
                                    }
                                    w();
                                    this.m = 10;
                                    return 10;
                                }
                                c3 = 6;
                                if (c2 != 5) {
                                    i10 = 0;
                                    if (i10 != 0) {
                                        return i10;
                                    }
                                    if (!A(apoyVar2.c(j2))) {
                                        throw c("Expected value");
                                    }
                                    w();
                                    this.m = 10;
                                    return 10;
                                }
                                c2 = c3;
                                i6 = i8;
                            }
                            if (c2 != 2) {
                                if (c2 != 2) {
                                }
                                this.o = i6;
                                i9 = 17;
                                this.m = 17;
                            } else {
                                if (z) {
                                    if (j3 == Long.MIN_VALUE) {
                                        i14 = i7;
                                    } else if (i7 != 0) {
                                    }
                                    if (j3 == j2) {
                                        if (i14 == 0) {
                                            i14 = 0;
                                        }
                                    }
                                    long j8 = i6;
                                    if (i14 == 0) {
                                        j3 = -j3;
                                    }
                                    this.n = j3;
                                    apoyVar2.A(j8);
                                    i9 = 16;
                                    this.m = 16;
                                }
                                c2 = 2;
                                if (c2 != 2) {
                                }
                                this.o = i6;
                                i9 = 17;
                                this.m = 17;
                            }
                            i10 = i9;
                            if (i10 != 0) {
                                return i10;
                            }
                            if (!A(apoyVar2.c(j2))) {
                                throw c("Expected value");
                            }
                            w();
                            this.m = 10;
                            return 10;
                        }
                    }
                    apoyVar2.d();
                    this.m = 1;
                } else {
                    if (i12 == 1) {
                        this.l.d();
                        this.m = 4;
                        return 4;
                    }
                    if (i12 == 1) {
                    }
                    w();
                    i14 = 7;
                    this.m = 7;
                }
                return i14;
            }
            w();
            this.l.d();
            i4 = 8;
            this.m = 8;
            return i4;
        }
        iArr[i11] = 2;
        i3 = 0;
        iT = t(true);
        if (iT != 34) {
            this.l.d();
            this.m = 9;
            return 9;
        }
        if (iT != 39) {
            if (iT != 44) {
                if (i12 == 1) {
                }
                w();
                i14 = 7;
                this.m = 7;
            } else {
                if (i12 == 1) {
                }
                w();
                i14 = 7;
                this.m = 7;
            }
            return i14;
        }
        w();
        this.l.d();
        i4 = 8;
        this.m = 8;
        return i4;
    }

    /* JADX INFO: Thrown type has an unknown type hierarchy: hfy */
    private final int t(boolean z) throws hfy, java.io.EOFException {
        int i2;
        appx appxVar;
        apoy apoyVar;
        byte bC;
        long jB;
        boolean z2;
        long j2;
        while (true) {
            while (true) {
                appxVar = this.k;
                int i3 = i2 + 1;
                if (!appxVar.C(i3)) {
                    if (z) {
                        throw new java.io.EOFException("End of input");
                    }
                    return -1;
                }
                apoyVar = this.l;
                bC = apoyVar.c(i2);
                i2 = (bC == 10 || bC == 32 || bC == 13 || bC == 9) ? i3 : 0;
            }
            apoyVar.A(i2);
            if (bC == 47) {
                if (appxVar.C(2L)) {
                    w();
                    long j3 = 1;
                    byte bC2 = apoyVar.c(1L);
                    if (bC2 == 42) {
                        apoyVar.d();
                        apoyVar.d();
                        appb appbVar = j;
                        if (appbVar == null) {
                            aooh.i("bytes");
                            aooh.i("bytes");
                            aooh.i("bytes");
                        }
                        int iC = appbVar.c();
                        if (appbVar == null) {
                            aooh.i("bytes");
                        }
                        long j4 = iC;
                        aoov.aV(appbVar.c(), 0L, j4);
                        appx appxVar2 = appxVar;
                        if (appxVar2.c) {
                            throw new java.lang.IllegalStateException("closed");
                        }
                        long jMax = 0;
                        while (true) {
                            apoy apoyVar2 = appxVar2.b;
                            long j5 = j4;
                            jB = defpackage.apqh.b(apoyVar2, appbVar, jMax, Long.MAX_VALUE, iC);
                            z2 = true;
                            if (jB != -1) {
                                break;
                            }
                            long j6 = apoyVar2.b;
                            long j7 = j3;
                            long j8 = (j6 - j5) + j7;
                            if (j8 < Long.MAX_VALUE) {
                                if (j6 < Long.MAX_VALUE) {
                                    j2 = j8;
                                } else {
                                    int iMin = ((int) java.lang.Math.min(j5, (apoyVar2.b - jMax) + j7)) - 1;
                                    if (1 <= iMin) {
                                        while (true) {
                                            j2 = j8;
                                            if (apoyVar2.H(apoyVar2.b - ((long) iMin), appbVar, iMin)) {
                                                z2 = true;
                                            } else {
                                                z2 = true;
                                                if (iMin != 1) {
                                                    iMin--;
                                                    j8 = j2;
                                                }
                                            }
                                        }
                                    }
                                }
                                if (appxVar2.a.b(apoyVar2, 8192L) != -1) {
                                    jMax = java.lang.Math.max(jMax, j2);
                                    j4 = j5;
                                    j3 = j7;
                                }
                            }
                            jB = -1;
                            break;
                        }
                        if (jB == -1) {
                            z2 = false;
                        }
                        apoyVar.A(z2 ? jB + ((long) appbVar.c()) : apoyVar.b);
                        if (!z2) {
                            throw c("Unterminated comment");
                        }
                    } else if (bC2 == 47) {
                        apoyVar.d();
                        apoyVar.d();
                        y();
                    }
                }
                return 47;
            }
            if (bC != 35) {
                return bC;
            }
            w();
            y();
        }
    }

    /* JADX INFO: Thrown type has an unknown type hierarchy: hfy */
    private final java.lang.String u(appb appbVar) throws hfy {
        java.lang.StringBuilder sb = null;
        while (true) {
            long j2 = this.k.j(appbVar);
            if (j2 == -1) {
                throw c("Unterminated string");
            }
            apoy apoyVar = this.l;
            if (apoyVar.c(j2) != 92) {
                if (sb == null) {
                    java.lang.String strP = apoyVar.p(j2);
                    apoyVar.d();
                    return strP;
                }
                sb.append(apoyVar.p(j2));
                apoyVar.d();
                return sb.toString();
            }
            if (sb == null) {
                sb = new java.lang.StringBuilder();
            }
            sb.append(apoyVar.p(j2));
            apoyVar.d();
            sb.append(r());
        }
    }

    private final java.lang.String v() {
        long j2 = this.k.j(h);
        apoy apoyVar = this.l;
        return j2 != -1 ? apoyVar.p(j2) : apoyVar.o();
    }

    /* JADX INFO: Thrown type has an unknown type hierarchy: hfy */
    private final void w() throws hfy {
        throw c("Use JsonReader.setLenient(true) to accept malformed JSON");
    }

    /* JADX INFO: Thrown type has an unknown type hierarchy: hfy */
    private final void x(appb appbVar) throws hfy, java.io.EOFException {
        while (true) {
            long j2 = this.k.j(appbVar);
            if (j2 == -1) {
                throw c("Unterminated string");
            }
            long j3 = 1 + j2;
            apoy apoyVar = this.l;
            if (apoyVar.c(j2) != 92) {
                apoyVar.A(j3);
                return;
            } else {
                apoyVar.A(j3);
                r();
            }
        }
    }

    private final void y() {
        long j2 = this.k.j(i);
        apoy apoyVar = this.l;
        apoyVar.A(j2 != -1 ? j2 + 1 : apoyVar.b);
    }

    private final void z() {
        long j2 = this.k.j(h);
        apoy apoyVar = this.l;
        if (j2 == -1) {
            j2 = apoyVar.b;
        }
        apoyVar.A(j2);
    }

    /* JADX INFO: Thrown type has an unknown type hierarchy: hfx */
    /* JADX INFO: Thrown type has an unknown type hierarchy: hfy */
    public final double a() throws hfy, hfx, java.io.EOFException {
        int iS = this.m;
        if (iS == 0) {
            iS = s();
        }
        if (iS == 16) {
            this.m = 0;
            int[] iArr = this.e;
            int i2 = this.b - 1;
            iArr[i2] = iArr[i2] + 1;
            return this.n;
        }
        if (iS == 17) {
            this.p = this.l.p(this.o);
        } else if (iS == 9) {
            this.p = u(g);
        } else if (iS == 8) {
            this.p = u(f);
        } else if (iS == 10) {
            this.p = v();
        } else if (iS != 11) {
            throw new hfx(hgb.a(this, "Expected a double but was "));
        }
        this.m = 11;
        try {
            double d = java.lang.Double.parseDouble(this.p);
            if (java.lang.Double.isNaN(d) || java.lang.Double.isInfinite(d)) {
                throw new hfy("JSON forbids NaN and infinities: " + d + " at path " + d());
            }
            this.p = null;
            this.m = 0;
            int[] iArr2 = this.e;
            int i3 = this.b - 1;
            iArr2[i3] = iArr2[i3] + 1;
            return d;
        } catch (java.lang.NumberFormatException unused) {
            throw new hfx("Expected a double but was " + this.p + " at path " + d());
        }
    }

    /* JADX INFO: Thrown type has an unknown type hierarchy: hfx */
    /* JADX INFO: Thrown type has an unknown type hierarchy: hfy */
    public final int b() throws hfy, hfx, java.io.EOFException {
        java.lang.String strU;
        int iS = this.m;
        if (iS == 0) {
            iS = s();
        }
        if (iS == 16) {
            long j2 = this.n;
            int i2 = (int) j2;
            if (j2 == i2) {
                this.m = 0;
                int[] iArr = this.e;
                int i3 = this.b - 1;
                iArr[i3] = iArr[i3] + 1;
                return i2;
            }
            throw new hfx("Expected an int but was " + j2 + " at path " + d());
        }
        if (iS == 17) {
            this.p = this.l.p(this.o);
        } else {
            if (iS == 9) {
                strU = u(g);
            } else if (iS == 8) {
                strU = u(f);
            } else if (iS != 11) {
                throw new hfx(hgb.a(this, "Expected an int but was "));
            }
            this.p = strU;
            try {
                int i4 = java.lang.Integer.parseInt(strU);
                this.m = 0;
                int[] iArr2 = this.e;
                int i5 = this.b - 1;
                iArr2[i5] = iArr2[i5] + 1;
                return i4;
            } catch (java.lang.NumberFormatException unused) {
            }
        }
        this.m = 11;
        try {
            double d = java.lang.Double.parseDouble(this.p);
            int i6 = (int) d;
            if (i6 == d) {
                this.p = null;
                this.m = 0;
                int[] iArr3 = this.e;
                int i7 = this.b - 1;
                iArr3[i7] = iArr3[i7] + 1;
                return i6;
            }
            throw new hfx("Expected an int but was " + this.p + " at path " + d());
        } catch (java.lang.NumberFormatException unused2) {
            throw new hfx("Expected an int but was " + this.p + " at path " + d());
        }
    }

    public final void close() {
        this.m = 0;
        this.c[0] = 8;
        this.b = 1;
        this.l.y();
        this.k.close();
    }

    /* JADX INFO: Thrown type has an unknown type hierarchy: hfx */
    /* JADX INFO: Thrown type has an unknown type hierarchy: hfy */
    public final java.lang.String e() throws hfy, hfx, java.io.EOFException {
        java.lang.String strU;
        int iS = this.m;
        if (iS == 0) {
            iS = s();
        }
        if (iS == 14) {
            strU = v();
        } else if (iS == 13) {
            strU = u(g);
        } else if (iS == 12) {
            strU = u(f);
        } else {
            if (iS != 15) {
                throw new hfx(hgb.a(this, "Expected a name but was "));
            }
            strU = this.p;
        }
        this.m = 0;
        this.d[this.b - 1] = strU;
        return strU;
    }

    /* JADX INFO: Thrown type has an unknown type hierarchy: hfx */
    /* JADX INFO: Thrown type has an unknown type hierarchy: hfy */
    public final java.lang.String f() throws hfy, hfx, java.io.EOFException {
        java.lang.String strP;
        int iS = this.m;
        if (iS == 0) {
            iS = s();
        }
        if (iS == 10) {
            strP = v();
        } else if (iS == 9) {
            strP = u(g);
        } else if (iS == 8) {
            strP = u(f);
        } else if (iS == 11) {
            strP = this.p;
            this.p = null;
        } else if (iS == 16) {
            strP = java.lang.Long.toString(this.n);
        } else {
            if (iS != 17) {
                throw new hfx(hgb.a(this, "Expected a string but was "));
            }
            strP = this.l.p(this.o);
        }
        this.m = 0;
        int[] iArr = this.e;
        int i2 = this.b - 1;
        iArr[i2] = iArr[i2] + 1;
        return strP;
    }

    /* JADX INFO: Thrown type has an unknown type hierarchy: hfx */
    /* JADX INFO: Thrown type has an unknown type hierarchy: hfy */
    public final void g() throws hfy, hfx, java.io.EOFException {
        int iS = this.m;
        if (iS == 0) {
            iS = s();
        }
        if (iS != 3) {
            throw new hfx(hgb.a(this, "Expected BEGIN_ARRAY but was "));
        }
        k(1);
        this.e[this.b - 1] = 0;
        this.m = 0;
    }

    /* JADX INFO: Thrown type has an unknown type hierarchy: hfx */
    /* JADX INFO: Thrown type has an unknown type hierarchy: hfy */
    public final void h() throws hfy, hfx, java.io.EOFException {
        int iS = this.m;
        if (iS == 0) {
            iS = s();
        }
        if (iS != 1) {
            throw new hfx(hgb.a(this, "Expected BEGIN_OBJECT but was "));
        }
        k(3);
        this.m = 0;
    }

    /* JADX INFO: Thrown type has an unknown type hierarchy: hfx */
    /* JADX INFO: Thrown type has an unknown type hierarchy: hfy */
    public final void i() throws hfy, hfx, java.io.EOFException {
        int iS = this.m;
        if (iS == 0) {
            iS = s();
        }
        if (iS != 4) {
            throw new hfx(hgb.a(this, "Expected END_ARRAY but was "));
        }
        int i2 = this.b;
        this.b = i2 - 1;
        int[] iArr = this.e;
        int i3 = i2 - 2;
        iArr[i3] = iArr[i3] + 1;
        this.m = 0;
    }

    /* JADX INFO: Thrown type has an unknown type hierarchy: hfx */
    /* JADX INFO: Thrown type has an unknown type hierarchy: hfy */
    public final void j() throws hfy, hfx, java.io.EOFException {
        int iS = this.m;
        if (iS == 0) {
            iS = s();
        }
        if (iS != 2) {
            throw new hfx(hgb.a(this, "Expected END_OBJECT but was "));
        }
        int i2 = this.b;
        int i3 = i2 - 1;
        this.b = i3;
        this.d[i3] = null;
        int[] iArr = this.e;
        int i4 = i2 - 2;
        iArr[i4] = iArr[i4] + 1;
        this.m = 0;
    }

    /* JADX INFO: Thrown type has an unknown type hierarchy: hfx */
    /* JADX INFO: Thrown type has an unknown type hierarchy: hfy */
    public final void l() throws hfy, hfx, java.io.EOFException {
        int iS = this.m;
        if (iS == 0) {
            iS = s();
        }
        if (iS == 14) {
            z();
        } else if (iS == 13) {
            x(g);
        } else if (iS == 12) {
            x(f);
        } else if (iS != 15) {
            throw new hfx(hgb.a(this, "Expected a name but was "));
        }
        this.m = 0;
        this.d[this.b - 1] = "null";
    }

    /* JADX INFO: Thrown type has an unknown type hierarchy: hfx */
    /* JADX INFO: Thrown type has an unknown type hierarchy: hfy */
    public final void m() throws hfy, hfx, java.io.EOFException {
        int i2 = 0;
        do {
            int iS = this.m;
            if (iS == 0) {
                iS = s();
            }
            if (iS == 3) {
                k(1);
            } else {
                if (iS == 1) {
                    k(3);
                } else if (iS == 4) {
                    i2--;
                    if (i2 < 0) {
                        throw new hfx(hgb.a(this, "Expected a value but was "));
                    }
                    this.b--;
                } else if (iS == 2) {
                    i2--;
                    if (i2 < 0) {
                        throw new hfx(hgb.a(this, "Expected a value but was "));
                    }
                    this.b--;
                } else if (iS == 14 || iS == 10) {
                    z();
                } else if (iS == 9 || iS == 13) {
                    x(g);
                } else if (iS == 8 || iS == 12) {
                    x(f);
                } else if (iS == 17) {
                    this.l.A(this.o);
                } else if (iS == 18) {
                    throw new hfx(hgb.a(this, "Expected a value but was "));
                }
                this.m = 0;
            }
            i2++;
            this.m = 0;
        } while (i2 != 0);
        int[] iArr = this.e;
        int i3 = this.b - 1;
        iArr[i3] = iArr[i3] + 1;
        this.d[i3] = "null";
    }

    /* JADX INFO: Thrown type has an unknown type hierarchy: hfy */
    public final boolean n() throws hfy, java.io.EOFException {
        int iS = this.m;
        if (iS == 0) {
            iS = s();
        }
        return (iS == 2 || iS == 4 || iS == 18) ? false : true;
    }

    /* JADX INFO: Thrown type has an unknown type hierarchy: hfx */
    /* JADX INFO: Thrown type has an unknown type hierarchy: hfy */
    public final boolean o() throws hfy, hfx, java.io.EOFException {
        int iS = this.m;
        if (iS == 0) {
            iS = s();
        }
        if (iS == 5) {
            this.m = 0;
            int[] iArr = this.e;
            int i2 = this.b - 1;
            iArr[i2] = iArr[i2] + 1;
            return true;
        }
        if (iS != 6) {
            throw new hfx(hgb.a(this, "Expected a boolean but was "));
        }
        this.m = 0;
        int[] iArr2 = this.e;
        int i3 = this.b - 1;
        iArr2[i3] = iArr2[i3] + 1;
        return false;
    }

    /* JADX INFO: Thrown type has an unknown type hierarchy: hfy */
    public final int p() throws hfy, java.io.EOFException {
        int iS = this.m;
        if (iS == 0) {
            iS = s();
        }
        switch (iS) {
            case 1:
                return 3;
            case 2:
                return 4;
            case 3:
                return 1;
            case 4:
                return 2;
            case 5:
            case 6:
                return 8;
            case 7:
                return 9;
            case 8:
            case org.chromium.net.NetworkException.ERROR_ADDRESS_UNREACHABLE /* 9 */:
            case org.chromium.net.NetworkException.ERROR_QUIC_PROTOCOL_FAILED /* 10 */:
            case org.chromium.net.NetworkException.ERROR_OTHER /* 11 */:
                return 6;
            case 12:
            case 13:
            case 14:
            case 15:
                return 5;
            case 16:
            case 17:
                return 7;
            default:
                return 10;
        }
    }

    /* JADX INFO: Thrown type has an unknown type hierarchy: hfx */
    /* JADX INFO: Thrown type has an unknown type hierarchy: hfy */
    /* JADX WARN: Code duplicated, block: B:77:0x0120 A[LOOP:1: B:17:0x003f->B:77:0x0120, LOOP_END] */
    /* JADX WARN: Code duplicated, block: B:89:0x00c0 A[SYNTHETIC] */
    public final int q(kvt kvtVar) throws hfy, hfx, java.io.EOFException {
        int i2;
        int i3;
        int i4;
        int i5;
        int iS = this.m;
        if (iS == 0) {
            iS = s();
        }
        int i6 = -1;
        if (iS < 12 || iS > 15) {
            return -1;
        }
        if (iS == 15) {
            return B(this.p, kvtVar);
        }
        appx appxVar = this.k;
        java.lang.Object obj = kvtVar.b;
        appx appxVar2 = appxVar;
        if (appxVar2.c) {
            throw new java.lang.IllegalStateException("closed");
        }
        while (true) {
            apoy apoyVar = appxVar2.b;
            byte[] bArr = defpackage.apqh.a;
            appy appyVar = apoyVar.a;
            if (appyVar != null) {
                int[] iArr = ((appn) obj).b;
                byte[] bArr2 = appyVar.a;
                int i7 = appyVar.b;
                int i8 = appyVar.c;
                int i9 = i6;
                appy appyVar2 = appyVar;
                int i10 = 0;
                while (true) {
                    int i11 = iArr[i10];
                    int i12 = iArr[i10 + 1];
                    if (i12 != i6) {
                        i9 = i12;
                    }
                    if (appyVar2 != null) {
                        int i13 = i10 + 2;
                        if (i11 < 0) {
                            int i14 = (-i11) + i13;
                            while (true) {
                                int i15 = i7 + 1;
                                int i16 = i13 + 1;
                                if ((bArr2[i7] & 255) == iArr[i13]) {
                                    boolean z = true;
                                    boolean z2 = i16 == i14;
                                    if (i15 != i8) {
                                        z = z2;
                                    } else {
                                        if (appyVar2 == null) {
                                            aooh.g();
                                        }
                                        appy appyVar3 = appyVar2.f;
                                        if (appyVar3 == null) {
                                            aooh.g();
                                        }
                                        int i17 = appyVar3.b;
                                        byte[] bArr3 = appyVar3.a;
                                        int i18 = appyVar3.c;
                                        if (appyVar3 != appyVar) {
                                            appyVar2 = appyVar3;
                                            i15 = i17;
                                            bArr2 = bArr3;
                                            i8 = i18;
                                            z = z2;
                                        } else if (z2) {
                                            i15 = i17;
                                            bArr2 = bArr3;
                                            i8 = i18;
                                            appyVar2 = null;
                                        }
                                    }
                                    if (z) {
                                        i5 = iArr[i16];
                                        i7 = i15;
                                        if (i5 >= 0) {
                                            i3 = i5;
                                        } else {
                                            i10 = -i5;
                                            i6 = -1;
                                        }
                                    } else {
                                        i13 = i16;
                                        i7 = i15;
                                    }
                                } else {
                                    i3 = i9;
                                }
                            }
                        } else {
                            int i19 = i7 + 1;
                            int i20 = bArr2[i7] & 255;
                            int i21 = i13 + i11;
                            while (true) {
                                if (i13 == i21) {
                                    i3 = i9;
                                } else if (i20 == iArr[i13]) {
                                    i5 = iArr[i13 + i11];
                                    if (i19 == i8) {
                                        appyVar2 = appyVar2.f;
                                        if (appyVar2 == null) {
                                            aooh.g();
                                        }
                                        i7 = appyVar2.b;
                                        bArr2 = appyVar2.a;
                                        i8 = appyVar2.c;
                                        if (appyVar2 == appyVar) {
                                            appyVar2 = null;
                                        }
                                    } else {
                                        i7 = i19;
                                    }
                                    if (i5 >= 0) {
                                        i3 = i5;
                                    } else {
                                        i10 = -i5;
                                        i6 = -1;
                                    }
                                } else {
                                    i13++;
                                }
                            }
                        }
                        i2 = -2;
                    }
                    i2 = -2;
                    i3 = -2;
                }
            } else {
                i2 = -2;
                i3 = -2;
            }
            if (i3 != i2) {
                if (i3 != -1) {
                    apoyVar.A(((appn) obj).a[i3].c());
                    i4 = -1;
                    break;
                }
            } else if (appxVar2.a.b(apoyVar, 8192L) != -1) {
                i6 = -1;
            }
            i4 = -1;
            i3 = -1;
            break;
        }
        if (i3 != i4) {
            this.m = 0;
            this.d[this.b + i4] = ((java.lang.String[]) kvtVar.a)[i3];
            return i3;
        }
        java.lang.String str = this.d[this.b + i4];
        java.lang.String strE = e();
        int iB = B(strE, kvtVar);
        if (iB != i4) {
            return iB;
        }
        this.m = 15;
        this.p = strE;
        this.d[this.b + i4] = str;
        return i4;
    }

    public final java.lang.String toString() {
        return "JsonReader(" + this.k.toString() + ')';
    }
}
