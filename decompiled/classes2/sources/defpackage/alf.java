package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes2.dex */
public final class alf extends aomh implements aonn {
    float a;
    int b;
    final /* synthetic */ alg c;
    private /* synthetic */ java.lang.Object d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public alf(alg algVar, aoln aolnVar) {
        super(2, aolnVar);
        this.c = algVar;
    }

    public final /* bridge */ /* synthetic */ java.lang.Object a(java.lang.Object obj, java.lang.Object obj2) {
        return c((aoss) obj, (aoln) obj2).b(aojh.a);
    }

    public final java.lang.Object b(java.lang.Object obj) {
        float fA;
        aoss aossVar = (aoss) this.d;
        aolu aoluVar = aolu.a;
        if (this.b != 0) {
            fA = this.a;
            aooc.af(obj);
        } else {
            aooc.af(obj);
            fA = defpackage.wx.a(aossVar.c());
        }
        while (aosv.r(aossVar)) {
            defpackage.arg argVar = new defpackage.arg(this.c, fA, 1);
            this.d = aossVar;
            this.a = fA;
            this.b = 1;
            if (cdh.d(u()).a(argVar, this) == aoluVar) {
                return aoluVar;
            }
        }
        return aojh.a;
    }

    public final aoln c(java.lang.Object obj, aoln aolnVar) {
        defpackage.alf alfVar = new defpackage.alf(this.c, aolnVar);
        alfVar.d = obj;
        return alfVar;
    }
}
