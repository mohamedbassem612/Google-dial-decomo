package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes2.dex */
final class aif extends aomh implements aonj {
    java.lang.Object a;
    java.lang.Object b;
    int c;
    final /* synthetic */ aii d;
    final /* synthetic */ java.lang.Object e;
    final /* synthetic */ defpackage.ain f;
    final /* synthetic */ long g;
    final /* synthetic */ aonj h;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public aif(aii aiiVar, java.lang.Object obj, defpackage.ain ainVar, long j, aonj aonjVar, aoln aolnVar) {
        super(1, aolnVar);
        this.d = aiiVar;
        this.e = obj;
        this.f = ainVar;
        this.g = j;
        this.h = aonjVar;
    }

    public final /* bridge */ /* synthetic */ java.lang.Object a(java.lang.Object obj) {
        return new defpackage.aif(this.d, this.e, this.f, this.g, this.h, (aoln) obj).b(aojh.a);
    }

    /* JADX WARN: Type inference failed for: r1v2, types: [aonj, java.lang.Object] */
    public final java.lang.Object b(java.lang.Object obj) {
        defpackage.aif aifVar;
        java.lang.Object obj2;
        java.lang.Object obj3;
        java.util.concurrent.CancellationException cancellationException;
        aolu aoluVar = aolu.a;
        if (this.c != 0) {
            obj2 = this.b;
            obj3 = this.a;
            try {
                aooc.af(obj);
                aifVar = this;
            } catch (java.util.concurrent.CancellationException e) {
                cancellationException = e;
                aifVar = this;
                aifVar.d.h();
                throw cancellationException;
            }
        } else {
            aooc.af(obj);
            try {
                aii aiiVar = this.d;
                air airVar = aiiVar.b;
                airVar.a = (aiw) aiiVar.g.a.a(this.e);
                defpackage.ain ainVar = this.f;
                aiiVar.j(((defpackage.ala) ainVar).a);
                aiiVar.i(true);
                air airVarBt = den.bt(airVar, (java.lang.Object) null, Long.MIN_VALUE, 23);
                aoop aoopVar = new aoop();
                long j = this.g;
                defpackage.aju ajuVar = new defpackage.aju(aiiVar, airVarBt, this.h, aoopVar, 1);
                this.a = airVarBt;
                this.b = aoopVar;
                this.c = 1;
                aifVar = this;
                try {
                    if (defpackage.wx.b(airVarBt, ainVar, j, ajuVar, aifVar) == aoluVar) {
                        return aoluVar;
                    }
                    obj2 = aoopVar;
                    obj3 = airVarBt;
                } catch (java.util.concurrent.CancellationException e2) {
                    e = e2;
                    cancellationException = e;
                    aifVar.d.h();
                    throw cancellationException;
                }
            } catch (java.util.concurrent.CancellationException e3) {
                e = e3;
                aifVar = this;
                cancellationException = e;
                aifVar.d.h();
                throw cancellationException;
            }
        }
        int i = true != ((aoop) obj2).a ? 2 : 1;
        aifVar.d.h();
        return new defpackage.aio((air) obj3, i);
    }
}
