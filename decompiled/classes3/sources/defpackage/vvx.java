package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes3.dex */
final class vvx extends aomh implements aonn {
    int a;
    final /* synthetic */ vvz b;
    final /* synthetic */ boolean c;
    private /* synthetic */ java.lang.Object d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public vvx(vvz vvzVar, boolean z, aoln aolnVar) {
        super(2, aolnVar);
        this.b = vvzVar;
        this.c = z;
    }

    public final /* bridge */ /* synthetic */ java.lang.Object a(java.lang.Object obj, java.lang.Object obj2) {
        return c((aoss) obj, (aoln) obj2).b(aojh.a);
    }

    public final java.lang.Object b(java.lang.Object obj) {
        aolu aoluVar = aolu.a;
        int i = this.a;
        aooc.af(obj);
        if (i == 0) {
            aoss aossVar = (aoss) this.d;
            vvz vvzVar = this.b;
            aosy aosyVarAg = ahvr.ag(aossVar, vvzVar.n, new jbu(vvzVar, this.c, (aoln) null, 16));
            this.a = 1;
            if (aosyVarAg.a(this) == aoluVar) {
                return aoluVar;
            }
        }
        return null;
    }

    public final aoln c(java.lang.Object obj, aoln aolnVar) {
        defpackage.vvx vvxVar = new defpackage.vvx(this.b, this.c, aolnVar);
        vvxVar.d = obj;
        return vvxVar;
    }
}
