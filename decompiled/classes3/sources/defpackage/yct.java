package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes3.dex */
public final class yct implements defpackage.xuu {
    private static final defpackage.vqu c = new defpackage.vqu();
    private final android.content.Context a;
    private final java.util.List b;
    private final defpackage.vqu d;
    private final defpackage.uyg e;

    public yct(android.content.Context context, java.util.List list, defpackage.xxm xxmVar, defpackage.xxt xxtVar) {
        defpackage.vqu vquVar = c;
        this.a = context.getApplicationContext();
        this.b = list;
        this.e = new defpackage.uyg(xxmVar, xxtVar);
        this.d = vquVar;
    }

    @Override // defpackage.xuu
    public final /* bridge */ /* synthetic */ defpackage.xxe a(java.lang.Object obj, int i, int i2, defpackage.xus xusVar) {
        int i3;
        int i4;
        int i5;
        java.lang.Object obj2;
        double dA;
        java.lang.StringBuilder sb;
        defpackage.ycx ycxVar;
        int i6;
        java.nio.ByteBuffer byteBuffer = (java.nio.ByteBuffer) obj;
        defpackage.xtk xtkVarT = this.d.t(byteBuffer);
        try {
            int i7 = defpackage.yfx.a;
            long jElapsedRealtimeNanos = android.os.SystemClock.elapsedRealtimeNanos();
            try {
                if (xtkVarT.c == null) {
                    throw new java.lang.IllegalStateException("You must call setData() before parseHeader()");
                }
                if (xtkVarT.e()) {
                    obj2 = xtkVarT.d;
                    i4 = 0;
                } else {
                    java.lang.StringBuilder sb2 = new java.lang.StringBuilder();
                    for (int i8 = 0; i8 < 6; i8++) {
                        sb2.append((char) xtkVarT.a());
                    }
                    i4 = 0;
                    if (sb2.toString().startsWith("GIF")) {
                        ((defpackage.xtj) xtkVarT.d).f = xtkVarT.b();
                        ((defpackage.xtj) xtkVarT.d).g = xtkVarT.b();
                        int iA = xtkVarT.a();
                        java.lang.Object obj3 = xtkVarT.d;
                        i5 = 2;
                        ((defpackage.xtj) obj3).h = (iA & 128) != 0;
                        ((defpackage.xtj) obj3).i = (int) java.lang.Math.pow(2.0d, (iA & 7) + 1);
                        ((defpackage.xtj) xtkVarT.d).j = xtkVarT.a();
                        ((defpackage.xtj) xtkVarT.d).k = xtkVarT.a();
                        if (((defpackage.xtj) xtkVarT.d).h) {
                            try {
                                if (!xtkVarT.e()) {
                                    java.lang.Object obj4 = xtkVarT.d;
                                    ((defpackage.xtj) obj4).a = xtkVarT.f(((defpackage.xtj) obj4).i);
                                    java.lang.Object obj5 = xtkVarT.d;
                                    ((defpackage.xtj) obj5).l = ((defpackage.xtj) obj5).a[((defpackage.xtj) obj5).j];
                                }
                            } catch (java.lang.Throwable th) {
                                th = th;
                                i3 = i5;
                                if (android.util.Log.isLoggable("BufferGifDecoder", i3)) {
                                    android.util.Log.v("BufferGifDecoder", "Decoded GIF from stream in " + defpackage.yfx.a(jElapsedRealtimeNanos));
                                }
                                throw th;
                            }
                        }
                    } else {
                        ((defpackage.xtj) xtkVarT.d).b = 1;
                        i5 = 2;
                    }
                    if (!xtkVarT.e()) {
                        while (!xtkVarT.e()) {
                            int i9 = ((defpackage.xtj) xtkVarT.d).c;
                            int iA2 = xtkVarT.a();
                            if (iA2 == 33) {
                                int iA3 = xtkVarT.a();
                                if (iA3 == 1) {
                                    xtkVarT.d();
                                } else if (iA3 == 249) {
                                    ((defpackage.xtj) xtkVarT.d).d = new defpackage.xti();
                                    xtkVarT.a();
                                    int iA4 = xtkVarT.a();
                                    defpackage.xti xtiVar = ((defpackage.xtj) xtkVarT.d).d;
                                    int i10 = (iA4 & 28) >> 2;
                                    xtiVar.g = i10;
                                    if (i10 == 0) {
                                        xtiVar.g = 1;
                                    }
                                    xtiVar.f = 1 == (iA4 & 1);
                                    int iB = xtkVarT.b();
                                    if (iB < i5) {
                                        iB = 10;
                                    }
                                    defpackage.xti xtiVar2 = ((defpackage.xtj) xtkVarT.d).d;
                                    xtiVar2.i = iB * 10;
                                    xtiVar2.h = xtkVarT.a();
                                    xtkVarT.a();
                                } else if (iA3 == 254) {
                                    xtkVarT.d();
                                } else if (iA3 != 255) {
                                    xtkVarT.d();
                                } else {
                                    xtkVarT.c();
                                    java.lang.StringBuilder sb3 = new java.lang.StringBuilder();
                                    for (int i11 = 0; i11 < 11; i11++) {
                                        sb3.append((char) ((byte[]) xtkVarT.b)[i11]);
                                    }
                                    if (sb3.toString().equals("NETSCAPE2.0")) {
                                        do {
                                            xtkVarT.c();
                                            java.lang.Object obj6 = xtkVarT.b;
                                            if (((byte[]) obj6)[0] == 1) {
                                                ((defpackage.xtj) xtkVarT.d).m = ((((byte[]) obj6)[i5] & 255) << 8) | (((byte[]) obj6)[1] & 255);
                                            }
                                            if (xtkVarT.a <= 0) {
                                                break;
                                            }
                                        } while (!xtkVarT.e());
                                    } else {
                                        xtkVarT.d();
                                    }
                                }
                            } else if (iA2 == 44) {
                                java.lang.Object obj7 = xtkVarT.d;
                                if (((defpackage.xtj) obj7).d == null) {
                                    ((defpackage.xtj) obj7).d = new defpackage.xti();
                                }
                                ((defpackage.xtj) obj7).d.a = xtkVarT.b();
                                ((defpackage.xtj) xtkVarT.d).d.b = xtkVarT.b();
                                ((defpackage.xtj) xtkVarT.d).d.c = xtkVarT.b();
                                ((defpackage.xtj) xtkVarT.d).d.d = xtkVarT.b();
                                int iA5 = xtkVarT.a();
                                int i12 = iA5 & 128;
                                int iPow = (int) java.lang.Math.pow(2.0d, (iA5 & 7) + 1);
                                defpackage.xti xtiVar3 = ((defpackage.xtj) xtkVarT.d).d;
                                xtiVar3.e = (iA5 & 64) != 0;
                                if (i12 != 0) {
                                    xtiVar3.k = xtkVarT.f(iPow);
                                } else {
                                    xtiVar3.k = null;
                                }
                                ((defpackage.xtj) xtkVarT.d).d.j = ((java.nio.ByteBuffer) xtkVarT.c).position();
                                xtkVarT.a();
                                xtkVarT.d();
                                if (!xtkVarT.e()) {
                                    java.lang.Object obj8 = xtkVarT.d;
                                    ((defpackage.xtj) obj8).c++;
                                    ((defpackage.xtj) obj8).e.add(((defpackage.xtj) obj8).d);
                                }
                            } else {
                                if (iA2 == 59) {
                                    break;
                                }
                                ((defpackage.xtj) xtkVarT.d).b = 1;
                            }
                            i5 = 2;
                        }
                        java.lang.Object obj9 = xtkVarT.d;
                        if (((defpackage.xtj) obj9).c < 0) {
                            ((defpackage.xtj) obj9).b = 1;
                        }
                    }
                    obj2 = xtkVarT.d;
                }
                if (((defpackage.xtj) obj2).c <= 0 || ((defpackage.xtj) obj2).b != 0) {
                    if (android.util.Log.isLoggable("BufferGifDecoder", 2)) {
                        dA = defpackage.yfx.a(jElapsedRealtimeNanos);
                        sb = new java.lang.StringBuilder();
                        sb.append("Decoded GIF from stream in ");
                        sb.append(dA);
                        android.util.Log.v("BufferGifDecoder", sb.toString());
                    }
                    ycxVar = null;
                } else {
                    android.graphics.Bitmap.Config config = xusVar.b(defpackage.ydb.a) == defpackage.xud.b ? android.graphics.Bitmap.Config.RGB_565 : android.graphics.Bitmap.Config.ARGB_8888;
                    int iMin = java.lang.Math.min(((defpackage.xtj) obj2).g / i2, ((defpackage.xtj) obj2).f / i);
                    int iMax = java.lang.Math.max(1, iMin == 0 ? i4 : java.lang.Integer.highestOneBit(iMin));
                    if (!android.util.Log.isLoggable("BufferGifDecoder", 2) || iMax <= 1) {
                        i6 = i;
                    } else {
                        int i13 = ((defpackage.xtj) obj2).f;
                        int i14 = ((defpackage.xtj) obj2).g;
                        java.lang.StringBuilder sb4 = new java.lang.StringBuilder();
                        sb4.append("Downsampling GIF, sampleSize: ");
                        sb4.append(iMax);
                        sb4.append(", target dimens: [");
                        i6 = i;
                        sb4.append(i6);
                        sb4.append('x');
                        sb4.append(i2);
                        sb4.append("], actual dimens: [");
                        sb4.append(i13);
                        sb4.append('x');
                        sb4.append(i14);
                        sb4.append(']');
                        android.util.Log.v("BufferGifDecoder", sb4.toString());
                    }
                    defpackage.xtl xtlVar = new defpackage.xtl(this.e, (defpackage.xtj) obj2, byteBuffer, iMax);
                    if (config != android.graphics.Bitmap.Config.ARGB_8888 && config != android.graphics.Bitmap.Config.RGB_565) {
                        throw new java.lang.IllegalArgumentException("Unsupported format: " + java.lang.String.valueOf(config) + ", must be one of " + java.lang.String.valueOf(android.graphics.Bitmap.Config.ARGB_8888) + " or " + java.lang.String.valueOf(android.graphics.Bitmap.Config.RGB_565));
                    }
                    xtlVar.i = config;
                    xtlVar.b();
                    android.graphics.Bitmap bitmapA = xtlVar.a();
                    if (bitmapA == null) {
                        if (android.util.Log.isLoggable("BufferGifDecoder", 2)) {
                            dA = defpackage.yfx.a(jElapsedRealtimeNanos);
                            sb = new java.lang.StringBuilder();
                            sb.append("Decoded GIF from stream in ");
                            sb.append(dA);
                            android.util.Log.v("BufferGifDecoder", sb.toString());
                        }
                        ycxVar = null;
                    } else {
                        ycxVar = new defpackage.ycx(new defpackage.ycv(new defpackage.ycu(new defpackage.yda(defpackage.xrr.b(this.a), xtlVar, i6, i2, defpackage.yak.b, bitmapA))));
                        if (android.util.Log.isLoggable("BufferGifDecoder", 2)) {
                            android.util.Log.v("BufferGifDecoder", "Decoded GIF from stream in " + defpackage.yfx.a(jElapsedRealtimeNanos));
                        }
                    }
                }
                this.d.u(xtkVarT);
                return ycxVar;
            } catch (java.lang.Throwable th2) {
                th = th2;
                i3 = 2;
            }
        } catch (java.lang.Throwable th3) {
            this.d.u(xtkVarT);
            throw th3;
        }
    }

    @Override // defpackage.xuu
    public final /* bridge */ /* synthetic */ boolean b(java.lang.Object obj, defpackage.xus xusVar) {
        return !((java.lang.Boolean) xusVar.b(defpackage.ydb.b)).booleanValue() && defpackage.xff.B(this.b, (java.nio.ByteBuffer) obj) == com.bumptech.glide.load.ImageHeaderParser$ImageType.GIF;
    }
}
