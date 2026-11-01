package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes2.dex */
public final class kxx {
    public static final aimz a = aimz.i("com/android/dialer/callrecording/impl/service/CallRecordingButtonController");
    public final ajct b;
    public final defpackage.kxr c;
    public final aoin d;
    public final defpackage.kww e;
    public final long f;
    public final defpackage.mba g;
    public final zpz n;
    public final qbe o;
    public final afpl p;
    public final java.util.concurrent.atomic.AtomicBoolean h = new java.util.concurrent.atomic.AtomicBoolean(true);
    public final java.util.concurrent.atomic.AtomicBoolean i = new java.util.concurrent.atomic.AtomicBoolean();
    public final java.util.concurrent.atomic.AtomicReference j = new java.util.concurrent.atomic.AtomicReference(j$.util.Optional.empty());
    private final java.util.concurrent.atomic.AtomicReference q = new java.util.concurrent.atomic.AtomicReference(j$.util.OptionalLong.empty());
    public final znk k = new pva(this, 1);
    public final znl l = new defpackage.kxs(this, 0);
    public final qtx m = new defpackage.nyy(this, 1);

    public kxx(defpackage.kxr kxrVar, ajct ajctVar, zpz zpzVar, afpl afplVar, aoin aoinVar, defpackage.kww kwwVar, qbe qbeVar, long j, defpackage.mba mbaVar) {
        this.c = kxrVar;
        this.b = ajctVar;
        this.n = zpzVar;
        this.p = afplVar;
        this.d = aoinVar;
        this.e = kwwVar;
        this.o = qbeVar;
        this.f = j;
        this.g = mbaVar;
    }

    public final j$.util.Optional a() {
        return (j$.util.Optional) this.j.get();
    }

    final j$.util.OptionalLong b() {
        return (j$.util.OptionalLong) this.q.get();
    }

    final void c() {
        if (this.i.getAndSet(false)) {
            this.n.a(ajcm.a);
        }
    }

    public final void d() {
        this.h.set(false);
        this.n.a(ajcm.a);
    }

    public final void e(defpackage.kxr kxrVar) {
        kxrVar.u = new rai(this);
    }

    public final void f() {
        if (this.i.getAndSet(true)) {
            return;
        }
        this.n.a(ajcm.a);
    }

    public final void g() {
        a.b().l("com/android/dialer/callrecording/impl/service/CallRecordingButtonController", "startCallRecording", 240, "CallRecordingButtonController.java").v("start manual call recording");
        h(j$.time.Instant.now().toEpochMilli());
        agsm.i(239, this.e.b(), "logCallRecordingRequested failed", new java.lang.Object[0]);
        d();
        ahoq ahoqVarW = ahvr.W(240, "CallRecordingButtonController_startCallRecording_playStartingAudio");
        try {
            ajcq ajcqVarB = this.c.b();
            ahoqVarW.a(ajcqVarB);
            defpackage.ibe ibeVar = new defpackage.ibe(9);
            ajct ajctVar = this.b;
            ahvr.J(ahvr.I(ajcqVarB, ibeVar, ajctVar), new defpackage.kxt(this, 2, (byte[]) null), ajctVar);
            ahvr.J(ahvr.I(ajcqVarB, new defpackage.ibe(7), ajctVar), new defpackage.kxt(this, 3, (char[]) null), ajctVar);
            ahoqVarW.close();
        } catch (java.lang.Throwable th) {
            try {
                ahoqVarW.close();
            } catch (java.lang.Throwable th2) {
                th.addSuppressed(th2);
            }
            throw th;
        }
    }

    public final void h(long j) {
        if (((j$.util.OptionalLong) this.q.getAndSet(j$.util.OptionalLong.of(j))).equals(j$.util.OptionalLong.of(j))) {
            return;
        }
        this.n.a(ajcm.a);
    }
}
