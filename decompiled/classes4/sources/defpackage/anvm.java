package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes4.dex */
final class anvm extends defpackage.anwe {
    final /* synthetic */ defpackage.anvn a;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public anvm(defpackage.anvn anvnVar) {
        super(anvnVar.b.e);
        j$.util.Objects.requireNonNull(anvnVar);
        this.a = anvnVar;
    }

    @Override // defpackage.anwe
    public final void a() {
        int i = defpackage.aoik.a;
        defpackage.anvn anvnVar = this.a;
        if (anvnVar.a == null) {
            try {
                anvnVar.c.e();
            } catch (java.lang.Throwable th) {
                this.a.b(anqw.c.e(th).f("Failed to call onReady."));
            }
        }
    }
}
