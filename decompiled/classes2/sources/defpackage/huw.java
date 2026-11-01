package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes2.dex */
public final class huw implements alai {
    private final /* synthetic */ int $cid;
    public static final alai u = new defpackage.huw(20);
    public static final alai t = new defpackage.huw(19);
    public static final alai s = new defpackage.huw(18);
    public static final alai r = new defpackage.huw(17);
    public static final alai q = new defpackage.huw(16);
    public static final alai p = new defpackage.huw(15);
    public static final alai o = new defpackage.huw(14);
    public static final alai n = new defpackage.huw(13);
    public static final alai m = new defpackage.huw(12);
    public static final alai l = new defpackage.huw(11);
    public static final alai k = new defpackage.huw(10);
    public static final alai j = new defpackage.huw(9);
    public static final alai i = new defpackage.huw(8);
    public static final alai h = new defpackage.huw(7);
    public static final alai g = new defpackage.huw(6);
    public static final alai f = new defpackage.huw(5);
    public static final alai e = new defpackage.huw(4);
    public static final alai d = new defpackage.huw(3);
    public static final alai c = new defpackage.huw(2);
    public static final alai b = new defpackage.huw(1);
    static final alai a = new defpackage.huw(0);

    private huw(int i2) {
        this.$cid = i2;
    }

    public final boolean a(int i2) {
        switch (this.$cid) {
            case 0:
                if (defpackage.hux.b(i2) != null) {
                    return true;
                }
                break;
            case 1:
                if (defpackage.hkw.b(i2) != null) {
                    return true;
                }
                break;
            case 2:
                if (defpackage.iec.b(i2) != null) {
                    return true;
                }
                break;
            case 3:
                if (defpackage.hhe.d(i2) != 0) {
                    return true;
                }
                break;
            case 4:
                if (defpackage.hhv.d(i2) != 0) {
                    return true;
                }
                break;
            case 5:
                if (a.aV(i2) != 0) {
                    return true;
                }
                break;
            case 6:
                if (a.aV(i2) != 0) {
                    return true;
                }
                break;
            case 7:
                if (defpackage.iht.b(i2) != null) {
                    return true;
                }
                break;
            case 8:
                if (defpackage.ihv.b(i2) != null) {
                    return true;
                }
                break;
            case 9:
                if (defpackage.inz.b(i2) != null) {
                    return true;
                }
                break;
            case 10:
            case 11:
            case androidx.car.app.navigation.model.Maneuver.TYPE_ON_RAMP_SLIGHT_LEFT /* 13 */:
            case androidx.car.app.navigation.model.Maneuver.TYPE_ON_RAMP_SHARP_RIGHT /* 18 */:
            case androidx.car.app.navigation.model.Maneuver.TYPE_ON_RAMP_U_TURN_LEFT /* 19 */:
                return a.av(i2);
            case 12:
                return a.aw(i2);
            case androidx.car.app.navigation.model.Maneuver.TYPE_ON_RAMP_SLIGHT_RIGHT /* 14 */:
                if (defpackage.jmu.b(i2) != null) {
                    return true;
                }
                break;
            case androidx.car.app.navigation.model.Maneuver.TYPE_ON_RAMP_NORMAL_LEFT /* 15 */:
                if (a.ag(i2) != 0) {
                    return true;
                }
                break;
            case 16:
                return a.ay(i2);
            case androidx.car.app.navigation.model.Maneuver.TYPE_ON_RAMP_SHARP_LEFT /* 17 */:
                if (defpackage.jvw.b(i2) != null) {
                    return true;
                }
                break;
            default:
                if (defpackage.hmr.e(i2) != 0) {
                    return true;
                }
                break;
        }
        return false;
    }
}
