package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes2.dex */
public final /* synthetic */ class auj implements aonj {
    private final /* synthetic */ int $cid;
    public final /* synthetic */ java.lang.Object a;

    public /* synthetic */ auj(java.lang.Object obj, int i) {
        this.$cid = i;
        this.a = obj;
    }

    /* JADX WARN: Type inference failed for: r8v37, types: [aonj, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r8v40, types: [aonj, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r8v56, types: [aonj, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r8v60, types: [aonj, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r9v23, types: [java.lang.Object, java.util.List] */
    public final java.lang.Object a(java.lang.Object obj) {
        defpackage.bcb bcbVar;
        int i = 0;
        defpackage.bcb bcbVarI = null;
        float f = 0.0f;
        switch (this.$cid) {
            case 0:
                ((java.lang.Boolean) ((defpackage.aul) this.a).a.a((cpm) obj)).booleanValue();
                return java.lang.Boolean.TRUE;
            case 1:
                return java.lang.Boolean.valueOf(defpackage.rr.d((ato) this.a, java.lang.Float.intBitsToFloat((int) (((defpackage.asw) obj).a & 4294967295L))));
            case 2:
                ((czb) obj).u((czc) this.a, 0, 0, 0.0f);
                return aojh.a;
            case 3:
                cfc cfcVar = (cfc) this.a;
                java.lang.Object[] objArr = cfcVar.a;
                int i2 = cfcVar.b;
                while (i < i2) {
                    ((cyf) objArr[i]).i();
                    i++;
                }
                return aojh.a;
            case 4:
                ((aoot) this.a).a = (czc) obj;
                return aojh.a;
            case 5:
                ((aoot) this.a).a = (czc) obj;
                return aojh.a;
            case 6:
                czc czcVar = (czc) obj;
                if (czcVar != null) {
                    czcVar.x();
                    czcVar.w();
                }
                return aojh.a;
            case 7:
                czc czcVar2 = (czc) obj;
                if (czcVar2 != null) {
                    czcVar2.x();
                    czcVar2.w();
                }
                return aojh.a;
            case 8:
                ddh ddhVar = (ddh) obj;
                if (ddhVar == null) {
                    aooh.h("null cannot be cast to non-null type androidx.compose.foundation.layout.InsetsConsumingModifierNode");
                }
                defpackage.axz axzVar = (defpackage.axz) ddhVar;
                azz azzVar = ((defpackage.axz) this.a).c;
                if (!aooh.n(axzVar.b, azzVar)) {
                    axzVar.b = azzVar;
                    axzVar.d();
                }
                return defpackage.ddg.b;
            case 9:
                ddh ddhVar2 = (ddh) obj;
                if (ddhVar2 == null) {
                    aooh.h("null cannot be cast to non-null type androidx.compose.foundation.layout.InsetsConsumingModifierNode");
                }
                ((defpackage.axz) this.a).b = ((defpackage.axz) ddhVar2).c;
                return java.lang.Boolean.FALSE;
            case 10:
                czb czbVar = (czb) obj;
                dpq dpqVarP = czbVar.p();
                java.lang.Object obj2 = this.a;
                if (dpqVarP == dpq.a || czbVar.n() == 0) {
                    czc czcVar3 = (czc) obj2;
                    czbVar.r(czcVar3);
                    czcVar3.dg(dpn.d(0L, czcVar3.e), 0.0f, (aonj) null);
                } else {
                    czc czcVar4 = (czc) obj2;
                    int iN = czbVar.n() - czcVar4.a;
                    czbVar.r(czcVar4);
                    czcVar4.dg(dpn.d(((long) iN) << 32, czcVar4.e), 0.0f, (aonj) null);
                }
                return aojh.a;
            case 11:
                this.a.a(java.lang.Integer.valueOf(((absu) obj).a));
                return aojh.a;
            case 12:
                ?? r9 = ((defpackage.oq) obj).a;
                int size = r9.size();
                int iIntValue = Integer.MIN_VALUE;
                while (i < size) {
                    iIntValue = ((java.lang.Number) r9.get(i)).intValue();
                    i++;
                }
                if (iIntValue != Integer.MIN_VALUE) {
                    this.a.a(java.lang.Integer.valueOf(iIntValue));
                }
                return aojh.a;
            case androidx.car.app.navigation.model.Maneuver.TYPE_ON_RAMP_SLIGHT_LEFT /* 13 */:
                defpackage.bem bemVar = (defpackage.bem) obj;
                cko ckoVar = (cko) ckw.i.i();
                java.lang.Object obj3 = this.a;
                bcbVarI = ckoVar != null ? ckoVar.i() : null;
                cko ckoVarH = cfd.h(ckoVar);
                try {
                    int iB = ((defpackage.bcl) obj3).b();
                    cfd.i(ckoVar, ckoVarH, bcbVarI);
                    mni.bx(bemVar, iB);
                    return aojh.a;
                } catch (java.lang.Throwable th) {
                    cfd.i(ckoVar, ckoVarH, bcbVarI);
                    throw th;
                }
            case androidx.car.app.navigation.model.Maneuver.TYPE_ON_RAMP_SLIGHT_RIGHT /* 14 */:
                return java.lang.Integer.valueOf(((defpackage.bch) this.a).a(((java.lang.Integer) obj).intValue()));
            case androidx.car.app.navigation.model.Maneuver.TYPE_ON_RAMP_NORMAL_LEFT /* 15 */:
                float f2 = -((java.lang.Float) obj).floatValue();
                java.lang.Object obj4 = this.a;
                if ((f2 >= 0.0f || ((defpackage.bcl) obj4).g()) && (f2 <= 0.0f || ((defpackage.bcl) obj4).f())) {
                    defpackage.bcl bclVar = (defpackage.bcl) obj4;
                    if (java.lang.Math.abs(bclVar.e) > 0.5f) {
                        defpackage.avo.d("entered drag with non-zero pending scroll");
                    }
                    float f3 = bclVar.e + f2;
                    bclVar.e = f3;
                    if (java.lang.Math.abs(f3) > 0.5f) {
                        float f4 = bclVar.e;
                        int i3 = aopc.i(f4);
                        defpackage.bcb bcbVarE = ((defpackage.bcb) bclVar.d.a()).e(i3, !bclVar.b);
                        if (bcbVarE == null || (bcbVar = bclVar.c) == null) {
                            bcbVarI = bcbVarE;
                        } else {
                            defpackage.bcb bcbVarE2 = bcbVar.e(i3, true);
                            if (bcbVarE2 != null) {
                                bclVar.c = bcbVarE2;
                                bcbVarI = bcbVarE;
                            }
                        }
                        if (bcbVarI != null) {
                            bclVar.e(bcbVarI, bclVar.b, true);
                            bclVar.k.b(aojh.a);
                            bclVar.j(f4 - bclVar.e, bcbVarI);
                        } else {
                            dbk dbkVar = bclVar.n;
                            if (dbkVar != null) {
                                dbkVar.C();
                            }
                            bclVar.j(f4 - bclVar.e, bclVar.i());
                        }
                    }
                    if (java.lang.Math.abs(bclVar.e) > 0.5f) {
                        f2 -= bclVar.e;
                        bclVar.e = 0.0f;
                    }
                    f = f2;
                }
                return java.lang.Float.valueOf(-f);
            case 16:
                ((akbx) this.a).a.a(((aii) obj).d());
                return aojh.a;
            case androidx.car.app.navigation.model.Maneuver.TYPE_ON_RAMP_SHARP_LEFT /* 17 */:
                ((akbx) this.a).a.a(((aii) obj).d());
                return aojh.a;
            case androidx.car.app.navigation.model.Maneuver.TYPE_ON_RAMP_SHARP_RIGHT /* 18 */:
                bfi bfiVar = (ddh) obj;
                if (bfiVar == null) {
                    aooh.h("null cannot be cast to non-null type androidx.compose.foundation.lazy.layout.TraversablePrefetchStateNode");
                }
                java.lang.Object obj5 = this.a;
                beo beoVar = bfiVar.a;
                aoot aootVar = (aoot) obj5;
                java.util.List arrayList = (java.util.List) aootVar.a;
                if (arrayList != null) {
                    arrayList.add(beoVar);
                } else {
                    arrayList = new java.util.ArrayList((java.util.Collection) new aojv(new beo[]{beoVar}, true));
                }
                aootVar.a = arrayList;
                return defpackage.ddg.b;
            case androidx.car.app.navigation.model.Maneuver.TYPE_ON_RAMP_U_TURN_LEFT /* 19 */:
                aoov.an((aoss) obj, (aolr) null, 4, new defpackage.ahb((bfe) this.a, (aoln) null, 19), 1);
                return aojh.a;
            default:
                float fFloatValue = ((java.lang.Float) obj).floatValue();
                bfe bfeVar = (bfe) this.a;
                cso csoVar = bfeVar.c;
                if (csoVar != null) {
                    csoVar.i(fFloatValue);
                    bfeVar.a.a();
                }
                return aojh.a;
        }
    }
}
