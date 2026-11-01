package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes2.dex */
public final /* synthetic */ class bhl implements aomy {
    private final /* synthetic */ int $cid;
    public final /* synthetic */ java.lang.Object a;

    public /* synthetic */ bhl(java.lang.Object obj, int i) {
        this.$cid = i;
        this.a = obj;
    }

    /* JADX INFO: Thrown type has an unknown type hierarchy: aoiq */
    /* JADX WARN: Type inference failed for: r10v1, types: [biv, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r10v10, types: [bhi, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r10v12, types: [cer, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r10v16, types: [dan, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r10v20, types: [dao, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r10v23, types: [cer, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r10v6, types: [cer, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r10v69, types: [cer, java.lang.Object] */
    public final java.lang.Object a() throws aoiq {
        switch (this.$cid) {
            case 0:
                return this.a.b();
            case 1:
                return new dpn(((dpo) this.a).d());
            case 2:
                cxi cxiVar = (cxi) this.a.a();
                if (cxiVar != null) {
                    return cxiVar;
                }
                defpackage.avo.b("Required value was null.");
                throw new aoiq();
            case 3:
                int i = defpackage.bhu.a;
                this.a.a();
                return aojh.a;
            case 4:
                cxi cxiVar2 = (cxi) this.a.a();
                if (cxiVar2 != null) {
                    return cxiVar2;
                }
                defpackage.avo.b("Required value was null.");
                throw new aoiq();
            case 5:
                ?? r10 = this.a;
                defpackage.bih bihVar = (defpackage.bih) r10;
                bihVar.b.b((android.content.res.Configuration) cfo.G((dan) r10, dep.a));
                bihVar.c.b((android.content.Context) cfo.G((dan) r10, dep.b));
                return aojh.a;
            case 6:
                ?? r11 = this.a;
                return ((cmv) r11).D ? defpackage.zb.h(r11) : defpackage.bhe.a;
            case 7:
                cxi cxiVar3 = (cxi) this.a.a();
                if (cxiVar3 != null) {
                    return cxiVar3;
                }
                defpackage.avo.b("Required value was null.");
                throw new aoiq();
            case 8:
            case 11:
                return ((defpackage.bjf) this.a).c.b;
            case 9:
                return ((defpackage.bjf) this.a).c.c;
            case 10:
                return ((defpackage.bjf) this.a).c.d;
            case 12:
                return java.lang.Long.valueOf(((defpackage.bjh) this.a).a);
            case androidx.car.app.navigation.model.Maneuver.TYPE_ON_RAMP_SLIGHT_LEFT /* 13 */:
                return ((defpackage.bjh) this.a).b.a();
            case androidx.car.app.navigation.model.Maneuver.TYPE_ON_RAMP_SLIGHT_RIGHT /* 14 */:
                return java.lang.Long.valueOf(((defpackage.bjh) this.a).a);
            case androidx.car.app.navigation.model.Maneuver.TYPE_ON_RAMP_NORMAL_LEFT /* 15 */:
                return ((defpackage.bjh) this.a).b.a();
            case 16:
                return java.lang.Boolean.valueOf((((defpackage.bkv) this.a).a() & 9223372034707292159L) != 9205357640488583168L);
            case androidx.car.app.navigation.model.Maneuver.TYPE_ON_RAMP_SHARP_LEFT /* 17 */:
                return java.lang.Boolean.valueOf((((defpackage.bkv) this.a).a() & 9223372034707292159L) != 9205357640488583168L);
            case androidx.car.app.navigation.model.Maneuver.TYPE_ON_RAMP_SHARP_RIGHT /* 18 */:
                cpm cpmVarF = ((defpackage.blw) this.a).f();
                return new cpm(cpmVarF != null ? cpmVarF.a : 9205357640488583168L);
            case androidx.car.app.navigation.model.Maneuver.TYPE_ON_RAMP_U_TURN_LEFT /* 19 */:
                cpm cpmVarE = ((defpackage.blw) this.a).e();
                return new cpm(cpmVarE != null ? cpmVarE.a : 9205357640488583168L);
            default:
                ait aitVar = defpackage.blk.a;
                return new cpm(((cpm) this.a.a()).a);
        }
    }
}
