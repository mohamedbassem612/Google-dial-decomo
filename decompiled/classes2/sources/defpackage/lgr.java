package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes2.dex */
public final /* synthetic */ class lgr implements ajat {
    private final /* synthetic */ int $cid;
    public final /* synthetic */ java.lang.Object a;

    public /* synthetic */ lgr(java.lang.Object obj, int i) {
        this.$cid = i;
        this.a = obj;
    }

    public final ajcq a(java.lang.Object obj) {
        int i = 2;
        switch (this.$cid) {
            case 0:
                return ((defpackage.lgv) this.a).d();
            case 1:
                return ((defpackage.lgv) this.a).g.a();
            case 2:
                return ((defpackage.lgv) this.a).g();
            case 3:
                defpackage.lgg lggVar = (defpackage.lgg) this.a;
                lggVar.f(3);
                return ahvr.I(lggVar.b(), new defpackage.ldp((j$.util.Optional) obj, 16), lggVar.d);
            case 4:
                return ((defpackage.lgv) this.a).g.a();
            case 5:
                return ((defpackage.lgv) this.a).k.a();
            case 6:
                return ((defpackage.lgv) this.a).r.b();
            case 7:
                defpackage.lgv lgvVar = (defpackage.lgv) this.a;
                return lgvVar.i.a(lgvVar.f.getString(2132017821));
            case 8:
                return ((defpackage.lgv) this.a).b();
            case 9:
                if (((java.lang.Boolean) obj).booleanValue()) {
                    return ajcm.a;
                }
                defpackage.lgv lgvVar2 = (defpackage.lgv) this.a;
                defpackage.lgv.a.b().l("com/android/dialer/callscreen/impl/service/EndSession", "acceptCall", 274, "EndSession.java").y("%s: setCallScreenUiType to none", lgvVar2.e);
                return lgvVar2.j.d(defpackage.lgj.a);
            case 10:
                return ((defpackage.lgv) this.a).d();
            case 11:
                return ((defpackage.lgv) this.a).g();
            case 12:
                return ((defpackage.lgz) this.a).b.c();
            case androidx.car.app.navigation.model.Maneuver.TYPE_ON_RAMP_SLIGHT_LEFT /* 13 */:
                java.lang.Object obj2 = this.a;
                j$.util.Optional optional = (j$.util.Optional) obj;
                defpackage.kwv kwvVar = new defpackage.kwv(obj2, 13);
                if (true == optional.isPresent()) {
                    ((defpackage.lgz) kwvVar.a).i = ((defpackage.lhd) optional.get()).a;
                }
                return ((defpackage.lgz) obj2).a.c();
            case androidx.car.app.navigation.model.Maneuver.TYPE_ON_RAMP_SLIGHT_RIGHT /* 14 */:
                if (((java.lang.Boolean) obj).booleanValue()) {
                    return ajcm.a;
                }
                java.lang.Object obj3 = this.a;
                defpackage.lgz lgzVar = (defpackage.lgz) obj3;
                return ahrv.g(lgzVar.b.c()).i(new defpackage.lgr(obj3, 17), lgzVar.d);
            case androidx.car.app.navigation.model.Maneuver.TYPE_ON_RAMP_NORMAL_LEFT /* 15 */:
                return ((defpackage.lgz) this.a).a.c();
            case 16:
                if (!((java.lang.Boolean) obj).booleanValue()) {
                    return ajcm.a;
                }
                java.lang.Object obj4 = this.a;
                defpackage.lgz lgzVar2 = (defpackage.lgz) obj4;
                if (lgzVar2.i) {
                    long j = lgzVar2.h;
                    defpackage.ldn ldnVar = lgzVar2.g;
                    ahrv ahrvVarG = ahrv.g(ahvr.E(new defpackage.ldf(ldnVar, 4), ldnVar.g));
                    defpackage.jwi jwiVar = new defpackage.jwi(obj4, j, 6);
                    ajct ajctVar = lgzVar2.d;
                    agsm.i(288, ahrvVarG.i(jwiVar, ajctVar).i(new defpackage.jwi(obj4, j, 7), ajctVar), "Failed to save audio", new java.lang.Object[0]);
                }
                lgzVar2.b.e(true);
                lgzVar2.l.a(qbc.L);
                return ajcm.a;
            case androidx.car.app.navigation.model.Maneuver.TYPE_ON_RAMP_SHARP_LEFT /* 17 */:
                j$.util.Optional optional2 = (j$.util.Optional) obj;
                defpackage.adnw adnwVar = ((defpackage.lhd) optional2.orElseThrow()).c;
                defpackage.adnw adnwVar2 = ((defpackage.lhd) optional2.orElseThrow()).d;
                defpackage.lgg lggVar2 = ((defpackage.lgz) this.a).a;
                if (!lggVar2.i) {
                    lggVar2.j.a(qbc.k);
                    lggVar2.i = true;
                }
                lggVar2.f(2);
                return ahvr.I(lggVar2.b(), new defpackage.juo(lggVar2, adnwVar, adnwVar2, 11, (short[]) null), lggVar2.d);
            case androidx.car.app.navigation.model.Maneuver.TYPE_ON_RAMP_SHARP_RIGHT /* 18 */:
                akzx akzxVarM = defpackage.lgp.a.m();
                defpackage.lha lhaVar = (defpackage.lha) this.a;
                j$.util.stream.Stream streamSorted = j$.util.Collection.-EL.stream(lhaVar.a).sorted(j$.util.Comparator.-CC.comparing(new defpackage.kle(15)));
                j$.util.Objects.requireNonNull(akzxVarM);
                streamSorted.forEach(new defpackage.fcg(akzxVarM, 10));
                defpackage.lgp lgpVar = (defpackage.lgp) akzxVarM.p();
                defpackage.lgi lgiVar = lhaVar.b;
                ajcq ajcqVarE = ahvr.E(new defpackage.lge(lgiVar, lgpVar, i), lgiVar.c);
                lgiVar.l.a(ajcqVarE);
                return ajcqVarE;
            case androidx.car.app.navigation.model.Maneuver.TYPE_ON_RAMP_U_TURN_LEFT /* 19 */:
                defpackage.ldn ldnVar2 = ((defpackage.lha) this.a).c;
                return ahvr.E(new defpackage.ldf(ldnVar2, 5), ldnVar2.g);
            default:
                return ((defpackage.lem) ((defpackage.ifb) this.a).a).a();
        }
    }
}
