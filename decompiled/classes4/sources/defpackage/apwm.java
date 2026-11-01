package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes4.dex */
public final class apwm extends org.chromium.net.ExperimentalUrlRequest {
    public static final java.lang.String a = "apwm";
    public final defpackage.apwk b;
    public final java.util.concurrent.Executor c;
    public final java.lang.String d;
    public final boolean h;
    public final java.lang.String i;
    public final defpackage.apwx j;
    public final java.util.concurrent.Executor k;
    public java.lang.String m;
    public java.nio.channels.ReadableByteChannel n;
    public defpackage.apwu o;
    public java.lang.String p;
    public java.net.HttpURLConnection q;
    public final defpackage.apvy r;
    public final int s;
    public final defpackage.apvs t;
    public final long u;
    public int v;
    public int w;
    public boolean x;
    public defpackage.apwe y;
    public final java.util.Map e = new java.util.TreeMap(java.lang.String.CASE_INSENSITIVE_ORDER);
    public final java.util.List f = new java.util.ArrayList();
    public final java.util.concurrent.atomic.AtomicInteger g = new java.util.concurrent.atomic.AtomicInteger(0);
    private final java.util.concurrent.atomic.AtomicBoolean z = new java.util.concurrent.atomic.AtomicBoolean(false);
    public volatile int l = -1;

    public apwm(defpackage.apvy apvyVar, org.chromium.net.UrlRequest.Callback callback, final java.util.concurrent.Executor executor, java.util.concurrent.Executor executor2, java.lang.String str, java.lang.String str2, boolean z, boolean z2, int i, final boolean z3, final int i2, long j, java.lang.String str3, java.util.ArrayList arrayList, org.chromium.net.UploadDataProvider uploadDataProvider, java.util.concurrent.Executor executor3) {
        defpackage.apwx apwxVar = null;
        new xkn("Cronet JavaUrlRequest#JavaUrlRequest", 3, (byte[]) null);
        try {
            j$.util.Objects.requireNonNull(str, "URL is required");
            j$.util.Objects.requireNonNull(callback, "Listener is required");
            j$.util.Objects.requireNonNull(executor, "Executor is required");
            j$.util.Objects.requireNonNull(executor2, "userExecutor is required");
            this.h = z;
            this.b = new defpackage.apwk(this, callback, executor2);
            final int threadStatsTag = !z2 ? android.net.TrafficStats.getThreadStatsTag() : i;
            this.c = new defpackage.apwl(new java.util.concurrent.Executor() { // from class: apwf
                @Override // java.util.concurrent.Executor
                public final void execute(final java.lang.Runnable runnable) {
                    java.lang.String str4 = defpackage.apwm.a;
                    final int i3 = threadStatsTag;
                    final boolean z4 = z3;
                    final int i4 = i2;
                    executor.execute(new java.lang.Runnable() { // from class: apwg
                        @Override // java.lang.Runnable
                        public final void run() {
                            java.lang.String str5 = defpackage.apwm.a;
                            int threadStatsTag2 = android.net.TrafficStats.getThreadStatsTag();
                            android.net.TrafficStats.setThreadStatsTag(i3);
                            java.lang.Runnable runnable2 = runnable;
                            boolean z5 = z4;
                            if (z5) {
                                org.chromium.net.ThreadStatsUid.set(i4);
                            }
                            try {
                                runnable2.run();
                            } finally {
                                if (z5) {
                                    org.chromium.net.ThreadStatsUid.clear();
                                }
                                android.net.TrafficStats.setThreadStatsTag(threadStatsTag2);
                            }
                        }
                    });
                }
            });
            this.r = apvyVar;
            this.s = apvyVar.a;
            this.t = apvyVar.b;
            this.m = str;
            this.d = str2;
            this.u = j;
            j$.util.Objects.requireNonNull(str3, "Method is required.");
            if (!"OPTIONS".equalsIgnoreCase(str3) && !"GET".equalsIgnoreCase(str3) && !"HEAD".equalsIgnoreCase(str3) && !"POST".equalsIgnoreCase(str3) && !"PUT".equalsIgnoreCase(str3) && !"DELETE".equalsIgnoreCase(str3) && !"TRACE".equalsIgnoreCase(str3) && !"PATCH".equalsIgnoreCase(str3)) {
                throw new java.lang.IllegalArgumentException("Invalid http method ".concat(str3));
            }
            this.i = str3;
            int size = arrayList.size();
            for (int i3 = 0; i3 < size; i3++) {
                java.util.Map.Entry entry = (java.util.Map.Entry) arrayList.get(i3);
                java.lang.String str4 = (java.lang.String) entry.getKey();
                for (int i4 = 0; i4 < str4.length(); i4++) {
                    char cCharAt = str4.charAt(i4);
                    if (cCharAt != ',' && cCharAt != '/' && cCharAt != '{' && cCharAt != '}') {
                        switch (cCharAt) {
                            case '\'':
                            case '(':
                            case ')':
                                break;
                            default:
                                switch (cCharAt) {
                                    case ':':
                                    case ';':
                                    case '<':
                                    case '=':
                                    case '>':
                                    case '?':
                                    case '@':
                                        break;
                                    default:
                                        switch (cCharAt) {
                                            case '[':
                                            case '\\':
                                            case ']':
                                                break;
                                            default:
                                                if (!java.lang.Character.isISOControl(cCharAt) && !java.lang.Character.isWhitespace(cCharAt)) {
                                                }
                                                break;
                                        }
                                        break;
                                }
                                break;
                        }
                    }
                    throw new java.lang.IllegalArgumentException("Invalid header with headername: ".concat(java.lang.String.valueOf((java.lang.String) entry.getKey())));
                }
                if (((java.lang.String) entry.getValue()).contains("\r\n")) {
                    throw new java.lang.IllegalArgumentException("Invalid header with headername: ".concat(java.lang.String.valueOf((java.lang.String) entry.getKey())));
                }
                this.e.put((java.lang.String) entry.getKey(), (java.lang.String) entry.getValue());
            }
            if (uploadDataProvider != null) {
                if (!this.e.containsKey("Content-Type")) {
                    throw new java.lang.IllegalArgumentException("Requests with upload data must have a Content-Type.");
                }
                apwxVar = new defpackage.apwx(uploadDataProvider);
            }
            this.j = apwxVar;
            this.k = (executor3 == null || this.h) ? executor3 : new defpackage.dxq(executor3, 2);
            android.os.Trace.endSection();
        } catch (java.lang.Throwable th) {
            try {
                android.os.Trace.endSection();
                throw th;
            } catch (java.lang.Throwable th2) {
                th.addSuppressed(th2);
                throw th;
            }
        }
    }

    public final void a() {
        d(new defpackage.aobd(this, 16), "closeResponseChannel");
    }

    public final void b(org.chromium.net.CronetException cronetException) {
        java.util.concurrent.atomic.AtomicInteger atomicInteger;
        int i;
        do {
            atomicInteger = this.g;
            i = atomicInteger.get();
            if (i == 0) {
                throw new java.lang.IllegalStateException("Can't enter error state before start");
            }
            if (i == 6 || i == 7 || i == 8) {
                return;
            }
        } while (!atomicInteger.compareAndSet(i, 6));
        f();
        e();
        defpackage.apwk apwkVar = this.b;
        defpackage.apwu apwuVar = this.o;
        apwkVar.d.a();
        defpackage.apwa apwaVar = new defpackage.apwa(apwkVar, apwuVar, cronetException, 3);
        try {
            apwkVar.b(apwaVar, "onFailed");
        } catch (org.chromium.net.InlineExecutionProhibitedException unused) {
            java.util.concurrent.Executor executor = apwkVar.c;
            if (executor != null) {
                new xkn("Cronet JavaUrlRequest.AsyncUrlRequestCallback#executeOnFallbackExecutor onFailed", 3, (byte[]) null);
                try {
                    executor.execute(new defpackage.apwi(apwaVar, 0));
                    android.os.Trace.endSection();
                } catch (java.lang.Throwable th) {
                    try {
                        android.os.Trace.endSection();
                    } catch (java.lang.Throwable th2) {
                        th.addSuppressed(th2);
                    }
                    throw th;
                }
            }
        }
    }

    public final void c(java.lang.Throwable th) {
        b(new defpackage.apvh("Exception received from UploadDataProvider", th));
    }

    @Override // org.chromium.net.UrlRequest
    public final void cancel() {
        int andSet = this.g.getAndSet(8);
        int i = 3;
        if (andSet == 1 || andSet == 2 || andSet == 3 || andSet == 4 || andSet == 5) {
            f();
            e();
            defpackage.apwk apwkVar = this.b;
            defpackage.apwu apwuVar = this.o;
            apwkVar.d.a();
            apwkVar.b(new defpackage.apwi(apwkVar, apwuVar, i), "onCanceled");
        }
    }

    public final void d(java.lang.Runnable runnable, java.lang.String str) {
        new xkn("Cronet JavaUrlRequest#executeOnExecutor ".concat(str), 3, (byte[]) null);
        try {
            this.c.execute(new anxz(str, runnable, 19, (byte[]) null));
            android.os.Trace.endSection();
        } catch (java.lang.Throwable th) {
            try {
                android.os.Trace.endSection();
            } catch (java.lang.Throwable th2) {
                th.addSuppressed(th2);
            }
            throw th;
        }
    }

    public final void e() {
        defpackage.apwx apwxVar = this.j;
        if (apwxVar == null || !this.z.compareAndSet(false, true)) {
            return;
        }
        try {
            java.util.concurrent.Executor executor = this.k;
            j$.util.Objects.requireNonNull(apwxVar);
            executor.execute(new anxz(this, new defpackage.apwb(apwxVar, 3), 16));
        } catch (java.util.concurrent.RejectedExecutionException e) {
            android.util.Log.e("cn_".concat(java.lang.String.valueOf(a)), "Exception when closing uploadDataProvider", e);
        }
    }

    public final void f() {
        d(new defpackage.aobd(this, 14), "fireDisconnect");
    }

    @Override // org.chromium.net.UrlRequest
    public final void followRedirect() {
        j(3, 1, new defpackage.aobd(this, 18, (int[]) null));
    }

    public final void g() {
        this.l = 13;
        d(new anxz(this, new defpackage.apwb(this, 4), 15), "fireGetHeaders");
    }

    @Override // org.chromium.net.UrlRequest
    public final void getStatus(org.chromium.net.UrlRequest.StatusListener statusListener) {
        int i = this.g.get();
        int i2 = this.l;
        switch (i) {
            case 0:
            case 6:
            case 7:
            case 8:
                i2 = -1;
                break;
            case 1:
                break;
            case 2:
            case 3:
            case 4:
                i2 = 0;
                break;
            case 5:
                i2 = 14;
                break;
            default:
                throw new java.lang.IllegalStateException(a.bj(i, "Switch is exhaustive: "));
        }
        this.b.b(new defpackage.akbd(new defpackage.apwz(statusListener), i2, 9), "sendStatus");
    }

    public final void h() {
        d(new anxz(this, new defpackage.apwb(this, 2), 15), "fireOpenConnection");
    }

    public final void i(java.lang.String str, java.lang.Exception exc) {
        android.util.Log.e("cn_".concat(java.lang.String.valueOf(a)), a.bk(str, "Exception in ", " method"), exc);
        this.x = true;
    }

    @Override // org.chromium.net.UrlRequest
    public final boolean isDone() {
        int i = this.g.get();
        return i == 7 || i == 6 || i == 8;
    }

    public final void j(int i, int i2, java.lang.Runnable runnable) {
        java.util.concurrent.atomic.AtomicInteger atomicInteger = this.g;
        if (!atomicInteger.compareAndSet(i, i2)) {
            int i3 = atomicInteger.get();
            if (i3 == 8 || i3 == 6) {
                return;
            }
            throw new java.lang.IllegalStateException("Invalid state transition - expected " + defpackage.aoil.j(i) + " but was " + defpackage.aoil.j(i3));
        }
        new xkn("Cronet JavaUrlRequest#transitionStates " + defpackage.aoil.j(i) + " -> " + defpackage.aoil.j(i2), 3, (byte[]) null);
        try {
            runnable.run();
            android.os.Trace.endSection();
        } catch (java.lang.Throwable th) {
            try {
                android.os.Trace.endSection();
            } catch (java.lang.Throwable th2) {
                th.addSuppressed(th2);
            }
            throw th;
        }
    }

    @Override // org.chromium.net.UrlRequest
    public final void read(final java.nio.ByteBuffer byteBuffer) {
        defpackage.aoil.i(byteBuffer);
        if (!byteBuffer.hasRemaining()) {
            throw new java.lang.IllegalArgumentException("ByteBuffer is already full.");
        }
        j(4, 5, new anxz(this, new defpackage.apwn() { // from class: apwh
            @Override // defpackage.apwn
            public final void a() throws java.io.IOException {
                int i;
                defpackage.apwm apwmVar = this.a;
                java.nio.channels.ReadableByteChannel readableByteChannel = apwmVar.n;
                final java.nio.ByteBuffer byteBuffer2 = byteBuffer;
                final int i2 = 1;
                if (readableByteChannel != null) {
                    apwmVar.v++;
                    i = readableByteChannel.read(byteBuffer2);
                } else {
                    i = -1;
                }
                if (i != -1) {
                    final defpackage.apwk apwkVar = apwmVar.b;
                    final defpackage.apwu apwuVar = apwmVar.o;
                    apwkVar.a(new defpackage.apwn() { // from class: apwj
                        @Override // defpackage.apwn
                        public final void a() {
                            int i3 = i2;
                            defpackage.apwk apwkVar2 = apwkVar;
                            if (i3 == 0) {
                                java.lang.Object obj = byteBuffer2;
                                apwkVar2.a.onRedirectReceived(apwkVar2.d, apwuVar, (java.lang.String) obj);
                            } else {
                                defpackage.apwm apwmVar2 = apwkVar2.d;
                                if (apwmVar2.g.compareAndSet(5, 4)) {
                                    java.lang.Object obj2 = byteBuffer2;
                                    apwkVar2.a.onReadCompleted(apwmVar2, apwuVar, (java.nio.ByteBuffer) obj2);
                                }
                            }
                        }
                    }, "onReadCompleted");
                    return;
                }
                java.nio.channels.ReadableByteChannel readableByteChannel2 = apwmVar.n;
                if (readableByteChannel2 != null) {
                    readableByteChannel2.close();
                }
                if (apwmVar.g.compareAndSet(5, 7)) {
                    apwmVar.f();
                    defpackage.apwk apwkVar2 = apwmVar.b;
                    apwkVar2.b(new defpackage.apwi(apwkVar2, apwmVar.o, 1), "onSucceeded");
                }
            }
        }, 20));
    }

    @Override // org.chromium.net.UrlRequest
    public final void start() {
        this.l = 10;
        this.r.c.incrementAndGet();
        j(0, 1, new defpackage.aobd(this, 15));
    }
}
