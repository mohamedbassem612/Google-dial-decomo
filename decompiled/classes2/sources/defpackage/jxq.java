package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes2.dex */
public final class jxq implements alai {
    private final /* synthetic */ int $cid;
    public static final alai u = new defpackage.jxq(20);
    public static final alai t = new defpackage.jxq(19);
    public static final alai s = new defpackage.jxq(18);
    public static final alai r = new defpackage.jxq(17);
    public static final alai q = new defpackage.jxq(16);
    public static final alai p = new defpackage.jxq(15);
    public static final alai o = new defpackage.jxq(14);
    public static final alai n = new defpackage.jxq(13);
    public static final alai m = new defpackage.jxq(12);
    public static final alai l = new defpackage.jxq(11);
    public static final alai k = new defpackage.jxq(10);
    public static final alai j = new defpackage.jxq(9);
    public static final alai i = new defpackage.jxq(8);
    public static final alai h = new defpackage.jxq(7);
    public static final alai g = new defpackage.jxq(6);
    public static final alai f = new defpackage.jxq(5);
    public static final alai e = new defpackage.jxq(4);
    public static final alai d = new defpackage.jxq(3);
    public static final alai c = new defpackage.jxq(2);
    public static final alai b = new defpackage.jxq(1);
    static final alai a = new defpackage.jxq(0);

    private jxq(int i2) {
        this.$cid = i2;
    }

    public final boolean a(int i2) {
        switch (this.$cid) {
            case 0:
                if (defpackage.jxr.b(i2) != null) {
                    return true;
                }
                break;
            case 1:
                if (defpackage.jxd.b(i2) != null) {
                    return true;
                }
                break;
            case 2:
            case androidx.car.app.navigation.model.Maneuver.TYPE_ON_RAMP_SLIGHT_LEFT /* 13 */:
            case androidx.car.app.navigation.model.Maneuver.TYPE_ON_RAMP_SLIGHT_RIGHT /* 14 */:
            case androidx.car.app.navigation.model.Maneuver.TYPE_ON_RAMP_SHARP_LEFT /* 17 */:
            default:
                return a.aw(i2);
            case 3:
                if (kit.b(i2) != null) {
                    return true;
                }
                break;
            case 4:
                if (defpackage.hgu.w(i2) != 0) {
                    return true;
                }
                break;
            case 5:
                if (a.aQ(i2) != 0) {
                    return true;
                }
                break;
            case 6:
                if (defpackage.kqz.b(i2) != null) {
                    return true;
                }
                break;
            case 7:
                if (defpackage.kun.b(i2) != null) {
                    return true;
                }
                break;
            case 8:
                if (defpackage.kwx.b(i2) != null) {
                    return true;
                }
                break;
            case 9:
                if (defpackage.lba.b(i2) != null) {
                    return true;
                }
                break;
            case 10:
                if (defpackage.lbb.b(i2) != null) {
                    return true;
                }
                break;
            case 11:
            case 12:
                return a.av(i2);
            case androidx.car.app.navigation.model.Maneuver.TYPE_ON_RAMP_NORMAL_LEFT /* 15 */:
                return a.aA(i2);
            case 16:
                if (anar.l(i2) != 0) {
                    return true;
                }
                break;
            case androidx.car.app.navigation.model.Maneuver.TYPE_ON_RAMP_SHARP_RIGHT /* 18 */:
                if (a.ah(i2) != 0) {
                    return true;
                }
                break;
            case androidx.car.app.navigation.model.Maneuver.TYPE_ON_RAMP_U_TURN_LEFT /* 19 */:
                return a.az(i2);
        }
        return false;
    }
}
