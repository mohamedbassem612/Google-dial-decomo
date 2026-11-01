package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes2.dex */
public final /* synthetic */ class hle implements zcs {
    private final /* synthetic */ int $cid;
    public final /* synthetic */ java.lang.Object a;

    public /* synthetic */ hle(java.lang.Object obj, int i) {
        this.$cid = i;
        this.a = obj;
    }

    /* JADX WARN: Type inference failed for: r1v1, types: [aoin, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r1v4, types: [aoin, java.lang.Object] */
    public final boolean a() {
        switch (this.$cid) {
            case 0:
                return afsq.bJ((aoin) this.a).booleanValue();
            case 1:
                return afsq.bJ((aoin) this.a).booleanValue();
            case 2:
                return ((defpackage.ioh) this.a).a();
            case 3:
                return ((iqm) this.a).a();
            case 4:
                return ((iqm) this.a).a();
            case 5:
                return ((iqm) this.a).c();
            case 6:
                return kcq.C((iqm) this.a);
            case 7:
                return kcq.C((iqm) this.a);
            case 8:
                return ((zjm) this.a).g().isPresent();
            case 9:
                return mni.bf((iqm) this.a);
            case 10:
                return ((iqm) this.a).a();
            case 11:
                return ((iqm) this.a).c();
            case 12:
                iqm iqmVar = (iqm) this.a;
                return iqmVar.a() && !iqmVar.b();
            case androidx.car.app.navigation.model.Maneuver.TYPE_ON_RAMP_SLIGHT_LEFT /* 13 */:
                return mni.bf((iqm) this.a);
            case androidx.car.app.navigation.model.Maneuver.TYPE_ON_RAMP_SLIGHT_RIGHT /* 14 */:
                return ((iqm) this.a).a();
            case androidx.car.app.navigation.model.Maneuver.TYPE_ON_RAMP_NORMAL_LEFT /* 15 */:
                return ((iqm) this.a).e();
            case 16:
                return mni.bf((iqm) this.a);
            case androidx.car.app.navigation.model.Maneuver.TYPE_ON_RAMP_SHARP_LEFT /* 17 */:
                return mni.bf((iqm) this.a);
            case androidx.car.app.navigation.model.Maneuver.TYPE_ON_RAMP_SHARP_RIGHT /* 18 */:
                return mni.bf((iqm) this.a);
            case androidx.car.app.navigation.model.Maneuver.TYPE_ON_RAMP_U_TURN_LEFT /* 19 */:
                return mni.bf((iqm) this.a);
            default:
                return mni.bf((iqm) this.a);
        }
    }
}
