package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes.dex */
public final /* synthetic */ class vkl implements defpackage.aoin {
    private final /* synthetic */ int $cid;

    public /* synthetic */ vkl(int i) {
        this.$cid = i;
    }

    @Override // defpackage.aoin, defpackage.aoim
    public final java.lang.Object a() {
        switch (this.$cid) {
            case 0:
            case 2:
            case 3:
            case 4:
            case defpackage.eft.STRING_SET_FIELD_NUMBER /* 6 */:
            case defpackage.eft.BYTES_FIELD_NUMBER /* 8 */:
            case 13:
                return defpackage.vcs.VVM3;
            case 1:
                return defpackage.vcs.OMTP_1_3;
            case 5:
            case defpackage.eft.DOUBLE_FIELD_NUMBER /* 7 */:
            case 9:
            case 10:
            case 11:
            case 12:
            case 14:
                return defpackage.vcs.VVM3_MVNO;
            case 15:
                return java.lang.Boolean.TRUE;
            case 16:
                return akhi.a;
            case 17:
                return aksc.a;
            case 18:
                return akhl.a;
            case 19:
                return akhg.a;
            default:
                java.lang.String strA = defpackage.ahdl.c.a();
                defpackage.aooh.e(strA, "get(...)");
                return java.lang.Long.valueOf(java.lang.Long.parseLong(strA));
        }
    }
}
