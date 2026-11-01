package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes.dex */
public final class akqx implements defpackage.alai {
    private final /* synthetic */ int $cid;
    public static final defpackage.alai q = new defpackage.akqx(16);
    public static final defpackage.alai p = new defpackage.akqx(15);
    public static final defpackage.alai o = new defpackage.akqx(14);
    public static final defpackage.alai n = new defpackage.akqx(13);
    public static final defpackage.alai m = new defpackage.akqx(12);
    public static final defpackage.alai l = new defpackage.akqx(11);
    public static final defpackage.alai k = new defpackage.akqx(10);
    public static final defpackage.alai j = new defpackage.akqx(9);
    public static final defpackage.alai i = new defpackage.akqx(8);
    public static final defpackage.alai h = new defpackage.akqx(7);
    static final defpackage.alai g = new defpackage.akqx(6);
    static final defpackage.alai f = new defpackage.akqx(5);
    static final defpackage.alai e = new defpackage.akqx(4);
    static final defpackage.alai d = new defpackage.akqx(3);
    static final defpackage.alai c = new defpackage.akqx(2);
    public static final defpackage.alai b = new defpackage.akqx(1);
    static final defpackage.alai a = new defpackage.akqx(0);

    private akqx(int i2) {
        this.$cid = i2;
    }

    @Override // defpackage.alai
    public final boolean a(int i2) {
        defpackage.akro akroVar;
        switch (this.$cid) {
            case 0:
                switch (i2) {
                    case 0:
                    case 1:
                    case 2:
                    case 3:
                    case 5:
                    case defpackage.eft.STRING_SET_FIELD_NUMBER /* 6 */:
                    case defpackage.eft.DOUBLE_FIELD_NUMBER /* 7 */:
                    case defpackage.eft.BYTES_FIELD_NUMBER /* 8 */:
                    case 10:
                    case 11:
                    case 12:
                        return true;
                    case 4:
                    case 9:
                    default:
                        return false;
                }
            case 1:
            case 12:
                return defpackage.a.aw(i2);
            case 2:
                switch (i2) {
                    case 0:
                        akroVar = defpackage.akro.DEFAULT;
                        break;
                    case 1:
                        akroVar = defpackage.akro.TV;
                        break;
                    case 2:
                        akroVar = defpackage.akro.WEARABLE;
                        break;
                    case 3:
                        akroVar = defpackage.akro.AUTOMOTIVE;
                        break;
                    case 4:
                        akroVar = defpackage.akro.BATTLESTAR;
                        break;
                    case 5:
                        akroVar = defpackage.akro.CHROME_OS;
                        break;
                    case defpackage.eft.STRING_SET_FIELD_NUMBER /* 6 */:
                        akroVar = defpackage.akro.DESKTOP_ANDROID;
                        break;
                    case defpackage.eft.DOUBLE_FIELD_NUMBER /* 7 */:
                        akroVar = defpackage.akro.XR;
                        break;
                    case defpackage.eft.BYTES_FIELD_NUMBER /* 8 */:
                        akroVar = defpackage.akro.XR_PERIPHERAL;
                        break;
                    default:
                        akroVar = null;
                        break;
                }
                return akroVar != null;
            case 3:
                return defpackage.akrp.b(i2) != null;
            case 4:
                return defpackage.akrq.b(i2) != null;
            case 5:
                return defpackage.akrr.b(i2) != null;
            case defpackage.eft.STRING_SET_FIELD_NUMBER /* 6 */:
            case 10:
                return defpackage.a.ay(i2);
            case defpackage.eft.DOUBLE_FIELD_NUMBER /* 7 */:
                return defpackage.aksr.b(i2) != null;
            case defpackage.eft.BYTES_FIELD_NUMBER /* 8 */:
                return defpackage.akti.b(i2) != null;
            case 9:
                return defpackage.amnq.b(i2) != null;
            case 11:
                switch (i2) {
                    case 0:
                    case 1:
                    case 2:
                    case 3:
                    case 4:
                    case 5:
                    case defpackage.eft.STRING_SET_FIELD_NUMBER /* 6 */:
                    case defpackage.eft.DOUBLE_FIELD_NUMBER /* 7 */:
                    case defpackage.eft.BYTES_FIELD_NUMBER /* 8 */:
                    case 9:
                    case 11:
                    case 12:
                    case 13:
                    case 14:
                        return true;
                    case 10:
                    default:
                        return false;
                }
            case 13:
            case 14:
                return defpackage.a.av(i2);
            case 15:
                return defpackage.a.az(i2);
            default:
                return defpackage.a.aC(i2);
        }
    }
}
