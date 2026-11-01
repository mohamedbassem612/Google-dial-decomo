package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes.dex */
public final class gbs implements defpackage.aomy {
    private final /* synthetic */ int $cid;
    public static final defpackage.gbs c = new defpackage.gbs(2);
    public static final defpackage.gbs b = new defpackage.gbs(1);
    public static final defpackage.gbs a = new defpackage.gbs(0);

    public gbs(int i) {
        this.$cid = i;
    }

    @Override // defpackage.aomy
    public final /* synthetic */ java.lang.Object a() {
        int i = this.$cid;
        if (i == 0) {
            return null;
        }
        if (i == 1) {
            return new defpackage.cqg(-72057594037927936L);
        }
        throw new java.lang.IllegalStateException("Should not be called");
    }
}
