package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes3.dex */
public final class aard extends aada implements com.google.android.gms.people.contactssync.TetheredSyncClient {
    private static final acxg a;
    private static final aais l;
    private static final aais m;

    static {
        aais aaisVar = new aais();
        m = aaisVar;
        defpackage.aarb aarbVar = new defpackage.aarb();
        l = aarbVar;
        a = new acxg("People.API", aarbVar, aaisVar);
    }

    public aard(android.app.Activity activity) {
        super(activity, activity, a, aacu.q, aacz.a);
    }

    @Override // com.google.android.gms.people.contactssync.TetheredSyncClient
    public final aaum triggerTetheredContactsSync(com.google.android.gms.people.contactssync.model.TetheredContactsSyncRequest tetheredContactsSyncRequest) {
        aafq aafqVar = new aafq();
        aafqVar.b = new com.google.android.gms.common.Feature[]{aaqf.F};
        aafqVar.c = 2753;
        aafqVar.a = new defpackage.zxc((aada) this, (java.lang.Object) tetheredContactsSyncRequest, 15);
        return super.i(0, aafqVar.a());
    }

    public aard(android.content.Context context) {
        super(context, (android.app.Activity) null, a, aacu.q, aacz.a);
    }
}
