package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes2.dex */
final class adh extends aomg implements aonn {
    java.lang.Object a;
    java.lang.Object b;
    java.lang.Object c;
    int d;
    int e;
    final /* synthetic */ defpackage.adi f;
    final /* synthetic */ defpackage.adk g;
    private /* synthetic */ java.lang.Object h;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public adh(defpackage.adi adiVar, defpackage.adk adkVar, aoln aolnVar) {
        super(aolnVar);
        this.f = adiVar;
        this.g = adkVar;
    }

    public final /* bridge */ /* synthetic */ java.lang.Object a(java.lang.Object obj, java.lang.Object obj2) {
        return c((aoqn) obj, (aoln) obj2).b(aojh.a);
    }

    public final java.lang.Object b(java.lang.Object obj) {
        java.lang.Object obj2;
        java.lang.Object obj3;
        int i;
        java.lang.Object obj4;
        aoqn aoqnVar = (aoqn) this.h;
        aolu aoluVar = aolu.a;
        if (this.e != 0) {
            i = this.d;
            obj3 = this.c;
            java.lang.Object obj5 = this.b;
            obj2 = this.a;
            aooc.af(obj);
            obj4 = obj5;
        } else {
            aooc.af(obj);
            defpackage.adi adiVar = this.f;
            obj2 = this.g;
            ads adsVar = adiVar.a;
            obj3 = adsVar.c;
            i = adsVar.e;
            obj4 = adiVar;
        }
        while (i != Integer.MAX_VALUE) {
            long j = ((long[]) obj3)[i] >> 31;
            ((defpackage.adk) obj2).a = i;
            java.lang.Object obj6 = ((defpackage.adi) obj4).a.b[i];
            this.h = aoqnVar;
            this.a = obj2;
            this.b = obj4;
            this.c = obj3;
            i = (int) (j & 2147483647L);
            this.d = i;
            this.e = 1;
            if (aoqnVar.a(obj6, this) == aoluVar) {
                return aoluVar;
            }
        }
        return aojh.a;
    }

    public final aoln c(java.lang.Object obj, aoln aolnVar) {
        defpackage.adh adhVar = new defpackage.adh(this.f, this.g, aolnVar);
        adhVar.h = obj;
        return adhVar;
    }
}
