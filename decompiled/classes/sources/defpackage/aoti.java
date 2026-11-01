package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes.dex */
final class aoti implements defpackage.aotj {
    private final java.util.concurrent.Future a;

    public aoti(java.util.concurrent.Future future) {
        this.a = future;
    }

    @Override // defpackage.aotj
    public final void fz() {
        this.a.cancel(false);
    }

    public final java.lang.String toString() {
        return "DisposableFutureHandle[" + this.a + ']';
    }
}
