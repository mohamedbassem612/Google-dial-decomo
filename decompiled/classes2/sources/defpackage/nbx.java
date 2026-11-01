package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes2.dex */
public final /* synthetic */ class nbx implements znj {
    private final /* synthetic */ int $cid;
    public final /* synthetic */ java.lang.Object a;

    public /* synthetic */ nbx(java.lang.Object obj, int i) {
        this.$cid = i;
        this.a = obj;
    }

    public final ajcq a() {
        int i = this.$cid;
        if (i == 0) {
            j$.time.Instant instantNow = j$.time.Instant.now();
            aooh.e(instantNow, "instant(...)");
            aenj aenjVar = new aenj("onCallAnswered");
            defpackage.nej nejVar = (defpackage.nej) this.a;
            defpackage.nbz nbzVar = new defpackage.nbz(instantNow, aenjVar, nejVar.S(null, new defpackage.ncw(nejVar, null)));
            nejVar.G.offer(nbzVar);
            return aosv.C(nbzVar.c);
        }
        if (i == 1) {
            defpackage.jfc jfcVar = (defpackage.jfc) this.a;
            return jfcVar.a(new defpackage.jew(jfcVar, null, 2, null));
        }
        if (i == 2) {
            pqm pqmVar = (pqm) this.a;
            pqmVar.v(21);
            return pqmVar.j(pqmVar.g);
        }
        java.lang.Object obj = this.a;
        if (i != 3) {
            wbc wbcVar = (wbc) obj;
            return aosv.F(wbcVar.b, 0, new ryc(wbcVar, (aoln) null, 5), 3);
        }
        szs szsVar = (szs) obj;
        if (szsVar.k()) {
            szs.a.b().l("com/android/dialer/revelio/impl/tidepods/impl/service/RevelioController", "onCallAnswered", 467, "RevelioController.java").v("Revelio call answered, resetting callIdRunningRevelio");
            szsVar.i.f(j$.util.Optional.empty());
        }
        return ajcm.a;
    }
}
