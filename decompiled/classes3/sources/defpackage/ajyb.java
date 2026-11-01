package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes3.dex */
public final class ajyb {
    public static final long a;
    public static final java.lang.Object b;
    public static defpackage.aaty c;

    static {
        java.util.concurrent.TimeUnit timeUnit = java.util.concurrent.TimeUnit.MINUTES;
        a = 60000L;
        b = new java.lang.Object();
    }

    public static void a(android.content.Context context) {
        if (c == null) {
            defpackage.aaty aatyVar = new defpackage.aaty(context);
            c = aatyVar;
            synchronized (aatyVar.a) {
                aatyVar.c = true;
            }
        }
    }

    public static void b(android.content.Intent intent) {
        synchronized (b) {
            if (c != null && intent.getBooleanExtra("com.google.firebase.iid.WakeLockHolder.wakefulintent", false)) {
                intent.putExtra("com.google.firebase.iid.WakeLockHolder.wakefulintent", false);
                defpackage.aaty aatyVar = c;
                if (aatyVar.g.decrementAndGet() < 0) {
                    aaoo aaooVar = defpackage.aaty.h;
                    android.util.Log.w("WakeLock", java.lang.String.format("%s release without a matched acquire!", aatyVar.e));
                }
                synchronized (aatyVar.a) {
                    try {
                        aatyVar.d();
                        java.util.Map map = aatyVar.f;
                        if (map.containsKey(null)) {
                            xm xmVar = (xm) map.get(null);
                            if (xmVar != null) {
                                int i = xmVar.a - 1;
                                xmVar.a = i;
                                if (i == 0) {
                                    map.remove(null);
                                }
                            }
                        } else {
                            android.util.Log.w("WakeLock", aatyVar.e + " counter does not exist");
                        }
                        aatyVar.e();
                    } catch (java.lang.Throwable th) {
                        throw th;
                    }
                }
            }
        }
    }
}
