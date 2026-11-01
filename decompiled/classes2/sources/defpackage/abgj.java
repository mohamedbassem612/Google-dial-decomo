package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes2.dex */
public final /* synthetic */ class abgj implements aonj {
    private final /* synthetic */ int $cid;
    public final /* synthetic */ java.lang.Object a;

    public /* synthetic */ abgj(java.lang.Object obj, int i) {
        this.$cid = i;
        this.a = obj;
    }

    /* JADX WARN: Type inference failed for: r10v16, types: [aomy, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r10v21, types: [aomy, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r10v28, types: [aomy, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r10v4, types: [aomy, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r10v78, types: [boolean, int] */
    public final java.lang.Object a(java.lang.Object obj) {
        switch (this.$cid) {
            case 0:
                ((abgq) this.a).b(true);
                return aojh.a;
            case 1:
                this.a.a();
                return aojh.a;
            case 2:
                ((abgq) this.a).b(true);
                return aojh.a;
            case 3:
                defpackage.bgt bgtVar = (defpackage.bgt) obj;
                aooh.f(bgtVar, "$this$DraggableAnchors");
                java.lang.Object obj2 = this.a;
                abgy abgyVar = abgy.a;
                float f = ((abfs) obj2).g;
                bgtVar.a(abgyVar, -f);
                bgtVar.a(abgy.b, 0.0f);
                bgtVar.a(abgy.c, f);
                return aojh.a;
            case 4:
                return a.J((java.lang.String) this.a, (diq) obj);
            case 5:
                cra craVar = (cra) obj;
                aooh.f(craVar, "$this$graphicsLayer");
                craVar.v(((java.lang.Number) this.a.a()).floatValue());
                return aojh.a;
            case 6:
                cra craVar2 = (cra) obj;
                aooh.f(craVar2, "$this$graphicsLayer");
                craVar2.o(((java.lang.Number) this.a.a()).floatValue());
                return aojh.a;
            case 7:
                defpackage.cnw cnwVar = (defpackage.cnw) obj;
                aooh.f(cnwVar, "$this$drawWithCache");
                return cnwVar.q(new defpackage.abgj(this.a, 9));
            case 8:
                cra craVar3 = (cra) obj;
                aooh.f(craVar3, "$this$graphicsLayer");
                ?? r10 = this.a;
                craVar3.w(((java.lang.Number) r10.a()).floatValue());
                craVar3.x(((java.lang.Number) r10.a()).floatValue());
                return aojh.a;
            case 9:
                dbm dbmVar = (dbm) obj;
                aooh.f(dbmVar, "$this$onDrawWithContent");
                dbmVar.D();
                den.P(dbmVar, (cqd) this.a, 0L, 0L, 0.0f, (den) null, 9, 62);
                return aojh.a;
            case 10:
                diq diqVar = (diq) obj;
                aooh.f(diqVar, "$this$semantics");
                diqVar.a(defpackage.abiz.a, this.a);
                return aojh.a;
            case 11:
                xsv xsvVar = (xsv) obj;
                aooh.f(xsvVar, "builder");
                if (!((defpackage.abkh) this.a).b) {
                    return xsvVar;
                }
                xsv xsvVarQ = xsvVar.q(xwm.c);
                aooh.c(xsvVarQ);
                return xsvVarQ;
            case 12:
                cra craVar4 = (cra) obj;
                aooh.f(craVar4, "$this$graphicsLayer");
                craVar4.C(((agii) this.a).e());
                return aojh.a;
            case androidx.car.app.navigation.model.Maneuver.TYPE_ON_RAMP_SLIGHT_LEFT /* 13 */:
                cra craVar5 = (cra) obj;
                aooh.f(craVar5, "$this$graphicsLayer");
                craVar5.C(((java.lang.Number) ((aii) ((agii) this.a).e).d()).floatValue());
                return aojh.a;
            case androidx.car.app.navigation.model.Maneuver.TYPE_ON_RAMP_SLIGHT_RIGHT /* 14 */:
                dbm dbmVar2 = (dbm) obj;
                aooh.f(dbmVar2, "$this$drawWithContent");
                dbmVar2.D();
                den.P(dbmVar2, (cqd) this.a, 0L, 0L, 0.0f, (den) null, 5, 62);
                return aojh.a;
            case androidx.car.app.navigation.model.Maneuver.TYPE_ON_RAMP_NORMAL_LEFT /* 15 */:
                diq diqVar2 = (diq) obj;
                aooh.f(diqVar2, "$this$semantics");
                dfb.o(diqVar2, 2);
                diqVar2.a(din.L, defpackage.wx.j(((ablz) this.a).e));
                diqVar2.a(din.s, cnh.c);
                return aojh.a;
            case 16:
                diq diqVar3 = (diq) obj;
                aooh.f(diqVar3, "$this$semantics");
                dfb.o(diqVar3, 3);
                dfb.p(diqVar3, ((ablw) this.a).b);
                return aojh.a;
            case androidx.car.app.navigation.model.Maneuver.TYPE_ON_RAMP_SHARP_LEFT /* 17 */:
                return new dps(dpy.h(4294967296L, dps.a(((dps) obj).b) - dps.a(((defpackage.abms) this.a).d)));
            case androidx.car.app.navigation.model.Maneuver.TYPE_ON_RAMP_SHARP_RIGHT /* 18 */:
                long j = ((dps) obj).b;
                long j2 = 1095216660480L & j;
                if (j2 == 0) {
                    defpackage.dpm.a("Cannot perform operation for Unspecified type.");
                }
                dpt[] dptVarArr = dps.a;
                long j3 = dptVarArr[(int) (j2 >>> 32)].a;
                long j4 = dptVarArr[1].a;
                if (j3 != j4) {
                    defpackage.dpm.a("Cannot perform operation for " + dpt.a(j3) + " and " + dpt.a(j4));
                }
                return java.lang.Boolean.valueOf((boolean) ((java.lang.Float.compare(dps.a(j), dps.a(((defpackage.abms) this.a).b)) ^ (-1)) >>> 31));
            case androidx.car.app.navigation.model.Maneuver.TYPE_ON_RAMP_U_TURN_LEFT /* 19 */:
                afpl afplVar = (afpl) obj;
                aooh.f(afplVar, "$this$withColor");
                afplVar.C(((defpackage.abof) this.a).b);
                afplVar.C(" ");
                return aojh.a;
            default:
                afpl afplVar2 = (afpl) obj;
                aooh.f(afplVar2, "$this$withContentColorWithAlpha");
                defpackage.abof abofVar = (defpackage.abof) this.a;
                java.lang.String strSubstring = abofVar.c.substring(abofVar.d.intValue());
                aooh.e(strSubstring, "substring(...)");
                afplVar2.C(strSubstring);
                return aojh.a;
        }
    }
}
