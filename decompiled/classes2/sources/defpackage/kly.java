package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes2.dex */
final class kly implements ajcb {
    final /* synthetic */ defpackage.kma a;
    private final kiu b;

    public kly(defpackage.kma kmaVar, kiu kiuVar) {
        aooh.f(kiuVar, "originalRow");
        this.a = kmaVar;
        this.b = kiuVar;
    }

    /* JADX INFO: Thrown type has an unknown type hierarchy: ahzr */
    public final void a(java.lang.Throwable th) throws ahzr {
        aooh.f(th, "throwable");
        throw new ahzr("realtime processing failed", th);
    }

    public final /* bridge */ /* synthetic */ void b(java.lang.Object obj) {
        kiu kiuVar = (kiu) obj;
        aooh.f(kiuVar, "updatedRow");
        kiu kiuVar2 = this.b;
        long j = kiuVar2.d;
        defpackage.kma kmaVar = this.a;
        if (j != kmaVar.E().d) {
            kmaVar.y.w();
            return;
        }
        if (aooh.n(kiuVar, kiuVar2)) {
            kmaVar.y.w();
            return;
        }
        kmaVar.D = kmaVar.u.a(kiuVar);
        kmaVar.G();
        kmaVar.y.k.b++;
    }
}
