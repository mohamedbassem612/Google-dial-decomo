package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes.dex */
public final class gau extends defpackage.aomh implements defpackage.aono {
    java.lang.Object a;
    int b;
    /* synthetic */ java.lang.Object c;
    final /* synthetic */ defpackage.gbl d;
    final /* synthetic */ defpackage.gac e;
    java.lang.Object f;
    java.lang.Object g;
    int h;
    private /* synthetic */ java.lang.Object i;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public gau(defpackage.aoln aolnVar, defpackage.gbl gblVar, defpackage.gac gacVar) {
        super(3, aolnVar);
        this.d = gblVar;
        this.e = gacVar;
    }

    @Override // defpackage.aono
    public final /* bridge */ /* synthetic */ java.lang.Object a(java.lang.Object obj, java.lang.Object obj2, java.lang.Object obj3) {
        defpackage.gau gauVar = new defpackage.gau((defpackage.aoln) obj3, this.d, this.e);
        gauVar.i = (defpackage.aoxi) obj;
        gauVar.c = obj2;
        return gauVar.b(defpackage.aojh.a);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v1, types: [aoxi] */
    /* JADX WARN: Type inference failed for: r0v3 */
    /* JADX WARN: Type inference failed for: r0v4 */
    @Override // defpackage.aomb
    public final java.lang.Object b(java.lang.Object obj) {
        int iIntValue;
        defpackage.aogc aogcVar;
        java.lang.Object obj2;
        java.lang.Object obj3;
        ?? r0;
        defpackage.fzh gayVar;
        java.lang.Object obj4 = this.i;
        java.lang.Object obj5 = this.c;
        defpackage.aolu aoluVar = defpackage.aolu.a;
        int i = this.b;
        try {
            if (i != 0) {
                if (i != 1) {
                    defpackage.aooc.af(obj);
                } else {
                    int i2 = this.h;
                    obj2 = this.g;
                    java.lang.Object obj6 = this.f;
                    java.lang.Object obj7 = this.a;
                    defpackage.aooc.af(obj);
                    iIntValue = i2;
                    r0 = obj7;
                    obj3 = obj6;
                }
                return defpackage.aojh.a;
            }
            defpackage.aooc.af(obj);
            iIntValue = ((java.lang.Number) obj5).intValue();
            defpackage.gbl gblVar = this.d;
            this.i = null;
            this.c = null;
            this.a = obj4;
            aogcVar = gblVar.i;
            this.f = aogcVar;
            obj2 = aogcVar.b;
            this.g = obj2;
            this.h = iIntValue;
            this.b = 1;
            if (((defpackage.apdp) obj2).b(this) == aoluVar) {
                r0 = obj4;
                obj3 = aogcVar;
                return aoluVar;
            }
            r0 = obj4;
            obj3 = aogcVar;
            defpackage.ajni ajniVar = ((defpackage.gbn) ((defpackage.aogc) obj3).c).k;
            defpackage.gac gacVar = this.e;
            if (defpackage.aooh.n(ajniVar.f(gacVar), defpackage.fzz.a)) {
                gayVar = new defpackage.fzh(new defpackage.fzs[0], 13);
                ((defpackage.apdp) obj2).d();
            } else {
                if (!(ajniVar.f(gacVar) instanceof defpackage.fzx)) {
                    ajniVar.i(gacVar, defpackage.fzz.b);
                }
                ((defpackage.apdp) obj2).d();
                gayVar = new gay(new defpackage.aoxw(this.d.h.D(gacVar), iIntValue == 0 ? 0 : 1), iIntValue);
            }
            this.i = null;
            this.c = null;
            this.a = null;
            this.f = null;
            this.g = null;
            this.b = 2;
            if (defpackage.aoov.aG(r0, gayVar, this) == aoluVar) {
                return aoluVar;
            }
            return defpackage.aojh.a;
        } catch (java.lang.Throwable th) {
            ((defpackage.apdp) obj2).d();
            throw th;
        }
    }
}
