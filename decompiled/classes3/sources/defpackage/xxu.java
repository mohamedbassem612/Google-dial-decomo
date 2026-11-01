package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes3.dex */
public final class xxu implements defpackage.xxm {
    private static final android.graphics.Bitmap.Config a = android.graphics.Bitmap.Config.ARGB_8888;
    private final defpackage.xxv b;
    private final java.util.Set c;
    private final long d;
    private long e;
    private int f;
    private int g;
    private int h;
    private int i;

    public xxu(long j) {
        defpackage.xya xyaVar = new defpackage.xya();
        java.util.HashSet hashSet = new java.util.HashSet(java.util.Arrays.asList(android.graphics.Bitmap.Config.values()));
        hashSet.add(null);
        hashSet.remove(android.graphics.Bitmap.Config.HARDWARE);
        java.util.Set setUnmodifiableSet = j$.util.DesugarCollections.unmodifiableSet(hashSet);
        this.d = j;
        this.b = xyaVar;
        this.c = setUnmodifiableSet;
    }

    private static android.graphics.Bitmap f(int i, int i2, android.graphics.Bitmap.Config config) {
        if (config == null) {
            config = a;
        }
        return android.graphics.Bitmap.createBitmap(i, i2, config);
    }

    /* JADX WARN: Code duplicated, block: B:37:0x008c A[Catch: all -> 0x0123, EDGE_INSN: B:37:0x008c->B:41:0x00a1 BREAK  A[LOOP:0: B:25:0x005a->B:39:0x009a], TryCatch #0 {, blocks: (B:4:0x0009, B:6:0x000f, B:10:0x0017, B:12:0x0035, B:24:0x0059, B:26:0x005c, B:28:0x0071, B:30:0x007b, B:41:0x00a1, B:43:0x00ae, B:48:0x00f6, B:50:0x00ff, B:51:0x010e, B:44:0x00d6, B:46:0x00df, B:47:0x00ee, B:35:0x0086, B:37:0x008c, B:39:0x009a, B:13:0x0038, B:19:0x0049, B:20:0x004e, B:21:0x0051, B:22:0x0054, B:23:0x0057, B:9:0x0015, B:54:0x0113, B:55:0x0120), top: B:60:0x0009 }] */
    private final synchronized android.graphics.Bitmap g(int i, int i2, android.graphics.Bitmap.Config config) {
        android.graphics.Bitmap.Config[] configArr;
        boolean z;
        android.graphics.Bitmap bitmap;
        if (config == android.graphics.Bitmap.Config.HARDWARE) {
            throw new java.lang.IllegalArgumentException(hgb.i(config, "Cannot create a mutable Bitmap with config: ", ". Consider setting Downsampler#ALLOW_HARDWARE_CONFIG to false in your RequestOptions and/or in GlideBuilder.setDefaultRequestOptions"));
        }
        defpackage.xxv xxvVar = this.b;
        android.graphics.Bitmap.Config config2 = config != null ? config : a;
        int iB = i * i2 * defpackage.ygc.b(config2);
        defpackage.xxz xxzVar = ((defpackage.xya) xxvVar).f;
        defpackage.xxy xxyVarD = xxzVar.d(iB, config2);
        int i3 = 0;
        boolean z2 = true;
        if (android.graphics.Bitmap.Config.RGBA_F16.equals(config2)) {
            configArr = defpackage.xya.b;
        } else {
            int i4 = defpackage.xxx.a[config2.ordinal()];
            if (i4 == 1) {
                configArr = defpackage.xya.a;
            } else if (i4 == 2) {
                configArr = defpackage.xya.c;
            } else if (i4 != 3) {
                configArr = i4 != 4 ? new android.graphics.Bitmap.Config[]{config2} : defpackage.xya.e;
            } else {
                configArr = defpackage.xya.d;
            }
        }
        int length = configArr.length;
        while (true) {
            if (i3 >= length) {
                z = z2;
                break;
            }
            android.graphics.Bitmap.Config config3 = configArr[i3];
            java.lang.Integer num = (java.lang.Integer) ((defpackage.xya) xxvVar).d(config3).ceilingKey(java.lang.Integer.valueOf(iB));
            if (num != null) {
                z = z2;
                if (num.intValue() <= (iB << 3)) {
                    if (num.intValue() == iB) {
                        if (config3 != null) {
                            if (!config3.equals(config2)) {
                                xxzVar.c(xxyVarD);
                                xxyVarD = xxzVar.d(num.intValue(), config3);
                                break;
                            }
                            break;
                        }
                        if (config2 == null) {
                            break;
                        }
                        xxzVar.c(xxyVarD);
                        xxyVarD = xxzVar.d(num.intValue(), config3);
                        break;
                    }
                    xxzVar.c(xxyVarD);
                    xxyVarD = xxzVar.d(num.intValue(), config3);
                    break;
                }
            } else {
                z = z2;
            }
            i3++;
            z2 = z;
        }
        bitmap = (android.graphics.Bitmap) ((defpackage.xya) xxvVar).g.a(xxyVarD);
        if (bitmap != null) {
            ((defpackage.xya) xxvVar).e(java.lang.Integer.valueOf(xxyVarD.a), bitmap);
            bitmap.reconfigure(i, i2, config2);
            this.f++;
            this.e -= (long) defpackage.ygc.a(bitmap);
            boolean z3 = z;
            bitmap.setHasAlpha(z3);
            bitmap.setPremultiplied(z3);
        } else {
            if (android.util.Log.isLoggable("LruBitmapPool", 3)) {
                android.util.Log.d("LruBitmapPool", "Missing bitmap=".concat(xxvVar.b(i, i2, config)));
            }
            this.g++;
        }
        if (android.util.Log.isLoggable("LruBitmapPool", 2)) {
            android.util.Log.v("LruBitmapPool", "Get bitmap=".concat(xxvVar.b(i, i2, config)));
        }
        h();
        return bitmap;
    }

    private final void h() {
        if (android.util.Log.isLoggable("LruBitmapPool", 2)) {
            i();
        }
    }

    private final void i() {
        defpackage.xxv xxvVar = this.b;
        android.util.Log.v("LruBitmapPool", "Hits=" + this.f + ", misses=" + this.g + ", puts=" + this.h + ", evictions=" + this.i + ", currentSize=" + this.e + ", maxSize=" + this.d + "\nStrategy=" + xxvVar.toString());
    }

    private final synchronized void j(long j) {
        while (this.e > j) {
            defpackage.xxv xxvVar = this.b;
            android.graphics.Bitmap bitmap = (android.graphics.Bitmap) ((defpackage.xya) xxvVar).g.b();
            if (bitmap == null) {
                if (android.util.Log.isLoggable("LruBitmapPool", 5)) {
                    android.util.Log.w("LruBitmapPool", "Size mismatch, resetting");
                    i();
                }
                this.e = 0L;
                return;
            }
            ((defpackage.xya) xxvVar).e(java.lang.Integer.valueOf(defpackage.ygc.a(bitmap)), bitmap);
            this.e -= (long) defpackage.ygc.a(bitmap);
            this.i++;
            if (android.util.Log.isLoggable("LruBitmapPool", 3)) {
                android.util.Log.d("LruBitmapPool", "Evicting bitmap=".concat(xxvVar.a(bitmap)));
            }
            h();
            bitmap.recycle();
        }
    }

    @Override // defpackage.xxm
    public final android.graphics.Bitmap a(int i, int i2, android.graphics.Bitmap.Config config) {
        android.graphics.Bitmap bitmapG = g(i, i2, config);
        if (bitmapG == null) {
            return f(i, i2, config);
        }
        bitmapG.eraseColor(0);
        return bitmapG;
    }

    @Override // defpackage.xxm
    public final android.graphics.Bitmap b(int i, int i2, android.graphics.Bitmap.Config config) {
        android.graphics.Bitmap bitmapG = g(i, i2, config);
        return bitmapG == null ? f(i, i2, config) : bitmapG;
    }

    @Override // defpackage.xxm
    public final void c() {
        if (android.util.Log.isLoggable("LruBitmapPool", 3)) {
            android.util.Log.d("LruBitmapPool", "clearMemory");
        }
        j(0L);
    }

    @Override // defpackage.xxm
    public final synchronized void d(android.graphics.Bitmap bitmap) {
        try {
            if (bitmap == null) {
                throw new java.lang.NullPointerException("Bitmap must not be null");
            }
            if (bitmap.isRecycled()) {
                throw new java.lang.IllegalStateException("Cannot pool recycled bitmap");
            }
            if (bitmap.isMutable()) {
                defpackage.xxv xxvVar = this.b;
                long jA = defpackage.ygc.a(bitmap);
                long j = this.d;
                if (jA <= j && this.c.contains(bitmap.getConfig())) {
                    int iA = defpackage.ygc.a(bitmap);
                    defpackage.xxy xxyVarD = ((defpackage.xya) xxvVar).f.d(defpackage.ygc.a(bitmap), bitmap.getConfig());
                    ((defpackage.xya) xxvVar).g.c(xxyVarD, bitmap);
                    java.util.NavigableMap navigableMapD = ((defpackage.xya) xxvVar).d(bitmap.getConfig());
                    java.lang.Integer num = (java.lang.Integer) navigableMapD.get(java.lang.Integer.valueOf(xxyVarD.a));
                    navigableMapD.put(java.lang.Integer.valueOf(xxyVarD.a), java.lang.Integer.valueOf(num == null ? 1 : num.intValue() + 1));
                    this.h++;
                    this.e += (long) iA;
                    if (android.util.Log.isLoggable("LruBitmapPool", 2)) {
                        android.util.Log.v("LruBitmapPool", "Put bitmap in pool=".concat(xxvVar.a(bitmap)));
                    }
                    h();
                    j(j);
                    return;
                }
            }
            if (android.util.Log.isLoggable("LruBitmapPool", 2)) {
                android.util.Log.v("LruBitmapPool", "Reject bitmap from pool, bitmap: " + this.b.a(bitmap) + ", is mutable: " + bitmap.isMutable() + ", is allowed config: " + this.c.contains(bitmap.getConfig()));
            }
            bitmap.recycle();
        } catch (java.lang.Throwable th) {
            throw th;
        }
    }

    @Override // defpackage.xxm
    public final void e(int i) {
        if (android.util.Log.isLoggable("LruBitmapPool", 3)) {
            android.util.Log.d("LruBitmapPool", a.bj(i, "trimMemory, level="));
        }
        if (i >= 40 || i >= 20) {
            c();
        } else if (i == 15) {
            j(this.d >> 1);
        }
    }
}
