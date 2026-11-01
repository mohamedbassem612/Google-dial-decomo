package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes4.dex */
final class anyy extends defpackage.anof {
    defpackage.anon a;
    final /* synthetic */ anzg b;

    public anyy(anzg anzgVar) {
        j$.util.Objects.requireNonNull(anzgVar);
        this.b = anzgVar;
    }

    @Override // defpackage.anof
    public final anmd a() {
        return this.b.I;
    }

    @Override // defpackage.anof
    public final /* bridge */ /* synthetic */ defpackage.anok b(defpackage.anoc anocVar) {
        anzg anzgVar = this.b;
        anzgVar.n.c();
        ahvr.bZ(!anzgVar.D, "Channel is being terminated");
        return new defpackage.anut(anzgVar, anocVar);
    }

    @Override // defpackage.anof
    public final anrc c() {
        return this.b.n;
    }

    @Override // defpackage.anof
    public final java.util.concurrent.ScheduledExecutorService d() {
        return this.b.k;
    }

    @Override // defpackage.anof
    public final void e() {
        anrc anrcVar = this.b.n;
        anrcVar.c();
        anrcVar.execute(new defpackage.anwo(this, 16));
    }

    @Override // defpackage.anof
    public final void f(anmm anmmVar, defpackage.anol anolVar) {
        anzg anzgVar = this.b;
        anzgVar.n.c();
        ahvr.cj(anmmVar, "newState");
        ahvr.cj(anolVar, "newPicker");
        if (this != anzgVar.u || anzgVar.v) {
            return;
        }
        anzgVar.l(anolVar);
        if (anmmVar != anmm.e) {
            anzgVar.I.b(2, "Entering {0} state with picker: {1}", new java.lang.Object[]{anmmVar, anolVar});
            anzgVar.p.a(anmmVar);
        }
    }
}
