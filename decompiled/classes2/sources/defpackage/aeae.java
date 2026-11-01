package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes2.dex */
final class aeae extends aomh implements aonn {
    java.lang.Object a;
    boolean b;
    boolean c;
    int d;
    final /* synthetic */ aeag e;
    final /* synthetic */ adzv f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public aeae(aeag aeagVar, adzv adzvVar, aoln aolnVar) {
        super(2, aolnVar);
        this.e = aeagVar;
        this.f = adzvVar;
    }

    public final /* bridge */ /* synthetic */ java.lang.Object a(java.lang.Object obj, java.lang.Object obj2) {
        return c((aoss) obj, (aoln) obj2).b(aojh.a);
    }

    public final java.lang.Object b(java.lang.Object obj) {
        boolean z;
        boolean z2;
        java.lang.String str;
        java.lang.Object obj2;
        boolean z3;
        boolean z4;
        java.lang.Object obj3;
        aolu aoluVar = aolu.a;
        if (this.d == 0) {
            aooc.af(obj);
            aeag aeagVar = this.e;
            adzv adzvVar = this.f;
            z = adzvVar.a;
            z2 = adzvVar.c;
            if (adzvVar.b) {
                this.a = aeagVar;
                this.b = z;
                this.c = z2;
                this.d = 1;
                java.lang.Object objE = aeagVar.e(true, this);
                if (objE == aoluVar) {
                    return aoluVar;
                }
                obj = objE;
                obj2 = aeagVar;
                z3 = z;
                z4 = z2;
            } else {
                str = null;
                obj3 = aeagVar;
            }
            aiof aiofVar = aeag.a;
            return ((aeag) obj3).d(z, z2, str);
        }
        z4 = this.c;
        z3 = this.b;
        java.lang.Object obj4 = this.a;
        aooc.af(obj);
        obj2 = obj4;
        java.lang.String str2 = (java.lang.String) obj;
        obj3 = obj2;
        str = str2;
        z2 = z4;
        z = z3;
        aiof aiofVar2 = aeag.a;
        return ((aeag) obj3).d(z, z2, str);
    }

    public final aoln c(java.lang.Object obj, aoln aolnVar) {
        return new defpackage.aeae(this.e, this.f, aolnVar);
    }
}
