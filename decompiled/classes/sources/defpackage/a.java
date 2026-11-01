package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes.dex */
public final class a {
    public static /* synthetic */ defpackage.aojh A(defpackage.cav cavVar, int i) {
        if (!cavVar.H((i & 3) != 2, i & 1)) {
            cavVar.s();
        }
        return defpackage.aojh.a;
    }

    public static /* synthetic */ boolean C(defpackage.ccp ccpVar) {
        return ((java.lang.Boolean) ccpVar.a()).booleanValue();
    }

    public static /* synthetic */ int D() {
        return android.os.Build.VERSION.SDK_INT < 36 ? android.os.Build.VERSION.SDK_INT * 100000 : a$.ExternalSyntheticApiModelOutline0.m();
    }

    public static /* synthetic */ long F(defpackage.cer cerVar) {
        return ((defpackage.cqg) cerVar.a()).a;
    }

    public static /* synthetic */ defpackage.aojh H(java.lang.String str, defpackage.cav cavVar, int i) {
        if (cavVar.H((i & 3) != 2, i & 1)) {
            defpackage.abrz.k(str, null, 0L, 0L, null, null, 0L, null, 0L, 0, false, 0, 0, null, null, cavVar, 0, 0, 262142);
        } else {
            cavVar.s();
        }
        return defpackage.aojh.a;
    }

    public static /* synthetic */ defpackage.aojh I(defpackage.diq diqVar) {
        defpackage.aooh.f(diqVar, "$this$semantics");
        return defpackage.aojh.a;
    }

    public static /* synthetic */ defpackage.aojh J(java.lang.String str, defpackage.diq diqVar) {
        defpackage.aooh.f(diqVar, "$this$semantics");
        defpackage.dfb.j(diqVar, str);
        return defpackage.aojh.a;
    }

    public static /* synthetic */ defpackage.aojh K(java.lang.String str, defpackage.diq diqVar) {
        defpackage.aooh.f(diqVar, "$this$clearAndSetSemantics");
        defpackage.dfb.j(diqVar, str);
        return defpackage.aojh.a;
    }

    public static /* synthetic */ boolean L(java.lang.Object obj, java.lang.Object obj2) {
        if (obj == null) {
            return obj2 == null;
        }
        return obj.equals(obj2);
    }

    public static /* synthetic */ int[] M() {
        return new int[]{1, 2, 3};
    }

    public static /* synthetic */ int N(java.lang.String str, byte[] bArr, int i, int i2) {
        int i3;
        int i4;
        int i5;
        char cCharAt;
        int length = str.length();
        int i6 = 0;
        while (true) {
            i3 = i + i2;
            if (i6 >= length || (i5 = i6 + i) >= i3 || (cCharAt = str.charAt(i6)) >= 128) {
                break;
            }
            bArr[i5] = (byte) cCharAt;
            i6++;
        }
        if (i6 == length) {
            return i + length;
        }
        int i7 = i + i6;
        while (i6 < length) {
            char cCharAt2 = str.charAt(i6);
            if (cCharAt2 < 128 && i7 < i3) {
                bArr[i7] = (byte) cCharAt2;
                i7++;
            } else if (cCharAt2 < 2048 && i7 <= i3 - 2) {
                bArr[i7] = (byte) ((cCharAt2 >>> 6) | 960);
                bArr[i7 + 1] = (byte) ((cCharAt2 & '?') | 128);
                i7 += 2;
            } else {
                if ((cCharAt2 >= 55296 && cCharAt2 <= 57343) || i7 > i3 - 3) {
                    if (i7 <= i3 - 4) {
                        i6++;
                        if (i6 != str.length()) {
                            char cCharAt3 = str.charAt(i6);
                            if (java.lang.Character.isSurrogatePair(cCharAt2, cCharAt3)) {
                                int i8 = i7 + 3;
                                int codePoint = java.lang.Character.toCodePoint(cCharAt2, cCharAt3);
                                bArr[i7] = (byte) ((codePoint >>> 18) | 240);
                                bArr[i7 + 1] = (byte) (((codePoint >>> 12) & 63) | 128);
                                bArr[i7 + 2] = (byte) (((codePoint >>> 6) & 63) | 128);
                                i7 += 4;
                                bArr[i8] = (byte) ((codePoint & 63) | 128);
                            }
                        }
                    } else if (cCharAt2 < 55296 || cCharAt2 > 57343 || ((i4 = i6 + 1) != str.length() && java.lang.Character.isSurrogatePair(cCharAt2, str.charAt(i4)))) {
                        throw new java.lang.ArrayIndexOutOfBoundsException("Not enough space in output buffer to encode UTF-8 string");
                    }
                    return defpackage.anty.z(str, bArr, i, i2);
                }
                bArr[i7] = (byte) ((cCharAt2 >>> '\f') | 480);
                bArr[i7 + 1] = (byte) (((cCharAt2 >>> 6) & 63) | 128);
                bArr[i7 + 2] = (byte) ((cCharAt2 & '?') | 128);
                i7 += 3;
            }
            i6++;
        }
        return i7;
    }

    public static /* synthetic */ boolean O(byte[] bArr, int i, byte[] bArr2, int i2, int i3) {
        int i4 = i + i3;
        defpackage.anty.P(i, i4, bArr.length);
        defpackage.anty.P(i2, i3 + i2, bArr2.length);
        while (i < i4) {
            if (bArr[i] != bArr2[i2]) {
                return false;
            }
            i++;
            i2++;
        }
        return true;
    }

    public static /* synthetic */ java.lang.String P(int i) {
        switch (i) {
            case 1:
                return "UNKNOWN";
            case 2:
                return "ERROR";
            case 3:
                return "LOCAL";
            case 4:
                return "REMOTE";
            case 5:
                return "CANCELED";
            case defpackage.eft.STRING_SET_FIELD_NUMBER /* 6 */:
                return "MISSED";
            case defpackage.eft.DOUBLE_FIELD_NUMBER /* 7 */:
                return "REJECTED";
            case defpackage.eft.BYTES_FIELD_NUMBER /* 8 */:
                return "BUSY";
            case 9:
                return "RESTRICTED";
            case 10:
                return "OTHER";
            case 11:
                return "CONNECTION_MANAGER_NOT_SUPPORTED";
            case 12:
                return "ANSWERED_ELSEWHERE";
            default:
                return "CALL_PULLED";
        }
    }

    public static /* synthetic */ int Q(int i) {
        return i == 1 ? defpackage.alau.a() : i - 2;
    }

    public static /* synthetic */ int R(int i) {
        return i == 1 ? defpackage.alau.a() : i - 2;
    }

    public static /* synthetic */ int S(int i) {
        return i == 1 ? defpackage.alau.a() : i - 2;
    }

    public static /* synthetic */ int T(int i) {
        return i == 1 ? defpackage.alau.a() : i - 2;
    }

    public static /* synthetic */ int U(int i) {
        return i - 2;
    }

    public static /* synthetic */ int V(int i) {
        return i == 1 ? defpackage.alau.a() : i - 2;
    }

    public static /* synthetic */ int W(int i) {
        if (i == 0) {
            return 2;
        }
        if (i == 1) {
            return 3;
        }
        if (i != 2) {
            return i != 3 ? 0 : 5;
        }
        return 4;
    }

    public static /* synthetic */ int X(int i) {
        if (i == 0) {
            return 4;
        }
        if (i == 1) {
            return 1;
        }
        if (i != 2) {
            return i != 3 ? 0 : 3;
        }
        return 2;
    }

    public static /* synthetic */ int Y(int i) {
        switch (i) {
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
            default:
                return 0;
        }
    }

    public static /* synthetic */ int Z(int i) {
        if (i == 0) {
            return 1;
        }
        int i2 = 2;
        if (i != 1) {
            if (i == 2) {
                return 3;
            }
            i2 = 4;
            if (i != 3) {
                if (i == 4) {
                    return 5;
                }
                if (i != 5) {
                    return i != 7 ? 0 : 8;
                }
                return 6;
            }
        }
        return i2;
    }

    public static /* synthetic */ boolean a(j$.time.Duration duration) {
        return (duration.isZero() || duration.isNegative()) ? false : true;
    }

    public static /* synthetic */ boolean aA(int i) {
        return ad(i) != 0;
    }

    public static /* synthetic */ boolean aB(int i) {
        return ae(i) != 0;
    }

    public static /* synthetic */ boolean aC(int i) {
        return aP(i) != 0;
    }

    public static /* synthetic */ int aD(int i) {
        switch (i) {
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
            default:
                return 0;
        }
    }

    public static /* synthetic */ int aE(double d) {
        double d2 = d / 100.0d;
        int iRound = (int) java.lang.Math.round((d2 <= 0.0031308d ? d2 * 12.92d : (java.lang.Math.pow(d2, 0.4166666666666667d) * 1.055d) - 0.055d) * 255.0d);
        if (iRound < 0) {
            return 0;
        }
        if (iRound > 255) {
            return 255;
        }
        return iRound;
    }

    public static /* synthetic */ boolean aF(int i) {
        switch (i) {
            case 0:
            case 1:
            case 2:
            case 3:
            case 4:
            case 5:
            case defpackage.eft.STRING_SET_FIELD_NUMBER /* 6 */:
            case defpackage.eft.DOUBLE_FIELD_NUMBER /* 7 */:
            case defpackage.eft.BYTES_FIELD_NUMBER /* 8 */:
            case 9:
            case 10:
                return true;
            default:
                return false;
        }
    }

    public static /* synthetic */ boolean aG(int i) {
        return i == 0 || i == 1 || i == 2 || i == 3;
    }

    public static /* synthetic */ boolean aH(int i) {
        switch (i) {
            case 0:
            case 1:
            case 2:
            case 3:
            case 4:
            case 5:
            case defpackage.eft.STRING_SET_FIELD_NUMBER /* 6 */:
            case defpackage.eft.DOUBLE_FIELD_NUMBER /* 7 */:
            case defpackage.eft.BYTES_FIELD_NUMBER /* 8 */:
            case 9:
            case 10:
            case 11:
            case 12:
            case 13:
                return true;
            default:
                return false;
        }
    }

    public static /* synthetic */ boolean aI(int i) {
        return i == 0 || i == 1 || i == 2;
    }

    public static /* synthetic */ boolean aJ(int i) {
        switch (i) {
            case 0:
            case 1:
            case 2:
            case 3:
            case 4:
            case 5:
            case defpackage.eft.STRING_SET_FIELD_NUMBER /* 6 */:
            case defpackage.eft.DOUBLE_FIELD_NUMBER /* 7 */:
            case defpackage.eft.BYTES_FIELD_NUMBER /* 8 */:
            case 9:
            case 10:
            case 11:
            case 12:
            case 13:
            case 14:
            case 15:
            case 16:
            case 17:
            case 18:
            case 19:
            case 20:
            case 21:
                return true;
            default:
                return false;
        }
    }

    public static /* synthetic */ boolean aK(int i) {
        switch (i) {
            case 0:
            case 1:
            case 2:
            case 3:
            case 4:
            case 5:
            case defpackage.eft.STRING_SET_FIELD_NUMBER /* 6 */:
                return true;
            default:
                return false;
        }
    }

    public static /* synthetic */ boolean aL(int i) {
        return i == 0 || i == 1 || i == 2 || i == 3 || i == 4;
    }

    public static /* synthetic */ int aM(int i) {
        if (i == 0) {
            return 1;
        }
        int i2 = 2;
        if (i != 1) {
            if (i == 2) {
                return 3;
            }
            i2 = 4;
            if (i != 3) {
                if (i != 4) {
                    return i != 5 ? 0 : 6;
                }
                return 5;
            }
        }
        return i2;
    }

    public static /* synthetic */ int aN(int i) {
        if (i == 0) {
            return 1;
        }
        if (i == 1) {
            return 2;
        }
        if (i != 2) {
            return i != 3 ? 0 : 4;
        }
        return 3;
    }

    public static /* synthetic */ int aO(int i) {
        switch (i) {
            case 0:
                return 2;
            case 1:
                return 3;
            case 2:
                return 4;
            case 3:
                return 5;
            case 4:
                return 6;
            case 5:
                return 7;
            case defpackage.eft.STRING_SET_FIELD_NUMBER /* 6 */:
                return 8;
            case defpackage.eft.DOUBLE_FIELD_NUMBER /* 7 */:
                return 9;
            default:
                return 0;
        }
    }

    public static /* synthetic */ int aP(int i) {
        switch (i) {
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
            default:
                return 0;
        }
    }

    public static /* synthetic */ int aQ(int i) {
        if (i == 0) {
            return 1;
        }
        if (i != 1) {
            return i != 2 ? 0 : 3;
        }
        return 2;
    }

    public static /* synthetic */ int aR(int i) {
        if (i == 0) {
            return 2;
        }
        if (i != 1) {
            return i != 2 ? 0 : 4;
        }
        return 3;
    }

    public static /* synthetic */ int aS(int i) {
        if (i == 0) {
            return 1;
        }
        int i2 = 2;
        if (i != 1) {
            if (i == 2) {
                return 3;
            }
            i2 = 4;
            if (i != 3) {
                return i != 4 ? 0 : 5;
            }
        }
        return i2;
    }

    public static /* synthetic */ int aT(int i) {
        return i == 1 ? defpackage.alau.a() : i - 2;
    }

    public static /* synthetic */ int aU(int i) {
        return i == 1 ? defpackage.alau.a() : i - 2;
    }

    public static /* synthetic */ int aV(int i) {
        switch (i) {
            case 0:
                return 2;
            case 1:
                return 3;
            case 2:
                return 4;
            case 3:
                return 5;
            case 4:
                return 6;
            case 5:
                return 7;
            case defpackage.eft.STRING_SET_FIELD_NUMBER /* 6 */:
                return 8;
            case defpackage.eft.DOUBLE_FIELD_NUMBER /* 7 */:
                return 9;
            case defpackage.eft.BYTES_FIELD_NUMBER /* 8 */:
                return 10;
            default:
                return 0;
        }
    }

    public static /* synthetic */ int aW(int i) {
        switch (i) {
            case 0:
                return 2;
            case 1:
                return 3;
            case 2:
                return 4;
            case 3:
                return 5;
            case 4:
                return 6;
            case 5:
                return 7;
            case defpackage.eft.STRING_SET_FIELD_NUMBER /* 6 */:
                return 8;
            default:
                return 0;
        }
    }

    public static /* synthetic */ int aX(int i) {
        switch (i) {
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
            default:
                return 0;
        }
    }

    public static /* synthetic */ void aY(int i) {
        if (i == 0) {
            throw null;
        }
    }

    public static final int aZ(ajyt ajytVar, int i, int i2, int i3) {
        defpackage.aooh.f(ajytVar, "builder");
        ajytVar.l(3);
        defpackage.aooh.f(ajytVar, "builder");
        ajytVar.o(2, i3);
        defpackage.aooh.f(ajytVar, "builder");
        ajytVar.n(1, i2);
        defpackage.mni.bu(ajytVar, i);
        return defpackage.mni.bt(ajytVar);
    }

    public static /* synthetic */ int aa(int i) {
        if (i == 0) {
            return 2;
        }
        if (i == 1) {
            return 3;
        }
        if (i == 2) {
            return 4;
        }
        if (i == 3) {
            return 5;
        }
        if (i != 4) {
            return i != 5 ? 0 : 7;
        }
        return 6;
    }

    public static /* synthetic */ int ab(int i) {
        if (i == 0) {
            return 2;
        }
        if (i == 1) {
            return 3;
        }
        if (i == 2) {
            return 4;
        }
        if (i != 3) {
            return i != 4 ? 0 : 6;
        }
        return 5;
    }

    public static /* synthetic */ int ac(int i) {
        if (i == 0) {
            return 5;
        }
        int i2 = 2;
        if (i == 2) {
            return 1;
        }
        if (i != 3) {
            i2 = 4;
            if (i == 4) {
                return 3;
            }
            if (i != 5) {
                return 0;
            }
        }
        return i2;
    }

    public static /* synthetic */ int ad(int i) {
        switch (i) {
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
            default:
                return 0;
        }
    }

    public static /* synthetic */ int ae(int i) {
        if (i != 0) {
            return i != 1 ? 0 : 2;
        }
        return 1;
    }

    public static /* synthetic */ int af(int i) {
        if (i != 0) {
            return i != 1 ? 0 : 3;
        }
        return 2;
    }

    public static /* synthetic */ int ag(int i) {
        switch (i) {
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
            default:
                return 0;
        }
    }

    public static /* synthetic */ int ah(int i) {
        switch (i) {
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
            default:
                return 0;
        }
    }

    public static /* synthetic */ int ai(int i) {
        switch (i) {
            case 0:
                return 2;
            case 1:
                return 3;
            case 2:
                return 4;
            case 3:
                return 5;
            case 4:
                return 6;
            case 5:
                return 7;
            case defpackage.eft.STRING_SET_FIELD_NUMBER /* 6 */:
                return 8;
            case defpackage.eft.DOUBLE_FIELD_NUMBER /* 7 */:
                return 9;
            case defpackage.eft.BYTES_FIELD_NUMBER /* 8 */:
                return 10;
            case 9:
                return 11;
            default:
                return 0;
        }
    }

    public static /* synthetic */ void aj(int i, int i2) {
        if (i < 0 || i >= i2) {
            throw new java.lang.IndexOutOfBoundsException(bf(i2, i, "index: ", ", size: "));
        }
    }

    public static /* synthetic */ void ak(int i, int i2) {
        if (i < 0 || i > i2) {
            throw new java.lang.IndexOutOfBoundsException(bf(i2, i, "index: ", ", size: "));
        }
    }

    public static /* synthetic */ void al(int i, int i2, int i3) {
        if (i >= 0 && i2 <= i3) {
            if (i > i2) {
                throw new java.lang.IllegalArgumentException(bf(i2, i, "fromIndex: ", " > toIndex: "));
            }
            return;
        }
        throw new java.lang.IndexOutOfBoundsException("fromIndex: " + i + ", toIndex: " + i2 + ", size: " + i3);
    }

    public static /* synthetic */ void am() {
        throw new java.lang.UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    public static /* synthetic */ java.lang.Object an() {
        throw new java.lang.UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    public static /* synthetic */ int ao(int i, java.util.List list) {
        int size = list.size();
        if (size == 0) {
            return 0;
        }
        return (((352 - (java.lang.Integer.numberOfLeadingZeros(i << 3) * 9)) >>> 6) + 4) * size;
    }

    public static /* synthetic */ int ap(int i, java.util.List list) {
        int size = list.size();
        if (size == 0) {
            return 0;
        }
        return (((352 - (java.lang.Integer.numberOfLeadingZeros(i << 3) * 9)) >>> 6) + 8) * size;
    }

    public static /* synthetic */ int aq(int i) {
        if (i != 0) {
            return i;
        }
        throw null;
    }

    public static /* synthetic */ int ar(int i, long j) {
        return ((352 - (java.lang.Integer.numberOfLeadingZeros(i << 3) * 9)) >>> 6) + ((640 - (java.lang.Long.numberOfLeadingZeros(j) * 9)) >>> 6);
    }

    public static /* synthetic */ int as(int i, int i2) {
        return ((352 - (java.lang.Integer.numberOfLeadingZeros(i << 3) * 9)) >>> 6) + ((352 - (java.lang.Integer.numberOfLeadingZeros((i2 << 1) ^ (i2 >> 31)) * 9)) >>> 6);
    }

    public static /* synthetic */ int at(int i, long j) {
        return ((352 - (java.lang.Integer.numberOfLeadingZeros(i << 3) * 9)) >>> 6) + ((640 - (java.lang.Long.numberOfLeadingZeros((j << 1) ^ (j >> 63)) * 9)) >>> 6);
    }

    public static /* synthetic */ int au(int i, int i2) {
        return ((352 - (java.lang.Integer.numberOfLeadingZeros(i << 3) * 9)) >>> 6) + ((352 - (java.lang.Integer.numberOfLeadingZeros(i2) * 9)) >>> 6);
    }

    public static /* synthetic */ boolean av(int i) {
        return aQ(i) != 0;
    }

    public static /* synthetic */ boolean aw(int i) {
        return aN(i) != 0;
    }

    public static /* synthetic */ boolean ax(int i) {
        return Y(i) != 0;
    }

    public static /* synthetic */ boolean ay(int i) {
        return aM(i) != 0;
    }

    public static /* synthetic */ boolean az(int i) {
        return aS(i) != 0;
    }

    public static /* synthetic */ int b(java.lang.Object obj) {
        j$.util.Objects.checkIndex(0, 3);
        if (obj instanceof defpackage.adub) {
            return 0;
        }
        return obj instanceof defpackage.adtv ? 1 : -2;
    }

    public static /* synthetic */ java.lang.String bA(int i, int i2, java.lang.String str, java.lang.String str2, java.lang.String str3) {
        return str + i2 + str2 + i + str3;
    }

    public static /* synthetic */ java.lang.String bB(float f, java.lang.StringBuilder sb, java.lang.String str) {
        java.lang.String strB = defpackage.dpi.b(f);
        java.lang.String strB2 = defpackage.dpi.b(f);
        java.lang.String strB3 = defpackage.dpi.b(f);
        java.lang.String strB4 = defpackage.dpi.b(f);
        sb.append(str);
        sb.append(strB);
        sb.append(", top=");
        sb.append(strB2);
        sb.append(", right=");
        sb.append(strB3);
        sb.append(", bottom=");
        sb.append(strB4);
        sb.append(')');
        return sb.toString();
    }

    public static /* synthetic */ java.lang.String bC(long j, java.lang.String str, java.lang.String str2) {
        return str + j + str2;
    }

    public static /* synthetic */ java.lang.String bD(java.lang.String str, java.lang.String str2, java.lang.String str3, java.lang.String str4, java.lang.String str5) {
        return str3 + str2 + str4 + str + str5;
    }

    public static /* synthetic */ java.lang.String bE(java.lang.String str, byte b, java.lang.String str2) {
        return str2 + ((char) b) + str;
    }

    public static /* synthetic */ java.lang.String bF(byte b, java.lang.Object obj, java.lang.String str) {
        return str + obj + ((char) b);
    }

    public static /* synthetic */ java.lang.String bG(byte b, java.lang.Object obj, java.lang.String str) {
        return str + obj.toString() + ((char) b);
    }

    public static /* synthetic */ java.lang.String bH(java.lang.Object obj, java.lang.String str) {
        return str + java.lang.String.valueOf(obj);
    }

    public static /* synthetic */ java.lang.String bJ(java.lang.Object obj, java.lang.String str, java.lang.String str2) {
        return str + obj.toString() + str2;
    }

    public static /* synthetic */ java.lang.String bK(java.lang.Object obj, java.lang.Object obj2, java.lang.String str, java.lang.String str2) {
        return str + obj2.toString() + str2 + obj.toString();
    }

    private static int bL(android.content.Context context, int i) {
        android.content.res.TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(android.R.style.Animation.Activity, new int[]{i});
        int resourceId = typedArrayObtainStyledAttributes.getResourceId(0, -1);
        typedArrayObtainStyledAttributes.recycle();
        return resourceId;
    }

    public static final int ba(ajyt ajytVar, int i) {
        defpackage.aooh.f(ajytVar, "builder");
        ajytVar.l(1);
        defpackage.mni.bu(ajytVar, i);
        return defpackage.mni.bt(ajytVar);
    }

    public static /* synthetic */ void bb(defpackage.cj cjVar, ag agVar) {
        if (defpackage.bo.Z(2)) {
            android.util.Log.v("FragmentManager", bg(cjVar, "Transition for operation ", " has completed"));
        }
        cjVar.f(agVar);
    }

    public static final void bc(ajyt ajytVar) {
        defpackage.aooh.f(ajytVar, "builder");
        ajytVar.l(16);
    }

    /* JADX WARN: Code duplicated, block: B:66:0x00cf A[Catch: RuntimeException -> 0x00d6, TRY_LEAVE, TryCatch #0 {RuntimeException -> 0x00d6, blocks: (B:64:0x00c9, B:66:0x00cf), top: B:76:0x00c9 }] */
    /* JADX WARN: Code duplicated, block: B:82:? A[RETURN, SYNTHETIC] */
    public static defpackage.vx bd(android.content.Context context, defpackage.aw awVar, boolean z, boolean z2) {
        int iW;
        boolean z3;
        defpackage.vx vxVar;
        android.animation.Animator animatorLoadAnimator;
        defpackage.at atVar = awVar.T;
        int iBL = 0;
        int i = atVar == null ? 0 : atVar.f;
        if (z2) {
            if (z) {
                iW = awVar.x();
                z3 = true;
            } else {
                iW = awVar.dZ();
                z3 = false;
            }
        } else if (z) {
            iW = awVar.v();
            z3 = true;
        } else {
            iW = awVar.w();
            z3 = false;
        }
        boolean z4 = z3;
        awVar.at(0, 0, 0, 0);
        android.view.ViewGroup viewGroup = awVar.P;
        if (viewGroup != null && viewGroup.getTag(2131429440) != null) {
            awVar.P.setTag(2131429440, null);
        }
        android.view.ViewGroup viewGroup2 = awVar.P;
        if (viewGroup2 != null && viewGroup2.getLayoutTransition() != null) {
            return null;
        }
        awVar.aR(i, iW);
        awVar.aS(i, iW);
        if (iW != 0) {
            iBL = iW;
        } else if (i != 0) {
            if (i == 4097) {
                iBL = true != z3 ? 2130837520 : 2130837519;
            } else if (i == 8194) {
                iBL = true != z3 ? 2130837516 : 2130837515;
            } else if (i == 8197) {
                iBL = z4 ? bL(context, android.R.attr.activityCloseEnterAnimation) : bL(context, android.R.attr.activityCloseExitAnimation);
            } else if (i == 4099) {
                iBL = true != z3 ? 2130837518 : 2130837517;
            } else if (i != 4100) {
                iBL = -1;
            } else {
                iBL = z4 ? bL(context, android.R.attr.activityOpenEnterAnimation) : bL(context, android.R.attr.activityOpenExitAnimation);
            }
        }
        if (iBL == 0) {
            return null;
        }
        boolean zEquals = "anim".equals(context.getResources().getResourceTypeName(iBL));
        if (zEquals) {
            try {
                android.view.animation.Animation animationLoadAnimation = android.view.animation.AnimationUtils.loadAnimation(context, iBL);
                if (animationLoadAnimation == null) {
                    return null;
                }
                vxVar = new defpackage.vx(animationLoadAnimation);
            } catch (android.content.res.Resources.NotFoundException e) {
                throw e;
            } catch (java.lang.RuntimeException unused) {
                try {
                    animatorLoadAnimator = android.animation.AnimatorInflater.loadAnimator(context, iBL);
                    if (animatorLoadAnimator != null) {
                        return null;
                    }
                    vxVar = new defpackage.vx(animatorLoadAnimator);
                } catch (java.lang.RuntimeException e2) {
                    if (zEquals) {
                        throw e2;
                    }
                    android.view.animation.Animation animationLoadAnimation2 = android.view.animation.AnimationUtils.loadAnimation(context, iBL);
                    if (animationLoadAnimation2 != null) {
                        return new defpackage.vx(animationLoadAnimation2);
                    }
                    return null;
                }
            }
        } else {
            animatorLoadAnimator = android.animation.AnimatorInflater.loadAnimator(context, iBL);
            if (animatorLoadAnimator != null) {
                return null;
            }
            vxVar = new defpackage.vx(animatorLoadAnimator);
        }
        return vxVar;
    }

    public static /* synthetic */ void be(defpackage.adnp adnpVar, java.lang.Runnable runnable) {
        if (runnable == null) {
            defpackage.aooh.i("p0");
        }
        adnpVar.e(runnable);
    }

    public static /* synthetic */ java.lang.String bf(int i, int i2, java.lang.String str, java.lang.String str2) {
        return str + i2 + str2 + i;
    }

    public static /* synthetic */ java.lang.String bg(java.lang.Object obj, java.lang.String str, java.lang.String str2) {
        return str + obj + str2;
    }

    public static /* synthetic */ java.lang.String bh(java.lang.Object obj, java.lang.String str) {
        return str + obj;
    }

    public static /* synthetic */ java.lang.String bi(java.lang.Object obj, java.lang.Object obj2, java.lang.String str, java.lang.String str2) {
        return str + obj2 + str2 + obj;
    }

    public static /* synthetic */ java.lang.String bj(int i, java.lang.String str) {
        return str + i;
    }

    public static /* synthetic */ java.lang.String bk(java.lang.String str, java.lang.String str2, java.lang.String str3) {
        return str2 + str + str3;
    }

    public static /* synthetic */ java.lang.String bl(java.lang.Object obj, java.lang.Object obj2, java.lang.String str, java.lang.String str2, java.lang.String str3) {
        return str + obj2 + str2 + obj + str3;
    }

    public static /* synthetic */ java.lang.String bm(byte b, java.lang.Object obj, java.lang.Object obj2, java.lang.String str, java.lang.String str2) {
        return str + obj2 + str2 + obj + ((char) b);
    }

    public static /* synthetic */ java.lang.String bn(java.lang.String str, android.util.AttributeSet attributeSet, java.lang.String str2) {
        return attributeSet.getPositionDescription() + str2 + str;
    }

    public static /* synthetic */ java.lang.String bo(java.lang.Object obj, java.lang.String str, java.lang.String str2, java.lang.String str3) {
        return str2 + str + str3 + obj;
    }

    public static /* synthetic */ java.lang.String bp(byte b, java.lang.String str, java.lang.String str2) {
        return str2 + str + ((char) b);
    }

    public static /* synthetic */ java.lang.String br(java.lang.String str, java.lang.String str2, java.lang.String str3) {
        return str2 + str3 + str;
    }

    public static /* synthetic */ java.lang.String bs(int i, java.lang.String str, java.lang.String str2) {
        return str + i + str2;
    }

    public static /* synthetic */ java.lang.String bu(int i, java.lang.String str, java.lang.String str2, java.lang.String str3) {
        return str2 + str + str3 + i;
    }

    public static /* synthetic */ java.lang.String bv(byte b, int i, int i2, java.lang.String str, java.lang.String str2) {
        return str + i2 + str2 + i + ((char) b);
    }

    public static /* synthetic */ java.lang.String bw(byte b, int i, java.lang.String str) {
        return str + i + ((char) b);
    }

    public static /* synthetic */ java.lang.String bx(java.lang.String str, java.lang.String str2) {
        return str2 + str;
    }

    public static /* synthetic */ java.lang.String bz(long j, java.lang.String str) {
        return str + j;
    }

    public static /* synthetic */ float[] c(byte[] bArr) {
        int length = bArr.length >> 1;
        float[] fArr = new float[length];
        for (int i = 0; i < length; i++) {
            int i2 = i << 1;
            fArr[i] = ((short) ((bArr[i2 + 1] << 8) | (bArr[i2] & 255))) * 3.0517578E-5f;
        }
        return fArr;
    }

    public static /* synthetic */ long d(long j, long j2) {
        int i = ((j ^ j2) > 0L ? 1 : ((j ^ j2) == 0L ? 0 : -1));
        long j3 = j2 + j;
        if ((i | (((j ^ j3) > 0L ? 1 : ((j ^ j3) == 0L ? 0 : -1)) ^ (-1))) < 0) {
            return j3;
        }
        throw new java.lang.ArithmeticException();
    }

    public static /* synthetic */ int e(int i) {
        if (i == 2) {
            return 3;
        }
        if (i != 3) {
            return i != 4 ? 6 : 5;
        }
        return 4;
    }

    public static /* synthetic */ java.lang.String f(defpackage.ajtc ajtcVar) {
        java.lang.String str = ajtcVar.c().c;
        if (str != null) {
            return str;
        }
        java.lang.String str2 = ajtcVar.c().b;
        if (!str2.startsWith("1:")) {
            return str2;
        }
        java.lang.String[] strArrSplit = str2.split(":");
        if (strArrSplit.length >= 2) {
            java.lang.String str3 = strArrSplit[1];
            if (!str3.isEmpty()) {
                return str3;
            }
        }
        return null;
    }

    public static /* synthetic */ byte[] g(java.util.Queue queue, int i) {
        if (queue.isEmpty()) {
            return new byte[0];
        }
        byte[] bArr = (byte[]) queue.remove();
        int length = bArr.length;
        if (length == i) {
            return bArr;
        }
        byte[] bArrCopyOf = java.util.Arrays.copyOf(bArr, i);
        int i2 = i - length;
        while (i2 > 0) {
            byte[] bArr2 = (byte[]) queue.remove();
            int iMin = java.lang.Math.min(i2, bArr2.length);
            java.lang.System.arraycopy(bArr2, 0, bArrCopyOf, i - i2, iMin);
            i2 -= iMin;
        }
        return bArrCopyOf;
    }

    public static /* synthetic */ java.lang.Object h(java.util.concurrent.Future future) {
        java.lang.Object obj;
        boolean z = false;
        while (true) {
            try {
                obj = future.get();
                break;
            } catch (java.lang.InterruptedException unused) {
                z = true;
            } catch (java.lang.Throwable th) {
                if (z) {
                    java.lang.Thread.currentThread().interrupt();
                }
                throw th;
            }
        }
        if (z) {
            java.lang.Thread.currentThread().interrupt();
        }
        return obj;
    }

    public static /* synthetic */ sun.misc.Unsafe i() throws java.lang.IllegalAccessException {
        for (java.lang.reflect.Field field : sun.misc.Unsafe.class.getDeclaredFields()) {
            field.setAccessible(true);
            java.lang.Object obj = field.get(null);
            if (sun.misc.Unsafe.class.isInstance(obj)) {
                return (sun.misc.Unsafe) sun.misc.Unsafe.class.cast(obj);
            }
        }
        throw new java.lang.NoSuchFieldError("the Unsafe");
    }

    public static /* synthetic */ defpackage.ajcq j(defpackage.aonj aonjVar, java.lang.Object obj) {
        return (defpackage.ajcq) aonjVar.a(obj);
    }

    public static /* synthetic */ java.lang.Boolean k(defpackage.aonj aonjVar, java.lang.Object obj) {
        return (java.lang.Boolean) aonjVar.a(obj);
    }

    public static /* synthetic */ java.lang.String l(defpackage.aonj aonjVar, java.lang.Object obj) {
        return (java.lang.String) aonjVar.a(obj);
    }

    public static /* synthetic */ defpackage.aify m(java.util.List list) {
        defpackage.aift aiftVar = new defpackage.aift(4);
        java.util.Iterator it = list.iterator();
        while (it.hasNext()) {
            aiftVar.k((java.lang.Iterable) defpackage.aiql.H((defpackage.ajcq) it.next()));
        }
        return aiftVar.g();
    }

    public static /* synthetic */ boolean n() {
        return android.os.Build.VERSION.SDK_INT >= 31;
    }

    public static /* synthetic */ boolean o() {
        return android.os.Build.VERSION.SDK_INT >= 34;
    }

    public static /* synthetic */ java.lang.String p(int i) {
        switch (i) {
            case 2:
                return "LEFT";
            case 3:
                return "TOP";
            case 4:
                return "RIGHT";
            case 5:
                return "BOTTOM";
            case defpackage.eft.STRING_SET_FIELD_NUMBER /* 6 */:
                return "BASELINE";
            case defpackage.eft.DOUBLE_FIELD_NUMBER /* 7 */:
                return "CENTER";
            case defpackage.eft.BYTES_FIELD_NUMBER /* 8 */:
                return "CENTER_X";
            default:
                return "CENTER_Y";
        }
    }

    public static /* synthetic */ android.graphics.PorterDuff.Mode q(int i, android.graphics.PorterDuff.Mode mode) {
        if (i == 3) {
            return android.graphics.PorterDuff.Mode.SRC_OVER;
        }
        if (i == 5) {
            return android.graphics.PorterDuff.Mode.SRC_IN;
        }
        if (i == 9) {
            return android.graphics.PorterDuff.Mode.SRC_ATOP;
        }
        switch (i) {
            case 14:
                return android.graphics.PorterDuff.Mode.MULTIPLY;
            case 15:
                return android.graphics.PorterDuff.Mode.SCREEN;
            case 16:
                return android.graphics.PorterDuff.Mode.ADD;
            default:
                return mode;
        }
    }

    public static /* synthetic */ defpackage.aojh r(defpackage.aomy aomyVar) {
        aomyVar.a();
        return defpackage.aojh.a;
    }

    public static /* synthetic */ defpackage.aojh t(defpackage.aonn aonnVar, defpackage.cav cavVar, int i) {
        if (cavVar.H((i & 3) != 2, i & 1)) {
            aonnVar.a(cavVar, 0);
        } else {
            cavVar.s();
        }
        return defpackage.aojh.a;
    }

    public static /* synthetic */ int u(java.lang.Object obj) {
        j$.util.Objects.checkIndex(0, 6);
        if (obj instanceof krf) {
            return 0;
        }
        if (obj instanceof kre) {
            return 1;
        }
        if (obj instanceof krg) {
            return 2;
        }
        if (obj instanceof kri) {
            return 3;
        }
        return obj instanceof krh ? 4 : -2;
    }

    public static /* synthetic */ int v(java.lang.Object obj) {
        j$.util.Objects.checkIndex(0, 4);
        if (obj instanceof its) {
            return 0;
        }
        if (obj instanceof itv) {
            return 1;
        }
        return obj instanceof itw ? 2 : -2;
    }

    public static /* synthetic */ boolean x(int i, int i2) {
        return i == i2;
    }

    public static /* synthetic */ boolean y(defpackage.cer cerVar) {
        return ((java.lang.Boolean) cerVar.a()).booleanValue();
    }

    public static /* synthetic */ defpackage.aojh z(defpackage.czc czcVar, defpackage.czb czbVar) {
        defpackage.aooh.f(czbVar, "$this$layout");
        czbVar.s(czcVar, 0, 0, 0.0f);
        return defpackage.aojh.a;
    }
}
