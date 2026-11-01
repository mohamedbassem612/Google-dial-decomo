package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes.dex */
public final class zxn extends defpackage.aada implements defpackage.zxk {
    private static final defpackage.acxg a;
    private static final defpackage.aais l;
    private static final defpackage.aais m;

    static {
        defpackage.aais aaisVar = new defpackage.aais();
        m = aaisVar;
        defpackage.zxm zxmVar = new defpackage.zxm();
        l = zxmVar;
        a = new defpackage.acxg("AccountDataService.API", zxmVar, aaisVar);
    }

    public zxn(android.content.Context context) {
        super(context, null, a, defpackage.aact.q, new defpackage.aacy().a());
    }

    @Override // defpackage.zxk
    public final defpackage.aaum a(java.lang.String str) {
        defpackage.aafq aafqVar = new defpackage.aafq();
        aafqVar.b = new com.google.android.gms.common.Feature[]{defpackage.zwi.e};
        aafqVar.a = new zxc(this, str, 4);
        aafqVar.c = 1649;
        return super.i(1, aafqVar.a());
    }
}
