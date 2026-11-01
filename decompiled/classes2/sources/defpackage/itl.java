package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes2.dex */
public final class itl extends aomh implements aonn {
    /* synthetic */ java.lang.Object a;
    final /* synthetic */ java.lang.String b;
    final /* synthetic */ java.lang.String c;
    final /* synthetic */ long d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public itl(java.lang.String str, java.lang.String str2, long j, aoln aolnVar) {
        super(2, aolnVar);
        this.b = str;
        this.c = str2;
        this.d = j;
    }

    public final /* bridge */ /* synthetic */ java.lang.Object a(java.lang.Object obj, java.lang.Object obj2) {
        return c((defpackage.itc) obj, (aoln) obj2).b(aojh.a);
    }

    public final java.lang.Object b(java.lang.Object obj) {
        aooc.af(obj);
        return defpackage.itc.a((defpackage.itc) this.a, null, null, null, this.b, this.c, new java.lang.Long(this.d), null, null, null, 15967);
    }

    public final aoln c(java.lang.Object obj, aoln aolnVar) {
        defpackage.itl itlVar = new defpackage.itl(this.b, this.c, this.d, aolnVar);
        itlVar.a = obj;
        return itlVar;
    }
}
