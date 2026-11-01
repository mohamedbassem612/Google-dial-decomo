package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes3.dex */
public final /* synthetic */ class aena implements java.lang.Runnable {
    public final /* synthetic */ ajdd a;
    public final /* synthetic */ aadh b;

    public /* synthetic */ aena(ajdd ajddVar, aadh aadhVar) {
        this.a = ajddVar;
        this.b = aadhVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        if (this.a.isCancelled()) {
            this.b.e();
        }
    }
}
