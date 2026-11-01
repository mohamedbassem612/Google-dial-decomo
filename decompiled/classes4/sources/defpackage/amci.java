package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes4.dex */
public final class amci {
    private static final aimz h = aimz.i("com/google/quality/views/extraction/kcube/bg/ondevice/modules/vc/AmStatePublisher");
    public final defpackage.alpn b;
    public final java.util.concurrent.locks.ReentrantLock a = new java.util.concurrent.locks.ReentrantLock();
    private j$.util.Optional i = j$.util.Optional.empty();
    public j$.util.Optional c = j$.util.Optional.empty();
    public j$.util.Optional d = j$.util.Optional.empty();
    public j$.util.Optional e = j$.util.Optional.empty();
    public j$.util.Optional f = j$.util.Optional.empty();
    public int g = 1;

    public amci(defpackage.alpg alpgVar, defpackage.alqf alqfVar) {
        defpackage.alpn alpnVar = new defpackage.alpn(alpgVar, alqfVar);
        this.b = alpnVar;
        alpnVar.c(0);
    }

    public final defpackage.amgq a(defpackage.amfv amfvVar, boolean z) {
        int i;
        synchronized (this.a) {
            i = this.g;
        }
        akzx akzxVarM = defpackage.amgq.a.m();
        akzxVarM.u();
        defpackage.amgq amgqVar = (defpackage.amgq) akzxVarM.b;
        j$.util.Objects.requireNonNull(amfvVar);
        amgqVar.e = amfvVar;
        amgqVar.b |= 1;
        akzxVarM.u();
        defpackage.amgq amgqVar2 = (defpackage.amgq) akzxVarM.b;
        amgqVar2.b |= 2;
        amgqVar2.f = z;
        if (i != 1) {
            akzx akzxVarM2 = defpackage.amgj.a.m();
            akzxVarM2.u();
            defpackage.amgj amgjVar = (defpackage.amgj) akzxVarM2.b;
            int i2 = i - 1;
            if (i == 0) {
                throw null;
            }
            amgjVar.c = i2;
            amgjVar.b |= 1;
            defpackage.amgj amgjVar2 = (defpackage.amgj) akzxVarM2.p();
            akzxVarM.u();
            defpackage.amgq amgqVar3 = (defpackage.amgq) akzxVarM.b;
            j$.util.Objects.requireNonNull(amgjVar2);
            amgqVar3.d = amgjVar2;
            amgqVar3.c = 3;
        }
        return (defpackage.amgq) akzxVarM.p();
    }

    public final void b(defpackage.amfv amfvVar, j$.util.Optional optional, boolean z) {
        j$.util.Optional optional2;
        j$.util.Optional.empty();
        synchronized (this.a) {
            optional2 = this.e;
        }
        if (!optional.isPresent()) {
            c(defpackage.alnb.EVENT_CALL_MENU_STATE, a(amfvVar, z), optional2);
            return;
        }
        defpackage.alnb alnbVar = defpackage.alnb.EVENT_CALL_MENU_STATE;
        java.lang.Object obj = optional.get();
        akzx akzxVarM = defpackage.amgq.a.m();
        akzxVarM.u();
        defpackage.amgq amgqVar = (defpackage.amgq) akzxVarM.b;
        j$.util.Objects.requireNonNull(amfvVar);
        amgqVar.e = amfvVar;
        amgqVar.b |= 1;
        akzxVarM.u();
        defpackage.amgq amgqVar2 = (defpackage.amgq) akzxVarM.b;
        j$.util.Objects.requireNonNull(obj);
        amgqVar2.d = obj;
        amgqVar2.c = 2;
        akzxVarM.u();
        defpackage.amgq amgqVar3 = (defpackage.amgq) akzxVarM.b;
        amgqVar3.b |= 2;
        amgqVar3.f = true;
        c(alnbVar, (defpackage.amgq) akzxVarM.p(), optional2);
    }

    public final void c(defpackage.alnb alnbVar, defpackage.amgq amgqVar, j$.util.Optional optional) {
        akzz akzzVarM = defpackage.almz.a.m();
        akzzVarM.u();
        defpackage.almz almzVar = akzzVarM.b;
        almzVar.c = alnbVar.aN;
        almzVar.b |= 1;
        akzzVarM.bV(defpackage.almr.b, amgqVar);
        d((defpackage.almz) akzzVarM.p(), optional);
    }

    /* JADX WARN: Type inference failed for: r1v3, types: [allj, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r1v4, types: [allj, java.lang.Object] */
    public final void d(defpackage.almz almzVar, j$.util.Optional optional) {
        if (this.i.isEmpty()) {
            throw new defpackage.aljs("Publisher not initialized.", defpackage.aljr.g);
        }
        boolean zIsPresent = optional.isPresent();
        j$.util.Optional optional2 = this.i;
        if (zIsPresent) {
            optional2.get().a(almzVar, (defpackage.almy) optional.get());
        } else {
            optional2.get().b(almzVar);
        }
    }

    public final void e(defpackage.allj alljVar) {
        this.i = j$.util.Optional.of(alljVar);
    }

    public final void f() {
        this.b.b();
    }

    public final void g(defpackage.almz almzVar) {
        defpackage.alnb alnbVarB = defpackage.alnb.b(almzVar.c);
        if (alnbVarB == null) {
            alnbVarB = defpackage.alnb.EVENT_UNKNOWN;
        }
        if (alnbVarB.equals(defpackage.alnb.EVENT_CALL_MENU_STATE_PARSING_RESULT)) {
            this.b.b();
            return;
        }
        aimw aimwVarL = h.d().l("com/google/quality/views/extraction/kcube/bg/ondevice/modules/vc/AmStatePublisher", "updateFromAmStateUpdateParsingResult", 130, "AmStatePublisher.java");
        defpackage.alnb alnbVarB2 = defpackage.alnb.b(almzVar.c);
        if (alnbVarB2 == null) {
            alnbVarB2 = defpackage.alnb.EVENT_UNKNOWN;
        }
        aimwVarL.y("Trying to update parsing status from wrong event type %s.", alnbVarB2.name());
    }

    public final void h(defpackage.alnb alnbVar, defpackage.amfv amfvVar, java.util.function.Supplier supplier) {
        j$.util.Optional optional;
        j$.util.Optional.empty();
        synchronized (this.a) {
            optional = this.c;
        }
        j$.util.Optional optional2 = (j$.util.Optional) supplier.get();
        if (!optional2.isPresent()) {
            c(alnbVar, a(amfvVar, false), optional);
            return;
        }
        h.b().l("com/google/quality/views/extraction/kcube/bg/ondevice/modules/vc/AmStatePublisher", "publishAmStateWithLatestAsrResultTrigger", 271, "AmStatePublisher.java").v("Publishing cache transcription mode update.");
        defpackage.amgo amgoVar = (defpackage.amgo) optional2.get();
        akzx akzxVarP = a(amfvVar, true).p();
        akzxVarP.u();
        defpackage.amgq amgqVar = (defpackage.amgq) akzxVarP.b;
        j$.util.Objects.requireNonNull(amgoVar);
        amgqVar.d = amgoVar;
        amgqVar.c = 7;
        c(alnbVar, (defpackage.amgq) akzxVarP.p(), optional);
    }
}
