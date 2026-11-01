package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes3.dex */
public final class xml implements defpackage.xhf {
    private final /* synthetic */ int $cid;
    public static final defpackage.xml b = new defpackage.xml(1);
    public static final defpackage.xml a = new defpackage.xml(0);

    public xml(int i) {
        this.$cid = i;
    }

    @Override // defpackage.xhf
    public final /* synthetic */ java.lang.Object b(java.lang.Object obj) {
        if (this.$cid != 0) {
            aooh.f((android.os.PersistableBundle) obj, "it");
            throw new java.lang.IllegalStateException("Resolved access not permitted!");
        }
        aooh.f((android.os.PersistableBundle) obj, "it");
        throw new java.lang.IllegalStateException("No Result provided");
    }
}
