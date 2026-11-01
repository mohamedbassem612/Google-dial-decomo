package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes3.dex */
public final class aavb extends aada implements defpackage.aauw {
    private static final acxg a;
    private static final aais l;
    private static final aais m;

    static {
        aais aaisVar = new aais();
        m = aaisVar;
        defpackage.aauz aauzVar = new defpackage.aauz();
        l = aauzVar;
        a = new acxg("Thunderbird.API", aauzVar, aaisVar);
    }

    public aavb(android.content.Context context) {
        super(context, (android.app.Activity) null, a, aacu.q, aacz.a);
    }

    @Override // defpackage.aauw
    public final void a(aaut aautVar) {
        aafq aafqVar = new aafq();
        aafqVar.a = new defpackage.aarg((aada) this, (java.lang.Object) aautVar, 3);
        aafqVar.b = new com.google.android.gms.common.Feature[]{defpackage.aaux.a};
        aafqVar.c = 21901;
        super.i(1, aafqVar.a());
    }
}
