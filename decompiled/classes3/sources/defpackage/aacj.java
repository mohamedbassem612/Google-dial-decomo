package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes3.dex */
final class aacj extends defpackage.aack {
    private final java.util.concurrent.Callable e;

    public aacj(java.util.concurrent.Callable callable) {
        super(false, null, null);
        this.e = callable;
    }

    @Override // defpackage.aack
    public final java.lang.String a() {
        try {
            return (java.lang.String) this.e.call();
        } catch (java.lang.Exception e) {
            throw new java.lang.RuntimeException(e);
        }
    }
}
