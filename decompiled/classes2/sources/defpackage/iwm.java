package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes2.dex */
public final /* synthetic */ class iwm implements zka {
    private final /* synthetic */ int $cid;
    public final /* synthetic */ java.lang.Object a;

    public /* synthetic */ iwm(java.lang.Object obj, int i) {
        this.$cid = i;
        this.a = obj;
    }

    /* JADX WARN: Type inference failed for: r2v15, types: [aoin, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r2v18, types: [aoin, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r2v21, types: [aoin, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r2v49, types: [aoin, java.lang.Object] */
    public final boolean a() {
        switch (this.$cid) {
            case 0:
                iqm iqmVar = (iqm) this.a;
                return iqmVar.a() && !iqmVar.b();
            case 1:
                java.lang.Object obj = this.a;
                aooh.f(obj, "<this>");
                return ((iqm) obj).a();
            case 2:
                return mni.bf((iqm) this.a);
            case 3:
                java.lang.Object obj2 = this.a;
                aooh.f(obj2, "<this>");
                return ((iqm) obj2).f();
            case 4:
                return afsq.bJ((aoin) this.a).booleanValue();
            case 5:
                return afsq.bJ((aoin) this.a).booleanValue();
            case 6:
                return ((java.lang.Boolean) this.a.a()).booleanValue();
            case 7:
                return ((kuz) this.a).a();
            case 8:
                return ((lbw) this.a).a();
            case 9:
                return ((lrb) this.a).b();
            case 10:
                return ((lrb) this.a).b();
            case 11:
                return ((lrb) this.a).b();
            case 12:
                return ((lrb) this.a).b();
            case androidx.car.app.navigation.model.Maneuver.TYPE_ON_RAMP_SLIGHT_LEFT /* 13 */:
                return ((lrb) this.a).b();
            case androidx.car.app.navigation.model.Maneuver.TYPE_ON_RAMP_SLIGHT_RIGHT /* 14 */:
                return afsq.cv((mnk) this.a);
            case androidx.car.app.navigation.model.Maneuver.TYPE_ON_RAMP_NORMAL_LEFT /* 15 */:
                return afsq.ca((aoin) this.a);
            case 16:
                return afsq.cv((mnk) this.a);
            case androidx.car.app.navigation.model.Maneuver.TYPE_ON_RAMP_SHARP_LEFT /* 17 */:
                return afsq.cv((mnk) this.a);
            case androidx.car.app.navigation.model.Maneuver.TYPE_ON_RAMP_SHARP_RIGHT /* 18 */:
                return afsq.cv((mnk) this.a);
            case androidx.car.app.navigation.model.Maneuver.TYPE_ON_RAMP_U_TURN_LEFT /* 19 */:
                return afsq.cv((mnk) this.a);
            default:
                return afsq.cv((mnk) this.a);
        }
    }
}
