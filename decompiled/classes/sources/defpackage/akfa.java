package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes.dex */
final class akfa implements defpackage.akfd {
    private final /* synthetic */ int $cid;
    private final java.lang.Object a;

    public akfa(defpackage.akfb akfbVar, int i) {
        this.$cid = i;
        this.a = akfbVar.getMessage();
    }

    @Override // defpackage.akfd
    public final defpackage.akff a() {
        int i = this.$cid;
        if (i == 0) {
            throw new defpackage.akfc((java.lang.String) this.a);
        }
        java.lang.Object obj = this.a;
        if (i != 1) {
            return (defpackage.akff) obj;
        }
        throw new defpackage.akfb((java.lang.String) obj);
    }

    public akfa(defpackage.akff akffVar, int i) {
        this.$cid = i;
        this.a = akffVar;
    }

    public akfa(java.lang.IllegalArgumentException illegalArgumentException, int i) {
        this.$cid = i;
        this.a = illegalArgumentException.getMessage();
    }
}
