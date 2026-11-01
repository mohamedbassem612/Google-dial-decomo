package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes.dex */
public final /* synthetic */ class nz implements defpackage.aonj {
    private final /* synthetic */ int $cid;
    public final /* synthetic */ java.lang.Object a;
    public final /* synthetic */ java.lang.Object b;

    public /* synthetic */ nz(java.lang.Object obj, java.lang.Object obj2, int i) {
        this.$cid = i;
        this.b = obj;
        this.a = obj2;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v63, types: [aonn, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r0v65, types: [aoss, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r0v71, types: [aoss, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r1v57, types: [avj, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r1v60, types: [avj, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r3v13, types: [aonj, java.lang.Object] */
    @Override // defpackage.aonj
    public final java.lang.Object a(java.lang.Object obj) {
        defpackage.oc ocVar;
        long jD;
        defpackage.agh aghVar;
        defpackage.ajl ajlVar;
        defpackage.ajl ajlVar2;
        defpackage.ags agsVar;
        defpackage.ajl ajlVar3;
        defpackage.ajl ajlVar4;
        defpackage.cxi cxiVarO;
        float f = 1.0f;
        switch (this.$cid) {
            case 0:
                java.lang.Object obj2 = this.b;
                java.lang.Object obj3 = this.a;
                ((defpackage.vx) obj3).d((of) obj2);
                ocVar = new defpackage.oc(obj3, obj2, 0);
                break;
            case 1:
                java.lang.Object obj4 = this.b;
                java.lang.Object obj5 = this.a;
                ((defpackage.vx) obj5).d((of) obj4);
                ocVar = new defpackage.oc(obj5, obj4, 1);
                break;
            case 2:
                defpackage.czb czbVar = (defpackage.czb) obj;
                afj afjVar = (afj) this.b;
                afl aflVar = afjVar.e;
                defpackage.cpn cpnVarB = aflVar.b();
                defpackage.cyb cybVar = afjVar.a;
                defpackage.cxi cxiVarO2 = czbVar.o();
                defpackage.cpm cpmVar = cxiVarO2 != null ? new defpackage.cpm(cybVar.dd(czbVar).j(cxiVarO2, 0L, false)) : null;
                if (cpnVarB != null) {
                    long jD2 = cpnVarB.d();
                    long jC = cpnVarB.c();
                    aflVar.e = jD2;
                    aflVar.f = jC;
                    jD = cpnVarB.d();
                } else {
                    defpackage.cpn cpnVarA = aflVar.a();
                    jD = cpnVarA != null ? cpnVarA.d() : 0L;
                }
                long jAM = cpmVar != null ? defpackage.mni.aM(jD, cpmVar.a) : 0L;
                czbVar.s((defpackage.czc) this.a, java.lang.Math.round(java.lang.Float.intBitsToFloat((int) (jAM >> 32))), java.lang.Math.round(java.lang.Float.intBitsToFloat((int) (4294967295L & jAM))), 0.0f);
                return defpackage.aojh.a;
            case 3:
                defpackage.alc alcVar = (defpackage.alc) obj;
                defpackage.aonj aonjVar = defpackage.aga.a;
                defpackage.afr afrVar = defpackage.afr.a;
                defpackage.afr afrVar2 = defpackage.afr.b;
                if (!alcVar.d(afrVar, afrVar2)) {
                    return (!alcVar.d(afrVar2, defpackage.afr.c) || (aghVar = ((defpackage.agg) this.a).b.a) == null || (ajlVar = aghVar.b) == null) ? defpackage.aga.c : ajlVar;
                }
                defpackage.agh aghVar2 = ((defpackage.agf) this.b).b.a;
                return (aghVar2 == null || (ajlVar2 = aghVar2.b) == null) ? defpackage.aga.c : ajlVar2;
            case 4:
                defpackage.aonj aonjVar2 = defpackage.aga.a;
                int iOrdinal = ((defpackage.afr) obj).ordinal();
                if (iOrdinal == 0) {
                    defpackage.agh aghVar3 = ((defpackage.agf) this.b).b.a;
                    if (aghVar3 != null) {
                        f = aghVar3.a;
                    }
                } else if (iOrdinal != 1) {
                    if (iOrdinal != 2) {
                        throw new defpackage.aois();
                    }
                    defpackage.agh aghVar4 = ((defpackage.agg) this.a).b.a;
                    if (aghVar4 != null) {
                        f = aghVar4.a;
                    }
                }
                return java.lang.Float.valueOf(f);
            case 5:
                defpackage.alc alcVar2 = (defpackage.alc) obj;
                defpackage.aonj aonjVar3 = defpackage.aga.a;
                defpackage.afr afrVar3 = defpackage.afr.a;
                defpackage.afr afrVar4 = defpackage.afr.b;
                if (!alcVar2.d(afrVar3, afrVar4)) {
                    return (!alcVar2.d(afrVar4, defpackage.afr.c) || (agsVar = ((defpackage.agg) this.a).b.d) == null || (ajlVar3 = agsVar.c) == null) ? defpackage.aga.d : ajlVar3;
                }
                defpackage.ags agsVar2 = ((defpackage.agf) this.b).b.d;
                return (agsVar2 == null || (ajlVar4 = agsVar2.c) == null) ? defpackage.aga.d : ajlVar4;
            case defpackage.eft.STRING_SET_FIELD_NUMBER /* 6 */:
                defpackage.aonj aonjVar4 = defpackage.aga.a;
                int iOrdinal2 = ((defpackage.afr) obj).ordinal();
                if (iOrdinal2 == 0) {
                    defpackage.ags agsVar3 = ((defpackage.agf) this.b).b.d;
                    if (agsVar3 != null) {
                        f = agsVar3.a;
                    }
                } else if (iOrdinal2 != 1) {
                    if (iOrdinal2 != 2) {
                        throw new defpackage.aois();
                    }
                    defpackage.ags agsVar4 = ((defpackage.agg) this.a).b.d;
                    if (agsVar4 != null) {
                        f = agsVar4.a;
                    }
                }
                return java.lang.Float.valueOf(f);
            case defpackage.eft.DOUBLE_FIELD_NUMBER /* 7 */:
                defpackage.czb czbVar2 = (defpackage.czb) obj;
                czbVar2.s((defpackage.czc) this.a, 0, 0, 0.0f);
                agu aguVar = (agu) this.b;
                agx agxVarR = aguVar.r();
                agy agyVar = aguVar.e;
                aho ahoVar = agxVarR.c;
                ahoVar.d();
                if (!defpackage.aooh.n(agxVarR.a(), agq.a) && agyVar.r()) {
                    ahn ahnVarA = agxVarR.a();
                    if (agyVar.d().e() && ahnVarA.e() && (cxiVarO = czbVar2.o()) != null) {
                        long jL = defpackage.dpy.l(cxiVarO.h());
                        long jDf = agyVar.e().b.df(agyVar.e().b.b(), cxiVarO, true);
                        defpackage.ahj ahjVar = agyVar.e().b;
                        long j = agyVar.e().b.b().j(cxiVarO, 0L, false);
                        ahn ahnVarA2 = ahoVar.a();
                        agu aguVar2 = ahoVar.b;
                        defpackage.aooh.c(aguVar2);
                        ahoVar.f(ahnVarA2.f(ahoVar.a, aguVar2, jL, jDf, j));
                    }
                }
                return defpackage.aojh.a;
            case defpackage.eft.BYTES_FIELD_NUMBER /* 8 */:
                ((defpackage.czb) obj).s((defpackage.czc) this.a, 0, 0, ((defpackage.aie) this.b).a);
                return defpackage.aojh.a;
            case 9:
                java.lang.Object obj6 = this.a;
                ajw ajwVar = (ajw) obj6;
                defpackage.cfc cfcVar = ajwVar.a;
                java.lang.Object obj7 = this.b;
                cfcVar.n(obj7);
                ajwVar.b(true);
                ocVar = new defpackage.oc(obj6, obj7, 2);
                break;
            case 10:
                aip aipVar = (aip) obj;
                this.a.a(aipVar.a(), ((defpackage.nf) this.b).b.a(aipVar.c));
                return defpackage.aojh.a;
            case 11:
                defpackage.aoov.an(this.a, null, 4, new alf((defpackage.alg) this.b, (defpackage.aoln) null), 1);
                return new dqz(1);
            case 12:
                defpackage.clk clkVar = new defpackage.clk(new defpackage.nz(java.lang.Thread.currentThread(), this.a, 15));
                java.lang.Object obj8 = this.b;
                ((akr) obj8).r(clkVar);
                return new ali(obj8, 1);
            case 13:
                java.lang.Object obj9 = this.b;
                androidx.compose.runtime.snapshots.SnapshotStateList snapshotStateList = ((defpackage.alg) obj9).d;
                java.lang.Object obj10 = this.a;
                snapshotStateList.add(obj10);
                ocVar = new defpackage.oc(obj9, obj10, 3, null);
                break;
            case 14:
                ocVar = new defpackage.oc(this.a, this.b, 4);
                break;
            case 15:
                defpackage.aomy aomyVar = (defpackage.aomy) obj;
                if (this.b == java.lang.Thread.currentThread()) {
                    aomyVar.a();
                } else {
                    defpackage.aoov.an(this.a, null, 0, new amj(aomyVar, (defpackage.aoln) null, 1), 3);
                }
                return defpackage.aojh.a;
            case 16:
                java.lang.Object obj11 = this.b;
                java.lang.Object obj12 = this.a;
                ((defpackage.alg) obj12).D((ale) obj11);
                ocVar = new defpackage.oc(obj12, obj11, 5);
                break;
            case 17:
                ((defpackage.kaw) this.b).aw(this.a);
                return defpackage.aojh.a;
            case 18:
                ((defpackage.kaw) this.a).aw(this.b);
                return defpackage.aojh.a;
            case 19:
                long j2 = ((aqu) obj).a;
                java.lang.Object obj13 = this.b;
                apt aptVar = (apt) obj13;
                long jBm = defpackage.mni.bm(j2, true == aptVar.j() ? -1.0f : 1.0f);
                ((apx) this.a).a(aptVar.a.d(java.lang.Float.intBitsToFloat((int) (((defpackage.ark) obj13).e == defpackage.aso.a ? jBm & 4294967295L : jBm >> 32))), 0.0f);
                return defpackage.aojh.a;
            default:
                ((defpackage.cfc) ((defpackage.kaw) this.b).a).m(this.a);
                return defpackage.aojh.a;
        }
        return ocVar;
    }

    public /* synthetic */ nz(java.lang.Object obj, java.lang.Object obj2, int i, byte[] bArr) {
        this.$cid = i;
        this.a = obj;
        this.b = obj2;
    }
}
