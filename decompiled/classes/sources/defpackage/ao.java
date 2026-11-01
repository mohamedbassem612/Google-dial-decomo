package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes.dex */
final class ao extends defpackage.av {
    final /* synthetic */ java.util.concurrent.atomic.AtomicReference a;
    final /* synthetic */ defpackage.or b;
    final /* synthetic */ defpackage.oi c;
    final /* synthetic */ defpackage.aw d;
    final /* synthetic */ defpackage.apnt e;

    public ao(defpackage.aw awVar, defpackage.apnt apntVar, java.util.concurrent.atomic.AtomicReference atomicReference, defpackage.or orVar, defpackage.oi oiVar) {
        this.e = apntVar;
        this.a = atomicReference;
        this.b = orVar;
        this.c = oiVar;
        this.d = awVar;
    }

    /* JADX WARN: Type inference failed for: r3v0, types: [bd, oo] */
    @Override // defpackage.av
    public final void a() {
        java.lang.StringBuilder sb = new java.lang.StringBuilder("fragment_");
        defpackage.aw awVar = this.d;
        sb.append(awVar.l);
        sb.append("_rq#");
        sb.append(awVar.ag.getAndIncrement());
        java.lang.String string = sb.toString();
        defpackage.aw awVar2 = (defpackage.aw) this.e.a;
        ?? r3 = awVar2.C;
        this.a.set((r3 instanceof defpackage.oo ? r3.d() : awVar2.H().g).b(string, awVar, this.b, this.c));
    }
}
