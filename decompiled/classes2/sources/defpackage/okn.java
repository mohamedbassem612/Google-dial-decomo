package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes2.dex */
final class okn extends aomh implements aonn {
    final /* synthetic */ oko a;
    final /* synthetic */ android.telephony.TelephonyCallback b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public okn(oko okoVar, android.telephony.TelephonyCallback telephonyCallback, aoln aolnVar) {
        super(2, aolnVar);
        this.a = okoVar;
        this.b = telephonyCallback;
    }

    public final /* bridge */ /* synthetic */ java.lang.Object a(java.lang.Object obj, java.lang.Object obj2) {
        return c((aoss) obj, (aoln) obj2).b(aojh.a);
    }

    public final java.lang.Object b(java.lang.Object obj) {
        aooc.af(obj);
        ac$.ExternalSyntheticApiModelOutline0.m(this.a.j, this.b);
        return aojh.a;
    }

    public final aoln c(java.lang.Object obj, aoln aolnVar) {
        return new defpackage.okn(this.a, this.b, aolnVar);
    }
}
