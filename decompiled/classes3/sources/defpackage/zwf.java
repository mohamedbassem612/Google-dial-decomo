package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes3.dex */
public final class zwf extends aada implements defpackage.zwc {
    private static final acxg a;
    private static final aais l;
    private static final aais m;

    static {
        aais aaisVar = new aais();
        m = aaisVar;
        defpackage.zwd zwdVar = new defpackage.zwd();
        l = zwdVar;
        a = new acxg("Audit.API", zwdVar, aaisVar);
    }

    public zwf(android.content.Context context) {
        super(context, (android.app.Activity) null, a, (aacu) null, aacz.a);
    }

    @Override // defpackage.zwc
    public final aaum a(com.google.android.gms.audit.LogAuditRecordsRequest logAuditRecordsRequest) {
        aafq aafqVar = new aafq();
        aafqVar.c = 6901;
        aafqVar.a = new defpackage.zxc((aada) this, (java.lang.Object) logAuditRecordsRequest, 1);
        return super.i(1, aafqVar.a());
    }
}
