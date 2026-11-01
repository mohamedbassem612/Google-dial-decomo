package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes2.dex */
final class aima implements defpackage.aimm {
    int a = 0;
    final /* synthetic */ aijo b;

    public aima(aijo aijoVar) {
        this.b = aijoVar;
    }

    @Override // defpackage.aimm
    public final void a(java.lang.Object obj) {
        aicv aicvVar = this.b;
        if (aicvVar.contains(obj)) {
            return;
        }
        int i = this.a + 1;
        this.a = i;
        ahvr.bC(i, "count");
        int iG = i == 0 ? aicvVar.a.g(obj) : aicvVar.a.f(obj, i);
        aicvVar.b += (long) (i - iG);
    }
}
