package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes2.dex */
public final class bil implements androidx.compose.ui.input.pointer.PointerInputEventHandler {
    private final /* synthetic */ int $cid;
    final /* synthetic */ java.lang.Object a;

    public bil(java.lang.Object obj, int i) {
        this.$cid = i;
        this.a = obj;
    }

    /* JADX WARN: Type inference failed for: r6v15, types: [bgw, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r6v18, types: [aonj, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r6v38, types: [aonn, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r6v49, types: [ccp, java.lang.Object] */
    public final java.lang.Object invoke(cvr cvrVar, aoln aolnVar) {
        java.lang.Object objM;
        int i = 3;
        int i2 = 2;
        int i3 = 1;
        switch (this.$cid) {
            case 0:
                java.lang.Object objD = defpackage.ro.d(cvrVar, new defpackage.blc(new gbp(this.a, 1, (byte[]) null), null, 1, null), aolnVar);
                aolu aoluVar = aolu.a;
                if (objD != aoluVar) {
                    objD = aojh.a;
                }
                return objD != aoluVar ? aojh.a : objD;
            case 1:
                defpackage.aul aulVar = (defpackage.aul) this.a;
                if (aulVar.c && (objM = aosv.m(new defpackage.blj(cvrVar, aulVar, (aoln) null, 1), aolnVar)) == aolu.a) {
                    return objM;
                }
                break;
            case 2:
                defpackage.bjh bjhVar = (defpackage.bjh) this.a;
                java.lang.Object objH = defpackage.bai.h(cvrVar, bjhVar.f, bjhVar.c, aolnVar);
                if (objH == aolu.a) {
                    return objH;
                }
                break;
            case 3:
                java.lang.Object objE = wv.e(cvrVar, (defpackage.bgw) this.a, aolnVar);
                return objE != aolu.a ? aojh.a : objE;
            case 4:
                java.lang.Object objS = cvrVar.s(new defpackage.blc((aonj) this.a, (aoln) null, 0), aolnVar);
                return objS != aolu.a ? aojh.a : objS;
            case 5:
                java.lang.Object objH2 = defpackage.bai.h(cvrVar, (defpackage.bjj) ((defpackage.blw) this.a).k.a(), null, aolnVar);
                return objH2 != aolu.a ? aojh.a : objH2;
            case 6:
                java.lang.Object objE2 = defpackage.atv.e(cvrVar, null, new defpackage.bru(this.a, i2), aolnVar, 7);
                return objE2 != aolu.a ? aojh.a : objE2;
            case 7:
                java.lang.Object objM2 = aosv.m(new defpackage.blj(cvrVar, (defpackage.bwj) this.a, (aoln) null, 3), aolnVar);
                return objM2 != aolu.a ? aojh.a : objM2;
            case 8:
                java.lang.Object objM3 = aosv.m(new defpackage.blj(cvrVar, (defpackage.bwj) this.a, (aoln) null, 4, (byte[]) null), aolnVar);
                return objM3 != aolu.a ? aojh.a : objM3;
            case 9:
                java.lang.Object objD2 = defpackage.ro.d(cvrVar, new defpackage.blc((aonn) this.a, (aoln) null, 2), aolnVar);
                return objD2 != aolu.a ? aojh.a : objD2;
            case 10:
                java.lang.Object objH3 = defpackage.ro.h(cvrVar, new apk(4), new defpackage.mtr(this.a, 17), new nu(11), new defpackage.mts(i2), aolnVar);
                return objH3 != aolu.a ? aojh.a : objH3;
            case 11:
                java.lang.Object objH4 = defpackage.ro.h(cvrVar, new apk(4), new defpackage.mtr(this.a, 18), new nu(11), new defpackage.mts(i), aolnVar);
                return objH4 != aolu.a ? aojh.a : objH4;
            case 12:
                java.lang.Object objD3 = defpackage.ro.d(cvrVar, new defpackage.bxr((ccp) this.a, (aoln) null, 3), aolnVar);
                return objD3 != aolu.a ? aojh.a : objD3;
            case androidx.car.app.navigation.model.Maneuver.TYPE_ON_RAMP_SLIGHT_LEFT /* 13 */:
                java.lang.Object objE3 = defpackage.atv.e(cvrVar, null, new tge(this.a, 9), aolnVar, 7);
                return objE3 != aolu.a ? aojh.a : objE3;
            case androidx.car.app.navigation.model.Maneuver.TYPE_ON_RAMP_SLIGHT_RIGHT /* 14 */:
                java.lang.Object objE4 = defpackage.atv.e(cvrVar, null, new defpackage.abgj(this.a, i3), aolnVar, 7);
                return objE4 != aolu.a ? aojh.a : objE4;
            default:
                java.lang.Object objE5 = defpackage.atv.e(cvrVar, new defpackage.bug((defpackage.abgx) this.a, (aoln) null, 4), null, aolnVar, 11);
                return objE5 == aolu.a ? objE5 : aojh.a;
        }
        return aojh.a;
    }
}
