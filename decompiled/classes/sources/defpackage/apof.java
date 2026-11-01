package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes.dex */
public final class apof {
    private static final char[] a = {'0', '1', '2', '3', '4', '5', '6', '7', '8', '9', 'A', 'B', 'C', 'D', 'E', 'F'};

    public static final boolean a(java.lang.String str, int i, int i2) {
        defpackage.aooh.f(str, "<this>");
        int i3 = i + 2;
        return i3 < i2 && str.charAt(i) == '%' && defpackage.apjv.f(str.charAt(i + 1)) != -1 && defpackage.apjv.f(str.charAt(i3)) != -1;
    }

    /* JADX WARN: Code duplicated, block: B:63:0x00a9  */
    /* JADX WARN: Code duplicated, block: B:65:0x00ad  */
    /* JADX WARN: Code duplicated, block: B:67:0x00b1  */
    /* JADX WARN: Code duplicated, block: B:68:0x00b6  */
    /* JADX WARN: Code duplicated, block: B:69:0x00b8  */
    /* JADX WARN: Code duplicated, block: B:76:0x00c7 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:77:0x00c9 A[ADDED_TO_REGION] */
    /* JADX WARN: Code duplicated, block: B:85:0x00dd  */
    /* JADX WARN: Code duplicated, block: B:86:0x00df A[ADDED_TO_REGION] */
    /* JADX WARN: Code duplicated, block: B:90:0x00ea  */
    /* JADX WARN: Code duplicated, block: B:94:0x00f2  */
    /* JADX WARN: Code duplicated, block: B:98:0x0100 A[LOOP:2: B:96:0x00fa->B:98:0x0100, LOOP_END] */
    /* JADX WARN: Instruction removed from duplicated block: B:63:0x00a9, please report this as an issue */
    public static /* synthetic */ java.lang.String b(java.lang.String str, int i, int i2, java.lang.String str2, boolean z, boolean z2, boolean z3, boolean z4, int i3) throws java.io.EOFException {
        int i4;
        int i5;
        int i6;
        int i7;
        int length = (i3 & 2) != 0 ? str.length() : i2;
        boolean z5 = ((i3 & 8) == 0) & z;
        boolean z6 = ((i3 & 16) == 0) & z2;
        boolean z7 = ((i3 & 32) == 0) & z3;
        boolean z8 = ((i3 & 64) == 0) & z4;
        if (str == null) {
            defpackage.aooh.i("<this>");
        }
        int i8 = 1 == (i3 & 1) ? 0 : i;
        if (str == null) {
            defpackage.aooh.i("<this>");
        }
        int iCharCount = i8;
        while (true) {
            if (iCharCount >= length) {
                java.lang.String strSubstring = str.substring(i8, length);
                defpackage.aooh.e(strSubstring, "substring(...)");
                return strSubstring;
            }
            int iCodePointAt = str.codePointAt(iCharCount);
            i4 = 43;
            i5 = 32;
            if (iCodePointAt >= 32 && iCodePointAt != 127 && ((iCodePointAt < 128 || z8) && defpackage.aoov.M(str2, (char) iCodePointAt, 0) < 0 && (iCodePointAt != 37 || (z5 && (!z6 || a(str, iCharCount, length)))))) {
                if (iCodePointAt == 43 && z7) {
                    z7 = true;
                    break;
                }
                iCharCount += java.lang.Character.charCount(iCodePointAt);
            } else {
                break;
            }
        }
        defpackage.apoy apoyVar = new defpackage.apoy();
        apoyVar.U(str, i8, iCharCount);
        defpackage.apoy apoyVar2 = null;
        if (str == null) {
            defpackage.aooh.i("input");
        }
        while (iCharCount < length) {
            int iCodePointAt2 = str.codePointAt(iCharCount);
            if (!z5) {
                if (iCodePointAt2 == i5) {
                    i6 = iCodePointAt2;
                } else if (str2 == " !\"#$&'()+,/:;<=>?@[\\]^`{|}~") {
                    apoyVar.ab("+");
                } else {
                    i6 = i5;
                }
                if (iCodePointAt2 == i4 || !z7) {
                    if (iCodePointAt2 >= i5 && iCodePointAt2 != 127 && ((iCodePointAt2 < 128 || z8) && defpackage.aoov.M(str2, (char) iCodePointAt2, 0) < 0)) {
                        if (iCodePointAt2 != 37) {
                            i7 = iCodePointAt2;
                        } else if (!z5 && (!z6 || a(str, iCharCount, length))) {
                            i7 = 37;
                        }
                        apoyVar.V(iCodePointAt2);
                        iCodePointAt2 = i7;
                    }
                    if (apoyVar2 == null) {
                        apoyVar2 = new defpackage.apoy();
                    }
                    apoyVar2.V(iCodePointAt2);
                    while (!apoyVar2.B()) {
                        byte bD = apoyVar2.d();
                        apoyVar.N(37);
                        char[] cArr = a;
                        apoyVar.N(cArr[(bD & 255) >> 4]);
                        apoyVar.N(cArr[bD & 15]);
                    }
                } else {
                    apoyVar.ab(true != z5 ? "%2B" : "+");
                    iCodePointAt2 = i6;
                }
            } else if (iCodePointAt2 != 9 && iCodePointAt2 != 10 && iCodePointAt2 != 12) {
                i7 = 13;
                if (iCodePointAt2 != 13) {
                    if (iCodePointAt2 == i5) {
                        i6 = iCodePointAt2;
                    } else if (str2 == " !\"#$&'()+,/:;<=>?@[\\]^`{|}~") {
                        apoyVar.ab("+");
                    } else {
                        i6 = i5;
                    }
                    if (iCodePointAt2 == i4) {
                        if (iCodePointAt2 >= i5) {
                            if (iCodePointAt2 != 37) {
                                i7 = iCodePointAt2;
                            } else if (!z5) {
                            }
                            apoyVar.V(iCodePointAt2);
                            iCodePointAt2 = i7;
                        }
                        if (apoyVar2 == null) {
                            apoyVar2 = new defpackage.apoy();
                        }
                        apoyVar2.V(iCodePointAt2);
                        while (!apoyVar2.B()) {
                            byte bD2 = apoyVar2.d();
                            apoyVar.N(37);
                            char[] cArr2 = a;
                            apoyVar.N(cArr2[(bD2 & 255) >> 4]);
                            apoyVar.N(cArr2[bD2 & 15]);
                        }
                    } else {
                        if (iCodePointAt2 >= i5) {
                            if (iCodePointAt2 != 37) {
                                i7 = iCodePointAt2;
                            } else if (!z5) {
                            }
                            apoyVar.V(iCodePointAt2);
                            iCodePointAt2 = i7;
                        }
                        if (apoyVar2 == null) {
                            apoyVar2 = new defpackage.apoy();
                        }
                        apoyVar2.V(iCodePointAt2);
                        while (!apoyVar2.B()) {
                            byte bD3 = apoyVar2.d();
                            apoyVar.N(37);
                            char[] cArr3 = a;
                            apoyVar.N(cArr3[(bD3 & 255) >> 4]);
                            apoyVar.N(cArr3[bD3 & 15]);
                        }
                    }
                } else {
                    iCodePointAt2 = i7;
                }
            }
            iCharCount += java.lang.Character.charCount(iCodePointAt2);
            i5 = 32;
            i4 = 43;
        }
        return apoyVar.o();
    }

    public static /* synthetic */ java.lang.String c(java.lang.String str, int i, int i2, boolean z, int i3) {
        if ((i3 & 2) != 0) {
            i2 = str.length();
        }
        boolean z2 = true;
        if (1 == (i3 & 1)) {
            i = 0;
        }
        boolean z3 = ((i3 & 4) == 0) & z;
        if (str == null) {
            defpackage.aooh.i("<this>");
        }
        int iCharCount = i;
        while (true) {
            if (iCharCount < i2) {
                char cCharAt = str.charAt(iCharCount);
                if (cCharAt == '%') {
                    z2 = z3;
                    break;
                }
                if (cCharAt == '+' && z3) {
                    break;
                }
                iCharCount++;
            } else {
                java.lang.String strSubstring = str.substring(i, i2);
                defpackage.aooh.e(strSubstring, "substring(...)");
                return strSubstring;
            }
        }
        defpackage.apoy apoyVar = new defpackage.apoy();
        apoyVar.U(str, i, iCharCount);
        if (str == null) {
            defpackage.aooh.i("encoded");
        }
        while (iCharCount < i2) {
            int iCodePointAt = str.codePointAt(iCharCount);
            if (iCodePointAt == 37) {
                int i4 = iCharCount + 2;
                if (i4 < i2) {
                    int iF = defpackage.apjv.f(str.charAt(iCharCount + 1));
                    int iF2 = defpackage.apjv.f(str.charAt(i4));
                    if (iF == -1 || iF2 == -1) {
                        iCodePointAt = 37;
                        apoyVar.V(iCodePointAt);
                        iCharCount += java.lang.Character.charCount(iCodePointAt);
                    } else {
                        apoyVar.N((iF << 4) + iF2);
                        iCharCount += 3;
                    }
                } else {
                    iCodePointAt = 37;
                }
            }
            if (iCodePointAt == 43 && z2) {
                apoyVar.N(32);
                iCharCount++;
            } else {
                apoyVar.V(iCodePointAt);
                iCharCount += java.lang.Character.charCount(iCodePointAt);
            }
        }
        return apoyVar.o();
    }
}
