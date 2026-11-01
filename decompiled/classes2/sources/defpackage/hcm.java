package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes2.dex */
final class hcm implements defpackage.gzu {
    final /* synthetic */ aosb a;

    public hcm(aosb aosbVar) {
        this.a = aosbVar;
    }

    @Override // defpackage.gzu
    public final /* bridge */ /* synthetic */ void a(java.lang.Object obj) {
        aosb aosbVar = this.a;
        java.lang.Throwable th = (java.lang.Throwable) obj;
        if (aosbVar.i()) {
            return;
        }
        aooh.c(th);
        aosbVar.w(aooc.ae(th));
    }
}
