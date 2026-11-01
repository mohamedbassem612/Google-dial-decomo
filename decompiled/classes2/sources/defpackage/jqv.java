package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes2.dex */
final class jqv extends aomh implements aonn {
    java.lang.Object a;
    long b;
    int c;
    final /* synthetic */ defpackage.jqw d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public jqv(defpackage.jqw jqwVar, aoln aolnVar) {
        super(2, aolnVar);
        this.d = jqwVar;
    }

    public final /* bridge */ /* synthetic */ java.lang.Object a(java.lang.Object obj, java.lang.Object obj2) {
        return c((aoss) obj, (aoln) obj2).b(aojh.a);
    }

    /* JADX WARN: Code duplicated, block: B:21:? A[RETURN, SYNTHETIC] */
    public final java.lang.Object b(java.lang.Object obj) {
        java.lang.Object obj2;
        long j;
        long j2;
        aolu aoluVar = aolu.a;
        int i = this.c;
        if (i != 0) {
            if (i == 1) {
                j = this.b;
                obj2 = this.a;
                aooc.af(obj);
            } else if (i != 2) {
                aooc.af(obj);
            } else {
                j2 = this.b;
                obj2 = this.a;
                aooc.af(obj);
                this.a = null;
                this.c = 3;
                if (((kgl) obj2).g(j2, (ztf) obj, this) == aoluVar) {
                    return aoluVar;
                }
            }
            return null;
        }
        aooc.af(obj);
        defpackage.jqw jqwVar = this.d;
        ajcq ajcqVarX = jqwVar.c.X();
        kgl kglVar = jqwVar.b;
        this.a = kglVar;
        long j3 = jqwVar.a;
        this.b = j3;
        this.c = 1;
        obj = aosv.D(ajcqVarX, this);
        if (obj == aoluVar) {
            return aoluVar;
        }
        obj2 = kglVar;
        j = j3;
        ajcq ajcqVarBJ = ((defpackage.jqu) aooc.ar(obj, defpackage.jqu.class)).bJ();
        this.a = obj2;
        this.b = j;
        this.c = 2;
        obj = aosv.D(ajcqVarBJ, this);
        if (obj == aoluVar) {
            return aoluVar;
        }
        j2 = j;
        this.a = null;
        this.c = 3;
        if (((kgl) obj2).g(j2, (ztf) obj, this) == aoluVar) {
            return aoluVar;
        }
        return null;
    }

    public final aoln c(java.lang.Object obj, aoln aolnVar) {
        return new defpackage.jqv(this.d, aolnVar);
    }
}
