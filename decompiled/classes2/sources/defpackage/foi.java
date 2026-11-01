package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes2.dex */
public final class foi extends defpackage.fnr {
    public static final defpackage.hgu a = new defpackage.hgu();
    private final defpackage.hgu b;

    public foi(defpackage.hgu hguVar) {
        this.b = hguVar;
    }

    public static boolean d(int i) {
        return i >= 2 && i <= 4;
    }

    private static int e(int i) {
        return (i == 0 || i == 3) ? 1 : 2;
    }

    private static int f(byte[] bArr, int i, int i2) {
        int iG = g(bArr, i);
        if (i2 == 0 || i2 == 3) {
            return iG;
        }
        while (true) {
            int length = bArr.length;
            if (iG >= length - 1) {
                return length;
            }
            int i3 = iG + 1;
            if ((iG - i) % 2 == 0 && bArr[i3] == 0) {
                return iG;
            }
            iG = g(bArr, i3);
        }
    }

    private static int g(byte[] bArr, int i) {
        while (true) {
            int length = bArr.length;
            if (i >= length) {
                return length;
            }
            if (bArr[i] == 0) {
                return i;
            }
            i++;
        }
    }

    private static int h(defpackage.etx etxVar, int i) {
        byte[] bArr = etxVar.b;
        int i2 = etxVar.c;
        int i3 = i2;
        while (true) {
            int i4 = i3 + 1;
            if (i4 >= i2 + i) {
                return i;
            }
            if ((bArr[i3] & 255) == 255 && bArr[i4] == 0) {
                java.lang.System.arraycopy(bArr, i3 + 2, bArr, i4, (i - (i3 - i2)) - 2);
                i--;
            }
            i3 = i4;
        }
    }

    private static aify i(byte[] bArr, int i, int i2) {
        if (i2 >= bArr.length) {
            return aify.p("");
        }
        aift aiftVar = new aift(4);
        int iF = f(bArr, i2, i);
        while (i2 < iF) {
            aiftVar.i(new java.lang.String(bArr, i2, iF - i2, l(i)));
            i2 = e(i) + iF;
            iF = f(bArr, i2, i);
        }
        aify aifyVarH = aiftVar.h();
        return aifyVarH.isEmpty() ? aify.p("") : aifyVarH;
    }

    private static java.lang.String j(byte[] bArr, int i, int i2, java.nio.charset.Charset charset) {
        return (i2 <= i || i2 > bArr.length) ? "" : new java.lang.String(bArr, i, i2 - i, charset);
    }

    private static java.lang.String k(int i, int i2, int i3, int i4, int i5) {
        return i == 2 ? java.lang.String.format(java.util.Locale.US, "%c%c%c", java.lang.Integer.valueOf(i2), java.lang.Integer.valueOf(i3), java.lang.Integer.valueOf(i4)) : java.lang.String.format(java.util.Locale.US, "%c%c%c%c", java.lang.Integer.valueOf(i2), java.lang.Integer.valueOf(i3), java.lang.Integer.valueOf(i4), java.lang.Integer.valueOf(i5));
    }

    private static java.nio.charset.Charset l(int i) {
        if (i == 1) {
            return java.nio.charset.StandardCharsets.UTF_16;
        }
        if (i != 2) {
            return i != 3 ? java.nio.charset.StandardCharsets.ISO_8859_1 : java.nio.charset.StandardCharsets.UTF_8;
        }
        return java.nio.charset.StandardCharsets.UTF_16BE;
    }

    /* JADX WARN: Code duplicated, block: B:21:0x0063 A[Catch: all -> 0x009f, TryCatch #0 {all -> 0x009f, blocks: (B:3:0x0006, B:7:0x0013, B:17:0x0039, B:19:0x0041, B:21:0x0063, B:24:0x0068, B:35:0x0083, B:36:0x0085, B:38:0x008a, B:41:0x0095, B:26:0x0072, B:30:0x0079, B:8:0x0020), top: B:48:0x0006 }] */
    /* JADX WARN: Code duplicated, block: B:23:0x0067  */
    /* JADX WARN: Code duplicated, block: B:25:0x0070 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:26:0x0072 A[Catch: all -> 0x009f, TryCatch #0 {all -> 0x009f, blocks: (B:3:0x0006, B:7:0x0013, B:17:0x0039, B:19:0x0041, B:21:0x0063, B:24:0x0068, B:35:0x0083, B:36:0x0085, B:38:0x008a, B:41:0x0095, B:26:0x0072, B:30:0x0079, B:8:0x0020), top: B:48:0x0006 }] */
    /* JADX WARN: Code duplicated, block: B:28:0x0076  */
    /* JADX WARN: Code duplicated, block: B:29:0x0078  */
    /* JADX WARN: Code duplicated, block: B:32:0x007d  */
    /* JADX WARN: Code duplicated, block: B:33:0x007f  */
    /* JADX WARN: Code duplicated, block: B:35:0x0083 A[Catch: all -> 0x009f, TryCatch #0 {all -> 0x009f, blocks: (B:3:0x0006, B:7:0x0013, B:17:0x0039, B:19:0x0041, B:21:0x0063, B:24:0x0068, B:35:0x0083, B:36:0x0085, B:38:0x008a, B:41:0x0095, B:26:0x0072, B:30:0x0079, B:8:0x0020), top: B:48:0x0006 }] */
    private static boolean m(defpackage.etx etxVar, int i, int i2, boolean z) {
        boolean z2;
        int iP;
        long jP;
        int iS;
        int i3;
        int i4 = etxVar.c;
        while (true) {
            try {
                z2 = true;
                z2 = true;
                int i5 = 1;
                if (etxVar.d() >= i2) {
                    if (i >= 3) {
                        iP = etxVar.i();
                        jP = etxVar.w();
                        iS = etxVar.s();
                    } else {
                        iP = etxVar.p();
                        jP = etxVar.p();
                        iS = 0;
                    }
                    if (iP != 0 || jP != 0 || iS != 0) {
                        if (i != 4 || z) {
                            if (i == 4) {
                                i5 = iS & 1;
                                i3 = (iS & 64) == 0 ? 0 : 1;
                            } else if (i == 3) {
                                if ((iS & 32) != 0) {
                                    i3 = 1;
                                } else {
                                    i3 = 0;
                                }
                                if ((iS & 128) == 0) {
                                    i5 = 0;
                                }
                            } else {
                                i3 = 0;
                                i5 = 0;
                            }
                            if (i5 != 0) {
                                i3 += 4;
                            }
                            if (jP < i3 && etxVar.d() >= jP) {
                                etxVar.R((int) jP);
                            }
                        } else if ((8421504 & jP) == 0) {
                            jP = ((jP >> 24) << 21) | (jP & 255) | (((jP >> 8) & 255) << 7) | (((jP >> 16) & 255) << 14);
                            if (i == 4) {
                                i5 = iS & 1;
                                i3 = (iS & 64) == 0 ? 0 : 1;
                            } else if (i == 3) {
                                if ((iS & 32) != 0) {
                                    i3 = 1;
                                } else {
                                    i3 = 0;
                                }
                                if ((iS & 128) == 0) {
                                    i5 = 0;
                                }
                            } else {
                                i3 = 0;
                                i5 = 0;
                            }
                            if (i5 != 0) {
                                i3 += 4;
                            }
                            if (jP < i3) {
                            }
                        }
                        z2 = false;
                        break;
                    }
                    break;
                }
                break;
            } catch (java.lang.Throwable th) {
                etxVar.Q(i4);
                throw th;
            }
        }
        etxVar.Q(i4);
        return z2;
    }

    private static byte[] n(byte[] bArr, int i, int i2) {
        return i2 <= i ? eum.b : java.util.Arrays.copyOfRange(bArr, i, i2);
    }

    /* JADX WARN: Code duplicated, block: B:135:0x0259 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:136:0x025b  */
    /* JADX WARN: Code duplicated, block: B:138:0x025f A[ADDED_TO_REGION] */
    /* JADX WARN: Code duplicated, block: B:140:0x0262  */
    /* JADX WARN: Code duplicated, block: B:142:0x0266 A[ADDED_TO_REGION] */
    /* JADX WARN: Code duplicated, block: B:147:0x027e A[Catch: Exception -> 0x02ec, OutOfMemoryError -> 0x02ef, all -> 0x04d2, TryCatch #1 {all -> 0x04d2, blocks: (B:78:0x00fa, B:80:0x0126, B:82:0x012c, B:94:0x015d, B:98:0x0191, B:106:0x01bc, B:124:0x01fc, B:126:0x0213, B:145:0x026c, B:147:0x027e, B:154:0x02c2, B:156:0x02d8, B:151:0x02a0, B:153:0x02b8, B:171:0x0306, B:178:0x0349, B:181:0x036d, B:184:0x037c, B:187:0x038d, B:188:0x0395, B:190:0x0399, B:192:0x03a0, B:194:0x03a5, B:201:0x03cb, B:205:0x03f0, B:207:0x03fb, B:208:0x042a, B:209:0x0437, B:212:0x043c, B:214:0x0442, B:215:0x0446, B:219:0x045d, B:232:0x0476, B:234:0x04a2, B:235:0x04b1, B:237:0x04bd), top: B:253:0x00ee }] */
    /* JADX WARN: Code duplicated, block: B:149:0x029c  */
    /* JADX WARN: Code duplicated, block: B:151:0x02a0 A[Catch: Exception -> 0x02ec, OutOfMemoryError -> 0x02ef, all -> 0x04d2, TryCatch #1 {all -> 0x04d2, blocks: (B:78:0x00fa, B:80:0x0126, B:82:0x012c, B:94:0x015d, B:98:0x0191, B:106:0x01bc, B:124:0x01fc, B:126:0x0213, B:145:0x026c, B:147:0x027e, B:154:0x02c2, B:156:0x02d8, B:151:0x02a0, B:153:0x02b8, B:171:0x0306, B:178:0x0349, B:181:0x036d, B:184:0x037c, B:187:0x038d, B:188:0x0395, B:190:0x0399, B:192:0x03a0, B:194:0x03a5, B:201:0x03cb, B:205:0x03f0, B:207:0x03fb, B:208:0x042a, B:209:0x0437, B:212:0x043c, B:214:0x0442, B:215:0x0446, B:219:0x045d, B:232:0x0476, B:234:0x04a2, B:235:0x04b1, B:237:0x04bd), top: B:253:0x00ee }] */
    /* JADX WARN: Code duplicated, block: B:153:0x02b8 A[Catch: Exception -> 0x02ec, OutOfMemoryError -> 0x02ef, all -> 0x04d2, TryCatch #1 {all -> 0x04d2, blocks: (B:78:0x00fa, B:80:0x0126, B:82:0x012c, B:94:0x015d, B:98:0x0191, B:106:0x01bc, B:124:0x01fc, B:126:0x0213, B:145:0x026c, B:147:0x027e, B:154:0x02c2, B:156:0x02d8, B:151:0x02a0, B:153:0x02b8, B:171:0x0306, B:178:0x0349, B:181:0x036d, B:184:0x037c, B:187:0x038d, B:188:0x0395, B:190:0x0399, B:192:0x03a0, B:194:0x03a5, B:201:0x03cb, B:205:0x03f0, B:207:0x03fb, B:208:0x042a, B:209:0x0437, B:212:0x043c, B:214:0x0442, B:215:0x0446, B:219:0x045d, B:232:0x0476, B:234:0x04a2, B:235:0x04b1, B:237:0x04bd), top: B:253:0x00ee }] */
    /* JADX WARN: Code duplicated, block: B:163:0x02f8  */
    /* JADX WARN: Code duplicated, block: B:172:0x033d A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:173:0x033f  */
    /* JADX WARN: Code duplicated, block: B:196:0x03c1  */
    /* JADX WARN: Code duplicated, block: B:224:0x0467  */
    /* JADX WARN: Code duplicated, block: B:226:0x046a  */
    /* JADX WARN: Code duplicated, block: B:248:0x04e1  */
    /* JADX WARN: Code duplicated, block: B:252:0x0514 A[ORIG_RETURN, RETURN] */
    /* JADX WARN: Instruction removed from duplicated block: B:248:0x04e1, please report this as an issue */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r13v2 */
    /* JADX WARN: Type inference failed for: r13v25 */
    /* JADX WARN: Type inference failed for: r13v3, types: [foj] */
    /* JADX WARN: Type inference failed for: r15v10 */
    /* JADX WARN: Type inference failed for: r15v11 */
    /* JADX WARN: Type inference failed for: r15v26 */
    /* JADX WARN: Type inference failed for: r15v33 */
    /* JADX WARN: Type inference failed for: r15v34 */
    /* JADX WARN: Type inference failed for: r15v35 */
    /* JADX WARN: Type inference failed for: r15v36 */
    /* JADX WARN: Type inference failed for: r15v5 */
    /* JADX WARN: Type inference failed for: r15v6 */
    /* JADX WARN: Type inference failed for: r15v8 */
    private static defpackage.foj o(int i, defpackage.etx etxVar, boolean z, int i2, defpackage.hgu hguVar) {
        int iQ;
        defpackage.foj fojVar;
        int i3;
        int i4;
        boolean z2;
        boolean z3;
        ?? r13;
        java.lang.Throwable th;
        int i5;
        java.lang.Object focVar;
        java.lang.Object fomVar;
        java.lang.Object fodVar;
        byte[] bArr;
        int iG;
        java.lang.String strP;
        java.lang.Object fooVar;
        java.lang.Object fonVar;
        int iN = etxVar.n();
        int iN2 = etxVar.n();
        int iN3 = etxVar.n();
        int i6 = 0;
        int iN4 = i >= 3 ? etxVar.n() : 0;
        if (i == 4) {
            iQ = etxVar.q();
            if (!z) {
                iQ = ((iQ >> 24) << 21) | (iQ & 255) | (((iQ >> 8) & 255) << 7) | (((iQ >> 16) & 255) << 14);
            }
        } else {
            iQ = i == 3 ? etxVar.q() : etxVar.p();
        }
        int iS = i >= 3 ? etxVar.s() : 0;
        if (iN == 0 && iN2 == 0 && iN3 == 0 && iN4 == 0 && iQ == 0 && iS == 0) {
            etxVar.Q(etxVar.d);
            return null;
        }
        int i7 = etxVar.c + iQ;
        java.lang.String str = "Id3Decoder";
        if (i7 > etxVar.d) {
            defpackage.etr.f("Id3Decoder", "Frame size exceeds remaining tag data");
            etxVar.Q(etxVar.d);
            return null;
        }
        if (hguVar == null) {
            if (i == 3) {
                int i8 = iS & 64;
                i3 = (iS & 128) != 0 ? 1 : 0;
                iN = 0;
                z3 = i8 != 0;
                z2 = (iS & 32) != 0;
                i4 = i3;
            } else if (i == 4) {
                boolean z4 = (iS & 64) != 0;
                int i9 = (iS & 8) != 0 ? 1 : 0;
                boolean z5 = (iS & 4) != 0;
                iN = (iS & 2) != 0 ? 1 : 0;
                i4 = iS & 1;
                int i10 = i9;
                z2 = z4;
                i3 = i10;
                z3 = z5;
            } else {
                i3 = 0;
                i4 = 0;
                z2 = false;
                z3 = false;
                iN = 0;
            }
            if (i3 == 0 && !z3) {
                if (z2) {
                    etxVar.R(1);
                    iQ--;
                }
                if (i4 != 0) {
                    etxVar.R(4);
                    iQ -= 4;
                }
                if (iN != 0) {
                    iQ = h(etxVar, iQ);
                }
                ?? r15 = 2;
                try {
                    try {
                        if (iN == 84 && iN2 == 88 && iN3 == 88 && (i == 2 || iN4 == 88)) {
                            if (iQ > 0) {
                                int iN5 = etxVar.n();
                                int i11 = iQ - 1;
                                byte[] bArr2 = new byte[i11];
                                etxVar.L(bArr2, 0, i11);
                                int iF = f(bArr2, 0, iN5);
                                fonVar = new defpackage.foo("TXXX", new java.lang.String(bArr2, 0, iF, l(iN5)), i(bArr2, iN5, iF + e(iN5)));
                                fooVar = fonVar;
                                str = "Id3Decoder";
                                fodVar = fooVar;
                                th = null;
                                focVar = fodVar;
                            }
                            iN = iN;
                            str = "Id3Decoder";
                            fodVar = null;
                            th = null;
                            focVar = fodVar;
                        } else {
                            if (iN == 84) {
                                java.lang.String strK = k(i, 84, iN2, iN3, iN4);
                                if (iQ > 0) {
                                    int iN6 = etxVar.n();
                                    int i12 = iQ - 1;
                                    byte[] bArr3 = new byte[i12];
                                    etxVar.L(bArr3, 0, i12);
                                    fooVar = new defpackage.foo(strK, null, i(bArr3, iN6, 0));
                                    str = "Id3Decoder";
                                    fodVar = fooVar;
                                    th = null;
                                    focVar = fodVar;
                                }
                            } else {
                                if (iN == 87) {
                                    if (iN2 != 88 || iN3 != 88 || (i != 2 && iN4 != 88)) {
                                        i5 = 87;
                                    } else if (iQ > 0) {
                                        int iN7 = etxVar.n();
                                        int i13 = iQ - 1;
                                        byte[] bArr4 = new byte[i13];
                                        etxVar.L(bArr4, 0, i13);
                                        int iF2 = f(bArr4, 0, iN7);
                                        java.lang.String str2 = new java.lang.String(bArr4, 0, iF2, l(iN7));
                                        int iE = iF2 + e(iN7);
                                        fonVar = new defpackage.fop("WXXX", str2, j(bArr4, iE, g(bArr4, iE), java.nio.charset.StandardCharsets.ISO_8859_1));
                                    }
                                    fooVar = fonVar;
                                    str = "Id3Decoder";
                                    fodVar = fooVar;
                                    th = null;
                                    focVar = fodVar;
                                } else {
                                    i5 = iN;
                                }
                                if (i5 == 87) {
                                    java.lang.String strK2 = k(i, 87, iN2, iN3, iN4);
                                    byte[] bArr5 = new byte[iQ];
                                    etxVar.L(bArr5, 0, iQ);
                                    fonVar = new defpackage.fop(strK2, null, new java.lang.String(bArr5, 0, g(bArr5, 0), java.nio.charset.StandardCharsets.ISO_8859_1));
                                } else {
                                    if (i5 == 80) {
                                        if (iN2 == 82 && iN3 == 73 && iN4 == 86) {
                                            byte[] bArr6 = new byte[iQ];
                                            etxVar.L(bArr6, 0, iQ);
                                            int iG2 = g(bArr6, 0);
                                            fonVar = new defpackage.fon(new java.lang.String(bArr6, 0, iG2, java.nio.charset.StandardCharsets.ISO_8859_1), n(bArr6, iG2 + 1, iQ));
                                        } else {
                                            i5 = 80;
                                        }
                                    }
                                    try {
                                        if (i5 != 71) {
                                            try {
                                                if (i == 2) {
                                                    if (i5 == 80) {
                                                        r15 = 73;
                                                        r15 = 73;
                                                        if (iN2 != 73 && iN3 == 67) {
                                                            int iN8 = etxVar.n();
                                                            java.nio.charset.Charset charsetL = l(iN8);
                                                            int i14 = iQ - 1;
                                                            bArr = new byte[i14];
                                                            etxVar.L(bArr, 0, i14);
                                                            if (i == 2) {
                                                                strP = "image/".concat(java.lang.String.valueOf(ahvr.p(new java.lang.String(bArr, 0, 3, java.nio.charset.StandardCharsets.ISO_8859_1))));
                                                                if ("image/jpg".equals(strP)) {
                                                                    strP = "image/jpeg";
                                                                }
                                                                iG = 2;
                                                            } else {
                                                                iG = g(bArr, 0);
                                                                strP = ahvr.p(new java.lang.String(bArr, 0, iG, java.nio.charset.StandardCharsets.ISO_8859_1));
                                                                if (strP.indexOf(47) == -1) {
                                                                    strP = "image/".concat(java.lang.String.valueOf(strP));
                                                                }
                                                            }
                                                            int i15 = bArr[iG + 1] & 255;
                                                            int i16 = iG + 2;
                                                            int iF3 = f(bArr, i16, iN8);
                                                            iN = iN;
                                                            fodVar = new defpackage.fob(strP, new java.lang.String(bArr, i16, iF3 - i16, charsetL), i15, n(bArr, iF3 + e(iN8), i14));
                                                        }
                                                    }
                                                    iN = iN;
                                                    if (i5 != 67 && iN2 == 79 && iN3 == 77 && (iN4 == 77 || i == 2)) {
                                                        if (iQ >= 4) {
                                                            int iN9 = etxVar.n();
                                                            java.nio.charset.Charset charsetL2 = l(iN9);
                                                            byte[] bArr7 = new byte[3];
                                                            etxVar.L(bArr7, 0, 3);
                                                            java.lang.String str3 = new java.lang.String(bArr7, 0, 3);
                                                            int i17 = iQ - 4;
                                                            byte[] bArr8 = new byte[i17];
                                                            etxVar.L(bArr8, 0, i17);
                                                            int iF4 = f(bArr8, 0, iN9);
                                                            java.lang.String str4 = new java.lang.String(bArr8, 0, iF4, charsetL2);
                                                            int iE2 = iF4 + e(iN9);
                                                            fodVar = new defpackage.fof(str3, str4, j(bArr8, iE2, f(bArr8, iE2, iN9), charsetL2));
                                                        } else {
                                                            fodVar = null;
                                                        }
                                                    } else if (i5 != 67 && iN2 == 72 && iN3 == 65 && iN4 == 80) {
                                                        int i18 = etxVar.c;
                                                        int iG3 = g(etxVar.b, i18);
                                                        java.lang.String str5 = new java.lang.String(etxVar.b, i18, iG3 - i18, java.nio.charset.StandardCharsets.ISO_8859_1);
                                                        etxVar.Q(iG3 + 1);
                                                        int i19 = etxVar.i();
                                                        int i20 = etxVar.i();
                                                        if (i19 > i20) {
                                                            fodVar = null;
                                                        } else {
                                                            long jW = etxVar.w();
                                                            if (jW == 4294967295L) {
                                                                jW = -1;
                                                            }
                                                            long j = jW;
                                                            long jW2 = etxVar.w();
                                                            if (jW2 == 4294967295L) {
                                                                jW2 = -1;
                                                            }
                                                            long j2 = jW2;
                                                            java.util.ArrayList arrayList = new java.util.ArrayList();
                                                            int i21 = i18 + iQ;
                                                            while (etxVar.c < i21) {
                                                                defpackage.foj fojVarO = o(i, etxVar, z, i2, null);
                                                                if (fojVarO != null) {
                                                                    arrayList.add(fojVarO);
                                                                }
                                                                i6 = 0;
                                                            }
                                                            fodVar = new defpackage.fod(str5, i19, i20, j, j2, (defpackage.foj[]) arrayList.toArray(new defpackage.foj[i6]));
                                                        }
                                                    } else {
                                                        try {
                                                            if (i5 != 67 && iN2 == 84 && iN3 == 79 && iN4 == 67) {
                                                                int i22 = etxVar.c;
                                                                int iG4 = g(etxVar.b, i22);
                                                                java.lang.String str6 = new java.lang.String(etxVar.b, i22, iG4 - i22, java.nio.charset.StandardCharsets.ISO_8859_1);
                                                                etxVar.Q(iG4 + 1);
                                                                int iN10 = etxVar.n();
                                                                boolean z6 = (iN10 & 2) != 0;
                                                                int i23 = iN10 & 1;
                                                                int iN11 = etxVar.n();
                                                                java.lang.String[] strArr = new java.lang.String[iN11];
                                                                int i24 = 0;
                                                                while (i24 < iN11) {
                                                                    int i25 = etxVar.c;
                                                                    int i26 = i22;
                                                                    int iG5 = g(etxVar.b, i25);
                                                                    java.lang.String[] strArr2 = strArr;
                                                                    strArr2[i24] = new java.lang.String(etxVar.b, i25, iG5 - i25, java.nio.charset.StandardCharsets.ISO_8859_1);
                                                                    etxVar.Q(iG5 + 1);
                                                                    i24++;
                                                                    i22 = i26;
                                                                    iN11 = iN11;
                                                                    str6 = str6;
                                                                    strArr = strArr2;
                                                                }
                                                                int i27 = i22;
                                                                java.lang.String str7 = str6;
                                                                java.lang.String[] strArr3 = strArr;
                                                                java.util.ArrayList arrayList2 = new java.util.ArrayList();
                                                                int i28 = i27 + iQ;
                                                                while (etxVar.c < i28) {
                                                                    defpackage.foj fojVarO2 = o(i, etxVar, z, i2, null);
                                                                    if (fojVarO2 != null) {
                                                                        arrayList2.add(fojVarO2);
                                                                    }
                                                                }
                                                                th = null;
                                                                fomVar = new defpackage.foe(str7, z6, 1 == i23, strArr3, (defpackage.foj[]) arrayList2.toArray(new defpackage.foj[0]));
                                                            } else {
                                                                th = null;
                                                                if (i5 != 77 && iN2 == 76 && iN3 == 76 && iN4 == 84) {
                                                                    int iS2 = etxVar.s();
                                                                    int iP = etxVar.p();
                                                                    int iP2 = etxVar.p();
                                                                    int iN12 = etxVar.n();
                                                                    int iN13 = etxVar.n();
                                                                    defpackage.etv etvVar = new defpackage.etv();
                                                                    etvVar.i(etxVar);
                                                                    int i29 = ((iQ - 10) << 3) / (iN12 + iN13);
                                                                    int[] iArr = new int[i29];
                                                                    int[] iArr2 = new int[i29];
                                                                    for (int i30 = 0; i30 < i29; i30++) {
                                                                        int iD = etvVar.d(iN12);
                                                                        int iD2 = etvVar.d(iN13);
                                                                        iArr[i30] = iD;
                                                                        iArr2[i30] = iD2;
                                                                    }
                                                                    fomVar = new defpackage.fom(iS2, iP, iP2, iArr, iArr2);
                                                                } else {
                                                                    java.lang.String strK3 = k(i, i5, iN2, iN3, iN4);
                                                                    byte[] bArr9 = new byte[iQ];
                                                                    etxVar.L(bArr9, 0, iQ);
                                                                    focVar = new defpackage.foc(strK3, bArr9);
                                                                }
                                                            }
                                                            focVar = fomVar;
                                                        } catch (java.lang.Exception e) {
                                                            e = e;
                                                            etxVar.Q(i7);
                                                            r13 = r15;
                                                            th = e;
                                                        } catch (java.lang.OutOfMemoryError e2) {
                                                            e = e2;
                                                            etxVar.Q(i7);
                                                            r13 = r15;
                                                            th = e;
                                                        }
                                                    }
                                                } else {
                                                    r15 = 73;
                                                    r15 = 73;
                                                    r15 = 73;
                                                    r15 = 73;
                                                    if (i5 != 65 && iN2 == 80 && iN3 == 73 && iN4 == 67) {
                                                        int iN14 = etxVar.n();
                                                        java.nio.charset.Charset charsetL3 = l(iN14);
                                                        int i110 = iQ - 1;
                                                        bArr = new byte[i110];
                                                        etxVar.L(bArr, 0, i110);
                                                        if (i == 2) {
                                                            strP = "image/".concat(java.lang.String.valueOf(ahvr.p(new java.lang.String(bArr, 0, 3, java.nio.charset.StandardCharsets.ISO_8859_1))));
                                                            if ("image/jpg".equals(strP)) {
                                                                strP = "image/jpeg";
                                                            }
                                                            iG = 2;
                                                        } else {
                                                            iG = g(bArr, 0);
                                                            strP = ahvr.p(new java.lang.String(bArr, 0, iG, java.nio.charset.StandardCharsets.ISO_8859_1));
                                                            if (strP.indexOf(47) == -1) {
                                                                strP = "image/".concat(java.lang.String.valueOf(strP));
                                                            }
                                                        }
                                                        int i111 = bArr[iG + 1] & 255;
                                                        int i112 = iG + 2;
                                                        int iF5 = f(bArr, i112, iN14);
                                                        iN = iN;
                                                        fodVar = new defpackage.fob(strP, new java.lang.String(bArr, i112, iF5 - i112, charsetL3), i111, n(bArr, iF5 + e(iN14), i110));
                                                    } else {
                                                        iN = iN;
                                                        if (i5 != 67) {
                                                            if (i5 != 67) {
                                                            }
                                                            if (i5 != 67) {
                                                                th = null;
                                                                if (i5 != 77) {
                                                                }
                                                                java.lang.String strK4 = k(i, i5, iN2, iN3, iN4);
                                                                byte[] bArr10 = new byte[iQ];
                                                                etxVar.L(bArr10, 0, iQ);
                                                                focVar = new defpackage.foc(strK4, bArr10);
                                                            } else {
                                                                th = null;
                                                                if (i5 != 77) {
                                                                }
                                                                java.lang.String strK5 = k(i, i5, iN2, iN3, iN4);
                                                                byte[] bArr11 = new byte[iQ];
                                                                etxVar.L(bArr11, 0, iQ);
                                                                focVar = new defpackage.foc(strK5, bArr11);
                                                            }
                                                        } else {
                                                            if (i5 != 67) {
                                                            }
                                                            if (i5 != 67) {
                                                                th = null;
                                                                if (i5 != 77) {
                                                                }
                                                                java.lang.String strK6 = k(i, i5, iN2, iN3, iN4);
                                                                byte[] bArr12 = new byte[iQ];
                                                                etxVar.L(bArr12, 0, iQ);
                                                                focVar = new defpackage.foc(strK6, bArr12);
                                                            } else {
                                                                th = null;
                                                                if (i5 != 77) {
                                                                }
                                                                java.lang.String strK7 = k(i, i5, iN2, iN3, iN4);
                                                                byte[] bArr13 = new byte[iQ];
                                                                etxVar.L(bArr13, 0, iQ);
                                                                focVar = new defpackage.foc(strK7, bArr13);
                                                            }
                                                        }
                                                    }
                                                }
                                            } catch (java.lang.Exception e3) {
                                                e = e3;
                                                r15 = 0;
                                                etxVar.Q(i7);
                                                r13 = r15;
                                                th = e;
                                                if (r13 == 0) {
                                                    return r13;
                                                }
                                                defpackage.etr.g(str, "Failed to decode frame: id=" + k(i, iN, iN2, iN3, iN4) + ", frameSize=" + iQ, th);
                                                return r13;
                                            } catch (java.lang.OutOfMemoryError e4) {
                                                e = e4;
                                                r15 = 0;
                                                etxVar.Q(i7);
                                                r13 = r15;
                                                th = e;
                                                if (r13 == 0) {
                                                    return r13;
                                                }
                                                defpackage.etr.g(str, "Failed to decode frame: id=" + k(i, iN, iN2, iN3, iN4) + ", frameSize=" + iQ, th);
                                                return r13;
                                            }
                                            if (r13 == 0) {
                                                return r13;
                                            }
                                            defpackage.etr.g(str, "Failed to decode frame: id=" + k(i, iN, iN2, iN3, iN4) + ", frameSize=" + iQ, th);
                                            return r13;
                                        }
                                        if (iN2 != 69 || iN3 != 79) {
                                            i5 = 71;
                                            if (i == 2) {
                                                if (i5 == 80) {
                                                    r15 = 73;
                                                    r15 = 73;
                                                    if (iN2 != 73) {
                                                    }
                                                }
                                                iN = iN;
                                                if (i5 != 67) {
                                                    if (i5 != 67) {
                                                    }
                                                    if (i5 != 67) {
                                                        th = null;
                                                        if (i5 != 77) {
                                                        }
                                                        java.lang.String strK8 = k(i, i5, iN2, iN3, iN4);
                                                        byte[] bArr14 = new byte[iQ];
                                                        etxVar.L(bArr14, 0, iQ);
                                                        focVar = new defpackage.foc(strK8, bArr14);
                                                    } else {
                                                        th = null;
                                                        if (i5 != 77) {
                                                        }
                                                        java.lang.String strK9 = k(i, i5, iN2, iN3, iN4);
                                                        byte[] bArr15 = new byte[iQ];
                                                        etxVar.L(bArr15, 0, iQ);
                                                        focVar = new defpackage.foc(strK9, bArr15);
                                                    }
                                                } else {
                                                    if (i5 != 67) {
                                                    }
                                                    if (i5 != 67) {
                                                        th = null;
                                                        if (i5 != 77) {
                                                        }
                                                        java.lang.String strK10 = k(i, i5, iN2, iN3, iN4);
                                                        byte[] bArr16 = new byte[iQ];
                                                        etxVar.L(bArr16, 0, iQ);
                                                        focVar = new defpackage.foc(strK10, bArr16);
                                                    } else {
                                                        th = null;
                                                        if (i5 != 77) {
                                                        }
                                                        java.lang.String strK11 = k(i, i5, iN2, iN3, iN4);
                                                        byte[] bArr17 = new byte[iQ];
                                                        etxVar.L(bArr17, 0, iQ);
                                                        focVar = new defpackage.foc(strK11, bArr17);
                                                    }
                                                }
                                            } else {
                                                r15 = 73;
                                                r15 = 73;
                                                r15 = 73;
                                                r15 = 73;
                                                if (i5 != 65) {
                                                }
                                                iN = iN;
                                                if (i5 != 67) {
                                                    if (i5 != 67) {
                                                    }
                                                    if (i5 != 67) {
                                                        th = null;
                                                        if (i5 != 77) {
                                                        }
                                                        java.lang.String strK12 = k(i, i5, iN2, iN3, iN4);
                                                        byte[] bArr18 = new byte[iQ];
                                                        etxVar.L(bArr18, 0, iQ);
                                                        focVar = new defpackage.foc(strK12, bArr18);
                                                    } else {
                                                        th = null;
                                                        if (i5 != 77) {
                                                        }
                                                        java.lang.String strK13 = k(i, i5, iN2, iN3, iN4);
                                                        byte[] bArr19 = new byte[iQ];
                                                        etxVar.L(bArr19, 0, iQ);
                                                        focVar = new defpackage.foc(strK13, bArr19);
                                                    }
                                                } else {
                                                    if (i5 != 67) {
                                                    }
                                                    if (i5 != 67) {
                                                        th = null;
                                                        if (i5 != 77) {
                                                        }
                                                        java.lang.String strK14 = k(i, i5, iN2, iN3, iN4);
                                                        byte[] bArr110 = new byte[iQ];
                                                        etxVar.L(bArr110, 0, iQ);
                                                        focVar = new defpackage.foc(strK14, bArr110);
                                                    } else {
                                                        th = null;
                                                        if (i5 != 77) {
                                                        }
                                                        java.lang.String strK15 = k(i, i5, iN2, iN3, iN4);
                                                        byte[] bArr111 = new byte[iQ];
                                                        etxVar.L(bArr111, 0, iQ);
                                                        focVar = new defpackage.foc(strK15, bArr111);
                                                    }
                                                }
                                            }
                                            if (r13 == 0) {
                                                return r13;
                                            }
                                            defpackage.etr.g(str, "Failed to decode frame: id=" + k(i, iN, iN2, iN3, iN4) + ", frameSize=" + iQ, th);
                                            return r13;
                                        }
                                        if (iN4 != 66 && i != 2) {
                                            i5 = 71;
                                            if (i == 2) {
                                                if (i5 == 80) {
                                                    r15 = 73;
                                                    r15 = 73;
                                                    if (iN2 != 73) {
                                                    }
                                                }
                                                iN = iN;
                                                if (i5 != 67) {
                                                    if (i5 != 67) {
                                                    }
                                                    if (i5 != 67) {
                                                        th = null;
                                                        if (i5 != 77) {
                                                        }
                                                        java.lang.String strK16 = k(i, i5, iN2, iN3, iN4);
                                                        byte[] bArr112 = new byte[iQ];
                                                        etxVar.L(bArr112, 0, iQ);
                                                        focVar = new defpackage.foc(strK16, bArr112);
                                                    } else {
                                                        th = null;
                                                        if (i5 != 77) {
                                                        }
                                                        java.lang.String strK17 = k(i, i5, iN2, iN3, iN4);
                                                        byte[] bArr113 = new byte[iQ];
                                                        etxVar.L(bArr113, 0, iQ);
                                                        focVar = new defpackage.foc(strK17, bArr113);
                                                    }
                                                } else {
                                                    if (i5 != 67) {
                                                    }
                                                    if (i5 != 67) {
                                                        th = null;
                                                        if (i5 != 77) {
                                                        }
                                                        java.lang.String strK18 = k(i, i5, iN2, iN3, iN4);
                                                        byte[] bArr114 = new byte[iQ];
                                                        etxVar.L(bArr114, 0, iQ);
                                                        focVar = new defpackage.foc(strK18, bArr114);
                                                    } else {
                                                        th = null;
                                                        if (i5 != 77) {
                                                        }
                                                        java.lang.String strK19 = k(i, i5, iN2, iN3, iN4);
                                                        byte[] bArr115 = new byte[iQ];
                                                        etxVar.L(bArr115, 0, iQ);
                                                        focVar = new defpackage.foc(strK19, bArr115);
                                                    }
                                                }
                                            } else {
                                                r15 = 73;
                                                r15 = 73;
                                                r15 = 73;
                                                r15 = 73;
                                                if (i5 != 65) {
                                                }
                                                iN = iN;
                                                if (i5 != 67) {
                                                    if (i5 != 67) {
                                                    }
                                                    if (i5 != 67) {
                                                        th = null;
                                                        if (i5 != 77) {
                                                        }
                                                        java.lang.String strK110 = k(i, i5, iN2, iN3, iN4);
                                                        byte[] bArr116 = new byte[iQ];
                                                        etxVar.L(bArr116, 0, iQ);
                                                        focVar = new defpackage.foc(strK110, bArr116);
                                                    } else {
                                                        th = null;
                                                        if (i5 != 77) {
                                                        }
                                                        java.lang.String strK111 = k(i, i5, iN2, iN3, iN4);
                                                        byte[] bArr117 = new byte[iQ];
                                                        etxVar.L(bArr117, 0, iQ);
                                                        focVar = new defpackage.foc(strK111, bArr117);
                                                    }
                                                } else {
                                                    if (i5 != 67) {
                                                    }
                                                    if (i5 != 67) {
                                                        th = null;
                                                        if (i5 != 77) {
                                                        }
                                                        java.lang.String strK112 = k(i, i5, iN2, iN3, iN4);
                                                        byte[] bArr118 = new byte[iQ];
                                                        etxVar.L(bArr118, 0, iQ);
                                                        focVar = new defpackage.foc(strK112, bArr118);
                                                    } else {
                                                        th = null;
                                                        if (i5 != 77) {
                                                        }
                                                        java.lang.String strK113 = k(i, i5, iN2, iN3, iN4);
                                                        byte[] bArr119 = new byte[iQ];
                                                        etxVar.L(bArr119, 0, iQ);
                                                        focVar = new defpackage.foc(strK113, bArr119);
                                                    }
                                                }
                                            }
                                            if (r13 == 0) {
                                                return r13;
                                            }
                                            defpackage.etr.g(str, "Failed to decode frame: id=" + k(i, iN, iN2, iN3, iN4) + ", frameSize=" + iQ, th);
                                            return r13;
                                        }
                                        try {
                                            int iN15 = etxVar.n();
                                            java.nio.charset.Charset charsetL4 = l(iN15);
                                            int i31 = iQ - 1;
                                            byte[] bArr20 = new byte[i31];
                                            etxVar.L(bArr20, 0, i31);
                                            int iG6 = g(bArr20, 0);
                                            str = "Id3Decoder";
                                            java.lang.String strD = defpackage.eqz.d(new java.lang.String(bArr20, 0, iG6, java.nio.charset.StandardCharsets.ISO_8859_1));
                                            int i32 = iG6 + 1;
                                            int iF6 = f(bArr20, i32, iN15);
                                            java.lang.String strJ = j(bArr20, i32, iF6, charsetL4);
                                            int iE3 = iF6 + e(iN15);
                                            int iF7 = f(bArr20, iE3, iN15);
                                            iN = iN;
                                            fodVar = new defpackage.fog(strD, strJ, j(bArr20, iE3, iF7, charsetL4), n(bArr20, iF7 + e(iN15), i31));
                                        } catch (java.lang.Exception e5) {
                                            e = e5;
                                            str = "Id3Decoder";
                                            iN = iN;
                                            r15 = 0;
                                            etxVar.Q(i7);
                                            r13 = r15;
                                            th = e;
                                        } catch (java.lang.OutOfMemoryError e6) {
                                            e = e6;
                                            str = "Id3Decoder";
                                            iN = iN;
                                            r15 = 0;
                                            etxVar.Q(i7);
                                            r13 = r15;
                                            th = e;
                                        }
                                        th = null;
                                        focVar = fodVar;
                                    } catch (java.lang.Exception e7) {
                                        e = e7;
                                    } catch (java.lang.OutOfMemoryError e8) {
                                        e = e8;
                                    }
                                }
                                fooVar = fonVar;
                                str = "Id3Decoder";
                                fodVar = fooVar;
                                th = null;
                                focVar = fodVar;
                            }
                            iN = iN;
                            str = "Id3Decoder";
                            fodVar = null;
                            th = null;
                            focVar = fodVar;
                        }
                        etxVar.Q(i7);
                        r13 = focVar;
                    } catch (java.lang.Throwable th2) {
                        etxVar.Q(i7);
                        throw th2;
                    }
                } catch (java.lang.Exception | java.lang.OutOfMemoryError e9) {
                    e = e9;
                    iN = iN;
                    str = "Id3Decoder";
                }
                if (r13 == 0) {
                    return r13;
                }
                defpackage.etr.g(str, "Failed to decode frame: id=" + k(i, iN, iN2, iN3, iN4) + ", frameSize=" + iQ, th);
                return r13;
            }
            fojVar = null;
            defpackage.etr.f("Id3Decoder", "Skipping unsupported compressed or encrypted frame");
            etxVar.Q(i7);
        } else {
            fojVar = null;
            etxVar.Q(i7);
        }
        return fojVar;
    }

    @Override // defpackage.fnr
    protected final defpackage.eqy b(defpackage.fnp fnpVar, java.nio.ByteBuffer byteBuffer) {
        return c(byteBuffer.array(), byteBuffer.limit());
    }

    /* JADX WARN: Code duplicated, block: B:37:0x00a8  */
    /* JADX WARN: Code duplicated, block: B:39:0x00ae  */
    /* JADX WARN: Code duplicated, block: B:42:0x00b5  */
    /* JADX WARN: Code duplicated, block: B:45:0x00c3 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:46:0x00c5  */
    /* JADX WARN: Code duplicated, block: B:48:0x00cb  */
    /* JADX WARN: Code duplicated, block: B:49:0x00cd  */
    /* JADX WARN: Code duplicated, block: B:53:0x00de  */
    /* JADX WARN: Code duplicated, block: B:59:0x00e6 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:61:0x00d8 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:64:? A[RETURN, SYNTHETIC] */
    public final defpackage.eqy c(byte[] bArr, int i) {
        defpackage.foh fohVar;
        int i2;
        int i3;
        boolean z;
        int iH;
        boolean z2;
        defpackage.foj fojVarO;
        java.util.ArrayList arrayList = new java.util.ArrayList();
        defpackage.etx etxVar = new defpackage.etx(bArr, i);
        int i4 = 4;
        if (etxVar.d() < 10) {
            defpackage.etr.f("Id3Decoder", "Data too short to be an ID3 tag");
        } else {
            int iP = etxVar.p();
            if (iP != 4801587) {
                defpackage.etr.f("Id3Decoder", "Unexpected first three bytes of ID3 tag header: 0x".concat(java.lang.String.valueOf(java.lang.String.format("%06X", java.lang.Integer.valueOf(iP)))));
            } else {
                int iN = etxVar.n();
                if (d(iN)) {
                    etxVar.R(1);
                    int iN2 = etxVar.n();
                    int iM = etxVar.m();
                    if (iN == 2) {
                        if ((iN2 & 64) != 0) {
                            defpackage.etr.f("Id3Decoder", "Skipped ID3 tag with majorVersion=2 and undefined compression scheme");
                        }
                        if (fohVar == null) {
                            return null;
                        }
                        int i5 = etxVar.c;
                        i2 = fohVar.a;
                        i3 = i2 == 2 ? 6 : 10;
                        z = fohVar.b;
                        iH = fohVar.c;
                        if (z) {
                            iH = h(etxVar, iH);
                        }
                        etxVar.P(i5 + iH);
                        if (!m(etxVar, i2, i3, false)) {
                            if (i2 == 4) {
                                z2 = m(etxVar, 4, i3, true);
                            } else {
                                i4 = i2;
                            }
                            defpackage.etr.f("Id3Decoder", a.bj(i4, "Failed to validate ID3 tag with majorVersion="));
                            return null;
                        }
                        while (etxVar.d() >= i3) {
                            fojVarO = o(i2, etxVar, z2, i3, this.b);
                            if (fojVarO != null) {
                                arrayList.add(fojVarO);
                            }
                        }
                        return new defpackage.eqy(arrayList);
                    }
                    if (iN == 3) {
                        if ((iN2 & 64) != 0) {
                            int i6 = etxVar.i();
                            etxVar.R(i6);
                            iM -= i6 + 4;
                        }
                    } else if (iN == 4) {
                        if ((iN2 & 64) != 0) {
                            int iM2 = etxVar.m();
                            etxVar.R(iM2 - 4);
                            iM -= iM2;
                        }
                        if ((iN2 & 16) != 0) {
                            iM -= 10;
                        }
                        iN = 4;
                    }
                    fohVar = new defpackage.foh(iN, iN < 4 && (iN2 & 128) != 0, iM);
                    if (fohVar == null) {
                        return null;
                    }
                    int i7 = etxVar.c;
                    i2 = fohVar.a;
                    if (i2 == 2) {
                    }
                    z = fohVar.b;
                    iH = fohVar.c;
                    if (z) {
                        iH = h(etxVar, iH);
                    }
                    etxVar.P(i7 + iH);
                    if (!m(etxVar, i2, i3, false)) {
                        if (i2 == 4) {
                            i4 = i2;
                        } else if (m(etxVar, 4, i3, true)) {
                        }
                        defpackage.etr.f("Id3Decoder", a.bj(i4, "Failed to validate ID3 tag with majorVersion="));
                        return null;
                    }
                    while (etxVar.d() >= i3) {
                        fojVarO = o(i2, etxVar, z2, i3, this.b);
                        if (fojVarO != null) {
                            arrayList.add(fojVarO);
                        }
                    }
                    return new defpackage.eqy(arrayList);
                }
                defpackage.etr.f("Id3Decoder", a.bj(iN, "Skipped ID3 tag with unsupported majorVersion="));
            }
        }
        fohVar = null;
        if (fohVar == null) {
            return null;
        }
        int i8 = etxVar.c;
        i2 = fohVar.a;
        if (i2 == 2) {
        }
        z = fohVar.b;
        iH = fohVar.c;
        if (z) {
            iH = h(etxVar, iH);
        }
        etxVar.P(i8 + iH);
        if (!m(etxVar, i2, i3, false)) {
            if (i2 == 4) {
                i4 = i2;
            } else if (m(etxVar, 4, i3, true)) {
            }
            defpackage.etr.f("Id3Decoder", a.bj(i4, "Failed to validate ID3 tag with majorVersion="));
            return null;
        }
        while (etxVar.d() >= i3) {
            fojVarO = o(i2, etxVar, z2, i3, this.b);
            if (fojVarO != null) {
                arrayList.add(fojVarO);
            }
        }
        return new defpackage.eqy(arrayList);
    }
}
