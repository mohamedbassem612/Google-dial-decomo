package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes4.dex */
abstract class anwe implements java.lang.Runnable {
    private final defpackage.anmv a;

    protected anwe(defpackage.anmv anmvVar) {
        this.a = anmvVar;
    }

    public abstract void a();

    @Override // java.lang.Runnable
    public final void run() {
        defpackage.anmv anmvVarA = this.a.a();
        try {
            a();
        } finally {
            this.a.f(anmvVarA);
        }
    }
}
