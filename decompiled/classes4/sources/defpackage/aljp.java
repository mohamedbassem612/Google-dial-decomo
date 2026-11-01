package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes4.dex */
public final class aljp {
    public static final aimz a = aimz.i("com/google/quality/views/extraction/kcube/bg/ondevice/core/infra/ControllerImpl");
    public final defpackage.alkd b;
    public final aljo c;
    public final defpackage.aljy d;
    private final defpackage.alkw e;
    private final alqd f;
    private final defpackage.alkf g;
    private final defpackage.amac h;

    public aljp(defpackage.alkd alkdVar, alqd alqdVar, defpackage.amac amacVar, defpackage.aljy aljyVar, defpackage.alkw alkwVar, aljo aljoVar, defpackage.alkf alkfVar) {
        this.f = alqdVar;
        this.b = alkdVar;
        this.c = aljoVar;
        this.h = amacVar;
        this.d = aljyVar;
        this.e = alkwVar;
        this.g = alkfVar;
    }

    public final void a(j$.util.Optional optional) throws defpackage.aljs {
        defpackage.agqr agqrVar = new defpackage.agqr(this, 8);
        j$.util.Optional optionalOf = j$.util.Optional.of(new uwo(this, 16));
        defpackage.amac amacVar = this.h;
        amacVar.c(agqrVar, optionalOf);
        if (optional.isPresent()) {
            amacVar.c(new afgu(this, optional, 18, (byte[]) null), j$.util.Optional.of(new uwo(this, 17, (byte[]) null)));
        }
    }

    public final void b() {
        defpackage.alkd alkdVar = this.b;
        java.util.concurrent.locks.Lock lock = alkdVar.d;
        lock.lock();
        try {
            try {
                if (alkdVar.f.getAndSet(true)) {
                    defpackage.alkd.a.d().l("com/google/quality/views/extraction/kcube/bg/ondevice/core/infra/EventRouterImpl", "stop", 116, "EventRouterImpl.java").v("Stopping event router that already should stop.");
                    alkdVar.e.release();
                    lock.unlock();
                } else {
                    defpackage.apjb apjbVar = alkdVar.h;
                    j$.time.Instant instantA = alkdVar.c.a();
                    akzx akzxVarM = defpackage.almy.a.m();
                    akzz akzzVarM = defpackage.almz.a.m();
                    defpackage.alnb alnbVar = defpackage.alnb.EVENT_INTERRUPT_ROUTER;
                    akzzVarM.u();
                    defpackage.almz almzVar = akzzVarM.b;
                    almzVar.c = alnbVar.aN;
                    almzVar.b |= 1;
                    akzxVarM.u();
                    defpackage.almy almyVar = (defpackage.almy) akzxVarM.b;
                    defpackage.almz almzVarP = akzzVarM.p();
                    j$.util.Objects.requireNonNull(almzVarP);
                    almyVar.h = almzVarP;
                    almyVar.b |= 32;
                    alcf alcfVarDI = ajsz.dI(instantA);
                    akzxVarM.u();
                    defpackage.almy almyVar2 = (defpackage.almy) akzxVarM.b;
                    j$.util.Objects.requireNonNull(alcfVarDI);
                    almyVar2.c = alcfVarDI;
                    almyVar2.b |= 1;
                    apjbVar.s((defpackage.almy) akzxVarM.p());
                    alkdVar.e.acquire();
                    alkdVar.e.release();
                    alkdVar.d.unlock();
                    j$.lang.Iterable.-EL.forEach(alkdVar.g, new defpackage.aljd(3));
                }
            } catch (java.lang.InterruptedException e) {
                defpackage.alkd.a.d().k(e).l("com/google/quality/views/extraction/kcube/bg/ondevice/core/infra/EventRouterImpl", "stop", 122, "EventRouterImpl.java").v("Event router stopping was interrupted");
            }
            aljo aljoVar = this.c;
            j$.util.Optional optional = aljoVar.c;
            defpackage.akxd akxdVar = new defpackage.akxd(aljoVar, 8);
            if (true == optional.isPresent()) {
                java.lang.Object obj = optional.get();
                j$.util.Optional optional2 = ((aljo) akxdVar.a).d;
                j$.util.Objects.requireNonNull(obj);
                defpackage.alju aljuVar = new defpackage.alju(obj, 1);
                if (true == optional2.isPresent()) {
                    java.io.OutputStream outputStream = (java.io.OutputStream) ((aljc) aljuVar.a).c.remove(optional2.get());
                    if (outputStream != null) {
                        try {
                            outputStream.close();
                        } catch (java.io.IOException e2) {
                            a.by(aljc.a.b(), "Failed to close output stream.", "com/google/quality/views/extraction/kcube/bg/ondevice/core/impl/AudioMulticaster", "closeInputStream", 'e', "AudioMulticaster.java", e2);
                        }
                    }
                }
            }
            aljoVar.e.set(true);
            this.e.d();
        } catch (java.lang.Throwable th) {
            alkdVar.e.release();
            alkdVar.d.unlock();
            throw th;
        }
    }

    public final void c(j$.util.Optional optional, ajcu ajcuVar, defpackage.alqh alqhVar, defpackage.alqk alqkVar, j$.util.Optional optional2, defpackage.amgv amgvVar) throws defpackage.aljs {
        alqd alqdVar = this.f;
        alqdVar.b = optional;
        this.h.b = j$.util.Optional.of(ajcuVar);
        this.d.a = j$.util.Optional.of(amgvVar);
        this.e.e(amgvVar, java.lang.Boolean.valueOf(alqkVar.e));
        if (!optional2.isPresent()) {
            defpackage.alkf alkfVar = this.g;
            defpackage.alnd alndVar = defpackage.alnd.a;
            j$.util.Optional.empty();
            alkfVar.b(alqkVar, alndVar);
            this.b.a(this.f, alqhVar, alqkVar, defpackage.almb.a, defpackage.alml.a, alkfVar);
            return;
        }
        try {
            defpackage.almb almbVar = defpackage.almb.a;
            defpackage.almb almbVarA = alqdVar.a(alad.M(defpackage.almb.class), (java.lang.String) optional2.get());
            defpackage.alml almlVar = defpackage.alml.a;
            defpackage.alml almlVarA = alqdVar.a(alad.M(defpackage.alml.class), almbVarA.g);
            defpackage.alkf alkfVar2 = this.g;
            defpackage.alnd alndVar2 = almlVarA.r;
            if (alndVar2 == null) {
                alndVar2 = defpackage.alnd.a;
            }
            j$.util.Optional.of(almbVarA.h);
            alkfVar2.b(alqkVar, alndVar2);
            this.b.a(alqdVar, alqhVar, alqkVar, almbVarA, almlVarA, alkfVar2);
        } catch (java.io.IOException e) {
            throw new defpackage.aljs("Failed to load bot configs or assets.", defpackage.aljr.d, e);
        }
    }
}
