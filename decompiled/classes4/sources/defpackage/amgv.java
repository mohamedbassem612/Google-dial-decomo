package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes4.dex */
public final class amgv {
    public static final aimz a = aimz.i("com/google/quality/views/extraction/kcube/bg/ondevice/utils/DuplexLogger");
    private final aizr b;
    private final defpackage.amgt c;
    private final j$.time.Instant d;

    public amgv(aizr aizrVar, defpackage.amgt amgtVar) {
        this.b = aizrVar;
        this.c = amgtVar;
        this.d = aizrVar.a();
    }

    public final void a(defpackage.alqk alqkVar, int i) {
        akzx akzxVarM = defpackage.altn.a.m();
        akzxVarM.u();
        defpackage.altn altnVar = (defpackage.altn) akzxVarM.b;
        j$.util.Objects.requireNonNull(alqkVar);
        altnVar.c = alqkVar;
        altnVar.b = 9;
        h(akzxVarM, j$.time.Duration.ofMillis(i));
    }

    public final void b(defpackage.alsi alsiVar, int i) {
        apdi apdiVar = defpackage.amgq.g;
        alsiVar.c(apdiVar);
        if (((alaa) alsiVar).n.l((alac) apdiVar.a)) {
            return;
        }
        akzx akzxVarM = defpackage.altn.a.m();
        akzxVarM.u();
        defpackage.altn altnVar = (defpackage.altn) akzxVarM.b;
        j$.util.Objects.requireNonNull(alsiVar);
        altnVar.c = alsiVar;
        altnVar.b = 8;
        h(akzxVarM, j$.time.Duration.ofMillis(i));
    }

    public final void c(defpackage.aljs aljsVar) {
        a.c().k(aljsVar).l("com/google/quality/views/extraction/kcube/bg/ondevice/utils/DuplexLogger", "onError", 48, "DuplexLogger.java").y("Exception while running conversation infra. Reason: %s.", aljsVar.a.name());
        this.c.b(new defpackage.amgu(aljsVar, 2));
    }

    public final void d(defpackage.almy almyVar) {
        j$.time.Duration duration = j$.time.Duration.ZERO;
        akzx akzxVarM = defpackage.altn.a.m();
        akzxVarM.u();
        defpackage.altn altnVar = (defpackage.altn) akzxVarM.b;
        j$.util.Objects.requireNonNull(almyVar);
        altnVar.c = almyVar;
        altnVar.b = 17;
        h(akzxVarM, duration);
    }

    public final void e(defpackage.altk altkVar) {
        j$.time.Duration duration = j$.time.Duration.ZERO;
        akzx akzxVarM = defpackage.altn.a.m();
        akzxVarM.u();
        defpackage.altn altnVar = (defpackage.altn) akzxVarM.b;
        j$.util.Objects.requireNonNull(altkVar);
        altnVar.c = altkVar;
        altnVar.b = 22;
        h(akzxVarM, duration);
    }

    public final void f(defpackage.almt almtVar) {
        akzx akzxVarM = defpackage.altn.a.m();
        akzxVarM.u();
        defpackage.altn altnVar = (defpackage.altn) akzxVarM.b;
        j$.util.Objects.requireNonNull(almtVar);
        altnVar.c = almtVar;
        altnVar.b = 21;
        h(akzxVarM, j$.time.Duration.ZERO);
    }

    public final void g(defpackage.aloa aloaVar) {
        j$.time.Duration duration = j$.time.Duration.ZERO;
        akzx akzxVarM = defpackage.altn.a.m();
        akzxVarM.u();
        defpackage.altn altnVar = (defpackage.altn) akzxVarM.b;
        j$.util.Objects.requireNonNull(aloaVar);
        altnVar.c = aloaVar;
        altnVar.b = 19;
        h(akzxVarM, duration);
    }

    public final void h(akzx akzxVar, j$.time.Duration duration) {
        int millis = (int) j$.time.Duration.between(this.d, this.b.a()).toMillis();
        akzxVar.u();
        defpackage.altn altnVar = (defpackage.altn) akzxVar.b;
        defpackage.altn altnVar2 = defpackage.altn.a;
        altnVar.d = millis;
        int millis2 = (int) duration.toMillis();
        akzxVar.u();
        ((defpackage.altn) akzxVar.b).e = millis2;
        this.c.b(new defpackage.amgu(akzxVar, 0));
    }
}
