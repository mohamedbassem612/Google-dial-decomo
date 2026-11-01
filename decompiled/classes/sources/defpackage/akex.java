package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes.dex */
public class akex implements java.io.Closeable {
    private final java.io.Reader a;
    public long f;
    public int g;
    public java.lang.String h;
    public int[] j;
    private int[] o;
    private java.lang.String[] p;
    public defpackage.akej b = defpackage.akej.b;
    public final char[] c = new char[1024];
    public int d = 0;
    private int k = 0;
    private long l = 0;
    private int m = 0;
    private int n = 0;
    public int e = 0;
    public int i = 1;

    static {
        defpackage.ajsz.i = new defpackage.ajsz((float[]) null);
    }

    public akex(java.io.Reader reader) {
        int[] iArr = new int[32];
        this.o = iArr;
        iArr[0] = 6;
        this.p = new java.lang.String[32];
        this.j = new int[32];
        this.a = (java.io.Reader) j$.util.Objects.requireNonNull(reader, "in == null");
    }

    private final boolean A(int i) throws java.io.IOException {
        int i2;
        int i3 = this.n;
        int i4 = this.d;
        this.n = i3 - i4;
        this.l += (long) i4;
        char[] cArr = this.c;
        int i5 = this.k;
        if (i5 != i4) {
            int i6 = i5 - i4;
            this.k = i6;
            java.lang.System.arraycopy(cArr, i4, cArr, 0, i6);
        } else {
            this.k = 0;
        }
        this.d = 0;
        do {
            java.io.Reader reader = this.a;
            int i7 = this.k;
            int i8 = reader.read(cArr, i7, 1024 - i7);
            if (i8 == -1) {
                return false;
            }
            i2 = this.k + i8;
            this.k = i2;
            if (this.l == 0 && this.d == 0 && i2 > 0 && cArr[0] == 65279) {
                this.d = 1;
                this.n++;
                i++;
            }
        } while (i2 < i);
        return true;
    }

    /* JADX WARN: Code duplicated, block: B:30:0x0039  */
    private final boolean B(char c) throws defpackage.akez {
        if (c != '\t' && c != '\n' && c != '\f' && c != '\r' && c != ' ') {
            if (c == '#') {
                w();
            } else if (c != ',') {
                if (c == '/' || c == '=') {
                    w();
                } else if (c != '{' && c != '}' && c != ':') {
                    if (c != ';') {
                        switch (c) {
                            case '\\':
                                w();
                            case '[':
                            case ']':
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

    private final void C(java.lang.String str) throws defpackage.akez {
        if (this.b == defpackage.akej.c) {
            int i = 0;
            while (i < str.length()) {
                char cCharAt = str.charAt(i);
                if (java.lang.Character.isSurrogate(cCharAt) && (!java.lang.Character.isHighSurrogate(cCharAt) || (i = i + 1) >= str.length() || !java.lang.Character.isLowSurrogate(str.charAt(i)))) {
                    throw f("Unpaired surrogate characters are not allowed in strict mode");
                }
                i++;
            }
        }
    }

    private final int v(boolean z) throws java.io.IOException {
        int i = this.d;
        int i2 = this.k;
        while (true) {
            if (i == i2) {
                this.d = i;
                if (!A(1)) {
                    if (z) {
                        throw new java.io.EOFException("End of input".concat(h()));
                    }
                    return -1;
                }
                i = this.d;
                i2 = this.k;
            }
            char[] cArr = this.c;
            int i3 = i + 1;
            char c = cArr[i];
            if (c == '\n') {
                this.m++;
                this.n = i3;
            } else if (c != ' ' && c != '\r' && c != '\t') {
                if (c == '/') {
                    this.d = i3;
                    if (i3 == i2) {
                        this.d = i;
                        boolean zA = A(2);
                        this.d++;
                        if (zA) {
                        }
                        return 47;
                    }
                    w();
                    int i4 = this.d;
                    char c2 = cArr[i4];
                    if (c2 == '*') {
                        this.d = i4 + 1;
                        while (true) {
                            if (this.d + 2 > this.k && !A(2)) {
                                throw f("Unterminated comment");
                            }
                            int i5 = this.d;
                            if (cArr[i5] != '\n') {
                                int i6 = 0;
                                while (true) {
                                    int i7 = this.d;
                                    if (i6 >= 2) {
                                        i = i7 + 2;
                                        i2 = this.k;
                                        break;
                                    }
                                    if (cArr[i7 + i6] != "*/".charAt(i6)) {
                                        break;
                                    }
                                    i6++;
                                }
                            } else {
                                this.m++;
                                this.n = i5 + 1;
                            }
                            this.d++;
                        }
                    } else {
                        if (c2 != '/') {
                            return 47;
                        }
                        this.d = i4 + 1;
                        y();
                        i = this.d;
                        i2 = this.k;
                    }
                } else {
                    if (c != '#') {
                        this.d = i3;
                        return c;
                    }
                    this.d = i3;
                    w();
                    y();
                    i = this.d;
                    i2 = this.k;
                }
            }
            i = i3;
        }
    }

    private final void w() throws defpackage.akez {
        if (this.b != defpackage.akej.a) {
            throw f("Use JsonReader.setStrictness(Strictness.LENIENT) to accept malformed JSON");
        }
    }

    private final void x(int i) throws defpackage.akez {
        int i2 = this.i;
        if (i2 - 1 >= 1280) {
            throw new defpackage.akez("Nesting limit 1280 reached" + h());
        }
        int[] iArr = this.o;
        if (i2 == iArr.length) {
            int i3 = i2 << 1;
            this.o = java.util.Arrays.copyOf(iArr, i3);
            this.j = java.util.Arrays.copyOf(this.j, i3);
            this.p = (java.lang.String[]) java.util.Arrays.copyOf(this.p, i3);
        }
        int[] iArr2 = this.o;
        int i4 = this.i;
        this.i = i4 + 1;
        iArr2[i4] = i;
    }

    private final void y() {
        char c;
        do {
            if (this.d >= this.k && !A(1)) {
                return;
            }
            char[] cArr = this.c;
            int i = this.d;
            int i2 = i + 1;
            this.d = i2;
            c = cArr[i];
            if (c == '\n') {
                this.m++;
                this.n = i2;
                return;
            }
        } while (c != '\r');
    }

    private final void z(java.lang.String str) throws defpackage.akez {
        int i = akew.a;
        for (int i2 = 0; i2 < str.length(); i2++) {
            if (str.charAt(i2) > 127) {
                throw f("String contains non-ASCII characters: ".concat(java.lang.String.valueOf(str)));
            }
        }
    }

    public java.lang.String a() {
        return u();
    }

    public int b() {
        int iC = this.e;
        if (iC == 0) {
            iC = c();
        }
        switch (iC) {
            case 1:
                return 3;
            case 2:
                return 4;
            case 3:
                return 1;
            case 4:
                return 2;
            case 5:
            case defpackage.eft.STRING_SET_FIELD_NUMBER /* 6 */:
                return 8;
            case defpackage.eft.DOUBLE_FIELD_NUMBER /* 7 */:
                return 9;
            case defpackage.eft.BYTES_FIELD_NUMBER /* 8 */:
            case 9:
            case 10:
            case 11:
                return 6;
            case 12:
            case 13:
            case 14:
                return 5;
            case 15:
            case 16:
                return 7;
            default:
                return 10;
        }
    }

    /* JADX WARN: Code duplicated, block: B:104:0x0181  */
    /* JADX WARN: Code duplicated, block: B:105:0x0188  */
    /* JADX WARN: Code duplicated, block: B:109:0x019a  */
    /* JADX WARN: Code duplicated, block: B:111:0x019f  */
    /* JADX WARN: Code duplicated, block: B:113:0x01a7  */
    /* JADX WARN: Code duplicated, block: B:121:0x01c2  */
    /* JADX WARN: Code duplicated, block: B:123:0x01ca  */
    /* JADX WARN: Code duplicated, block: B:128:0x01e0  */
    /* JADX WARN: Code duplicated, block: B:131:0x01f2  */
    /* JADX WARN: Code duplicated, block: B:133:0x01f6  */
    /* JADX WARN: Code duplicated, block: B:135:0x01fe  */
    /* JADX WARN: Code duplicated, block: B:136:0x0202 A[PHI: r1 r4
      0x0202: PHI (r1v46 int) = (r1v45 int), (r1v63 int) binds: [B:130:0x01f0, B:135:0x01fe] A[DONT_GENERATE, DONT_INLINE]
      0x0202: PHI (r4v8 int) = (r4v7 int), (r4v9 int) binds: [B:130:0x01f0, B:135:0x01fe] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Code duplicated, block: B:138:0x020a  */
    /* JADX WARN: Code duplicated, block: B:140:0x020e  */
    /* JADX WARN: Code duplicated, block: B:176:0x0274  */
    /* JADX WARN: Code duplicated, block: B:177:0x0276  */
    /* JADX WARN: Code duplicated, block: B:179:0x027c A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:181:0x027f  */
    /* JADX WARN: Code duplicated, block: B:184:0x0285 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:186:0x0288 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:190:0x029a A[DONT_INVERT, PHI: r12
      0x029a: PHI (r12v22 char) = (r12v8 char), (r12v24 char) binds: [B:175:0x0272, B:189:0x0299] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Code duplicated, block: B:191:0x029c  */
    /* JADX WARN: Code duplicated, block: B:203:0x02ba  */
    /* JADX WARN: Code duplicated, block: B:205:0x02bd A[ADDED_TO_REGION] */
    /* JADX WARN: Code duplicated, block: B:207:0x02c1  */
    /* JADX WARN: Code duplicated, block: B:209:0x02c5  */
    /* JADX WARN: Code duplicated, block: B:213:0x02d1  */
    /* JADX WARN: Code duplicated, block: B:214:0x02d3  */
    /* JADX WARN: Code duplicated, block: B:216:0x02dd  */
    /* JADX WARN: Code duplicated, block: B:217:0x02e5  */
    /* JADX WARN: Code duplicated, block: B:219:0x02ec  */
    /* JADX WARN: Code duplicated, block: B:225:0x02f7 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:226:0x02f9 A[ADDED_TO_REGION] */
    /* JADX WARN: Code duplicated, block: B:231:0x0310  */
    /* JADX WARN: Code duplicated, block: B:232:0x0318  */
    /* JADX WARN: Code duplicated, block: B:235:0x02ce A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:236:0x0272 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:243:0x02ce A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:252:0x01bd A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:30:0x008b  */
    /* JADX WARN: Code duplicated, block: B:57:0x00ed A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:58:0x00ef  */
    /* JADX WARN: Code duplicated, block: B:60:0x00f3  */
    /* JADX WARN: Code duplicated, block: B:62:0x0103  */
    /* JADX WARN: Code duplicated, block: B:63:0x0107  */
    /* JADX WARN: Code duplicated, block: B:65:0x010c A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:67:0x0111  */
    /* JADX WARN: Code duplicated, block: B:69:0x0116  */
    /* JADX WARN: Code duplicated, block: B:71:0x011e  */
    /* JADX WARN: Code duplicated, block: B:83:0x0147 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:84:0x0149  */
    /* JADX WARN: Code duplicated, block: B:85:0x014b A[ADDED_TO_REGION] */
    /* JADX WARN: Code restructure failed: missing block: B:184:0x0285, code lost:
    
        if (r13 == false) goto L187;
     */
    /* JADX WARN: Code restructure failed: missing block: B:222:0x02f2, code lost:
    
        if (r4 == 1) goto L233;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final int c() throws java.io.IOException {
        /*
            Method dump skipped, instruction units count: 820
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.akex.c():int");
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public void close() throws java.io.IOException {
        this.e = 0;
        this.o[0] = 8;
        this.i = 1;
        this.a.close();
    }

    public final int d() throws java.io.IOException {
        java.lang.String strJ;
        int iC = this.e;
        if (iC == 0) {
            iC = c();
        }
        if (iC == 15) {
            long j = this.f;
            int i = (int) j;
            if (j == i) {
                this.e = 0;
                int[] iArr = this.j;
                int i2 = this.i - 1;
                iArr[i2] = iArr[i2] + 1;
                return i;
            }
            throw new java.lang.NumberFormatException("Expected an int but was " + j + h());
        }
        if (iC == 16) {
            char[] cArr = this.c;
            int i3 = this.d;
            int i4 = this.g;
            this.h = new java.lang.String(cArr, i3, i4);
            this.d = i3 + i4;
        } else {
            if (iC != 8 && iC != 9 && iC != 10) {
                throw g("an int");
            }
            if (iC == 10) {
                strJ = l();
                this.h = strJ;
            } else {
                strJ = j(iC == 8 ? '\'' : '\"');
                this.h = strJ;
            }
            z(strJ);
            try {
                int i5 = java.lang.Integer.parseInt(this.h);
                this.e = 0;
                int[] iArr2 = this.j;
                int i6 = this.i - 1;
                iArr2[i6] = iArr2[i6] + 1;
                return i5;
            } catch (java.lang.NumberFormatException unused) {
            }
        }
        this.e = 11;
        try {
            double d = java.lang.Double.parseDouble(this.h);
            int i7 = (int) d;
            if (i7 == d) {
                this.h = null;
                this.e = 0;
                int[] iArr3 = this.j;
                int i8 = this.i - 1;
                iArr3[i8] = iArr3[i8] + 1;
                return i7;
            }
            throw new java.lang.NumberFormatException("Expected an int but was " + this.h + h());
        } catch (java.lang.NumberFormatException e) {
            java.lang.NumberFormatException numberFormatException = new java.lang.NumberFormatException("Expected an int but was " + this.h + h());
            numberFormatException.initCause(e);
            throw numberFormatException;
        }
    }

    public final long e() throws java.io.IOException {
        java.lang.String strJ;
        int iC = this.e;
        if (iC == 0) {
            iC = c();
        }
        if (iC == 15) {
            this.e = 0;
            int[] iArr = this.j;
            int i = this.i - 1;
            iArr[i] = iArr[i] + 1;
            return this.f;
        }
        if (iC != 16) {
            switch (iC) {
                case defpackage.eft.BYTES_FIELD_NUMBER /* 8 */:
                case 9:
                case 10:
                    if (iC == 10) {
                        strJ = l();
                        this.h = strJ;
                    } else {
                        strJ = j(iC == 8 ? '\'' : '\"');
                        this.h = strJ;
                    }
                    z(strJ);
                    try {
                        long j = java.lang.Long.parseLong(this.h);
                        this.e = 0;
                        int[] iArr2 = this.j;
                        int i2 = this.i - 1;
                        iArr2[i2] = iArr2[i2] + 1;
                        return j;
                    } catch (java.lang.NumberFormatException unused) {
                    }
                    break;
                default:
                    throw g("a long");
            }
        } else {
            char[] cArr = this.c;
            int i3 = this.d;
            int i4 = this.g;
            this.h = new java.lang.String(cArr, i3, i4);
            this.d = i3 + i4;
        }
        this.e = 11;
        try {
            double d = java.lang.Double.parseDouble(this.h);
            long j2 = (long) d;
            if (j2 == d) {
                this.h = null;
                this.e = 0;
                int[] iArr3 = this.j;
                int i5 = this.i - 1;
                iArr3[i5] = iArr3[i5] + 1;
                return j2;
            }
            throw new java.lang.NumberFormatException("Expected a long but was " + this.h + h());
        } catch (java.lang.NumberFormatException e) {
            java.lang.NumberFormatException numberFormatException = new java.lang.NumberFormatException("Expected a long but was " + this.h + h());
            numberFormatException.initCause(e);
            throw numberFormatException;
        }
    }

    public final defpackage.akez f(java.lang.String str) throws defpackage.akez {
        throw new defpackage.akez(str + h() + "\nSee https://github.com/google/gson/blob/main/Troubleshooting.md#malformed-json");
    }

    public final java.lang.IllegalStateException g(java.lang.String str) {
        int iB = b();
        java.lang.String strAp = defpackage.anty.ap(b());
        java.lang.String strH = h();
        java.lang.StringBuilder sb = new java.lang.StringBuilder("Expected ");
        sb.append(str);
        sb.append(" but was ");
        sb.append(strAp);
        sb.append(strH);
        sb.append("\nSee ");
        sb.append("https://github.com/google/gson/blob/main/Troubleshooting.md#".concat(iB == 9 ? "adapter-not-null-safe" : "unexpected-json-structure"));
        return new java.lang.IllegalStateException(sb.toString());
    }

    public final java.lang.String h() {
        int i = this.m + 1;
        int i2 = this.d - this.n;
        return " at line " + i + " column " + (i2 + 1) + " path " + a();
    }

    public final java.lang.String i() throws java.io.IOException {
        java.lang.String strJ;
        int iC = this.e;
        if (iC == 0) {
            iC = c();
        }
        switch (iC) {
            case 12:
                strJ = j('\'');
                break;
            case 13:
                strJ = j('\"');
                break;
            case 14:
                strJ = l();
                break;
            default:
                throw g("a name");
        }
        this.e = 0;
        this.p[this.i - 1] = strJ;
        return strJ;
    }

    public final java.lang.String j(char c) throws defpackage.akez {
        char[] cArr;
        int i;
        java.lang.StringBuilder sb = null;
        do {
            int i2 = this.d;
            int i3 = this.k;
            int i4 = i2;
            while (true) {
                cArr = this.c;
                if (i2 < i3) {
                    int i5 = i2 + 1;
                    char c2 = cArr[i2];
                    defpackage.akej akejVar = this.b;
                    defpackage.akej akejVar2 = defpackage.akej.c;
                    if (akejVar == akejVar2 && c2 < ' ') {
                        throw f("Unescaped control characters (\\u0000-\\u001F) are not allowed in strict mode");
                    }
                    if (c2 == c) {
                        int i6 = (i5 - i4) - 1;
                        this.d = i5;
                        if (sb == null) {
                            java.lang.String str = new java.lang.String(cArr, i4, i6);
                            C(str);
                            return str;
                        }
                        sb.append(cArr, i4, i6);
                        java.lang.String string = sb.toString();
                        C(string);
                        return string;
                    }
                    char c3 = '\n';
                    if (c2 == '\\') {
                        int i7 = i5 - i4;
                        int i8 = i7 - 1;
                        this.d = i5;
                        if (sb == null) {
                            sb = new java.lang.StringBuilder(java.lang.Math.max(i7 << 1, 16));
                        }
                        sb.append(cArr, i4, i8);
                        if (this.d == this.k && !A(1)) {
                            throw f("Unterminated escape sequence");
                        }
                        int i9 = this.d;
                        int i10 = i9 + 1;
                        this.d = i10;
                        char c4 = cArr[i9];
                        if (c4 != '\n') {
                            if (c4 == '\"') {
                                c3 = c4;
                            } else {
                                if (c4 != '\'') {
                                    if (c4 != '/' && c4 != '\\') {
                                        if (c4 == 'b') {
                                            c3 = '\b';
                                        } else if (c4 == 'f') {
                                            c3 = '\f';
                                        } else if (c4 != 'n') {
                                            if (c4 == 'r') {
                                                c3 = '\r';
                                            } else if (c4 == 't') {
                                                c3 = '\t';
                                            } else {
                                                if (c4 != 'u') {
                                                    throw f("Invalid escape sequence");
                                                }
                                                if (i9 + 5 > this.k && !A(4)) {
                                                    throw f("Unterminated escape sequence");
                                                }
                                                int i11 = this.d;
                                                int i12 = i11 + 4;
                                                int i13 = 0;
                                                while (i11 < i12) {
                                                    int i14 = i13 << 4;
                                                    char c5 = cArr[i11];
                                                    if (c5 >= '0' && c5 <= '9') {
                                                        i = c5 - '0';
                                                    } else if (c5 >= 'a' && c5 <= 'f') {
                                                        i = c5 - 'W';
                                                    } else {
                                                        if (c5 < 'A' || c5 > 'F') {
                                                            throw f("Malformed Unicode escape \\u".concat(new java.lang.String(cArr, this.d, 4)));
                                                        }
                                                        i = c5 - '7';
                                                    }
                                                    i13 = i14 + i;
                                                    i11++;
                                                }
                                                this.d += 4;
                                                c3 = (char) i13;
                                            }
                                        }
                                    }
                                }
                                c3 = c4;
                            }
                            sb.append(c3);
                            i4 = this.d;
                            i3 = this.k;
                            i2 = i4;
                        } else {
                            if (this.b == akejVar2) {
                                throw f("Cannot escape a newline character in strict mode");
                            }
                            this.m++;
                            this.n = i10;
                        }
                        if (this.b == akejVar2) {
                            throw f("Invalid escaped character \"'\" in strict mode");
                        }
                        c3 = c4;
                        sb.append(c3);
                        i4 = this.d;
                        i3 = this.k;
                        i2 = i4;
                    } else {
                        if (c2 == '\n') {
                            this.m++;
                            this.n = i5;
                        }
                        i2 = i5;
                    }
                }
            }
            int i15 = i2 - i4;
            if (sb == null) {
                sb = new java.lang.StringBuilder(java.lang.Math.max(i15 << 1, 16));
            }
            sb.append(cArr, i4, i15);
            this.d = i2;
        } while (A(1));
        throw f("Unterminated string");
    }

    public final java.lang.String k() {
        java.lang.String string;
        int iC = this.e;
        if (iC == 0) {
            iC = c();
        }
        if (iC == 15) {
            string = java.lang.Long.toString(this.f);
        } else if (iC != 16) {
            switch (iC) {
                case defpackage.eft.BYTES_FIELD_NUMBER /* 8 */:
                    string = j('\'');
                    break;
                case 9:
                    string = j('\"');
                    break;
                case 10:
                    string = l();
                    break;
                case 11:
                    string = this.h;
                    this.h = null;
                    break;
                default:
                    throw g("a string");
            }
        } else {
            java.lang.String str = new java.lang.String(this.c, this.d, this.g);
            this.d += this.g;
            string = str;
        }
        this.e = 0;
        int[] iArr = this.j;
        int i = this.i - 1;
        iArr[i] = iArr[i] + 1;
        return string;
    }

    /* JADX WARN: Failed to find 'out' block for switch in B:32:0x0042. Please report as an issue. */
    public final java.lang.String l() throws defpackage.akez {
        java.lang.String string;
        int i = 0;
        java.lang.StringBuilder sb = null;
        while (true) {
            int i2 = 0;
            while (true) {
                int i3 = this.d + i2;
                if (i3 < this.k) {
                    char c = this.c[i3];
                    if (c != '\t' && c != '\n' && c != '\f' && c != '\r' && c != ' ') {
                        if (c != '#') {
                            if (c != ',') {
                                if (c != '/' && c != '=') {
                                    if (c != '{' && c != '}' && c != ':') {
                                        if (c != ';') {
                                            switch (c) {
                                                case '[':
                                                case ']':
                                                    break;
                                                case '\\':
                                                    break;
                                                default:
                                                    i2++;
                                                    break;
                                            }
                                        }
                                    }
                                }
                            }
                        }
                        w();
                    }
                    i = i2;
                } else if (i2 >= 1024) {
                    if (sb == null) {
                        sb = new java.lang.StringBuilder(java.lang.Math.max(i2, 16));
                    }
                    sb.append(this.c, this.d, i2);
                    this.d += i2;
                    if (!A(1)) {
                    }
                } else if (!A(i2 + 1)) {
                    i = i2;
                }
                char[] cArr = this.c;
                if (sb == null) {
                    string = new java.lang.String(cArr, this.d, i);
                } else {
                    sb.append(cArr, this.d, i);
                    string = sb.toString();
                }
                this.d += i;
                return string;
            }
        }
    }

    public final void m() {
        int iC = this.e;
        if (iC == 0) {
            iC = c();
        }
        if (iC != 3) {
            throw g("BEGIN_ARRAY");
        }
        x(1);
        this.j[this.i - 1] = 0;
        this.e = 0;
    }

    public final void n() throws java.io.IOException {
        int iC = this.e;
        if (iC == 0) {
            iC = c();
        }
        if (iC != 1) {
            throw g("BEGIN_OBJECT");
        }
        x(3);
        this.e = 0;
    }

    public final void o() {
        int iC = this.e;
        if (iC == 0) {
            iC = c();
        }
        if (iC != 4) {
            throw g("END_ARRAY");
        }
        int i = this.i;
        this.i = i - 1;
        int[] iArr = this.j;
        int i2 = i - 2;
        iArr[i2] = iArr[i2] + 1;
        this.e = 0;
    }

    public final void p() throws java.io.IOException {
        int iC = this.e;
        if (iC == 0) {
            iC = c();
        }
        if (iC != 2) {
            throw g("END_OBJECT");
        }
        int i = this.i;
        int i2 = i - 1;
        this.i = i2;
        this.p[i2] = null;
        int[] iArr = this.j;
        int i3 = i - 2;
        iArr[i3] = iArr[i3] + 1;
        this.e = 0;
    }

    public final void q() throws java.io.IOException {
        int iC = this.e;
        if (iC == 0) {
            iC = c();
        }
        if (iC != 7) {
            throw g("null");
        }
        this.e = 0;
        int[] iArr = this.j;
        int i = this.i - 1;
        iArr[i] = iArr[i] + 1;
    }

    public final void r(defpackage.akej akejVar) {
        j$.util.Objects.requireNonNull(akejVar);
        this.b = akejVar;
    }

    public final boolean s() throws java.io.IOException {
        int iC = this.e;
        if (iC == 0) {
            iC = c();
        }
        return (iC == 2 || iC == 4 || iC == 17) ? false : true;
    }

    public final boolean t() throws java.io.IOException {
        int iC = this.e;
        if (iC == 0) {
            iC = c();
        }
        if (iC == 5) {
            this.e = 0;
            int[] iArr = this.j;
            int i = this.i - 1;
            iArr[i] = iArr[i] + 1;
            return true;
        }
        if (iC != 6) {
            throw g("a boolean");
        }
        this.e = 0;
        int[] iArr2 = this.j;
        int i2 = this.i - 1;
        iArr2[i2] = iArr2[i2] + 1;
        return false;
    }

    public java.lang.String toString() {
        return java.lang.String.valueOf(getClass().getSimpleName()).concat(h());
    }

    public final java.lang.String u() {
        java.lang.StringBuilder sb = new java.lang.StringBuilder("$");
        for (int i = 0; i < this.i; i++) {
            int i2 = this.o[i];
            switch (i2) {
                case 1:
                case 2:
                    int i3 = this.j[i];
                    sb.append('[');
                    sb.append(i3);
                    sb.append(']');
                    break;
                case 3:
                case 4:
                case 5:
                    sb.append('.');
                    java.lang.String str = this.p[i];
                    if (str != null) {
                        sb.append(str);
                    }
                    break;
                case defpackage.eft.STRING_SET_FIELD_NUMBER /* 6 */:
                case defpackage.eft.DOUBLE_FIELD_NUMBER /* 7 */:
                case defpackage.eft.BYTES_FIELD_NUMBER /* 8 */:
                    break;
                default:
                    throw new java.lang.AssertionError(defpackage.a.bj(i2, "Unknown scope value: "));
            }
        }
        return sb.toString();
    }
}
