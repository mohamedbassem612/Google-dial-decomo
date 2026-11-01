package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes4.dex */
public final class amwl implements defpackage.amur {
    /* JADX WARN: Code duplicated, block: B:25:0x0046  */
    /* JADX WARN: Code duplicated, block: B:28:0x004f  */
    /* JADX WARN: Code duplicated, block: B:308:0x00e9 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:30:0x0057  */
    /* JADX WARN: Code duplicated, block: B:33:0x005d  */
    /* JADX WARN: Code duplicated, block: B:35:0x0063  */
    /* JADX WARN: Code duplicated, block: B:382:0x0067 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:383:0x006a A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:39:0x006c A[EDGE_INSN: B:39:0x006c->B:43:0x0076 BREAK  A[LOOP:26: B:26:0x0049->B:36:0x0064]] */
    /* JADX WARN: Code duplicated, block: B:40:0x006f A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:41:0x0071 A[EDGE_INSN: B:41:0x0071->B:43:0x0076 BREAK  A[LOOP:26: B:26:0x0049->B:36:0x0064]] */
    /* JADX WARN: Code duplicated, block: B:42:0x0074 A[EDGE_INSN: B:42:0x0074->B:43:0x0076 BREAK  A[LOOP:26: B:26:0x0049->B:36:0x0064]] */
    /* JADX WARN: Code duplicated, block: B:67:0x00d8 A[LOOP:1: B:53:0x00a8->B:67:0x00d8, LOOP_END] */
    @Override // defpackage.amur
    public final defpackage.amvb a(java.lang.String str, defpackage.amun amunVar, int i) throws defpackage.amus {
        int i2;
        boolean z;
        boolean z2;
        defpackage.amwn amwnVar;
        char cCharAt;
        int i3;
        int i4;
        int i5;
        int i6;
        int i7;
        int i8;
        if (str.isEmpty()) {
            throw new java.lang.IllegalArgumentException("Found empty contents");
        }
        if (amunVar != defpackage.amun.l) {
            throw new java.lang.IllegalArgumentException("Can only encode QR_CODE, but got ".concat(amunVar.toString()));
        }
        if (i < 0) {
            throw new java.lang.IllegalArgumentException(a.bs(i, "Requested dimensions are too small: ", "x1"));
        }
        defpackage.amwm amwmVar = defpackage.amwm.L;
        java.nio.charset.Charset charset = defpackage.amws.a;
        java.nio.charset.Charset charset2 = defpackage.amvc.a;
        int i9 = -1;
        if (charset2 != null && charset2.equals(charset)) {
            byte[] bytes = str.getBytes(charset2);
            int length = bytes.length;
            if ((length & 1) != 0) {
                i2 = 0;
                z = false;
                z2 = false;
                while (true) {
                    if (i2 >= str.length()) {
                        if (!z) {
                            if (!z2) {
                                amwnVar = defpackage.amwn.BYTE;
                                break;
                            }
                            amwnVar = defpackage.amwn.NUMERIC;
                            break;
                        }
                        amwnVar = defpackage.amwn.ALPHANUMERIC;
                        break;
                    }
                    cCharAt = str.charAt(i2);
                    if (cCharAt < '0') {
                        if (defpackage.amws.b(cCharAt) == -1) {
                            amwnVar = defpackage.amwn.BYTE;
                            break;
                        }
                        z = true;
                    } else {
                        if (defpackage.amws.b(cCharAt) == -1) {
                            amwnVar = defpackage.amwn.BYTE;
                            break;
                        }
                        z = true;
                    }
                    i2++;
                }
            } else {
                int i10 = 0;
                while (true) {
                    if (i10 >= length) {
                        amwnVar = defpackage.amwn.KANJI;
                    } else {
                        int i11 = bytes[i10] & 255;
                        if ((i11 < 129 || i11 > 159) && (i11 < 224 || i11 > 235)) {
                            i2 = 0;
                            z = false;
                            z2 = false;
                            while (true) {
                                if (i2 >= str.length()) {
                                    if (!z) {
                                        if (!z2) {
                                            amwnVar = defpackage.amwn.BYTE;
                                            break;
                                        }
                                        amwnVar = defpackage.amwn.NUMERIC;
                                        break;
                                    }
                                    amwnVar = defpackage.amwn.ALPHANUMERIC;
                                    break;
                                }
                                cCharAt = str.charAt(i2);
                                if (cCharAt < '0') {
                                    if (defpackage.amws.b(cCharAt) == -1) {
                                        amwnVar = defpackage.amwn.BYTE;
                                        break;
                                    }
                                    z = true;
                                } else {
                                    if (defpackage.amws.b(cCharAt) == -1) {
                                        amwnVar = defpackage.amwn.BYTE;
                                        break;
                                    }
                                    z = true;
                                }
                                i2++;
                            }
                        } else {
                            i10 += 2;
                        }
                    }
                }
            }
        } else {
            i2 = 0;
            z = false;
            z2 = false;
            while (true) {
                if (i2 >= str.length()) {
                    if (!z) {
                        if (!z2) {
                            amwnVar = defpackage.amwn.BYTE;
                            break;
                        }
                        amwnVar = defpackage.amwn.NUMERIC;
                        break;
                    }
                    amwnVar = defpackage.amwn.ALPHANUMERIC;
                    break;
                }
                cCharAt = str.charAt(i2);
                if (cCharAt < '0' && cCharAt <= '9') {
                    z2 = true;
                } else {
                    if (defpackage.amws.b(cCharAt) == -1) {
                        amwnVar = defpackage.amwn.BYTE;
                        break;
                    }
                    z = true;
                }
                i2++;
            }
        }
        defpackage.amva amvaVar = new defpackage.amva();
        amvaVar.d(amwnVar.k, 4);
        defpackage.amva amvaVar2 = new defpackage.amva();
        int iOrdinal = amwnVar.ordinal();
        char c = '\n';
        char c2 = 2;
        int i12 = 1;
        if (iOrdinal == 1) {
            int length2 = str.length();
            int i13 = 0;
            while (i13 < length2) {
                int i14 = i13 + 1;
                int iCharAt = str.charAt(i13) - '0';
                int i15 = i13 + 2;
                if (i15 < length2) {
                    amvaVar2.d((iCharAt * 100) + ((str.charAt(i14) - '0') * 10) + (str.charAt(i15) - '0'), 10);
                    i13 += 3;
                } else if (i14 < length2) {
                    amvaVar2.d((iCharAt * 10) + (str.charAt(i14) - '0'), 7);
                    i13 = i15;
                } else {
                    amvaVar2.d(iCharAt, 4);
                    i13 = i14;
                }
            }
        } else if (iOrdinal == 2) {
            int length3 = str.length();
            int i16 = 0;
            while (i16 < length3) {
                int iB = defpackage.amws.b(str.charAt(i16));
                if (iB == -1) {
                    throw new defpackage.amus();
                }
                int i17 = i16 + 1;
                if (i17 < length3) {
                    int iB2 = defpackage.amws.b(str.charAt(i17));
                    if (iB2 == -1) {
                        throw new defpackage.amus();
                    }
                    amvaVar2.d((iB * 45) + iB2, 11);
                    i16 += 2;
                } else {
                    amvaVar2.d(iB, 6);
                    i16 = i17;
                }
            }
        } else if (iOrdinal == 4) {
            for (byte b : str.getBytes(charset)) {
                amvaVar2.d(b, 8);
            }
        } else {
            if (iOrdinal != 6) {
                throw new defpackage.amus("Invalid mode: ".concat(amwnVar.toString()));
            }
            if (charset2 == null) {
                throw new defpackage.amus("SJIS Charset not supported on this platform");
            }
            byte[] bytes2 = str.getBytes(charset2);
            int length4 = bytes2.length;
            if ((length4 & 1) != 0) {
                throw new defpackage.amus("Kanji byte size not even");
            }
            int i18 = length4 - 1;
            int i19 = 0;
            while (i19 < i18) {
                char c3 = c2;
                int i20 = ((bytes2[i19] & 255) << 8) | (bytes2[i19 + 1] & 255);
                if (i20 < 33088 || i20 > 40956) {
                    if (i20 < 57408 || i20 > 60351) {
                        i7 = -1;
                    } else {
                        i8 = -49472;
                    }
                    if (i7 != -1) {
                        throw new defpackage.amus("Invalid byte sequence");
                    }
                    amvaVar2.d(((i7 >> 8) * 192) + (i7 & 255), 13);
                    i19 += 2;
                    c2 = c3;
                } else {
                    i8 = -33088;
                }
                i7 = i20 + i8;
                if (i7 != -1) {
                    throw new defpackage.amus("Invalid byte sequence");
                }
                amvaVar2.d(((i7 >> 8) * 192) + (i7 & 255), 13);
                i19 += 2;
                c2 = c3;
            }
        }
        defpackage.amwq amwqVarC = defpackage.amws.c(defpackage.amws.a(amwnVar, amvaVar, amvaVar2, defpackage.amws.c(defpackage.amws.a(amwnVar, amvaVar, amvaVar2, defpackage.amwq.b(1)), amwmVar)), amwmVar);
        defpackage.amva amvaVar3 = new defpackage.amva();
        amvaVar3.c(amvaVar);
        int iA = amwnVar == defpackage.amwn.BYTE ? amvaVar2.a() : str.length();
        int iA2 = amwnVar.a(amwqVarC);
        int i21 = 1 << iA2;
        if (iA >= i21) {
            java.lang.StringBuilder sb = new java.lang.StringBuilder();
            sb.append(iA);
            sb.append(" is bigger than ");
            sb.append(i21 - 1);
            throw new defpackage.amus(sb.toString());
        }
        amvaVar3.d(iA, iA2);
        amvaVar3.c(amvaVar2);
        amwp amwpVarA = amwqVarC.a(amwmVar);
        int i22 = amwqVarC.b;
        int iB3 = i22 - amwpVarA.b();
        int i23 = amvaVar3.b;
        int i24 = iB3 << 3;
        if (i23 > i24) {
            throw new defpackage.amus("data bits cannot fit in the QR Code" + i23 + " > " + i24);
        }
        for (int i25 = 0; i25 < 4 && amvaVar3.b < i24; i25++) {
            amvaVar3.b(false);
        }
        int i26 = amvaVar3.b & 7;
        if (i26 > 0) {
            while (i26 < 8) {
                amvaVar3.b(false);
                i26++;
            }
        }
        int iA3 = iB3 - amvaVar3.a();
        int i27 = 0;
        while (i27 < iA3) {
            amvaVar3.d(i12 != (i27 & 1) ? 236 : 17, 8);
            i27++;
            i12 = 1;
        }
        if (amvaVar3.b != i24) {
            throw new defpackage.amus("Bits size does not equal capacity");
        }
        int iA4 = amwpVarA.a();
        if (amvaVar3.a() != iB3) {
            throw new defpackage.amus("Number of bits and data bytes does not match");
        }
        java.util.ArrayList arrayList = new java.util.ArrayList(iA4);
        int i28 = 0;
        int i29 = 0;
        int iMax = 0;
        int iMax2 = 0;
        while (true) {
            int i30 = i9;
            if (i28 >= iA4) {
                if (iB3 != i29) {
                    throw new defpackage.amus("Data bytes does not match offset");
                }
                defpackage.amva amvaVar4 = new defpackage.amva();
                for (int i31 = 0; i31 < iMax; i31++) {
                    int size = arrayList.size();
                    for (int i32 = 0; i32 < size; i32++) {
                        byte[] bArr = (byte[]) ((defpackage.apjb) arrayList.get(i32)).b;
                        if (i31 < bArr.length) {
                            amvaVar4.d(bArr[i31], 8);
                        }
                    }
                }
                for (int i33 = 0; i33 < iMax2; i33++) {
                    int size2 = arrayList.size();
                    for (int i34 = 0; i34 < size2; i34++) {
                        byte[] bArr2 = (byte[]) ((defpackage.apjb) arrayList.get(i34)).a;
                        if (i33 < bArr2.length) {
                            amvaVar4.d(bArr2[i33], 8);
                        }
                    }
                }
                if (i22 != amvaVar4.a()) {
                    throw new defpackage.amus("Interleaving error: " + i22 + " and " + amvaVar4.a() + " differ.");
                }
                int i35 = (amwqVarC.a << 2) + 17;
                defpackage.amwr amwrVar = new defpackage.amwr(i35, i35);
                int i36 = Integer.MAX_VALUE;
                int i37 = i30;
                int i38 = 0;
                while (i38 < 8) {
                    defpackage.amwt.b(amvaVar4, amwmVar, amwqVarC, i38, amwrVar);
                    int i39 = 0;
                    int iB4 = anar.B(amwrVar, true) + anar.B(amwrVar, false);
                    byte[][] bArr3 = amwrVar.a;
                    int i40 = amwrVar.b;
                    int i41 = amwrVar.c;
                    int i42 = 0;
                    int i43 = 0;
                    while (i42 < i41 - 1) {
                        int i44 = i42 + 1;
                        byte[] bArr4 = bArr3[i42];
                        int i45 = i43;
                        int i46 = i39;
                        while (i46 < i40 - 1) {
                            byte b2 = bArr4[i46];
                            int i47 = i46 + 1;
                            if (b2 == bArr4[i47]) {
                                byte[] bArr5 = bArr3[i44];
                                if (b2 == bArr5[i46] && b2 == bArr5[i47]) {
                                    i45++;
                                }
                            }
                            i46 = i47;
                        }
                        i42 = i44;
                        i43 = i45;
                        i39 = 0;
                    }
                    int i48 = iB4 + (i43 * 3);
                    int i49 = 0;
                    int i50 = 0;
                    while (i49 < i41) {
                        int i51 = 0;
                        while (true) {
                            i3 = i49 + 1;
                            if (i51 < i40) {
                                int i52 = i51 + 1;
                                int i53 = i48;
                                byte[] bArr6 = bArr3[i49];
                                int i54 = i50;
                                int i55 = i51 + 6;
                                if (i55 < i40) {
                                    i4 = i38;
                                    if (bArr6[i51] == 1 && bArr6[i52] == 0 && bArr6[i51 + 2] == 1 && bArr6[i51 + 3] == 1 && bArr6[i51 + 4] == 1 && bArr6[i51 + 5] == 0 && bArr6[i55] == 1 && (anar.C(bArr6, i51 - 4, i51) || anar.C(bArr6, i51 + 7, i51 + 11))) {
                                        i50 = i54 + 1;
                                    }
                                    i5 = i49 + 6;
                                    if (i5 >= i41 && bArr3[i49][i51] == 1 && bArr3[i3][i51] == 0 && bArr3[i49 + 2][i51] == 1 && bArr3[i49 + 3][i51] == 1 && bArr3[i49 + 4][i51] == 1 && bArr3[i49 + 5][i51] == 0 && bArr3[i5][i51] == 1 && (anar.D(bArr3, i51, i49 - 4, i49) || anar.D(bArr3, i51, i49 + 7, i49 + 11))) {
                                        i50++;
                                    }
                                    i48 = i53;
                                    i51 = i52;
                                    i38 = i4;
                                } else {
                                    i4 = i38;
                                }
                                i50 = i54;
                                i5 = i49 + 6;
                                if (i5 >= i41) {
                                }
                                i48 = i53;
                                i51 = i52;
                                i38 = i4;
                            }
                        }
                        i49 = i3;
                    }
                    int i56 = i38;
                    int i57 = i48 + (i50 * 40);
                    int i58 = 0;
                    for (int i59 = 0; i59 < i41; i59++) {
                        byte[] bArr7 = bArr3[i59];
                        for (int i60 = 0; i60 < i40; i60++) {
                            if (bArr7[i60] == 1) {
                                i58++;
                            }
                        }
                    }
                    int i61 = i41 * i40;
                    int iAbs = i57 + (((java.lang.Math.abs((i58 << 1) - i61) * 10) / i61) * 10);
                    if (iAbs < i36) {
                        i36 = iAbs;
                        i37 = i56;
                    }
                    i38 = i56 + 1;
                }
                defpackage.amwt.b(amvaVar4, amwmVar, amwqVarC, i37, amwrVar);
                int i62 = amwrVar.b;
                int i63 = i62 + 8;
                int i64 = amwrVar.c;
                int i65 = i64 + 8;
                int iMax3 = java.lang.Math.max(i, i63);
                int iMax4 = java.lang.Math.max(1, i65);
                int iMin = java.lang.Math.min(iMax3 / i63, iMax4 / i65);
                int i66 = (iMax3 - (i62 * iMin)) / 2;
                int i67 = (iMax4 - (i64 * iMin)) / 2;
                defpackage.amvb amvbVar = new defpackage.amvb(iMax3, iMax4);
                int i68 = 0;
                while (i68 < i64) {
                    int i69 = i66;
                    int i70 = 0;
                    while (i70 < i62) {
                        if (amwrVar.a(i70, i68) == 1) {
                            amvbVar.c(i69, i67, iMin, iMin);
                        }
                        i70++;
                        i69 += iMin;
                    }
                    i68++;
                    i67 += iMin;
                }
                return amvbVar;
            }
            int[] iArr = new int[1];
            char c4 = c;
            int[] iArr2 = new int[1];
            if (i28 >= iA4) {
                throw new defpackage.amus("Block ID too large");
            }
            int i71 = i22 % iA4;
            int i72 = iA4 - i71;
            int i73 = i22 / iA4;
            int i74 = iB3 / iA4;
            int i75 = i74 + 1;
            int i76 = i73 - i74;
            int i77 = (i73 + 1) - i75;
            if (i76 != i77) {
                throw new defpackage.amus("EC bytes mismatch");
            }
            if (iA4 != i72 + i71) {
                throw new defpackage.amus("RS blocks mismatch");
            }
            if (i22 != ((i74 + i76) * i72) + ((i75 + i77) * i71)) {
                throw new defpackage.amus("Total bytes mismatch");
            }
            if (i28 < i72) {
                iArr[0] = i74;
                iArr2[0] = i76;
            } else {
                iArr[0] = i75;
                iArr2[0] = i77;
            }
            int i78 = iArr[0];
            byte[] bArr8 = new byte[i78];
            int i79 = i29 << 3;
            int i80 = 0;
            while (true) {
                i6 = iA4;
                if (i80 >= i78) {
                    break;
                }
                int i81 = i80;
                int[] iArr3 = iArr2;
                int i82 = i79;
                int i83 = i28;
                int i84 = 0;
                for (int i85 = 0; i85 < 8; i85++) {
                    if (amvaVar3.e(i82)) {
                        i84 |= 1 << (7 - i85);
                    }
                    i82++;
                }
                bArr8[i81] = (byte) i84;
                i28 = i83;
                iArr2 = iArr3;
                i79 = i82;
                i80 = i81 + 1;
                iA4 = i6;
            }
            int i86 = i28;
            int i87 = iArr2[0];
            int[] iArr4 = new int[i78 + i87];
            for (int i88 = 0; i88 < i78; i88++) {
                iArr4[i88] = bArr8[i88] & 255;
            }
            defpackage.amvd amvdVar = defpackage.amvd.e;
            java.util.ArrayList arrayList2 = new java.util.ArrayList();
            defpackage.amva amvaVar5 = amvaVar3;
            arrayList2.add(new defpackage.amve(amvdVar, new int[]{1}));
            anar.P(iArr4, i87, amvdVar, arrayList2);
            byte[] bArr9 = new byte[i87];
            for (int i89 = 0; i89 < i87; i89++) {
                bArr9[i89] = (byte) iArr4[i78 + i89];
            }
            arrayList.add(new defpackage.apjb(bArr8, bArr9, (byte[]) null));
            iMax = java.lang.Math.max(iMax, i78);
            iMax2 = java.lang.Math.max(iMax2, i87);
            i29 += iArr[0];
            i28 = i86 + 1;
            i9 = i30;
            c = c4;
            iA4 = i6;
            amvaVar3 = amvaVar5;
        }
    }
}
