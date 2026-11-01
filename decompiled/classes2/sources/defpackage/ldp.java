package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes2.dex */
public final /* synthetic */ class ldp implements ajat {
    private final /* synthetic */ int $cid;
    public final /* synthetic */ java.lang.Object a;

    public /* synthetic */ ldp(java.lang.Object obj, int i) {
        this.$cid = i;
        this.a = obj;
    }

    public final ajcq a(java.lang.Object obj) {
        int i = 12;
        int i2 = 15;
        int i3 = 0;
        int i4 = 2;
        switch (this.$cid) {
            case 0:
                return ((ldu) this.a).a((acvd) obj);
            case 1:
                return ((ldb) this.a).b(new defpackage.jyr((java.util.List) obj, 17), 1);
            case 2:
                return ahvr.aj((aify) obj).o(ahqx.i(new defpackage.jse(11)), ((defpackage.ldq) this.a).g);
            case 3:
                return ((llz) this.a).c((defpackage.lhr) obj);
            case 4:
                ailj ailjVarK = ((aigf) obj).c().k();
                while (ailjVarK.hasNext()) {
                    if (((zpo) ailjVarK.next()) != zpo.f) {
                        return ajcm.a;
                    }
                }
                return ((defpackage.lev) this.a).e(j$.util.Optional.empty(), 2);
            case 5:
                j$.util.Optional optional = (j$.util.Optional) obj;
                akzx akzxVarM = defpackage.lkd.a.m();
                long jElapsedRealtime = android.os.SystemClock.elapsedRealtime();
                akzxVarM.u();
                defpackage.lkd lkdVar = (defpackage.lkd) akzxVarM.b;
                lkdVar.b |= 1;
                lkdVar.c = jElapsedRealtime;
                defpackage.kwv kwvVar = new defpackage.kwv(akzxVarM, 9);
                if (true == optional.isPresent()) {
                    java.lang.Object obj2 = optional.get();
                    java.lang.Object obj3 = kwvVar.a;
                    int iAd = a.ad(((android.telecom.DisconnectCause) obj2).getCode());
                    akzx akzxVar = (akzx) obj3;
                    akzxVar.u();
                    defpackage.lkd lkdVar2 = (defpackage.lkd) akzxVar.b;
                    if (iAd == 0) {
                        throw null;
                    }
                    lkdVar2.d = iAd - 1;
                    lkdVar2.b |= 2;
                }
                java.lang.Object obj4 = this.a;
                akzx akzxVarM2 = defpackage.ljw.a.m();
                akzxVarM2.u();
                defpackage.ljw ljwVar = (defpackage.ljw) akzxVarM2.b;
                defpackage.lkd lkdVar3 = (defpackage.lkd) akzxVarM.p();
                j$.util.Objects.requireNonNull(lkdVar3);
                ljwVar.c = lkdVar3;
                ljwVar.b = 6;
                return ((defpackage.lev) obj4).n.a((defpackage.ljw) akzxVarM2.p());
            case 6:
                defpackage.lev levVar = (defpackage.lev) this.a;
                aihd aihdVarB = levVar.v.b(zpo.e);
                if (aihdVarB.size() != 1) {
                    return ajcm.a;
                }
                final defpackage.let letVar = (defpackage.let) ((apqr) aihdVarB.g().get(0)).a(defpackage.let.class);
                return ahvr.H(letVar.v().b(), new ahyc() { // from class: lep
                    public final java.lang.Object apply(java.lang.Object obj5) {
                        if (((defpackage.lgj) obj5) != defpackage.lgj.b) {
                            return null;
                        }
                        agsm.i(260, letVar.cq().l(), "failed to resume the call screen call", new java.lang.Object[0]);
                        return null;
                    }
                }, levVar.c);
            case 7:
                defpackage.lev levVar2 = (defpackage.lev) this.a;
                ajcq ajcqVarB = levVar2.f.b();
                ajcq ajcqVar = levVar2.u.b;
                return ahvr.ak(new ajcq[]{ajcqVarB, ajcqVar}).o(new defpackage.gzk(ajcqVar, ajcqVarB, 20), levVar2.c);
            case 8:
                boolean zBooleanValue = ((java.lang.Boolean) obj).booleanValue();
                java.lang.Object obj5 = this.a;
                if (!zBooleanValue) {
                    ((defpackage.lev) obj5).w.a(qbc.K);
                    return ajcm.a;
                }
                defpackage.lgz lgzVar = ((defpackage.lev) obj5).h;
                lgzVar.l.a(qbc.v);
                defpackage.lem lemVar = lgzVar.c;
                ahrv ahrvVarI = ahrv.g(ahvr.G(new defpackage.ibg(lemVar, 10), lemVar.e)).i(new defpackage.lgr(lgzVar, i), lgzVar.d);
                defpackage.lgr lgrVar = new defpackage.lgr(lgzVar, 13);
                java.util.concurrent.Executor executor = lgzVar.e;
                return ahrvVarI.i(lgrVar, executor).i(new defpackage.lgr(lgzVar, 14), executor).i(new defpackage.lgr(lgzVar, i2), executor).i(new defpackage.lgr(lgzVar, 16), executor);
            case 9:
                return ((defpackage.lev) this.a).b(defpackage.lgj.b);
            case 10:
                defpackage.ldn ldnVar = ((defpackage.lev) this.a).n;
                return ahvr.E(new defpackage.ldf(ldnVar, i4), ldnVar.g);
            case 11:
                defpackage.lev levVar3 = (defpackage.lev) this.a;
                defpackage.leu leuVar = (defpackage.leu) aooc.ar(levVar3.A.Y(), defpackage.leu.class);
                ajcq ajcqVarV = leuVar.V();
                ajcq ajcqVarBp = leuVar.bp();
                ajcq ajcqVarBd = leuVar.bd();
                ajcq ajcqVarBm = leuVar.bm();
                ajcq ajcqVarC = leuVar.c();
                return ahvr.ak(new ajcq[]{ajcqVarV, ajcqVarBp, ajcqVarBd, ajcqVarBm, ajcqVarC}).o(new defpackage.lik(levVar3, ajcqVarV, ajcqVarBp, ajcqVarBd, ajcqVarBm, ajcqVarC, 1), levVar3.c);
            case 12:
                return ((defpackage.lev) this.a).c((defpackage.lhd) obj);
            case androidx.car.app.navigation.model.Maneuver.TYPE_ON_RAMP_SLIGHT_LEFT /* 13 */:
                return ((defpackage.lev) this.a).t.b();
            case androidx.car.app.navigation.model.Maneuver.TYPE_ON_RAMP_SLIGHT_RIGHT /* 14 */:
                java.lang.Object obj6 = this.a;
                defpackage.lev levVar4 = (defpackage.lev) obj6;
                return ahvr.H(((defpackage.leu) aooc.ar(levVar4.A.Y(), defpackage.leu.class)).E(), new defpackage.kxn(obj6, i2), levVar4.c);
            case androidx.car.app.navigation.model.Maneuver.TYPE_ON_RAMP_NORMAL_LEFT /* 15 */:
                j$.util.Optional optionalOfNullable = (j$.util.Optional) obj;
                defpackage.kdb kdbVar = new defpackage.kdb(this.a, 12);
                if (true == optionalOfNullable.isPresent()) {
                    java.lang.Object obj7 = optionalOfNullable.get();
                    java.lang.Object obj8 = kdbVar.a;
                    adnm adnmVar = (adnm) obj7;
                    ahoq ahoqVarW = ahvr.W(283, "CallScreenSession_getCallAvatarSessionManagerAfterInitialization");
                    try {
                        ajcq ajcqVarH = ahvr.H(adnmVar.b(adoa.a), new defpackage.lgd(adnmVar, i3), ((defpackage.lgg) obj8).e);
                        ahoqVarW.a(ajcqVarH);
                        ahoqVarW.close();
                        optionalOfNullable = j$.util.Optional.ofNullable(ajcqVarH);
                    } catch (java.lang.Throwable th) {
                        try {
                            ahoqVarW.close();
                            throw th;
                        } catch (java.lang.Throwable th2) {
                            th.addSuppressed(th2);
                            throw th;
                        }
                    }
                }
                return (ajcq) optionalOfNullable.orElse(aiql.z(j$.util.Optional.empty()));
            case 16:
                return ((defpackage.adnj) obj).e((j$.util.Optional) this.a);
            case androidx.car.app.navigation.model.Maneuver.TYPE_ON_RAMP_SHARP_LEFT /* 17 */:
                return ((defpackage.adnj) obj).b((j$.util.Optional) this.a);
            case androidx.car.app.navigation.model.Maneuver.TYPE_ON_RAMP_SHARP_RIGHT /* 18 */:
                return ((defpackage.lgv) this.a).k.a();
            case androidx.car.app.navigation.model.Maneuver.TYPE_ON_RAMP_U_TURN_LEFT /* 19 */:
                return ((defpackage.lgv) this.a).r.b();
            default:
                return ((defpackage.lgv) this.a).u.f();
        }
    }
}
