package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes3.dex */
final class adbj implements ajcb {
    final /* synthetic */ long a;
    final /* synthetic */ adbk b;
    final /* synthetic */ int c;
    final /* synthetic */ akzx d;

    public adbj(adbk adbkVar, int i, akzx akzxVar, long j) {
        this.c = i;
        this.d = akzxVar;
        this.a = j;
        j$.util.Objects.requireNonNull(adbkVar);
        this.b = adbkVar;
    }

    public final void a(java.lang.Throwable th) {
        adbe.g(th, "%s: failure when sampling log!", new java.lang.Object[]{"MddEventLogger"});
    }

    public final /* bridge */ /* synthetic */ void b(java.lang.Object obj) {
        ahyn ahynVar = (ahyn) obj;
        if (ahynVar.f()) {
            this.b.r(this.c, this.d, this.a, (aixg) ahynVar.b());
        }
    }
}
