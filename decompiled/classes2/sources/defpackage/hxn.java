package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes2.dex */
final class hxn extends aomh implements aonn {
    java.lang.Object a;
    int b;
    final /* synthetic */ defpackage.hxv c;
    final /* synthetic */ int d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public hxn(defpackage.hxv hxvVar, int i, aoln aolnVar) {
        super(2, aolnVar);
        this.c = hxvVar;
        this.d = i;
    }

    public final /* bridge */ /* synthetic */ java.lang.Object a(java.lang.Object obj, java.lang.Object obj2) {
        return c((aoss) obj, (aoln) obj2).b(aojh.a);
    }

    public final java.lang.Object b(java.lang.Object obj) {
        aolu aoluVar = aolu.a;
        int i = this.b;
        if (i == 0) {
            aooc.af(obj);
            defpackage.hxv hxvVar = this.c;
            this.b = 1;
            if (hxvVar.d(this) == aoluVar) {
                return aoluVar;
            }
        } else {
            if (i != 1) {
                java.lang.Object obj2 = this.a;
                aooc.af(obj);
                return obj2;
            }
            aooc.af(obj);
        }
        defpackage.hxv hxvVar2 = this.c;
        defpackage.hxj hxjVar = new defpackage.hxj(hxvVar2, new defpackage.hxm(hxvVar2, this.d, null));
        defpackage.hxh hxhVar = new defpackage.hxh(hxjVar, null);
        this.a = hxjVar;
        this.b = 2;
        return hxvVar2.i.a(hxhVar, this) != aoluVar ? hxjVar : aoluVar;
    }

    public final aoln c(java.lang.Object obj, aoln aolnVar) {
        return new defpackage.hxn(this.c, this.d, aolnVar);
    }
}
