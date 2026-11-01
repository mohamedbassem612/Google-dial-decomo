package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes2.dex */
public final /* synthetic */ class bll implements aomy {
    private final /* synthetic */ int $cid;
    public final /* synthetic */ java.lang.Object a;

    public bll(alg algVar, int i) {
        this.$cid = i;
        this.a = algVar;
    }

    /* JADX WARN: Type inference failed for: r0v4, types: [cer, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r0v40, types: [aomy, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r0v46, types: [aomy, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r0v51, types: [aomy, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r0v56, types: [boolean, int] */
    /* JADX WARN: Type inference failed for: r0v58, types: [aomy, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r0v62, types: [ccp, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r0v88, types: [cer, java.lang.Object] */
    public final java.lang.Object a() {
        crg cpmVar;
        int iNextIndex;
        aoss aossVar;
        int i = 3;
        switch (this.$cid) {
            case 0:
                ((defpackage.blw) this.a).n();
                return aojh.a;
            case 1:
                cpmVar = new cpm(defpackage.blk.a(this.a));
                break;
            case 2:
                defpackage.blw blwVar = (defpackage.blw) this.a;
                blwVar.u(true);
                blwVar.p(null);
                blwVar.o(null);
                blwVar.h = null;
                if (blwVar.i && blwVar.B()) {
                    aoot aootVar = new aoot();
                    aoot aootVar2 = new aoot();
                    aoos aoosVar = new aoos();
                    defpackage.blz blzVar = blwVar.a;
                    java.util.List listC = blzVar.c(blwVar.k());
                    java.util.ListIterator listIterator = listC.listIterator(listC.size());
                    while (true) {
                        if (listIterator.hasPrevious()) {
                            defpackage.bko bkoVar = (defpackage.bko) blzVar.b().a(((defpackage.bke) listIterator.previous()).a);
                            if (bkoVar != null) {
                                if (bkoVar.a.a != bkoVar.b.a) {
                                    iNextIndex = listIterator.nextIndex();
                                }
                            }
                        } else {
                            iNextIndex = -1;
                        }
                    }
                    if (iNextIndex != -1) {
                        int size = listC.size();
                        for (int i2 = 0; i2 < size; i2++) {
                            defpackage.bke bkeVar = (defpackage.bke) listC.get(i2);
                            acx acxVarB = blzVar.b();
                            long j = bkeVar.a;
                            defpackage.bko bkoVar2 = (defpackage.bko) acxVarB.a(j);
                            if (bkoVar2 != null) {
                                dji djiVarH = bkeVar.h();
                                long jE = dfd.e(bkoVar2.a.a, bkoVar2.b.a);
                                long j2 = dky.a;
                                if (i2 >= iNextIndex) {
                                    aootVar.a = djiVarH;
                                    aootVar2.a = new dky(jE);
                                    aoosVar.a = j;
                                }
                            }
                        }
                    }
                    java.lang.Object obj = aootVar.a;
                    if (obj != null && aootVar2.a != null && aoosVar.a != 0 && ((java.lang.CharSequence) obj).length() > 0 && (aossVar = blwVar.j) != null) {
                        aoov.an(aossVar, (aolr) null, 0, new defpackage.blv(blwVar, aootVar, aootVar2, aoosVar, (aoln) null, 0), 3);
                    }
                }
                blwVar.i = false;
                return aojh.a;
            case 3:
                return ((defpackage.blw) this.a).f;
            case 4:
                java.lang.Object obj2 = this.a;
                cpmVar = new defpackage.bjj(null, ((defpackage.blw) obj2).a, new defpackage.bll(obj2, i));
                break;
            case 5:
                defpackage.blw blwVar2 = (defpackage.blw) this.a;
                blwVar2.m();
                if (blwVar2.A()) {
                    blwVar2.n();
                }
                return aojh.a;
            case 6:
                defpackage.blw blwVar3 = (defpackage.blw) this.a;
                return java.lang.Boolean.valueOf((blwVar3.l && blwVar3.A()) ? false : true);
            case 7:
                defpackage.blw blwVar4 = (defpackage.blw) this.a;
                defpackage.blz blzVar2 = blwVar4.a;
                java.util.List listC2 = blzVar2.c(blwVar4.k());
                if (!listC2.isEmpty()) {
                    int i3 = acy.a;
                    acx acxVar = new acx(6);
                    int size2 = listC2.size();
                    defpackage.bko bkoVar3 = null;
                    defpackage.bko bkoVar4 = null;
                    for (int i4 = 0; i4 < size2; i4++) {
                        defpackage.bke bkeVar2 = (defpackage.bke) listC2.get(i4);
                        defpackage.bko bkoVarF = bkeVar2.f();
                        if (bkoVarF != null) {
                            if (bkoVar3 == null) {
                                bkoVar3 = bkoVarF;
                            }
                            acxVar.i(bkeVar2.a, bkoVarF);
                            bkoVar4 = bkoVarF;
                        }
                    }
                    if (!acxVar.c()) {
                        if (bkoVar3 != bkoVar4) {
                            aooh.c(bkoVar3);
                            defpackage.bkn bknVar = bkoVar3.a;
                            aooh.c(bkoVar4);
                            bkoVar3 = new defpackage.bko(bknVar, bkoVar4.b, false);
                        }
                        blzVar2.f(acxVar);
                        blwVar4.b.a(bkoVar3);
                        blwVar4.h = null;
                        blwVar4.d.a();
                        blwVar4.u(true);
                    }
                }
                return aojh.a;
            case 8:
                cpmVar = new crg(((crg) ((defpackage.byj) this.a).a.a()).a);
                break;
            case 9:
                return java.lang.Float.valueOf(defpackage.bmz.a.a(((java.lang.Number) this.a.a()).floatValue()));
            case 10:
                ajb ajbVar = defpackage.bmz.a;
                return java.lang.Float.valueOf(1.0f - ((java.lang.Number) this.a.a()).floatValue());
            case 11:
                ajb ajbVar2 = defpackage.bmz.a;
                return java.lang.Boolean.valueOf((boolean) ((((java.lang.Number) this.a.a()).floatValue() > 0.5f ? 1 : (((java.lang.Number) this.a.a()).floatValue() == 0.5f ? 0 : -1)) >>> 31));
            case 12:
                this.a.a();
                return java.lang.Boolean.TRUE;
            case androidx.car.app.navigation.model.Maneuver.TYPE_ON_RAMP_SLIGHT_LEFT /* 13 */:
                ((defpackage.oq) this.a).a.b(java.lang.Boolean.FALSE);
                return aojh.a;
            case androidx.car.app.navigation.model.Maneuver.TYPE_ON_RAMP_SLIGHT_RIGHT /* 14 */:
                return java.lang.Boolean.valueOf(((java.lang.Number) ((defpackage.bpk) this.a).c.d()).floatValue() > 0.75f);
            case androidx.car.app.navigation.model.Maneuver.TYPE_ON_RAMP_NORMAL_LEFT /* 15 */:
                return ((defpackage.brc) this.a).a;
            case 16:
                return ((defpackage.brc) this.a).b;
            case androidx.car.app.navigation.model.Maneuver.TYPE_ON_RAMP_SHARP_LEFT /* 17 */:
                return ((alg) this.a).h();
            case androidx.car.app.navigation.model.Maneuver.TYPE_ON_RAMP_SHARP_RIGHT /* 18 */:
                return ((alg) this.a).h();
            case androidx.car.app.navigation.model.Maneuver.TYPE_ON_RAMP_U_TURN_LEFT /* 19 */:
                return java.lang.Boolean.valueOf(((defpackage.btt) this.a).d() != defpackage.btu.a);
            default:
                return java.lang.Float.valueOf(a.G((cer) this.a));
        }
        return cpmVar;
    }

    public /* synthetic */ bll(java.lang.Object obj, int i) {
        this.$cid = i;
        this.a = obj;
    }
}
