package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes4.dex */
final class aock extends defpackage.anwe {
    final /* synthetic */ defpackage.aodl a;
    final /* synthetic */ defpackage.aocm b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public aock(defpackage.aocm aocmVar, defpackage.aodl aodlVar) {
        super(aocmVar.a);
        this.a = aodlVar;
        j$.util.Objects.requireNonNull(aocmVar);
        this.b = aocmVar;
    }

    @Override // defpackage.anwe
    public final void a() {
        try {
            int i = defpackage.aoik.a;
            this.b.c().d(this.a);
        } catch (java.lang.Throwable th) {
            this.b.f(th);
            throw th;
        }
    }
}
