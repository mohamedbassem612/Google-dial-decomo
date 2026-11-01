package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes2.dex */
public final class llm implements alai {
    private final /* synthetic */ int $cid;
    public static final alai u = new defpackage.llm(20);
    public static final alai t = new defpackage.llm(19);
    public static final alai s = new defpackage.llm(18);
    public static final alai r = new defpackage.llm(17);
    public static final alai q = new defpackage.llm(16);
    public static final alai p = new defpackage.llm(15);
    public static final alai o = new defpackage.llm(14);
    public static final alai n = new defpackage.llm(13);
    public static final alai m = new defpackage.llm(12);
    public static final alai l = new defpackage.llm(11);
    public static final alai k = new defpackage.llm(10);
    public static final alai j = new defpackage.llm(9);
    public static final alai i = new defpackage.llm(8);
    public static final alai h = new defpackage.llm(7);
    public static final alai g = new defpackage.llm(6);
    public static final alai f = new defpackage.llm(5);
    public static final alai e = new defpackage.llm(4);
    public static final alai d = new defpackage.llm(3);
    public static final alai c = new defpackage.llm(2);
    public static final alai b = new defpackage.llm(1);
    public static final alai a = new defpackage.llm(0);

    private llm(int i2) {
        this.$cid = i2;
    }

    public final boolean a(int i2) {
        defpackage.nvq nvqVar = null;
        switch (this.$cid) {
            case 0:
                return defpackage.lln.b(i2) != null;
            case 1:
                return defpackage.lll.b(i2) != null;
            case 2:
                return defpackage.miv.b(i2) != null;
            case 3:
                return defpackage.miy.b(i2) != null;
            case 4:
                return a.ay(i2);
            case 5:
                if (i2 == 0) {
                    nvqVar = mnm.a;
                } else if (i2 == 1) {
                    nvqVar = mnm.b;
                } else if (i2 == 2) {
                    nvqVar = mnm.c;
                }
                return nvqVar != null;
            case 6:
                return a.ab(i2) != 0;
            case 7:
                if (i2 == 0) {
                    return true;
                }
                switch (i2) {
                    case 2:
                    case 3:
                    case 4:
                    case 5:
                    case 6:
                    case 7:
                        return true;
                    default:
                        return false;
                }
            case 8:
            case androidx.car.app.navigation.model.Maneuver.TYPE_ON_RAMP_SHARP_RIGHT /* 18 */:
                return a.aL(i2);
            case 9:
                switch (i2) {
                    case 0:
                    case 1:
                    case 2:
                    case 3:
                    case 4:
                    case 5:
                    case 6:
                    case 7:
                    case 8:
                        return true;
                    default:
                        return false;
                }
            case 10:
                return a.aK(i2);
            case 11:
                switch (i2) {
                    case 0:
                    case 1:
                    case 2:
                    case 3:
                    case 4:
                    case 5:
                    case 6:
                    case 7:
                    case 8:
                    case 9:
                        return true;
                    default:
                        return false;
                }
            case 12:
                return defpackage.nvp.b(i2) != null;
            case androidx.car.app.navigation.model.Maneuver.TYPE_ON_RAMP_SLIGHT_LEFT /* 13 */:
                return a.aw(i2);
            case androidx.car.app.navigation.model.Maneuver.TYPE_ON_RAMP_SLIGHT_RIGHT /* 14 */:
                switch (i2) {
                    case 0:
                    case 1:
                    case 2:
                    case 3:
                    case 4:
                    case 5:
                    case 6:
                    case 7:
                    case 9:
                    case 10:
                    case 11:
                    case 12:
                    case androidx.car.app.navigation.model.Maneuver.TYPE_ON_RAMP_SLIGHT_LEFT /* 13 */:
                    case androidx.car.app.navigation.model.Maneuver.TYPE_ON_RAMP_SLIGHT_RIGHT /* 14 */:
                    case androidx.car.app.navigation.model.Maneuver.TYPE_ON_RAMP_NORMAL_LEFT /* 15 */:
                        return true;
                    case 8:
                    default:
                        return false;
                }
            case androidx.car.app.navigation.model.Maneuver.TYPE_ON_RAMP_NORMAL_LEFT /* 15 */:
                if (i2 == 0) {
                    nvqVar = defpackage.nvq.PROTECTION_LEVEL_UNSPECIFIED;
                } else if (i2 == 1) {
                    nvqVar = defpackage.nvq.PROTECTION_LEVEL_BASIC;
                } else if (i2 == 2) {
                    nvqVar = defpackage.nvq.PROTECTION_LEVEL_MEDIUM;
                } else if (i2 == 3) {
                    nvqVar = defpackage.nvq.PROTECTION_LEVEL_MAXIMUM;
                }
                return nvqVar != null;
            case 16:
                return a.aG(i2);
            case androidx.car.app.navigation.model.Maneuver.TYPE_ON_RAMP_SHARP_LEFT /* 17 */:
                return a.aN(i2) != 0;
            case androidx.car.app.navigation.model.Maneuver.TYPE_ON_RAMP_U_TURN_LEFT /* 19 */:
            default:
                return a.aI(i2);
        }
    }
}
