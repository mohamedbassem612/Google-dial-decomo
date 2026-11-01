package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes.dex */
public final class aos implements defpackage.crd {
    private final /* synthetic */ int $cid;
    public static final defpackage.aos b = new defpackage.aos(1);
    public static final defpackage.aos a = new defpackage.aos(0);

    private aos(int i) {
        this.$cid = i;
    }

    @Override // defpackage.crd
    public final defpackage.cqx a(long j, defpackage.dpq dpqVar, defpackage.dpf dpfVar) {
        if (this.$cid == 0) {
            float fDp = dpfVar.dp(30.0f);
            return new defpackage.cqv(new defpackage.cpn(-fDp, 0.0f, java.lang.Float.intBitsToFloat((int) (j >> 32)) + fDp, java.lang.Float.intBitsToFloat((int) (j & 4294967295L))));
        }
        float fDp2 = dpfVar.dp(30.0f);
        return new defpackage.cqv(new defpackage.cpn(0.0f, -fDp2, java.lang.Float.intBitsToFloat((int) (j >> 32)), java.lang.Float.intBitsToFloat((int) (j & 4294967295L)) + fDp2));
    }
}
