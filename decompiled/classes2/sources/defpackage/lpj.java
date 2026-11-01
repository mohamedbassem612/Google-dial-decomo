package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes2.dex */
public final class lpj extends aomh implements aonn {
    final /* synthetic */ boolean a;
    final /* synthetic */ boolean b;
    final /* synthetic */ aomy c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public lpj(boolean z, boolean z2, aomy aomyVar, aoln aolnVar) {
        super(2, aolnVar);
        this.a = z;
        this.b = z2;
        this.c = aomyVar;
    }

    public final /* bridge */ /* synthetic */ java.lang.Object a(java.lang.Object obj, java.lang.Object obj2) {
        return c((aoss) obj, (aoln) obj2).b(aojh.a);
    }

    public final java.lang.Object b(java.lang.Object obj) {
        aooc.af(obj);
        if (this.a && this.b) {
            this.c.a();
        }
        return aojh.a;
    }

    public final aoln c(java.lang.Object obj, aoln aolnVar) {
        return new defpackage.lpj(this.a, this.b, this.c, aolnVar);
    }
}
