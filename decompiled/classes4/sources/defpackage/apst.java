package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes4.dex */
public final class apst implements defpackage.apss {
    static int a;
    static final long[] b = {0, 0, -1, -1};
    public static final java.lang.String[] c = {"", "\r", "\n", ",", "Mon", "Tue", "Wed", "Thu", "Fri", "Sat", "Sun", "Jan", "Feb", "Mar", "Apr", "May", "Jun", "Jul", "Aug", "Sep", "Oct", "Nov", "Dec", ":", null, "UT", "GMT", "EST", "EDT", "CST", "CDT", "MST", "MDT", "PST", "PDT", null, null, null, null, null, null, null, null, null, null, null, null, null, null};
    public static final int[] d = {-1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, 1, 0, -1, 2, -1, -1, -1, -1, -1, -1, -1, -1};
    static final long[] e = {70437463654399L};
    static final long[] f = {343597383680L};
    static final long[] g = {68719476736L};
    protected final defpackage.apsv i;
    protected char j;
    int k;
    int l;
    int m;
    int n;
    int o;
    private final int[] p = new int[4];
    private final int[] q = new int[8];
    private final java.lang.StringBuilder r;
    private java.lang.StringBuilder s;
    private int t;

    public apst(defpackage.apsv apsvVar) {
        java.lang.StringBuilder sb = new java.lang.StringBuilder();
        this.r = sb;
        this.s = sb;
        this.k = 0;
        this.i = apsvVar;
    }

    private final int c(int i, int i2) {
        int i3;
        this.l = 4;
        int[] iArr = this.q;
        iArr[0] = i;
        int i4 = 1;
        int i5 = 0;
        int i6 = 1;
        int i7 = i2;
        while (true) {
            int i8 = this.m + i4;
            this.m = i8;
            if (i8 == Integer.MAX_VALUE) {
                h();
            }
            char c2 = this.j;
            if (c2 < '@') {
                long j = 1 << c2;
                i3 = Integer.MAX_VALUE;
                do {
                    i6--;
                    int i9 = iArr[i6];
                    if (i9 != 0) {
                        if (i9 != 2) {
                            if (i9 == 3 && (287948901175001088L & j) != 0) {
                                i(3);
                                i3 = 46;
                            }
                        } else if ((j & 4294967808L) != 0) {
                            i(2);
                            i3 = 36;
                        }
                    } else if ((287948901175001088L & j) != 0) {
                        if (i3 > 46) {
                            i3 = 46;
                        }
                        i(3);
                    } else if ((j & 4294967808L) != 0) {
                        if (i3 > 36) {
                            i3 = 36;
                        }
                        i(2);
                    } else if ((43980465111040L & j) != 0) {
                        i3 = 24;
                    }
                } while (i6 != i5);
            } else if (c2 < 128) {
                long j2 = 1 << (c2 & '?');
                int i10 = Integer.MAX_VALUE;
                do {
                    i6--;
                    if (iArr[i6] == 0 && (576456345801194494L & j2) != 0) {
                        i10 = 35;
                    }
                } while (i6 != i5);
                i3 = i10;
            } else {
                do {
                    i6--;
                    int i11 = iArr[i6];
                } while (i6 != i5);
                i3 = Integer.MAX_VALUE;
            }
            if (i3 != Integer.MAX_VALUE) {
                this.o = i3;
                this.n = i7;
            }
            i7++;
            i6 = this.l;
            this.l = i5;
            i5 = 4 - i5;
            if (i6 == i5) {
                break;
            }
            try {
                this.j = this.i.a();
                i4 = 1;
            } catch (java.io.IOException unused) {
            }
        }
        return i7;
    }

    private final int d(long j) {
        try {
            char cA = this.i.a();
            this.j = cA;
            if (cA == 'D') {
                return e(j, 22817013760L);
            }
            if (cA == 'M') {
                return e(j, 67108864L);
            }
            if (cA == 'a') {
                return e(j, 43520L);
            }
            if (cA == 'c') {
                return e(j, 1048576L);
            }
            if (cA == 'e') {
                return e(j, 4722752L);
            }
            if (cA == 'h') {
                return e(j, 128L);
            }
            if (cA == 'r') {
                return e(j, 256L);
            }
            if (cA == 'u') {
                return e(j, 459808L);
            }
            if (cA == 'S') {
                return e(j, 11408506880L);
            }
            if (cA != 'T') {
                if (cA == 'o') {
                    return e(j, 2097168L);
                }
                if (cA == 'p') {
                    return e(j, 16384L);
                }
            } else if ((33554432 & j) != 0) {
                return g(1, 25);
            }
            return f(0, j);
        } catch (java.io.IOException unused) {
            j(0, j);
            return 1;
        }
    }

    private final int e(long j, long j2) {
        long j3 = j2 & j;
        if (j3 == 0) {
            return f(0, j);
        }
        try {
            char cA = this.i.a();
            this.j = cA;
            if (cA != 'T') {
                if (cA != 'g') {
                    if (cA != 'i') {
                        if (cA != 'l') {
                            if (cA != 'n') {
                                if (cA != 'p') {
                                    if (cA != 'r') {
                                        if (cA != 'y') {
                                            switch (cA) {
                                                case 'b':
                                                    if ((4096 & j3) != 0) {
                                                        return g(2, 12);
                                                    }
                                                    break;
                                                case 'c':
                                                    if ((4194304 & j3) != 0) {
                                                        return g(2, 22);
                                                    }
                                                    break;
                                                case 'd':
                                                    if ((64 & j3) != 0) {
                                                        return g(2, 6);
                                                    }
                                                    break;
                                                case 'e':
                                                    if ((32 & j3) != 0) {
                                                        return g(2, 5);
                                                    }
                                                    break;
                                                default:
                                                    switch (cA) {
                                                        case 't':
                                                            if ((512 & j3) != 0) {
                                                                return g(2, 9);
                                                            }
                                                            if ((1048576 & j3) != 0) {
                                                                return g(2, 20);
                                                            }
                                                            break;
                                                        case 'u':
                                                            if ((128 & j3) != 0) {
                                                                return g(2, 7);
                                                            }
                                                            break;
                                                        case 'v':
                                                            if ((2097152 & j3) != 0) {
                                                                return g(2, 21);
                                                            }
                                                            break;
                                                    }
                                                    break;
                                            }
                                        } else if ((32768 & j3) != 0) {
                                            return g(2, 15);
                                        }
                                    } else {
                                        if ((8192 & j3) != 0) {
                                            return g(2, 13);
                                        }
                                        if ((16384 & j3) != 0) {
                                            return g(2, 14);
                                        }
                                    }
                                } else if ((524288 & j3) != 0) {
                                    return g(2, 19);
                                }
                            } else {
                                if ((16 & j3) != 0) {
                                    return g(2, 4);
                                }
                                if ((1024 & j3) != 0) {
                                    return g(2, 10);
                                }
                                if ((2048 & j3) != 0) {
                                    return g(2, 11);
                                }
                                if ((65536 & j3) != 0) {
                                    return g(2, 16);
                                }
                            }
                        } else if ((131072 & j3) != 0) {
                            return g(2, 17);
                        }
                    } else if ((256 & j3) != 0) {
                        return g(2, 8);
                    }
                } else if ((262144 & j3) != 0) {
                    return g(2, 18);
                }
            } else {
                if ((67108864 & j3) != 0) {
                    return g(2, 26);
                }
                if ((134217728 & j3) != 0) {
                    return g(2, 27);
                }
                if ((268435456 & j3) != 0) {
                    return g(2, 28);
                }
                if ((536870912 & j3) != 0) {
                    return g(2, 29);
                }
                if ((1073741824 & j3) != 0) {
                    return g(2, 30);
                }
                if ((2147483648L & j3) != 0) {
                    return g(2, 31);
                }
                if ((4294967296L & j3) != 0) {
                    return g(2, 32);
                }
                if ((8589934592L & j3) != 0) {
                    return g(2, 33);
                }
                if ((17179869184L & j3) != 0) {
                    return g(2, 34);
                }
            }
            return f(1, j3);
        } catch (java.io.IOException unused) {
            j(1, j3);
            return 2;
        }
    }

    private final int f(int i, long j) {
        j(i, j);
        return c(-1, i + 1);
    }

    private final int g(int i, int i2) {
        this.o = i2;
        this.n = i;
        return i + 1;
    }

    private final void h() {
        this.m = -2147483647;
        int i = 4;
        while (i > 0) {
            i--;
            this.p[i] = Integer.MIN_VALUE;
        }
    }

    private final void i(int i) {
        int[] iArr = this.p;
        int i2 = iArr[i];
        int i3 = this.m;
        if (i2 != i3) {
            int[] iArr2 = this.q;
            int i4 = this.l;
            this.l = i4 + 1;
            iArr2[i4] = i;
            iArr[i] = i3;
        }
    }

    private final void j(int i, long j) {
        long j2 = j & 34334373872L;
        if (i == 0) {
            if (j2 != 0) {
                this.o = 35;
            }
        } else {
            if (j2 == 0 || this.n != 0) {
                return;
            }
            this.o = 35;
            this.n = 0;
        }
    }

    /* JADX WARN: Code duplicated, block: B:162:0x0280  */
    /* JADX WARN: Code duplicated, block: B:164:0x0286  */
    /* JADX WARN: Code duplicated, block: B:169:0x02ae  */
    /* JADX WARN: Code duplicated, block: B:171:0x02b1  */
    /* JADX WARN: Code duplicated, block: B:175:0x02c3  */
    /* JADX WARN: Code duplicated, block: B:177:0x02c9  */
    /* JADX WARN: Code duplicated, block: B:182:0x02d9  */
    /* JADX WARN: Code duplicated, block: B:185:0x02e5  */
    /* JADX WARN: Code duplicated, block: B:187:0x02fc  */
    /* JADX WARN: Code duplicated, block: B:188:0x02ff  */
    /* JADX WARN: Code duplicated, block: B:189:0x0312  */
    /* JADX WARN: Code duplicated, block: B:190:0x032b  */
    /* JADX WARN: Code duplicated, block: B:191:0x033b  */
    /* JADX WARN: Code duplicated, block: B:194:0x035c  */
    /* JADX WARN: Code duplicated, block: B:234:0x036d A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:235:0x02a0 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:236:0x02d5 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:238:0x0007 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:240:0x02ba A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:280:? A[RETURN, SYNTHETIC] */
    public final defpackage.apsw a() {
        int iG;
        java.lang.String strD;
        int i;
        int i2;
        boolean z;
        java.lang.String strD2;
        int i3;
        long[] jArr;
        int i4;
        int i5;
        long j;
        defpackage.apsw apswVarB;
        int i6;
        int i7;
        defpackage.apsw apswVarB2;
        int i8;
        int i9;
        int i10;
        int i11;
        int i12;
        int i13 = 0;
        int i14 = 0;
        defpackage.apsw apswVar = null;
        while (true) {
            try {
                defpackage.apsv apsvVar = this.i;
                int i15 = -1;
                apsvVar.c = -1;
                char cA = apsvVar.a();
                apsvVar.c = apsvVar.d;
                this.j = cA;
                java.lang.StringBuilder sb = this.r;
                this.s = sb;
                sb.setLength(0);
                this.t = 0;
                while (true) {
                    int i16 = this.k;
                    int i17 = 2;
                    int i18 = i15;
                    if (i16 != 0) {
                        char c2 = 128;
                        char c3 = '@';
                        if (i16 == 1) {
                            this.o = Integer.MAX_VALUE;
                            this.n = 0;
                            char c4 = this.j;
                            if (c4 == '(') {
                                iG = g(0, 40);
                            } else if (c4 != ')') {
                                this.l = 3;
                                int[] iArr = this.q;
                                iArr[0] = 0;
                                int i19 = 0;
                                int i20 = 0;
                                int i21 = 1;
                                while (true) {
                                    int i22 = this.m + 1;
                                    this.m = i22;
                                    if (i22 == Integer.MAX_VALUE) {
                                        h();
                                    }
                                    char c5 = this.j;
                                    if (c5 < '@') {
                                        i11 = Integer.MAX_VALUE;
                                        do {
                                            i21--;
                                            int i23 = iArr[i21];
                                            if (i23 != 0) {
                                                if (i23 == 1) {
                                                    i11 = 39;
                                                }
                                            } else if (i11 > 41) {
                                                i11 = 41;
                                            }
                                        } while (i21 != i19);
                                    } else if (c5 < c2) {
                                        i11 = Integer.MAX_VALUE;
                                        do {
                                            i21--;
                                            int i24 = iArr[i21];
                                            if (i24 == 0) {
                                                if (i11 > 41) {
                                                    i11 = 41;
                                                }
                                                if (this.j == '\\') {
                                                    int i25 = this.l;
                                                    this.l = i25 + 1;
                                                    iArr[i25] = 1;
                                                }
                                            } else if (i24 == 1) {
                                                i11 = 39;
                                            } else if (i24 == 2 && i11 > 41) {
                                                i11 = 41;
                                            }
                                        } while (i21 != i19);
                                    } else {
                                        int i26 = (c5 & 255) >> 6;
                                        long j2 = 1 << (c5 & '?');
                                        i11 = Integer.MAX_VALUE;
                                        do {
                                            i21--;
                                            int i27 = iArr[i21];
                                            if (i27 != 0) {
                                                if (i27 == 1 && (b[i26] & j2) != 0) {
                                                    i11 = 39;
                                                }
                                            } else if ((b[i26] & j2) != 0 && i11 > 41) {
                                                i11 = 41;
                                            }
                                        } while (i21 != i19);
                                    }
                                    if (i11 != Integer.MAX_VALUE) {
                                        this.o = i11;
                                        this.n = i20;
                                    }
                                    i20++;
                                    i21 = this.l;
                                    this.l = i19;
                                    i19 = 3 - i19;
                                    if (i21 != i19) {
                                        try {
                                            this.j = this.i.a();
                                            c2 = 128;
                                        } catch (java.io.IOException unused) {
                                        }
                                    }
                                    i14 = i20;
                                }
                            } else {
                                iG = g(0, 38);
                            }
                        } else if (i16 == 2) {
                            this.o = Integer.MAX_VALUE;
                            this.n = 0;
                            char c6 = this.j;
                            if (c6 == '(') {
                                iG = g(0, 43);
                            } else if (c6 != ')') {
                                this.l = 3;
                                int[] iArr2 = this.q;
                                iArr2[0] = 0;
                                int i28 = 0;
                                int i29 = 0;
                                int i30 = 1;
                                while (true) {
                                    int i31 = this.m + 1;
                                    this.m = i31;
                                    if (i31 == Integer.MAX_VALUE) {
                                        h();
                                    }
                                    char c7 = this.j;
                                    if (c7 < c3) {
                                        i12 = Integer.MAX_VALUE;
                                        do {
                                            i30--;
                                            int i32 = iArr2[i30];
                                            if (i32 != 0) {
                                                if (i32 == 1) {
                                                    i12 = 42;
                                                }
                                            } else if (i12 > 45) {
                                                i12 = 45;
                                            }
                                        } while (i30 != i28);
                                    } else if (c7 < 128) {
                                        i12 = Integer.MAX_VALUE;
                                        while (true) {
                                            i30--;
                                            int i33 = iArr2[i30];
                                            if (i33 == 0) {
                                                if (i12 > 45) {
                                                    i12 = 45;
                                                }
                                                if (this.j == '\\') {
                                                    int i34 = this.l;
                                                    this.l = i34 + 1;
                                                    iArr2[i34] = 1;
                                                }
                                            } else if (i33 == 1) {
                                                i12 = 42;
                                            } else if (i33 == i17 && i12 > 45) {
                                                i12 = 45;
                                            }
                                            if (i30 != i28) {
                                                i17 = 2;
                                            }
                                        }
                                    } else {
                                        int i35 = (c7 & 255) >> 6;
                                        long j3 = 1 << (c7 & '?');
                                        i12 = Integer.MAX_VALUE;
                                        do {
                                            i30--;
                                            int i36 = iArr2[i30];
                                            if (i36 != 0) {
                                                if (i36 == 1 && (b[i35] & j3) != 0) {
                                                    i12 = 42;
                                                }
                                            } else if ((b[i35] & j3) != 0 && i12 > 45) {
                                                i12 = 45;
                                            }
                                        } while (i30 != i28);
                                    }
                                    if (i12 != Integer.MAX_VALUE) {
                                        this.o = i12;
                                        this.n = i29;
                                    }
                                    i29++;
                                    i30 = this.l;
                                    this.l = i28;
                                    i28 = 3 - i28;
                                    if (i30 != i28) {
                                        try {
                                            this.j = apsvVar.a();
                                            c3 = '@';
                                            i17 = 2;
                                        } catch (java.io.IOException unused2) {
                                        }
                                    }
                                    i14 = i29;
                                }
                            } else {
                                iG = g(0, 44);
                            }
                        }
                        if (this.o != Integer.MAX_VALUE) {
                            i3 = this.n;
                            if (i3 + 1 < i14) {
                                this.i.f((i14 - i3) - 1);
                            }
                            jArr = e;
                            i4 = this.o;
                            i5 = i4 >> 6;
                            j = 1 << (i4 & 63);
                            if ((jArr[i5] & j) != 0) {
                                apswVarB = b();
                                i6 = d[this.o];
                                if (i6 != i18) {
                                    return apswVarB;
                                }
                                this.k = i6;
                                return apswVarB;
                            }
                            if ((f[i5] & j) != 0) {
                                if ((g[i5] & j) != 0) {
                                    apswVarB2 = b();
                                    if (apswVar != null) {
                                        apswVar.e = apswVarB2;
                                    }
                                    apswVar = apswVarB2;
                                }
                                i7 = d[this.o];
                                if (i7 != -1) {
                                    this.k = i7;
                                }
                            } else {
                                i8 = this.t + this.n + 1;
                                this.t = i8;
                                switch (i4) {
                                    case 39:
                                        this.s.append(this.i.g(i8));
                                        this.t = 0;
                                        java.lang.StringBuilder sb2 = this.s;
                                        sb2.deleteCharAt(sb2.length() - 2);
                                        break;
                                    case 40:
                                        this.s.append(this.i.g(i8));
                                        this.t = 0;
                                        a = 1;
                                        break;
                                    case 42:
                                        this.s.append(this.i.g(i8));
                                        this.t = 0;
                                        java.lang.StringBuilder sb3 = this.s;
                                        sb3.deleteCharAt(sb3.length() - 2);
                                        break;
                                    case 43:
                                        this.s.append(this.i.g(i8));
                                        this.t = 0;
                                        a++;
                                        break;
                                    case 44:
                                        this.s.append(this.i.g(i8));
                                        this.t = 0;
                                        i10 = a - 1;
                                        a = i10;
                                        if (i10 == 0) {
                                            this.k = 1;
                                        }
                                        break;
                                }
                                i9 = d[this.o];
                                if (i9 != -1) {
                                    this.k = i9;
                                }
                                this.o = Integer.MAX_VALUE;
                                try {
                                    this.j = this.i.a();
                                    i15 = -1;
                                    i14 = 0;
                                } catch (java.io.IOException unused3) {
                                    i14 = 0;
                                }
                            }
                        }
                    } else {
                        this.o = Integer.MAX_VALUE;
                        this.n = 0;
                        char c8 = this.j;
                        if (c8 == '\n') {
                            iG = g(0, 2);
                        } else if (c8 == '\r') {
                            iG = g(0, 1);
                        } else if (c8 == '(') {
                            iG = g(0, 37);
                        } else if (c8 == ',') {
                            iG = g(0, 3);
                        } else if (c8 == ':') {
                            iG = g(0, 23);
                        } else if (c8 == 'A') {
                            iG = d(278528L);
                        } else if (c8 == 'J') {
                            iG = d(198656L);
                        } else if (c8 != 'W') {
                            switch (c8) {
                                case 'C':
                                    iG = d(1610612736L);
                                    break;
                                case 'D':
                                    iG = d(4194304L);
                                    break;
                                case 'E':
                                    iG = d(402653184L);
                                    break;
                                case 'F':
                                    iG = d(4352L);
                                    break;
                                case 'G':
                                    iG = d(67108864L);
                                    break;
                                default:
                                    switch (c8) {
                                        case 'M':
                                            iG = d(6442491920L);
                                            break;
                                        case 'N':
                                            iG = d(2097152L);
                                            break;
                                        case 'O':
                                            iG = d(1048576L);
                                            break;
                                        case 'P':
                                            iG = d(25769803776L);
                                            break;
                                        default:
                                            switch (c8) {
                                                case 'S':
                                                    iG = d(525824L);
                                                    break;
                                                case 'T':
                                                    iG = d(160L);
                                                    break;
                                                case 'U':
                                                    iG = d(33554432L);
                                                    break;
                                                default:
                                                    iG = c(0, 0);
                                                    break;
                                            }
                                            break;
                                    }
                                    break;
                            }
                        } else {
                            iG = d(64L);
                        }
                    }
                    i14 = iG;
                    if (this.o != Integer.MAX_VALUE) {
                        i3 = this.n;
                        if (i3 + 1 < i14) {
                            this.i.f((i14 - i3) - 1);
                        }
                        jArr = e;
                        i4 = this.o;
                        i5 = i4 >> 6;
                        j = 1 << (i4 & 63);
                        if ((jArr[i5] & j) != 0) {
                            apswVarB = b();
                            i6 = d[this.o];
                            if (i6 != i18) {
                                return apswVarB;
                            }
                            this.k = i6;
                            return apswVarB;
                        }
                        if ((f[i5] & j) != 0) {
                            if ((g[i5] & j) != 0) {
                                apswVarB2 = b();
                                if (apswVar != null) {
                                    apswVar.e = apswVarB2;
                                }
                                apswVar = apswVarB2;
                            }
                            i7 = d[this.o];
                            if (i7 != -1) {
                                this.k = i7;
                            }
                        } else {
                            i8 = this.t + this.n + 1;
                            this.t = i8;
                            switch (i4) {
                                case 39:
                                    this.s.append(this.i.g(i8));
                                    this.t = 0;
                                    java.lang.StringBuilder sb4 = this.s;
                                    sb4.deleteCharAt(sb4.length() - 2);
                                    break;
                                case 40:
                                    this.s.append(this.i.g(i8));
                                    this.t = 0;
                                    a = 1;
                                    break;
                                case 42:
                                    this.s.append(this.i.g(i8));
                                    this.t = 0;
                                    java.lang.StringBuilder sb5 = this.s;
                                    sb5.deleteCharAt(sb5.length() - 2);
                                    break;
                                case 43:
                                    this.s.append(this.i.g(i8));
                                    this.t = 0;
                                    a++;
                                    break;
                                case 44:
                                    this.s.append(this.i.g(i8));
                                    this.t = 0;
                                    i10 = a - 1;
                                    a = i10;
                                    if (i10 == 0) {
                                        this.k = 1;
                                    }
                                    break;
                            }
                            i9 = d[this.o];
                            if (i9 != -1) {
                                this.k = i9;
                            }
                            this.o = Integer.MAX_VALUE;
                            this.j = this.i.a();
                            i15 = -1;
                            i14 = 0;
                        }
                    }
                }
            } catch (java.io.IOException unused4) {
                this.o = 0;
                return b();
            }
        }
        defpackage.apsv apsvVar2 = this.i;
        int iC = apsvVar2.c();
        int iB = apsvVar2.b();
        try {
            apsvVar2.a();
            apsvVar2.f(1);
            z = false;
            i2 = iC;
            i = iB;
            strD = null;
        } catch (java.io.IOException unused5) {
            strD = i14 <= 1 ? "" : this.i.d();
            char c9 = this.j;
            if (c9 == '\n' || c9 == '\r') {
                iC++;
            } else {
                i13 = iB + 1;
            }
            i = i13;
            i2 = iC;
            z = true;
        }
        if (z) {
            strD2 = strD;
        } else {
            defpackage.apsv apsvVar3 = this.i;
            apsvVar3.f(1);
            strD2 = i14 > 1 ? apsvVar3.d() : "";
        }
        throw new defpackage.apsx(z, i2, i, strD2, this.j);
    }

    protected final defpackage.apsw b() {
        java.lang.String strD = c[this.o];
        if (strD == null) {
            strD = this.i.d();
        }
        defpackage.apsv apsvVar = this.i;
        int[] iArr = apsvVar.e;
        int i = apsvVar.c;
        int i2 = iArr[i];
        int i3 = apsvVar.f[i];
        apsvVar.c();
        apsvVar.b();
        defpackage.apsw apswVar = new defpackage.apsw(this.o, strD);
        apswVar.b = i2;
        apswVar.c = i3;
        return apswVar;
    }
}
