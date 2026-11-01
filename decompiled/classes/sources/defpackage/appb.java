package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes.dex */
public class appb implements java.io.Serializable, java.lang.Comparable {
    public static final defpackage.appb a = new defpackage.appb(new byte[0]);
    private static final long serialVersionUID = 1;
    public final byte[] b;
    public transient int c;
    public transient java.lang.String d;

    public appb(byte[] bArr) {
        if (bArr == null) {
            defpackage.aooh.i("data");
        }
        this.b = bArr;
    }

    public static /* synthetic */ int q(defpackage.appb appbVar, defpackage.appb appbVar2) {
        int iC = appbVar.c();
        defpackage.aooh.f(appbVar2, "other");
        return appbVar.f(appbVar2.b, iC);
    }

    private final void readObject(java.io.ObjectInputStream objectInputStream) throws java.lang.IllegalAccessException, java.lang.NoSuchFieldException, java.io.IOException {
        int i = objectInputStream.readInt();
        defpackage.aooh.f(objectInputStream, "<this>");
        if (i < 0) {
            throw new java.lang.IllegalArgumentException(defpackage.a.bj(i, "byteCount < 0: "));
        }
        byte[] bArr = new byte[i];
        int i2 = 0;
        while (i2 < i) {
            int i3 = objectInputStream.read(bArr, i2, i - i2);
            if (i3 == -1) {
                throw new java.io.EOFException();
            }
            i2 += i3;
        }
        defpackage.appb appbVar = new defpackage.appb(bArr);
        java.lang.reflect.Field declaredField = defpackage.appb.class.getDeclaredField("b");
        declaredField.setAccessible(true);
        declaredField.set(this, appbVar.b);
    }

    public static /* synthetic */ defpackage.appb s(defpackage.appb appbVar, int i, int i2, int i3) {
        if ((i3 & 2) != 0) {
            i2 = appbVar.c();
        }
        if (1 == (i3 & 1)) {
            i = 0;
        }
        return appbVar.j(i, i2);
    }

    private final void writeObject(java.io.ObjectOutputStream objectOutputStream) throws java.io.IOException {
        objectOutputStream.writeInt(this.b.length);
        objectOutputStream.write(this.b);
    }

    public byte a(int i) {
        return this.b[i];
    }

    /* JADX WARN: Code restructure failed: missing block: B:10:0x002a, code lost:
    
        if (r7 >= r8) goto L14;
     */
    /* JADX WARN: Code restructure failed: missing block: B:13:0x002f, code lost:
    
        if (r0 >= r1) goto L14;
     */
    /* JADX WARN: Code restructure failed: missing block: B:16:0x0034, code lost:
    
        return -1;
     */
    /* JADX WARN: Code restructure failed: missing block: B:20:?, code lost:
    
        return 1;
     */
    @Override // java.lang.Comparable
    /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final int compareTo(defpackage.appb r10) {
        /*
            r9 = this;
            if (r10 != 0) goto L7
            java.lang.String r0 = "other"
            defpackage.aooh.i(r0)
        L7:
            int r0 = r9.c()
            int r1 = r10.c()
            int r2 = java.lang.Math.min(r0, r1)
            r3 = 0
            r4 = r3
        L15:
            r5 = -1
            r6 = 1
            if (r4 >= r2) goto L2d
            byte r7 = r9.a(r4)
            r7 = r7 & 255(0xff, float:3.57E-43)
            byte r8 = r10.a(r4)
            r8 = r8 & 255(0xff, float:3.57E-43)
            if (r7 != r8) goto L2a
            int r4 = r4 + 1
            goto L15
        L2a:
            if (r7 < r8) goto L33
            goto L31
        L2d:
            if (r0 == r1) goto L34
            if (r0 < r1) goto L33
        L31:
            r3 = r6
            goto L34
        L33:
            r3 = r5
        L34:
            return r3
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.appb.compareTo(appb):int");
    }

    public int c() {
        return this.b.length;
    }

    public final int d(defpackage.appb appbVar, int i) {
        defpackage.aooh.f(appbVar, "other");
        return e(appbVar.b, i);
    }

    public int e(byte[] bArr, int i) {
        defpackage.aooh.f(bArr, "other");
        int length = this.b.length - bArr.length;
        int iMax = java.lang.Math.max(i, 0);
        if (iMax > length) {
            return -1;
        }
        while (!defpackage.aoov.aW(this.b, iMax, bArr, 0, bArr.length)) {
            if (iMax == length) {
                return -1;
            }
            iMax++;
        }
        return iMax;
    }

    public boolean equals(java.lang.Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof defpackage.appb) {
            defpackage.appb appbVar = (defpackage.appb) obj;
            int iC = appbVar.c();
            byte[] bArr = this.b;
            int length = bArr.length;
            if (iC == length && appbVar.l(0, bArr, 0, length)) {
                return true;
            }
        }
        return false;
    }

    public int f(byte[] bArr, int i) {
        defpackage.aooh.f(bArr, "other");
        for (int iMin = java.lang.Math.min(i, this.b.length - bArr.length); iMin >= 0; iMin--) {
            if (defpackage.aoov.aW(this.b, iMin, bArr, 0, bArr.length)) {
                return iMin;
            }
        }
        return -1;
    }

    public java.lang.String g() {
        byte[] bArr = this.b;
        char[] cArr = new char[bArr.length << 1];
        int i = 0;
        for (byte b : bArr) {
            char[] cArr2 = defpackage.apqi.a;
            cArr[i] = cArr2[(b >> 4) & 15];
            cArr[i + 1] = cArr2[b & 15];
            i += 2;
        }
        return new java.lang.String(cArr);
    }

    public java.lang.String h(java.nio.charset.Charset charset) {
        defpackage.aooh.f(charset, "charset");
        return new java.lang.String(this.b, charset);
    }

    public int hashCode() {
        int i = this.c;
        if (i != 0) {
            return i;
        }
        int iHashCode = java.util.Arrays.hashCode(this.b);
        this.c = iHashCode;
        return iHashCode;
    }

    public final java.lang.String i() {
        java.lang.String str = this.d;
        if (str != null) {
            return str;
        }
        byte[] bArrN = n();
        if (bArrN == null) {
            defpackage.aooh.i("<this>");
        }
        java.lang.String str2 = new java.lang.String(bArrN, defpackage.aoqv.a);
        this.d = str2;
        return str2;
    }

    public defpackage.appb j(int i, int i2) {
        if (i < 0) {
            throw new java.lang.IllegalArgumentException("beginIndex < 0");
        }
        byte[] bArr = this.b;
        int length = bArr.length;
        if (i2 > length) {
            throw new java.lang.IllegalArgumentException(defpackage.a.bw((byte) 41, length, "endIndex > length("));
        }
        if (i2 - i >= 0) {
            return (i == 0 && i2 == length) ? this : new defpackage.appb(defpackage.ajsz.cy(bArr, i, i2));
        }
        throw new java.lang.IllegalArgumentException("endIndex < beginIndex");
    }

    public defpackage.appb k() {
        int i = 0;
        while (true) {
            byte[] bArr = this.b;
            int length = bArr.length;
            if (i >= length) {
                return this;
            }
            int i2 = i + 1;
            byte b = bArr[i];
            if (b >= 65 && b <= 90) {
                byte[] bArrCopyOf = java.util.Arrays.copyOf(bArr, length);
                defpackage.aooh.e(bArrCopyOf, "copyOf(...)");
                bArrCopyOf[i] = (byte) (b + 32);
                while (i2 < bArrCopyOf.length) {
                    int i3 = i2 + 1;
                    byte b2 = bArrCopyOf[i2];
                    if (b2 >= 65 && b2 <= 90) {
                        bArrCopyOf[i2] = (byte) (b2 + 32);
                    }
                    i2 = i3;
                }
                return new defpackage.appb(bArrCopyOf);
            }
            i = i2;
        }
    }

    public boolean l(int i, byte[] bArr, int i2, int i3) {
        if (bArr == null) {
            defpackage.aooh.i("other");
        }
        if (i >= 0) {
            byte[] bArr2 = this.b;
            if (i <= bArr2.length - i3 && i2 >= 0 && i2 <= bArr.length - i3 && defpackage.aoov.aW(bArr2, i, bArr, i2, i3)) {
                return true;
            }
        }
        return false;
    }

    public final boolean m(defpackage.appb appbVar) {
        if (appbVar == null) {
            defpackage.aooh.i("prefix");
        }
        return r(0, appbVar, appbVar.c());
    }

    public byte[] n() {
        return this.b;
    }

    public byte[] o() {
        byte[] bArr = this.b;
        byte[] bArrCopyOf = java.util.Arrays.copyOf(bArr, bArr.length);
        defpackage.aooh.e(bArrCopyOf, "copyOf(...)");
        return bArrCopyOf;
    }

    public final java.lang.String p() {
        byte[] bArr = apos.a;
        byte[] bArr2 = this.b;
        defpackage.aooh.f(bArr2, "<this>");
        defpackage.aooh.f(bArr, "map");
        int length = bArr2.length;
        int i = length + 2;
        int i2 = length - (length % 3);
        byte[] bArr3 = new byte[(i / 3) << 2];
        int i3 = 0;
        int i4 = 0;
        while (i3 < i2) {
            int i5 = i4 + 3;
            byte b = bArr2[i3];
            int i6 = i3 + 2;
            byte b2 = bArr2[i3 + 1];
            i3 += 3;
            byte b3 = bArr2[i6];
            bArr3[i4] = bArr[(b & 255) >> 2];
            bArr3[i4 + 1] = bArr[((b & 3) << 4) | ((b2 & 255) >> 4)];
            bArr3[i4 + 2] = bArr[((b2 & 15) << 2) | ((b3 & 255) >> 6)];
            i4 += 4;
            bArr3[i5] = bArr[b3 & 63];
        }
        int length2 = bArr2.length - i2;
        if (length2 == 1) {
            byte b4 = bArr2[i3];
            bArr3[i4] = bArr[(b4 & 255) >> 2];
            bArr3[i4 + 1] = bArr[(b4 & 3) << 4];
            bArr3[i4 + 2] = 61;
            bArr3[i4 + 3] = 61;
        } else if (length2 == 2) {
            int i7 = i3 + 1;
            byte b5 = bArr2[i3];
            byte b6 = bArr2[i7];
            bArr3[i4] = bArr[(b5 & 255) >> 2];
            bArr3[i4 + 1] = bArr[((b5 & 3) << 4) | ((b6 & 255) >> 4)];
            bArr3[i4 + 2] = bArr[(b6 & 15) << 2];
            bArr3[i4 + 3] = 61;
        }
        return new java.lang.String(bArr3, defpackage.aoqv.a);
    }

    public boolean r(int i, defpackage.appb appbVar, int i2) {
        if (appbVar == null) {
            defpackage.aooh.i("other");
        }
        return appbVar.l(0, this.b, i, i2);
    }

    public void t(defpackage.apoy apoyVar, int i) {
        char[] cArr = defpackage.apqi.a;
        apoyVar.L(this.b, 0, i);
    }

    /* JADX WARN: Code duplicated, block: B:119:0x0136 A[EDGE_INSN: B:119:0x0136->B:120:0x0137 BREAK  A[LOOP:0: B:7:0x000f->B:163:0x000f]] */
    public java.lang.String toString() {
        int i;
        byte[] bArr = this.b;
        int length = bArr.length;
        if (length == 0) {
            return "[size=0]";
        }
        char[] cArr = defpackage.apqi.a;
        int i2 = 0;
        int i3 = 0;
        int i4 = 0;
        loop0: while (i2 < length) {
            byte b = bArr[i2];
            if (b < 0) {
                if ((b >> 5) != -2) {
                    if ((b >> 4) != -2) {
                        if ((b >> 3) != -2) {
                            if (i3 == 64) {
                                break;
                            }
                            i4 = -1;
                            break;
                        }
                        int i5 = i2 + 3;
                        if (length > i5) {
                            byte b2 = bArr[i2 + 1];
                            if ((b2 & 192) != 128) {
                                if (i3 == 64) {
                                    break;
                                }
                                i4 = -1;
                                break;
                            }
                            byte b3 = bArr[i2 + 2];
                            if ((b3 & 192) != 128) {
                                if (i3 == 64) {
                                    break;
                                }
                                i4 = -1;
                                break;
                            }
                            byte b4 = bArr[i5];
                            if ((b4 & 192) != 128) {
                                if (i3 == 64) {
                                    break;
                                }
                                i4 = -1;
                                break;
                            }
                            int i6 = (((b4 ^ 3678080) ^ (b3 << 6)) ^ (b2 << 12)) ^ (b << 18);
                            if (i6 <= 1114111) {
                                if (i6 >= 55296 && i6 < 57344) {
                                    if (i3 == 64) {
                                        break;
                                    }
                                    i4 = -1;
                                    break;
                                }
                                if (i6 >= 65536) {
                                    i = i3 + 1;
                                    if (i3 == 64) {
                                        break;
                                    }
                                    i4 += 2;
                                    i2 += 4;
                                    i3 = i;
                                } else {
                                    if (i3 == 64) {
                                        break;
                                    }
                                    i4 = -1;
                                    break;
                                }
                            } else {
                                if (i3 == 64) {
                                    break;
                                }
                                i4 = -1;
                                break;
                            }
                        } else {
                            if (i3 == 64) {
                                break;
                            }
                            i4 = -1;
                            break;
                        }
                    } else {
                        int i7 = i2 + 2;
                        if (length > i7) {
                            byte b5 = bArr[i2 + 1];
                            if ((b5 & 192) != 128) {
                                if (i3 == 64) {
                                    break;
                                }
                                i4 = -1;
                                break;
                            }
                            byte b6 = bArr[i7];
                            if ((b6 & 192) != 128) {
                                if (i3 == 64) {
                                    break;
                                }
                                i4 = -1;
                                break;
                            }
                            int i8 = ((b6 ^ (-123008)) ^ (b5 << 6)) ^ (b << 12);
                            if (i8 >= 2048) {
                                if (i8 >= 55296 && i8 < 57344) {
                                    if (i3 == 64) {
                                        break;
                                    }
                                    i4 = -1;
                                    break;
                                }
                                i = i3 + 1;
                                if (i3 != 64) {
                                    if (i8 == 65533) {
                                        i4 = -1;
                                        break;
                                    }
                                    i2 += 3;
                                    i4 += i8 < 65536 ? 1 : 2;
                                    i3 = i;
                                } else {
                                    break;
                                }
                            } else {
                                if (i3 == 64) {
                                    break;
                                }
                                i4 = -1;
                                break;
                            }
                        } else {
                            if (i3 == 64) {
                                break;
                            }
                            i4 = -1;
                            break;
                        }
                    }
                } else {
                    int i9 = i2 + 1;
                    if (length > i9) {
                        byte b7 = bArr[i9];
                        if ((b7 & 192) != 128) {
                            if (i3 == 64) {
                                break;
                            }
                            i4 = -1;
                            break;
                        }
                        int i10 = (b7 ^ 3968) ^ (b << 6);
                        if (i10 < 128) {
                            if (i3 == 64) {
                                break;
                            }
                            i4 = -1;
                            break;
                        }
                        int i11 = i3 + 1;
                        if (i3 == 64) {
                            break;
                        }
                        if (i10 < 160 || i10 == 65533) {
                            i4 = -1;
                            break;
                        }
                        i2 += 2;
                        i4 += i10 < 65536 ? 1 : 2;
                        i3 = i11;
                    } else {
                        if (i3 == 64) {
                            break;
                        }
                        i4 = -1;
                        break;
                    }
                }
            } else {
                i = i3 + 1;
                if (i3 != 64) {
                    if (b == 10 || b == 13 || (b >= 32 && b < 127)) {
                        i4++;
                        i2++;
                        while (true) {
                            if (i2 < length) {
                                byte b8 = bArr[i2];
                                if (b8 >= 0) {
                                    i2++;
                                    int i12 = i + 1;
                                    if (i == 64) {
                                        break loop0;
                                    }
                                    if (b8 == 10 || b8 == 13 || (b8 >= 32 && b8 < 127)) {
                                        i4++;
                                        i = i12;
                                    }
                                }
                            }
                            i3 = i;
                        }
                    }
                    i4 = -1;
                    break;
                }
                break;
            }
        }
        if (i4 != -1) {
            java.lang.String strI = i();
            java.lang.String strSubstring = strI.substring(0, i4);
            defpackage.aooh.e(strSubstring, "substring(...)");
            java.lang.String strQ = defpackage.aoov.Q(defpackage.aoov.Q(defpackage.aoov.Q(strSubstring, "\\", "\\\\"), "\n", "\\n"), "\r", "\\r");
            if (i4 >= strI.length()) {
                return defpackage.a.bp((byte) 93, strQ, "[text=");
            }
            return "[size=" + this.b.length + " text=" + strQ + "…]";
        }
        byte[] bArr2 = this.b;
        int length2 = bArr2.length;
        if (length2 <= 64) {
            return "[hex=" + g() + ']';
        }
        return "[size=" + length2 + " hex=" + new defpackage.appb(defpackage.ajsz.cy(bArr2, 0, 64)).g() + "…]";
    }
}
