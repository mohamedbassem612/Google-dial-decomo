package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes2.dex */
final class lvb extends defpackage.luu implements android.os.Handler.Callback {
    public static final aimz c = aimz.i("com/android/dialer/contactphoto/ContactPhotoManagerImpl");
    public static final java.lang.String[] d = new java.lang.String[0];
    public static final java.lang.String[] e = {"_id", "data15"};
    public static final defpackage.lux f;
    private static int n;
    public final android.content.Context g;
    public final android.util.LruCache h;
    public final int i;
    public defpackage.luz l;
    public final java.lang.String m;
    private final android.util.LruCache o;
    private boolean s;
    public final j$.util.concurrent.ConcurrentHashMap j = new j$.util.concurrent.ConcurrentHashMap();
    public final android.os.Handler k = new android.os.Handler(this);
    private final java.util.concurrent.atomic.AtomicInteger p = new java.util.concurrent.atomic.AtomicInteger();
    private final java.util.concurrent.atomic.AtomicInteger q = new java.util.concurrent.atomic.AtomicInteger();
    private volatile boolean r = true;

    static {
        defpackage.lux luxVar = new defpackage.lux(new byte[0]);
        f = luxVar;
        luxVar.d = new java.lang.ref.SoftReference(null);
    }

    public lvb(android.content.Context context) {
        this.g = context;
        float f2 = true != ((android.app.ActivityManager) context.getSystemService("activity")).isLowRamDevice() ? 1.0f : 0.5f;
        this.o = new defpackage.luv(this, (int) (1769472.0f * f2));
        int i = (int) (2000000.0f * f2);
        this.h = new defpackage.luw(this, i);
        this.i = (int) (((double) i) * 0.75d);
        c.b().l("com/android/dialer/contactphoto/ContactPhotoManagerImpl", "<init>", 212, "ContactPhotoManagerImpl.java").y("cache adj: %f", java.lang.Float.valueOf(f2));
        n = context.getResources().getDimensionPixelSize(2131165509);
        java.lang.StringBuilder sb = new java.lang.StringBuilder("GoogleDialer ");
        try {
            sb.append(context.getPackageManager().getPackageInfo(context.getPackageName(), 0).versionName);
            sb.append(' ');
        } catch (android.content.pm.PackageManager.NameNotFoundException unused) {
        }
        sb.append(android.os.Build.FINGERPRINT);
        this.m = sb.toString();
    }

    public static void h(defpackage.lux luxVar) {
        int length;
        java.lang.ref.Reference reference;
        byte[] bArr = luxVar.a;
        if (bArr == null || (length = bArr.length) == 0) {
            return;
        }
        if (luxVar.e == 1 && (reference = luxVar.d) != null) {
            luxVar.c = (android.graphics.Bitmap) reference.get();
            if (luxVar.c != null) {
                return;
            }
        }
        try {
            android.graphics.Bitmap bitmapDecodeByteArray = android.graphics.BitmapFactory.decodeByteArray(bArr, 0, length, null);
            int height = bitmapDecodeByteArray.getHeight();
            int width = bitmapDecodeByteArray.getWidth();
            if (height != width && java.lang.Math.min(height, width) <= (n << 1)) {
                int iMin = java.lang.Math.min(height, width);
                bitmapDecodeByteArray = android.media.ThumbnailUtils.extractThumbnail(bitmapDecodeByteArray, iMin, iMin);
            }
            luxVar.e = 1;
            luxVar.c = bitmapDecodeByteArray;
            luxVar.d = new java.lang.ref.SoftReference(bitmapDecodeByteArray);
        } catch (java.lang.OutOfMemoryError e2) {
            a.by(c.b(), "out of memory error when inflating bitmap", "com/android/dialer/contactphoto/ContactPhotoManagerImpl", "inflateBitmap", (char) 306, "ContactPhotoManagerImpl.java", e2);
        } catch (java.lang.RuntimeException e3) {
            a.bq(c.c(), "fail to inflate bitmap", "com/android/dialer/contactphoto/ContactPhotoManagerImpl", "inflateBitmap", (char) 308, "ContactPhotoManagerImpl.java", e3, zct.b);
        }
    }

    private final void i(android.widget.ImageView imageView, defpackage.lva lvaVar) {
        boolean zK = k(imageView, lvaVar);
        j$.util.concurrent.ConcurrentHashMap concurrentHashMap = this.j;
        if (zK) {
            concurrentHashMap.remove(imageView);
        } else {
            concurrentHashMap.put(imageView, lvaVar);
            j();
        }
    }

    private final void j() {
        if (this.s) {
            return;
        }
        this.s = true;
        this.k.sendEmptyMessage(1);
    }

    private final boolean k(android.widget.ImageView imageView, defpackage.lva lvaVar) {
        defpackage.lux luxVar = (defpackage.lux) this.h.get(lvaVar.a());
        if (luxVar == null) {
            boolean z = lvaVar.c;
            lvaVar.b(imageView);
            return false;
        }
        if (luxVar.a == null) {
            boolean z2 = lvaVar.c;
            lvaVar.b(imageView);
            return luxVar.b;
        }
        java.lang.ref.Reference reference = luxVar.d;
        android.graphics.Bitmap bitmap = reference == null ? null : (android.graphics.Bitmap) reference.get();
        if (bitmap == null) {
            boolean z3 = lvaVar.c;
            lvaVar.b(imageView);
            return false;
        }
        imageView.getDrawable();
        android.content.res.Resources resources = this.g.getResources();
        boolean z4 = lvaVar.c;
        defpackage.dwt dwtVar = new defpackage.dwt(resources, bitmap);
        android.graphics.Paint paint = dwtVar.b;
        paint.setAntiAlias(true);
        dwtVar.invalidateSelf();
        float f2 = dwtVar.f / 2.0f;
        if (dwtVar.d != f2) {
            if (defpackage.dwu.c(f2)) {
                paint.setShader(dwtVar.c);
            } else {
                paint.setShader(null);
            }
            dwtVar.d = f2;
            dwtVar.invalidateSelf();
        }
        imageView.setImageDrawable(dwtVar);
        int byteCount = bitmap.getByteCount();
        android.util.LruCache lruCache = this.o;
        if (byteCount < lruCache.maxSize() / 6) {
            lruCache.put(lvaVar.a(), bitmap);
        }
        luxVar.c = null;
        return luxVar.b;
    }

    @Override // defpackage.luu
    public final void d(android.widget.ImageView imageView, android.net.Uri uri) {
        if ("android.resource".equals(uri.getScheme()) && uri.getPathSegments().get(0).equals("drawable")) {
            imageView.setImageURI(uri);
            this.j.remove(imageView);
            return;
        }
        if (!"defaultimage".equals(uri.getScheme())) {
            i(imageView, new defpackage.lva(0L, uri));
            return;
        }
        defpackage.lut lutVar = new defpackage.lut(uri.getQueryParameter("display_name"), uri.getQueryParameter("identifier"), 1, false);
        try {
            java.lang.String queryParameter = uri.getQueryParameter("contact_type");
            if (!android.text.TextUtils.isEmpty(queryParameter)) {
                lutVar.e = java.lang.Integer.parseInt(queryParameter);
            }
            java.lang.String queryParameter2 = uri.getQueryParameter("scale");
            if (!android.text.TextUtils.isEmpty(queryParameter2)) {
                lutVar.f = java.lang.Float.parseFloat(queryParameter2);
            }
            java.lang.String queryParameter3 = uri.getQueryParameter("offset");
            if (!android.text.TextUtils.isEmpty(queryParameter3)) {
                lutVar.g = java.lang.Float.parseFloat(queryParameter3);
            }
            android.text.TextUtils.isEmpty(uri.getQueryParameter("is_circular"));
        } catch (java.lang.NumberFormatException e2) {
            a.bq(defpackage.luu.a.d(), "Invalid DefaultImageRequest image parameters provided, ignoring and using defaults.", "com/android/dialer/contactphoto/ContactPhotoManager", "getDefaultImageRequestFromUri", (char) 165, "ContactPhotoManager.java", e2, zct.b);
        }
        lutVar.h = true;
        mni.bV(imageView, lutVar);
    }

    @Override // defpackage.luu
    public final void e(android.widget.ImageView imageView, long j, defpackage.lut lutVar) {
        if (j != 0) {
            i(imageView, new defpackage.lva(j, null));
        } else {
            mni.bV(imageView, lutVar);
            this.j.remove(imageView);
        }
    }

    public final void f() {
        if (this.l == null) {
            defpackage.luz luzVar = new defpackage.luz(this);
            this.l = luzVar;
            luzVar.start();
        }
    }

    public final void g(java.lang.Object obj, byte[] bArr, boolean z) {
        defpackage.lux luxVar;
        if (android.util.Log.isLoggable("Dialer", 2) && (luxVar = (defpackage.lux) this.h.get(obj)) != null && luxVar.a != null) {
            if (luxVar.b) {
                this.q.incrementAndGet();
            } else {
                this.p.incrementAndGet();
            }
        }
        if (bArr != null) {
            android.graphics.BitmapFactory.Options options = new android.graphics.BitmapFactory.Options();
            options.inJustDecodeBounds = true;
            android.graphics.BitmapFactory.decodeByteArray(bArr, 0, bArr.length, options);
            int i = options.outWidth;
            int i2 = options.outHeight;
        }
        defpackage.lux luxVar2 = new defpackage.lux(bArr);
        if (!z) {
            h(luxVar2);
        }
        android.util.LruCache lruCache = this.h;
        if (bArr != null) {
            lruCache.put(obj, luxVar2);
            if (lruCache.get(obj) != luxVar2) {
                a.bI(c.d(), "bitmap too big to fit in cache.", "com/android/dialer/contactphoto/ContactPhotoManagerImpl", "cacheBitmap", (char) 640, "ContactPhotoManagerImpl.java", zct.b);
                lruCache.put(obj, f);
            }
        } else {
            lruCache.put(obj, f);
        }
        this.r = false;
    }

    @Override // android.os.Handler.Callback
    public final boolean handleMessage(android.os.Message message) {
        int i = message.what;
        if (i == 1) {
            this.s = false;
            f();
            defpackage.luz luzVar = this.l;
            luzVar.a();
            luzVar.a.removeMessages(0);
            luzVar.a.sendEmptyMessage(1);
        } else {
            if (i != 2) {
                return false;
            }
            j$.util.concurrent.ConcurrentHashMap concurrentHashMap = this.j;
            java.util.Iterator it = concurrentHashMap.entrySet().iterator();
            while (it.hasNext()) {
                java.util.Map.Entry entry = (java.util.Map.Entry) it.next();
                if (k((android.widget.ImageView) entry.getKey(), (defpackage.lva) entry.getValue())) {
                    it.remove();
                }
            }
            java.util.Iterator it2 = this.h.snapshot().values().iterator();
            while (it2.hasNext()) {
                ((defpackage.lux) it2.next()).c = null;
            }
            if (!concurrentHashMap.isEmpty()) {
                j();
            }
        }
        return true;
    }

    @Override // defpackage.luu, android.content.ComponentCallbacks2
    public final void onTrimMemory(int i) {
        if (i >= 60) {
            this.j.clear();
            this.h.evictAll();
            this.o.evictAll();
        }
    }
}
