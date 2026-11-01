package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes2.dex */
public final /* synthetic */ class ler implements znp {
    private final /* synthetic */ int $cid;
    public final /* synthetic */ java.lang.Object a;

    public /* synthetic */ ler(java.lang.Object obj, int i) {
        this.$cid = i;
        this.a = obj;
    }

    /* JADX WARN: Type inference failed for: r0v46, types: [java.lang.Object, java.util.concurrent.Executor] */
    public final ajcq ek() {
        int i = 6;
        switch (this.$cid) {
            case 0:
                java.lang.Object obj = this.a;
                defpackage.lev levVar = (defpackage.lev) obj;
                afpl afplVar = levVar.A;
                ajcq ajcqVarW = ((defpackage.leu) aooc.ar(afplVar.Y(), defpackage.leu.class)).W();
                defpackage.ldp ldpVar = new defpackage.ldp(obj, 5);
                ajct ajctVar = levVar.c;
                agsm.i(266, ahvr.I(ajcqVarW, ldpVar, ajctVar), "failed to log disconnect event", new java.lang.Object[0]);
                ajcq ajcqVarB = levVar.f.b();
                ajcq ajcqVarW2 = ((defpackage.leu) aooc.ar(afplVar.Y(), defpackage.leu.class)).W();
                return ahvr.I(ahvr.ak(new ajcq[]{ajcqVarB, ajcqVarW2}).p(new defpackage.jsr(obj, ajcqVarB, ajcqVarW2, i), ajctVar), new defpackage.ldp(obj, i), ajctVar);
            case 1:
                defpackage.jfc jfcVar = (defpackage.jfc) this.a;
                return jfcVar.a(new defpackage.jex(jfcVar, null));
            case 2:
                aenj aenjVar = new aenj("onCallDisconnected");
                defpackage.nej nejVar = (defpackage.nej) this.a;
                nejVar.U(aenjVar);
                nejVar.X(aenjVar);
                j$.time.Instant instantNow = j$.time.Instant.now();
                aooh.e(instantNow, "instant(...)");
                defpackage.nbz nbzVar = new defpackage.nbz(instantNow, aenjVar, nejVar.S(ruc.aX, new defpackage.ncx(nejVar, null)));
                nejVar.G.offer(nbzVar);
                return aosv.C(nbzVar.c);
            case 3:
                defpackage.nwg nwgVar = (defpackage.nwg) this.a;
                return aosv.F(nwgVar.a, 0, new defpackage.mva(nwgVar, (aoln) null, 11), 3);
            case 4:
                ((otq) this.a).b();
                return ajcm.a;
            case 5:
                pqm pqmVar = (pqm) this.a;
                return pqmVar.j(pqmVar.h);
            case 6:
                pzg pzgVar = (pzg) this.a;
                return aosv.F(pzgVar.b, 0, new pbw(pzgVar, (aoln) null, 3, (byte[]) null), 3);
            case 7:
                java.lang.Object obj2 = this.a;
                return ahvr.E(new qpl(obj2, android.os.SystemClock.elapsedRealtime(), 0), ((qpn) obj2).g);
            case 8:
                java.lang.Object obj3 = this.a;
                qpq qpqVar = (qpq) obj3;
                ajcq ajcqVarAS = ((qpp) aooc.ar(qpqVar.m.Y(), qpp.class)).aS();
                qgx qgxVar = new qgx(obj3, 4);
                ajct ajctVar2 = qpqVar.g;
                ajcq ajcqVar = qpqVar.l.b;
                return ahvr.ak(new ajcq[]{ahvr.H(ajcqVarAS, qgxVar, ajctVar2), ahvr.ak(new ajcq[]{ajcqVarAS, ajcqVar}).o(new defpackage.hsl(obj3, ajcqVarAS, ajcqVar, 15, (byte[]) null), ajctVar2)}).o(new defpackage.onq(6), ajctVar2);
            case 9:
                qzu qzuVar = (qzu) this.a;
                return aosv.F(qzuVar.b, 0, new oxe(qzuVar, (aoln) null, 16), 3);
            case 10:
                java.lang.Object obj4 = this.a;
                return ahvr.E(new qsu(obj4, 11), ((rhp) obj4).c);
            case 11:
                rdp rdpVar = (rdp) this.a;
                ajcq ajcqVarBi = ((defpackage.stk) aooc.ar(((afpl) rdpVar.c).Y(), defpackage.stk.class)).bi();
                java.lang.Object obj5 = rdpVar.a;
                j$.util.Objects.requireNonNull(obj5);
                return ahvr.I(ajcqVarBi, new srq(obj5, 4), (java.util.concurrent.Executor) rdpVar.d);
            case 12:
                java.lang.Object obj6 = this.a;
                szs szsVar = (szs) obj6;
                if (!(((java.lang.Boolean) szsVar.t.a()).booleanValue() ? szsVar.i.e().isPresent() : szsVar.k())) {
                    return ajcm.a;
                }
                szs.a.b().l("com/android/dialer/revelio/impl/tidepods/impl/service/RevelioController", "onCallDisconnected", 484, "RevelioController.java").v("Revelio call disconnected, resetting callIdRunningRevelio");
                szsVar.i.f(j$.util.Optional.empty());
                szsVar.j.a();
                ajcq ajcqVarB2 = szsVar.h.b(defpackage.lgj.f);
                ajcq ajcqVarG = ahvr.G(new plx(obj6, 10), szsVar.g);
                ajcq ajcqVarC = szsVar.c();
                szq szqVar = new szq(szsVar, 15);
                ajcu ajcuVar = szsVar.e;
                return ahvr.ak(new ajcq[]{ajcqVarB2, ajcqVarG, ahvr.I(ajcqVarC, szqVar, ajcuVar)}).o(new defpackage.onq(8), ajcuVar);
            case androidx.car.app.navigation.model.Maneuver.TYPE_ON_RAMP_SLIGHT_LEFT /* 13 */:
                java.lang.Object obj7 = this.a;
                return ahvr.E(new sxq(obj7, 7), ((tcl) obj7).n);
            case androidx.car.app.navigation.model.Maneuver.TYPE_ON_RAMP_SLIGHT_RIGHT /* 14 */:
                toj tojVar = (toj) this.a;
                return tojVar.a(new toa(tojVar, (aoln) null, 0));
            case androidx.car.app.navigation.model.Maneuver.TYPE_ON_RAMP_NORMAL_LEFT /* 15 */:
                ukg ukgVar = (ukg) this.a;
                return aosv.F(ukgVar.a, 0, new uke(ukgVar, (aoln) null, 2), 3);
            default:
                java.lang.Object obj8 = this.a;
                xcy xcyVar = (xcy) obj8;
                if (!xcyVar.B) {
                    return ajcm.a;
                }
                a.bI(xcy.a.b(), "call disconnected", "com/android/incallui/atlas/ui/impl/tidepods/session/HoldForMeSession", "onCallDisconnected", (char) 509, "HoldForMeSession.java", zct.a);
                xcyVar.e.b(xcyVar.r, alex.O);
                return ahrv.g(((xcx) aooc.ar(((afpl) xcyVar.s.a()).Y(), xcx.class)).W()).i(new xbv(obj8, 16), xcyVar.p);
        }
    }
}
