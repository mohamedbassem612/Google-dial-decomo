package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes3.dex */
final class abgf extends aomh implements aono {
    /* synthetic */ long a;
    final /* synthetic */ abgx b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public abgf(abgx abgxVar, aoln aolnVar) {
        super(3, aolnVar);
        this.b = abgxVar;
    }

    public final /* synthetic */ java.lang.Object a(java.lang.Object obj, java.lang.Object obj2, java.lang.Object obj3) {
        long j = ((cpm) obj2).a;
        defpackage.abgf abgfVar = new defpackage.abgf(this.b, (aoln) obj3);
        abgfVar.a = j;
        return abgfVar.b(aojh.a);
    }

    public final java.lang.Object b(java.lang.Object obj) {
        aooc.af(obj);
        long j = this.a;
        java.lang.Float f = new java.lang.Float(java.lang.Float.intBitsToFloat((int) (j >> 32)));
        java.lang.Float f2 = new java.lang.Float(java.lang.Float.intBitsToFloat((int) (j & 4294967295L)));
        abgx abgxVar = this.b;
        abgxVar.j.a(f, f2);
        abgxVar.k.a(defpackage.abgu.a);
        return aojh.a;
    }
}
