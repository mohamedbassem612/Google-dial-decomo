package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes.dex */
public final class aiqz {
    public int a = 0;
    public int b = -1;
    protected final java.lang.Object[] c;
    public final java.lang.StringBuilder d;
    public int e;
    private final defpackage.aipn f;

    protected aiqz(defpackage.aipn aipnVar, java.lang.Object[] objArr, java.lang.StringBuilder sb) {
        defpackage.aiql.l(aipnVar, "context");
        this.f = aipnVar;
        this.e = 0;
        this.c = objArr;
        this.d = sb;
    }

    public static void c(java.lang.StringBuilder sb, java.lang.Object obj, java.lang.String str) {
        sb.append("[INVALID: format=");
        sb.append(str);
        sb.append(", type=");
        sb.append(obj.getClass().getCanonicalName());
        sb.append(", value=");
        sb.append(defpackage.aiop.b(obj));
        sb.append(']');
    }

    /* JADX WARN: Code duplicated, block: B:104:0x018b  */
    /* JADX WARN: Code duplicated, block: B:106:0x0193  */
    /* JADX WARN: Code duplicated, block: B:122:0x01be  */
    /* JADX WARN: Code duplicated, block: B:124:0x01c6  */
    /* JADX WARN: Code duplicated, block: B:126:0x01d8  */
    /* JADX WARN: Code duplicated, block: B:129:0x01e3  */
    /* JADX WARN: Code duplicated, block: B:132:0x0206  */
    /* JADX WARN: Code duplicated, block: B:134:0x020a  */
    /* JADX WARN: Code duplicated, block: B:135:0x020e  */
    /* JADX WARN: Code duplicated, block: B:136:0x0214  */
    /* JADX WARN: Code duplicated, block: B:144:0x0236  */
    /* JADX WARN: Code duplicated, block: B:146:0x023d  */
    /* JADX WARN: Code duplicated, block: B:148:0x0245 A[LOOP:4: B:80:0x0122->B:148:0x0245, LOOP_END] */
    /* JADX WARN: Code duplicated, block: B:155:0x025d A[LOOP:2: B:45:0x00a8->B:155:0x025d, LOOP_END] */
    /* JADX WARN: Code duplicated, block: B:188:0x0262 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:191:0x0258 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:192:0x0184 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:195:0x0231 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:196:0x022a A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:197:0x0223 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:198:0x0251 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:199:0x024a A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:205:0x011c A[ADDED_TO_REGION, REMOVE, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:208:0x00d9 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:210:0x0124 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:211:0x0133 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:47:0x00ae  */
    /* JADX WARN: Code duplicated, block: B:51:0x00c3  */
    /* JADX WARN: Code duplicated, block: B:52:0x00c5  */
    /* JADX WARN: Code duplicated, block: B:57:0x00d1 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:58:0x00d3  */
    /* JADX WARN: Code duplicated, block: B:59:0x00d5  */
    /* JADX WARN: Code duplicated, block: B:63:0x00e1  */
    /* JADX WARN: Code duplicated, block: B:65:0x00ef A[ADDED_TO_REGION] */
    /* JADX WARN: Code duplicated, block: B:79:0x0120  */
    /* JADX WARN: Code duplicated, block: B:82:0x012b  */
    /* JADX WARN: Code duplicated, block: B:87:0x0147  */
    /* JADX WARN: Code duplicated, block: B:94:0x0156  */
    /* JADX WARN: Code duplicated, block: B:96:0x0162  */
    /* JADX WARN: Code duplicated, block: B:98:0x0168  */
    public static void e(defpackage.aiom aiomVar, java.lang.StringBuilder sb) {
        java.lang.String strA;
        int i;
        char cCharAt;
        int i2;
        int i3;
        char cCharAt2;
        int i4;
        boolean z;
        int i5;
        defpackage.aioj aiojVar;
        int i6;
        int i7;
        char cCharAt3;
        char c;
        int i8;
        int i9;
        char cCharAt4;
        char c2;
        int i10;
        defpackage.aioi aioiVar;
        int i11;
        int i12;
        aiqt aiqtVar;
        defpackage.aiqw aiquVar;
        defpackage.aiqw aiqxVar;
        int i13;
        java.lang.StringBuilder sb2;
        java.lang.Object[] objArr;
        java.lang.Object obj;
        if (aiomVar.o() == null) {
            java.lang.Object objP = aiomVar.p();
            try {
                strA = defpackage.aiop.c(objP);
            } catch (java.lang.RuntimeException e) {
                strA = defpackage.aiop.a(objP, e);
            }
            sb.append(strA);
            return;
        }
        defpackage.aiqz aiqzVar = new defpackage.aiqz(aiomVar.o(), aiomVar.V(), sb);
        java.lang.String strB = aiqzVar.b();
        int i14 = 0;
        int iB = defpackage.airc.b(strB, 0);
        int i15 = -1;
        int i16 = 0;
        int i17 = -1;
        while (true) {
            int i18 = 1;
            if (iB < 0) {
                int i19 = aiqzVar.a;
                if (((i19 + 1) & i19) != 0 || (aiqzVar.b > 31 && i19 != -1)) {
                    throw new airb(java.lang.String.format("unreferenced arguments [first missing index=%d]", java.lang.Integer.valueOf(java.lang.Integer.numberOfTrailingZeros(~i19))));
                }
                defpackage.aira airaVarA = aiqzVar.a();
                java.lang.String strB2 = aiqzVar.b();
                int i20 = aiqzVar.e;
                int length = aiqzVar.b().length();
                java.lang.StringBuilder sb3 = aiqzVar.d;
                airaVarA.a(sb3, strB2, i20, length);
                if (aiomVar.V().length > aiqzVar.b + 1) {
                    sb3.append(" [ERROR: UNUSED LOG ARGUMENTS]");
                    return;
                }
                return;
            }
            int i21 = iB + 1;
            int i22 = i14;
            int i23 = i21;
            while (true) {
                if (i23 >= strB.length()) {
                    throw airb.c("unterminated parameter", strB, iB);
                }
                i = i23 + 1;
                cCharAt = strB.charAt(i23);
                char c3 = (char) (cCharAt - '0');
                if (c3 < '\n') {
                    i22 = (i22 * 10) + c3;
                    if (i22 >= 1000000) {
                        throw airb.b("index too large", strB, iB, i);
                    }
                    i23 = i;
                }
            }
            if (cCharAt != '$') {
                if (cCharAt != '<') {
                    i17 = i16;
                    i16++;
                } else {
                    if (i17 == i15) {
                        throw airb.b("invalid relative parameter", strB, iB, i);
                    }
                    if (i == strB.length()) {
                        throw airb.c("unterminated parameter", strB, iB);
                    }
                    i2 = i23 + 2;
                    strB.charAt(i);
                }
                i3 = i + i15;
                while (true) {
                    if (i3 < strB.length()) {
                        throw airb.c("unterminated parameter", strB, iB);
                    }
                    if (((char) ((strB.charAt(i3) & (-33)) - 65)) < 26) {
                        break;
                    }
                    i3++;
                    i15 = -1;
                }
                cCharAt2 = strB.charAt(i3);
                i4 = cCharAt2 & ' ';
                if (i4 == 0) {
                    z = true;
                } else {
                    z = false;
                }
                defpackage.aioj aiojVar2 = defpackage.aioj.a;
                if (i21 == i3 || z) {
                    if (true != z) {
                        i5 = 0;
                    } else {
                        i5 = 128;
                    }
                    while (true) {
                        if (i21 == i3) {
                            aiojVar = new defpackage.aioj(i5, i15, i15);
                        } else {
                            i6 = i18;
                            i7 = i21 + 1;
                            cCharAt3 = strB.charAt(i21);
                            c = '.';
                            if (cCharAt3 < ' ' && cCharAt3 <= '0') {
                                int iA = defpackage.aioj.a(cCharAt3);
                                if (iA < 0) {
                                    if (cCharAt3 != '.') {
                                        throw airb.a("invalid flag", strB, i21);
                                    }
                                    aiojVar = new defpackage.aioj(i5, -1, defpackage.aioj.b(strB, i7, i3));
                                    break;
                                } else {
                                    i10 = i6 << iA;
                                    if ((i5 & i10) != 0) {
                                        throw airb.a("repeated flag", strB, i21);
                                    }
                                    i5 |= i10;
                                    i21 = i7;
                                    i18 = i6;
                                    i15 = -1;
                                }
                            } else {
                                if (cCharAt3 > '9') {
                                    throw airb.a("invalid flag", strB, i21);
                                }
                                i8 = cCharAt3 - '0';
                                while (true) {
                                    if (i7 == i3) {
                                        aiojVar = new defpackage.aioj(i5, i8, -1);
                                        break;
                                    }
                                    i9 = i7 + 1;
                                    cCharAt4 = strB.charAt(i7);
                                    if (cCharAt4 == c) {
                                        aiojVar = new defpackage.aioj(i5, i8, defpackage.aioj.b(strB, i9, i3));
                                        break;
                                    }
                                    c2 = (char) (cCharAt4 - '0');
                                    if (c2 >= '\n') {
                                        throw airb.a("invalid width character", strB, i7);
                                    }
                                    i8 = (i8 * 10) + c2;
                                    if (i8 > 999999) {
                                        throw airb.b("width too large", strB, i21, i3);
                                    }
                                    i7 = i9;
                                    c = '.';
                                }
                            }
                        }
                    }
                    aioiVar = defpackage.aioi.k[(cCharAt2 | ' ') - 97];
                    if (i4 == 0 && (aioiVar == null || (aioiVar.n & 128) == 0)) {
                        aioiVar = null;
                    }
                    i11 = i3 + 1;
                    if (aioiVar != null) {
                        if (!aiojVar.e(aioiVar.n, aioiVar.m.f)) {
                            throw airb.b("invalid format specifier", strB, iB, i11);
                        }
                        java.util.Map map = defpackage.aiqw.c;
                        if (i17 < 10 || !aiojVar.c()) {
                            aiqxVar = new defpackage.aiqw(i17, aioiVar, aiojVar);
                            aiquVar = aiqxVar;
                        } else {
                            defpackage.aiqw[] aiqwVarArr = (defpackage.aiqw[]) defpackage.aiqw.c.get(aioiVar);
                            defpackage.aiql.l(aiqwVarArr, "default parameter");
                            aiquVar = aiqwVarArr[i17];
                        }
                    } else if (cCharAt2 != 't' || cCharAt2 == 'T') {
                        if (!aiojVar.e(160, false)) {
                            throw airb.b("invalid format specification", strB, iB, i11);
                        }
                        i12 = i3 + 2;
                        if (i12 > strB.length()) {
                            throw airb.a("truncated format specifier", strB, iB);
                        }
                        aiqtVar = (aiqt) aiqt.F.get(java.lang.Character.valueOf(strB.charAt(i11)));
                        if (aiqtVar == null) {
                            throw airb.a("illegal date/time conversion", strB, i11);
                        }
                        aiquVar = new aiqu(aiojVar, i17, aiqtVar);
                        i11 = i12;
                    } else {
                        if (cCharAt2 != 'h' && cCharAt2 != 'H') {
                            throw airb.b("invalid format specification", strB, iB, i11);
                        }
                        if (!aiojVar.e(160, false)) {
                            throw airb.b("invalid format specification", strB, iB, i11);
                        }
                        aiqxVar = new aiqx(aiojVar, i17);
                        aiquVar = aiqxVar;
                    }
                    i13 = aiquVar.a;
                    if (i13 < 32) {
                        aiqzVar.a |= i6 << i13;
                    }
                    aiqzVar.b = java.lang.Math.max(aiqzVar.b, i13);
                    defpackage.aira airaVarA2 = aiqzVar.a();
                    java.lang.String strB3 = aiqzVar.b();
                    int i24 = aiqzVar.e;
                    sb2 = aiqzVar.d;
                    airaVarA2.a(sb2, strB3, i24, iB);
                    objArr = aiqzVar.c;
                    if (i13 < objArr.length) {
                        obj = objArr[i13];
                        if (obj != null) {
                            aiquVar.a(aiqzVar, obj);
                        } else {
                            sb2.append("null");
                        }
                    } else {
                        sb2.append("[ERROR: MISSING LOG ARGUMENT]");
                    }
                    aiqzVar.e = i11;
                    iB = defpackage.airc.b(strB, i11);
                    i14 = 0;
                    i15 = -1;
                } else {
                    aiojVar = defpackage.aioj.a;
                }
                i6 = i18;
                aioiVar = defpackage.aioi.k[(cCharAt2 | ' ') - 97];
                if (i4 == 0) {
                    aioiVar = null;
                }
                i11 = i3 + 1;
                if (aioiVar != null) {
                    if (cCharAt2 != 't') {
                    }
                    if (!aiojVar.e(160, false)) {
                        throw airb.b("invalid format specification", strB, iB, i11);
                    }
                    i12 = i3 + 2;
                    if (i12 > strB.length()) {
                        throw airb.a("truncated format specifier", strB, iB);
                    }
                    aiqtVar = (aiqt) aiqt.F.get(java.lang.Character.valueOf(strB.charAt(i11)));
                    if (aiqtVar == null) {
                        throw airb.a("illegal date/time conversion", strB, i11);
                    }
                    aiquVar = new aiqu(aiojVar, i17, aiqtVar);
                    i11 = i12;
                } else {
                    if (!aiojVar.e(aioiVar.n, aioiVar.m.f)) {
                        throw airb.b("invalid format specifier", strB, iB, i11);
                    }
                    java.util.Map map2 = defpackage.aiqw.c;
                    if (i17 < 10) {
                    }
                    aiqxVar = new defpackage.aiqw(i17, aioiVar, aiojVar);
                    aiquVar = aiqxVar;
                }
                i13 = aiquVar.a;
                if (i13 < 32) {
                    aiqzVar.a |= i6 << i13;
                }
                aiqzVar.b = java.lang.Math.max(aiqzVar.b, i13);
                defpackage.aira airaVarA3 = aiqzVar.a();
                java.lang.String strB4 = aiqzVar.b();
                int i25 = aiqzVar.e;
                sb2 = aiqzVar.d;
                airaVarA3.a(sb2, strB4, i25, iB);
                objArr = aiqzVar.c;
                if (i13 < objArr.length) {
                    obj = objArr[i13];
                    if (obj != null) {
                        aiquVar.a(aiqzVar, obj);
                    } else {
                        sb2.append("null");
                    }
                } else {
                    sb2.append("[ERROR: MISSING LOG ARGUMENT]");
                }
                aiqzVar.e = i11;
                iB = defpackage.airc.b(strB, i11);
                i14 = 0;
                i15 = -1;
            } else {
                if (i23 - i21 == 0) {
                    throw airb.b("missing index", strB, iB, i);
                }
                if (strB.charAt(i21) == '0') {
                    throw airb.b("index has leading zero", strB, iB, i);
                }
                int i26 = i22 - 1;
                if (i == strB.length()) {
                    throw airb.c("unterminated parameter", strB, iB);
                }
                i2 = i23 + 2;
                strB.charAt(i);
                i17 = i26;
            }
            i21 = i;
            i = i2;
            i3 = i + i15;
            while (true) {
                if (i3 < strB.length()) {
                    throw airb.c("unterminated parameter", strB, iB);
                }
                if (((char) ((strB.charAt(i3) & (-33)) - 65)) < 26) {
                    break;
                }
                i3++;
                i15 = -1;
            }
            cCharAt2 = strB.charAt(i3);
            i4 = cCharAt2 & ' ';
            if (i4 == 0) {
                z = true;
            } else {
                z = false;
            }
            defpackage.aioj aiojVar3 = defpackage.aioj.a;
            if (i21 == i3) {
                if (true != z) {
                    i5 = 0;
                } else {
                    i5 = 128;
                }
                while (true) {
                    if (i21 == i3) {
                        aiojVar = new defpackage.aioj(i5, i15, i15);
                        i6 = i18;
                        break;
                    }
                    i6 = i18;
                    i7 = i21 + 1;
                    cCharAt3 = strB.charAt(i21);
                    c = '.';
                    if (cCharAt3 < ' ') {
                    }
                    if (cCharAt3 > '9') {
                        throw airb.a("invalid flag", strB, i21);
                    }
                    i8 = cCharAt3 - '0';
                    while (true) {
                        if (i7 == i3) {
                            aiojVar = new defpackage.aioj(i5, i8, -1);
                            break;
                        }
                        i9 = i7 + 1;
                        cCharAt4 = strB.charAt(i7);
                        if (cCharAt4 == c) {
                            aiojVar = new defpackage.aioj(i5, i8, defpackage.aioj.b(strB, i9, i3));
                            break;
                        }
                        c2 = (char) (cCharAt4 - '0');
                        if (c2 >= '\n') {
                            throw airb.a("invalid width character", strB, i7);
                        }
                        i8 = (i8 * 10) + c2;
                        if (i8 > 999999) {
                            throw airb.b("width too large", strB, i21, i3);
                        }
                        i7 = i9;
                        c = '.';
                    }
                    i5 |= i10;
                    i21 = i7;
                    i18 = i6;
                    i15 = -1;
                }
            } else {
                if (true != z) {
                    i5 = 0;
                } else {
                    i5 = 128;
                }
                while (true) {
                    if (i21 == i3) {
                        aiojVar = new defpackage.aioj(i5, i15, i15);
                        i6 = i18;
                        break;
                    }
                    i6 = i18;
                    i7 = i21 + 1;
                    cCharAt3 = strB.charAt(i21);
                    c = '.';
                    if (cCharAt3 < ' ') {
                    }
                    if (cCharAt3 > '9') {
                        throw airb.a("invalid flag", strB, i21);
                    }
                    i8 = cCharAt3 - '0';
                    while (true) {
                        if (i7 == i3) {
                            aiojVar = new defpackage.aioj(i5, i8, -1);
                            break;
                        }
                        i9 = i7 + 1;
                        cCharAt4 = strB.charAt(i7);
                        if (cCharAt4 == c) {
                            aiojVar = new defpackage.aioj(i5, i8, defpackage.aioj.b(strB, i9, i3));
                            break;
                        }
                        c2 = (char) (cCharAt4 - '0');
                        if (c2 >= '\n') {
                            throw airb.a("invalid width character", strB, i7);
                        }
                        i8 = (i8 * 10) + c2;
                        if (i8 > 999999) {
                            throw airb.b("width too large", strB, i21, i3);
                        }
                        i7 = i9;
                        c = '.';
                    }
                    i5 |= i10;
                    i21 = i7;
                    i18 = i6;
                    i15 = -1;
                }
            }
            aioiVar = defpackage.aioi.k[(cCharAt2 | ' ') - 97];
            if (i4 == 0) {
                aioiVar = null;
            }
            i11 = i3 + 1;
            if (aioiVar != null) {
                if (cCharAt2 != 't') {
                }
                if (!aiojVar.e(160, false)) {
                    throw airb.b("invalid format specification", strB, iB, i11);
                }
                i12 = i3 + 2;
                if (i12 > strB.length()) {
                    throw airb.a("truncated format specifier", strB, iB);
                }
                aiqtVar = (aiqt) aiqt.F.get(java.lang.Character.valueOf(strB.charAt(i11)));
                if (aiqtVar == null) {
                    throw airb.a("illegal date/time conversion", strB, i11);
                }
                aiquVar = new aiqu(aiojVar, i17, aiqtVar);
                i11 = i12;
            } else {
                if (!aiojVar.e(aioiVar.n, aioiVar.m.f)) {
                    throw airb.b("invalid format specifier", strB, iB, i11);
                }
                java.util.Map map3 = defpackage.aiqw.c;
                if (i17 < 10) {
                }
                aiqxVar = new defpackage.aiqw(i17, aioiVar, aiojVar);
                aiquVar = aiqxVar;
            }
            i13 = aiquVar.a;
            if (i13 < 32) {
                aiqzVar.a |= i6 << i13;
            }
            aiqzVar.b = java.lang.Math.max(aiqzVar.b, i13);
            defpackage.aira airaVarA4 = aiqzVar.a();
            java.lang.String strB5 = aiqzVar.b();
            int i27 = aiqzVar.e;
            sb2 = aiqzVar.d;
            airaVarA4.a(sb2, strB5, i27, iB);
            objArr = aiqzVar.c;
            if (i13 < objArr.length) {
                obj = objArr[i13];
                if (obj != null) {
                    aiquVar.a(aiqzVar, obj);
                } else {
                    sb2.append("null");
                }
            } else {
                sb2.append("[ERROR: MISSING LOG ARGUMENT]");
            }
            aiqzVar.e = i11;
            iB = defpackage.airc.b(strB, i11);
            i14 = 0;
            i15 = -1;
        }
    }

    public final defpackage.aira a() {
        return this.f.a;
    }

    public final java.lang.String b() {
        return this.f.b;
    }

    /* JADX WARN: Code duplicated, block: B:102:0x0129  */
    /* JADX WARN: Code duplicated, block: B:104:0x012f  */
    /* JADX WARN: Code duplicated, block: B:30:0x003d  */
    /* JADX WARN: Code duplicated, block: B:37:0x004b  */
    /* JADX WARN: Code duplicated, block: B:61:0x0090  */
    public final void d(java.lang.Object obj, defpackage.aioi aioiVar, defpackage.aioj aiojVar) {
        java.lang.String strA;
        defpackage.aioj aiojVar2;
        boolean zIsValidCodePoint;
        int iOrdinal = aioiVar.m.ordinal();
        if (iOrdinal != 0) {
            if (iOrdinal == 1) {
                zIsValidCodePoint = obj instanceof java.lang.Boolean;
            } else if (iOrdinal != 2) {
                if (iOrdinal != 3) {
                    if (iOrdinal != 4) {
                        throw null;
                    }
                    if ((obj instanceof java.lang.Double) || (obj instanceof java.lang.Float) || (obj instanceof java.math.BigDecimal)) {
                        zIsValidCodePoint = true;
                    } else {
                        zIsValidCodePoint = false;
                    }
                } else if ((obj instanceof java.lang.Integer) || (obj instanceof java.lang.Long) || (obj instanceof java.lang.Byte) || (obj instanceof java.lang.Short) || (obj instanceof java.math.BigInteger)) {
                    zIsValidCodePoint = true;
                } else {
                    zIsValidCodePoint = false;
                }
            } else if (obj instanceof java.lang.Character) {
                zIsValidCodePoint = true;
            } else if ((obj instanceof java.lang.Integer) || (obj instanceof java.lang.Byte) || (obj instanceof java.lang.Short)) {
                zIsValidCodePoint = java.lang.Character.isValidCodePoint(((java.lang.Number) obj).intValue());
            } else {
                zIsValidCodePoint = false;
            }
            if (!zIsValidCodePoint) {
                c(this.d, obj, aioiVar.o);
                return;
            }
        }
        java.lang.StringBuilder sb = this.d;
        int iOrdinal2 = aioiVar.ordinal();
        if (iOrdinal2 != 0) {
            if (iOrdinal2 == 1) {
                if (aiojVar.c()) {
                    sb.append(obj);
                    return;
                }
            } else if (iOrdinal2 != 2) {
                if (iOrdinal2 != 3) {
                    if (iOrdinal2 == 5) {
                        if (aiojVar.c()) {
                            aiojVar2 = aiojVar;
                        } else {
                            int i = aiojVar.b;
                            int i2 = i & 128;
                            if (i2 == 0) {
                                aiojVar2 = defpackage.aioj.a;
                            } else if (i2 == i && aiojVar.c == -1 && aiojVar.d == -1) {
                                aiojVar2 = aiojVar;
                            } else {
                                aiojVar2 = new defpackage.aioj(i2, -1, -1);
                            }
                        }
                        if (aiojVar2.equals(aiojVar)) {
                            java.lang.Number number = (java.lang.Number) obj;
                            boolean zD = aiojVar.d();
                            long jLongValue = number.longValue();
                            if (number instanceof java.lang.Long) {
                                defpackage.aiop.d(sb, jLongValue, zD);
                                return;
                            }
                            if (number instanceof java.lang.Integer) {
                                defpackage.aiop.d(sb, jLongValue & 4294967295L, zD);
                                return;
                            }
                            if (number instanceof java.lang.Byte) {
                                defpackage.aiop.d(sb, jLongValue & 255, zD);
                                return;
                            }
                            if (number instanceof java.lang.Short) {
                                defpackage.aiop.d(sb, jLongValue & 65535, zD);
                                return;
                            } else {
                                if (!(number instanceof java.math.BigInteger)) {
                                    throw new java.lang.IllegalStateException("unsupported number type: ".concat(java.lang.String.valueOf(java.lang.String.valueOf(number.getClass()))));
                                }
                                java.lang.String string = ((java.math.BigInteger) number).toString(16);
                                if (zD) {
                                    string = string.toUpperCase(defpackage.aiop.a);
                                }
                                sb.append(string);
                                return;
                            }
                        }
                    }
                } else if (aiojVar.c()) {
                    sb.append(obj);
                    return;
                }
            } else if (aiojVar.c()) {
                if (obj instanceof java.lang.Character) {
                    sb.append(obj);
                    return;
                }
                int iIntValue = ((java.lang.Number) obj).intValue();
                if ((iIntValue >>> 16) == 0) {
                    sb.append((char) iIntValue);
                    return;
                } else {
                    sb.append(java.lang.Character.toChars(iIntValue));
                    return;
                }
            }
        } else {
            if (obj instanceof java.util.Formattable) {
                java.util.Formattable formattable = (java.util.Formattable) obj;
                int i3 = aiojVar.b;
                int i4 = i3 & 162;
                if (i4 != 0) {
                    i4 = ((i3 & 32) == 0 ? 0 : 1) | ((i3 & 128) != 0 ? 2 : 0) | ((i3 & 2) == 0 ? 0 : 4);
                }
                int length = sb.length();
                java.util.Formatter formatter = new java.util.Formatter(sb, defpackage.aiop.a);
                try {
                    formattable.formatTo(formatter, i4, aiojVar.c, aiojVar.d);
                    return;
                } catch (java.lang.RuntimeException e) {
                    sb.setLength(length);
                    try {
                        formatter.out().append(defpackage.aiop.a(formattable, e));
                        return;
                    } catch (java.io.IOException unused) {
                        return;
                    }
                }
            }
            if (aiojVar.c()) {
                try {
                    strA = defpackage.aiop.c(obj);
                } catch (java.lang.RuntimeException e2) {
                    strA = defpackage.aiop.a(obj, e2);
                }
                sb.append(strA);
                return;
            }
        }
        java.lang.String string2 = aioiVar.o;
        if (!aiojVar.c()) {
            int i5 = aioiVar.l;
            if (aiojVar.d()) {
                i5 &= 65503;
            }
            java.lang.StringBuilder sb2 = new java.lang.StringBuilder("%");
            aiojVar.f(sb2);
            sb2.append((char) i5);
            string2 = sb2.toString();
        }
        sb.append(java.lang.String.format(defpackage.aiop.a, string2, obj));
    }
}
