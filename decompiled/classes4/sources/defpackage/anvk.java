package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes4.dex */
final class anvk extends defpackage.anwe {
    final /* synthetic */ defpackage.aodl a;
    final /* synthetic */ defpackage.anvn b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public anvk(defpackage.anvn anvnVar, defpackage.aodl aodlVar) {
        super(anvnVar.b.e);
        this.a = aodlVar;
        j$.util.Objects.requireNonNull(anvnVar);
        this.b = anvnVar;
    }

    @Override // defpackage.anwe
    public final void a() {
        int i = defpackage.aoik.a;
        defpackage.anvn anvnVar = this.b;
        defpackage.anvo anvoVar = anvnVar.b;
        if (anvnVar.a != null) {
            anxo.g(this.a);
            return;
        }
        while (true) {
            try {
                java.io.InputStream inputStreamG = this.a.g();
                if (inputStreamG == null) {
                    return;
                }
                try {
                    anvnVar.c.d(anvoVar.b.e.b(inputStreamG));
                    inputStreamG.close();
                } catch (java.lang.Throwable th) {
                    anxo.h(inputStreamG);
                    throw th;
                }
            } catch (java.lang.Throwable th2) {
                anxo.g(this.a);
                this.b.b(anqw.c.e(th2).f("Failed to read message."));
                return;
            }
        }
    }
}
