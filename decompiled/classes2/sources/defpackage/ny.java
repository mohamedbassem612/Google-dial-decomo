package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes2.dex */
public final /* synthetic */ class ny implements aomy {
    private final /* synthetic */ int $cid;
    public final /* synthetic */ java.lang.Object a;
    public final /* synthetic */ java.lang.Object b;

    public /* synthetic */ ny(java.lang.Object obj, java.lang.Object obj2, int i) {
        this.$cid = i;
        this.a = obj;
        this.b = obj2;
    }

    /* JADX INFO: Thrown type has an unknown type hierarchy: aois */
    /* JADX WARN: Code duplicated, block: B:110:0x02b5  */
    /* JADX WARN: Type inference failed for: r0v1, types: [aonn, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r0v10, types: [cer, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r0v2, types: [aomy, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r0v23, types: [aomy, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r0v35, types: [aomy, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r0v40, types: [dan, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r0v42, types: [cer, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r0v60, types: [ccp, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r0v8, types: [dan, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r13v41, types: [biv, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r13v47, types: [biv, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r13v58, types: [aoss, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r13v60, types: [cer, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r13v63, types: [aoss, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r13v7, types: [aonn, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r13v70, types: [ccp, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r1v23, types: [aiq, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r1v27, types: [java.lang.Object, java.util.List] */
    public final java.lang.Object a() throws aois {
        java.lang.Object vxVar;
        java.lang.Object obj;
        defpackage.djx djxVar;
        defpackage.bgp bgpVarB;
        long jA;
        int i = 2;
        int i2 = 11;
        boolean z = false;
        switch (this.$cid) {
            case 0:
                ((defpackage.np) this.a).a = this.b;
                return aojh.a;
            case 1:
                ((defpackage.no) this.a).a = this.b;
                return aojh.a;
            case 2:
                alg algVar = (alg) this.a;
                return java.lang.Boolean.valueOf(den.bA(algVar) ? ((java.lang.Boolean) this.b.a(algVar.f(), algVar.h())).booleanValue() : false);
            case 3:
                defpackage.agy agyVar = (defpackage.agy) this.b;
                agyVar.q();
                agyVar.r();
                ((defpackage.afg) this.a).f();
                ahc ahcVarF = agyVar.f();
                if (ahcVarF != null) {
                    ahcVarF.k();
                }
                return aojh.a;
            case 4:
                ((aoot) this.b).a = cfo.G((dan) this.a, cza.a);
                return aojh.a;
            case 5:
                defpackage.bbt bbtVar = (defpackage.bbt) this.b.a();
                defpackage.bcl bclVar = (defpackage.bcl) this.a;
                return new defpackage.bbv(bclVar, bbtVar, new aaif(((bej) bclVar.o.b).b(), bbtVar));
            case 6:
                vxVar = this.b;
                java.lang.Object obj2 = this.a;
                if (obj2 != null) {
                    defpackage.bgy bgyVar = (defpackage.bgy) obj2;
                    androidx.compose.runtime.snapshots.SnapshotStateList snapshotStateList = bgyVar.c;
                    if (snapshotStateList.isEmpty()) {
                        obj = bgyVar.b;
                    } else {
                        defpackage.bgt bgtVar = new defpackage.bgt(bgyVar.b);
                        java.util.List listC = snapshotStateList.c();
                        int size = listC.size();
                        for (int i3 = 0; i3 < size; i3++) {
                            ((aonj) listC.get(i3)).a(bgtVar);
                        }
                        obj = bgtVar.b;
                    }
                    bgyVar.b = (dji) obj;
                    if (obj != null) {
                        return obj;
                    }
                }
                return vxVar;
            case 7:
                defpackage.djw djwVar = (defpackage.djw) ((djg) this.b).a;
                boolean z2 = djwVar instanceof defpackage.djv;
                java.lang.Object obj3 = this.a;
                if (z2) {
                    try {
                        ((defpackage.oq) obj3).b(((defpackage.djv) djwVar).a);
                        break;
                    } catch (java.lang.IllegalArgumentException unused) {
                    }
                } else if ((djwVar instanceof defpackage.dju) && (djxVar = ((defpackage.dju) djwVar).c) != null) {
                    djxVar.a(djwVar);
                }
                return aojh.a;
            case 8:
                defpackage.bhl bhlVar = new defpackage.bhl(this.b, z ? 1 : 0);
                defpackage.bhq bhqVar = (defpackage.bhq) this.a;
                return (defpackage.bhe) bhqVar.a("dataBuilder", bhqVar.d, bhlVar);
            case 9:
                java.lang.Object obj4 = this.b;
                java.lang.Object obj5 = this.a;
                defpackage.ny nyVar = new defpackage.ny(obj5, obj4, i2);
                defpackage.bhq bhqVar2 = (defpackage.bhq) obj5;
                return (cpn) bhqVar2.a("positioner", bhqVar2.e, nyVar);
            case 10:
                ((aoot) this.b).a = this.a.a();
                return aojh.a;
            case 11:
                java.lang.Object objA = ((defpackage.bhq) this.a).b.a();
                cxi cxiVar = (cxi) (true == ((cxi) objA).u() ? objA : null);
                return cxiVar == null ? cpn.a : this.b.c(cxiVar).g(cxiVar.k(0L));
            case 12:
                int i4 = defpackage.bhu.a;
                ((defpackage.bhf) this.a).d.a(this.b);
                return aojh.a;
            case androidx.car.app.navigation.model.Maneuver.TYPE_ON_RAMP_SLIGHT_LEFT /* 13 */:
                int i5 = defpackage.bhu.a;
                return new dpn(dfd.l(this.a.a((cxi) this.b.a())));
            case androidx.car.app.navigation.model.Maneuver.TYPE_ON_RAMP_SLIGHT_RIGHT /* 14 */:
                ((aoot) this.b).a = cfo.G((dan) this.a, cza.a);
                return aojh.a;
            case androidx.car.app.navigation.model.Maneuver.TYPE_ON_RAMP_NORMAL_LEFT /* 15 */:
                long j = ((dpp) this.b.a()).a;
                defpackage.blw blwVar = (defpackage.blw) this.a;
                defpackage.bko bkoVarC = blwVar.c();
                long j2 = 9205357640488583168L;
                if (bkoVarC != null && (bgpVarB = blwVar.b()) != null) {
                    int iOrdinal = bgpVarB.ordinal();
                    if (iOrdinal == 0) {
                        throw new java.lang.IllegalStateException("SelectionContainer does not support cursor");
                    }
                    if (iOrdinal == 1) {
                        jA = defpackage.blx.a(blwVar, j, bkoVarC.a);
                    } else {
                        if (iOrdinal != 2) {
                            throw new aois();
                        }
                        jA = defpackage.blx.a(blwVar, j, bkoVarC.b);
                    }
                    j2 = jA;
                }
                return new cpm(j2);
            case 16:
                defpackage.btt bttVar = (defpackage.btt) this.a;
                if (((java.lang.Boolean) bttVar.b.a(defpackage.btu.c)).booleanValue()) {
                    aoov.an((aoss) this.b, (aolr) null, 0, new defpackage.bgx(bttVar, (aoln) null, 8, (boolean[]) null), 3);
                }
                return java.lang.Boolean.TRUE;
            case androidx.car.app.navigation.model.Maneuver.TYPE_ON_RAMP_SHARP_LEFT /* 17 */:
                vxVar = new vx((aiq) this.a);
                ((aonj) this.b.a()).a(vxVar);
                return vxVar;
            case androidx.car.app.navigation.model.Maneuver.TYPE_ON_RAMP_SHARP_RIGHT /* 18 */:
                return aoov.an((aoss) this.b, (aolr) null, 0, new defpackage.bgx((aii) this.a, (aoln) null, 11, (byte[]) null), 3);
            case androidx.car.app.navigation.model.Maneuver.TYPE_ON_RAMP_U_TURN_LEFT /* 19 */:
                agxr agxrVar = (agxr) this.a;
                java.lang.Object obj6 = agxrVar.b;
                java.lang.Object obj7 = this.b;
                if (!aooh.n(obj7, obj6)) {
                    ajsz.bw((java.util.List) agxrVar.a, new defpackage.bru(obj7, 7));
                    java.lang.Object obj8 = agxrVar.c;
                    if (obj8 != null) {
                        ((cdk) obj8).a();
                    }
                }
                return aojh.a;
            default:
                ?? r0 = this.a;
                ayy ayyVar = defpackage.bwh.a;
                if (r0.a() != null) {
                    ?? r13 = this.b;
                    if (r13.a() != null) {
                        java.lang.Object objA2 = r0.a();
                        aooh.c(objA2);
                        long jL = ((cxi) objA2).l(0L);
                        java.lang.Object objA3 = r13.a();
                        aooh.c(objA3);
                        long j3 = ((cpm) objA3).a;
                        float fIntBitsToFloat = java.lang.Float.intBitsToFloat((int) (j3 >> 32));
                        float fIntBitsToFloat2 = java.lang.Float.intBitsToFloat((int) (jL >> 32));
                        int i6 = (int) (4294967295L & j3);
                        int i7 = (int) (jL & 4294967295L);
                        if (fIntBitsToFloat <= fIntBitsToFloat2) {
                            i = java.lang.Float.intBitsToFloat(i6) < java.lang.Float.intBitsToFloat(i7) ? 1 : 3;
                        } else if (java.lang.Float.intBitsToFloat(i6) >= java.lang.Float.intBitsToFloat(i7)) {
                            i = 4;
                        }
                    } else {
                        i = 0;
                    }
                } else {
                    i = 0;
                }
                return java.lang.Integer.valueOf(i);
        }
    }

    public /* synthetic */ ny(java.lang.Object obj, java.lang.Object obj2, int i, byte[] bArr) {
        this.$cid = i;
        this.b = obj;
        this.a = obj2;
    }
}
