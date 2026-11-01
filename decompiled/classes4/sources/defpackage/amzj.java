package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes4.dex */
public final class amzj implements amzg {
    public final ajcq a;
    final /* synthetic */ defpackage.amzl b;

    public amzj(defpackage.amzl amzlVar) {
        j$.util.Objects.requireNonNull(amzlVar);
        this.b = amzlVar;
        ajcq ajcqVar = amzlVar.a;
        if (!ajcqVar.isDone()) {
            ajcq amziVar = new defpackage.amzi(ajcqVar);
            ajcqVar.c(amziVar, ajbm.a);
            ajcqVar = amziVar;
        }
        this.a = ajcqVar;
    }

    public final ajcq d() {
        this.b.d();
        return this.a;
    }
}
