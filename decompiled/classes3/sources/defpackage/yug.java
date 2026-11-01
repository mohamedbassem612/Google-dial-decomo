package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes3.dex */
final class yug extends aomh implements aonn {
    java.lang.Object a;
    java.lang.Object b;
    int c;
    final /* synthetic */ defpackage.yui d;
    final /* synthetic */ defpackage.yts e;
    final /* synthetic */ java.lang.Object f;
    final /* synthetic */ defpackage.ytz g;
    final /* synthetic */ defpackage.ymj h;
    final /* synthetic */ defpackage.yua i;
    final /* synthetic */ defpackage.uyg j;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public yug(defpackage.uyg uygVar, defpackage.yui yuiVar, defpackage.yts ytsVar, java.lang.Object obj, defpackage.ytz ytzVar, defpackage.ymj ymjVar, defpackage.yua yuaVar, aoln aolnVar) {
        super(2, aolnVar);
        this.j = uygVar;
        this.d = yuiVar;
        this.e = ytsVar;
        this.f = obj;
        this.g = ytzVar;
        this.h = ymjVar;
        this.i = yuaVar;
    }

    public final /* bridge */ /* synthetic */ java.lang.Object a(java.lang.Object obj, java.lang.Object obj2) {
        return c((aoss) obj, (aoln) obj2).b(aojh.a);
    }

    public final java.lang.Object b(java.lang.Object obj) {
        java.lang.Object obj2;
        java.lang.Object obj3;
        aolu aoluVar = aolu.a;
        int i = this.c;
        try {
            if (i == 0) {
                aooc.af(obj);
                defpackage.uyg uygVar = this.j;
                obj2 = this.i;
                obj3 = uygVar.a;
                this.a = obj3;
                this.b = obj2;
                this.c = 1;
                if (((apdp) obj3).b(this) != aoluVar) {
                }
                return aoluVar;
            }
            if (i != 1) {
                aooc.af(obj);
                return obj;
            }
            obj2 = this.b;
            obj3 = this.a;
            aooc.af(obj);
            ((defpackage.yua) obj2).b = true;
            ((apdp) obj3).d();
            defpackage.yui yuiVar = this.d;
            defpackage.yts ytsVar = this.e;
            java.lang.Object obj4 = this.f;
            defpackage.ytz ytzVar = this.g;
            defpackage.ymj ymjVar = this.h;
            this.a = null;
            this.b = null;
            this.c = 2;
            java.lang.Object objL = aooh.L(defpackage.yui.c, new defpackage.yud(ytsVar, yuiVar, ymjVar, obj4, ytzVar, (aoln) null, 0), this);
            if (objL != aoluVar) {
                return objL;
            }
            return aoluVar;
        } catch (java.lang.Throwable th) {
            ((apdp) obj3).d();
            throw th;
        }
    }

    public final aoln c(java.lang.Object obj, aoln aolnVar) {
        return new defpackage.yug(this.j, this.d, this.e, this.f, this.g, this.h, this.i, aolnVar);
    }
}
