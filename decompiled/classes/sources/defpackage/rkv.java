package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes.dex */
public final /* synthetic */ class rkv implements defpackage.aoin {
    private final /* synthetic */ int $cid;

    public /* synthetic */ rkv(int i) {
        this.$cid = i;
    }

    @Override // defpackage.aoin, defpackage.aoim
    public final java.lang.Object a() {
        switch (this.$cid) {
            case 0:
                return java.lang.Boolean.TRUE;
            case 1:
                return defpackage.meg.c;
            case 2:
                return java.lang.Boolean.TRUE;
            case 3:
                return java.lang.Boolean.TRUE;
            case 4:
                return java.lang.Boolean.TRUE;
            case 5:
                return new defpackage.ttj();
            case defpackage.eft.STRING_SET_FIELD_NUMBER /* 6 */:
                return defpackage.meg.b;
            case defpackage.eft.DOUBLE_FIELD_NUMBER /* 7 */:
                return defpackage.meg.a;
            case defpackage.eft.BYTES_FIELD_NUMBER /* 8 */:
            case 9:
                return defpackage.vcs.UNKNOWN;
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
            default:
                return defpackage.vcs.ADVVM;
        }
    }
}
