package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes.dex */
final class akyr {
    public static final /* synthetic */ int a = 0;
    private static volatile int b = 100;

    static double a(byte[] bArr, int i) {
        return java.lang.Double.longBitsToDouble(t(bArr, i));
    }

    static float b(byte[] bArr, int i) {
        return java.lang.Float.intBitsToFloat(d(bArr, i));
    }

    static int c(byte[] bArr, int i, defpackage.akyq akyqVar) throws defpackage.alaz {
        int iF = f(bArr, i, bArr.length, akyqVar);
        int i2 = akyqVar.a;
        if (i2 == 0) {
            akyqVar.c = defpackage.akzc.d;
            return iF;
        }
        defpackage.akzc akzcVar = defpackage.akzc.d;
        try {
            akyqVar.c = defpackage.akzc.E(bArr, iF, i2);
            return iF + i2;
        } catch (defpackage.alaz e) {
            throw new java.lang.AssertionError("Expected no InvalidProtocolBufferException as data UTF8 validity is not checked.", e);
        }
    }

    static int d(byte[] bArr, int i) {
        return (bArr[i] & 255) | ((bArr[i + 1] & 255) << 8) | ((bArr[i + 2] & 255) << 16) | ((bArr[i + 3] & 255) << 24);
    }

    static int e(defpackage.albw albwVar, byte[] bArr, int i, int i2, int i3, defpackage.akyq akyqVar) throws defpackage.alaz {
        java.lang.Object objE = albwVar.e();
        int iQ = q(objE, albwVar, bArr, i, i2, i3, akyqVar);
        albwVar.g(objE);
        akyqVar.c = objE;
        return iQ;
    }

    static int f(byte[] bArr, int i, int i2, defpackage.akyq akyqVar) throws defpackage.alaz {
        int iM = m(bArr, i, akyqVar);
        int i3 = akyqVar.a;
        if (i3 < 0) {
            throw new defpackage.alaz("CodedInputStream encountered an embedded string or message which claimed to have negative size.");
        }
        if (i3 <= i2 - iM) {
            return iM;
        }
        throw new defpackage.alaz("While parsing a protocol message, the input ended unexpectedly in the middle of a field.  This could mean either that the input has been truncated or that an embedded message misreported its own length.");
    }

    static int g(defpackage.albw albwVar, byte[] bArr, int i, int i2, defpackage.akyq akyqVar) throws defpackage.alaz {
        java.lang.Object objE = albwVar.e();
        int iR = r(objE, albwVar, bArr, i, i2, akyqVar);
        albwVar.g(objE);
        akyqVar.c = objE;
        return iR;
    }

    static int h(defpackage.albw albwVar, int i, byte[] bArr, int i2, int i3, defpackage.alat alatVar, defpackage.akyq akyqVar) throws defpackage.alaz {
        int iG = g(albwVar, bArr, i2, i3, akyqVar);
        alatVar.add(akyqVar.c);
        while (iG < i3) {
            int iM = m(bArr, iG, akyqVar);
            if (i != akyqVar.a) {
                break;
            }
            iG = g(albwVar, bArr, iM, i3, akyqVar);
            alatVar.add(akyqVar.c);
        }
        return iG;
    }

    static int i(byte[] bArr, int i, defpackage.alat alatVar, defpackage.akyq akyqVar) throws defpackage.alaz {
        defpackage.alae alaeVar = (defpackage.alae) alatVar;
        int iF = f(bArr, i, bArr.length, akyqVar);
        int i2 = akyqVar.a + iF;
        while (iF < i2) {
            iF = m(bArr, iF, akyqVar);
            alaeVar.g(akyqVar.a);
        }
        if (iF == i2) {
            return iF;
        }
        throw new defpackage.alaz("While parsing a protocol message, the input ended unexpectedly in the middle of a field.  This could mean either that the input has been truncated or that an embedded message misreported its own length.");
    }

    static int j(byte[] bArr, int i, defpackage.akyq akyqVar) throws defpackage.alaz {
        int iF = f(bArr, i, bArr.length, akyqVar);
        int i2 = akyqVar.a;
        if (i2 == 0) {
            akyqVar.c = "";
            return iF;
        }
        akyqVar.c = new java.lang.String(bArr, iF, i2, java.nio.charset.StandardCharsets.UTF_8);
        return iF + i2;
    }

    static int k(byte[] bArr, int i, defpackage.akyq akyqVar) throws defpackage.alaz {
        int iF = f(bArr, i, bArr.length, akyqVar);
        int i2 = akyqVar.a;
        java.lang.String strN = "";
        if (i2 == 0) {
            akyqVar.c = "";
            return iF;
        }
        if (i2 == 0) {
            i2 = 0;
        } else {
            strN = defpackage.ajsz.N(bArr, iF, i2);
        }
        akyqVar.c = strN;
        return iF + i2;
    }

    static int l(int i, byte[] bArr, int i2, int i3, defpackage.alcj alcjVar, defpackage.akyq akyqVar) throws defpackage.alaz {
        if ((i >>> 3) == 0) {
            throw new defpackage.alaz("Protocol message contained an invalid tag (zero).");
        }
        int i4 = i & 7;
        if (i4 == 0) {
            int iP = p(bArr, i2, akyqVar);
            alcjVar.e(i, java.lang.Long.valueOf(akyqVar.b));
            return iP;
        }
        if (i4 == 1) {
            alcjVar.e(i, java.lang.Long.valueOf(t(bArr, i2)));
            return i2 + 8;
        }
        if (i4 == 2) {
            int iF = f(bArr, i2, bArr.length, akyqVar);
            int i5 = akyqVar.a;
            if (i5 == 0) {
                alcjVar.e(i, defpackage.akzc.d);
            } else {
                defpackage.akzc akzcVar = defpackage.akzc.d;
                try {
                    alcjVar.e(i, defpackage.akzc.E(bArr, iF, i5));
                } catch (defpackage.alaz e) {
                    throw new java.lang.AssertionError("Expected no InvalidProtocolBufferException as data UTF8 validity is not checked.", e);
                }
            }
            return i5 + iF;
        }
        if (i4 != 3) {
            if (i4 != 5) {
                throw new defpackage.alaz("Protocol message contained an invalid tag (zero).");
            }
            alcjVar.e(i, java.lang.Integer.valueOf(d(bArr, i2)));
            return i2 + 4;
        }
        defpackage.alcj alcjVar2 = new defpackage.alcj();
        int i6 = (i & (-8)) | 4;
        int i7 = akyqVar.e + 1;
        akyqVar.e = i7;
        if (i7 >= b) {
            throw new defpackage.alaz("Protocol message had too many levels of nesting.  May be malicious.  Use setRecursionLimit() to increase the recursion depth limit.");
        }
        int i8 = 0;
        while (i2 < i3) {
            int iM = m(bArr, i2, akyqVar);
            int i9 = akyqVar.a;
            if (i9 == i6) {
                i8 = i9;
                i2 = iM;
                break;
            }
            i2 = l(i9, bArr, iM, i3, alcjVar2, akyqVar);
            i8 = i9;
        }
        akyqVar.e--;
        if (i2 > i3 || i8 != i6) {
            throw new defpackage.alaz("Failed to parse the message.");
        }
        alcjVar.e(i, alcjVar2);
        return i2;
    }

    static int m(byte[] bArr, int i, defpackage.akyq akyqVar) {
        int i2 = i + 1;
        byte b2 = bArr[i];
        if (b2 < 0) {
            return n(b2, bArr, i2, akyqVar);
        }
        akyqVar.a = b2;
        return i2;
    }

    static int n(int i, byte[] bArr, int i2, defpackage.akyq akyqVar) {
        byte b2 = bArr[i2];
        int i3 = i2 + 1;
        int i4 = i & 127;
        if (b2 >= 0) {
            akyqVar.a = i4 | (b2 << 7);
            return i3;
        }
        int i5 = i4 | ((b2 & 127) << 7);
        int i6 = i2 + 2;
        byte b3 = bArr[i3];
        if (b3 >= 0) {
            akyqVar.a = i5 | (b3 << 14);
            return i6;
        }
        int i7 = i5 | ((b3 & 127) << 14);
        int i8 = i2 + 3;
        byte b4 = bArr[i6];
        if (b4 >= 0) {
            akyqVar.a = i7 | (b4 << 21);
            return i8;
        }
        int i9 = i7 | ((b4 & 127) << 21);
        int i10 = i2 + 4;
        byte b5 = bArr[i8];
        if (b5 >= 0) {
            akyqVar.a = i9 | (b5 << 28);
            return i10;
        }
        int i11 = i9 | ((b5 & 127) << 28);
        while (true) {
            int i12 = i10 + 1;
            if (bArr[i10] >= 0) {
                akyqVar.a = i11;
                return i12;
            }
            i10 = i12;
        }
    }

    static int o(int i, byte[] bArr, int i2, int i3, defpackage.alat alatVar, defpackage.akyq akyqVar) {
        defpackage.alae alaeVar = (defpackage.alae) alatVar;
        int iM = m(bArr, i2, akyqVar);
        alaeVar.g(akyqVar.a);
        while (iM < i3) {
            int iM2 = m(bArr, iM, akyqVar);
            if (i != akyqVar.a) {
                break;
            }
            iM = m(bArr, iM2, akyqVar);
            alaeVar.g(akyqVar.a);
        }
        return iM;
    }

    static int p(byte[] bArr, int i, defpackage.akyq akyqVar) {
        long j = bArr[i];
        int i2 = i + 1;
        if (j >= 0) {
            akyqVar.b = j;
        } else {
            byte b2 = bArr[i2];
            long j2 = (j & 127) | (((long) (b2 & 127)) << 7);
            i2 = i + 2;
            int i3 = 7;
            while (b2 < 0) {
                int i4 = i2 + 1;
                byte b3 = bArr[i2];
                i3 += 7;
                j2 |= ((long) (b3 & 127)) << i3;
                i2 = i4;
                b2 = b3;
            }
            akyqVar.b = j2;
        }
        return i2;
    }

    static int q(java.lang.Object obj, defpackage.albw albwVar, byte[] bArr, int i, int i2, int i3, defpackage.akyq akyqVar) throws defpackage.alaz {
        int i4 = akyqVar.e + 1;
        akyqVar.e = i4;
        u(i4);
        int iC = ((defpackage.albk) albwVar).c(obj, bArr, i, i2, i3, akyqVar);
        akyqVar.e--;
        akyqVar.c = obj;
        return iC;
    }

    static int r(java.lang.Object obj, defpackage.albw albwVar, byte[] bArr, int i, int i2, defpackage.akyq akyqVar) throws defpackage.alaz {
        int iF = f(bArr, i, i2, akyqVar);
        int i3 = akyqVar.a;
        int i4 = akyqVar.e + 1;
        akyqVar.e = i4;
        if (i4 >= b) {
            throw new defpackage.alaz("Protocol message had too many levels of nesting.  May be malicious.  Use setRecursionLimit() to increase the recursion depth limit.");
        }
        int i5 = i3 + iF;
        albwVar.j(obj, bArr, iF, i5, akyqVar);
        akyqVar.e--;
        akyqVar.c = obj;
        return i5;
    }

    static int s(int i, byte[] bArr, int i2, int i3, defpackage.akyq akyqVar) throws defpackage.alaz {
        if ((i >>> 3) == 0) {
            throw new defpackage.alaz("Protocol message contained an invalid tag (zero).");
        }
        int i4 = i & 7;
        if (i4 == 0) {
            return p(bArr, i2, akyqVar);
        }
        if (i4 == 1) {
            return i2 + 8;
        }
        if (i4 == 2) {
            return f(bArr, i2, bArr.length, akyqVar) + akyqVar.a;
        }
        if (i4 != 3) {
            if (i4 == 5) {
                return i2 + 4;
            }
            throw new defpackage.alaz("Protocol message contained an invalid tag (zero).");
        }
        int i5 = (i & (-8)) | 4;
        int i6 = akyqVar.e + 1;
        akyqVar.e = i6;
        u(i6);
        int i7 = 0;
        while (i2 < i3) {
            i2 = m(bArr, i2, akyqVar);
            i7 = akyqVar.a;
            if (i7 == i5) {
                break;
            }
            i2 = s(i7, bArr, i2, i3, akyqVar);
        }
        akyqVar.e--;
        if (i2 > i3 || i7 != i5) {
            throw new defpackage.alaz("Failed to parse the message.");
        }
        return i2;
    }

    static long t(byte[] bArr, int i) {
        return (((long) bArr[i]) & 255) | ((((long) bArr[i + 1]) & 255) << 8) | ((((long) bArr[i + 2]) & 255) << 16) | ((((long) bArr[i + 3]) & 255) << 24) | ((((long) bArr[i + 4]) & 255) << 32) | ((((long) bArr[i + 5]) & 255) << 40) | ((((long) bArr[i + 6]) & 255) << 48) | ((((long) bArr[i + 7]) & 255) << 56);
    }

    private static void u(int i) throws defpackage.alaz {
        if (i >= b) {
            throw new defpackage.alaz("Protocol message had too many levels of nesting.  May be malicious.  Use setRecursionLimit() to increase the recursion depth limit.");
        }
    }
}
