package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes3.dex */
final class ysr extends aomh implements aonj {
    int a;
    final /* synthetic */ defpackage.ysd b;
    final /* synthetic */ int c;
    final /* synthetic */ defpackage.ymi d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ysr(defpackage.ysd ysdVar, int i, defpackage.ymi ymiVar, aoln aolnVar) {
        super(1, aolnVar);
        this.b = ysdVar;
        this.c = i;
        this.d = ymiVar;
    }

    public final /* bridge */ /* synthetic */ java.lang.Object a(java.lang.Object obj) {
        return new defpackage.ysr(this.b, this.c, this.d, (aoln) obj).b(aojh.a);
    }

    public final java.lang.Object b(java.lang.Object obj) {
        aolu aoluVar = aolu.a;
        int i = this.a;
        aooc.af(obj);
        if (i == 0) {
            defpackage.ysd ysdVar = this.b;
            int i2 = this.c;
            defpackage.ymi ymiVar = this.d;
            this.a = 1;
            if (ysdVar.c(i2, ymiVar, this) == aoluVar) {
                return aoluVar;
            }
        }
        return aojh.a;
    }
}
