package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes3.dex */
public final class qrv {
    public static final aimz a = aimz.i("com/android/dialer/incall/video/service/VideoScreenController");
    public final android.content.Context d;
    public final defpackage.qql e;
    public final defpackage.qqm f;
    public final java.util.concurrent.atomic.AtomicReference h;
    public final java.util.concurrent.atomic.AtomicBoolean i;
    public final java.util.concurrent.atomic.AtomicBoolean j;
    public final java.util.concurrent.atomic.AtomicBoolean k;
    public final java.util.concurrent.atomic.AtomicBoolean l;
    public j$.util.OptionalInt m;
    public final zms n;
    public final aoin o;
    public final defpackage.pqm p;
    public final defpackage.pvr q;
    public final defpackage.pxh r;
    public final zpz s;
    public final defpackage.qbe t;
    public final zzx u;
    public final aogc v;
    private final defpackage.zmo w;
    private final defpackage.qtj x;
    private final java.util.concurrent.atomic.AtomicReference y;
    private final java.util.concurrent.atomic.AtomicReference z;
    public final zog b = new les(this, 12);
    public final defpackage.puw c = new defpackage.qpj(this, 3);
    public final java.util.concurrent.atomic.AtomicBoolean g = new java.util.concurrent.atomic.AtomicBoolean(false);

    public qrv(android.content.Context context, defpackage.pqm pqmVar, defpackage.pvr pvrVar, defpackage.pxh pxhVar, defpackage.qql qqlVar, defpackage.qqm qqmVar, zzx zzxVar, zpz zpzVar, aogc aogcVar, defpackage.zmo zmoVar, defpackage.qbe qbeVar, defpackage.qtj qtjVar, zms zmsVar, aoin aoinVar) {
        defpackage.qqo qqoVarA = defpackage.qqp.a();
        qqoVarA.a = 1;
        qqoVarA.b = 2;
        this.h = new java.util.concurrent.atomic.AtomicReference(qqoVarA.a());
        this.i = new java.util.concurrent.atomic.AtomicBoolean();
        this.j = new java.util.concurrent.atomic.AtomicBoolean();
        this.k = new java.util.concurrent.atomic.AtomicBoolean();
        this.l = new java.util.concurrent.atomic.AtomicBoolean();
        this.y = new java.util.concurrent.atomic.AtomicReference(j$.util.Optional.empty());
        this.z = new java.util.concurrent.atomic.AtomicReference(j$.util.Optional.empty());
        this.m = j$.util.OptionalInt.empty();
        this.d = context;
        this.p = pqmVar;
        this.q = pvrVar;
        this.r = pxhVar;
        this.e = qqlVar;
        this.f = qqmVar;
        this.u = zzxVar;
        this.s = zpzVar;
        this.v = aogcVar;
        this.w = zmoVar;
        this.t = qbeVar;
        this.x = qtjVar;
        this.n = zmsVar;
        this.o = aoinVar;
    }

    public static defpackage.qru a(int i) {
        return i % 180 == 90 ? defpackage.qru.b : defpackage.qru.a;
    }

    private final java.util.concurrent.atomic.AtomicReference k(defpackage.qrt qrtVar) {
        int iOrdinal = qrtVar.ordinal();
        if (iOrdinal == 0) {
            return this.y;
        }
        if (iOrdinal != 1) {
            return null;
        }
        return this.z;
    }

    public final j$.util.Optional b(defpackage.qrt qrtVar) {
        j$.util.Optional optionalEmpty;
        java.util.concurrent.atomic.AtomicReference atomicReferenceK = k(qrtVar);
        if (atomicReferenceK == null) {
            a.bI(a.c().m(aioa.b), "#getBlurredImage: Blurred image type is not set", "com/android/dialer/incall/video/service/VideoScreenController", "getBlurredImage", (char) 432, "VideoScreenController.java", zct.b);
            return j$.util.Optional.empty();
        }
        j$.util.Optional optional = (j$.util.Optional) atomicReferenceK.get();
        defpackage.qkv qkvVar = new defpackage.qkv(qrtVar, 2);
        if (true != optional.isPresent()) {
            return optional;
        }
        java.lang.Object obj = optional.get();
        java.lang.Object obj2 = qkvVar.a;
        ajcq ajcqVar = (ajcq) obj;
        try {
            optionalEmpty = ajcqVar.isDone() ? (j$.util.Optional) aiql.H(ajcqVar) : j$.util.Optional.empty();
        } catch (java.util.concurrent.ExecutionException e) {
            hgb.g(a.c(), "VideoScreenController#Failed to get blurred image of type %s, returning empty image.", obj2, "com/android/dialer/incall/video/service/VideoScreenController", "getBlurredImageIfDone", (char) 454, "VideoScreenController.java", e, zct.b);
            optionalEmpty = j$.util.Optional.empty();
        }
        optionalEmpty.getClass();
        return optionalEmpty;
    }

    public final void c() {
        this.e.a();
        e(qbc.bO);
        defpackage.zmo zmoVar = this.w;
        zmoVar.b();
        zmoVar.a();
    }

    public final void d(defpackage.qrt qrtVar) {
        java.util.concurrent.atomic.AtomicReference atomicReferenceK = k(qrtVar);
        if (atomicReferenceK == null) {
            a.bI(a.c().m(aioa.b), "#clearBlurredImage: Blurred image type is not set", "com/android/dialer/incall/video/service/VideoScreenController", "clearBlurredImage", (char) 470, "VideoScreenController.java", zct.b);
            return;
        }
        j$.util.Optional optional = (j$.util.Optional) atomicReferenceK.getAndSet(j$.util.Optional.empty());
        if (true == optional.isPresent()) {
            ((ajcq) optional.get()).cancel(false);
        }
    }

    public final void e(qbc qbcVar) {
        this.t.a(qbcVar);
    }

    public final void f() {
        a.b().l("com/android/dialer/incall/video/service/VideoScreenController", "pauseVideo", 202, "VideoScreenController.java").v("pausing video");
        agsm.i(645, this.q.e(), "failed to pause video", new java.lang.Object[0]);
    }

    public final void g(android.view.TextureView textureView, final float f, float f2, defpackage.qrt qrtVar, j$.util.Optional optional) {
        j$.util.Optional optionalEmpty;
        java.util.concurrent.atomic.AtomicReference atomicReferenceK = k(qrtVar);
        if (atomicReferenceK == null) {
            a.bI(a.c().m(aioa.b), "#registerBlurredImageIfAbsent: Blurred image type is not set", "com/android/dialer/incall/video/service/VideoScreenController", "registerBlurredImageIfAbsent", (char) 502, "VideoScreenController.java", zct.b);
            return;
        }
        if (((j$.util.Optional) atomicReferenceK.get()).isPresent()) {
            return;
        }
        final defpackage.qtj qtjVar = this.x;
        aazc aazcVar = qtjVar.c;
        final long jElapsedRealtime = android.os.SystemClock.elapsedRealtime();
        int iRound = java.lang.Math.round(textureView.getWidth() * f2);
        int iRound2 = java.lang.Math.round(textureView.getHeight() * f2);
        defpackage.qtj.a.b().l("com/android/dialer/incall/video/view/BlurredImageGenerator", "generateBitmap", 108, "BlurredImageGenerator.java").z("width: %d, height: %d", iRound, iRound2);
        try {
            android.graphics.Bitmap bitmap = textureView.getBitmap(iRound, iRound2);
            optional.isPresent();
            optionalEmpty = j$.util.Optional.ofNullable(android.graphics.Bitmap.createBitmap(bitmap, 0, 0, iRound, iRound2, (android.graphics.Matrix) optional.orElseThrow(), true));
        } catch (java.lang.IllegalArgumentException e) {
            a.bq(defpackage.qtj.a.d(), "failed to get bitmap from texture view", "com/android/dialer/incall/video/view/BlurredImageGenerator", "getBitmapFromTextureView", (char) 139, "BlurredImageGenerator.java", e, zct.b);
            optionalEmpty = j$.util.Optional.empty();
        }
        final j$.util.Optional optional2 = optionalEmpty;
        ajcq ajcqVarZ = !optional2.isPresent() ? aiql.z(j$.util.Optional.empty()) : ahvr.F(new java.util.concurrent.Callable() { // from class: qti
            @Override // java.util.concurrent.Callable
            public final java.lang.Object call() {
                return qtjVar.a((android.graphics.Bitmap) optional2.orElseThrow(), f, jElapsedRealtime);
            }
        }, qtjVar.b);
        this.s.a(ajcqVarZ);
        agsm.i(646, ajcqVarZ, "VideoScreenController#Failed to blur image of type %s", new java.lang.Object[]{qrtVar});
        atomicReferenceK.set(j$.util.Optional.of(ajcqVarZ));
    }

    public final void h() {
        a.b().l("com/android/dialer/incall/video/service/VideoScreenController", "resumeVideo", 207, "VideoScreenController.java").v("resuming video");
        agsm.i(647, this.q.g(), "failed to resumeVideo", new java.lang.Object[0]);
    }

    public final void i() {
        this.w.c();
    }

    public final void j(boolean z) {
        this.e.b(z);
    }
}
