package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes4.dex */
final class aocl extends defpackage.anwe {
    final /* synthetic */ defpackage.aocm a;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public aocl(defpackage.aocm aocmVar) {
        super(aocmVar.a);
        j$.util.Objects.requireNonNull(aocmVar);
        this.a = aocmVar;
    }

    @Override // defpackage.anwe
    public final void a() {
        try {
            int i = defpackage.aoik.a;
            this.a.c().e();
        } catch (java.lang.Throwable th) {
            this.a.f(th);
            throw th;
        }
    }
}
