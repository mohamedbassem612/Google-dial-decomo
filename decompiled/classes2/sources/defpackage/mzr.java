package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes2.dex */
public final /* synthetic */ class mzr implements zcs {
    private final /* synthetic */ int $cid;
    public final /* synthetic */ java.lang.Object a;

    public /* synthetic */ mzr(java.lang.Object obj, int i) {
        this.$cid = i;
        this.a = obj;
    }

    /* JADX WARN: Type inference failed for: r1v10, types: [aoin, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r1v12, types: [aoin, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r1v14, types: [aoin, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r1v56, types: [aoin, java.lang.Object] */
    public final boolean a() {
        switch (this.$cid) {
            case 0:
                return afsq.cv((mnk) this.a);
            case 1:
                return afsq.cv((mnk) this.a);
            case 2:
                return afsq.cv((mnk) this.a);
            case 3:
                return afsq.ca((aoin) this.a);
            case 4:
                return afsq.ca((aoin) this.a);
            case 5:
                return afsq.ca((aoin) this.a);
            case 6:
                return afsq.cv((mnk) this.a);
            case 7:
                return afsq.cv((mnk) this.a);
            case 8:
                return afsq.cv((mnk) this.a);
            case 9:
                return afsq.cv((mnk) this.a);
            case 10:
                java.lang.Object obj = this.a;
                aooh.c(obj);
                return ((java.lang.Boolean) obj).booleanValue();
            case 11:
                java.lang.Object obj2 = this.a;
                aooh.c(obj2);
                return ((java.lang.Boolean) obj2).booleanValue();
            case 12:
                java.lang.Object obj3 = this.a;
                aooh.c(obj3);
                return ((java.lang.Boolean) obj3).booleanValue();
            case androidx.car.app.navigation.model.Maneuver.TYPE_ON_RAMP_SLIGHT_LEFT /* 13 */:
                return ((zjm) this.a).g().isPresent();
            case androidx.car.app.navigation.model.Maneuver.TYPE_ON_RAMP_SLIGHT_RIGHT /* 14 */:
                return ((zjm) this.a).g().isPresent();
            case androidx.car.app.navigation.model.Maneuver.TYPE_ON_RAMP_NORMAL_LEFT /* 15 */:
                return ((zjm) this.a).g().isPresent();
            case 16:
                return ((zjm) this.a).g().isPresent();
            case androidx.car.app.navigation.model.Maneuver.TYPE_ON_RAMP_SHARP_LEFT /* 17 */:
                return ((defpackage.nvx) this.a).a();
            case androidx.car.app.navigation.model.Maneuver.TYPE_ON_RAMP_SHARP_RIGHT /* 18 */:
                return ((java.lang.Boolean) this.a.a()).booleanValue();
            case androidx.car.app.navigation.model.Maneuver.TYPE_ON_RAMP_U_TURN_LEFT /* 19 */:
                return ((defpackage.ocf) this.a).a();
            default:
                return ((defpackage.ocf) this.a).a();
        }
    }
}
