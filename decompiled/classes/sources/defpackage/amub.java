package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes.dex */
public final class amub implements defpackage.alai {
    private final /* synthetic */ int $cid;
    public static final defpackage.alai u = new defpackage.amub(20);
    public static final defpackage.alai t = new defpackage.amub(19);
    public static final defpackage.alai s = new defpackage.amub(18);
    public static final defpackage.alai r = new defpackage.amub(17);
    public static final defpackage.alai q = new defpackage.amub(16);
    public static final defpackage.alai p = new defpackage.amub(15);
    public static final defpackage.alai o = new defpackage.amub(14);
    public static final defpackage.alai n = new defpackage.amub(13);
    public static final defpackage.alai m = new defpackage.amub(12);
    public static final defpackage.alai l = new defpackage.amub(11);
    public static final defpackage.alai k = new defpackage.amub(10);
    public static final defpackage.alai j = new defpackage.amub(9);
    public static final defpackage.alai i = new defpackage.amub(8);
    public static final defpackage.alai h = new defpackage.amub(7);
    public static final defpackage.alai g = new defpackage.amub(6);
    public static final defpackage.alai f = new defpackage.amub(5);
    public static final defpackage.alai e = new defpackage.amub(4);
    public static final defpackage.alai d = new defpackage.amub(3);
    public static final defpackage.alai c = new defpackage.amub(2);
    public static final defpackage.alai b = new defpackage.amub(1);
    static final defpackage.alai a = new defpackage.amub(0);

    private amub(int i2) {
        this.$cid = i2;
    }

    @Override // defpackage.alai
    public final boolean a(int i2) {
        defpackage.apgc apgcVar;
        switch (this.$cid) {
            case 0:
                if (defpackage.a.aD(i2) != 0) {
                    return true;
                }
                break;
            case 1:
            case 14:
                return defpackage.a.az(i2);
            case 2:
                if (defpackage.a.ah(i2) != 0) {
                    return true;
                }
                break;
            case 3:
                if (defpackage.aoog.h(i2) != 0) {
                    return true;
                }
                break;
            case 4:
            case 5:
            case 19:
                return defpackage.a.ax(i2);
            case defpackage.eft.STRING_SET_FIELD_NUMBER /* 6 */:
                if (defpackage.aoog.g(i2) != 0) {
                    return true;
                }
                break;
            case defpackage.eft.DOUBLE_FIELD_NUMBER /* 7 */:
                return defpackage.a.aB(i2);
            case defpackage.eft.BYTES_FIELD_NUMBER /* 8 */:
            case 13:
            case 15:
                return defpackage.a.av(i2);
            case 9:
                return defpackage.a.aA(i2);
            case 10:
                if (defpackage.a.aX(i2) != 0) {
                    return true;
                }
                break;
            case 11:
            case 12:
            case 16:
                return defpackage.a.aw(i2);
            case 17:
            default:
                return defpackage.a.ay(i2);
            case 18:
                switch (i2) {
                    case 0:
                        apgcVar = defpackage.apgc.UNKNOWN_HARDWARE_VARIANT;
                        break;
                    case 1:
                        apgcVar = defpackage.apgc.PHONE_OR_TABLET;
                        break;
                    case 2:
                        apgcVar = defpackage.apgc.WATCH;
                        break;
                    case 3:
                        apgcVar = defpackage.apgc.LEANBACK;
                        break;
                    case 4:
                        apgcVar = defpackage.apgc.AUTOMOTIVE;
                        break;
                    case 5:
                        apgcVar = defpackage.apgc.DESKTOP;
                        break;
                    case defpackage.eft.STRING_SET_FIELD_NUMBER /* 6 */:
                        apgcVar = defpackage.apgc.XR;
                        break;
                    default:
                        apgcVar = null;
                        break;
                }
                if (apgcVar != null) {
                    return true;
                }
                break;
        }
        return false;
    }
}
