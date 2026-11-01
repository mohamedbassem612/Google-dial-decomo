package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes4.dex */
public final class aocq extends defpackage.anwe {
    final /* synthetic */ defpackage.anmo a;
    final /* synthetic */ ajdd b;
    final /* synthetic */ anph c;
    final /* synthetic */ defpackage.aocx d;
    final /* synthetic */ defpackage.aocm e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public aocq(defpackage.aocs aocsVar, defpackage.anmo anmoVar, ajdd ajddVar, anph anphVar, defpackage.aocx aocxVar, defpackage.aocm aocmVar) {
        super(anmoVar);
        this.a = anmoVar;
        this.b = ajddVar;
        this.c = anphVar;
        this.d = aocxVar;
        this.e = aocmVar;
        j$.util.Objects.requireNonNull(aocsVar);
    }

    /* JADX WARN: Type inference failed for: r3v2, types: [anqm, java.lang.Object] */
    @Override // defpackage.anwe
    public final void a() {
        int i = defpackage.aoik.a;
        defpackage.aocy aocyVar = defpackage.aoct.c;
        ajdd ajddVar = this.b;
        if (ajddVar.isCancelled()) {
            return;
        }
        try {
            defpackage.apjb apjbVar = (defpackage.apjb) aiql.H(ajddVar);
            anph anphVar = this.c;
            ?? r3 = apjbVar.a;
            java.lang.Object obj = apjbVar.b;
            this.e.g(new defpackage.aocf((defpackage.aocg) obj, r3.a((defpackage.anql) obj, anphVar), ((defpackage.aocg) obj).c));
            this.a.d(new defpackage.aocp(this.d), ajbm.a);
        } catch (java.lang.Throwable th) {
            try {
                this.d.e(anqw.d(th), new anph());
                this.a.j(null);
                throw new java.lang.IllegalStateException(th);
            } catch (java.lang.Throwable th2) {
                this.e.g(aocyVar);
                throw th2;
            }
        }
    }
}
