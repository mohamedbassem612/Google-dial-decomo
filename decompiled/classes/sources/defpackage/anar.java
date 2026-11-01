package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes.dex */
public class anar {
    public static volatile anpk g;
    public static volatile anpk h;
    public static volatile anpk i;
    public static volatile anpk j;
    public static volatile anpk k;

    private anar() {
    }

    public static java.util.List A(int i2) {
        return i2 == 0 ? java.util.Collections.EMPTY_LIST : new java.util.ArrayList(i2);
    }

    public static int B(amwr amwrVar, boolean z) {
        int i2;
        int i3;
        if (z) {
            i2 = amwrVar.c;
            i3 = amwrVar.b;
        } else {
            i2 = amwrVar.b;
            i3 = amwrVar.c;
        }
        byte[][] bArr = amwrVar.a;
        int i4 = 0;
        for (int i5 = 0; i5 < i2; i5++) {
            byte b = -1;
            int i6 = 0;
            for (int i7 = 0; i7 < i3; i7++) {
                byte b2 = z ? bArr[i5][i7] : bArr[i7][i5];
                if (b2 == b) {
                    i6++;
                } else {
                    if (i6 >= 5) {
                        i4 += i6 - 2;
                    }
                    i6 = 1;
                    b = b2;
                }
            }
            if (i6 >= 5) {
                i4 += i6 - 2;
            }
        }
        return i4;
    }

    public static boolean C(byte[] bArr, int i2, int i3) {
        if (i2 < 0 || bArr.length < i3) {
            return false;
        }
        while (i2 < i3) {
            if (bArr[i2] == 1) {
                return false;
            }
            i2++;
        }
        return true;
    }

    public static boolean D(byte[][] bArr, int i2, int i3, int i4) {
        if (i3 < 0 || bArr.length < i4) {
            return false;
        }
        while (i3 < i4) {
            if (bArr[i3][i2] == 1) {
                return false;
            }
            i3++;
        }
        return true;
    }

    public static char E(int i2, java.lang.String str) {
        return str.charAt(i2);
    }

    public static int F(java.lang.String str) {
        return str.length();
    }

    public static java.lang.CharSequence G(int i2, int i3, java.lang.String str) {
        return str.subSequence(i2, i3);
    }

    /* JADX WARN: Code duplicated, block: B:113:0x0228 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:114:0x022a  */
    /* JADX WARN: Code duplicated, block: B:116:0x0236  */
    /* JADX WARN: Code duplicated, block: B:118:0x0240 A[LOOP:0: B:115:0x0234->B:118:0x0240, LOOP_END] */
    /* JADX WARN: Code duplicated, block: B:120:0x0245  */
    /* JADX WARN: Code duplicated, block: B:124:0x0255  */
    /* JADX WARN: Code duplicated, block: B:127:0x0262 A[LOOP:1: B:123:0x0253->B:127:0x0262, LOOP_END] */
    /* JADX WARN: Code duplicated, block: B:130:0x0267  */
    /* JADX WARN: Code duplicated, block: B:133:0x025f A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:135:0x025f A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:137:0x0195 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:65:0x0123  */
    /* JADX WARN: Code duplicated, block: B:68:0x012f  */
    /* JADX WARN: Code duplicated, block: B:69:0x0136  */
    /* JADX WARN: Code duplicated, block: B:71:0x013c  */
    /* JADX WARN: Code duplicated, block: B:72:0x0145  */
    /* JADX WARN: Code duplicated, block: B:75:0x0153  */
    /* JADX WARN: Code duplicated, block: B:76:0x015b  */
    /* JADX WARN: Code duplicated, block: B:78:0x0161  */
    /* JADX WARN: Code duplicated, block: B:79:0x0169  */
    /* JADX WARN: Code duplicated, block: B:82:0x0178  */
    /* JADX WARN: Code duplicated, block: B:85:0x0199  */
    public static int H(java.lang.CharSequence charSequence, int i2, int i3) {
        int i4;
        float[] fArr;
        boolean z;
        boolean z2;
        char c;
        int i5;
        int i6;
        int i7;
        int i8;
        int i9;
        int i10;
        int iMin;
        int iMin2;
        int i11 = i2;
        boolean z3 = false;
        boolean z4 = false;
        if (i11 < charSequence.length()) {
            char c2 = 6;
            float f = 1.0f;
            i4 = 5;
            char c3 = 2;
            if (i3 == 0) {
                fArr = new float[]{0.0f, 1.0f, 1.0f, 1.0f, 1.0f, 1.25f};
            } else {
                fArr = new float[6];
                fArr[0] = 1.0f;
                fArr[1] = 2.0f;
                fArr[2] = 2.0f;
                fArr[3] = 2.0f;
                fArr[4] = 2.0f;
                fArr[5] = 2.25f;
                fArr[i3] = 0.0f;
            }
            byte[] bArr = new byte[6];
            int[] iArr = new int[6];
            int i12 = 0;
            while (true) {
                float f2 = f;
                int i13 = i11 + i12;
                if (i13 == charSequence.length()) {
                    java.util.Arrays.fill(bArr, z3 ? (byte) 1 : (byte) 0);
                    java.util.Arrays.fill(iArr, z3 ? 1 : 0);
                    int iW = W(fArr, iArr, bArr);
                    int i14 = z3 ? 1 : 0;
                    int i15 = i14;
                    while (i14 < c2) {
                        i15 += bArr[i14];
                        i14++;
                    }
                    if (iArr[z3 ? 1 : 0] != iW) {
                        if (i15 == 1) {
                            if (bArr[i4 == true ? 1 : 0] > 0) {
                                break;
                            }
                            if (bArr[4] > 0) {
                                z4 = z3;
                                i4 = 4;
                                z4 = z3;
                            } else {
                                if (bArr[c3] > 0) {
                                    z2 = z3 ? 1 : 0;
                                    i4 = c3;
                                    break;
                                }
                                if (bArr[3] > 0) {
                                    z4 = z3;
                                    i4 = 3;
                                    z4 = z3;
                                }
                            }
                        }
                        z4 = z3;
                        z = z3 ? 1 : 0;
                        i4 = 1;
                        z2 = z;
                        break;
                    }
                    i4 = z3 ? 1 : 0;
                    z2 = i4 == true ? 1 : 0;
                    break;
                }
                char cCharAt = charSequence.charAt(i13);
                i12++;
                if (defpackage.anty.ai(cCharAt)) {
                    fArr[z3 ? 1 : 0] = fArr[z3 ? 1 : 0] + 0.5f;
                } else if (J(cCharAt)) {
                    fArr[z3 ? 1 : 0] = ((float) java.lang.Math.ceil(fArr[z3 ? 1 : 0])) + 2.0f;
                } else {
                    fArr[z3 ? 1 : 0] = ((float) java.lang.Math.ceil(fArr[z3 ? 1 : 0])) + f2;
                }
                boolean z5 = i4 == true ? 1 : 0;
                if (cCharAt == ' ' || (cCharAt >= '0' && cCharAt <= '9')) {
                    c = c3;
                } else {
                    c = c3;
                    if (cCharAt < 'A' || cCharAt > 'Z') {
                        if (J(cCharAt)) {
                            fArr[1] = fArr[1] + 2.6666667f;
                        } else {
                            fArr[1] = fArr[1] + 1.3333334f;
                        }
                    }
                    if (cCharAt != ' ' || ((cCharAt >= '0' && cCharAt <= '9') || (cCharAt >= 'a' && cCharAt <= 'z'))) {
                        fArr[c] = fArr[c] + 0.6666667f;
                    } else if (J(cCharAt)) {
                        fArr[c] = fArr[c] + 2.6666667f;
                    } else {
                        fArr[c] = fArr[c] + 1.3333334f;
                    }
                    if (L(cCharAt)) {
                        fArr[3] = fArr[3] + 0.6666667f;
                    } else if (J(cCharAt)) {
                        fArr[3] = fArr[3] + 4.3333335f;
                    } else {
                        fArr[3] = fArr[3] + 3.3333333f;
                    }
                    if (K(cCharAt)) {
                        fArr[4] = fArr[4] + 0.75f;
                    } else if (J(cCharAt)) {
                        fArr[4] = fArr[4] + 4.25f;
                    } else {
                        fArr[4] = fArr[4] + 3.25f;
                    }
                    fArr[z5 ? 1 : 0] = fArr[z5 ? 1 : 0] + f2;
                    if (i12 >= 4) {
                        java.util.Arrays.fill(bArr, z3 ? (byte) 1 : (byte) 0);
                        java.util.Arrays.fill(iArr, z3 ? 1 : 0);
                        W(fArr, iArr, bArr);
                        i5 = iArr[z3 ? 1 : 0];
                        i6 = iArr[z5 ? 1 : 0];
                        i7 = iArr[1];
                        i8 = iArr[c];
                        i9 = iArr[3];
                        z = z3 ? 1 : 0;
                        if (i5 < b(i6, i7, i8, i9, iArr[4])) {
                            i10 = iArr[z5 ? 1 : 0];
                            if (i10 < iArr[z ? 1 : 0] && i10 + 1 >= a(iArr[1], iArr[c], iArr[3], iArr[4])) {
                                if (iArr[4] + 1 >= b(iArr[z5 ? 1 : 0], iArr[1], iArr[c], iArr[3], iArr[z ? 1 : 0])) {
                                    if (iArr[c] + 1 >= b(iArr[z5 ? 1 : 0], iArr[1], iArr[4], iArr[3], iArr[z ? 1 : 0])) {
                                        if (iArr[3] + 1 >= b(iArr[z5 ? 1 : 0], iArr[1], iArr[4], iArr[c], iArr[z ? 1 : 0])) {
                                            if (iArr[1] + 1 < a(iArr[z ? 1 : 0], iArr[z5 ? 1 : 0], iArr[4], iArr[c])) {
                                                int i16 = iArr[1];
                                                int i17 = iArr[3];
                                                if (i16 >= i17) {
                                                    if (i16 == i17) {
                                                        int i18 = i11 + i12 + 1;
                                                        while (true) {
                                                            if (i18 < charSequence.length()) {
                                                                char cCharAt2 = charSequence.charAt(i18);
                                                                if (!c(cCharAt2)) {
                                                                    if (L(cCharAt2)) {
                                                                        i18++;
                                                                    }
                                                                }
                                                            }
                                                        }
                                                    }
                                                }
                                                i4 = 1;
                                                z2 = z;
                                                break;
                                            }
                                            continue;
                                        }
                                        i4 = 3;
                                        z2 = z;
                                        break;
                                    }
                                    i4 = c;
                                    z2 = z;
                                    break;
                                }
                                i4 = 4;
                                z2 = z;
                                break;
                            }
                            i4 = z5 ? 1 : 0;
                            z2 = z;
                            break;
                        }
                        i4 = z ? 1 : 0;
                        z2 = z;
                        break;
                    }
                    z = z3 ? 1 : 0;
                    f = f2;
                    z3 = z;
                    i4 = z5 ? 1 : 0;
                    c3 = c;
                    c2 = 6;
                }
                fArr[1] = fArr[1] + 0.6666667f;
                if (cCharAt != ' ') {
                    fArr[c] = fArr[c] + 0.6666667f;
                } else {
                    fArr[c] = fArr[c] + 0.6666667f;
                }
                if (L(cCharAt)) {
                    fArr[3] = fArr[3] + 0.6666667f;
                } else if (J(cCharAt)) {
                    fArr[3] = fArr[3] + 4.3333335f;
                } else {
                    fArr[3] = fArr[3] + 3.3333333f;
                }
                if (K(cCharAt)) {
                    fArr[4] = fArr[4] + 0.75f;
                } else if (J(cCharAt)) {
                    fArr[4] = fArr[4] + 4.25f;
                } else {
                    fArr[4] = fArr[4] + 3.25f;
                }
                fArr[z5 ? 1 : 0] = fArr[z5 ? 1 : 0] + f2;
                if (i12 >= 4) {
                    java.util.Arrays.fill(bArr, z3 ? (byte) 1 : (byte) 0);
                    java.util.Arrays.fill(iArr, z3 ? 1 : 0);
                    W(fArr, iArr, bArr);
                    i5 = iArr[z3 ? 1 : 0];
                    i6 = iArr[z5 ? 1 : 0];
                    i7 = iArr[1];
                    i8 = iArr[c];
                    i9 = iArr[3];
                    z = z3 ? 1 : 0;
                    if (i5 < b(i6, i7, i8, i9, iArr[4])) {
                        i10 = iArr[z5 ? 1 : 0];
                        if (i10 < iArr[z ? 1 : 0]) {
                        }
                        i4 = z5 ? 1 : 0;
                        z2 = z;
                        break;
                    }
                    i4 = z ? 1 : 0;
                    z2 = z;
                    break;
                }
                z = z3 ? 1 : 0;
                f = f2;
                z3 = z;
                i4 = z5 ? 1 : 0;
                c3 = c;
                c2 = 6;
            }
            if (i3 == 3) {
                if (i4 == 3) {
                    iMin2 = java.lang.Math.min(i11 + 3, charSequence.length());
                    while (i11 < iMin2) {
                        if (L(charSequence.charAt(i11))) {
                            return z2 ? 1 : 0;
                        }
                        i11++;
                    }
                    return 3;
                }
                return i4 == true ? 1 : 0;
            }
            if (i3 == 4 && i4 == 4) {
                iMin = java.lang.Math.min(i11 + 4, charSequence.length());
                while (i11 < iMin) {
                    if (!K(charSequence.charAt(i11))) {
                        return z2 ? 1 : 0;
                    }
                    i11++;
                }
                return 4;
            }
            return i4 == true ? 1 : 0;
        }
        i4 = i3;
        z4 = z3;
        z2 = z4;
        if (i3 == 3) {
            if (i4 == 3) {
                iMin2 = java.lang.Math.min(i11 + 3, charSequence.length());
                while (i11 < iMin2) {
                    if (L(charSequence.charAt(i11))) {
                        return z2 ? 1 : 0;
                    }
                    i11++;
                }
                return 3;
            }
            return i4 == true ? 1 : 0;
        }
        if (i3 == 4) {
            iMin = java.lang.Math.min(i11 + 4, charSequence.length());
            while (i11 < iMin) {
                if (!K(charSequence.charAt(i11))) {
                    return z2 ? 1 : 0;
                }
                i11++;
            }
            return 4;
        }
        return i4 == true ? 1 : 0;
    }

    public static void I(char c) {
        java.lang.String hexString = java.lang.Integer.toHexString(c);
        throw new java.lang.IllegalArgumentException("Illegal character: " + c + " (0x" + java.lang.String.valueOf("0000".substring(0, 4 - hexString.length())).concat(java.lang.String.valueOf(hexString)) + ')');
    }

    public static boolean J(char c) {
        return c >= 128 && c <= 255;
    }

    static boolean K(char c) {
        return c >= ' ' && c <= '^';
    }

    static boolean L(char c) {
        if (c(c) || c == ' ') {
            return true;
        }
        if (c < '0' || c > '9') {
            return c >= 'A' && c <= 'Z';
        }
        return true;
    }

    public static void M(int i2, int i3, int i4, int i5, java.lang.CharSequence charSequence, int i6, int i7, byte[] bArr) {
        if (i2 < 0) {
            i3 += 4 - ((i6 + 4) & 7);
            i2 += i6;
        }
        if (i3 < 0) {
            i2 += 4 - ((i7 + 4) & 7);
            i3 += i7;
        }
        bArr[(i2 * i7) + i3] = (charSequence.charAt(i4) & (1 << (8 - i5))) == 0 ? (byte) 0 : (byte) 1;
    }

    public static void N(int i2, int i3, int i4, java.lang.CharSequence charSequence, int i5, int i6, byte[] bArr) {
        int i7 = i2 - 2;
        int i8 = i3 - 2;
        M(i7, i8, i4, 1, charSequence, i5, i6, bArr);
        int i9 = i3 - 1;
        M(i7, i9, i4, 2, charSequence, i5, i6, bArr);
        int i10 = i2 - 1;
        M(i10, i8, i4, 3, charSequence, i5, i6, bArr);
        M(i10, i9, i4, 4, charSequence, i5, i6, bArr);
        M(i10, i3, i4, 5, charSequence, i5, i6, bArr);
        M(i2, i8, i4, 6, charSequence, i5, i6, bArr);
        M(i2, i9, i4, 7, charSequence, i5, i6, bArr);
        M(i2, i3, i4, 8, charSequence, i5, i6, bArr);
    }

    public static boolean O(int i2, int i3, int i4, byte[] bArr) {
        return bArr[(i3 * i4) + i2] < 0;
    }

    public static void P(int[] iArr, int i2, amvd amvdVar, java.util.List list) {
        amve amveVar;
        if (i2 == 0) {
            throw new java.lang.IllegalArgumentException("No error correction bytes");
        }
        int length = iArr.length - i2;
        if (length <= 0) {
            throw new java.lang.IllegalArgumentException("No data bytes provided");
        }
        int i3 = 1;
        if (i2 >= list.size()) {
            amve amveVar2 = (amve) list.get(list.size() - 1);
            int size = list.size();
            while (size <= i2) {
                amve amveVar3 = new amve(amvdVar, new int[]{i3, amvdVar.h[(size - 1) + amvdVar.l]});
                amvd amvdVar2 = amveVar2.a;
                if (!amvdVar2.equals(amveVar3.a)) {
                    throw new java.lang.IllegalArgumentException("GenericGFPolys do not have same GenericGF field");
                }
                if (amveVar2.e() || amveVar3.e()) {
                    amveVar2 = amvdVar2.j;
                } else {
                    int[] iArr2 = amveVar2.b;
                    int length2 = iArr2.length;
                    int[] iArr3 = amveVar3.b;
                    int length3 = iArr3.length;
                    int[] iArr4 = new int[(length2 + length3) - 1];
                    for (int i4 = 0; i4 < length2; i4++) {
                        int i5 = iArr2[i4];
                        int i6 = 0;
                        while (i6 < length3) {
                            int i7 = i4 + i6;
                            iArr4[i7] = iArr4[i7] ^ amvdVar2.a(i5, iArr3[i6]);
                            i6++;
                            iArr2 = iArr2;
                        }
                    }
                    amveVar2 = new amve(amvdVar2, iArr4);
                }
                list.add(amveVar2);
                size++;
                i3 = 1;
            }
        }
        amve amveVar4 = (amve) list.get(i2);
        int[] iArr5 = new int[length];
        java.lang.System.arraycopy(iArr, 0, iArr5, 0, length);
        amve amveVarD = new amve(amvdVar, iArr5).d(i2, 1);
        amvd amvdVar3 = amveVarD.a;
        if (!amvdVar3.equals(amveVar4.a)) {
            throw new java.lang.IllegalArgumentException("GenericGFPolys do not have same GenericGF field");
        }
        if (amveVar4.e()) {
            throw new java.lang.IllegalArgumentException("Divide by 0");
        }
        amve amveVar5 = amvdVar3.j;
        int iA = amveVar4.a(amveVar4.b());
        if (iA == 0) {
            throw new java.lang.ArithmeticException();
        }
        int i8 = amvdVar3.h[(amvdVar3.k - amvdVar3.i[iA]) - 1];
        amve amveVarC = amveVar5;
        while (amveVarD.b() >= amveVar4.b() && !amveVarD.e()) {
            int iB = amveVarD.b() - amveVar4.b();
            int iA2 = amvdVar3.a(amveVarD.a(amveVarD.b()), i8);
            amve amveVarD2 = amveVar4.d(iB, iA2);
            if (iB < 0) {
                throw new java.lang.IllegalArgumentException();
            }
            if (iA2 == 0) {
                amveVar = amveVar5;
            } else {
                int[] iArr6 = new int[iB + 1];
                iArr6[0] = iA2;
                amveVar = new amve(amvdVar3, iArr6);
            }
            amveVarC = amveVarC.c(amveVar);
            amveVarD = amveVarD.c(amveVarD2);
        }
        int[] iArr7 = amveVarD.b;
        int length4 = i2 - iArr7.length;
        for (int i9 = 0; i9 < length4; i9++) {
            iArr[length + i9] = 0;
        }
        java.lang.System.arraycopy(iArr7, 0, iArr, length + length4, iArr7.length);
    }

    public static int Q(int i2) {
        if (i2 != 1) {
            return i2 - 2;
        }
        throw new java.lang.IllegalArgumentException("Can't get the number of an unknown enum value.");
    }

    public static aogy R(aogy[] aogyVarArr, int i2) {
        return aogyVarArr[i2];
    }

    public static byte[][] S(int i2, int i3, aogy[] aogyVarArr, int i4, int i5) {
        int i6 = i4 * i3;
        byte[][] bArr = (byte[][]) java.lang.reflect.Array.newInstance((java.lang.Class<?>) java.lang.Byte.TYPE, i6, i5 * i2);
        for (int i7 = 0; i7 < i6; i7++) {
            int i8 = i6 - i7;
            byte[] bArr2 = (byte[]) aogyVarArr[i7 / i3].b;
            int length = bArr2.length * i2;
            byte[] bArr3 = new byte[length];
            for (int i9 = 0; i9 < length; i9++) {
                bArr3[i9] = bArr2[i9 / i2];
            }
            bArr[i8 - 1] = bArr3;
        }
        return bArr;
    }

    public static /* synthetic */ ajyi T(defpackage.akzx akzxVar) {
        defpackage.aooh.f(akzxVar, "builder");
        return new ajyi(akzxVar);
    }

    public static /* synthetic */ ajyi U(defpackage.akzx akzxVar) {
        defpackage.aooh.f(akzxVar, "builder");
        return new ajyi(akzxVar);
    }

    public static /* synthetic */ ajyi V(defpackage.akzx akzxVar) {
        defpackage.aooh.f(akzxVar, "builder");
        return new ajyi(akzxVar);
    }

    private static int W(float[] fArr, int[] iArr, byte[] bArr) {
        int i2 = Integer.MAX_VALUE;
        for (int i3 = 0; i3 < 6; i3++) {
            int iCeil = (int) java.lang.Math.ceil(fArr[i3]);
            iArr[i3] = iCeil;
            if (i2 > iCeil) {
                java.util.Arrays.fill(bArr, (byte) 0);
                i2 = iCeil;
            }
            if (i2 == iCeil) {
                bArr[i3] = (byte) (bArr[i3] + 1);
            }
        }
        return i2;
    }

    private static int a(int i2, int i3, int i4, int i5) {
        return java.lang.Math.min(i2, java.lang.Math.min(i3, java.lang.Math.min(i4, i5)));
    }

    private static int b(int i2, int i3, int i4, int i5, int i6) {
        return java.lang.Math.min(a(i2, i3, i4, i5), i6);
    }

    private static boolean c(char c) {
        return c == '\r' || c == '*' || c == '>';
    }

    public static anaq d(defpackage.anmc anmcVar) {
        return anaq.b(new ajeb(5), anmcVar);
    }

    public static /* synthetic */ java.lang.Object e(java.lang.Object obj) {
        return (defpackage.apga) defpackage.alad.y(defpackage.apga.a, (byte[]) obj);
    }

    public static /* synthetic */ int f(int i2) {
        switch (i2) {
            case 0:
                return 1;
            case 1:
                return 2;
            case 2:
                return 3;
            case 3:
                return 4;
            case 4:
                return 5;
            case 5:
                return 6;
            case defpackage.eft.STRING_SET_FIELD_NUMBER /* 6 */:
                return 7;
            case defpackage.eft.DOUBLE_FIELD_NUMBER /* 7 */:
                return 8;
            case defpackage.eft.BYTES_FIELD_NUMBER /* 8 */:
                return 9;
            case 9:
                return 10;
            case 10:
                return 11;
            case 11:
                return 12;
            case 12:
                return 13;
            case 13:
                return 14;
            case 14:
                return 15;
            default:
                return 0;
        }
    }

    public static /* synthetic */ double g(double d) {
        double d2 = d * d * d;
        return d2 <= 0.008856451679035631d ? ((d * 116.0d) - 16.0d) / 903.2962962962963d : d2;
    }

    public static /* synthetic */ boolean h(double d, double d2, double d3) {
        return ((d2 - d) + 25.132741228718345d) % 6.283185307179586d < ((d3 - d) + 25.132741228718345d) % 6.283185307179586d;
    }

    public static /* synthetic */ boolean i(double d) {
        return d >= 0.0d && d <= 100.0d;
    }

    public static /* synthetic */ double j(double d) {
        double d2 = d / 100.0d;
        return (d2 <= 0.0031308d ? d2 * 12.92d : (java.lang.Math.pow(d2, 0.4166666666666667d) * 1.055d) - 0.055d) * 255.0d;
    }

    public static /* synthetic */ int k(int i2) {
        switch (i2) {
            case 0:
                return 1;
            case 1:
                return 2;
            case 2:
                return 3;
            case 3:
                return 4;
            case 4:
                return 5;
            case 5:
                return 6;
            case defpackage.eft.STRING_SET_FIELD_NUMBER /* 6 */:
                return 7;
            case defpackage.eft.DOUBLE_FIELD_NUMBER /* 7 */:
                return 8;
            case defpackage.eft.BYTES_FIELD_NUMBER /* 8 */:
                return 9;
            case 9:
                return 10;
            case 10:
                return 11;
            case 11:
                return 12;
            case 12:
                return 13;
            case 13:
                return 14;
            case 14:
                return 15;
            case 15:
                return 16;
            case 16:
                return 17;
            case 17:
                return 18;
            case 18:
                return 19;
            case 19:
                return 20;
            case 20:
                return 21;
            case 21:
                return 22;
            case 22:
                return 23;
            case 23:
                return 24;
            case 24:
                return 25;
            case 25:
                return 26;
            case 26:
                return 27;
            default:
                return 0;
        }
    }

    public static /* synthetic */ int l(int i2) {
        switch (i2) {
            case 0:
                return 1;
            case 1:
                return 2;
            case 2:
                return 3;
            case 3:
                return 4;
            case 4:
                return 5;
            case 5:
                return 6;
            case defpackage.eft.STRING_SET_FIELD_NUMBER /* 6 */:
                return 7;
            case defpackage.eft.DOUBLE_FIELD_NUMBER /* 7 */:
                return 8;
            case defpackage.eft.BYTES_FIELD_NUMBER /* 8 */:
                return 9;
            case 9:
                return 10;
            case 10:
                return 11;
            case 11:
                return 12;
            case 12:
                return 13;
            case 13:
                return 14;
            case 14:
                return 15;
            case 15:
                return 16;
            default:
                return 0;
        }
    }

    public static /* synthetic */ alnm m(almy almyVar) {
        almz almzVar = almyVar.h;
        if (almzVar == null) {
            almzVar = almz.a;
        }
        defpackage.apdi apdiVar = alnm.i;
        almzVar.c(apdiVar);
        java.lang.Object objJ = almzVar.n.j((defpackage.alac) apdiVar.a);
        if (objJ == null) {
            objJ = apdiVar.b;
        } else {
            apdiVar.c(objJ);
        }
        return (alnm) objJ;
    }

    public static /* synthetic */ java.lang.String n(almz almzVar) {
        defpackage.apdi apdiVar = alol.f;
        almzVar.c(apdiVar);
        java.lang.Object objJ = almzVar.n.j((defpackage.alac) apdiVar.a);
        if (objJ == null) {
            objJ = apdiVar.b;
        } else {
            apdiVar.c(objJ);
        }
        alsw alswVar = ((alol) objJ).e;
        if (alswVar == null) {
            alswVar = alsw.a;
        }
        return (alswVar.b == 1 ? (alsn) alswVar.c : alsn.a).c;
    }

    public static /* synthetic */ java.lang.Object o(java.lang.Object obj) {
        defpackage.aooc.af(obj);
        return defpackage.aojh.a;
    }

    public static /* synthetic */ java.lang.Object q(java.lang.Object obj, java.lang.Object obj2) {
        defpackage.cav cavVar = (defpackage.cav) obj;
        int iIntValue = ((java.lang.Integer) obj2).intValue();
        int i2 = iIntValue & 3;
        if (cavVar.H(i2 != 2, iIntValue & 1)) {
            throw null;
        }
        cavVar.s();
        return defpackage.aojh.a;
    }

    public static /* synthetic */ defpackage.ajcq s(java.lang.Object obj) {
        java.util.List list = (java.util.List) obj;
        return zkb.b((java.util.Set) list.get(0), (defpackage.ajct) list.get(1));
    }

    public static /* synthetic */ defpackage.vcr t(vbw vbwVar) {
        defpackage.akzx akzxVarM = defpackage.vcr.a.m();
        defpackage.akzx akzxVarM2 = defpackage.vcp.a.m();
        akzxVarM2.u();
        defpackage.vcp vcpVar = (defpackage.vcp) akzxVarM2.b;
        vcpVar.c = java.lang.Integer.valueOf(vbwVar.a());
        vcpVar.b = 3;
        akzxVarM.u();
        defpackage.vcr vcrVar = (defpackage.vcr) akzxVarM.b;
        defpackage.vcp vcpVar2 = (defpackage.vcp) akzxVarM2.r();
        j$.util.Objects.requireNonNull(vcpVar2);
        vcrVar.c = vcpVar2;
        vcrVar.b = 2;
        return (defpackage.vcr) akzxVarM.r();
    }

    public static /* synthetic */ defpackage.ajcq u() {
        defpackage.akzx akzxVarM = ruy.a.m();
        ruw ruwVar = ruw.a;
        akzxVarM.u();
        ruy ruyVar = akzxVarM.b;
        j$.util.Objects.requireNonNull(ruwVar);
        ruyVar.c = ruwVar;
        ruyVar.b = 1;
        return defpackage.aiql.z(akzxVarM.r());
    }

    public static /* synthetic */ defpackage.ajcq v(java.lang.Object obj) {
        java.util.List list = (java.util.List) obj;
        android.content.Context context = (android.content.Context) list.get(0);
        defpackage.ipc ipcVar = (defpackage.ipc) list.get(1);
        defpackage.aooh.f(context, "appContext");
        defpackage.aooh.f(ipcVar, "inCallActivityIntent");
        return defpackage.aiql.z(afap.b(context, 0, ipcVar.bk(new otd(false, false, false, false, false, (qit) null, (abvz) null, (java.lang.String) null, (java.lang.Long) null, 511)), 67108864));
    }

    public static /* synthetic */ defpackage.ajcq w(defpackage.aigf aigfVar) {
        return aigfVar == null ? defpackage.ajcm.a : new defpackage.ajcm(aigfVar);
    }

    public static /* synthetic */ defpackage.ajcq x(java.lang.Object obj) {
        java.util.List list = (java.util.List) obj;
        boolean z = false;
        boolean zBooleanValue = ((java.lang.Boolean) list.get(0)).booleanValue();
        boolean zBooleanValue2 = ((java.lang.Boolean) list.get(1)).booleanValue();
        if (zBooleanValue && zBooleanValue2) {
            z = true;
        }
        return defpackage.aiql.z(java.lang.Boolean.valueOf(z));
    }

    public static /* synthetic */ defpackage.ajcq y(java.lang.Object obj) {
        java.util.List list = (java.util.List) obj;
        android.content.Context context = (android.content.Context) list.get(0);
        j$.util.Optional optional = (j$.util.Optional) list.get(1);
        j$.util.Optional optional2 = (j$.util.Optional) list.get(2);
        defpackage.rsr rsrVar = (defpackage.rsr) list.get(3);
        zna znaVar = (zna) list.get(4);
        defpackage.aooh.f(context, "appContext");
        defpackage.aooh.f(optional, "displayNumber");
        defpackage.aooh.f(optional2, "geoLocation");
        defpackage.aooh.f(rsrVar, "phoneNumberDisplayUtil");
        defpackage.aooh.f(znaVar, "callPresentation");
        j$.util.Optional optionalQ = rsrVar.q(znaVar);
        defpackage.aooh.e(optionalQ, "getNameForCallPresentation(...)");
        java.lang.String strCy = (java.lang.String) defpackage.aooh.q(optionalQ);
        if (strCy == null) {
            strCy = defpackage.afsq.cy(context, optional, optional2);
        }
        return defpackage.aiql.z(strCy);
    }

    public static /* synthetic */ defpackage.zjm z(defpackage.aoin aoinVar) {
        if (aoinVar == null) {
            defpackage.aooh.i("impl");
        }
        return new defpackage.zjm(aoinVar, (defpackage.zcs) new defpackage.vkc(2));
    }

    public anar(char[] cArr) {
    }
}
