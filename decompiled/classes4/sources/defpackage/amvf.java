package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes4.dex */
public final class amvf implements defpackage.amur {
    /* JADX WARN: Multi-variable type inference failed */
    @Override // defpackage.amur
    public final defpackage.amvb a(java.lang.String str, defpackage.amun amunVar, int i) {
        byte b;
        int i2;
        int i3;
        byte[] bArr;
        int i4;
        int i5;
        int i6;
        if (str.isEmpty()) {
            throw new java.lang.IllegalArgumentException("Found empty contents");
        }
        if (amunVar != defpackage.amun.f) {
            throw new java.lang.IllegalArgumentException("Can only encode DATA_MATRIX, but got ".concat(amunVar.toString()));
        }
        if (i < 0) {
            throw new java.lang.IllegalArgumentException(a.bs(i, "Requested dimensions can't be negative: ", "x1"));
        }
        byte b2 = 1;
        defpackage.amvj[] amvjVarArr = {new defpackage.amvg(1), new defpackage.amvh(), new defpackage.amvn(), new defpackage.amvo(), new defpackage.amvg(2), new defpackage.amvg(0)};
        defpackage.amvk amvkVar = new defpackage.amvk(str);
        if (str.startsWith("[)>\u001e05\u001d") && str.endsWith("\u001e\u0004")) {
            amvkVar.g((char) 236);
            amvkVar.j();
            amvkVar.c += 7;
        } else if (str.startsWith("[)>\u001e06\u001d") && str.endsWith("\u001e\u0004")) {
            amvkVar.g((char) 237);
            amvkVar.j();
            amvkVar.c += 7;
        }
        int i7 = 0;
        while (amvkVar.i()) {
            amvjVarArr[i7].a(amvkVar);
            int i8 = amvkVar.d;
            if (i8 >= 0) {
                amvkVar.d = -1;
                i7 = i8;
            }
        }
        int iB = amvkVar.b();
        amvkVar.e();
        int i9 = amvkVar.e.b;
        if (iB < i9 && i7 != 0 && i7 != 5 && i7 != 4) {
            amvkVar.g((char) 254);
        }
        java.lang.StringBuilder sb = amvkVar.b;
        if (sb.length() < i9) {
            sb.append((char) 129);
        }
        while (sb.length() < i9) {
            int length = ((sb.length() + 1) * 149) % 253;
            int i10 = length + 130;
            if (i10 > 254) {
                i10 = length - 124;
            }
            sb.append((char) i10);
        }
        java.lang.String string = sb.toString();
        int length2 = string.length();
        int length3 = string.length();
        defpackage.amvm amvmVarG = defpackage.amvm.g(length2);
        int i11 = amvmVarG.b;
        int i12 = defpackage.amvl.a;
        if (length3 != i11) {
            throw new java.lang.IllegalArgumentException("The number of codewords does not match the selected symbol");
        }
        int i13 = amvmVarG.c;
        java.lang.StringBuilder sb2 = new java.lang.StringBuilder(i11 + i13);
        sb2.append(string);
        int iB2 = amvmVarG.b();
        if (iB2 == 1) {
            sb2.append(defpackage.amvl.a(string, i13));
        } else {
            sb2.setLength(sb2.capacity());
            int[] iArr = new int[iB2];
            int[] iArr2 = new int[iB2];
            int i14 = 0;
            while (i14 < iB2) {
                int i15 = i14 + 1;
                iArr[i14] = amvmVarG.a(i15);
                iArr2[i14] = amvmVarG.f;
                i14 = i15;
            }
            int i16 = 0;
            while (i16 < iB2) {
                java.lang.StringBuilder sb3 = new java.lang.StringBuilder(iArr[i16]);
                for (int i17 = i16; i17 < i11; i17 += iB2) {
                    sb3.append(string.charAt(i17));
                }
                java.lang.String strA = defpackage.amvl.a(sb3.toString(), iArr2[i16]);
                int i18 = i16;
                int i19 = 0;
                while (true) {
                    b = b2;
                    if (i18 < iArr2[i16] * iB2) {
                        sb2.setCharAt(i11 + i18, strA.charAt(i19));
                        i18 += iB2;
                        b2 = b;
                        i19++;
                    }
                }
                i16++;
                b2 = b;
            }
        }
        byte b3 = b2;
        java.lang.String string2 = sb2.toString();
        int iD = amvmVarG.d();
        int i20 = iD - 1;
        int iC = amvmVarG.c();
        int i21 = iC - 1;
        byte[] bArr2 = new byte[iD * iC];
        java.util.Arrays.fill(bArr2, (byte) -1);
        int i22 = 4;
        int i23 = 0;
        int i24 = 0;
        while (true) {
            i2 = iC - 2;
            if (i22 == iC && i23 == 0) {
                i3 = iC;
                bArr = bArr2;
                anar.M(i21, 0, i24, 1, string2, i3, iD, bArr);
                anar.M(i21, 1, i24, 2, string2, i3, iD, bArr);
                anar.M(i21, 2, i24, 3, string2, i3, iD, bArr);
                anar.M(0, iD - 2, i24, 4, string2, i3, iD, bArr);
                int i25 = i20;
                anar.M(0, i25, i24, 5, string2, i3, iD, bArr);
                anar.M(1, i25, i24, 6, string2, i3, iD, bArr);
                anar.M(2, i25, i24, 7, string2, i3, iD, bArr);
                anar.M(3, i25, i24, 8, string2, i3, iD, bArr);
                i24++;
                i23 = 0;
            } else {
                i3 = iC;
                bArr = bArr2;
            }
            if (i22 == i2 && i23 == 0) {
                if ((iD & 3) != 0) {
                    anar.M(i3 - 3, 0, i24, 1, string2, i3, iD, bArr);
                    anar.M(i2, 0, i24, 2, string2, i3, iD, bArr);
                    anar.M(i21, 0, i24, 3, string2, i3, iD, bArr);
                    anar.M(0, iD - 4, i24, 4, string2, i3, iD, bArr);
                    anar.M(0, iD - 3, i24, 5, string2, i3, iD, bArr);
                    anar.M(0, iD - 2, i24, 6, string2, i3, iD, bArr);
                    int i26 = i20;
                    anar.M(0, i26, i24, 7, string2, i3, iD, bArr);
                    anar.M(1, i26, i24, 8, string2, i3, iD, bArr);
                    i24++;
                }
                i23 = 0;
            }
            if (i22 == i2 && i23 == 0 && (iD & 7) == 4) {
                anar.M(i3 - 3, 0, i24, 1, string2, i3, iD, bArr);
                anar.M(i2, 0, i24, 2, string2, i3, iD, bArr);
                anar.M(i21, 0, i24, 3, string2, i3, iD, bArr);
                anar.M(0, iD - 2, i24, 4, string2, i3, iD, bArr);
                int i27 = i20;
                anar.M(0, i27, i24, 5, string2, i3, iD, bArr);
                anar.M(1, i27, i24, 6, string2, i3, iD, bArr);
                anar.M(2, i27, i24, 7, string2, i3, iD, bArr);
                anar.M(3, i27, i24, 8, string2, i3, iD, bArr);
                i24++;
            }
            if (i22 == i3 + 4 && i23 == 2 && (iD & 7) == 0) {
                int i28 = iD - 2;
                int i29 = iD - 3;
                int i30 = i21;
                anar.M(i30, 0, i24, 1, string2, i3, iD, bArr);
                anar.M(i30, i20, i24, 2, string2, i3, iD, bArr);
                anar.M(0, i29, i24, 3, string2, i3, iD, bArr);
                anar.M(0, i28, i24, 4, string2, i3, iD, bArr);
                anar.M(0, i20, i24, 5, string2, i3, iD, bArr);
                anar.M(1, i29, i24, 6, string2, i3, iD, bArr);
                anar.M(1, i28, i24, 7, string2, i3, iD, bArr);
                int i31 = i20;
                anar.M(1, i31, i24, 8, string2, i3, iD, bArr);
                i4 = i31;
                i24++;
            } else {
                i4 = i20;
            }
            while (true) {
                if (i22 >= i3 || i23 < 0 || !anar.O(i23, i22, iD, bArr)) {
                    i5 = i3;
                } else {
                    int i32 = iD;
                    byte[] bArr3 = bArr;
                    java.lang.String str2 = string2;
                    int i33 = i3;
                    anar.N(i22, i23, i24, str2, i33, i32, bArr3);
                    bArr = bArr3;
                    i5 = i33;
                    string2 = str2;
                    i24++;
                }
                int i34 = i22 - 2;
                int i35 = i23 + 2;
                if (i34 < 0 || i35 >= iD) {
                    break;
                }
                i22 = i34;
                i23 = i35;
                i3 = i5;
            }
            int i36 = i22 - 1;
            int i37 = i23 + 5;
            while (true) {
                if (i36 < 0 || i37 >= iD || !anar.O(i37, i36, iD, bArr)) {
                    i6 = i5;
                } else {
                    byte[] bArr4 = bArr;
                    java.lang.String str3 = string2;
                    int i38 = i5;
                    anar.N(i36, i37, i24, str3, i38, iD, bArr4);
                    i6 = i38;
                    bArr = bArr4;
                    string2 = str3;
                    i24++;
                }
                int i39 = i36 + 2;
                int i40 = i37 - 2;
                if (i39 >= i6 || i40 < 0) {
                    break;
                }
                i36 = i39;
                i5 = i6;
                i37 = i40;
            }
            i22 = i36 + 5;
            i23 = i37 - 1;
            if (i22 >= i6 && i23 >= iD) {
                break;
            }
            i20 = i4;
            bArr2 = bArr;
            b3 = b3;
            iD = iD;
            i21 = i21;
            iC = i6;
        }
        if (anar.O(i4, i21, iD, bArr)) {
            bArr[(i21 * iD) + i4] = b3;
            bArr[(i2 * iD) + (iD - 2)] = b3;
        }
        int iD2 = amvmVarG.d();
        int iC2 = amvmVarG.c();
        defpackage.amwr amwrVar = new defpackage.amwr(amvmVarG.f(), amvmVarG.e());
        int i41 = 0;
        int i42 = 0;
        while (i41 < iC2) {
            int i43 = amvmVarG.e;
            int i44 = i41 % i43;
            if (i44 == 0) {
                int i45 = 0;
                for (int i46 = 0; i46 < amvmVarG.f(); i46++) {
                    amwrVar.c(i45, i42, i46 % 2 == 0 ? b3 : 0);
                    i45++;
                }
                i42++;
            }
            int i47 = 0;
            int i48 = 0;
            while (i47 < iD2) {
                int i49 = amvmVarG.d;
                int i50 = i47 % i49;
                boolean z = b3;
                if (i50 == 0) {
                    amwrVar.c(i48, i42, z);
                    i48++;
                    i50 = 0;
                }
                int i51 = iD;
                amwrVar.c(i48, i42, bArr[(i41 * iD) + i47] == z);
                int i52 = i48 + 1;
                if (i50 == i49 - 1) {
                    amwrVar.c(i52, i42, i41 % 2 == 0);
                    i48 += 2;
                } else {
                    i48 = i52;
                }
                i47++;
                iD = i51;
                b3 = 1;
            }
            int i53 = iD;
            int i54 = i42 + 1;
            if (i44 == i43 - 1) {
                int i55 = 0;
                for (int i56 = 0; i56 < amvmVarG.f(); i56++) {
                    amwrVar.c(i55, i54, true);
                    i55++;
                }
                i42 += 2;
            } else {
                i42 = i54;
            }
            i41++;
            iD = i53;
            b3 = 1;
        }
        int i57 = amwrVar.b;
        int i58 = amwrVar.c;
        int iMin = java.lang.Math.min(java.lang.Math.max(i, i57) / i57, java.lang.Math.max(1, i58) / i58);
        defpackage.amvb amvbVar = new defpackage.amvb(i57, i58);
        amvbVar.a();
        int i59 = 0;
        int i60 = 0;
        while (i59 < i58) {
            int i61 = 0;
            int i62 = 0;
            while (i61 < i57) {
                if (amwrVar.a(i61, i59) == 1) {
                    amvbVar.c(i62, i60, iMin, iMin);
                }
                i61++;
                i62 += iMin;
            }
            i59++;
            i60 += iMin;
        }
        return amvbVar;
    }
}
