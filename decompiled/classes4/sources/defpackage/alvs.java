package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes4.dex */
public final class alvs implements defpackage.allg {
    private static final aimz c = aimz.i("com/google/quality/views/extraction/kcube/bg/ondevice/modules/callassistant/common/BotSilenceLimiterProcessor");
    public final defpackage.allj a;
    private final defpackage.alqf e;
    private final java.util.List d = new java.util.ArrayList();
    public j$.time.Duration b = j$.time.Duration.ofMinutes(2);

    public alvs(defpackage.alli alliVar, defpackage.alqf alqfVar) {
        this.a = alliVar.a(defpackage.allh.m.name());
        this.e = alqfVar;
    }

    private final void c() {
        defpackage.alqf alqfVar = this.e;
        j$.util.Objects.requireNonNull(alqfVar);
        defpackage.alkh alkhVar = new defpackage.alkh(alqfVar, 11);
        java.util.List list = this.d;
        j$.lang.Iterable.-EL.forEach(list, alkhVar);
        list.clear();
    }

    @Override // defpackage.allg
    public final aihd a() {
        return aihd.r(defpackage.alnb.EVENT_SAY_INITIATED_TIMING, defpackage.alnb.EVENT_END_SAY_TIMING);
    }

    @Override // defpackage.allg
    public final void b(defpackage.almy almyVar) {
        defpackage.almz almzVar = almyVar.h;
        if (almzVar == null) {
            almzVar = defpackage.almz.a;
        }
        defpackage.alnb alnbVarB = defpackage.alnb.b(almzVar.c);
        if (alnbVarB == null) {
            alnbVarB = defpackage.alnb.EVENT_UNKNOWN;
        }
        if (alnbVarB.equals(defpackage.alnb.EVENT_SAY_INITIATED_TIMING)) {
            c();
            return;
        }
        defpackage.almz almzVar2 = almyVar.h;
        if (almzVar2 == null) {
            almzVar2 = defpackage.almz.a;
        }
        defpackage.alnb alnbVarB2 = defpackage.alnb.b(almzVar2.c);
        if (alnbVarB2 == null) {
            alnbVarB2 = defpackage.alnb.EVENT_UNKNOWN;
        }
        if (alnbVarB2.equals(defpackage.alnb.EVENT_END_SAY_TIMING)) {
            c();
            try {
                this.d.add(this.e.b(new defpackage.alvr(this, 0), this.b));
            } catch (defpackage.aljs e) {
                a.by(c.c(), "Scheduling BotSilenceDeadlineReached failed.", "com/google/quality/views/extraction/kcube/bg/ondevice/modules/callassistant/common/BotSilenceLimiterProcessor", "scheduleBotSilenceDeadlineReached", '}', "BotSilenceLimiterProcessor.java", e);
            }
        }
    }

    @Override // defpackage.allg
    public final void f(alqd alqdVar, defpackage.alqh alqhVar, defpackage.alqk alqkVar, defpackage.almb almbVar, defpackage.alml almlVar, defpackage.alkf alkfVar) {
        c();
        apdi apdiVar = defpackage.alyb.n;
        almlVar.c(apdiVar);
        java.lang.Object objJ = ((alaa) almlVar).n.j((alac) apdiVar.a);
        if (objJ == null) {
            objJ = apdiVar.b;
        } else {
            apdiVar.c(objJ);
        }
        defpackage.alyb alybVar = (defpackage.alyb) objJ;
        if ((alybVar.b & 64) != 0) {
            akzm akzmVar = alybVar.l;
            if (akzmVar == null) {
                akzmVar = akzm.a;
            }
            this.b = ajsz.dJ(akzmVar);
        }
        apdi apdiVar2 = defpackage.alyq.m;
        almlVar.c(apdiVar2);
        java.lang.Object objJ2 = ((alaa) almlVar).n.j((alac) apdiVar2.a);
        if (objJ2 == null) {
            objJ2 = apdiVar2.b;
        } else {
            apdiVar2.c(objJ2);
        }
        defpackage.alyq alyqVar = (defpackage.alyq) objJ2;
        if ((alyqVar.b & 8) != 0) {
            akzm akzmVar2 = alyqVar.f;
            if (akzmVar2 == null) {
                akzmVar2 = akzm.a;
            }
            this.b = ajsz.dJ(akzmVar2);
        }
    }

    @Override // defpackage.allg
    public final /* synthetic */ void d() {
    }

    @Override // defpackage.allg
    public final /* synthetic */ void e() {
    }
}
