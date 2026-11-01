package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes.dex */
public final class udi implements defpackage.alai {
    private final /* synthetic */ int $cid;
    public static final defpackage.alai u = new defpackage.udi(20);
    public static final defpackage.alai t = new defpackage.udi(19);
    public static final defpackage.alai s = new defpackage.udi(18);
    public static final defpackage.alai r = new defpackage.udi(17);
    public static final defpackage.alai q = new defpackage.udi(16);
    public static final defpackage.alai p = new defpackage.udi(15);
    public static final defpackage.alai o = new defpackage.udi(14);
    public static final defpackage.alai n = new defpackage.udi(13);
    public static final defpackage.alai m = new defpackage.udi(12);
    public static final defpackage.alai l = new defpackage.udi(11);
    public static final defpackage.alai k = new defpackage.udi(10);
    public static final defpackage.alai j = new defpackage.udi(9);
    public static final defpackage.alai i = new defpackage.udi(8);
    public static final defpackage.alai h = new defpackage.udi(7);
    public static final defpackage.alai g = new defpackage.udi(6);
    public static final defpackage.alai f = new defpackage.udi(5);
    static final defpackage.alai e = new defpackage.udi(4);
    public static final defpackage.alai d = new defpackage.udi(3);
    public static final defpackage.alai c = new defpackage.udi(2);
    public static final defpackage.alai b = new defpackage.udi(1);
    public static final defpackage.alai a = new defpackage.udi(0);

    private udi(int i2) {
        this.$cid = i2;
    }

    @Override // defpackage.alai
    public final boolean a(int i2) {
        switch (this.$cid) {
            case 0:
                if (defpackage.a.aQ(i2) != 0) {
                    return true;
                }
                break;
            case 1:
                if (defpackage.rmx.b(i2) != null) {
                    return true;
                }
                break;
            case 2:
            case defpackage.eft.BYTES_FIELD_NUMBER /* 8 */:
            case 10:
            case 11:
            case 14:
            case 17:
                return defpackage.a.av(i2);
            case 3:
                if (defpackage.udj.b(i2) != null) {
                    return true;
                }
                break;
            case 4:
            case 16:
                return defpackage.a.aw(i2);
            case 5:
                if (defpackage.udk.b(i2) != null) {
                    return true;
                }
                break;
            case defpackage.eft.STRING_SET_FIELD_NUMBER /* 6 */:
                if (defpackage.a.aQ(i2) != 0) {
                    return true;
                }
                break;
            case defpackage.eft.DOUBLE_FIELD_NUMBER /* 7 */:
                return defpackage.a.ax(i2);
            case 9:
            case 18:
                return defpackage.a.az(i2);
            case 12:
                if (defpackage.agmi.a(i2) != 0) {
                    return true;
                }
                break;
            case 13:
                if (defpackage.agmn.b(i2) != null) {
                    return true;
                }
                break;
            case 15:
                if (defpackage.a.aQ(i2) != 0) {
                    return true;
                }
                break;
            case 19:
                if (defpackage.aiql.am(i2) != 0) {
                    return true;
                }
                break;
            default:
                if (defpackage.ajsw.b(i2) != null) {
                    return true;
                }
                break;
        }
        return false;
    }
}
