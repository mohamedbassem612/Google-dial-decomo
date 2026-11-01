package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes3.dex */
public final /* synthetic */ class agrz implements java.lang.Runnable {
    private final /* synthetic */ int $cid;
    public final /* synthetic */ java.lang.Object a;
    public final /* synthetic */ java.lang.Object b;

    public agrz(ainj ainjVar, aini ainiVar, int i) {
        this.$cid = i;
        this.a = ainiVar;
        j$.util.Objects.requireNonNull(ainjVar);
        this.b = ainjVar;
    }

    /* JADX WARN: Type inference failed for: r0v11, types: [java.lang.Object, java.lang.Runnable] */
    /* JADX WARN: Type inference failed for: r0v28, types: [ajwe, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r0v30, types: [java.lang.Object, java.util.concurrent.Callable] */
    /* JADX WARN: Type inference failed for: r0v34, types: [java.lang.Object, java.lang.Runnable] */
    /* JADX WARN: Type inference failed for: r0v37, types: [java.lang.Object, java.lang.Runnable] */
    /* JADX WARN: Type inference failed for: r0v40, types: [java.lang.Object, java.lang.Runnable] */
    /* JADX WARN: Type inference failed for: r0v82, types: [java.lang.Object, java.lang.Runnable] */
    /* JADX WARN: Type inference failed for: r1v17, types: [ajwe, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r1v8, types: [ajcu, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r2v24, types: [java.lang.Object, java.util.List] */
    @Override // java.lang.Runnable
    public final void run() throws java.lang.Exception {
        byte[] bArrG;
        java.nio.ByteBuffer byteBufferAllocateDirect;
        int i = 3;
        int iRemaining = 0;
        switch (this.$cid) {
            case 0:
                java.lang.Object obj = this.a;
                java.io.File fileK = ((defpackage.agsa) obj).d.k((ahkk) this.b);
                java.lang.String[] list = fileK.list(new defpackage.agry(obj, iRemaining));
                if (list != null) {
                    while (iRemaining < list.length) {
                        java.lang.String str = list[iRemaining];
                        if (new java.io.File(fileK, str).delete()) {
                            defpackage.agsa.a.b().l("com/google/apps/tiktok/cache/OrphanCacheSingletonSynclet", "clean", 100, "OrphanCacheSingletonSynclet.java").y("Removed orphaned cache file: %s", str);
                        } else {
                            defpackage.agsa.a.c().l("com/google/apps/tiktok/cache/OrphanCacheSingletonSynclet", "clean", 102, "OrphanCacheSingletonSynclet.java").y("Failed to remove orphaned cache file: %s", str);
                        }
                        iRemaining++;
                    }
                    return;
                }
                return;
            case 1:
                java.lang.Object obj2 = ((adai) this.b).b;
                java.lang.String strA = defpackage.agqo.a((com.google.apps.tiktok.account.AccountId) this.a);
                ailj ailjVarK = ((ajwr) obj2).j().k();
                while (ailjVarK.hasNext()) {
                    java.io.File file = new java.io.File((java.io.File) ailjVarK.next(), strA);
                    if (file.exists() && !file.setWritable(true, true)) {
                        throw new java.lang.RuntimeException("Could not make data dir writable.");
                    }
                }
                return;
            case 2:
                this.b.execute(new defpackage.agdr(this.a, 8));
                return;
            case 3:
                this.b.run();
                java.lang.ThreadLocal threadLocal = ((defpackage.agvu) this.a).a;
                java.lang.Throwable th = (java.lang.Throwable) threadLocal.get();
                threadLocal.remove();
                if (th != null) {
                    throw th;
                }
                return;
            case org.chromium.net.UrlRequest$Status.WAITING_FOR_CACHE /* 4 */:
                java.util.Set set = ((defpackage.agzq) this.a).g;
                if (set != null) {
                    set.remove(this.b);
                    return;
                }
                return;
            case org.chromium.net.UrlRequest$Status.DOWNLOADING_PAC_FILE /* 5 */:
                ((defpackage.agzq) this.a).d((defpackage.amdx) this.b);
                return;
            case org.chromium.net.UrlRequest$Status.RESOLVING_PROXY_FOR_URL /* 6 */:
                ((ainj) this.b).a.remove(this.a);
                return;
            case org.chromium.net.UrlRequest$Status.RESOLVING_HOST_IN_PAC_FILE /* 7 */:
                java.lang.Object obj3 = this.a;
                ajwe ajweVar = ((defpackage.ajug) obj3).b;
                ?? r1 = this.b;
                if (ajweVar != defpackage.ajug.a) {
                    throw new java.lang.IllegalStateException("provide() can be called only once.");
                }
                synchronized (obj3) {
                    ((defpackage.ajug) obj3).b = r1;
                    break;
                }
                return;
            case org.chromium.net.UrlRequest$Status.ESTABLISHING_PROXY_TUNNEL /* 8 */:
                ((ajud) this.a).c((ajwe) this.b);
                return;
            case org.chromium.net.UrlRequest$Status.RESOLVING_HOST /* 9 */:
                int i2 = ajuo.c;
                java.lang.Object obj4 = this.a;
                try {
                    ((defpackage.aprf) obj4).e(this.b.call());
                    return;
                } catch (java.lang.Exception e) {
                    ((defpackage.aprf) obj4).f(e);
                    return;
                }
            case org.chromium.net.UrlRequest$Status.CONNECTING /* 10 */:
                int i3 = ajuo.c;
                try {
                    this.b.run();
                    return;
                } catch (java.lang.Exception e2) {
                    ((defpackage.aprf) this.a).f(e2);
                    return;
                }
            case org.chromium.net.UrlRequest$Status.SSL_HANDSHAKE /* 11 */:
                int i4 = ajuo.c;
                try {
                    this.b.run();
                    return;
                } catch (java.lang.Exception e3) {
                    ((defpackage.aprf) this.a).f(e3);
                    throw e3;
                }
            case org.chromium.net.UrlRequest$Status.SENDING_REQUEST /* 12 */:
                int i5 = ajuo.c;
                java.lang.Object obj5 = this.a;
                try {
                    this.b.run();
                    ((defpackage.aprf) obj5).e(null);
                    return;
                } catch (java.lang.Exception e4) {
                    ((defpackage.aprf) obj5).f(e4);
                    return;
                }
            case org.chromium.net.UrlRequest$Status.WAITING_FOR_RESPONSE /* 13 */:
                java.lang.Object obj6 = this.a;
                try {
                    boolean zIsLoggable = android.util.Log.isLoggable("FirebaseMessaging", 4);
                    java.lang.Object obj7 = this.b;
                    if (zIsLoggable) {
                        android.util.Log.i("FirebaseMessaging", "Starting download of: ".concat(((defpackage.ajxn) obj7).a.toString()));
                    }
                    java.net.URL url = ((defpackage.ajxn) obj7).a;
                    java.net.URLConnection uRLConnectionOpenConnection = url.openConnection();
                    if (uRLConnectionOpenConnection.getContentLength() > 1048576) {
                        throw new java.io.IOException("Content-Length exceeds max size of 1048576");
                    }
                    java.io.InputStream inputStream = uRLConnectionOpenConnection.getInputStream();
                    try {
                        defpackage.ajxa ajxaVar = new defpackage.ajxa(inputStream);
                        java.util.ArrayDeque arrayDeque = new java.util.ArrayDeque(20);
                        int i6 = 128;
                        int i7 = 0;
                        while (true) {
                            if (i7 < 2147483639) {
                                int iMin = java.lang.Math.min(i6, 2147483639 - i7);
                                byte[] bArr = new byte[iMin];
                                arrayDeque.add(bArr);
                                int i8 = 0;
                                while (true) {
                                    if (i8 >= iMin) {
                                        long j = ((long) i6) * ((long) (i6 < 4096 ? 4 : 2));
                                        i6 = j > 2147483647L ? Integer.MAX_VALUE : j < -2147483648L ? Integer.MIN_VALUE : (int) j;
                                    } else {
                                        int i9 = ajxaVar.read(bArr, i8, iMin - i8);
                                        if (i9 == -1) {
                                            bArrG = a.g(arrayDeque, i7);
                                        } else {
                                            i8 += i9;
                                            i7 += i9;
                                        }
                                    }
                                }
                            } else {
                                if (ajxaVar.read() != -1) {
                                    throw new java.lang.OutOfMemoryError("input is too large to fit in a byte array");
                                }
                                bArrG = a.g(arrayDeque, 2147483639);
                            }
                        }
                        if (inputStream != null) {
                            inputStream.close();
                        }
                        if (android.util.Log.isLoggable("FirebaseMessaging", 2)) {
                            android.util.Log.v("FirebaseMessaging", "Downloaded " + bArrG.length + " bytes from " + url.toString());
                        }
                        int length = bArrG.length;
                        if (length > 1048576) {
                            throw new java.io.IOException("Image exceeds max size of 1048576");
                        }
                        android.graphics.Bitmap bitmapDecodeByteArray = android.graphics.BitmapFactory.decodeByteArray(bArrG, 0, length);
                        if (bitmapDecodeByteArray == null) {
                            throw new java.io.IOException("Failed to decode image: ".concat(url.toString()));
                        }
                        if (android.util.Log.isLoggable("FirebaseMessaging", 3)) {
                            android.util.Log.d("FirebaseMessaging", "Successfully downloaded image: ".concat(url.toString()));
                        }
                        ((zzx) obj6).g(bitmapDecodeByteArray);
                        return;
                    } catch (java.lang.Throwable th2) {
                        if (inputStream == null) {
                            throw th2;
                        }
                        try {
                            inputStream.close();
                            throw th2;
                        } catch (java.lang.Throwable th3) {
                            th2.addSuppressed(th3);
                            throw th2;
                        }
                    }
                } catch (java.lang.Exception e5) {
                    ((zzx) obj6).f(e5);
                    return;
                }
            case org.chromium.net.UrlRequest$Status.READING_RESPONSE /* 14 */:
                defpackage.ajzg ajzgVar = (defpackage.ajzg) this.a;
                ?? r2 = ajzgVar.d.a;
                if (r2.isEmpty()) {
                    byteBufferAllocateDirect = java.nio.ByteBuffer.allocateDirect(0);
                } else if (r2.size() == 1) {
                    byteBufferAllocateDirect = (java.nio.ByteBuffer) r2.get(0);
                    if (byteBufferAllocateDirect.hasRemaining()) {
                        byteBufferAllocateDirect.flip();
                    }
                    byteBufferAllocateDirect.position(0);
                } else {
                    for (java.nio.ByteBuffer byteBuffer : r2) {
                        byteBuffer.flip();
                        iRemaining += byteBuffer.remaining();
                    }
                    java.nio.ByteBuffer byteBufferAllocateDirect2 = java.nio.ByteBuffer.allocateDirect(iRemaining);
                    java.util.Iterator it = r2.iterator();
                    while (it.hasNext()) {
                        byteBufferAllocateDirect2.put((java.nio.ByteBuffer) it.next());
                    }
                    byteBufferAllocateDirect2.flip();
                    byteBufferAllocateDirect = byteBufferAllocateDirect2;
                }
                aiof aiofVar = ajzh.a;
                org.chromium.net.UrlResponseInfo urlResponseInfo = (org.chromium.net.UrlResponseInfo) this.b;
                ajzgVar.a(urlResponseInfo);
                byteBufferAllocateDirect.remaining();
                ajdd ajddVar = ajzgVar.a;
                defpackage.ajzq ajzqVar = new defpackage.ajzq();
                ajzqVar.a(defpackage.ajzg.b(urlResponseInfo.getAllHeaders()));
                ajzqVar.b(byteBufferAllocateDirect);
                ajzqVar.d = urlResponseInfo.getHttpStatusCode();
                ajzqVar.b.addAll(ajzgVar.c);
                ajddVar.o(new defpackage.alic(ajzqVar));
                return;
            case 15:
                java.lang.Object obj8 = this.b;
                if (obj8 instanceof org.chromium.net.CallbackException) {
                    i = 14;
                } else if (!(obj8 instanceof org.chromium.net.NetworkException) || ((org.chromium.net.NetworkException) obj8).getErrorCode() != 11) {
                    i = 15;
                }
                ((defpackage.ajzg) this.a).a.p(new defpackage.ajzi((java.lang.Throwable) obj8, i));
                return;
            case 16:
                java.util.Map map = ((akam) this.b).b;
                java.lang.Object obj9 = this.a;
                synchronized (map) {
                    map.remove(obj9);
                    break;
                }
                return;
            case 17:
                ((defpackage.akbb) this.a).c().dy(this.b);
                return;
            case 18:
                ((defpackage.akbf) this.a).c().dy(this.b);
                return;
            case 19:
                defpackage.akbj akbjVar = (defpackage.akbj) this.a;
                akbjVar.d.a(akbjVar.c, (anph) this.b);
                return;
            default:
                defpackage.akbj akbjVar2 = (defpackage.akbj) this.a;
                if (akbjVar2.b) {
                    return;
                }
                ?? r0 = this.b;
                if (akbjVar2.d == null) {
                    akbjVar2.a.add(r0);
                    return;
                }
                try {
                    r0.run();
                    return;
                } catch (java.lang.Throwable th4) {
                    akbjVar2.c.a(anqw.d(th4), new anph());
                    return;
                }
        }
    }

    public /* synthetic */ agrz(java.lang.Object obj, java.lang.Object obj2, int i, byte[] bArr) {
        this.$cid = i;
        this.b = obj;
        this.a = obj2;
    }

    public /* synthetic */ agrz(java.lang.Object obj, java.lang.Object obj2, int i) {
        this.$cid = i;
        this.a = obj;
        this.b = obj2;
    }

    public agrz(defpackage.ajzg ajzgVar, org.chromium.net.UrlResponseInfo urlResponseInfo, int i) {
        this.$cid = i;
        this.b = urlResponseInfo;
        j$.util.Objects.requireNonNull(ajzgVar);
        this.a = ajzgVar;
    }

    public agrz(defpackage.ajzg ajzgVar, org.chromium.net.CronetException cronetException, int i) {
        this.$cid = i;
        this.b = cronetException;
        j$.util.Objects.requireNonNull(ajzgVar);
        this.a = ajzgVar;
    }
}
