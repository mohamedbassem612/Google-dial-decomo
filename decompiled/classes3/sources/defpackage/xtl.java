package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes3.dex */
public final class xtl implements defpackage.xth {
    private static final java.lang.String k = "xtl";
    public java.nio.ByteBuffer a;
    public byte[] b;
    public byte[] c;
    public int[] d;
    public int e;
    public android.graphics.Bitmap g;
    public java.lang.Boolean h;
    public final defpackage.uyg j;
    private int[] l;
    private short[] n;
    private byte[] o;
    private byte[] p;
    private boolean q;
    private int r;
    private int s;
    private int t;
    private int u;
    private final int[] m = new int[256];
    public android.graphics.Bitmap.Config i = android.graphics.Bitmap.Config.ARGB_8888;
    public defpackage.xtj f = new defpackage.xtj();

    public xtl(defpackage.uyg uygVar, defpackage.xtj xtjVar, java.nio.ByteBuffer byteBuffer, int i) {
        this.j = uygVar;
        c(xtjVar, byteBuffer, i);
    }

    private final int d() {
        return this.a.get() & 255;
    }

    /* JADX WARN: Type inference failed for: r1v1, types: [java.lang.Object, xxm] */
    private final android.graphics.Bitmap e() {
        java.lang.Boolean bool = this.h;
        android.graphics.Bitmap.Config config = (bool == null || bool.booleanValue()) ? android.graphics.Bitmap.Config.ARGB_8888 : this.i;
        android.graphics.Bitmap bitmapB = this.j.a.b(this.u, this.t, config);
        bitmapB.setHasAlpha(true);
        return bitmapB;
    }

    /* JADX WARN: Code duplicated, block: B:63:0x00f2  */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r6v10 */
    /* JADX WARN: Type inference failed for: r6v11 */
    /* JADX WARN: Type inference failed for: r6v12 */
    /* JADX WARN: Type inference failed for: r6v15, types: [short] */
    /* JADX WARN: Type inference failed for: r6v17 */
    @Override // defpackage.xth
    public final synchronized android.graphics.Bitmap a() {
        int i;
        byte b;
        int i2;
        int i3;
        int i4;
        int i5;
        int i6;
        int i7;
        short s;
        int i8;
        android.graphics.Bitmap bitmap;
        int i9;
        if (this.f.c <= 0 || this.e < 0) {
            java.lang.String str = k;
            if (android.util.Log.isLoggable(str, 3)) {
                android.util.Log.d(str, "Unable to decode frame, frameCount=" + this.f.c + ", framePointer=" + this.e);
            }
            this.r = 1;
        }
        int i10 = this.r;
        if (i10 == 1 || i10 == 2) {
            java.lang.String str2 = k;
            if (android.util.Log.isLoggable(str2, 3)) {
                android.util.Log.d(str2, "Unable to decode frame, status=" + this.r);
            }
            return null;
        }
        byte b2 = 0;
        this.r = 0;
        if (this.b == null) {
            this.b = this.j.j(255);
        }
        defpackage.xti xtiVar = (defpackage.xti) this.f.e.get(this.e);
        int i11 = -1;
        int i12 = this.e - 1;
        defpackage.xti xtiVar2 = i12 >= 0 ? (defpackage.xti) this.f.e.get(i12) : null;
        int[] iArr = xtiVar.k;
        if (iArr == null) {
            iArr = this.f.a;
        }
        this.l = iArr;
        if (iArr == null) {
            java.lang.String str3 = k;
            if (android.util.Log.isLoggable(str3, 3)) {
                android.util.Log.d(str3, "No valid color table found for frame #" + this.e);
            }
            this.r = 1;
            return null;
        }
        if (xtiVar.f) {
            int[] iArr2 = this.m;
            java.lang.System.arraycopy(iArr, 0, iArr2, 0, 256);
            this.l = iArr2;
            iArr2[xtiVar.h] = 0;
            if (xtiVar.g == 2 && this.e == 0) {
                this.h = java.lang.Boolean.TRUE;
            }
        }
        int[] iArr3 = this.d;
        if (xtiVar2 == null) {
            android.graphics.Bitmap bitmap2 = this.g;
            if (bitmap2 != null) {
                this.j.h(bitmap2);
            }
            this.g = null;
            java.util.Arrays.fill(iArr3, 0);
        }
        if (xtiVar2 != null && xtiVar2.g == 3 && this.g == null) {
            java.util.Arrays.fill(iArr3, 0);
        }
        if (xtiVar2 != null && (i8 = xtiVar2.g) > 0) {
            if (i8 == 2) {
                if (xtiVar.f) {
                    i9 = 0;
                } else {
                    defpackage.xtj xtjVar = this.f;
                    i9 = xtjVar.l;
                    if (xtiVar.k != null && xtjVar.j == xtiVar.h) {
                        i9 = 0;
                    }
                }
                int i13 = xtiVar2.d;
                int i14 = this.s;
                int i15 = i13 / i14;
                int i16 = xtiVar2.b / i14;
                int i17 = xtiVar2.c / i14;
                int i18 = xtiVar2.a / i14;
                int i19 = this.u;
                int i20 = (i16 * i19) + i18;
                int i21 = i15 * i19;
                int i22 = i20;
                while (i22 < i20 + i21) {
                    int i23 = i22 + i17;
                    for (int i24 = i22; i24 < i23; i24++) {
                        iArr3[i24] = i9;
                    }
                    i22 += this.u;
                }
            } else if (i8 == 3 && (bitmap = this.g) != null) {
                int i25 = this.u;
                bitmap.getPixels(iArr3, 0, i25, 0, 0, i25, this.t);
            }
        }
        if (xtiVar != null) {
            this.a.position(xtiVar.j);
            i = xtiVar.c * xtiVar.d;
        } else {
            defpackage.xtj xtjVar2 = this.f;
            i = xtjVar2.g * xtjVar2.f;
        }
        byte[] bArrJ = this.c;
        if (bArrJ == null || bArrJ.length < i) {
            bArrJ = this.j.j(i);
            this.c = bArrJ;
        }
        short[] sArr = this.n;
        if (sArr == null) {
            sArr = new short[4096];
            this.n = sArr;
        }
        byte[] bArr = this.o;
        if (bArr == null) {
            bArr = new byte[4096];
            this.o = bArr;
        }
        byte[] bArr2 = this.p;
        if (bArr2 == null) {
            bArr2 = new byte[4097];
            this.p = bArr2;
        }
        int iD = d();
        int i26 = 1 << iD;
        int i27 = i26 + 1;
        int i28 = i26 + 2;
        int i29 = iD + 1;
        int i30 = (1 << i29) - 1;
        int i31 = 0;
        while (i31 < i26) {
            sArr[i31] = 0;
            bArr[i31] = (byte) i31;
            i31++;
            i11 = i11;
        }
        int i32 = i11;
        byte[] bArr3 = this.b;
        int i33 = 0;
        int i34 = 0;
        int i35 = 0;
        int i36 = 0;
        int i37 = 0;
        int i38 = 0;
        int i39 = 0;
        int i40 = 0;
        int i41 = i29;
        int i42 = i28;
        int i43 = i30;
        int i44 = i32;
        while (true) {
            if (i33 >= i) {
                b = b2;
                break;
            }
            if (i34 == 0) {
                int iD2 = d();
                if (iD2 <= 0) {
                    i34 = b2;
                } else {
                    java.nio.ByteBuffer byteBuffer = this.a;
                    i34 = iD2;
                    byteBuffer.get(this.b, 0, java.lang.Math.min(iD2, byteBuffer.remaining()));
                }
                if (i34 <= 0) {
                    this.r = 3;
                    b = 0;
                    break;
                }
                i37 = 0;
            } else {
                i33 = i33;
                sArr = sArr;
            }
            i36 += (bArr3[i37] & 255) << i35;
            i37++;
            i34--;
            int i45 = i35 + 8;
            int i46 = i42;
            i41 = i41;
            i39 = i39;
            i33 = i33;
            while (true) {
                int i47 = i45;
                if (i45 < i41) {
                    i35 = i47;
                    b2 = 0;
                    i32 = -1;
                    break;
                }
                int i48 = i36 & i43;
                i36 >>= i41;
                i45 = i47 - i41;
                if (i48 == i26) {
                    i41 = i29;
                    i46 = i28;
                    i43 = i30;
                    i44 = i32;
                    i45 = i45;
                } else {
                    if (i48 == i27) {
                        i35 = i45;
                        b2 = 0;
                        break;
                    }
                    i33++;
                    int i49 = i38 + 1;
                    int i50 = i27;
                    if (i44 == i32) {
                        bArrJ[i38] = bArr[i48];
                        i39 = i48;
                        i44 = i39;
                        i38 = i49;
                    } else {
                        if (i48 >= i46) {
                            bArr2[i40] = (byte) i39;
                            i40++;
                            s = i44;
                        } else {
                            s = i48;
                        }
                        while (s >= i26) {
                            bArr2[i40] = bArr[s];
                            s = sArr[s];
                            i40++;
                        }
                        int i51 = bArr[s] & 255;
                        byte b3 = (byte) i51;
                        bArrJ[i38] = b3;
                        i38 = i49;
                        while (i40 > 0) {
                            i40--;
                            bArrJ[i38] = bArr2[i40];
                            i33++;
                            i38++;
                        }
                        if (i46 < 4096) {
                            sArr[i46] = (short) i44;
                            bArr[i46] = b3;
                            i46++;
                            if ((i46 & i43) == 0 && i46 < 4096) {
                                i43 += i46;
                                i41++;
                            }
                        }
                        i39 = i51;
                        i44 = i48;
                    }
                    i27 = i50;
                    i32 = -1;
                }
            }
            i42 = i46;
        }
        java.util.Arrays.fill(bArrJ, i38, i, b);
        if (xtiVar.e || this.s != 1) {
            int[] iArr4 = this.d;
            int i52 = xtiVar.d;
            int i53 = this.s;
            int i54 = i52 / i53;
            int i55 = xtiVar.b / i53;
            int i56 = xtiVar.c / i53;
            int i57 = xtiVar.a / i53;
            int i58 = this.e;
            int i59 = this.u;
            int i60 = this.t;
            byte[] bArr4 = this.c;
            int[] iArr5 = this.l;
            java.lang.Boolean bool = this.h;
            int i61 = 8;
            int i62 = 0;
            int i63 = 0;
            int i64 = 1;
            while (i63 < i54) {
                int i65 = i55;
                if (xtiVar.e) {
                    if (i62 >= i54) {
                        int i66 = i64 + 1;
                        i2 = i62;
                        if (i66 == 2) {
                            i2 = 4;
                            i64 = i66;
                        } else if (i66 != 3) {
                            i64 = i66;
                            if (i66 == 4) {
                                i61 = 2;
                                i2 = 1;
                            }
                        } else {
                            i61 = 4;
                            i64 = i66;
                            i2 = 2;
                        }
                    } else {
                        i2 = i62;
                    }
                    i62 = i2 + i61;
                } else {
                    i2 = i63;
                }
                int i67 = i2 + i65;
                if (i67 < i60) {
                    int i68 = i67 * i59;
                    int i69 = i68 + i57;
                    i3 = i62;
                    int i70 = i69 + i56;
                    int i71 = i68 + i59;
                    i4 = i54;
                    int i72 = i63 * i53 * xtiVar.c;
                    if (i71 < i70) {
                        i70 = i71;
                    }
                    if (i53 == 1) {
                        int i73 = i69;
                        while (i73 < i70) {
                            int i74 = i73;
                            int i75 = iArr5[bArr4[i72] & 255];
                            if (i75 != 0) {
                                iArr4[i74] = i75;
                            } else if (i58 == 0 && bool == null) {
                                bool = java.lang.Boolean.TRUE;
                            }
                            i73 = i74 + 1;
                            i72++;
                        }
                    } else {
                        int i76 = i72 + ((i70 - i69) * i53);
                        int i77 = i69;
                        while (i77 < i70) {
                            int i78 = i70;
                            int i79 = xtiVar.c;
                            int i80 = i53;
                            int i81 = i72;
                            int i82 = 0;
                            int i83 = 0;
                            int i84 = 0;
                            int i85 = 0;
                            int i86 = 0;
                            while (true) {
                                if (i81 >= i72 + this.s) {
                                    i5 = i77;
                                    break;
                                }
                                byte[] bArr5 = this.c;
                                i5 = i77;
                                if (i81 >= bArr5.length || i81 >= i76) {
                                    break;
                                }
                                int i87 = this.l[bArr5[i81] & 255];
                                if (i87 != 0) {
                                    i82 += (i87 >> 24) & 255;
                                    i83 += (i87 >> 16) & 255;
                                    i84 += (i87 >> 8) & 255;
                                    i85 += i87 & 255;
                                    i86++;
                                }
                                i81++;
                                i77 = i5;
                            }
                            int i88 = i72 + i79;
                            int i89 = i88;
                            while (i89 < this.s + i88) {
                                byte[] bArr6 = this.c;
                                int i90 = i88;
                                if (i89 >= bArr6.length || i89 >= i76) {
                                    break;
                                }
                                int i91 = this.l[bArr6[i89] & 255];
                                if (i91 != 0) {
                                    i82 += (i91 >> 24) & 255;
                                    i83 += (i91 >> 16) & 255;
                                    i84 += (i91 >> 8) & 255;
                                    i85 += i91 & 255;
                                    i86++;
                                }
                                i89++;
                                i88 = i90;
                                i76 = i76;
                            }
                            int i92 = i76;
                            int i93 = i86 == 0 ? 0 : ((i82 / i86) << 24) | ((i83 / i86) << 16) | ((i84 / i86) << 8) | (i85 / i86);
                            if (i93 != 0) {
                                iArr4[i5] = i93;
                            } else if (i58 == 0 && bool == null) {
                                bool = java.lang.Boolean.TRUE;
                            }
                            i72 += i80;
                            i77 = i5 + 1;
                            i70 = i78;
                            i53 = i80;
                            i76 = i92;
                        }
                    }
                } else {
                    i3 = i62;
                    i4 = i54;
                }
                i63++;
                i55 = i65;
                i62 = i3;
                i54 = i4;
                i53 = i53;
            }
            if (this.h == null) {
                this.h = java.lang.Boolean.valueOf(bool == null ? false : bool.booleanValue());
            }
        } else {
            int[] iArr6 = this.d;
            int i94 = xtiVar.d;
            int i95 = xtiVar.b;
            int i96 = xtiVar.c;
            int i97 = xtiVar.a;
            int i98 = this.e;
            int i99 = this.u;
            byte[] bArr7 = this.c;
            int[] iArr7 = this.l;
            int i100 = b;
            byte b4 = -1;
            while (i100 < i94) {
                int i101 = (i100 + i95) * i99;
                int i102 = i101 + i97;
                int i103 = i102 + i96;
                int i104 = i101 + i99;
                int[] iArr8 = iArr6;
                int i105 = xtiVar.c * i100;
                int i106 = i102;
                while (true) {
                    i7 = i94;
                    if (i106 < (i104 < i103 ? i104 : i103)) {
                        byte b5 = bArr7[i105];
                        int i107 = i106;
                        int i108 = b5 & 255;
                        if (i108 != b4) {
                            int i109 = iArr7[i108];
                            if (i109 != 0) {
                                iArr8[i107] = i109;
                            } else {
                                b4 = b5;
                            }
                        }
                        i106 = i107 + 1;
                        i105++;
                        i94 = i7;
                    }
                }
                i100++;
                iArr6 = iArr8;
                i94 = i7;
            }
            java.lang.Boolean bool2 = this.h;
            this.h = java.lang.Boolean.valueOf((bool2 != null && bool2.booleanValue()) || (this.h == null && i98 == 0 && b4 != -1));
        }
        if (this.q && ((i6 = xtiVar.g) == 0 || i6 == 1)) {
            android.graphics.Bitmap bitmapE = this.g;
            if (bitmapE == null) {
                bitmapE = e();
                this.g = bitmapE;
            }
            int i110 = this.u;
            bitmapE.setPixels(iArr3, 0, i110, 0, 0, i110, this.t);
        }
        android.graphics.Bitmap bitmapE2 = e();
        int i111 = this.u;
        bitmapE2.setPixels(iArr3, 0, i111, 0, 0, i111, this.t);
        return bitmapE2;
    }

    @Override // defpackage.xth
    public final void b() {
        this.e = (this.e + 1) % this.f.c;
    }

    public final synchronized void c(defpackage.xtj xtjVar, java.nio.ByteBuffer byteBuffer, int i) {
        try {
            if (i <= 0) {
                throw new java.lang.IllegalArgumentException(a.bj(i, "Sample size must be >=0, not: "));
            }
            int iHighestOneBit = java.lang.Integer.highestOneBit(i);
            this.r = 0;
            this.f = xtjVar;
            this.e = -1;
            java.nio.ByteBuffer byteBufferAsReadOnlyBuffer = byteBuffer.asReadOnlyBuffer();
            this.a = byteBufferAsReadOnlyBuffer;
            byteBufferAsReadOnlyBuffer.position(0);
            this.a.order(java.nio.ByteOrder.LITTLE_ENDIAN);
            this.q = false;
            java.util.Iterator it = xtjVar.e.iterator();
            while (it.hasNext()) {
                if (((defpackage.xti) it.next()).g == 3) {
                    this.q = true;
                    break;
                }
            }
            this.s = iHighestOneBit;
            int i2 = xtjVar.f;
            this.u = i2 / iHighestOneBit;
            int i3 = xtjVar.g;
            this.t = i3 / iHighestOneBit;
            defpackage.uyg uygVar = this.j;
            this.c = uygVar.j(i2 * i3);
            int i4 = this.u * this.t;
            java.lang.Object obj = uygVar.b;
            this.d = obj == null ? new int[i4] : (int[]) ((defpackage.xxt) obj).a(i4, int[].class);
        } catch (java.lang.Throwable th) {
            throw th;
        }
    }
}
