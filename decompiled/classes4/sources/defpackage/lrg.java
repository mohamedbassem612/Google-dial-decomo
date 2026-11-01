package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes4.dex */
final class lrg extends aomh implements aonn {
    final /* synthetic */ lrh a;
    final /* synthetic */ android.os.VibrationEffect b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public lrg(lrh lrhVar, android.os.VibrationEffect vibrationEffect, aoln aolnVar) {
        super(2, aolnVar);
        this.a = lrhVar;
        this.b = vibrationEffect;
    }

    public final /* bridge */ /* synthetic */ java.lang.Object a(java.lang.Object obj, java.lang.Object obj2) {
        return c((aoss) obj, (aoln) obj2).b(aojh.a);
    }

    public final java.lang.Object b(java.lang.Object obj) {
        aooc.af(obj);
        int i = android.os.Build.VERSION.SDK_INT;
        lrh lrhVar = this.a;
        if (i >= 33) {
            ae$.ExternalSyntheticApiModelOutline0.m(lrhVar.c, this.b, new android.os.VibrationAttributes.Builder().setFlags(2, 2).build());
        } else {
            lrhVar.c.vibrate(this.b);
        }
        return aojh.a;
    }

    public final aoln c(java.lang.Object obj, aoln aolnVar) {
        return new defpackage.lrg(this.a, this.b, aolnVar);
    }
}
