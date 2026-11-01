package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes.dex */
public final class jyt implements defpackage.kau {
    private final defpackage.jys a;

    public jyt(defpackage.jys jysVar) {
        this.a = jysVar;
    }

    @Override // defpackage.kau
    public final /* synthetic */ void a(defpackage.kav kavVar) {
        if (kavVar == null) {
            defpackage.aooh.i("loggingContext");
        }
    }

    @Override // defpackage.kau
    public final void b(java.lang.Long l) {
        if (l.longValue() > 3000) {
            defpackage.agsm.i(188, this.a.a(), "Failed to clear missed calls on screen hidden", new java.lang.Object[0]);
        }
    }

    @Override // defpackage.kau
    public final /* synthetic */ void c(defpackage.kav kavVar) {
        if (kavVar == null) {
            defpackage.aooh.i("loggingContext");
        }
    }

    @Override // defpackage.kau
    public final /* synthetic */ void d() {
    }

    @Override // defpackage.kau
    public final /* synthetic */ void e() {
    }
}
