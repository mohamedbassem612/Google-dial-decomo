package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes.dex */
final class fzu extends defpackage.aomh implements defpackage.aono {
    /* synthetic */ java.lang.Object a;
    /* synthetic */ java.lang.Object b;
    final /* synthetic */ defpackage.aoot c;
    final /* synthetic */ defpackage.aonj d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public fzu(defpackage.aoot aootVar, defpackage.aonj aonjVar, defpackage.aoln aolnVar) {
        super(3, aolnVar);
        this.c = aootVar;
        this.d = aonjVar;
    }

    @Override // defpackage.aono
    public final /* bridge */ /* synthetic */ java.lang.Object a(java.lang.Object obj, java.lang.Object obj2, java.lang.Object obj3) {
        defpackage.fzu fzuVar = new defpackage.fzu(this.c, this.d, (defpackage.aoln) obj3);
        fzuVar.a = (defpackage.gbo) obj;
        fzuVar.b = (defpackage.dzn) obj2;
        return fzuVar.b(defpackage.aojh.a);
    }

    @Override // defpackage.aomb
    public final java.lang.Object b(java.lang.Object obj) {
        java.lang.Object obj2 = this.a;
        java.lang.Object obj3 = this.b;
        defpackage.aooc.af(obj);
        if (obj3 instanceof defpackage.gah) {
            defpackage.gah gahVar = (defpackage.gah) obj3;
            defpackage.gab gabVar = gahVar.a;
            if (!gabVar.e) {
                defpackage.gab gabVar2 = gahVar.b;
                return obj2;
            }
            defpackage.aoot aootVar = this.c;
            defpackage.gab gabVar3 = gahVar.b;
            aootVar.a = defpackage.dzn.n(gabVar);
            this.d.a(aootVar.a);
            return obj2;
        }
        if (obj3 instanceof defpackage.gai) {
            java.util.List list = ((defpackage.gai) obj3).a;
            java.util.List listSingletonList = java.util.Collections.singletonList(new defpackage.gdo(0, null));
            defpackage.aooh.e(listSingletonList, "singletonList(...)");
            return new defpackage.gbo(listSingletonList, 0, 0);
        }
        boolean z = obj3 instanceof defpackage.gag;
        if (z) {
            defpackage.gag gagVar = (defpackage.gag) obj3;
            if (gagVar.a == defpackage.gac.a) {
                if (obj2 == null) {
                    return new defpackage.gbo(gagVar.b, gagVar.c, gagVar.d);
                }
                throw new java.lang.IllegalArgumentException("PageStore should be null on REFRESH. This likely indicates an error in the library. Please file a bug in the Buganizer");
            }
        }
        if (obj2 == null) {
            if (z && !((defpackage.gag) obj3).b.isEmpty()) {
                throw new java.lang.IllegalArgumentException("PageStore should only be null on REFRESH or empty Inserts. This likely indicates an error in the library. Please file a bug in the Buganizer");
            }
            obj2 = null;
        }
        if (obj2 == null) {
            return obj2;
        }
        ((defpackage.gbo) obj2).j((defpackage.dzn) obj3);
        return obj2;
    }
}
