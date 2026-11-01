package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes2.dex */
public final class nww implements alai {
    private final /* synthetic */ int $cid;
    public static final alai u = new defpackage.nww(20);
    public static final alai t = new defpackage.nww(19);
    public static final alai s = new defpackage.nww(18);
    public static final alai r = new defpackage.nww(17);
    public static final alai q = new defpackage.nww(16);
    public static final alai p = new defpackage.nww(15);
    public static final alai o = new defpackage.nww(14);
    public static final alai n = new defpackage.nww(13);
    public static final alai m = new defpackage.nww(12);
    public static final alai l = new defpackage.nww(11);
    public static final alai k = new defpackage.nww(10);
    public static final alai j = new defpackage.nww(9);
    public static final alai i = new defpackage.nww(8);
    public static final alai h = new defpackage.nww(7);
    public static final alai g = new defpackage.nww(6);
    public static final alai f = new defpackage.nww(5);
    public static final alai e = new defpackage.nww(4);
    public static final alai d = new defpackage.nww(3);
    public static final alai c = new defpackage.nww(2);
    public static final alai b = new defpackage.nww(1);
    public static final alai a = new defpackage.nww(0);

    private nww(int i2) {
        this.$cid = i2;
    }

    public final boolean a(int i2) {
        switch (this.$cid) {
            case 0:
                if (defpackage.nwx.b(i2) != null) {
                    return true;
                }
                break;
            case 1:
                if (nwv.b(i2) != null) {
                    return true;
                }
                break;
            case 2:
                if (mni.ad(i2) != 0) {
                    return true;
                }
                break;
            case 3:
            case 6:
            case 11:
            case androidx.car.app.navigation.model.Maneuver.TYPE_ON_RAMP_SLIGHT_RIGHT /* 14 */:
            case 16:
                return a.aw(i2);
            case 4:
                if (defpackage.obi.b(i2) != null) {
                    return true;
                }
                break;
            case 5:
                if (a.aN(i2) != 0) {
                    return true;
                }
                break;
            case 7:
                if (defpackage.oqt.b(i2) != null) {
                    return true;
                }
                break;
            case 8:
            case 10:
                return a.av(i2);
            case 9:
                return a.az(i2);
            case 12:
                if (pzp.b(i2) != null) {
                    return true;
                }
                break;
            case androidx.car.app.navigation.model.Maneuver.TYPE_ON_RAMP_SLIGHT_LEFT /* 13 */:
                if (qbc.b(i2) != null) {
                    return true;
                }
                break;
            case androidx.car.app.navigation.model.Maneuver.TYPE_ON_RAMP_NORMAL_LEFT /* 15 */:
                if (qtr.b(i2) != null) {
                    return true;
                }
                break;
            case androidx.car.app.navigation.model.Maneuver.TYPE_ON_RAMP_SHARP_LEFT /* 17 */:
                if (pez.bX(i2) != 0) {
                    return true;
                }
                break;
            case androidx.car.app.navigation.model.Maneuver.TYPE_ON_RAMP_SHARP_RIGHT /* 18 */:
                if (que.b(i2) != null) {
                    return true;
                }
                break;
            case androidx.car.app.navigation.model.Maneuver.TYPE_ON_RAMP_U_TURN_LEFT /* 19 */:
                if (qug.b(i2) != null) {
                    return true;
                }
                break;
            default:
                return a.aB(i2);
        }
        return false;
    }
}
