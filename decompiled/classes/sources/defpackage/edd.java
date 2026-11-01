package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes.dex */
public final class edd extends defpackage.aomh implements defpackage.aono {
    int a;
    final /* synthetic */ defpackage.eei b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public edd(defpackage.eei eeiVar, defpackage.aoln aolnVar) {
        super(3, aolnVar);
        this.b = eeiVar;
    }

    @Override // defpackage.aono
    public final /* bridge */ /* synthetic */ java.lang.Object a(java.lang.Object obj, java.lang.Object obj2, java.lang.Object obj3) {
        return new defpackage.edd(this.b, (defpackage.aoln) obj3).b(defpackage.aojh.a);
    }

    @Override // defpackage.aomb
    public final java.lang.Object b(java.lang.Object obj) {
        defpackage.aolu aoluVar = defpackage.aolu.a;
        int i = this.a;
        defpackage.aooc.af(obj);
        if (i == 0) {
            defpackage.eei eeiVar = this.b;
            this.a = 1;
            if (eeiVar.d(this) == aoluVar) {
                return aoluVar;
            }
        }
        return defpackage.aojh.a;
    }
}
