package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes.dex */
final class gbj extends defpackage.aomh implements defpackage.aonn {
    java.lang.Object a;
    java.lang.Object b;
    java.lang.Object c;
    int d;
    final /* synthetic */ defpackage.gbl e;
    private /* synthetic */ java.lang.Object f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public gbj(defpackage.gbl gblVar, defpackage.aoln aolnVar) {
        super(2, aolnVar);
        this.e = gblVar;
    }

    @Override // defpackage.aonn
    public final /* bridge */ /* synthetic */ java.lang.Object a(java.lang.Object obj, java.lang.Object obj2) {
        return ((defpackage.gbj) c((defpackage.aoxi) obj, (defpackage.aoln) obj2)).b(defpackage.aojh.a);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v2, types: [aoxi] */
    /* JADX WARN: Type inference failed for: r0v4 */
    /* JADX WARN: Type inference failed for: r0v5 */
    @Override // defpackage.aomb
    public final java.lang.Object b(java.lang.Object obj) {
        java.lang.Object obj2;
        java.lang.Object obj3;
        ?? r0;
        defpackage.aoxi aoxiVar = (defpackage.aoxi) this.f;
        defpackage.aolu aoluVar = defpackage.aolu.a;
        int i = this.d;
        try {
            if (i != 0) {
                if (i != 1) {
                    defpackage.aooc.af(obj);
                } else {
                    java.lang.Object obj4 = this.c;
                    obj2 = this.b;
                    obj3 = this.a;
                    defpackage.aooc.af(obj);
                    r0 = obj4;
                }
                return defpackage.aojh.a;
            }
            defpackage.aooc.af(obj);
            defpackage.gbl gblVar = this.e;
            this.f = null;
            defpackage.aogc aogcVar = gblVar.i;
            this.a = aogcVar;
            obj2 = aogcVar.b;
            this.b = obj2;
            this.c = aoxiVar;
            this.d = 1;
            if (((defpackage.apdp) obj2).b(this) == aoluVar) {
                return aoluVar;
            }
            obj3 = aogcVar;
            r0 = aoxiVar;
            defpackage.gab gabVarG = ((defpackage.gbn) ((defpackage.aogc) obj3).c).k.g();
            ((defpackage.apdp) obj2).d();
            defpackage.gah gahVar = new defpackage.gah(gabVarG);
            this.f = null;
            this.a = null;
            this.b = null;
            this.c = null;
            this.d = 2;
            if (r0.a(gahVar, this) == aoluVar) {
                return aoluVar;
            }
            return defpackage.aojh.a;
        } catch (java.lang.Throwable th) {
            ((defpackage.apdp) obj2).d();
            throw th;
        }
    }

    @Override // defpackage.aomb
    public final defpackage.aoln c(java.lang.Object obj, defpackage.aoln aolnVar) {
        defpackage.gbj gbjVar = new defpackage.gbj(this.e, aolnVar);
        gbjVar.f = obj;
        return gbjVar;
    }
}
