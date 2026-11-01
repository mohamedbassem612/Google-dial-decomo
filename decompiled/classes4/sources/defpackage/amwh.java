package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes4.dex */
public final class amwh implements defpackage.amur {
    private static byte[][] b(byte[][] bArr) {
        byte[][] bArr2 = (byte[][]) java.lang.reflect.Array.newInstance((java.lang.Class<?>) java.lang.Byte.TYPE, bArr[0].length, bArr.length);
        int i = 0;
        while (true) {
            int length = bArr.length;
            if (i >= length) {
                return bArr2;
            }
            int i2 = length - i;
            for (int i3 = 0; i3 < bArr[0].length; i3++) {
                bArr2[i3][i2 - 1] = bArr[i][i3];
            }
            i++;
        }
    }

    private static defpackage.amvb c(byte[][] bArr) {
        defpackage.amvb amvbVar = new defpackage.amvb(bArr[0].length + 60, bArr.length + 60);
        amvbVar.a();
        int i = amvbVar.b - 31;
        int i2 = 0;
        while (i2 < bArr.length) {
            byte[] bArr2 = bArr[i2];
            for (int i3 = 0; i3 < bArr[0].length; i3++) {
                if (bArr2[i3] == 1) {
                    amvbVar.b(i3 + 30, i);
                }
            }
            i2++;
            i--;
        }
        return amvbVar;
    }

    /* JADX WARN: Code duplicated, block: B:280:0x02c7 A[EDGE_INSN: B:280:0x02c7->B:154:0x02c7 BREAK  A[LOOP:5: B:98:0x01d7->B:301:0x01d7], SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:303:0x01d7 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:92:0x01ba  */
    @Override // defpackage.amur
    public final defpackage.amvb a(java.lang.String str, defpackage.amun amunVar, int i) throws defpackage.amus {
        char c;
        char c2;
        int i2;
        boolean z;
        int i3;
        int i4;
        int i5;
        int i6;
        if (amunVar != defpackage.amun.k) {
            throw new java.lang.IllegalArgumentException("Can only encode PDF_417, but got ".concat(amunVar.toString()));
        }
        int[][] iArr = defpackage.amwi.a;
        int[][] iArr2 = defpackage.amwj.a;
        byte[] bArr = defpackage.amwk.a;
        if (str.isEmpty()) {
            throw new defpackage.amus("Empty message not allowed");
        }
        int i7 = 0;
        for (int i8 = 0; i8 < str.length(); i8++) {
            if (str.charAt(i8) > 255) {
                throw new defpackage.amus("Non-encodable character detected: " + str.charAt(i8) + " (Unicode: " + ((int) str.charAt(i8)) + ") at position #" + i8 + " - Consider specifying EncodeHintType.PDF417_AUTO_ECI and/or EncodeTypeHint.CHARACTER_SET");
            }
        }
        java.lang.StringBuilder sb = new java.lang.StringBuilder(str.length());
        java.nio.charset.Charset charset = defpackage.amwk.c;
        int iF = anar.F(str);
        int i9 = 0;
        int i10 = 0;
        char c3 = 0;
        while (i9 < iF && i9 < iF) {
            int iF2 = anar.F(str);
            if (i9 < iF2) {
                int i11 = i7;
                for (int i12 = i9; i12 < iF2 && anty.ai(anar.E(i12, str)); i12++) {
                    i11++;
                }
                i5 = i11;
            } else {
                i5 = i7;
            }
            if (i5 >= 13) {
                sb.append((char) 902);
                java.lang.StringBuilder sb2 = new java.lang.StringBuilder((i5 / 3) + 1);
                java.math.BigInteger bigIntegerValueOf = java.math.BigInteger.valueOf(900L);
                java.math.BigInteger bigIntegerValueOf2 = java.math.BigInteger.valueOf(0L);
                int i13 = i7;
                while (i13 < i5) {
                    sb2.setLength(i7);
                    int i14 = i9 + i13;
                    int iMin = java.lang.Math.min(44, i5 - i13);
                    java.math.BigInteger bigInteger = new java.math.BigInteger("1".concat(java.lang.String.valueOf(java.lang.String.valueOf(anar.G(i14, i14 + iMin, str)))));
                    do {
                        sb2.append((char) bigInteger.mod(bigIntegerValueOf).intValue());
                        bigInteger = bigInteger.divide(bigIntegerValueOf);
                    } while (!bigInteger.equals(bigIntegerValueOf2));
                    for (int length = sb2.length() - 1; length >= 0; length--) {
                        sb.append(sb2.charAt(length));
                    }
                    i13 += iMin;
                    i7 = 0;
                }
                i9 += i5;
                i7 = 0;
                i10 = 2;
                c3 = 0;
            } else {
                int iF3 = anar.F(str);
                int i15 = i9;
                while (true) {
                    if (i15 < iF3) {
                        int i16 = 0;
                        while (i16 < 13 && i15 < iF3 && anty.ai(anar.E(i15, str))) {
                            i15++;
                            i16++;
                        }
                        if (i16 >= 13) {
                            i6 = (i15 - i9) - i16;
                            break;
                        }
                        if (i16 <= 0) {
                            char cE = anar.E(i15, str);
                            if (cE == '\t' || cE == '\n' || cE == '\r' || (cE >= ' ' && cE <= '~')) {
                                i15++;
                            }
                        }
                    }
                    i6 = i15 - i9;
                    break;
                }
                if (i6 >= 5 || i5 == iF) {
                    if (i10 != 0) {
                        sb.append((char) 900);
                        c3 = 0;
                    }
                    java.lang.StringBuilder sb3 = new java.lang.StringBuilder(i6);
                    int i17 = 0;
                    while (true) {
                        int i18 = i9 + i17;
                        char cE2 = anar.E(i18, str);
                        if (c3 == 0) {
                            if (defpackage.amwk.b(cE2)) {
                                if (cE2 == ' ') {
                                    sb3.append((char) 26);
                                } else {
                                    sb3.append((char) (cE2 - 'A'));
                                }
                            } else if (defpackage.amwk.a(cE2)) {
                                sb3.append((char) 27);
                                c3 = 1;
                            } else if (defpackage.amwk.c(cE2)) {
                                sb3.append((char) 28);
                                c3 = 2;
                            } else {
                                sb3.append((char) 29);
                                sb3.append((char) defpackage.amwk.b[cE2]);
                            }
                            i17++;
                            if (i17 >= i6) {
                                break;
                                break;
                            }
                        } else {
                            if (c3 != 1) {
                                if (c3 != 2) {
                                    if (defpackage.amwk.d(cE2)) {
                                        sb3.append((char) defpackage.amwk.b[cE2]);
                                    } else {
                                        sb3.append((char) 29);
                                        c3 = 0;
                                    }
                                } else if (defpackage.amwk.c(cE2)) {
                                    sb3.append((char) defpackage.amwk.a[cE2]);
                                } else if (defpackage.amwk.b(cE2)) {
                                    sb3.append((char) 28);
                                    c3 = 0;
                                } else if (defpackage.amwk.a(cE2)) {
                                    sb3.append((char) 27);
                                    c3 = 1;
                                } else {
                                    int i19 = i18 + 1;
                                    if (i19 >= i6 || !defpackage.amwk.d(anar.E(i19, str))) {
                                        sb3.append((char) 29);
                                        sb3.append((char) defpackage.amwk.b[cE2]);
                                    } else {
                                        sb3.append((char) 25);
                                        c3 = 3;
                                    }
                                }
                            } else if (defpackage.amwk.a(cE2)) {
                                if (cE2 == ' ') {
                                    sb3.append((char) 26);
                                } else {
                                    sb3.append((char) (cE2 - 'a'));
                                }
                            } else if (defpackage.amwk.b(cE2)) {
                                sb3.append((char) 27);
                                sb3.append((char) (cE2 - 'A'));
                            } else if (defpackage.amwk.c(cE2)) {
                                sb3.append((char) 28);
                                c3 = 2;
                            } else {
                                sb3.append((char) 29);
                                sb3.append((char) defpackage.amwk.b[cE2]);
                            }
                            i17++;
                            if (i17 >= i6) {
                                break;
                            }
                        }
                    }
                    int length2 = sb3.length();
                    char cCharAt = 0;
                    for (int i20 = 0; i20 < length2; i20++) {
                        if (i20 % 2 != 0) {
                            cCharAt = (char) ((cCharAt * 30) + sb3.charAt(i20));
                            sb.append(cCharAt);
                        } else {
                            cCharAt = sb3.charAt(i20);
                        }
                    }
                    if (length2 % 2 != 0) {
                        sb.append((char) ((cCharAt * 30) + 29));
                    }
                    i9 += i6;
                    i7 = 0;
                    i10 = 0;
                } else {
                    java.nio.charset.CharsetEncoder charsetEncoderNewEncoder = charset == null ? null : charset.newEncoder();
                    int iF4 = anar.F(str);
                    int i21 = i9;
                    while (i21 < iF4) {
                        int i22 = i21;
                        int i23 = 0;
                        while (i23 < 13 && anty.ai(anar.E(i22, str))) {
                            i23++;
                            i22 = i21 + i23;
                            if (i22 >= iF4) {
                                break;
                            }
                        }
                        if (i23 >= 13) {
                            break;
                        }
                        if (charsetEncoderNewEncoder != null && !charsetEncoderNewEncoder.canEncode(anar.E(i21, str))) {
                            char cE3 = anar.E(i21, str);
                            throw new defpackage.amus("Non-encodable character detected: " + cE3 + " (Unicode: " + ((int) cE3) + ')');
                        }
                        i21++;
                    }
                    int i24 = i21 - i9;
                    if (i24 == 0) {
                        i24 = 1;
                    }
                    byte[] bytes = anar.G(i9, i9 + i24, str).toString().getBytes(charset);
                    if (bytes == null) {
                        if (i24 == 1) {
                            i24 = 1;
                            if (i10 == 0) {
                                defpackage.amwk.e(bytes, 1, 0, sb);
                            }
                        }
                        i9 += i24;
                        i7 = 0;
                    } else {
                        if (bytes.length == 1) {
                            if (i10 == 0) {
                                defpackage.amwk.e(bytes, 1, 0, sb);
                            }
                        }
                        i9 += i24;
                        i7 = 0;
                    }
                    defpackage.amwk.e(bytes, bytes.length, i10, sb);
                    i10 = 1;
                    c3 = 0;
                    i9 += i24;
                    i7 = 0;
                }
            }
        }
        java.lang.String string = sb.toString();
        int length3 = string.length();
        float f = 0.0f;
        int i25 = 2;
        int i26 = 2;
        int[] iArr3 = null;
        while (true) {
            if (i25 > 30) {
                i25 = i26;
                break;
            }
            int iA = defpackage.amwi.a(length3, i25);
            if (iA < 2) {
                break;
            }
            if (iA <= 30) {
                float f2 = iA;
                float f3 = (((i25 * 17) + 69) * 0.357f) / (f2 + f2);
                if (iArr3 == null || java.lang.Math.abs(f3 - 3.0f) <= java.lang.Math.abs((-3.0f) + f)) {
                    iArr3 = new int[]{i25, iA};
                    f = f3;
                }
            }
            i26 = i25;
            i25++;
        }
        if (iArr3 != null || defpackage.amwi.a(length3, i25) >= 2) {
            c = 0;
            c2 = 1;
        } else {
            c = 0;
            c2 = 1;
            iArr3 = new int[]{2, 2};
        }
        if (iArr3 == null) {
            throw new defpackage.amus("Unable to fit message in columns");
        }
        int i27 = iArr3[c];
        int i28 = iArr3[c2];
        int i29 = (i27 * i28) - 8;
        int i30 = i29 > length3 + 1 ? (i29 - length3) - 1 : 0;
        if (length3 + 9 > 929) {
            throw new defpackage.amus("Encoded message contains too many code words, message too big (" + str.length() + " bytes)");
        }
        int i31 = length3 + i30 + 1;
        java.lang.StringBuilder sb4 = new java.lang.StringBuilder(i31);
        sb4.append((char) i31);
        sb4.append(string);
        for (int i32 = 0; i32 < i30; i32++) {
            sb4.append((char) 900);
        }
        java.lang.String string2 = sb4.toString();
        char[] cArr = new char[8];
        int length4 = string2.length();
        int i33 = 0;
        while (true) {
            i2 = 7;
            if (i33 >= length4) {
                break;
            }
            int iCharAt = (string2.charAt(i33) + cArr[7]) % 929;
            while (i2 > 0) {
                int i34 = i2 - 1;
                cArr[i2] = (char) ((cArr[i34] + (929 - ((defpackage.amwj.a[2][i2] * iCharAt) % 929))) % 929);
                i2 = i34;
            }
            cArr[0] = (char) ((929 - ((iCharAt * defpackage.amwj.a[2][0]) % 929)) % 929);
            i33++;
        }
        java.lang.StringBuilder sb5 = new java.lang.StringBuilder(8);
        while (i2 >= 0) {
            char c4 = cArr[i2];
            if (c4 != 0) {
                c4 = (char) (929 - c4);
                cArr[i2] = c4;
            }
            sb5.append(c4);
            i2--;
        }
        java.lang.String string3 = sb5.toString();
        aogy[] aogyVarArr = new aogy[i28];
        for (int i35 = 0; i35 < i28; i35++) {
            aogyVarArr[i35] = new aogy(((i27 + 4) * 17) + 1);
        }
        int i36 = i27 * 17;
        java.lang.String strConcat = string2.concat(string3);
        int i37 = -1;
        int i38 = 0;
        for (int i39 = 0; i39 < i28; i39++) {
            int i40 = i28 - 1;
            int i41 = i39 % 3;
            i37++;
            defpackage.amwi.b(130728, 17, anar.R(aogyVarArr, i37));
            if (i41 == 0) {
                int i42 = (i39 / 3) * 30;
                i4 = (i27 - 1) + i42;
                i3 = i42 + (i40 / 3);
            } else if (i41 == 1) {
                int i43 = (i39 / 3) * 30;
                i4 = i43 + (i40 / 3);
                i3 = i43 + 6 + (i40 % 3);
            } else {
                int i44 = (i39 / 3) * 30;
                int i45 = (i40 % 3) + i44 + 6;
                i3 = i44 + (i27 - 1);
                i4 = i45;
            }
            int[][] iArr4 = defpackage.amwi.a;
            defpackage.amwi.b(iArr4[i41][i3], 17, anar.R(aogyVarArr, i37));
            for (int i46 = 0; i46 < i27; i46++) {
                defpackage.amwi.b(iArr4[i41][strConcat.charAt(i38)], 17, anar.R(aogyVarArr, i37));
                i38++;
            }
            defpackage.amwi.b(iArr4[i41][i4], 17, anar.R(aogyVarArr, i37));
            defpackage.amwi.b(260649, 18, anar.R(aogyVarArr, i37));
        }
        byte[][] bArrS = anar.S(1, 4, aogyVarArr, i28, i36);
        if ((i <= 0) != (bArrS[0].length < bArrS.length)) {
            bArrS = b(bArrS);
            z = true;
        } else {
            z = false;
        }
        int iMin2 = java.lang.Math.min(i / bArrS[0].length, 1 / bArrS.length);
        if (iMin2 <= 1) {
            return c(bArrS);
        }
        byte[][] bArrS2 = anar.S(iMin2, iMin2 << 2, aogyVarArr, i28, i36);
        if (z) {
            bArrS2 = b(bArrS2);
        }
        return c(bArrS2);
    }
}
