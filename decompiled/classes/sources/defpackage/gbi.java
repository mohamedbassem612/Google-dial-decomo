package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes.dex */
final class gbi extends defpackage.aomh implements defpackage.aonn {
    java.lang.Object a;
    java.lang.Object b;
    int c;
    final /* synthetic */ defpackage.gbl d;
    private /* synthetic */ java.lang.Object e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public gbi(defpackage.gbl gblVar, defpackage.aoln aolnVar) {
        super(2, aolnVar);
        this.d = gblVar;
    }

    @Override // defpackage.aonn
    public final /* bridge */ /* synthetic */ java.lang.Object a(java.lang.Object obj, java.lang.Object obj2) {
        return ((defpackage.gbi) c((defpackage.gdg) obj, (defpackage.aoln) obj2)).b(defpackage.aojh.a);
    }

    /* JADX WARN: Code duplicated, block: B:21:0x009a  */
    @Override // defpackage.aomb
    public final java.lang.Object b(java.lang.Object obj) {
        java.lang.Object obj2;
        java.lang.Object obj3;
        defpackage.gaa gaaVarF;
        defpackage.gdg gdgVar = (defpackage.gdg) this.e;
        defpackage.aolu aoluVar = defpackage.aolu.a;
        int i = this.c;
        if (i != 0) {
            if (i == 1) {
                defpackage.aogc aogcVar = (defpackage.aogc) this.b;
                defpackage.aooc.af(obj);
                try {
                    ((defpackage.gbn) aogcVar.c).d(null);
                    throw null;
                } catch (java.lang.Throwable unused) {
                    throw null;
                }
            }
            if (i != 2) {
                obj2 = this.b;
                java.lang.Object obj4 = this.a;
                defpackage.aooc.af(obj);
                obj3 = obj4;
            } else {
                defpackage.aooc.af(obj);
            }
            try {
                gaaVarF = ((defpackage.gbn) ((defpackage.aogc) obj3).c).k.f(defpackage.gac.a);
                ((defpackage.apdp) obj2).d();
                if (!(gaaVarF instanceof defpackage.fzx)) {
                    this.d.j(gdgVar);
                }
                return defpackage.aojh.a;
            } catch (java.lang.Throwable th) {
                ((defpackage.apdp) obj2).d();
                throw th;
            }
        }
        defpackage.aooc.af(obj);
        defpackage.gbl gblVar = this.d;
        if (!gblVar.e.compareAndSet(false, true)) {
            throw new java.lang.IllegalStateException("Attempt to collect twice from pageEventFlow, which is an illegal operation. Did you forget to call Flow<PagingData<*>>.cachedIn(coroutineScope)?");
        }
        defpackage.aoov.an(gdgVar, null, 0, new defpackage.bur(gblVar, gdgVar, (defpackage.aoln) null, 6), 3);
        defpackage.aowi aowiVarH = defpackage.aooh.H(0, 0, null, 6);
        defpackage.aoov.an(gdgVar, null, 0, new defpackage.bur(gblVar, aowiVarH, (defpackage.aoln) null, 7), 3);
        defpackage.aoov.an(gdgVar, null, 0, new defpackage.fzq(aowiVarH, gblVar, (defpackage.aoln) null, 2), 3);
        this.e = gdgVar;
        this.a = null;
        this.b = null;
        this.c = 2;
        if (gblVar.c(this) == aoluVar) {
            return aoluVar;
        }
        defpackage.gbl gblVar2 = this.d;
        this.e = gdgVar;
        defpackage.aogc aogcVar2 = gblVar2.i;
        this.a = aogcVar2;
        java.lang.Object obj5 = aogcVar2.b;
        this.b = obj5;
        this.c = 3;
        if (((defpackage.apdp) obj5).b(this) == aoluVar) {
            return aoluVar;
        }
        obj2 = obj5;
        obj3 = aogcVar2;
        gaaVarF = ((defpackage.gbn) ((defpackage.aogc) obj3).c).k.f(defpackage.gac.a);
        ((defpackage.apdp) obj2).d();
        if (!(gaaVarF instanceof defpackage.fzx)) {
            this.d.j(gdgVar);
        }
        return defpackage.aojh.a;
    }

    @Override // defpackage.aomb
    public final defpackage.aoln c(java.lang.Object obj, defpackage.aoln aolnVar) {
        defpackage.gbi gbiVar = new defpackage.gbi(this.d, aolnVar);
        gbiVar.e = obj;
        return gbiVar;
    }
}
