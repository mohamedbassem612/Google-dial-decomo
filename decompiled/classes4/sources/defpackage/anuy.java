package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes4.dex */
public final class anuy extends defpackage.anon {
    final /* synthetic */ anuz f;
    private final defpackage.anof g;
    private defpackage.anon h;
    private anop i;

    public anuy(anuz anuzVar, defpackage.anof anofVar) {
        j$.util.Objects.requireNonNull(anuzVar);
        this.f = anuzVar;
        this.g = anofVar;
        anop anopVar = anuzVar.a;
        this.i = anopVar;
        this.h = anopVar.a(anofVar);
    }

    /* JADX WARN: Code duplicated, block: B:9:0x0027  */
    @Override // defpackage.anon
    public final anqw a(defpackage.anoj anojVar) {
        defpackage.aodb aodbVar = (defpackage.aodb) anojVar.c;
        if (aodbVar == null) {
            aodbVar = new defpackage.aodb(this.f.a, null);
        }
        anop anopVar = this.i;
        if (anopVar != null) {
            if (!aodbVar.a.c().equals(anopVar.c())) {
                defpackage.anof anofVar = this.g;
                anofVar.f(anmm.a, new defpackage.anoe(defpackage.anoh.a));
                this.h.d();
                anop anopVar2 = aodbVar.a;
                this.i = anopVar2;
                defpackage.anon anonVar = this.h;
                this.h = anopVar2.a(anofVar);
                anofVar.a().b(2, "Load balancer changed from {0} to {1}", new java.lang.Object[]{anonVar.getClass().getSimpleName(), this.h.getClass().getSimpleName()});
            }
        } else {
            defpackage.anof anofVar2 = this.g;
            anofVar2.f(anmm.a, new defpackage.anoe(defpackage.anoh.a));
            this.h.d();
            anop anopVar3 = aodbVar.a;
            this.i = anopVar3;
            defpackage.anon anonVar2 = this.h;
            this.h = anopVar3.a(anofVar2);
            anofVar2.a().b(2, "Load balancer changed from {0} to {1}", new java.lang.Object[]{anonVar2.getClass().getSimpleName(), this.h.getClass().getSimpleName()});
        }
        java.lang.Object obj = aodbVar.b;
        if (obj != null) {
            this.g.a().b(1, "Load-balancing config: {0}", new java.lang.Object[]{obj});
        }
        defpackage.anon anonVar3 = this.h;
        defpackage.anlw anlwVar = defpackage.anlw.a;
        return anonVar3.a(new defpackage.anoj(anojVar.a, anojVar.b, obj));
    }

    @Override // defpackage.anon
    public final void b(anqw anqwVar) {
        this.h.b(anqwVar);
    }

    @Override // defpackage.anon
    public final void c() {
        this.h.c();
    }

    @Override // defpackage.anon
    public final void d() {
        this.h.d();
        this.h = null;
    }
}
