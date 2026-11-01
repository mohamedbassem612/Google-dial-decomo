package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes.dex */
public final class aapa extends defpackage.aada implements defpackage.aaow {
    public static final /* synthetic */ int a = 0;
    private static final defpackage.acxg l;
    private static final defpackage.aais m;
    private static final defpackage.aais n;

    static {
        defpackage.aais aaisVar = new defpackage.aais();
        n = aaisVar;
        defpackage.aaoz aaozVar = new defpackage.aaoz();
        m = aaozVar;
        l = new defpackage.acxg("MdiSync.API", aaozVar, aaisVar);
    }

    public aapa(android.content.Context context, defpackage.aaox aaoxVar) {
        super(context, null, l, aaoxVar, defpackage.aacz.a);
    }

    @Override // defpackage.aaow
    public final defpackage.aaum a(byte[] bArr, com.google.android.gms.mdisync.SyncOptions syncOptions, com.google.android.gms.mdisync.CallerInfo callerInfo) {
        com.google.android.gms.common.Feature[] featureArr;
        defpackage.aizr aizrVar = ((defpackage.aaox) this.e).b;
        com.google.android.gms.mdisync.internal.SyncRequest syncRequest = new com.google.android.gms.mdisync.internal.SyncRequest(1, bArr, syncOptions, j$.time.Instant.now().toEpochMilli());
        defpackage.aafq aafqVar = new defpackage.aafq();
        aafqVar.a = new zxc(syncRequest, callerInfo, 10);
        int i = syncRequest.d - 1;
        if (i == 1 || i == 2 || i == 3) {
            featureArr = new com.google.android.gms.common.Feature[]{defpackage.aaov.b};
        } else {
            featureArr = i != 4 ? new com.google.android.gms.common.Feature[0] : new com.google.android.gms.common.Feature[]{defpackage.aaov.a};
        }
        aafqVar.b = featureArr;
        aafqVar.c = 15902;
        return super.i(0, aafqVar.a());
    }
}
