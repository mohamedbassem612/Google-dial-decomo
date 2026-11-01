package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes4.dex */
final class anvj extends defpackage.anwe {
    final /* synthetic */ anph a;
    final /* synthetic */ defpackage.anvn b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public anvj(defpackage.anvn anvnVar, anph anphVar) {
        super(anvnVar.b.e);
        this.a = anphVar;
        j$.util.Objects.requireNonNull(anvnVar);
        this.b = anvnVar;
    }

    @Override // defpackage.anwe
    public final void a() {
        int i = defpackage.aoik.a;
        defpackage.anvn anvnVar = this.b;
        if (anvnVar.a == null) {
            try {
                anvnVar.c.c(this.a);
            } catch (java.lang.Throwable th) {
                this.b.b(anqw.c.e(th).f("Failed to read headers"));
            }
        }
    }
}
