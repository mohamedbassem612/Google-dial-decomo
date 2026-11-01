package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes2.dex */
public final /* synthetic */ class kpr implements zcs {
    private final /* synthetic */ int $cid;
    public final /* synthetic */ java.lang.Object a;

    public /* synthetic */ kpr(java.lang.Object obj, int i) {
        this.$cid = i;
        this.a = obj;
    }

    /* JADX WARN: Type inference failed for: r3v1, types: [aoin, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r3v3, types: [aoin, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r3v5, types: [aoin, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r3v7, types: [aoin, java.lang.Object] */
    public final boolean a() {
        switch (this.$cid) {
            case 0:
                return afsq.bJ((aoin) this.a).booleanValue();
            case 1:
                return afsq.bJ((aoin) this.a).booleanValue();
            case 2:
                return afsq.bJ((aoin) this.a).booleanValue();
            case 3:
                return afsq.bJ((aoin) this.a).booleanValue();
            case 4:
                j$.util.Optional optionalA = ((kwt) this.a).a();
                aooh.e(optionalA, "getCurrentLocaleForBuiltInAudioFile(...)");
                if (aooh.q(optionalA) != null) {
                    return true;
                }
                break;
            case 5:
                if (!((kwt) this.a).a().isPresent()) {
                    return true;
                }
                break;
            case 6:
                return ((kwt) this.a).a().isPresent();
            case 7:
                if (!((kwt) this.a).a().isPresent()) {
                    return true;
                }
                break;
            case 8:
                return ((defpackage.kuw) this.a).a();
            case 9:
                return ((defpackage.kuw) this.a).a();
            case 10:
                return ((defpackage.kuw) this.a).a();
            case 11:
                return ((kuz) this.a).a();
            case 12:
                return ((kuz) this.a).a();
            case androidx.car.app.navigation.model.Maneuver.TYPE_ON_RAMP_SLIGHT_LEFT /* 13 */:
                return ((kuz) this.a).a();
            case androidx.car.app.navigation.model.Maneuver.TYPE_ON_RAMP_SLIGHT_RIGHT /* 14 */:
                return ((kuz) this.a).a();
            case androidx.car.app.navigation.model.Maneuver.TYPE_ON_RAMP_NORMAL_LEFT /* 15 */:
                return ((kuz) this.a).a();
            case 16:
                return ((kuz) this.a).a();
            case androidx.car.app.navigation.model.Maneuver.TYPE_ON_RAMP_SHARP_LEFT /* 17 */:
                return ((kuz) this.a).a();
            case androidx.car.app.navigation.model.Maneuver.TYPE_ON_RAMP_SHARP_RIGHT /* 18 */:
                return ((zjm) this.a).g().isPresent();
            case androidx.car.app.navigation.model.Maneuver.TYPE_ON_RAMP_U_TURN_LEFT /* 19 */:
                return ((lbw) this.a).a();
            default:
                return ((lbw) this.a).a();
        }
        return false;
    }
}
