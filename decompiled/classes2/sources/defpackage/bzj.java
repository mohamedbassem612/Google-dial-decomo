package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes2.dex */
final class bzj extends aomh implements aonn {
    final /* synthetic */ bzl a;
    final /* synthetic */ float b;
    final /* synthetic */ aoop c;
    final /* synthetic */ bzx d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public bzj(bzl bzlVar, float f, aoop aoopVar, bzx bzxVar, aoln aolnVar) {
        super(2, aolnVar);
        this.a = bzlVar;
        this.b = f;
        this.c = aoopVar;
        this.d = bzxVar;
    }

    public final /* bridge */ /* synthetic */ java.lang.Object a(java.lang.Object obj, java.lang.Object obj2) {
        return c((aoss) obj, (aoln) obj2).b(aojh.a);
    }

    public final java.lang.Object b(java.lang.Object obj) {
        aooc.af(obj);
        new java.lang.Float(this.b);
        boolean z = this.c.a;
        bzx bzxVar = this.d;
        if (z) {
            throw null;
        }
        throw null;
    }

    public final aoln c(java.lang.Object obj, aoln aolnVar) {
        return new defpackage.bzj(this.a, this.b, this.c, this.d, aolnVar);
    }
}
