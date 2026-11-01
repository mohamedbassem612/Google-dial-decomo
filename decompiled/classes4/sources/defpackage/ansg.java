package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes4.dex */
final class ansg implements ajcb {
    final /* synthetic */ defpackage.anql a;
    final /* synthetic */ defpackage.antq b;
    final /* synthetic */ anph c;
    final /* synthetic */ defpackage.anqm d;

    public ansg(defpackage.ansh anshVar, defpackage.anql anqlVar, defpackage.antq antqVar, anph anphVar, defpackage.anqm anqmVar) {
        this.a = anqlVar;
        this.b = antqVar;
        this.c = anphVar;
        this.d = anqmVar;
        j$.util.Objects.requireNonNull(anshVar);
    }

    public final void a(java.lang.Throwable th) {
        this.a.a(defpackage.ansh.b(th), new anph());
    }

    public final /* bridge */ /* synthetic */ void b(java.lang.Object obj) {
        anqw anqwVar = (anqw) obj;
        if (!anqwVar.h()) {
            this.a.a(anqwVar, new anph());
            return;
        }
        defpackage.antq antqVar = this.b;
        defpackage.anql anqlVar = this.a;
        try {
            antqVar.a.set(this.d.a(anqlVar, this.c));
            antqVar.g();
        } catch (java.lang.RuntimeException e) {
            anqlVar.a(anqw.k.e(e).f("Failed to start server call after authorization check"), new anph());
        }
    }
}
