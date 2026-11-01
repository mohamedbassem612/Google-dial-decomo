package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes3.dex */
final class qzw extends aomh implements aonn {
    int a;
    final /* synthetic */ aihd b;
    final /* synthetic */ defpackage.qzu c;
    final /* synthetic */ defpackage.qbe d;
    final /* synthetic */ zzx e;
    final /* synthetic */ defpackage.yzr f;
    private /* synthetic */ java.lang.Object g;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public qzw(defpackage.yzr yzrVar, zzx zzxVar, aihd aihdVar, defpackage.qbe qbeVar, defpackage.qzu qzuVar, aoln aolnVar) {
        super(2, aolnVar);
        this.f = yzrVar;
        this.e = zzxVar;
        this.b = aihdVar;
        this.d = qbeVar;
        this.c = qzuVar;
    }

    public final /* bridge */ /* synthetic */ java.lang.Object a(java.lang.Object obj, java.lang.Object obj2) {
        return c((aoss) obj, (aoln) obj2).b(aojh.a);
    }

    public final java.lang.Object b(java.lang.Object obj) {
        aolu aoluVar = aolu.a;
        int i = this.a;
        aooc.af(obj);
        if (i != 0) {
            return obj;
        }
        aoss aossVar = (aoss) this.g;
        defpackage.yzr yzrVar = this.f;
        aosy aosyVarAg = ahvr.ag(aossVar, (ahda) yzrVar.b, new defpackage.qzv(yzrVar, this.e, this.b, this.d, this.c, null));
        this.a = 1;
        java.lang.Object objA = aosyVarAg.a(this);
        return objA == aoluVar ? aoluVar : objA;
    }

    public final aoln c(java.lang.Object obj, aoln aolnVar) {
        defpackage.qzw qzwVar = new defpackage.qzw(this.f, this.e, this.b, this.d, this.c, aolnVar);
        qzwVar.g = obj;
        return qzwVar;
    }
}
