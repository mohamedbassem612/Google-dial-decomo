package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes.dex */
final class ahql extends defpackage.ahpi {
    final /* synthetic */ defpackage.ahpj a;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ahql(defpackage.ahqm ahqmVar, defpackage.ahoq ahoqVar, defpackage.ahpj ahpjVar) {
        super(ahoqVar);
        this.a = ahpjVar;
        j$.util.Objects.requireNonNull(ahqmVar);
    }

    @Override // defpackage.ahpi, defpackage.ahpm, java.io.Closeable, java.lang.AutoCloseable
    public final void close() {
        super.close();
        defpackage.ahpj ahpjVar = this.a;
        if (ahpjVar != null) {
            defpackage.ahns.d((defpackage.ahpe) defpackage.ahns.d.get(), ahpjVar);
        }
    }
}
