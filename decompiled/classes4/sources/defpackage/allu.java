package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes4.dex */
public final class allu {
    public static final aimz a = aimz.i("com/google/quality/views/extraction/kcube/bg/ondevice/core/infra/Speaker");
    public static final j$.time.Duration b = j$.time.Duration.ofSeconds(10);
    public final defpackage.alpn c;
    public java.util.concurrent.atomic.AtomicBoolean d;
    public final vqy e;
    public defpackage.apjb f;
    private final java.util.concurrent.atomic.AtomicBoolean g = new java.util.concurrent.atomic.AtomicBoolean(false);
    private final defpackage.amac h;

    public allu(defpackage.amac amacVar, defpackage.alpg alpgVar, defpackage.alqf alqfVar) {
        this.h = amacVar;
        this.c = new defpackage.alpn(alpgVar, alqfVar);
        this.e = new vqy(alpgVar);
    }

    public static defpackage.almz a(defpackage.alol alolVar) {
        akzz akzzVarM = defpackage.almz.a.m();
        defpackage.alnb alnbVar = defpackage.alnb.EVENT_SAY;
        akzzVarM.u();
        defpackage.almz almzVar = akzzVarM.b;
        almzVar.c = alnbVar.aN;
        almzVar.b |= 1;
        akzzVarM.bV(defpackage.alol.f, alolVar);
        return akzzVarM.p();
    }

    /* JADX WARN: Type inference failed for: r1v0, types: [java.lang.Object, java.util.concurrent.BlockingQueue] */
    public final synchronized void b() {
        vqy vqyVar = this.e;
        ?? r1 = vqyVar.b;
        if (r1.isEmpty() && !((java.util.concurrent.atomic.AtomicBoolean) vqyVar.c).getAndSet(true)) {
            ((defpackage.alpg) vqyVar.a).b();
        }
        j$.util.Optional optional = (j$.util.Optional) r1.take();
        defpackage.alju aljuVar = new defpackage.alju(this, 14);
        if (true != optional.isPresent()) {
            return;
        }
        defpackage.alka alkaVar = (defpackage.alka) optional.get();
        ((defpackage.allu) aljuVar.a).c.c(1);
        alkaVar.c.accept(alkaVar.a, alkaVar.b);
    }

    public final void c() {
        this.c.b();
    }

    public final void d(defpackage.alnh alnhVar, defpackage.almy almyVar, java.util.function.BiConsumer biConsumer, defpackage.alsz alszVar) {
        akzx akzxVarM = defpackage.alol.a.m();
        akzxVarM.u();
        defpackage.alol alolVar = (defpackage.alol) akzxVarM.b;
        alolVar.d = alszVar.d;
        alolVar.b |= 2;
        defpackage.alsy alsyVarB = defpackage.alsy.b(alnhVar.d);
        if (alsyVarB == null) {
            alsyVarB = defpackage.alsy.NO_ACTION;
        }
        akzxVarM.u();
        defpackage.alol alolVar2 = (defpackage.alol) akzxVarM.b;
        alolVar2.c = alsyVarB.j;
        alolVar2.b |= 1;
        akzx akzxVarM2 = defpackage.alsw.a.m();
        akzx akzxVarM3 = defpackage.altf.a.m();
        java.lang.String str = alnhVar.c;
        akzxVarM3.u();
        defpackage.altf altfVar = (defpackage.altf) akzxVarM3.b;
        j$.util.Objects.requireNonNull(str);
        altfVar.b |= 1;
        altfVar.c = str;
        akzxVarM2.u();
        defpackage.alsw alswVar = (defpackage.alsw) akzxVarM2.b;
        defpackage.altf altfVar2 = (defpackage.altf) akzxVarM3.p();
        j$.util.Objects.requireNonNull(altfVar2);
        alswVar.c = altfVar2;
        alswVar.b = 2;
        akzxVarM.u();
        defpackage.alol alolVar3 = (defpackage.alol) akzxVarM.b;
        defpackage.alsw alswVar2 = (defpackage.alsw) akzxVarM2.p();
        j$.util.Objects.requireNonNull(alswVar2);
        alolVar3.e = alswVar2;
        alolVar3.b |= 4;
        this.e.h(new defpackage.alka(a((defpackage.alol) akzxVarM.p()), almyVar, biConsumer));
    }

    public final void e(alln allnVar) throws defpackage.aljs {
        if (this.g.getAndSet(true)) {
            return;
        }
        this.f = new defpackage.apjb(allnVar);
        this.h.c(new defpackage.agqr(this, 9), j$.util.Optional.of(new defpackage.aljn(this, 3)));
    }

    /* JADX WARN: Type inference failed for: r2v2, types: [java.lang.Object, java.util.concurrent.BlockingQueue] */
    public final void f() {
        this.d = new java.util.concurrent.atomic.AtomicBoolean(true);
        this.g.set(false);
        aiql.n((java.util.concurrent.BlockingQueue) this.e.b, j$.util.Optional.empty());
    }
}
