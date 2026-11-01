package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes2.dex */
public final class okb extends aomh implements aonn {
    final /* synthetic */ android.os.PowerManager$OnThermalStatusChangedListener a;
    final /* synthetic */ tkl b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public okb(tkl tklVar, android.os.PowerManager$OnThermalStatusChangedListener powerManager$OnThermalStatusChangedListener, aoln aolnVar) {
        super(2, aolnVar);
        this.b = tklVar;
        this.a = powerManager$OnThermalStatusChangedListener;
    }

    public final /* bridge */ /* synthetic */ java.lang.Object a(java.lang.Object obj, java.lang.Object obj2) {
        return c((aoss) obj, (aoln) obj2).b(aojh.a);
    }

    public final java.lang.Object b(java.lang.Object obj) {
        aooc.af(obj);
        fn$.ExternalSyntheticApiModelOutline0.m$1((android.os.PowerManager) this.b.c, this.a);
        return aojh.a;
    }

    public final aoln c(java.lang.Object obj, aoln aolnVar) {
        return new defpackage.okb(this.b, this.a, aolnVar);
    }
}
