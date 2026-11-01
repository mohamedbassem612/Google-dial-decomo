package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes4.dex */
final class aoie extends defpackage.aoia {
    final /* synthetic */ defpackage.aoif b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public aoie(defpackage.aoif aoifVar) {
        super(aoifVar);
        j$.util.Objects.requireNonNull(aoifVar);
        this.b = aoifVar;
    }

    @Override // defpackage.aoia, defpackage.aohz, defpackage.anof
    public final void f(anmm anmmVar, defpackage.anol anolVar) {
        super.f(anmmVar, anolVar);
        defpackage.aoif aoifVar = this.b;
        if (aoifVar.f.i || anmmVar != anmm.d) {
            return;
        }
        aoifVar.b.c();
    }
}
