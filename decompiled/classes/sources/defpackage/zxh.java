package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes.dex */
public final class zxh extends defpackage.aada implements defpackage.zwx {
    private static final defpackage.acxg a;
    private static final defpackage.aais l;
    private static final defpackage.aais m;

    static {
        defpackage.aais aaisVar = new defpackage.aais();
        m = aaisVar;
        defpackage.zxd zxdVar = new defpackage.zxd();
        l = zxdVar;
        a = new defpackage.acxg("GoogleAuth.API", zxdVar, aaisVar);
    }

    public zxh(android.content.Context context) {
        super(context, null, a, defpackage.aacu.q, defpackage.aacz.a);
    }

    public static final void d(com.google.android.gms.common.api.Status status, java.lang.Object obj, defpackage.zzx zzxVar) {
        if (status.c()) {
            zzxVar.i(obj);
        } else if (m(status)) {
            zzxVar.h(new java.io.IOException(status.a()));
        } else {
            zzxVar.h(status.h == null ? new zwu(status) : new zwy(status));
        }
    }

    public static final void e(com.google.android.gms.common.api.Status status, java.lang.Object obj, defpackage.zzx zzxVar) {
        if (status.c()) {
            zzxVar.i(obj);
        } else if (m(status)) {
            zzxVar.h(new java.io.IOException(status.a()));
        } else {
            android.app.PendingIntent pendingIntent = status.h;
            zzxVar.h(pendingIntent == null ? new defpackage.zwj(status.a()) : com.google.android.gms.auth.UserRecoverableAuthException.a(status.a(), defpackage.aehj.cd(pendingIntent)));
        }
    }

    private static final boolean m(com.google.android.gms.common.api.Status status) {
        switch (status.f) {
            case defpackage.eft.BYTES_FIELD_NUMBER /* 8 */:
            case 49500:
            case 49508:
            case 49528:
            case 49531:
                return true;
            default:
                return false;
        }
    }

    @Override // defpackage.zwx
    public final defpackage.aaum a(java.lang.String str) {
        defpackage.aafq aafqVar = new defpackage.aafq();
        aafqVar.b = new com.google.android.gms.common.Feature[]{defpackage.zwi.h};
        aafqVar.a = new zxc(this, str, 2);
        aafqVar.c = 1681;
        return super.i(0, aafqVar.a());
    }

    @Override // defpackage.zwx
    public final defpackage.aaum b(com.google.android.gms.auth.aang.GetAccountsRequest getAccountsRequest) {
        defpackage.aafq aafqVar = new defpackage.aafq();
        aafqVar.b = new com.google.android.gms.common.Feature[]{defpackage.zwi.h};
        aafqVar.a = new zxc(this, getAccountsRequest, 0);
        aafqVar.c = 1676;
        return super.i(0, aafqVar.a());
    }

    @Override // defpackage.zwx
    public final defpackage.aaum c(com.google.android.gms.auth.aang.GetTokenRequest getTokenRequest) {
        defpackage.aafq aafqVar = new defpackage.aafq();
        aafqVar.b = new com.google.android.gms.common.Feature[]{new com.google.android.gms.common.Feature("google_auth_api", -1, 1L, false)};
        aafqVar.a = new zxc(this, getTokenRequest, 3);
        aafqVar.c = 1680;
        return super.i(0, aafqVar.a());
    }
}
