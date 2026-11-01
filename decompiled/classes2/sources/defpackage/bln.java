package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes2.dex */
public final /* synthetic */ class bln implements aonj {
    private final /* synthetic */ int $cid;
    public final /* synthetic */ java.lang.Object a;

    public /* synthetic */ bln(java.lang.Object obj, int i) {
        this.$cid = i;
        this.a = obj;
    }

    /* JADX INFO: Thrown type has an unknown type hierarchy: aoiq */
    /* JADX WARN: Type inference failed for: r8v27, types: [aomy, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r8v29, types: [java.lang.Object, java.util.List] */
    /* JADX WARN: Type inference failed for: r8v32, types: [cer, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r8v39, types: [aomy, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r8v43, types: [aomy, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r8v46, types: [aomy, java.lang.Object] */
    public final java.lang.Object a(java.lang.Object obj) throws aoiq {
        defpackage.bkn bknVar;
        defpackage.bkn bknVar2;
        defpackage.bko bkoVarC;
        switch (this.$cid) {
            case 0:
                long jLongValue = ((java.lang.Long) obj).longValue();
                defpackage.blw blwVar = (defpackage.blw) this.a;
                if (blwVar.a.b().b(jLongValue)) {
                    blwVar.n();
                    blwVar.t(null);
                }
                return aojh.a;
            case 1:
                if (((defpackage.bkl) obj).d().length() > 0) {
                    ((aoop) this.a).a = false;
                }
                return aojh.a;
            case 2:
                long jLongValue2 = ((java.lang.Long) obj).longValue();
                defpackage.blw blwVar2 = (defpackage.blw) this.a;
                defpackage.bko bkoVarC2 = blwVar2.c();
                if (bkoVarC2 != null && (bknVar2 = bkoVarC2.a) != null && jLongValue2 == bknVar2.b) {
                    blwVar2.v(null);
                }
                defpackage.bko bkoVarC3 = blwVar2.c();
                if (bkoVarC3 != null && (bknVar = bkoVarC3.b) != null && jLongValue2 == bknVar.b) {
                    blwVar2.q(null);
                }
                if (blwVar2.a.b().b(jLongValue2)) {
                    blwVar2.x();
                }
                bek bekVar = (bek) blwVar2.n.e(jLongValue2);
                if (bekVar != null) {
                    bekVar.a();
                }
                return aojh.a;
            case 3:
                cxi cxiVar = (cxi) obj;
                defpackage.blw blwVar3 = (defpackage.blw) this.a;
                blwVar3.f = cxiVar;
                if (cxiVar != null && cxiVar.u() && (bkoVarC = blwVar3.c()) != null) {
                    defpackage.blz blzVar = blwVar3.a;
                    if (blzVar.b().c()) {
                        java.util.List listC = blzVar.c(blwVar3.k());
                        if (!listC.isEmpty()) {
                            blzVar.f(defpackage.li.i(bkoVarC, listC, new defpackage.bcm(10), new defpackage.aem(6), new defpackage.bbs(bkoVarC, 3)));
                        }
                        blwVar3.d.a();
                    }
                }
                if (blwVar3.y() && blwVar3.c() != null) {
                    cpm cpmVar = cxiVar != null ? new cpm(cxiVar.m(0L)) : null;
                    if (!aooh.n(blwVar3.e, cpmVar)) {
                        blwVar3.e = cpmVar;
                        blwVar3.w();
                        blwVar3.x();
                    }
                }
                return aojh.a;
            case 4:
                cpe cpeVar = (cpe) obj;
                boolean zA = cpeVar.a();
                java.lang.Object obj2 = this.a;
                if (!zA) {
                    defpackage.blw blwVar4 = (defpackage.blw) obj2;
                    if (blwVar4.y()) {
                        blwVar4.n();
                    }
                }
                ((defpackage.blw) obj2).r(cpeVar.a());
                return aojh.a;
            case 5:
                ((defpackage.blw) this.a).s(((java.lang.Boolean) obj).booleanValue());
                return aojh.a;
            case 6:
                cxi cxiVar2 = (cxi) obj;
                defpackage.blw blwVar5 = (defpackage.blw) this.a;
                cpn cpnVarG = blwVar5.g();
                if (cpnVarG == null) {
                    return null;
                }
                cxi cxiVar3 = blwVar5.f;
                if (cxiVar3 != null) {
                    return (cxiVar3.u() && cxiVar2.u()) ? cdh.x(cxiVar2.n(den.G(cxiVar3).l(cpnVarG.d())), cpnVarG.c()) : cpn.a;
                }
                defpackage.avo.b("Required value was null.");
                throw new aoiq();
            case 7:
                ((defpackage.blw) this.a).t((defpackage.bko) obj);
                return aojh.a;
            case 8:
                long jLongValue3 = ((java.lang.Long) obj).longValue();
                defpackage.blw blwVar6 = (defpackage.blw) this.a;
                if (blwVar6.a.b().b(jLongValue3)) {
                    blwVar6.g.b(aojh.a);
                    blwVar6.w();
                    blwVar6.x();
                }
                return aojh.a;
            case 9:
                return (cpm) this.a.a();
            case 10:
                return mni.bs((java.util.List) this.a, (czb) obj);
            case 11:
                ayy ayyVar = defpackage.bmm.a;
                dfb.m((diq) obj, (java.lang.String) this.a);
                return aojh.a;
            case 12:
                csj csjVar = (csj) obj;
                ajb ajbVar = defpackage.bmz.a;
                long j = ((cqg) this.a.a()).a;
                if (!anty.ah(j, cfd.S())) {
                    den.J(csjVar, j, 0L, 0.0f, (cqh) null, 126);
                }
                return aojh.a;
            case androidx.car.app.navigation.model.Maneuver.TYPE_ON_RAMP_SLIGHT_LEFT /* 13 */:
                java.lang.Object obj3 = this.a;
                ajb ajbVar2 = defpackage.bmz.a;
                return mni.bp((czc) obj3, (czb) obj);
            case androidx.car.app.navigation.model.Maneuver.TYPE_ON_RAMP_SLIGHT_RIGHT /* 14 */:
                ajb ajbVar3 = defpackage.bmz.a;
                ((cra) obj).o(((java.lang.Number) this.a.a()).floatValue());
                return aojh.a;
            case androidx.car.app.navigation.model.Maneuver.TYPE_ON_RAMP_NORMAL_LEFT /* 15 */:
                csj csjVar2 = (csj) obj;
                ajb ajbVar4 = defpackage.bmz.a;
                den.J(csjVar2, ((cqg) this.a.a()).a, 0L, 0.0f, (cqh) null, 126);
                return aojh.a;
            case 16:
                ajb ajbVar5 = defpackage.bmz.a;
                ((cra) obj).o(((java.lang.Number) this.a.a()).floatValue());
                return aojh.a;
            case androidx.car.app.navigation.model.Maneuver.TYPE_ON_RAMP_SHARP_LEFT /* 17 */:
                dfb.j((diq) obj, (java.lang.String) this.a);
                return aojh.a;
            case androidx.car.app.navigation.model.Maneuver.TYPE_ON_RAMP_SHARP_RIGHT /* 18 */:
                ((java.lang.Float) obj).floatValue();
                return java.lang.Float.valueOf(((java.lang.Number) ((defpackage.btt) this.a).a.a()).floatValue());
            case androidx.car.app.navigation.model.Maneuver.TYPE_ON_RAMP_U_TURN_LEFT /* 19 */:
                diq diqVar = (diq) obj;
                dfb.m(diqVar, (java.lang.String) this.a);
                dfb.r(diqVar, 0.0f);
                return aojh.a;
            default:
                diq diqVar2 = (diq) obj;
                int i = bpz.a;
                dfb.j(diqVar2, (java.lang.String) this.a);
                dfb.o(diqVar2, 5);
                return aojh.a;
        }
    }
}
