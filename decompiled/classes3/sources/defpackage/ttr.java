package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes3.dex */
public final class ttr extends aomh implements aonn {
    /* synthetic */ java.lang.Object a;
    final /* synthetic */ int b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ttr(int i, aoln aolnVar) {
        super(2, aolnVar);
        this.b = i;
    }

    public final /* bridge */ /* synthetic */ java.lang.Object a(java.lang.Object obj, java.lang.Object obj2) {
        return c((defpackage.ttk) obj, (aoln) obj2).b(aojh.a);
    }

    public final java.lang.Object b(java.lang.Object obj) {
        aooc.af(obj);
        defpackage.ttk ttkVar = (defpackage.ttk) this.a;
        j$.time.Instant instant = ttkVar.a;
        java.lang.String str = ttkVar.b;
        int i = ttkVar.c;
        int i2 = ttkVar.e;
        aooh.f(instant, "callCreationInstant");
        aooh.f(str, "callId");
        return new defpackage.ttk(instant, str, i, this.b, i2);
    }

    public final aoln c(java.lang.Object obj, aoln aolnVar) {
        defpackage.ttr ttrVar = new defpackage.ttr(this.b, aolnVar);
        ttrVar.a = obj;
        return ttrVar;
    }
}
