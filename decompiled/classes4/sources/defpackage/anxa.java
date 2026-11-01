package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes4.dex */
final class anxa extends defpackage.anon {
    final /* synthetic */ defpackage.anxb f;
    private final defpackage.anof g;

    public anxa(defpackage.anxb anxbVar, defpackage.anof anofVar) {
        j$.util.Objects.requireNonNull(anxbVar);
        this.f = anxbVar;
        this.g = (defpackage.anof) j$.util.Objects.requireNonNull(anofVar, "helper");
    }

    @Override // defpackage.anon
    public final anqw a(defpackage.anoj anojVar) {
        defpackage.anof anofVar = this.g;
        defpackage.anxb anxbVar = this.f;
        anofVar.f(anxbVar.a, anxbVar.b);
        return anxbVar.c;
    }

    @Override // defpackage.anon
    public final void b(anqw anqwVar) {
        defpackage.anof anofVar = this.g;
        defpackage.anxb anxbVar = this.f;
        anofVar.f(anxbVar.a, anxbVar.b);
    }

    @Override // defpackage.anon
    public final void d() {
    }
}
