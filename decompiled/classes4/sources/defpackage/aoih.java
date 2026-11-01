package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes4.dex */
final class aoih extends defpackage.aoid {
    private static final defpackage.anoh l = defpackage.anoh.d("round_robin connecting: TCP/TLS handshake in progress to child balancers");
    private final java.util.concurrent.atomic.AtomicInteger m;
    private defpackage.anol n;

    public aoih(defpackage.anof anofVar) {
        super(anofVar);
        this.m = new java.util.concurrent.atomic.AtomicInteger(new java.util.Random().nextInt());
        this.n = new defpackage.anoe(l);
    }

    private final defpackage.anol g(java.util.Collection collection) {
        java.util.ArrayList arrayList = new java.util.ArrayList();
        java.util.Iterator it = collection.iterator();
        while (it.hasNext()) {
            arrayList.add(((defpackage.aoib) it.next()).d);
        }
        return new defpackage.aoig(arrayList, this.m);
    }

    private final void h(anmm anmmVar, defpackage.anol anolVar) {
        if (anmmVar == this.k && anolVar.equals(this.n)) {
            return;
        }
        this.h.f(anmmVar, anolVar);
        this.k = anmmVar;
        this.n = anolVar;
    }

    @Override // defpackage.aoid
    protected final defpackage.aoib e(java.lang.Object obj) {
        return new defpackage.aoif(this, obj, this.j);
    }

    @Override // defpackage.aoid
    protected final void f() {
        java.util.ArrayList arrayList = new java.util.ArrayList();
        for (defpackage.aoib aoibVar : this.g) {
            if (aoibVar.c == anmm.b) {
                arrayList.add(aoibVar);
            }
        }
        if (!arrayList.isEmpty()) {
            h(anmm.b, g(arrayList));
            return;
        }
        java.util.Iterator it = this.g.iterator();
        while (it.hasNext()) {
            anmm anmmVar = ((defpackage.aoib) it.next()).c;
            anmm anmmVar2 = anmm.a;
            if (anmmVar == anmmVar2 || anmmVar == anmm.d) {
                h(anmmVar2, new defpackage.anoe(l));
                return;
            }
        }
        h(anmm.c, g(this.g));
    }
}
