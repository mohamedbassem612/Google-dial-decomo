package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes4.dex */
public final class alpn {
    private static final aimz a = aimz.i("com/google/quality/views/extraction/kcube/bg/ondevice/core/infra/utils/MonitoredCountDownLatch");
    private final defpackage.alpg b;
    private j$.util.Optional c = j$.util.Optional.empty();
    private java.util.concurrent.CountDownLatch d = new java.util.concurrent.CountDownLatch(0);
    private final defpackage.alqf e;

    public alpn(defpackage.alpg alpgVar, defpackage.alqf alqfVar) {
        this.b = alpgVar;
        this.e = alqfVar;
    }

    private final void d() {
        j$.util.Optional optional = this.c;
        defpackage.alqf alqfVar = this.e;
        j$.util.Objects.requireNonNull(alqfVar);
        defpackage.alju aljuVar = new defpackage.alju(alqfVar, 16);
        if (true == optional.isPresent()) {
            ((defpackage.alqf) aljuVar.a).a((java.lang.String) optional.get());
        }
        this.c = j$.util.Optional.empty();
    }

    public final void a(j$.time.Duration duration) {
        if (this.d.getCount() > 0) {
            this.c = j$.util.Optional.of(this.e.b(new ahts(this, 20), duration));
            defpackage.alpg alpgVar = this.b;
            alpgVar.b();
            this.d.await();
            alpgVar.a();
        }
    }

    public final void b() {
        if (this.d.getCount() <= 0) {
            a.d().l("com/google/quality/views/extraction/kcube/bg/ondevice/core/infra/utils/MonitoredCountDownLatch", "countDown", 48, "MonitoredCountDownLatch.java").v("Trying to count down a CountDownLatch that's already at 0.");
        } else {
            this.d.countDown();
            d();
        }
    }

    public final void c(int i) {
        this.d = new java.util.concurrent.CountDownLatch(i);
        d();
    }
}
