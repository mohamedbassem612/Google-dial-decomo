package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes.dex */
public final class una extends defpackage.aomh implements defpackage.aonq {
    /* synthetic */ java.lang.Object a;
    /* synthetic */ java.lang.Object b;
    /* synthetic */ java.lang.Object c;
    /* synthetic */ java.lang.Object d;
    final /* synthetic */ defpackage.unb e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public una(defpackage.unb unbVar, defpackage.aoln aolnVar) {
        super(5, aolnVar);
        this.e = unbVar;
    }

    @Override // defpackage.aonq
    public final /* bridge */ /* synthetic */ java.lang.Object a(java.lang.Object obj, java.lang.Object obj2, java.lang.Object obj3, java.lang.Object obj4, java.lang.Object obj5) {
        defpackage.una unaVar = new defpackage.una(this.e, (defpackage.aoln) obj5);
        unaVar.a = (java.util.List) obj;
        unaVar.b = (defpackage.unt) obj2;
        unaVar.c = (ums) obj3;
        unaVar.d = (java.util.List) obj4;
        return unaVar.b(defpackage.aojh.a);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r4v2, types: [java.util.List] */
    /* JADX WARN: Type inference failed for: r4v4 */
    /* JADX WARN: Type inference failed for: r4v5 */
    @Override // defpackage.aomb
    public final java.lang.Object b(java.lang.Object obj) {
        defpackage.aooc.af(obj);
        java.lang.Object obj2 = this.a;
        java.lang.Object obj3 = this.b;
        java.lang.Object obj4 = this.c;
        java.lang.Object obj5 = this.d;
        ?? r4 = obj2;
        if (obj5 != null) {
            r4 = obj5;
        }
        defpackage.unb unbVar = this.e;
        unbVar.f = r4;
        return new defpackage.unc(unbVar.f, ((defpackage.unt) obj3).a, (ums) obj4);
    }
}
