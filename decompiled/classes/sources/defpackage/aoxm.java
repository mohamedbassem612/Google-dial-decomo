package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes.dex */
public final class aoxm extends defpackage.aomh implements defpackage.aonn {
    private final /* synthetic */ int $cid;
    java.lang.Object a;
    int b;
    /* synthetic */ java.lang.Object c;
    final /* synthetic */ java.lang.Object d;
    final /* synthetic */ java.lang.Object e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public aoxm(defpackage.aoot aootVar, defpackage.aoxi aoxiVar, defpackage.aoln aolnVar, int i) {
        super(2, aolnVar);
        this.$cid = i;
        this.d = aootVar;
        this.e = aoxiVar;
    }

    @Override // defpackage.aonn
    public final /* synthetic */ java.lang.Object a(java.lang.Object obj, java.lang.Object obj2) {
        if (this.$cid != 0) {
            return ((defpackage.aoxm) c((defpackage.aoxi) obj, (defpackage.aoln) obj2)).b(defpackage.aojh.a);
        }
        return ((defpackage.aoxm) c(new defpackage.aowm(((defpackage.aowm) obj).b), (defpackage.aoln) obj2)).b(defpackage.aojh.a);
    }

    /* JADX WARN: Type inference failed for: r5v0, types: [aoxi, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r8v4, types: [aoxh, java.lang.Object] */
    @Override // defpackage.aomb
    public final java.lang.Object b(java.lang.Object obj) throws java.lang.Throwable {
        java.lang.Object obj2;
        java.lang.Object obj3;
        if (this.$cid != 0) {
            defpackage.aoxi aoxiVar = (defpackage.aoxi) this.c;
            defpackage.aolu aoluVar = defpackage.aolu.a;
            int i = this.b;
            if (i != 0) {
                if (i != 1) {
                    defpackage.aooc.af(obj);
                } else {
                    obj3 = this.a;
                    defpackage.aooc.af(obj);
                }
                return defpackage.aojh.a;
            }
            defpackage.aooc.af(obj);
            defpackage.aoot aootVar = new defpackage.aoot();
            aootVar.a = null;
            java.lang.Object obj4 = aootVar.a;
            this.c = aoxiVar;
            this.a = aootVar;
            this.b = 1;
            if (aoxiVar.a(obj4, this) == aoluVar) {
                return aoluVar;
            }
            obj3 = aootVar;
            ?? r8 = this.e;
            defpackage.fzp fzpVar = new defpackage.fzp(obj3, this.d, aoxiVar, 0);
            this.c = null;
            this.a = null;
            this.b = 2;
            if (r8.fM(fzpVar, this) == aoluVar) {
                return aoluVar;
            }
            return defpackage.aojh.a;
        }
        defpackage.aolu aoluVar2 = defpackage.aolu.a;
        if (this.b == 0) {
            defpackage.aooc.af(obj);
            java.lang.Object obj5 = this.c;
            java.lang.Object obj6 = this.d;
            boolean z = obj5 instanceof defpackage.aowl;
            if (!z) {
                ((defpackage.aoot) obj6).a = obj5;
            }
            ?? r5 = this.e;
            if (z) {
                java.lang.Throwable thB = defpackage.aowm.b(obj5);
                if (thB != null) {
                    throw thB;
                }
                java.lang.Object obj7 = ((defpackage.aoot) obj6).a;
                if (obj7 != null) {
                    java.lang.Object obj8 = obj7 != defpackage.apam.a ? obj7 : null;
                    this.c = obj5;
                    this.a = obj6;
                    this.b = 1;
                    if (r5.a(obj8, this) == aoluVar2) {
                        return aoluVar2;
                    }
                }
                obj2 = obj6;
            }
            return defpackage.aojh.a;
        }
        obj2 = this.a;
        defpackage.aooc.af(obj);
        ((defpackage.aoot) obj2).a = defpackage.apam.c;
        return defpackage.aojh.a;
    }

    /* JADX WARN: Type inference failed for: r0v1, types: [aoxi, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r1v1, types: [aoxh, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r3v4, types: [aono, java.lang.Object] */
    @Override // defpackage.aomb
    public final defpackage.aoln c(java.lang.Object obj, defpackage.aoln aolnVar) {
        if (this.$cid != 0) {
            defpackage.aoxm aoxmVar = new defpackage.aoxm((defpackage.aoxh) this.e, (defpackage.aono) this.d, aolnVar, 1);
            aoxmVar.c = obj;
            return aoxmVar;
        }
        defpackage.aoxm aoxmVar2 = new defpackage.aoxm((defpackage.aoot) this.d, (defpackage.aoxi) this.e, aolnVar, 0);
        aoxmVar2.c = ((defpackage.aowm) obj).b;
        return aoxmVar2;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public aoxm(defpackage.aoxh aoxhVar, defpackage.aono aonoVar, defpackage.aoln aolnVar, int i) {
        super(2, aolnVar);
        this.$cid = i;
        this.e = aoxhVar;
        this.d = aonoVar;
    }
}
