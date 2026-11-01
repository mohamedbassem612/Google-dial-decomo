package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes.dex */
public final class aezl extends android.content.BroadcastReceiver {
    public static volatile defpackage.apnt a;
    private static volatile defpackage.apnt b;

    public static void a(android.content.Context context, defpackage.apnt apntVar, defpackage.apnt apntVar2) {
        if (a == null) {
            synchronized (defpackage.aezl.class) {
                if (a == null) {
                    if (apntVar != null && !j$.util.Objects.equals(context.getPackageName(), "com.google.android.gms")) {
                        if (android.os.Build.VERSION.SDK_INT >= 33) {
                            aa$.ExternalSyntheticApiModelOutline0.m(context, new defpackage.aezl(), new android.content.IntentFilter("com.google.android.gms.phenotype.UPDATE"), 2);
                        } else {
                            context.registerReceiver(new defpackage.aezl(), new android.content.IntentFilter("com.google.android.gms.phenotype.UPDATE"));
                        }
                        b = apntVar;
                    }
                    a = apntVar2;
                }
            }
        }
    }

    @Override // android.content.BroadcastReceiver
    public final void onReceive(android.content.Context context, android.content.Intent intent) {
        java.lang.String stringExtra = intent.getStringExtra("com.google.android.gms.phenotype.PACKAGE_NAME");
        if (stringExtra != null) {
            if (stringExtra.contains("../") || stringExtra.contains("/..")) {
                android.util.Log.w("PhUpdateBroadcastRecv", defpackage.a.bk(stringExtra, "Got an invalid config package for P/H that includes '..': ", ". Exiting."));
                return;
            }
            defpackage.apnt apntVar = b;
            if (apntVar == null) {
                android.util.Log.w("PhUpdateBroadcastRecv", "No callback registered for P/H UPDATE broadcast. Exiting.");
                return;
            }
            defpackage.zzx zzxVar = (defpackage.zzx) ((defpackage.aeyx) apntVar.a).b.get(stringExtra);
            if (zzxVar != null) {
                zzxVar.J(new aeyv(1));
            }
        }
    }
}
