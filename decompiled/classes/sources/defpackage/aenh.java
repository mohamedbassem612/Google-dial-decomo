package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes.dex */
public final /* synthetic */ class aenh implements defpackage.aoin {
    private final /* synthetic */ int $cid;

    public /* synthetic */ aenh(int i) {
        this.$cid = i;
    }

    @Override // defpackage.aoin, defpackage.aoim
    public final java.lang.Object a() {
        switch (this.$cid) {
            case 0:
                return defpackage.aeui.d().a();
            case 1:
                java.util.concurrent.TimeUnit timeUnit = java.util.concurrent.TimeUnit.MINUTES;
                java.util.concurrent.TimeUnit timeUnit2 = java.util.concurrent.TimeUnit.SECONDS;
                return new defpackage.aesv(2, 320000L, defpackage.aikn.a);
            case 2:
                defpackage.aetm aetmVarD = defpackage.aetn.d();
                aetmVarD.d = 2;
                return aetmVarD.a();
            case 3:
                defpackage.aeul aeulVarD = defpackage.aeum.d();
                aeulVarD.d = 2;
                return aeulVarD.a();
            case 4:
                defpackage.aeus aeusVarD = defpackage.aeuu.d();
                aeusVarD.c = 2;
                return aeusVarD.a();
            case 5:
                defpackage.aerf aerfVarD = defpackage.aerg.d();
                aerfVarD.d = 2;
                return aerfVarD.a();
            case defpackage.eft.STRING_SET_FIELD_NUMBER /* 6 */:
                return new defpackage.aerc(null);
            case defpackage.eft.DOUBLE_FIELD_NUMBER /* 7 */:
                return defpackage.ahbc.a;
            case defpackage.eft.BYTES_FIELD_NUMBER /* 8 */:
                return defpackage.aikn.a;
            case 9:
                return defpackage.aoke.a;
            default:
                return defpackage.aify.p(new akay());
        }
    }
}
