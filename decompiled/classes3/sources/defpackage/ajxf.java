package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes3.dex */
public final class ajxf {
    private static final java.lang.Object a = new java.lang.Object();
    private static defpackage.ajyd b;

    public static aaum a(android.content.Context context, android.content.Intent intent, boolean z) {
        defpackage.ajyd ajydVar;
        if (android.util.Log.isLoggable("FirebaseMessaging", 3)) {
            android.util.Log.d("FirebaseMessaging", "Binding to service");
        }
        synchronized (a) {
            ajydVar = b;
            if (ajydVar == null) {
                ajydVar = new defpackage.ajyd(context);
                b = ajydVar;
            }
        }
        if (!z) {
            return ajydVar.a(intent).b(new fjq(8), new defpackage.aabm(4));
        }
        if (defpackage.ajxr.a().c(context)) {
            synchronized (defpackage.ajyb.b) {
                defpackage.ajyb.a(context);
                boolean booleanExtra = intent.getBooleanExtra("com.google.firebase.iid.WakeLockHolder.wakefulintent", false);
                intent.putExtra("com.google.firebase.iid.WakeLockHolder.wakefulintent", true);
                if (!booleanExtra) {
                    defpackage.ajyb.c.a(defpackage.ajyb.a);
                }
                ajydVar.a(intent).m(new defpackage.aadq(intent, 5));
            }
        } else {
            ajydVar.a(intent);
        }
        return aazc.s(-1);
    }

    public static final aaum b(final android.content.Intent intent, final android.content.Context context, java.util.concurrent.Executor executor) {
        java.lang.String stringExtra = intent.getStringExtra("gcm.rawData64");
        if (stringExtra != null) {
            intent.putExtra("rawData", android.util.Base64.decode(stringExtra, 0));
            intent.removeExtra("gcm.rawData64");
        }
        int i = context.getApplicationInfo().targetSdkVersion;
        final boolean z = (intent.getFlags() & 268435456) != 0;
        return (i < 26 || z) ? aazc.q(executor, new defpackage.afgu(context, intent, 12, null)).c(executor, new aaua() { // from class: ajxe
            public final java.lang.Object a(aaum aaumVar) {
                if (((java.lang.Integer) aaumVar.g()).intValue() != 402) {
                    return aaumVar;
                }
                boolean z2 = z;
                return defpackage.ajxf.a(context, intent, z2).b(new fjq(8), new defpackage.aabm(5));
            }
        }) : a(context, intent, false);
    }
}
