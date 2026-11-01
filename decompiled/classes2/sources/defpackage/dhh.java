package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes2.dex */
final class dhh extends aomh implements aonn {
    int a;
    final /* synthetic */ defpackage.dhk b;
    final /* synthetic */ android.view.ScrollCaptureSession c;
    final /* synthetic */ android.graphics.Rect d;
    final /* synthetic */ java.util.function.Consumer e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public dhh(defpackage.dhk dhkVar, android.view.ScrollCaptureSession scrollCaptureSession, android.graphics.Rect rect, java.util.function.Consumer consumer, aoln aolnVar) {
        super(2, aolnVar);
        this.b = dhkVar;
        this.c = scrollCaptureSession;
        this.d = rect;
        this.e = consumer;
    }

    public final /* bridge */ /* synthetic */ java.lang.Object a(java.lang.Object obj, java.lang.Object obj2) {
        return c((aoss) obj, (aoln) obj2).b(aojh.a);
    }

    public final java.lang.Object b(java.lang.Object obj) {
        aolu aoluVar = aolu.a;
        int i = this.a;
        aooc.af(obj);
        if (i == 0) {
            defpackage.dhk dhkVar = this.b;
            android.view.ScrollCaptureSession scrollCaptureSession = this.c;
            dpo dpoVarC = cfd.C(this.d);
            this.a = 1;
            obj = dhkVar.a(scrollCaptureSession, dpoVarC, this);
            if (obj == aoluVar) {
                return aoluVar;
            }
        }
        aa$.ExternalSyntheticApiModelOutline1.m(this.e, cfd.A((dpo) obj));
        return aojh.a;
    }

    public final aoln c(java.lang.Object obj, aoln aolnVar) {
        return new defpackage.dhh(this.b, this.c, this.d, this.e, aolnVar);
    }
}
