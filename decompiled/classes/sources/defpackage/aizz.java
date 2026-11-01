package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes.dex */
final class aizz {
    static final defpackage.aizz a = new defpackage.aizz();
    final java.lang.Runnable b;
    final java.util.concurrent.Executor c;
    defpackage.aizz next;

    public aizz() {
        this.b = null;
        this.c = null;
    }

    public aizz(java.lang.Runnable runnable, java.util.concurrent.Executor executor) {
        this.b = runnable;
        this.c = executor;
    }
}
