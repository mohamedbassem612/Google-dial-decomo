package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes3.dex */
public final class aahz extends aada implements defpackage.aagg {
    public static final /* synthetic */ int a = 0;
    private static final acxg l;
    private static final aais m;
    private static final aais n;

    static {
        aais aaisVar = new aais();
        n = aaisVar;
        defpackage.aahy aahyVar = new defpackage.aahy();
        m = aahyVar;
        l = new acxg("ClientNotification.API", aahyVar, aaisVar);
    }

    public aahz(android.content.Context context) {
        super(context, (android.app.Activity) null, l, aacu.q, aacz.a);
    }

    @Override // defpackage.aagg
    public final void a(com.google.android.gms.common.internal.ClientNotificationEvent clientNotificationEvent) {
        aafq aafqVar = new aafq();
        aafqVar.b = new com.google.android.gms.common.Feature[]{aaba.b};
        aafqVar.b();
        aafqVar.a = new defpackage.aaav(clientNotificationEvent, 2);
        super.i(2, aafqVar.a());
    }
}
