package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes3.dex */
public final class ybh {
    public static final defpackage.xur a = new defpackage.xur("com.bumptech.glide.load.resource.bitmap.Downsampler.DecodeFormat", defpackage.xud.c, defpackage.xur.a);
    public static final defpackage.xur b = new defpackage.xur("com.bumptech.glide.load.resource.bitmap.Downsampler.PreferredColorSpace", null, defpackage.xur.a);
    public static final defpackage.xur c;
    public static final defpackage.xur d;
    public static final defpackage.xur e;
    public static final defpackage.xur f;
    public static final defpackage.ybg g;
    private static final java.util.Queue k;
    public final java.util.List h;
    public final defpackage.xxt i;
    public final xtq j;
    private final defpackage.xxm l;
    private final android.util.DisplayMetrics m;
    private final defpackage.ybq n = defpackage.ybq.a();

    static {
        defpackage.ybe ybeVar = defpackage.ybe.b;
        java.lang.Boolean bool = java.lang.Boolean.FALSE;
        c = new defpackage.xur("com.bumptech.glide.load.resource.bitmap.Downsampler.FixBitmapSize", bool, defpackage.xur.a);
        d = new defpackage.xur("com.bumptech.glide.load.resource.bitmap.Downsampler.AllowHardwareDecode", bool, defpackage.xur.a);
        e = new defpackage.xur("com.bumptech.glide.load.resource.bitmap.Downsampler.BypassTransformationsForHardwareBitmaps", bool, defpackage.xur.a);
        f = new defpackage.xur("com.bumptech.glide.load.resource.bitmap.Downsampler.IsExifOrientationRequired", bool, defpackage.xur.a);
        j$.util.DesugarCollections.unmodifiableSet(new java.util.HashSet(java.util.Arrays.asList("image/vnd.wap.wbmp", "image/x-ico")));
        g = new defpackage.ybf();
        j$.util.DesugarCollections.unmodifiableSet(java.util.EnumSet.of(com.bumptech.glide.load.ImageHeaderParser$ImageType.JPEG, com.bumptech.glide.load.ImageHeaderParser$ImageType.PNG_A, com.bumptech.glide.load.ImageHeaderParser$ImageType.PNG));
        char[] cArr = defpackage.ygc.a;
        k = new java.util.ArrayDeque(0);
    }

    public ybh(java.util.List list, android.util.DisplayMetrics displayMetrics, defpackage.xxm xxmVar, defpackage.xxt xxtVar, xtq xtqVar) {
        this.h = list;
        anty.aI(displayMetrics, "Argument must not be null");
        this.m = displayMetrics;
        anty.aI(xxmVar, "Argument must not be null");
        this.l = xxmVar;
        anty.aI(xxtVar, "Argument must not be null");
        this.i = xxtVar;
        this.j = xtqVar;
    }

    private static int b(double d2) {
        if (d2 > 1.0d) {
            d2 = 1.0d / d2;
        }
        return (int) java.lang.Math.round(d2 * 2.147483647E9d);
    }

    private static int c(double d2) {
        return (int) (d2 + 0.5d);
    }

    /* JADX WARN: Code restructure failed: missing block: B:26:?, code lost:
    
        throw r6;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private static android.graphics.Bitmap d(defpackage.ybt r9, android.graphics.BitmapFactory.Options r10, defpackage.ybg r11, defpackage.xxm r12) {
        /*
            java.lang.String r0 = "Downsampler"
            java.lang.String r1 = "Exception decoding bitmap, outWidth: "
            boolean r2 = r10.inJustDecodeBounds
            if (r2 != 0) goto Le
            r11.b()
            r9.d()
        Le:
            int r2 = r10.outWidth
            int r3 = r10.outHeight
            java.lang.String r4 = r10.outMimeType
            java.util.concurrent.locks.Lock r5 = defpackage.ycc.c
            r5.lock()
            android.graphics.Bitmap r9 = r9.b(r10)     // Catch: java.lang.IllegalArgumentException -> L1e java.lang.Throwable -> L70
            goto L68
        L1e:
            r5 = move-exception
            java.io.IOException r6 = new java.io.IOException     // Catch: java.lang.Throwable -> L70
            java.lang.String r7 = g(r10)     // Catch: java.lang.Throwable -> L70
            java.lang.StringBuilder r8 = new java.lang.StringBuilder     // Catch: java.lang.Throwable -> L70
            r8.<init>(r1)     // Catch: java.lang.Throwable -> L70
            r8.append(r2)     // Catch: java.lang.Throwable -> L70
            java.lang.String r1 = ", outHeight: "
            r8.append(r1)     // Catch: java.lang.Throwable -> L70
            r8.append(r3)     // Catch: java.lang.Throwable -> L70
            java.lang.String r1 = ", outMimeType: "
            r8.append(r1)     // Catch: java.lang.Throwable -> L70
            r8.append(r4)     // Catch: java.lang.Throwable -> L70
            java.lang.String r1 = ", inBitmap: "
            r8.append(r1)     // Catch: java.lang.Throwable -> L70
            r8.append(r7)     // Catch: java.lang.Throwable -> L70
            java.lang.String r1 = r8.toString()     // Catch: java.lang.Throwable -> L70
            r6.<init>(r1, r5)     // Catch: java.lang.Throwable -> L70
            r1 = 3
            boolean r1 = android.util.Log.isLoggable(r0, r1)     // Catch: java.lang.Throwable -> L70
            if (r1 == 0) goto L58
            java.lang.String r1 = "Failed to decode with inBitmap, trying again without Bitmap re-use"
            android.util.Log.d(r0, r1, r6)     // Catch: java.lang.Throwable -> L70
        L58:
            android.graphics.Bitmap r0 = r10.inBitmap     // Catch: java.lang.Throwable -> L70
            if (r0 == 0) goto L6f
            android.graphics.Bitmap r0 = r10.inBitmap     // Catch: java.io.IOException -> L6e java.lang.Throwable -> L70
            r12.d(r0)     // Catch: java.io.IOException -> L6e java.lang.Throwable -> L70
            r0 = 0
            r10.inBitmap = r0     // Catch: java.io.IOException -> L6e java.lang.Throwable -> L70
            android.graphics.Bitmap r9 = d(r9, r10, r11, r12)     // Catch: java.io.IOException -> L6e java.lang.Throwable -> L70
        L68:
            java.util.concurrent.locks.Lock r10 = defpackage.ycc.c
            r10.unlock()
            return r9
        L6e:
            throw r6     // Catch: java.lang.Throwable -> L70
        L6f:
            throw r6     // Catch: java.lang.Throwable -> L70
        L70:
            r9 = move-exception
            java.util.concurrent.locks.Lock r10 = defpackage.ycc.c
            r10.unlock()
            throw r9
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.ybh.d(ybt, android.graphics.BitmapFactory$Options, ybg, xxm):android.graphics.Bitmap");
    }

    private static synchronized android.graphics.BitmapFactory.Options e() {
        android.graphics.BitmapFactory.Options options;
        java.util.Queue queue = k;
        synchronized (queue) {
            try {
                options = (android.graphics.BitmapFactory.Options) queue.poll();
            } catch (java.lang.Throwable th) {
                throw th;
            }
        }
        if (options == null) {
            options = new android.graphics.BitmapFactory.Options();
            i(options);
        }
        return options;
    }

    private static java.lang.String f(android.graphics.Bitmap bitmap) {
        if (bitmap == null) {
            return null;
        }
        java.lang.String str = " (" + bitmap.getAllocationByteCount() + ')';
        return "[" + bitmap.getWidth() + 'x' + bitmap.getHeight() + "] " + java.lang.String.valueOf(bitmap.getConfig()) + str;
    }

    private static java.lang.String g(android.graphics.BitmapFactory.Options options) {
        return f(options.inBitmap);
    }

    private static void h(android.graphics.BitmapFactory.Options options) {
        i(options);
        java.util.Queue queue = k;
        synchronized (queue) {
            queue.offer(options);
        }
    }

    private static void i(android.graphics.BitmapFactory.Options options) {
        options.inTempStorage = null;
        options.inDither = false;
        options.inScaled = false;
        options.inSampleSize = 1;
        options.inPreferredConfig = null;
        options.inJustDecodeBounds = false;
        options.inDensity = 0;
        options.inTargetDensity = 0;
        rs$.ExternalSyntheticApiModelOutline0.m(options, (android.graphics.ColorSpace) null);
        rs$.ExternalSyntheticApiModelOutline0.m$1(options, (android.graphics.ColorSpace) null);
        rs$.ExternalSyntheticApiModelOutline0.m(options, (android.graphics.Bitmap.Config) null);
        options.outWidth = 0;
        options.outHeight = 0;
        options.outMimeType = null;
        options.inBitmap = null;
        options.inMutable = true;
    }

    private static boolean j(int i) {
        return i == 90 || i == 270;
    }

    private static boolean k(android.graphics.BitmapFactory.Options options) {
        return options.inTargetDensity > 0 && options.inDensity > 0 && options.inTargetDensity != options.inDensity;
    }

    private static int[] l(defpackage.ybt ybtVar, android.graphics.BitmapFactory.Options options, defpackage.ybg ybgVar, defpackage.xxm xxmVar) {
        options.inJustDecodeBounds = true;
        d(ybtVar, options, ybgVar, xxmVar);
        options.inJustDecodeBounds = false;
        return new int[]{options.outWidth, options.outHeight};
    }

    /* JADX WARN: Code duplicated, block: B:101:0x030a A[Catch: all -> 0x0586, TryCatch #5 {all -> 0x0586, blocks: (B:99:0x02fe, B:101:0x030a, B:117:0x0352, B:131:0x03e1, B:133:0x03ed, B:135:0x03f5, B:138:0x03fd, B:140:0x0405, B:142:0x0409, B:143:0x040b, B:145:0x0413, B:147:0x0419, B:149:0x041f, B:151:0x0429, B:153:0x0432, B:152:0x042e, B:154:0x0439, B:158:0x044c, B:160:0x0455, B:161:0x0460, B:121:0x035a, B:123:0x0360, B:125:0x036a, B:127:0x0390, B:102:0x0314, B:105:0x031a, B:107:0x0324, B:113:0x0342, B:115:0x034a, B:112:0x0340, B:116:0x034e, B:109:0x0328, B:111:0x032f), top: B:218:0x02fe, inners: #2 }] */
    /* JADX WARN: Code duplicated, block: B:102:0x0314 A[Catch: all -> 0x0586, TRY_LEAVE, TryCatch #5 {all -> 0x0586, blocks: (B:99:0x02fe, B:101:0x030a, B:117:0x0352, B:131:0x03e1, B:133:0x03ed, B:135:0x03f5, B:138:0x03fd, B:140:0x0405, B:142:0x0409, B:143:0x040b, B:145:0x0413, B:147:0x0419, B:149:0x041f, B:151:0x0429, B:153:0x0432, B:152:0x042e, B:154:0x0439, B:158:0x044c, B:160:0x0455, B:161:0x0460, B:121:0x035a, B:123:0x0360, B:125:0x036a, B:127:0x0390, B:102:0x0314, B:105:0x031a, B:107:0x0324, B:113:0x0342, B:115:0x034a, B:112:0x0340, B:116:0x034e, B:109:0x0328, B:111:0x032f), top: B:218:0x02fe, inners: #2 }] */
    /* JADX WARN: Code duplicated, block: B:107:0x0324 A[Catch: all -> 0x0586, TRY_ENTER, TryCatch #5 {all -> 0x0586, blocks: (B:99:0x02fe, B:101:0x030a, B:117:0x0352, B:131:0x03e1, B:133:0x03ed, B:135:0x03f5, B:138:0x03fd, B:140:0x0405, B:142:0x0409, B:143:0x040b, B:145:0x0413, B:147:0x0419, B:149:0x041f, B:151:0x0429, B:153:0x0432, B:152:0x042e, B:154:0x0439, B:158:0x044c, B:160:0x0455, B:161:0x0460, B:121:0x035a, B:123:0x0360, B:125:0x036a, B:127:0x0390, B:102:0x0314, B:105:0x031a, B:107:0x0324, B:113:0x0342, B:115:0x034a, B:112:0x0340, B:116:0x034e, B:109:0x0328, B:111:0x032f), top: B:218:0x02fe, inners: #2 }] */
    /* JADX WARN: Code duplicated, block: B:112:0x0340 A[Catch: all -> 0x0586, TryCatch #5 {all -> 0x0586, blocks: (B:99:0x02fe, B:101:0x030a, B:117:0x0352, B:131:0x03e1, B:133:0x03ed, B:135:0x03f5, B:138:0x03fd, B:140:0x0405, B:142:0x0409, B:143:0x040b, B:145:0x0413, B:147:0x0419, B:149:0x041f, B:151:0x0429, B:153:0x0432, B:152:0x042e, B:154:0x0439, B:158:0x044c, B:160:0x0455, B:161:0x0460, B:121:0x035a, B:123:0x0360, B:125:0x036a, B:127:0x0390, B:102:0x0314, B:105:0x031a, B:107:0x0324, B:113:0x0342, B:115:0x034a, B:112:0x0340, B:116:0x034e, B:109:0x0328, B:111:0x032f), top: B:218:0x02fe, inners: #2 }] */
    /* JADX WARN: Code duplicated, block: B:115:0x034a A[Catch: all -> 0x0586, TryCatch #5 {all -> 0x0586, blocks: (B:99:0x02fe, B:101:0x030a, B:117:0x0352, B:131:0x03e1, B:133:0x03ed, B:135:0x03f5, B:138:0x03fd, B:140:0x0405, B:142:0x0409, B:143:0x040b, B:145:0x0413, B:147:0x0419, B:149:0x041f, B:151:0x0429, B:153:0x0432, B:152:0x042e, B:154:0x0439, B:158:0x044c, B:160:0x0455, B:161:0x0460, B:121:0x035a, B:123:0x0360, B:125:0x036a, B:127:0x0390, B:102:0x0314, B:105:0x031a, B:107:0x0324, B:113:0x0342, B:115:0x034a, B:112:0x0340, B:116:0x034e, B:109:0x0328, B:111:0x032f), top: B:218:0x02fe, inners: #2 }] */
    /* JADX WARN: Code duplicated, block: B:116:0x034e A[Catch: all -> 0x0586, TryCatch #5 {all -> 0x0586, blocks: (B:99:0x02fe, B:101:0x030a, B:117:0x0352, B:131:0x03e1, B:133:0x03ed, B:135:0x03f5, B:138:0x03fd, B:140:0x0405, B:142:0x0409, B:143:0x040b, B:145:0x0413, B:147:0x0419, B:149:0x041f, B:151:0x0429, B:153:0x0432, B:152:0x042e, B:154:0x0439, B:158:0x044c, B:160:0x0455, B:161:0x0460, B:121:0x035a, B:123:0x0360, B:125:0x036a, B:127:0x0390, B:102:0x0314, B:105:0x031a, B:107:0x0324, B:113:0x0342, B:115:0x034a, B:112:0x0340, B:116:0x034e, B:109:0x0328, B:111:0x032f), top: B:218:0x02fe, inners: #2 }] */
    /* JADX WARN: Code duplicated, block: B:119:0x0356 A[ADDED_TO_REGION] */
    /* JADX WARN: Code duplicated, block: B:121:0x035a A[Catch: all -> 0x0586, TryCatch #5 {all -> 0x0586, blocks: (B:99:0x02fe, B:101:0x030a, B:117:0x0352, B:131:0x03e1, B:133:0x03ed, B:135:0x03f5, B:138:0x03fd, B:140:0x0405, B:142:0x0409, B:143:0x040b, B:145:0x0413, B:147:0x0419, B:149:0x041f, B:151:0x0429, B:153:0x0432, B:152:0x042e, B:154:0x0439, B:158:0x044c, B:160:0x0455, B:161:0x0460, B:121:0x035a, B:123:0x0360, B:125:0x036a, B:127:0x0390, B:102:0x0314, B:105:0x031a, B:107:0x0324, B:113:0x0342, B:115:0x034a, B:112:0x0340, B:116:0x034e, B:109:0x0328, B:111:0x032f), top: B:218:0x02fe, inners: #2 }] */
    /* JADX WARN: Code duplicated, block: B:123:0x0360 A[Catch: all -> 0x0586, TryCatch #5 {all -> 0x0586, blocks: (B:99:0x02fe, B:101:0x030a, B:117:0x0352, B:131:0x03e1, B:133:0x03ed, B:135:0x03f5, B:138:0x03fd, B:140:0x0405, B:142:0x0409, B:143:0x040b, B:145:0x0413, B:147:0x0419, B:149:0x041f, B:151:0x0429, B:153:0x0432, B:152:0x042e, B:154:0x0439, B:158:0x044c, B:160:0x0455, B:161:0x0460, B:121:0x035a, B:123:0x0360, B:125:0x036a, B:127:0x0390, B:102:0x0314, B:105:0x031a, B:107:0x0324, B:113:0x0342, B:115:0x034a, B:112:0x0340, B:116:0x034e, B:109:0x0328, B:111:0x032f), top: B:218:0x02fe, inners: #2 }] */
    /* JADX WARN: Code duplicated, block: B:124:0x0368  */
    /* JADX WARN: Code duplicated, block: B:127:0x0390 A[Catch: all -> 0x0586, TryCatch #5 {all -> 0x0586, blocks: (B:99:0x02fe, B:101:0x030a, B:117:0x0352, B:131:0x03e1, B:133:0x03ed, B:135:0x03f5, B:138:0x03fd, B:140:0x0405, B:142:0x0409, B:143:0x040b, B:145:0x0413, B:147:0x0419, B:149:0x041f, B:151:0x0429, B:153:0x0432, B:152:0x042e, B:154:0x0439, B:158:0x044c, B:160:0x0455, B:161:0x0460, B:121:0x035a, B:123:0x0360, B:125:0x036a, B:127:0x0390, B:102:0x0314, B:105:0x031a, B:107:0x0324, B:113:0x0342, B:115:0x034a, B:112:0x0340, B:116:0x034e, B:109:0x0328, B:111:0x032f), top: B:218:0x02fe, inners: #2 }] */
    /* JADX WARN: Code duplicated, block: B:130:0x03df A[ADDED_TO_REGION] */
    /* JADX WARN: Code duplicated, block: B:133:0x03ed A[Catch: all -> 0x0586, TryCatch #5 {all -> 0x0586, blocks: (B:99:0x02fe, B:101:0x030a, B:117:0x0352, B:131:0x03e1, B:133:0x03ed, B:135:0x03f5, B:138:0x03fd, B:140:0x0405, B:142:0x0409, B:143:0x040b, B:145:0x0413, B:147:0x0419, B:149:0x041f, B:151:0x0429, B:153:0x0432, B:152:0x042e, B:154:0x0439, B:158:0x044c, B:160:0x0455, B:161:0x0460, B:121:0x035a, B:123:0x0360, B:125:0x036a, B:127:0x0390, B:102:0x0314, B:105:0x031a, B:107:0x0324, B:113:0x0342, B:115:0x034a, B:112:0x0340, B:116:0x034e, B:109:0x0328, B:111:0x032f), top: B:218:0x02fe, inners: #2 }] */
    /* JADX WARN: Code duplicated, block: B:135:0x03f5 A[Catch: all -> 0x0586, TryCatch #5 {all -> 0x0586, blocks: (B:99:0x02fe, B:101:0x030a, B:117:0x0352, B:131:0x03e1, B:133:0x03ed, B:135:0x03f5, B:138:0x03fd, B:140:0x0405, B:142:0x0409, B:143:0x040b, B:145:0x0413, B:147:0x0419, B:149:0x041f, B:151:0x0429, B:153:0x0432, B:152:0x042e, B:154:0x0439, B:158:0x044c, B:160:0x0455, B:161:0x0460, B:121:0x035a, B:123:0x0360, B:125:0x036a, B:127:0x0390, B:102:0x0314, B:105:0x031a, B:107:0x0324, B:113:0x0342, B:115:0x034a, B:112:0x0340, B:116:0x034e, B:109:0x0328, B:111:0x032f), top: B:218:0x02fe, inners: #2 }] */
    /* JADX WARN: Code duplicated, block: B:142:0x0409 A[Catch: all -> 0x0586, TryCatch #5 {all -> 0x0586, blocks: (B:99:0x02fe, B:101:0x030a, B:117:0x0352, B:131:0x03e1, B:133:0x03ed, B:135:0x03f5, B:138:0x03fd, B:140:0x0405, B:142:0x0409, B:143:0x040b, B:145:0x0413, B:147:0x0419, B:149:0x041f, B:151:0x0429, B:153:0x0432, B:152:0x042e, B:154:0x0439, B:158:0x044c, B:160:0x0455, B:161:0x0460, B:121:0x035a, B:123:0x0360, B:125:0x036a, B:127:0x0390, B:102:0x0314, B:105:0x031a, B:107:0x0324, B:113:0x0342, B:115:0x034a, B:112:0x0340, B:116:0x034e, B:109:0x0328, B:111:0x032f), top: B:218:0x02fe, inners: #2 }] */
    /* JADX WARN: Code duplicated, block: B:145:0x0413 A[Catch: all -> 0x0586, TryCatch #5 {all -> 0x0586, blocks: (B:99:0x02fe, B:101:0x030a, B:117:0x0352, B:131:0x03e1, B:133:0x03ed, B:135:0x03f5, B:138:0x03fd, B:140:0x0405, B:142:0x0409, B:143:0x040b, B:145:0x0413, B:147:0x0419, B:149:0x041f, B:151:0x0429, B:153:0x0432, B:152:0x042e, B:154:0x0439, B:158:0x044c, B:160:0x0455, B:161:0x0460, B:121:0x035a, B:123:0x0360, B:125:0x036a, B:127:0x0390, B:102:0x0314, B:105:0x031a, B:107:0x0324, B:113:0x0342, B:115:0x034a, B:112:0x0340, B:116:0x034e, B:109:0x0328, B:111:0x032f), top: B:218:0x02fe, inners: #2 }] */
    /* JADX WARN: Code duplicated, block: B:147:0x0419 A[Catch: all -> 0x0586, TryCatch #5 {all -> 0x0586, blocks: (B:99:0x02fe, B:101:0x030a, B:117:0x0352, B:131:0x03e1, B:133:0x03ed, B:135:0x03f5, B:138:0x03fd, B:140:0x0405, B:142:0x0409, B:143:0x040b, B:145:0x0413, B:147:0x0419, B:149:0x041f, B:151:0x0429, B:153:0x0432, B:152:0x042e, B:154:0x0439, B:158:0x044c, B:160:0x0455, B:161:0x0460, B:121:0x035a, B:123:0x0360, B:125:0x036a, B:127:0x0390, B:102:0x0314, B:105:0x031a, B:107:0x0324, B:113:0x0342, B:115:0x034a, B:112:0x0340, B:116:0x034e, B:109:0x0328, B:111:0x032f), top: B:218:0x02fe, inners: #2 }] */
    /* JADX WARN: Code duplicated, block: B:152:0x042e A[Catch: all -> 0x0586, TryCatch #5 {all -> 0x0586, blocks: (B:99:0x02fe, B:101:0x030a, B:117:0x0352, B:131:0x03e1, B:133:0x03ed, B:135:0x03f5, B:138:0x03fd, B:140:0x0405, B:142:0x0409, B:143:0x040b, B:145:0x0413, B:147:0x0419, B:149:0x041f, B:151:0x0429, B:153:0x0432, B:152:0x042e, B:154:0x0439, B:158:0x044c, B:160:0x0455, B:161:0x0460, B:121:0x035a, B:123:0x0360, B:125:0x036a, B:127:0x0390, B:102:0x0314, B:105:0x031a, B:107:0x0324, B:113:0x0342, B:115:0x034a, B:112:0x0340, B:116:0x034e, B:109:0x0328, B:111:0x032f), top: B:218:0x02fe, inners: #2 }] */
    /* JADX WARN: Code duplicated, block: B:156:0x0448 A[ADDED_TO_REGION] */
    /* JADX WARN: Code duplicated, block: B:172:0x04fa  */
    /* JADX WARN: Code duplicated, block: B:174:0x0500  */
    /* JADX WARN: Code duplicated, block: B:177:0x0511  */
    /* JADX WARN: Code duplicated, block: B:178:0x0513 A[Catch: all -> 0x0584, TryCatch #4 {all -> 0x0584, blocks: (B:175:0x0502, B:189:0x0568, B:191:0x056e, B:193:0x0575, B:178:0x0513, B:179:0x0520, B:188:0x0550, B:181:0x0524, B:182:0x0528, B:183:0x0531, B:184:0x0535, B:185:0x053e, B:186:0x0547, B:187:0x054b), top: B:216:0x0502 }] */
    /* JADX WARN: Code duplicated, block: B:180:0x0523 A[DONT_GENERATE] */
    /* JADX WARN: Code duplicated, block: B:181:0x0524 A[Catch: all -> 0x0584, TryCatch #4 {all -> 0x0584, blocks: (B:175:0x0502, B:189:0x0568, B:191:0x056e, B:193:0x0575, B:178:0x0513, B:179:0x0520, B:188:0x0550, B:181:0x0524, B:182:0x0528, B:183:0x0531, B:184:0x0535, B:185:0x053e, B:186:0x0547, B:187:0x054b), top: B:216:0x0502 }] */
    /* JADX WARN: Code duplicated, block: B:182:0x0528 A[Catch: all -> 0x0584, TryCatch #4 {all -> 0x0584, blocks: (B:175:0x0502, B:189:0x0568, B:191:0x056e, B:193:0x0575, B:178:0x0513, B:179:0x0520, B:188:0x0550, B:181:0x0524, B:182:0x0528, B:183:0x0531, B:184:0x0535, B:185:0x053e, B:186:0x0547, B:187:0x054b), top: B:216:0x0502 }] */
    /* JADX WARN: Code duplicated, block: B:183:0x0531 A[Catch: all -> 0x0584, TryCatch #4 {all -> 0x0584, blocks: (B:175:0x0502, B:189:0x0568, B:191:0x056e, B:193:0x0575, B:178:0x0513, B:179:0x0520, B:188:0x0550, B:181:0x0524, B:182:0x0528, B:183:0x0531, B:184:0x0535, B:185:0x053e, B:186:0x0547, B:187:0x054b), top: B:216:0x0502 }] */
    /* JADX WARN: Code duplicated, block: B:184:0x0535 A[Catch: all -> 0x0584, TryCatch #4 {all -> 0x0584, blocks: (B:175:0x0502, B:189:0x0568, B:191:0x056e, B:193:0x0575, B:178:0x0513, B:179:0x0520, B:188:0x0550, B:181:0x0524, B:182:0x0528, B:183:0x0531, B:184:0x0535, B:185:0x053e, B:186:0x0547, B:187:0x054b), top: B:216:0x0502 }] */
    /* JADX WARN: Code duplicated, block: B:185:0x053e A[Catch: all -> 0x0584, TryCatch #4 {all -> 0x0584, blocks: (B:175:0x0502, B:189:0x0568, B:191:0x056e, B:193:0x0575, B:178:0x0513, B:179:0x0520, B:188:0x0550, B:181:0x0524, B:182:0x0528, B:183:0x0531, B:184:0x0535, B:185:0x053e, B:186:0x0547, B:187:0x054b), top: B:216:0x0502 }] */
    /* JADX WARN: Code duplicated, block: B:186:0x0547 A[Catch: all -> 0x0584, TryCatch #4 {all -> 0x0584, blocks: (B:175:0x0502, B:189:0x0568, B:191:0x056e, B:193:0x0575, B:178:0x0513, B:179:0x0520, B:188:0x0550, B:181:0x0524, B:182:0x0528, B:183:0x0531, B:184:0x0535, B:185:0x053e, B:186:0x0547, B:187:0x054b), top: B:216:0x0502 }] */
    /* JADX WARN: Code duplicated, block: B:187:0x054b A[Catch: all -> 0x0584, TryCatch #4 {all -> 0x0584, blocks: (B:175:0x0502, B:189:0x0568, B:191:0x056e, B:193:0x0575, B:178:0x0513, B:179:0x0520, B:188:0x0550, B:181:0x0524, B:182:0x0528, B:183:0x0531, B:184:0x0535, B:185:0x053e, B:186:0x0547, B:187:0x054b), top: B:216:0x0502 }] */
    /* JADX WARN: Code duplicated, block: B:18:0x0093  */
    /* JADX WARN: Code duplicated, block: B:191:0x056e A[Catch: all -> 0x0584, TryCatch #4 {all -> 0x0584, blocks: (B:175:0x0502, B:189:0x0568, B:191:0x056e, B:193:0x0575, B:178:0x0513, B:179:0x0520, B:188:0x0550, B:181:0x0524, B:182:0x0528, B:183:0x0531, B:184:0x0535, B:185:0x053e, B:186:0x0547, B:187:0x054b), top: B:216:0x0502 }] */
    /* JADX WARN: Code duplicated, block: B:192:0x0572  */
    /* JADX WARN: Code duplicated, block: B:212:0x031a A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:214:0x0467 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:21:0x00b2 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:22:0x00b4  */
    /* JADX WARN: Code duplicated, block: B:23:0x00b8  */
    /* JADX WARN: Code duplicated, block: B:27:0x00c4  */
    /* JADX WARN: Code duplicated, block: B:28:0x00c9  */
    /* JADX WARN: Code duplicated, block: B:29:0x00cc  */
    /* JADX WARN: Code duplicated, block: B:30:0x00cf  */
    /* JADX WARN: Code duplicated, block: B:34:0x00df A[Catch: all -> 0x0591, TryCatch #1 {all -> 0x0591, blocks: (B:19:0x0095, B:25:0x00bb, B:26:0x00c1, B:32:0x00d5, B:34:0x00df, B:39:0x00ea, B:43:0x00f3), top: B:210:0x0095 }] */
    /* JADX WARN: Code duplicated, block: B:36:0x00e5  */
    /* JADX WARN: Code duplicated, block: B:37:0x00e7  */
    /* JADX WARN: Code duplicated, block: B:39:0x00ea A[Catch: all -> 0x0591, TryCatch #1 {all -> 0x0591, blocks: (B:19:0x0095, B:25:0x00bb, B:26:0x00c1, B:32:0x00d5, B:34:0x00df, B:39:0x00ea, B:43:0x00f3), top: B:210:0x0095 }] */
    /* JADX WARN: Code duplicated, block: B:41:0x00f0  */
    /* JADX WARN: Code duplicated, block: B:42:0x00f2  */
    /* JADX WARN: Code duplicated, block: B:46:0x0103 A[ADDED_TO_REGION] */
    /* JADX WARN: Code duplicated, block: B:95:0x02cb A[Catch: all -> 0x0589, TryCatch #6 {all -> 0x0589, blocks: (B:47:0x0105, B:54:0x0119, B:56:0x0123, B:58:0x014c, B:60:0x0155, B:62:0x015f, B:64:0x0166, B:65:0x0168, B:67:0x016e, B:69:0x0189, B:84:0x01d1, B:86:0x01fe, B:88:0x0208, B:90:0x020f, B:87:0x0202, B:70:0x018c, B:72:0x0190, B:74:0x0194, B:76:0x019a, B:77:0x01a8, B:79:0x01ac, B:81:0x01b0, B:82:0x01b5, B:83:0x01c0, B:59:0x0151, B:93:0x0287, B:94:0x02ca, B:95:0x02cb, B:97:0x02d3), top: B:220:0x0101 }] */
    /* JADX WARN: Code duplicated, block: B:97:0x02d3 A[Catch: all -> 0x0589, TRY_LEAVE, TryCatch #6 {all -> 0x0589, blocks: (B:47:0x0105, B:54:0x0119, B:56:0x0123, B:58:0x014c, B:60:0x0155, B:62:0x015f, B:64:0x0166, B:65:0x0168, B:67:0x016e, B:69:0x0189, B:84:0x01d1, B:86:0x01fe, B:88:0x0208, B:90:0x020f, B:87:0x0202, B:70:0x018c, B:72:0x0190, B:74:0x0194, B:76:0x019a, B:77:0x01a8, B:79:0x01ac, B:81:0x01b0, B:82:0x01b5, B:83:0x01c0, B:59:0x0151, B:93:0x0287, B:94:0x02ca, B:95:0x02cb, B:97:0x02d3), top: B:220:0x0101 }] */
    /* JADX WARN: Instruction removed from duplicated block: B:127:0x0390, please report this as an issue */
    /* JADX WARN: Instruction removed from duplicated block: B:97:0x02d3, please report this as an issue */
    public final defpackage.xxe a(defpackage.ybt ybtVar, int i, int i2, defpackage.xus xusVar, defpackage.ybg ybgVar) throws java.lang.Throwable {
        defpackage.ybe ybeVar;
        defpackage.xur xurVar;
        boolean z;
        android.graphics.BitmapFactory.Options options;
        long jElapsedRealtimeNanos;
        int i3;
        boolean z2;
        int i4;
        java.lang.String str;
        int i5;
        boolean z3;
        int iA;
        int i6;
        int i7;
        boolean zF;
        boolean z4;
        com.bumptech.glide.load.ImageHeaderParser$ImageType imageHeaderParser$ImageTypeC;
        java.lang.String str2;
        java.lang.String str3;
        android.graphics.Bitmap.Config config;
        float f2;
        int i8;
        int iRound;
        int iRound2;
        defpackage.xxm xxmVar;
        android.graphics.Bitmap bitmapD;
        android.graphics.Bitmap bitmapCreateBitmap;
        android.graphics.Matrix matrix;
        android.graphics.Bitmap bitmap;
        android.graphics.ColorSpace.Named namedM$3;
        defpackage.xxm xxmVar2;
        android.graphics.Bitmap.Config configM;
        int iFloor;
        int iFloor2;
        xtq xtqVar;
        defpackage.ybh ybhVar = this;
        int i9 = i;
        int i10 = i2;
        byte[] bArr = (byte[]) ybhVar.i.a(65536, byte[].class);
        android.graphics.BitmapFactory.Options optionsE = e();
        optionsE.inTempStorage = bArr;
        defpackage.xud xudVar = (defpackage.xud) xusVar.b(a);
        defpackage.xut xutVar = (defpackage.xut) xusVar.b(b);
        defpackage.ybe ybeVar2 = (defpackage.ybe) xusVar.b(defpackage.ybe.g);
        try {
            try {
                try {
                    if (ybeVar2 == defpackage.ybe.f && (xtqVar = ybhVar.j) != null) {
                        if (xtqVar.a(defpackage.xsg.class)) {
                            ybeVar = defpackage.ybe.c;
                            if (android.util.Log.isLoggable("Downsampler", 3)) {
                                android.util.Log.d("Downsampler", "Overriding DEFAULT strategy to CENTER_INSIDE due to experiment");
                            }
                        }
                        boolean zBooleanValue = ((java.lang.Boolean) xusVar.b(c)).booleanValue();
                        xurVar = d;
                        if (xusVar.b(xurVar) == null && ((java.lang.Boolean) xusVar.b(xurVar)).booleanValue()) {
                            z = true;
                        } else {
                            z = false;
                        }
                        int i11 = defpackage.yfx.a;
                        jElapsedRealtimeNanos = android.os.SystemClock.elapsedRealtimeNanos();
                        defpackage.xxm xxmVar3 = ybhVar.l;
                        int[] iArrL = l(ybtVar, optionsE, ybgVar, xxmVar3);
                        i3 = iArrL[0];
                        z2 = z;
                        i4 = iArrL[1];
                        str = optionsE.outMimeType;
                        i5 = -1;
                        if (i3 != -1) {
                            if (i4 != -1) {
                                i5 = i4;
                                z3 = z2;
                            }
                            iA = ybtVar.a();
                            android.graphics.Paint paint = defpackage.ycc.a;
                            switch (iA) {
                                case 3:
                                case org.chromium.net.UrlRequest$Status.WAITING_FOR_CACHE /* 4 */:
                                    i6 = 180;
                                    i7 = i6;
                                    break;
                                case org.chromium.net.UrlRequest$Status.DOWNLOADING_PAC_FILE /* 5 */:
                                case org.chromium.net.UrlRequest$Status.RESOLVING_PROXY_FOR_URL /* 6 */:
                                    i6 = 90;
                                    i7 = i6;
                                    break;
                                case org.chromium.net.UrlRequest$Status.RESOLVING_HOST_IN_PAC_FILE /* 7 */:
                                case org.chromium.net.UrlRequest$Status.ESTABLISHING_PROXY_TUNNEL /* 8 */:
                                    i6 = 270;
                                    i7 = i6;
                                    break;
                                default:
                                    i7 = 0;
                                    break;
                            }
                            zF = defpackage.ycc.f(iA);
                            z4 = z3;
                            if (i9 == Integer.MIN_VALUE) {
                                if (j(i7)) {
                                    i9 = i5;
                                } else {
                                    i9 = i3;
                                }
                            }
                            if (i10 == Integer.MIN_VALUE) {
                                if (j(i7)) {
                                    i10 = i3;
                                } else {
                                    i10 = i5;
                                }
                            }
                            imageHeaderParser$ImageTypeC = ybtVar.c();
                            str2 = ", density: ";
                            if (i3 > 0 || i5 <= 0) {
                                str3 = ", target density: ";
                                if (android.util.Log.isLoggable("Downsampler", 3)) {
                                    android.util.Log.d("Downsampler", "Unable to determine dimensions for: " + java.lang.String.valueOf(imageHeaderParser$ImageTypeC) + " with target [" + i9 + 'x' + i10 + ']');
                                }
                            } else {
                                boolean zJ = j(i7);
                                int i12 = true != zJ ? i5 : i3;
                                int i13 = true != zJ ? i3 : i5;
                                float fA = ybeVar.a(i13, i12, i9, i10);
                                if (fA <= 0.0f) {
                                    throw new java.lang.IllegalArgumentException("Cannot scale with factor: " + fA + " from: " + java.lang.String.valueOf(ybeVar) + ", source: [" + i3 + 'x' + i5 + "], target: [" + i9 + 'x' + i10 + ']');
                                }
                                int iB = ybeVar.b(i13, i12, i9, i10);
                                float f3 = i13;
                                int i14 = i13;
                                int iC = c(fA * f3);
                                float f4 = i12;
                                int i15 = i12;
                                int i16 = i14 / iC;
                                int iC2 = i15 / c(fA * f4);
                                int iMax = java.lang.Math.max(1, java.lang.Integer.highestOneBit(iB == 1 ? java.lang.Math.max(i16, iC2) : java.lang.Math.min(i16, iC2)));
                                if (iB == 1 && iMax < 1.0f / fA) {
                                    iMax <<= 1;
                                }
                                optionsE.inSampleSize = iMax;
                                if (imageHeaderParser$ImageTypeC == com.bumptech.glide.load.ImageHeaderParser$ImageType.JPEG) {
                                    float fMin = java.lang.Math.min(iMax, 8);
                                    iFloor = (int) java.lang.Math.ceil(f3 / fMin);
                                    iFloor2 = (int) java.lang.Math.ceil(f4 / fMin);
                                    int i17 = iMax / 8;
                                    if (i17 > 0) {
                                        iFloor /= i17;
                                        iFloor2 /= i17;
                                    }
                                } else if (imageHeaderParser$ImageTypeC == com.bumptech.glide.load.ImageHeaderParser$ImageType.PNG || imageHeaderParser$ImageTypeC == com.bumptech.glide.load.ImageHeaderParser$ImageType.PNG_A) {
                                    float f5 = iMax;
                                    iFloor = (int) java.lang.Math.floor(f3 / f5);
                                    iFloor2 = (int) java.lang.Math.floor(f4 / f5);
                                } else if (imageHeaderParser$ImageTypeC.isWebp()) {
                                    float f6 = iMax;
                                    iFloor = java.lang.Math.round(f3 / f6);
                                    iFloor2 = java.lang.Math.round(f4 / f6);
                                } else if (i14 % iMax == 0 && i15 % iMax == 0) {
                                    iFloor = i14 / iMax;
                                    iFloor2 = i15 / iMax;
                                } else {
                                    int[] iArrL2 = l(ybtVar, optionsE, ybgVar, xxmVar3);
                                    iFloor = iArrL2[0];
                                    iFloor2 = iArrL2[1];
                                }
                                double dA = ybeVar.a(iFloor, iFloor2, i9, i10);
                                int iB2 = b(dA);
                                int iC3 = c(((double) iB2) * dA);
                                float f7 = iC3 / iB2;
                                int i18 = iMax;
                                optionsE.inTargetDensity = c((dA / ((double) f7)) * ((double) iC3));
                                optionsE.inDensity = b(dA);
                                if (k(optionsE)) {
                                    optionsE.inScaled = true;
                                } else {
                                    optionsE.inTargetDensity = 0;
                                    optionsE.inDensity = 0;
                                }
                                if (android.util.Log.isLoggable("Downsampler", 2)) {
                                    int i19 = optionsE.inTargetDensity;
                                    int i20 = optionsE.inDensity;
                                    java.lang.StringBuilder sb = new java.lang.StringBuilder("Calculate scaling, source: [");
                                    sb.append(i3);
                                    sb.append('x');
                                    sb.append(i5);
                                    sb.append("], degreesToRotate: ");
                                    sb.append(i7);
                                    sb.append(", target: [");
                                    sb.append(i9);
                                    sb.append('x');
                                    sb.append(i10);
                                    sb.append("], power of two scaled: [");
                                    sb.append(iFloor);
                                    sb.append('x');
                                    sb.append(iFloor2);
                                    sb.append("], exact scale factor: ");
                                    sb.append(fA);
                                    sb.append(", power of 2 sample size: ");
                                    sb.append(i18);
                                    sb.append(", adjusted scale factor: ");
                                    sb.append(dA);
                                    str3 = ", target density: ";
                                    sb.append(str3);
                                    sb.append(i19);
                                    str2 = ", density: ";
                                    sb.append(str2);
                                    sb.append(i20);
                                    android.util.Log.v("Downsampler", sb.toString());
                                } else {
                                    str2 = ", density: ";
                                    str3 = ", target density: ";
                                }
                            }
                            if (this.n.b(i9, i10, z4, zF)) {
                                optionsE.inPreferredConfig = android.graphics.Bitmap.Config.HARDWARE;
                                optionsE.inMutable = false;
                            } else if (xudVar != defpackage.xud.a) {
                                try {
                                    if (ybtVar.c().hasAlpha()) {
                                        config = android.graphics.Bitmap.Config.ARGB_8888;
                                    } else {
                                        config = android.graphics.Bitmap.Config.RGB_565;
                                    }
                                } catch (java.io.IOException e2) {
                                    if (android.util.Log.isLoggable("Downsampler", 3)) {
                                        android.util.Log.d("Downsampler", "Cannot determine whether the image has alpha or not from header, format ".concat(java.lang.String.valueOf(java.lang.String.valueOf(xudVar))), e2);
                                    }
                                }
                                optionsE.inPreferredConfig = config;
                                if (optionsE.inPreferredConfig == android.graphics.Bitmap.Config.RGB_565) {
                                    optionsE.inDither = true;
                                }
                            } else {
                                optionsE.inPreferredConfig = android.graphics.Bitmap.Config.ARGB_8888;
                            }
                            int i21 = optionsE.inSampleSize;
                            if (i3 >= 0 || i5 < 0 || !zBooleanValue) {
                                if (k(optionsE)) {
                                    f2 = optionsE.inTargetDensity / optionsE.inDensity;
                                } else {
                                    f2 = 1.0f;
                                }
                                i8 = optionsE.inSampleSize;
                                float f8 = i8;
                                int iCeil = (int) java.lang.Math.ceil(i3 / f8);
                                int iCeil2 = (int) java.lang.Math.ceil(i5 / f8);
                                iRound = java.lang.Math.round(iCeil * f2);
                                iRound2 = java.lang.Math.round(iCeil2 * f2);
                                if (android.util.Log.isLoggable("Downsampler", 2)) {
                                    android.util.Log.v("Downsampler", "Calculated target [" + iRound + 'x' + iRound2 + "] for source [" + i3 + 'x' + i5 + "], sampleSize: " + i8 + ", targetDensity: " + optionsE.inTargetDensity + str2 + optionsE.inDensity + ", density multiplier: " + f2);
                                }
                                i9 = iRound;
                                i10 = iRound2;
                            }
                            if (i9 > 0 && i10 > 0) {
                                xxmVar2 = this.l;
                                xtq xtqVar2 = this.j;
                                if (optionsE.inPreferredConfig != android.graphics.Bitmap.Config.HARDWARE) {
                                    configM = rs$.ExternalSyntheticApiModelOutline0.m(optionsE);
                                    if (configM == android.graphics.Bitmap.Config.ARGB_8888 && optionsE.inPreferredConfig == android.graphics.Bitmap.Config.RGB_565 && xtqVar2 != null && xtqVar2.a(defpackage.xrx.class)) {
                                        configM = android.graphics.Bitmap.Config.RGB_565;
                                    }
                                    if (configM == null) {
                                        configM = optionsE.inPreferredConfig;
                                    }
                                    optionsE.inBitmap = xxmVar2.b(i9, i10, configM);
                                }
                            }
                            if (xutVar != null) {
                                if (xutVar == defpackage.xut.b || rs$.ExternalSyntheticApiModelOutline0.m(optionsE) == null || !rs$.ExternalSyntheticApiModelOutline0.m(rs$.ExternalSyntheticApiModelOutline0.m(optionsE))) {
                                    namedM$3 = android.graphics.ColorSpace.Named.SRGB;
                                } else {
                                    namedM$3 = da$.ExternalSyntheticApiModelOutline1.m$3();
                                }
                                rs$.ExternalSyntheticApiModelOutline0.m(optionsE, android.graphics.ColorSpace.get(namedM$3));
                            }
                            xxmVar = this.l;
                            bitmapD = d(ybtVar, optionsE, ybgVar, xxmVar);
                            ybgVar.a(xxmVar, bitmapD);
                            if (bitmapD != null && i3 > 0 && i5 > 0 && android.util.Log.isLoggable("GlideMemoryTracking", 3)) {
                                defpackage.ygc.m("Downsampler", ybeVar.getClass().getSimpleName(), bitmapD, i3, i5);
                            }
                            if (android.util.Log.isLoggable("Downsampler", 2)) {
                                try {
                                    options = optionsE;
                                    try {
                                        android.util.Log.v("Downsampler", "Decoded " + f(bitmapD) + " from [" + i3 + 'x' + i5 + "] " + str + " with inBitmap " + g(optionsE) + " for [" + i + 'x' + i2 + "], sample size: " + optionsE.inSampleSize + str2 + optionsE.inDensity + str3 + optionsE.inTargetDensity + ", thread: " + java.lang.Thread.currentThread().getName() + ", duration: " + defpackage.yfx.a(jElapsedRealtimeNanos));
                                    } catch (java.lang.Throwable th) {
                                        th = th;
                                        ybhVar = this;
                                        h(options);
                                        ybhVar.i.c(bArr);
                                        throw th;
                                    }
                                } catch (java.lang.Throwable th2) {
                                    th = th2;
                                    options = optionsE;
                                }
                            } else {
                                options = optionsE;
                            }
                            if (bitmapD != 0) {
                                ybhVar = this;
                                try {
                                    bitmapCreateBitmap = bitmapD;
                                    bitmapCreateBitmap.setDensity(ybhVar.m.densityDpi);
                                    if (defpackage.ycc.f(iA)) {
                                        matrix = new android.graphics.Matrix();
                                        switch (iA) {
                                            case 2:
                                                matrix.setScale(-1.0f, 1.0f);
                                                break;
                                            case 3:
                                                matrix.setRotate(180.0f);
                                                break;
                                            case org.chromium.net.UrlRequest$Status.WAITING_FOR_CACHE /* 4 */:
                                                matrix.setRotate(180.0f);
                                                matrix.postScale(-1.0f, 1.0f);
                                                break;
                                            case org.chromium.net.UrlRequest$Status.DOWNLOADING_PAC_FILE /* 5 */:
                                                matrix.setRotate(90.0f);
                                                matrix.postScale(-1.0f, 1.0f);
                                                break;
                                            case org.chromium.net.UrlRequest$Status.RESOLVING_PROXY_FOR_URL /* 6 */:
                                                matrix.setRotate(90.0f);
                                                break;
                                            case org.chromium.net.UrlRequest$Status.RESOLVING_HOST_IN_PAC_FILE /* 7 */:
                                                matrix.setRotate(-90.0f);
                                                matrix.postScale(-1.0f, 1.0f);
                                                break;
                                            case org.chromium.net.UrlRequest$Status.ESTABLISHING_PROXY_TUNNEL /* 8 */:
                                                matrix.setRotate(-90.0f);
                                                break;
                                        }
                                        bitmapCreateBitmap = android.graphics.Bitmap.createBitmap(bitmapCreateBitmap, 0, 0, bitmapCreateBitmap.getWidth(), bitmapCreateBitmap.getHeight(), matrix, true);
                                        bitmap = bitmapCreateBitmap;
                                    } else {
                                        bitmap = bitmapCreateBitmap;
                                    }
                                    if (!bitmap.equals(bitmapCreateBitmap)) {
                                        xxmVar.d(bitmap);
                                    }
                                } catch (java.lang.Throwable th3) {
                                    th = th3;
                                    h(options);
                                    ybhVar.i.c(bArr);
                                    throw th;
                                }
                            } else {
                                ybhVar = this;
                                bitmapCreateBitmap = null;
                            }
                            defpackage.ybv ybvVarG = defpackage.ybv.g(bitmapCreateBitmap, xxmVar);
                            h(options);
                            ybhVar.i.c(bArr);
                            return ybvVarG;
                        }
                        i5 = i4;
                        z3 = false;
                        iA = ybtVar.a();
                        android.graphics.Paint paint2 = defpackage.ycc.a;
                        switch (iA) {
                            case 3:
                            case org.chromium.net.UrlRequest$Status.WAITING_FOR_CACHE /* 4 */:
                                i6 = 180;
                                i7 = i6;
                                break;
                            case org.chromium.net.UrlRequest$Status.DOWNLOADING_PAC_FILE /* 5 */:
                            case org.chromium.net.UrlRequest$Status.RESOLVING_PROXY_FOR_URL /* 6 */:
                                i6 = 90;
                                i7 = i6;
                                break;
                            case org.chromium.net.UrlRequest$Status.RESOLVING_HOST_IN_PAC_FILE /* 7 */:
                            case org.chromium.net.UrlRequest$Status.ESTABLISHING_PROXY_TUNNEL /* 8 */:
                                i6 = 270;
                                i7 = i6;
                                break;
                            default:
                                i7 = 0;
                                break;
                        }
                        zF = defpackage.ycc.f(iA);
                        z4 = z3;
                        if (i9 == Integer.MIN_VALUE) {
                            if (j(i7)) {
                                i9 = i5;
                            } else {
                                i9 = i3;
                            }
                        }
                        if (i10 == Integer.MIN_VALUE) {
                            if (j(i7)) {
                                i10 = i3;
                            } else {
                                i10 = i5;
                            }
                        }
                        imageHeaderParser$ImageTypeC = ybtVar.c();
                        str2 = ", density: ";
                        if (i3 > 0) {
                            str3 = ", target density: ";
                            if (android.util.Log.isLoggable("Downsampler", 3)) {
                                android.util.Log.d("Downsampler", "Unable to determine dimensions for: " + java.lang.String.valueOf(imageHeaderParser$ImageTypeC) + " with target [" + i9 + 'x' + i10 + ']');
                            }
                        } else {
                            str3 = ", target density: ";
                            if (android.util.Log.isLoggable("Downsampler", 3)) {
                                android.util.Log.d("Downsampler", "Unable to determine dimensions for: " + java.lang.String.valueOf(imageHeaderParser$ImageTypeC) + " with target [" + i9 + 'x' + i10 + ']');
                            }
                        }
                        if (this.n.b(i9, i10, z4, zF)) {
                            optionsE.inPreferredConfig = android.graphics.Bitmap.Config.HARDWARE;
                            optionsE.inMutable = false;
                        } else if (xudVar != defpackage.xud.a) {
                            if (ybtVar.c().hasAlpha()) {
                                config = android.graphics.Bitmap.Config.ARGB_8888;
                            } else {
                                config = android.graphics.Bitmap.Config.RGB_565;
                            }
                            optionsE.inPreferredConfig = config;
                            if (optionsE.inPreferredConfig == android.graphics.Bitmap.Config.RGB_565) {
                                optionsE.inDither = true;
                            }
                        } else {
                            optionsE.inPreferredConfig = android.graphics.Bitmap.Config.ARGB_8888;
                        }
                        int i22 = optionsE.inSampleSize;
                        if (i3 >= 0) {
                            if (k(optionsE)) {
                                f2 = optionsE.inTargetDensity / optionsE.inDensity;
                            } else {
                                f2 = 1.0f;
                            }
                            i8 = optionsE.inSampleSize;
                            float f9 = i8;
                            int iCeil3 = (int) java.lang.Math.ceil(i3 / f9);
                            int iCeil4 = (int) java.lang.Math.ceil(i5 / f9);
                            iRound = java.lang.Math.round(iCeil3 * f2);
                            iRound2 = java.lang.Math.round(iCeil4 * f2);
                            if (android.util.Log.isLoggable("Downsampler", 2)) {
                                android.util.Log.v("Downsampler", "Calculated target [" + iRound + 'x' + iRound2 + "] for source [" + i3 + 'x' + i5 + "], sampleSize: " + i8 + ", targetDensity: " + optionsE.inTargetDensity + str2 + optionsE.inDensity + ", density multiplier: " + f2);
                            }
                            i9 = iRound;
                            i10 = iRound2;
                        } else {
                            if (k(optionsE)) {
                                f2 = optionsE.inTargetDensity / optionsE.inDensity;
                            } else {
                                f2 = 1.0f;
                            }
                            i8 = optionsE.inSampleSize;
                            float f10 = i8;
                            int iCeil5 = (int) java.lang.Math.ceil(i3 / f10);
                            int iCeil6 = (int) java.lang.Math.ceil(i5 / f10);
                            iRound = java.lang.Math.round(iCeil5 * f2);
                            iRound2 = java.lang.Math.round(iCeil6 * f2);
                            if (android.util.Log.isLoggable("Downsampler", 2)) {
                                android.util.Log.v("Downsampler", "Calculated target [" + iRound + 'x' + iRound2 + "] for source [" + i3 + 'x' + i5 + "], sampleSize: " + i8 + ", targetDensity: " + optionsE.inTargetDensity + str2 + optionsE.inDensity + ", density multiplier: " + f2);
                            }
                            i9 = iRound;
                            i10 = iRound2;
                        }
                        if (i9 > 0) {
                            xxmVar2 = this.l;
                            xtq xtqVar3 = this.j;
                            if (optionsE.inPreferredConfig != android.graphics.Bitmap.Config.HARDWARE) {
                                configM = rs$.ExternalSyntheticApiModelOutline0.m(optionsE);
                                if (configM == android.graphics.Bitmap.Config.ARGB_8888) {
                                    configM = android.graphics.Bitmap.Config.RGB_565;
                                }
                                if (configM == null) {
                                    configM = optionsE.inPreferredConfig;
                                }
                                optionsE.inBitmap = xxmVar2.b(i9, i10, configM);
                            }
                        }
                        if (xutVar != null) {
                            if (xutVar == defpackage.xut.b) {
                                namedM$3 = android.graphics.ColorSpace.Named.SRGB;
                            } else {
                                namedM$3 = android.graphics.ColorSpace.Named.SRGB;
                            }
                            rs$.ExternalSyntheticApiModelOutline0.m(optionsE, android.graphics.ColorSpace.get(namedM$3));
                        }
                        xxmVar = this.l;
                        bitmapD = d(ybtVar, optionsE, ybgVar, xxmVar);
                        ybgVar.a(xxmVar, bitmapD);
                        if (bitmapD != null) {
                            defpackage.ygc.m("Downsampler", ybeVar.getClass().getSimpleName(), bitmapD, i3, i5);
                        }
                        if (android.util.Log.isLoggable("Downsampler", 2)) {
                            options = optionsE;
                            android.util.Log.v("Downsampler", "Decoded " + f(bitmapD) + " from [" + i3 + 'x' + i5 + "] " + str + " with inBitmap " + g(optionsE) + " for [" + i + 'x' + i2 + "], sample size: " + optionsE.inSampleSize + str2 + optionsE.inDensity + str3 + optionsE.inTargetDensity + ", thread: " + java.lang.Thread.currentThread().getName() + ", duration: " + defpackage.yfx.a(jElapsedRealtimeNanos));
                        } else {
                            options = optionsE;
                        }
                        if (bitmapD != 0) {
                            ybhVar = this;
                            bitmapCreateBitmap = bitmapD;
                            bitmapCreateBitmap.setDensity(ybhVar.m.densityDpi);
                            if (defpackage.ycc.f(iA)) {
                                bitmap = bitmapCreateBitmap;
                            } else {
                                matrix = new android.graphics.Matrix();
                                switch (iA) {
                                    case 2:
                                        matrix.setScale(-1.0f, 1.0f);
                                        break;
                                    case 3:
                                        matrix.setRotate(180.0f);
                                        break;
                                    case org.chromium.net.UrlRequest$Status.WAITING_FOR_CACHE /* 4 */:
                                        matrix.setRotate(180.0f);
                                        matrix.postScale(-1.0f, 1.0f);
                                        break;
                                    case org.chromium.net.UrlRequest$Status.DOWNLOADING_PAC_FILE /* 5 */:
                                        matrix.setRotate(90.0f);
                                        matrix.postScale(-1.0f, 1.0f);
                                        break;
                                    case org.chromium.net.UrlRequest$Status.RESOLVING_PROXY_FOR_URL /* 6 */:
                                        matrix.setRotate(90.0f);
                                        break;
                                    case org.chromium.net.UrlRequest$Status.RESOLVING_HOST_IN_PAC_FILE /* 7 */:
                                        matrix.setRotate(-90.0f);
                                        matrix.postScale(-1.0f, 1.0f);
                                        break;
                                    case org.chromium.net.UrlRequest$Status.ESTABLISHING_PROXY_TUNNEL /* 8 */:
                                        matrix.setRotate(-90.0f);
                                        break;
                                }
                                bitmapCreateBitmap = android.graphics.Bitmap.createBitmap(bitmapCreateBitmap, 0, 0, bitmapCreateBitmap.getWidth(), bitmapCreateBitmap.getHeight(), matrix, true);
                                bitmap = bitmapCreateBitmap;
                            }
                            if (!bitmap.equals(bitmapCreateBitmap)) {
                                xxmVar.d(bitmap);
                            }
                        } else {
                            ybhVar = this;
                            bitmapCreateBitmap = null;
                        }
                        defpackage.ybv ybvVarG2 = defpackage.ybv.g(bitmapCreateBitmap, xxmVar);
                        h(options);
                        ybhVar.i.c(bArr);
                        return ybvVarG2;
                    }
                    if (i3 != -1) {
                        if (i4 != -1) {
                            i5 = i4;
                            z3 = z2;
                        }
                        iA = ybtVar.a();
                        android.graphics.Paint paint3 = defpackage.ycc.a;
                        switch (iA) {
                            case 3:
                            case org.chromium.net.UrlRequest$Status.WAITING_FOR_CACHE /* 4 */:
                                i6 = 180;
                                i7 = i6;
                                break;
                            case org.chromium.net.UrlRequest$Status.DOWNLOADING_PAC_FILE /* 5 */:
                            case org.chromium.net.UrlRequest$Status.RESOLVING_PROXY_FOR_URL /* 6 */:
                                i6 = 90;
                                i7 = i6;
                                break;
                            case org.chromium.net.UrlRequest$Status.RESOLVING_HOST_IN_PAC_FILE /* 7 */:
                            case org.chromium.net.UrlRequest$Status.ESTABLISHING_PROXY_TUNNEL /* 8 */:
                                i6 = 270;
                                i7 = i6;
                                break;
                            default:
                                i7 = 0;
                                break;
                        }
                        zF = defpackage.ycc.f(iA);
                        z4 = z3;
                        if (i9 == Integer.MIN_VALUE) {
                            if (j(i7)) {
                                i9 = i5;
                            } else {
                                i9 = i3;
                            }
                        }
                        if (i10 == Integer.MIN_VALUE) {
                            if (j(i7)) {
                                i10 = i3;
                            } else {
                                i10 = i5;
                            }
                        }
                        imageHeaderParser$ImageTypeC = ybtVar.c();
                        str2 = ", density: ";
                        if (i3 > 0) {
                            str3 = ", target density: ";
                            if (android.util.Log.isLoggable("Downsampler", 3)) {
                                android.util.Log.d("Downsampler", "Unable to determine dimensions for: " + java.lang.String.valueOf(imageHeaderParser$ImageTypeC) + " with target [" + i9 + 'x' + i10 + ']');
                            }
                        } else {
                            str3 = ", target density: ";
                            if (android.util.Log.isLoggable("Downsampler", 3)) {
                                android.util.Log.d("Downsampler", "Unable to determine dimensions for: " + java.lang.String.valueOf(imageHeaderParser$ImageTypeC) + " with target [" + i9 + 'x' + i10 + ']');
                            }
                        }
                        if (this.n.b(i9, i10, z4, zF)) {
                            optionsE.inPreferredConfig = android.graphics.Bitmap.Config.HARDWARE;
                            optionsE.inMutable = false;
                        } else if (xudVar != defpackage.xud.a) {
                            if (ybtVar.c().hasAlpha()) {
                                config = android.graphics.Bitmap.Config.ARGB_8888;
                            } else {
                                config = android.graphics.Bitmap.Config.RGB_565;
                            }
                            optionsE.inPreferredConfig = config;
                            if (optionsE.inPreferredConfig == android.graphics.Bitmap.Config.RGB_565) {
                                optionsE.inDither = true;
                            }
                        } else {
                            optionsE.inPreferredConfig = android.graphics.Bitmap.Config.ARGB_8888;
                        }
                        int i23 = optionsE.inSampleSize;
                        if (i3 >= 0) {
                            if (k(optionsE)) {
                                f2 = optionsE.inTargetDensity / optionsE.inDensity;
                            } else {
                                f2 = 1.0f;
                            }
                            i8 = optionsE.inSampleSize;
                            float f11 = i8;
                            int iCeil7 = (int) java.lang.Math.ceil(i3 / f11);
                            int iCeil8 = (int) java.lang.Math.ceil(i5 / f11);
                            iRound = java.lang.Math.round(iCeil7 * f2);
                            iRound2 = java.lang.Math.round(iCeil8 * f2);
                            if (android.util.Log.isLoggable("Downsampler", 2)) {
                                android.util.Log.v("Downsampler", "Calculated target [" + iRound + 'x' + iRound2 + "] for source [" + i3 + 'x' + i5 + "], sampleSize: " + i8 + ", targetDensity: " + optionsE.inTargetDensity + str2 + optionsE.inDensity + ", density multiplier: " + f2);
                            }
                            i9 = iRound;
                            i10 = iRound2;
                        } else {
                            if (k(optionsE)) {
                                f2 = optionsE.inTargetDensity / optionsE.inDensity;
                            } else {
                                f2 = 1.0f;
                            }
                            i8 = optionsE.inSampleSize;
                            float f12 = i8;
                            int iCeil9 = (int) java.lang.Math.ceil(i3 / f12);
                            int iCeil10 = (int) java.lang.Math.ceil(i5 / f12);
                            iRound = java.lang.Math.round(iCeil9 * f2);
                            iRound2 = java.lang.Math.round(iCeil10 * f2);
                            if (android.util.Log.isLoggable("Downsampler", 2)) {
                                android.util.Log.v("Downsampler", "Calculated target [" + iRound + 'x' + iRound2 + "] for source [" + i3 + 'x' + i5 + "], sampleSize: " + i8 + ", targetDensity: " + optionsE.inTargetDensity + str2 + optionsE.inDensity + ", density multiplier: " + f2);
                            }
                            i9 = iRound;
                            i10 = iRound2;
                        }
                        if (i9 > 0) {
                            xxmVar2 = this.l;
                            xtq xtqVar4 = this.j;
                            if (optionsE.inPreferredConfig != android.graphics.Bitmap.Config.HARDWARE) {
                                configM = rs$.ExternalSyntheticApiModelOutline0.m(optionsE);
                                if (configM == android.graphics.Bitmap.Config.ARGB_8888) {
                                    configM = android.graphics.Bitmap.Config.RGB_565;
                                }
                                if (configM == null) {
                                    configM = optionsE.inPreferredConfig;
                                }
                                optionsE.inBitmap = xxmVar2.b(i9, i10, configM);
                            }
                        }
                        if (xutVar != null) {
                            if (xutVar == defpackage.xut.b) {
                                namedM$3 = android.graphics.ColorSpace.Named.SRGB;
                            } else {
                                namedM$3 = android.graphics.ColorSpace.Named.SRGB;
                            }
                            rs$.ExternalSyntheticApiModelOutline0.m(optionsE, android.graphics.ColorSpace.get(namedM$3));
                        }
                        xxmVar = this.l;
                        bitmapD = d(ybtVar, optionsE, ybgVar, xxmVar);
                        ybgVar.a(xxmVar, bitmapD);
                        if (bitmapD != null) {
                            defpackage.ygc.m("Downsampler", ybeVar.getClass().getSimpleName(), bitmapD, i3, i5);
                        }
                        if (android.util.Log.isLoggable("Downsampler", 2)) {
                            options = optionsE;
                            android.util.Log.v("Downsampler", "Decoded " + f(bitmapD) + " from [" + i3 + 'x' + i5 + "] " + str + " with inBitmap " + g(optionsE) + " for [" + i + 'x' + i2 + "], sample size: " + optionsE.inSampleSize + str2 + optionsE.inDensity + str3 + optionsE.inTargetDensity + ", thread: " + java.lang.Thread.currentThread().getName() + ", duration: " + defpackage.yfx.a(jElapsedRealtimeNanos));
                        } else {
                            options = optionsE;
                        }
                        if (bitmapD != 0) {
                            ybhVar = this;
                            bitmapCreateBitmap = bitmapD;
                            bitmapCreateBitmap.setDensity(ybhVar.m.densityDpi);
                            if (defpackage.ycc.f(iA)) {
                                bitmap = bitmapCreateBitmap;
                            } else {
                                matrix = new android.graphics.Matrix();
                                switch (iA) {
                                    case 2:
                                        matrix.setScale(-1.0f, 1.0f);
                                        break;
                                    case 3:
                                        matrix.setRotate(180.0f);
                                        break;
                                    case org.chromium.net.UrlRequest$Status.WAITING_FOR_CACHE /* 4 */:
                                        matrix.setRotate(180.0f);
                                        matrix.postScale(-1.0f, 1.0f);
                                        break;
                                    case org.chromium.net.UrlRequest$Status.DOWNLOADING_PAC_FILE /* 5 */:
                                        matrix.setRotate(90.0f);
                                        matrix.postScale(-1.0f, 1.0f);
                                        break;
                                    case org.chromium.net.UrlRequest$Status.RESOLVING_PROXY_FOR_URL /* 6 */:
                                        matrix.setRotate(90.0f);
                                        break;
                                    case org.chromium.net.UrlRequest$Status.RESOLVING_HOST_IN_PAC_FILE /* 7 */:
                                        matrix.setRotate(-90.0f);
                                        matrix.postScale(-1.0f, 1.0f);
                                        break;
                                    case org.chromium.net.UrlRequest$Status.ESTABLISHING_PROXY_TUNNEL /* 8 */:
                                        matrix.setRotate(-90.0f);
                                        break;
                                }
                                bitmapCreateBitmap = android.graphics.Bitmap.createBitmap(bitmapCreateBitmap, 0, 0, bitmapCreateBitmap.getWidth(), bitmapCreateBitmap.getHeight(), matrix, true);
                                bitmap = bitmapCreateBitmap;
                            }
                            if (!bitmap.equals(bitmapCreateBitmap)) {
                                xxmVar.d(bitmap);
                            }
                        } else {
                            ybhVar = this;
                            bitmapCreateBitmap = null;
                        }
                        defpackage.ybv ybvVarG3 = defpackage.ybv.g(bitmapCreateBitmap, xxmVar);
                        h(options);
                        ybhVar.i.c(bArr);
                        return ybvVarG3;
                    }
                    i5 = i4;
                    if (this.n.b(i9, i10, z4, zF)) {
                        optionsE.inPreferredConfig = android.graphics.Bitmap.Config.HARDWARE;
                        optionsE.inMutable = false;
                    } else if (xudVar != defpackage.xud.a) {
                        if (ybtVar.c().hasAlpha()) {
                            config = android.graphics.Bitmap.Config.ARGB_8888;
                        } else {
                            config = android.graphics.Bitmap.Config.RGB_565;
                        }
                        optionsE.inPreferredConfig = config;
                        if (optionsE.inPreferredConfig == android.graphics.Bitmap.Config.RGB_565) {
                            optionsE.inDither = true;
                        }
                    } else {
                        optionsE.inPreferredConfig = android.graphics.Bitmap.Config.ARGB_8888;
                    }
                    int i24 = optionsE.inSampleSize;
                    if (i3 >= 0) {
                        if (k(optionsE)) {
                            f2 = optionsE.inTargetDensity / optionsE.inDensity;
                        } else {
                            f2 = 1.0f;
                        }
                        i8 = optionsE.inSampleSize;
                        float f13 = i8;
                        int iCeil11 = (int) java.lang.Math.ceil(i3 / f13);
                        int iCeil12 = (int) java.lang.Math.ceil(i5 / f13);
                        iRound = java.lang.Math.round(iCeil11 * f2);
                        iRound2 = java.lang.Math.round(iCeil12 * f2);
                        if (android.util.Log.isLoggable("Downsampler", 2)) {
                            android.util.Log.v("Downsampler", "Calculated target [" + iRound + 'x' + iRound2 + "] for source [" + i3 + 'x' + i5 + "], sampleSize: " + i8 + ", targetDensity: " + optionsE.inTargetDensity + str2 + optionsE.inDensity + ", density multiplier: " + f2);
                        }
                        i9 = iRound;
                        i10 = iRound2;
                    } else {
                        if (k(optionsE)) {
                            f2 = optionsE.inTargetDensity / optionsE.inDensity;
                        } else {
                            f2 = 1.0f;
                        }
                        i8 = optionsE.inSampleSize;
                        float f14 = i8;
                        int iCeil13 = (int) java.lang.Math.ceil(i3 / f14);
                        int iCeil14 = (int) java.lang.Math.ceil(i5 / f14);
                        iRound = java.lang.Math.round(iCeil13 * f2);
                        iRound2 = java.lang.Math.round(iCeil14 * f2);
                        if (android.util.Log.isLoggable("Downsampler", 2)) {
                            android.util.Log.v("Downsampler", "Calculated target [" + iRound + 'x' + iRound2 + "] for source [" + i3 + 'x' + i5 + "], sampleSize: " + i8 + ", targetDensity: " + optionsE.inTargetDensity + str2 + optionsE.inDensity + ", density multiplier: " + f2);
                        }
                        i9 = iRound;
                        i10 = iRound2;
                    }
                    if (i9 > 0) {
                        xxmVar2 = this.l;
                        xtq xtqVar5 = this.j;
                        if (optionsE.inPreferredConfig != android.graphics.Bitmap.Config.HARDWARE) {
                            configM = rs$.ExternalSyntheticApiModelOutline0.m(optionsE);
                            if (configM == android.graphics.Bitmap.Config.ARGB_8888) {
                                configM = android.graphics.Bitmap.Config.RGB_565;
                            }
                            if (configM == null) {
                                configM = optionsE.inPreferredConfig;
                            }
                            optionsE.inBitmap = xxmVar2.b(i9, i10, configM);
                        }
                    }
                    if (xutVar != null) {
                        if (xutVar == defpackage.xut.b) {
                            namedM$3 = android.graphics.ColorSpace.Named.SRGB;
                        } else {
                            namedM$3 = android.graphics.ColorSpace.Named.SRGB;
                        }
                        rs$.ExternalSyntheticApiModelOutline0.m(optionsE, android.graphics.ColorSpace.get(namedM$3));
                    }
                    xxmVar = this.l;
                    bitmapD = d(ybtVar, optionsE, ybgVar, xxmVar);
                    ybgVar.a(xxmVar, bitmapD);
                    if (bitmapD != null) {
                        defpackage.ygc.m("Downsampler", ybeVar.getClass().getSimpleName(), bitmapD, i3, i5);
                    }
                    if (android.util.Log.isLoggable("Downsampler", 2)) {
                        options = optionsE;
                        android.util.Log.v("Downsampler", "Decoded " + f(bitmapD) + " from [" + i3 + 'x' + i5 + "] " + str + " with inBitmap " + g(optionsE) + " for [" + i + 'x' + i2 + "], sample size: " + optionsE.inSampleSize + str2 + optionsE.inDensity + str3 + optionsE.inTargetDensity + ", thread: " + java.lang.Thread.currentThread().getName() + ", duration: " + defpackage.yfx.a(jElapsedRealtimeNanos));
                    } else {
                        options = optionsE;
                    }
                    if (bitmapD != 0) {
                        ybhVar = this;
                        bitmapCreateBitmap = bitmapD;
                        bitmapCreateBitmap.setDensity(ybhVar.m.densityDpi);
                        if (defpackage.ycc.f(iA)) {
                            bitmap = bitmapCreateBitmap;
                        } else {
                            matrix = new android.graphics.Matrix();
                            switch (iA) {
                                case 2:
                                    matrix.setScale(-1.0f, 1.0f);
                                    break;
                                case 3:
                                    matrix.setRotate(180.0f);
                                    break;
                                case org.chromium.net.UrlRequest$Status.WAITING_FOR_CACHE /* 4 */:
                                    matrix.setRotate(180.0f);
                                    matrix.postScale(-1.0f, 1.0f);
                                    break;
                                case org.chromium.net.UrlRequest$Status.DOWNLOADING_PAC_FILE /* 5 */:
                                    matrix.setRotate(90.0f);
                                    matrix.postScale(-1.0f, 1.0f);
                                    break;
                                case org.chromium.net.UrlRequest$Status.RESOLVING_PROXY_FOR_URL /* 6 */:
                                    matrix.setRotate(90.0f);
                                    break;
                                case org.chromium.net.UrlRequest$Status.RESOLVING_HOST_IN_PAC_FILE /* 7 */:
                                    matrix.setRotate(-90.0f);
                                    matrix.postScale(-1.0f, 1.0f);
                                    break;
                                case org.chromium.net.UrlRequest$Status.ESTABLISHING_PROXY_TUNNEL /* 8 */:
                                    matrix.setRotate(-90.0f);
                                    break;
                            }
                            bitmapCreateBitmap = android.graphics.Bitmap.createBitmap(bitmapCreateBitmap, 0, 0, bitmapCreateBitmap.getWidth(), bitmapCreateBitmap.getHeight(), matrix, true);
                            bitmap = bitmapCreateBitmap;
                        }
                        if (!bitmap.equals(bitmapCreateBitmap)) {
                            xxmVar.d(bitmap);
                        }
                    } else {
                        ybhVar = this;
                        bitmapCreateBitmap = null;
                    }
                    defpackage.ybv ybvVarG4 = defpackage.ybv.g(bitmapCreateBitmap, xxmVar);
                    h(options);
                    ybhVar.i.c(bArr);
                    return ybvVarG4;
                } catch (java.lang.Throwable th4) {
                    th = th4;
                    ybhVar = this;
                    options = optionsE;
                    h(options);
                    ybhVar.i.c(bArr);
                    throw th;
                }
                if (i3 > 0) {
                    str3 = ", target density: ";
                    if (android.util.Log.isLoggable("Downsampler", 3)) {
                        android.util.Log.d("Downsampler", "Unable to determine dimensions for: " + java.lang.String.valueOf(imageHeaderParser$ImageTypeC) + " with target [" + i9 + 'x' + i10 + ']');
                    }
                } else {
                    str3 = ", target density: ";
                    if (android.util.Log.isLoggable("Downsampler", 3)) {
                        android.util.Log.d("Downsampler", "Unable to determine dimensions for: " + java.lang.String.valueOf(imageHeaderParser$ImageTypeC) + " with target [" + i9 + 'x' + i10 + ']');
                    }
                }
            } catch (java.lang.Throwable th5) {
                th = th5;
                ybhVar = this;
            }
            int i110 = defpackage.yfx.a;
            jElapsedRealtimeNanos = android.os.SystemClock.elapsedRealtimeNanos();
            defpackage.xxm xxmVar4 = ybhVar.l;
            int[] iArrL3 = l(ybtVar, optionsE, ybgVar, xxmVar4);
            i3 = iArrL3[0];
            z2 = z;
            i4 = iArrL3[1];
            str = optionsE.outMimeType;
            i5 = -1;
            z3 = false;
            iA = ybtVar.a();
            android.graphics.Paint paint4 = defpackage.ycc.a;
            switch (iA) {
                case 3:
                case org.chromium.net.UrlRequest$Status.WAITING_FOR_CACHE /* 4 */:
                    i6 = 180;
                    i7 = i6;
                    break;
                case org.chromium.net.UrlRequest$Status.DOWNLOADING_PAC_FILE /* 5 */:
                case org.chromium.net.UrlRequest$Status.RESOLVING_PROXY_FOR_URL /* 6 */:
                    i6 = 90;
                    i7 = i6;
                    break;
                case org.chromium.net.UrlRequest$Status.RESOLVING_HOST_IN_PAC_FILE /* 7 */:
                case org.chromium.net.UrlRequest$Status.ESTABLISHING_PROXY_TUNNEL /* 8 */:
                    i6 = 270;
                    i7 = i6;
                    break;
                default:
                    i7 = 0;
                    break;
            }
            zF = defpackage.ycc.f(iA);
            z4 = z3;
            if (i9 == Integer.MIN_VALUE) {
                if (j(i7)) {
                    i9 = i5;
                } else {
                    i9 = i3;
                }
            }
            if (i10 == Integer.MIN_VALUE) {
                if (j(i7)) {
                    i10 = i3;
                } else {
                    i10 = i5;
                }
            }
            imageHeaderParser$ImageTypeC = ybtVar.c();
            str2 = ", density: ";
        } catch (java.lang.Throwable th6) {
            th = th6;
        }
        ybeVar = ybeVar2;
        boolean zBooleanValue2 = ((java.lang.Boolean) xusVar.b(c)).booleanValue();
        xurVar = d;
        if (xusVar.b(xurVar) == null) {
            z = false;
        } else {
            z = false;
        }
    }
}
