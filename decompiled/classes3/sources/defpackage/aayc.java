package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes3.dex */
public final class aayc extends aagp {
    private final defpackage.vaa A;
    private final defpackage.vaa B;
    private final defpackage.vaa C;
    private final defpackage.vaa D;
    private final defpackage.vaa E;
    private final defpackage.vaa F;
    private final defpackage.vaa G;
    public final java.util.concurrent.ExecutorService a;
    public final ahzi v;
    private final defpackage.aaye w;
    private final defpackage.vaa x;
    private final defpackage.vaa y;
    private final defpackage.vaa z;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public aayc(android.content.Context context, android.os.Looper looper, aadc aadcVar, aadd aaddVar, aagi aagiVar) {
        super(context, looper, 14, aagiVar, aadcVar, aaddVar);
        aazc aazcVar = aang.a;
        java.util.concurrent.ExecutorService executorServiceUnconfigurableExecutorService = java.util.concurrent.Executors.unconfigurableExecutorService(java.util.concurrent.Executors.newCachedThreadPool(new aanf(0)));
        defpackage.aaye aayeVarA = defpackage.aaye.a(context);
        this.x = new defpackage.vaa((char[]) null);
        this.y = new defpackage.vaa((char[]) null);
        this.z = new defpackage.vaa((char[]) null);
        this.A = new defpackage.vaa((char[]) null);
        this.B = new defpackage.vaa((char[]) null);
        this.C = new defpackage.vaa((char[]) null);
        this.D = new defpackage.vaa((char[]) null);
        this.E = new defpackage.vaa((char[]) null);
        this.F = new defpackage.vaa((char[]) null);
        this.G = new defpackage.vaa((char[]) null);
        new defpackage.vaa((char[]) null);
        new defpackage.vaa((char[]) null);
        ahvr.ci(executorServiceUnconfigurableExecutorService);
        this.a = executorServiceUnconfigurableExecutorService;
        this.w = aayeVarA;
        this.v = ahvr.bI(new defpackage.wtx(context, 6));
    }

    protected final void D(int i, android.os.IBinder iBinder, android.os.Bundle bundle, int i2) {
        if (android.util.Log.isLoggable("WearableClient", 2)) {
            android.util.Log.v("WearableClient", a.bj(i, "onPostInitHandler: statusCode "));
        }
        if (i == 0) {
            this.x.aj(iBinder);
            this.y.aj(iBinder);
            this.z.aj(iBinder);
            this.B.aj(iBinder);
            this.C.aj(iBinder);
            this.D.aj(iBinder);
            this.E.aj(iBinder);
            this.F.aj(iBinder);
            this.G.aj(iBinder);
            this.A.aj(iBinder);
            i = 0;
        }
        super.D(i, iBinder, bundle, i2);
    }

    public final int a() {
        return 8600000;
    }

    protected final /* synthetic */ android.os.IInterface b(android.os.IBinder iBinder) {
        android.os.IInterface iInterfaceQueryLocalInterface = iBinder.queryLocalInterface("com.google.android.gms.wearable.internal.IWearableService");
        return iInterfaceQueryLocalInterface instanceof defpackage.aaxn ? (defpackage.aaxn) iInterfaceQueryLocalInterface : new defpackage.aaxn(iBinder);
    }

    protected final java.lang.String c() {
        return "com.google.android.gms.wearable.internal.IWearableService";
    }

    protected final java.lang.String d() {
        return "com.google.android.gms.wearable.BIND";
    }

    public final boolean e() {
        return true;
    }

    public final com.google.android.gms.common.Feature[] g() {
        return defpackage.aawc.I;
    }

    public final void m(aagb aagbVar) {
        if (!q()) {
            try {
                android.content.Context context = ((aagf) this).b;
                android.os.Bundle bundle = context.getPackageManager().getApplicationInfo("com.google.android.wearable.app.cn", 128).metaData;
                int i = bundle != null ? bundle.getInt("com.google.android.wearable.api.version", 0) : 0;
                if (i < 8600000) {
                    android.util.Log.w("WearableClient", a.bj(i, "The Wear OS app is out of date. Requires API version 8600000 but found "));
                    android.content.Intent intent = new android.content.Intent("com.google.android.wearable.app.cn.UPDATE_ANDROID_WEAR").setPackage("com.google.android.wearable.app.cn");
                    if (context.getPackageManager().resolveActivity(intent, 65536) == null) {
                        intent = new android.content.Intent("android.intent.action.VIEW", android.net.Uri.parse("market://details").buildUpon().appendQueryParameter("id", "com.google.android.wearable.app.cn").build());
                    }
                    android.content.ClipData clipData = defpackage.afap.a;
                    F(aagbVar, 6, defpackage.afap.b(context, 0, intent, 67108864));
                    return;
                }
            } catch (android.content.pm.PackageManager.NameNotFoundException unused) {
                F(aagbVar, 16, (android.app.PendingIntent) null);
                return;
            }
        }
        super.m(aagbVar);
    }

    public final boolean q() {
        return !this.w.b();
    }

    protected final java.lang.String x() {
        return this.w.b() ? "com.google.android.wearable.app.cn" : "com.google.android.gms";
    }
}
