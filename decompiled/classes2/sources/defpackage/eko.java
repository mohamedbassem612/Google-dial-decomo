package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes2.dex */
final class eko {
    public final int a;
    public final int b;
    public final long c;
    public final byte[] d;

    public eko(int i, int i2, long j, byte[] bArr) {
        this.a = i;
        this.b = i2;
        this.c = j;
        this.d = bArr;
    }

    public static defpackage.eko c(java.lang.String str) {
        byte[] bytes = (str + (char) 0).getBytes(defpackage.ekq.h);
        return new defpackage.eko(2, bytes.length, -1L, bytes);
    }

    public static defpackage.eko d(long j, java.nio.ByteOrder byteOrder) {
        return e(new long[]{j}, byteOrder);
    }

    public static defpackage.eko e(long[] jArr, java.nio.ByteOrder byteOrder) {
        java.nio.ByteBuffer byteBufferWrap = java.nio.ByteBuffer.wrap(new byte[defpackage.ekq.f[4] * jArr.length]);
        byteBufferWrap.order(byteOrder);
        int i = 0;
        while (true) {
            int length = jArr.length;
            if (i >= length) {
                return new defpackage.eko(4, length, -1L, byteBufferWrap.array());
            }
            byteBufferWrap.putInt((int) jArr[i]);
            i++;
        }
    }

    public static defpackage.eko f(defpackage.ekp ekpVar, java.nio.ByteOrder byteOrder) {
        return g(new defpackage.ekp[]{ekpVar}, byteOrder);
    }

    public static defpackage.eko g(defpackage.ekp[] ekpVarArr, java.nio.ByteOrder byteOrder) {
        java.nio.ByteBuffer byteBufferWrap = java.nio.ByteBuffer.wrap(new byte[defpackage.ekq.f[5] * ekpVarArr.length]);
        byteBufferWrap.order(byteOrder);
        int i = 0;
        while (true) {
            int length = ekpVarArr.length;
            if (i >= length) {
                return new defpackage.eko(5, length, -1L, byteBufferWrap.array());
            }
            defpackage.ekp ekpVar = ekpVarArr[i];
            byteBufferWrap.putInt((int) ekpVar.a);
            byteBufferWrap.putInt((int) ekpVar.b);
            i++;
        }
    }

    public static defpackage.eko h(int i, java.nio.ByteOrder byteOrder) {
        return i(new int[]{i}, byteOrder);
    }

    public static defpackage.eko i(int[] iArr, java.nio.ByteOrder byteOrder) {
        java.nio.ByteBuffer byteBufferWrap = java.nio.ByteBuffer.wrap(new byte[defpackage.ekq.f[3] * iArr.length]);
        byteBufferWrap.order(byteOrder);
        int i = 0;
        while (true) {
            int length = iArr.length;
            if (i >= length) {
                return new defpackage.eko(3, length, -1L, byteBufferWrap.array());
            }
            byteBufferWrap.putShort((short) iArr[i]);
            i++;
        }
    }

    public final int a(java.nio.ByteOrder byteOrder) throws java.lang.Throwable {
        java.lang.Object objJ = j(byteOrder);
        if (objJ == null) {
            throw new java.lang.NumberFormatException("NULL can't be converted to a integer value");
        }
        if (objJ instanceof java.lang.String) {
            return java.lang.Integer.parseInt((java.lang.String) objJ);
        }
        if (objJ instanceof long[]) {
            long[] jArr = (long[]) objJ;
            if (jArr.length == 1) {
                return (int) jArr[0];
            }
            throw new java.lang.NumberFormatException("There are more than one component");
        }
        if (!(objJ instanceof int[])) {
            throw new java.lang.NumberFormatException("Couldn't find a integer value");
        }
        int[] iArr = (int[]) objJ;
        if (iArr.length == 1) {
            return iArr[0];
        }
        throw new java.lang.NumberFormatException("There are more than one component");
    }

    public final int b() {
        return defpackage.ekq.f[this.a] * this.b;
    }

    /* JADX WARN: Code duplicated, block: B:91:0x012e A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Not initialized variable reg: 3, insn: 0x012b: MOVE (r2 I:??[OBJECT, ARRAY]) = (r3 I:??[OBJECT, ARRAY]) (LINE:300), block:B:81:0x012b */
    /* JADX WARN: Type inference failed for: r11v11, types: [int[]] */
    /* JADX WARN: Type inference failed for: r11v12, types: [long[]] */
    /* JADX WARN: Type inference failed for: r11v13, types: [ekp[]] */
    /* JADX WARN: Type inference failed for: r11v14, types: [int[]] */
    /* JADX WARN: Type inference failed for: r11v15, types: [int[]] */
    /* JADX WARN: Type inference failed for: r11v16, types: [ekp[]] */
    /* JADX WARN: Type inference failed for: r11v17, types: [double[]] */
    /* JADX WARN: Type inference failed for: r11v18 */
    /* JADX WARN: Type inference failed for: r11v19, types: [double[]] */
    /* JADX WARN: Type inference failed for: r11v5, types: [java.lang.String] */
    /* JADX WARN: Type inference failed for: r2v6, types: [java.lang.Object] */
    final java.lang.Object j(java.nio.ByteOrder byteOrder) throws java.lang.Throwable {
        defpackage.ekm ekmVar;
        defpackage.ekm ekmVar2;
        ?? str;
        byte b;
        defpackage.ekm ekmVar3 = null;
        string = null;
        java.lang.String string = null;
        try {
            try {
                ekmVar = new defpackage.ekm(this.d);
                try {
                    ekmVar.c = byteOrder;
                    int i = 0;
                    switch (this.a) {
                        case 1:
                        case 6:
                            byte[] bArr = this.d;
                            if (bArr.length != 1 || (b = bArr[0]) < 0 || b > 1) {
                                str = new java.lang.String(this.d, defpackage.ekq.h);
                                try {
                                    ekmVar.close();
                                    break;
                                } catch (java.io.IOException e) {
                                    android.util.Log.e("ExifInterface", "IOException occurred while closing InputStream", e);
                                }
                                return str;
                            }
                            java.lang.String str2 = new java.lang.String(new char[]{(char) (b + 48)});
                            try {
                                ekmVar.close();
                                break;
                            } catch (java.io.IOException e2) {
                                android.util.Log.e("ExifInterface", "IOException occurred while closing InputStream", e2);
                            }
                            return str2;
                        case 2:
                        case 7:
                            int i2 = this.b;
                            byte[] bArr2 = defpackage.ekq.g;
                            int length = bArr2.length;
                            if (i2 >= 8) {
                                int i3 = 0;
                                while (true) {
                                    int length2 = bArr2.length;
                                    if (i3 >= 8) {
                                        i = 8;
                                    } else if (this.d[i3] == bArr2[i3]) {
                                        i3++;
                                    }
                                }
                            }
                            java.lang.StringBuilder sb = new java.lang.StringBuilder();
                            try {
                                while (i < i2) {
                                    byte b2 = this.d[i];
                                    if (b2 == 0) {
                                        string = sb.toString();
                                        ekmVar.close();
                                        return string;
                                    }
                                    if (b2 >= 32) {
                                        sb.append((char) b2);
                                    } else {
                                        sb.append('?');
                                    }
                                    i++;
                                }
                                ekmVar.close();
                                return string;
                            } catch (java.io.IOException e3) {
                                android.util.Log.e("ExifInterface", "IOException occurred while closing InputStream", e3);
                                return string;
                            }
                            string = sb.toString();
                        case 3:
                            int i4 = this.b;
                            str = new int[i4];
                            while (i < i4) {
                                str[i] = ekmVar.readUnsignedShort();
                                i++;
                            }
                            ekmVar.close();
                            return str;
                        case 4:
                            int i5 = this.b;
                            str = new long[i5];
                            while (i < i5) {
                                str[i] = ekmVar.a();
                                i++;
                            }
                            ekmVar.close();
                            return str;
                        case 5:
                            int i6 = this.b;
                            str = new defpackage.ekp[i6];
                            while (i < i6) {
                                str[i] = new defpackage.ekp(ekmVar.a(), ekmVar.a());
                                i++;
                            }
                            ekmVar.close();
                            return str;
                        case 8:
                            int i7 = this.b;
                            str = new int[i7];
                            while (i < i7) {
                                str[i] = ekmVar.readShort();
                                i++;
                            }
                            ekmVar.close();
                            return str;
                        case 9:
                            int i8 = this.b;
                            str = new int[i8];
                            while (i < i8) {
                                str[i] = ekmVar.readInt();
                                i++;
                            }
                            ekmVar.close();
                            return str;
                        case 10:
                            int i9 = this.b;
                            str = new defpackage.ekp[i9];
                            while (i < i9) {
                                str[i] = new defpackage.ekp(ekmVar.readInt(), ekmVar.readInt());
                                i++;
                            }
                            ekmVar.close();
                            return str;
                        case 11:
                            int i10 = this.b;
                            str = new double[i10];
                            while (i < i10) {
                                str[i] = ekmVar.readFloat();
                                i++;
                            }
                            ekmVar.close();
                            return str;
                        case 12:
                            int i11 = this.b;
                            str = new double[i11];
                            while (i < i11) {
                                str[i] = ekmVar.readDouble();
                                i++;
                            }
                            ekmVar.close();
                            return str;
                        default:
                            ekmVar.close();
                            return string;
                    }
                } catch (java.io.IOException e4) {
                    e = e4;
                    android.util.Log.w("ExifInterface", "IOException occurred during reading a value", e);
                    if (ekmVar == null) {
                        return null;
                    }
                }
            } catch (java.lang.Throwable th) {
                th = th;
                ekmVar3 = ekmVar2;
                if (ekmVar3 != null) {
                    try {
                        ekmVar3.close();
                    } catch (java.io.IOException e5) {
                        android.util.Log.e("ExifInterface", "IOException occurred while closing InputStream", e5);
                    }
                }
                throw th;
            }
        } catch (java.io.IOException e6) {
            e = e6;
            ekmVar = null;
        } catch (java.lang.Throwable th2) {
            th = th2;
            if (ekmVar3 != null) {
                ekmVar3.close();
            }
            throw th;
        }
    }

    public final java.lang.String k(java.nio.ByteOrder byteOrder) throws java.lang.Throwable {
        java.lang.Object objJ = j(byteOrder);
        if (objJ != null) {
            if (objJ instanceof java.lang.String) {
                return (java.lang.String) objJ;
            }
            java.lang.StringBuilder sb = new java.lang.StringBuilder();
            int i = 0;
            if (!(objJ instanceof long[])) {
                if (!(objJ instanceof int[])) {
                    if (!(objJ instanceof double[])) {
                        if (objJ instanceof defpackage.ekp[]) {
                            defpackage.ekp[] ekpVarArr = (defpackage.ekp[]) objJ;
                            while (true) {
                                int length = ekpVarArr.length;
                                if (i >= length) {
                                    break;
                                }
                                sb.append(ekpVarArr[i].a);
                                sb.append('/');
                                sb.append(ekpVarArr[i].b);
                                i++;
                                if (i != length) {
                                    sb.append(',');
                                }
                            }
                        }
                    } else {
                        double[] dArr = (double[]) objJ;
                        while (true) {
                            int length2 = dArr.length;
                            if (i >= length2) {
                                break;
                            }
                            sb.append(dArr[i]);
                            i++;
                            if (i != length2) {
                                sb.append(',');
                            }
                        }
                    }
                } else {
                    int[] iArr = (int[]) objJ;
                    while (true) {
                        int length3 = iArr.length;
                        if (i >= length3) {
                            break;
                        }
                        sb.append(iArr[i]);
                        i++;
                        if (i != length3) {
                            sb.append(',');
                        }
                    }
                }
            } else {
                long[] jArr = (long[]) objJ;
                while (true) {
                    int length4 = jArr.length;
                    if (i >= length4) {
                        break;
                    }
                    sb.append(jArr[i]);
                    i++;
                    if (i != length4) {
                        sb.append(',');
                    }
                }
            }
            return sb.toString();
        }
        return null;
    }

    public final java.lang.String toString() {
        return "(" + defpackage.ekq.e[this.a] + ", data length:" + this.d.length + ')';
    }
}
