package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes3.dex */
public final /* synthetic */ class pva implements defpackage.znk {
    private final /* synthetic */ int $cid;
    public final /* synthetic */ java.lang.Object a;

    public /* synthetic */ pva(java.lang.Object obj, int i) {
        this.$cid = i;
        this.a = obj;
    }

    @Override // defpackage.znk
    public final ajcq b() {
        int i = this.$cid;
        if (i == 0) {
            defpackage.pvf pvfVar = (defpackage.pvf) this.a;
            if (defpackage.zcy.a(pvfVar.k) == defpackage.zcy.a) {
                java.lang.Object obj = pvfVar.o.get();
                defpackage.pur purVar = defpackage.pur.a;
                if (obj != purVar) {
                    defpackage.pvf.a.b().l("com/android/dialer/incall/core/video/impl/CameraController", "onCallConnected", 423, "CameraController.java").v("close camera on call connected");
                    pvfVar.f(purVar);
                    pvfVar.g();
                }
            }
            return ajcm.a;
        }
        if (i == 1) {
            java.lang.Object obj2 = this.a;
            kxx kxxVar = (kxx) obj2;
            ajcq ajcqVarX = kxxVar.p.X();
            kwz kwzVar = new kwz(13);
            ajct ajctVar = kxxVar.b;
            return ahrv.g(ahvr.I(ahvr.H(ajcqVarX, kwzVar, ajctVar), new ibe(8), ajctVar)).i(new kxm(obj2, 11), ajctVar);
        }
        if (i == 2) {
            java.lang.Object obj3 = this.a;
            defpackage.qpq qpqVar = (defpackage.qpq) obj3;
            qpqVar.i.set(true);
            defpackage.qpp qppVar = (defpackage.qpp) aooc.ar(qpqVar.m.Y(), defpackage.qpp.class);
            ajcq ajcqVarAR = qppVar.aR();
            ajcq ajcqVarBX = qppVar.bX();
            ajcq ajcqVarAr = qppVar.ar();
            ajcq ajcqVarAS = qppVar.aS();
            return ahvr.ak(new ajcq[]{ajcqVarAR, ajcqVarBX, ajcqVarAr, ajcqVarAS}).o(new kxy(obj3, ajcqVarAS, ajcqVarBX, ajcqVarAR, ajcqVarAr, 4), qpqVar.g);
        }
        if (i == 3) {
            java.lang.Object obj4 = this.a;
            defpackage.qgx qgxVar = new defpackage.qgx(obj4, 10);
            defpackage.rap rapVar = (defpackage.rap) obj4;
            return ahvr.H(rapVar.s.b, qgxVar, rapVar.k);
        }
        java.lang.Object obj5 = this.a;
        if (i != 4) {
            defpackage.toj tojVar = (defpackage.toj) obj5;
            return tojVar.a(new defpackage.sbm(tojVar, (aoln) null, 7, (byte[]) null));
        }
        defpackage.she sheVar = (defpackage.she) obj5;
        return aosv.F(sheVar.b, 0, new defpackage.sge(sheVar, (aoln) null, 3), 3);
    }
}
