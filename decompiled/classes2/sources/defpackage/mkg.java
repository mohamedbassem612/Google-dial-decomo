package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes2.dex */
public final class mkg extends aomh implements aonn {
    java.lang.Object a;
    java.lang.Object b;
    int c;
    final /* synthetic */ defpackage.mki d;
    final /* synthetic */ aosy e;
    final /* synthetic */ aosy f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public mkg(defpackage.mki mkiVar, aosy aosyVar, aosy aosyVar2, aoln aolnVar) {
        super(2, aolnVar);
        this.d = mkiVar;
        this.e = aosyVar;
        this.f = aosyVar2;
    }

    public final /* bridge */ /* synthetic */ java.lang.Object a(java.lang.Object obj, java.lang.Object obj2) {
        return c((aoss) obj, (aoln) obj2).b(aojh.a);
    }

    public final java.lang.Object b(java.lang.Object obj) {
        java.lang.Object obj2;
        java.lang.Object objA;
        java.lang.Object obj3;
        java.lang.Object obj4;
        aolu aoluVar = aolu.a;
        int i = this.c;
        if (i != 0) {
            if (i != 1) {
                obj4 = this.b;
                obj3 = this.a;
                aooc.af(obj);
            } else {
                java.lang.Object obj5 = this.a;
                aooc.af(obj);
                objA = obj;
                obj2 = obj5;
            }
            return ((ssq) obj3).g((java.lang.String) obj4, (java.lang.String) obj);
        }
        aooc.af(obj);
        defpackage.mki mkiVar = this.d;
        aosy aosyVar = this.e;
        obj2 = mkiVar.i;
        this.a = obj2;
        this.c = 1;
        objA = aosyVar.a(this);
        if (objA == aoluVar) {
            return aoluVar;
        }
        aosy aosyVar2 = this.f;
        java.lang.String str = (java.lang.String) objA;
        this.a = obj2;
        this.b = str;
        this.c = 2;
        java.lang.Object objA2 = aosyVar2.a(this);
        if (objA2 == aoluVar) {
            return aoluVar;
        }
        java.lang.Object obj6 = obj2;
        obj = objA2;
        obj3 = obj6;
        obj4 = str;
        return ((ssq) obj3).g((java.lang.String) obj4, (java.lang.String) obj);
    }

    public final aoln c(java.lang.Object obj, aoln aolnVar) {
        return new defpackage.mkg(this.d, this.e, this.f, aolnVar);
    }
}
