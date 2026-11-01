package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes.dex */
public final class uzl implements defpackage.alai {
    private final /* synthetic */ int $cid;
    public static final defpackage.alai u = new defpackage.uzl(20);
    public static final defpackage.alai t = new defpackage.uzl(19);
    public static final defpackage.alai s = new defpackage.uzl(18);
    public static final defpackage.alai r = new defpackage.uzl(17);
    public static final defpackage.alai q = new defpackage.uzl(16);
    public static final defpackage.alai p = new defpackage.uzl(15);
    public static final defpackage.alai o = new defpackage.uzl(14);
    public static final defpackage.alai n = new defpackage.uzl(13);
    public static final defpackage.alai m = new defpackage.uzl(12);
    public static final defpackage.alai l = new defpackage.uzl(11);
    public static final defpackage.alai k = new defpackage.uzl(10);
    public static final defpackage.alai j = new defpackage.uzl(9);
    public static final defpackage.alai i = new defpackage.uzl(8);
    public static final defpackage.alai h = new defpackage.uzl(7);
    public static final defpackage.alai g = new defpackage.uzl(6);
    public static final defpackage.alai f = new defpackage.uzl(5);
    public static final defpackage.alai e = new defpackage.uzl(4);
    public static final defpackage.alai d = new defpackage.uzl(3);
    public static final defpackage.alai c = new defpackage.uzl(2);
    public static final defpackage.alai b = new defpackage.uzl(1);
    static final defpackage.alai a = new defpackage.uzl(0);

    private uzl(int i2) {
        this.$cid = i2;
    }

    @Override // defpackage.alai
    public final boolean a(int i2) {
        wgw wgwVar;
        switch (this.$cid) {
            case 0:
                return uzm.b(i2) != null;
            case 1:
                return uty.b(i2) != null;
            case 2:
                return vbs.b(i2) != null;
            case 3:
                return vbw.b(i2) != null;
            case 4:
                return vbx.b(i2) != null;
            case 5:
            case 15:
                return defpackage.a.aw(i2);
            case defpackage.eft.STRING_SET_FIELD_NUMBER /* 6 */:
                return defpackage.a.aA(i2);
            case defpackage.eft.DOUBLE_FIELD_NUMBER /* 7 */:
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
                    case 10:
                    case 11:
                    case 12:
                    case 13:
                    case 14:
                    case 15:
                    case 16:
                    case 17:
                    case 18:
                    case 19:
                    case 20:
                    case 21:
                    case 22:
                    case 23:
                    case 24:
                    case 25:
                    case 26:
                    case 27:
                    case 28:
                    case 29:
                    case 30:
                    case 31:
                    case 32:
                    case 33:
                    case 34:
                    case 35:
                    case 36:
                    case 37:
                        return true;
                    default:
                        return false;
                }
            case defpackage.eft.BYTES_FIELD_NUMBER /* 8 */:
                if (i2 == 0) {
                    wgwVar = wgw.a;
                } else if (i2 == 1) {
                    wgwVar = wgw.b;
                } else if (i2 == 2) {
                    wgwVar = wgw.c;
                } else if (i2 == 3) {
                    wgwVar = wgw.d;
                } else if (i2 != 4) {
                    wgwVar = i2 != 5 ? null : wgw.f;
                } else {
                    wgwVar = wgw.e;
                }
                return wgwVar != null;
            case 9:
                return wha.b(i2) != null;
            case 10:
                return defpackage.a.av(i2);
            case 11:
                return defpackage.wsc.U(i2) != 0;
            case 12:
                return whe.b(i2) != null;
            case 13:
                return defpackage.wsc.O(i2) != 0;
            case 14:
                return wmv.b(i2) != null;
            case 16:
                return wne.b(i2) != null;
            case 17:
                return wow.b(i2) != null;
            case 18:
                return wpt.b(i2) != null;
            case 19:
                return wpu.b(i2) != null;
            default:
                return wpw.b(i2) != null;
        }
    }
}
