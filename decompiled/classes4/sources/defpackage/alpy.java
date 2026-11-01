package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes4.dex */
public final class alpy implements yml {
    final /* synthetic */ defpackage.alqc a;
    final /* synthetic */ defpackage.alnr b;
    final /* synthetic */ java.util.function.Consumer c;

    public alpy(defpackage.alqc alqcVar, defpackage.alnr alnrVar, java.util.function.Consumer consumer) {
        this.a = alqcVar;
        this.b = alnrVar;
        this.c = consumer;
    }

    public final void a(ymk ymkVar) {
        aooh.f(ymkVar, "downloadedFeature");
        defpackage.alpu alpuVar = new defpackage.alpu(ymkVar, 3);
        defpackage.alqc alqcVar = this.a;
        j$.util.concurrent.ConcurrentHashMap concurrentHashMap = alqcVar.e;
        defpackage.alnr alnrVar = this.b;
        concurrentHashMap.put(alnrVar, alpuVar);
        alqcVar.j(alnrVar, ymkVar);
        this.c.accept(alnrVar);
    }

    public final /* synthetic */ void b(ymk ymkVar, ymi ymiVar) {
    }

    public final /* synthetic */ void d(ymk ymkVar, long j) {
    }

    public final /* synthetic */ void e(ymk ymkVar, long j) {
    }

    public final /* synthetic */ void c(ymk ymkVar, int i, ymi ymiVar) {
    }
}
