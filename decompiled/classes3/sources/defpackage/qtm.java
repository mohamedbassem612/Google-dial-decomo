package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes3.dex */
public final class qtm {
    public static final aimz a = aimz.i("com/android/dialer/incall/video/view/SurfaceTextureTracker");
    public final defpackage.qtl b;
    public final ajcu c;
    public final zpm g;
    public final aazc h;
    private final java.util.concurrent.atomic.AtomicReference i = new java.util.concurrent.atomic.AtomicReference(j$.util.Optional.empty());
    public final java.util.concurrent.atomic.AtomicInteger d = new java.util.concurrent.atomic.AtomicInteger();
    public final java.util.concurrent.atomic.AtomicInteger e = new java.util.concurrent.atomic.AtomicInteger();
    public final java.util.concurrent.atomic.AtomicInteger f = new java.util.concurrent.atomic.AtomicInteger();

    public qtm(defpackage.qtl qtlVar, zpm zpmVar, aazc aazcVar, ajcu ajcuVar) {
        this.b = qtlVar;
        this.g = zpmVar;
        this.h = aazcVar;
        this.c = ajcuVar;
    }

    public final void a() {
        j$.util.concurrent.atomic.DesugarAtomicReference.updateAndGet(this.i, new defpackage.oth(this, 7));
    }

    public final void b() {
        j$.util.Optional optional = (j$.util.Optional) this.i.getAndSet(j$.util.Optional.empty());
        defpackage.qst qstVar = new defpackage.qst(this, 10);
        if (true == optional.isPresent()) {
            java.lang.Object obj = optional.get();
            a.b().l("com/android/dialer/incall/video/view/SurfaceTextureTracker", "stop", 108, "SurfaceTextureTracker.java").y("%s stopped", ((defpackage.qtm) qstVar.a).b);
            ((ajcq) obj).cancel(false);
        }
    }
}
