package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes.dex */
public final class aabs extends defpackage.aada implements defpackage.aabb {
    private static final defpackage.acxg a;
    private static final defpackage.aais l;
    private static final defpackage.aais m;

    static {
        defpackage.aais aaisVar = new defpackage.aais();
        m = aaisVar;
        defpackage.aabr aabrVar = new defpackage.aabr();
        l = aabrVar;
        a = new defpackage.acxg("CloudMessaging.API", aabrVar, aaisVar);
    }

    public aabs(android.content.Context context) {
        super(context, null, a, defpackage.aacu.q, defpackage.aacz.a);
    }

    @Override // defpackage.aabb
    public final defpackage.aaum a(com.google.android.gms.cloudmessaging.RegisterRequest registerRequest) {
        defpackage.aafq aafqVar = new defpackage.aafq();
        aafqVar.b = new com.google.android.gms.common.Feature[]{defpackage.aabf.a};
        aafqVar.a = new zxc(this, registerRequest, 6);
        aafqVar.c = 39001;
        return super.i(0, aafqVar.a());
    }
}
