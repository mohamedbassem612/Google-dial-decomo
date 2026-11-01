package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes3.dex */
final class sdu extends aomh implements aonj {
    int a;
    final /* synthetic */ defpackage.sdw b;
    final /* synthetic */ long c;
    final /* synthetic */ java.lang.String d;
    final /* synthetic */ java.lang.String e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public sdu(defpackage.sdw sdwVar, long j, java.lang.String str, java.lang.String str2, aoln aolnVar) {
        super(1, aolnVar);
        this.b = sdwVar;
        this.c = j;
        this.d = str;
        this.e = str2;
    }

    public final /* bridge */ /* synthetic */ java.lang.Object a(java.lang.Object obj) {
        return new defpackage.sdu(this.b, this.c, this.d, this.e, (aoln) obj).b(aojh.a);
    }

    public final java.lang.Object b(java.lang.Object obj) {
        aolu aoluVar = aolu.a;
        int i = this.a;
        aooc.af(obj);
        if (i != 0) {
            return obj;
        }
        defpackage.sdw sdwVar = this.b;
        long j = this.c;
        java.lang.String str = this.d;
        java.lang.String str2 = this.e;
        this.a = 1;
        java.lang.Object objB = sdwVar.b(j, str, str2, this);
        return objB == aoluVar ? aoluVar : objB;
    }
}
