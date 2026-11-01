package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes4.dex */
public final class alzk implements defpackage.allg {
    public static final aimz a = aimz.i("com/google/quality/views/extraction/kcube/bg/ondevice/modules/callassistant/spamfilter/SpamAudioMatchProcessor");
    public double b = 0.0d;
    public long c = 0;
    public aigf d;
    private final defpackage.allj e;
    private aify f;
    private boolean g;
    private int h;

    public alzk(defpackage.alli alliVar) {
        this.e = alliVar.a(defpackage.allh.v.name());
    }

    @Override // defpackage.allg
    public final aihd a() {
        return new aile(defpackage.alnb.EVENT_AUDIO_EMBEDDING);
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
        if (alnbVarB.ordinal() == 39) {
            int i = this.h;
            int i2 = i - 1;
            if (i == 0) {
                throw null;
            }
            if (i2 != 1 || this.g) {
                return;
            }
            defpackage.almz almzVar2 = almyVar.h;
            if (almzVar2 == null) {
                almzVar2 = defpackage.almz.a;
            }
            apdi apdiVar = defpackage.alme.d;
            almzVar2.c(apdiVar);
            java.lang.Object objJ = ((alaa) almzVar2).n.j((alac) apdiVar.a);
            if (objJ == null) {
                objJ = apdiVar.b;
            } else {
                apdiVar.c(objJ);
            }
            defpackage.almd almdVar = ((defpackage.alme) objJ).c;
            if (almdVar == null) {
                almdVar = defpackage.almd.a;
            }
            aigf aigfVarF = aitt.k((aigf) j$.util.Collection.-EL.stream(this.f).map(new defpackage.alyy(almdVar.b, 9)).filter(new defpackage.alks(this, 15)).collect(aido.c(new defpackage.alyz(10), new defpackage.alyz(11), new defpackage.vfd(5)))).c(new defpackage.alyy(this, 8)).f();
            aihd aihdVar = (aihd) j$.util.Collection.-EL.stream(aigfVarF.c()).filter(new defpackage.alks(this, 14)).map(new defpackage.alyz(9)).collect(aido.b);
            if (!aihdVar.isEmpty()) {
                defpackage.allj alljVar = this.e;
                akzz akzzVarM = defpackage.almz.a.m();
                defpackage.alnb alnbVar = defpackage.alnb.EVENT_SPAM_AUDIO_MATCH;
                akzzVarM.u();
                defpackage.almz almzVar3 = akzzVarM.b;
                almzVar3.c = alnbVar.aN;
                almzVar3.b |= 1;
                apdi apdiVar2 = defpackage.alot.c;
                akzx akzxVarM = defpackage.alot.a.m();
                akzxVarM.u();
                defpackage.alot alotVar = (defpackage.alot) akzxVarM.b;
                alat alatVar = alotVar.b;
                if (!alatVar.c()) {
                    alotVar.b = alad.J(alatVar);
                }
                akyl.i(aihdVar, alotVar.b);
                akzzVarM.bV(apdiVar2, (defpackage.alot) akzxVarM.p());
                alljVar.a((defpackage.almz) akzzVarM.p(), almyVar);
                this.g = true;
            }
            this.d = aigfVarF;
        }
    }

    @Override // defpackage.allg
    public final void f(alqd alqdVar, defpackage.alqh alqhVar, defpackage.alqk alqkVar, defpackage.almb almbVar, defpackage.alml almlVar, defpackage.alkf alkfVar) {
        this.d = aikj.b;
        this.f = aike.a;
        try {
            defpackage.alxv alxvVar = defpackage.alxv.a;
            albn albnVarM = alad.M(defpackage.alxv.class);
            apdi apdiVar = defpackage.alya.c;
            almbVar.c(apdiVar);
            java.lang.Object objJ = ((alaa) almbVar).n.j((alac) apdiVar.a);
            if (objJ == null) {
                objJ = apdiVar.b;
            } else {
                apdiVar.c(objJ);
            }
            this.f = aify.n(alqdVar.a(albnVarM, ((defpackage.alya) objJ).b).b);
        } catch (java.io.IOException e) {
            a.d().k(e).l("com/google/quality/views/extraction/kcube/bg/ondevice/modules/callassistant/spamfilter/SpamAudioMatchProcessor", "init", 112, "SpamAudioMatchProcessor.java").y("Failed to load spam audio embeddings, error: %s", defpackage.aljr.d);
        }
        apdi apdiVar2 = defpackage.alyb.n;
        almlVar.c(apdiVar2);
        java.lang.Object objJ2 = ((alaa) almlVar).n.j((alac) apdiVar2.a);
        if (objJ2 == null) {
            objJ2 = apdiVar2.b;
        } else {
            apdiVar2.c(objJ2);
        }
        defpackage.alyb alybVar = (defpackage.alyb) objJ2;
        defpackage.alwh alwhVar = alybVar.k;
        if (alwhVar == null) {
            alwhVar = defpackage.alwh.a;
        }
        if (alwhVar.b == 1) {
            defpackage.alwh alwhVar2 = alybVar.k;
            if (alwhVar2 == null) {
                alwhVar2 = defpackage.alwh.a;
            }
            defpackage.alwt alwtVar = alwhVar2.b == 1 ? (defpackage.alwt) alwhVar2.c : defpackage.alwt.a;
            this.b = alwtVar.b;
            this.c = alwtVar.c;
        }
        this.h = 1;
        if (!this.f.isEmpty() && this.b > 0.0d && this.c > 0) {
            apdi apdiVar3 = defpackage.alwn.r;
            alqkVar.c(apdiVar3);
            java.lang.Object objJ3 = ((alaa) alqkVar).n.j((alac) apdiVar3.a);
            if (objJ3 == null) {
                objJ3 = apdiVar3.b;
            } else {
                apdiVar3.c(objJ3);
            }
            defpackage.alyc alycVar = ((defpackage.alwn) objJ3).f;
            if (alycVar == null) {
                alycVar = defpackage.alyc.a;
            }
            int iAe = a.ae(alycVar.c);
            this.h = iAe != 0 ? iAe : 1;
        }
        this.g = false;
    }

    @Override // defpackage.allg
    public final /* synthetic */ void d() {
    }

    @Override // defpackage.allg
    public final /* synthetic */ void e() {
    }
}
