package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes3.dex */
final class ajya implements java.lang.Runnable {
    private static final java.lang.Object c = new java.lang.Object();
    private static java.lang.Boolean d;
    private static java.lang.Boolean e;
    public final android.content.Context a;
    public final ajxy b;
    private final ajxo f;
    private final android.os.PowerManager.WakeLock g;
    private final long h;

    public ajya(ajxy ajxyVar, android.content.Context context, ajxo ajxoVar, long j) {
        this.b = ajxyVar;
        this.a = context;
        this.h = j;
        this.f = ajxoVar;
        this.g = ((android.os.PowerManager) context.getSystemService("power")).newWakeLock(1, "wake:com.google.firebase.messaging");
    }

    private static boolean b(android.content.Context context) {
        boolean zBooleanValue;
        synchronized (c) {
            java.lang.Boolean bool = d;
            java.lang.Boolean boolValueOf = java.lang.Boolean.valueOf(bool == null ? c(context, "android.permission.WAKE_LOCK") : bool.booleanValue());
            d = boolValueOf;
            zBooleanValue = boolValueOf.booleanValue();
        }
        return zBooleanValue;
    }

    private static boolean c(android.content.Context context, java.lang.String str) {
        boolean z = context.checkCallingOrSelfPermission(str) == 0;
        if (z || !android.util.Log.isLoggable("FirebaseMessaging", 3)) {
            return z;
        }
        android.util.Log.d("FirebaseMessaging", a.bk(str, "Missing Permission: ", ". This permission should normally be included by the manifest merger, but may needed to be manually added to your manifest"));
        return false;
    }

    public final synchronized boolean a() {
        android.net.ConnectivityManager connectivityManager = (android.net.ConnectivityManager) this.a.getSystemService("connectivity");
        android.net.NetworkInfo activeNetworkInfo = connectivityManager != null ? connectivityManager.getActiveNetworkInfo() : null;
        return activeNetworkInfo != null && activeNetworkInfo.isConnected();
    }

    /* JADX WARN: Code restructure failed: missing block: B:42:0x009d, code lost:
    
        r3 = r2.b;
        r4 = r3.hashCode();
     */
    /* JADX WARN: Code restructure failed: missing block: B:44:0x00a5, code lost:
    
        if (r4 == 83) goto L53;
     */
    /* JADX WARN: Code restructure failed: missing block: B:46:0x00a9, code lost:
    
        if (r4 != 85) goto L58;
     */
    /* JADX WARN: Code restructure failed: missing block: B:48:0x00b1, code lost:
    
        if (r3.equals("U") == false) goto L58;
     */
    /* JADX WARN: Code restructure failed: missing block: B:49:0x00b3, code lost:
    
        r3 = r2.a;
        r4 = r0.c;
        r5 = r4.c;
        r6 = ((defpackage.ajwm) aogc.e(r5.l())).a;
        ((com.google.firebase.messaging.FirebaseMessaging) r4.a).k();
        r4.f(r3, r6, (java.lang.String) aogc.e(r5.a()), "unsubscribe");
     */
    /* JADX WARN: Code restructure failed: missing block: B:50:0x00df, code lost:
    
        if (defpackage.agmc.ae() == false) goto L61;
     */
    /* JADX WARN: Code restructure failed: missing block: B:51:0x00e1, code lost:
    
        android.util.Log.d("FirebaseMessaging", a.bk(r3, "Unsubscribe from topic: ", " succeeded."));
     */
    /* JADX WARN: Code restructure failed: missing block: B:54:0x00f5, code lost:
    
        if (r3.equals("S") == false) goto L58;
     */
    /* JADX WARN: Code restructure failed: missing block: B:55:0x00f7, code lost:
    
        r3 = r2.a;
        r4 = r0.c;
        r5 = r4.c;
        r6 = ((defpackage.ajwm) aogc.e(r5.l())).a;
        ((com.google.firebase.messaging.FirebaseMessaging) r4.a).k();
        r4.f(r3, r6, (java.lang.String) aogc.e(r5.a()), "subscribe");
     */
    /* JADX WARN: Code restructure failed: missing block: B:56:0x0123, code lost:
    
        if (defpackage.agmc.ae() == false) goto L61;
     */
    /* JADX WARN: Code restructure failed: missing block: B:57:0x0125, code lost:
    
        android.util.Log.d("FirebaseMessaging", a.bk(r3, "Subscribe to topic: ", " succeeded."));
     */
    /* JADX WARN: Code restructure failed: missing block: B:59:0x0137, code lost:
    
        if (defpackage.agmc.ae() == false) goto L61;
     */
    /* JADX WARN: Code restructure failed: missing block: B:60:0x0139, code lost:
    
        android.util.Log.d("FirebaseMessaging", "Unknown topic operation" + r2.toString() + '.');
     */
    /* JADX WARN: Code restructure failed: missing block: B:61:0x0158, code lost:
    
        r0.b.c(r2);
        r3 = r0.a;
     */
    /* JADX WARN: Code restructure failed: missing block: B:62:0x015f, code lost:
    
        monitor-enter(r3);
     */
    /* JADX WARN: Code restructure failed: missing block: B:63:0x0160, code lost:
    
        r2 = r2.c;
     */
    /* JADX WARN: Code restructure failed: missing block: B:64:0x0166, code lost:
    
        if (r3.containsKey(r2) != false) goto L130;
     */
    /* JADX WARN: Code restructure failed: missing block: B:65:0x0168, code lost:
    
        monitor-exit(r3);
     */
    /* JADX WARN: Code restructure failed: missing block: B:67:0x016b, code lost:
    
        r4 = (java.util.ArrayDeque) r3.get(r2);
        r5 = (zzx) r4.poll();
     */
    /* JADX WARN: Code restructure failed: missing block: B:68:0x0177, code lost:
    
        if (r5 == null) goto L70;
     */
    /* JADX WARN: Code restructure failed: missing block: B:69:0x0179, code lost:
    
        r5.g((java.lang.Object) null);
     */
    /* JADX WARN: Code restructure failed: missing block: B:71:0x0181, code lost:
    
        if (r4.isEmpty() == false) goto L73;
     */
    /* JADX WARN: Code restructure failed: missing block: B:72:0x0183, code lost:
    
        r3.remove(r2);
     */
    /* JADX WARN: Code restructure failed: missing block: B:73:0x0186, code lost:
    
        monitor-exit(r3);
     */
    /* JADX WARN: Code restructure failed: missing block: B:76:0x018a, code lost:
    
        throw r0;
     */
    /* JADX WARN: Code restructure failed: missing block: B:77:0x018b, code lost:
    
        r0 = move-exception;
     */
    /* JADX WARN: Code restructure failed: missing block: B:79:0x018d, code lost:
    
        r0 = move-exception;
     */
    /* JADX WARN: Code restructure failed: missing block: B:81:0x0198, code lost:
    
        if ("SERVICE_NOT_AVAILABLE".equals(r0.getMessage()) != false) goto L88;
     */
    /* JADX WARN: Code restructure failed: missing block: B:85:0x01aa, code lost:
    
        if (r0.getMessage() == null) goto L86;
     */
    /* JADX WARN: Code restructure failed: missing block: B:86:0x01ac, code lost:
    
        android.util.Log.e("FirebaseMessaging", "Topic operation failed without exception message. Will retry Topic operation.");
     */
    /* JADX WARN: Code restructure failed: missing block: B:87:0x01b4, code lost:
    
        throw r0;
     */
    /* JADX WARN: Code restructure failed: missing block: B:88:0x01b5, code lost:
    
        android.util.Log.e("FirebaseMessaging", "Topic operation failed: " + r0.getMessage() + ". Will retry Topic operation.");
     */
    /* JADX WARN: Code restructure failed: missing block: B:89:0x01d4, code lost:
    
        r8.b.c(r8.h);
     */
    /* JADX WARN: Type inference failed for: r5v1, types: [ajwi, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r5v10, types: [ajwi, java.lang.Object] */
    @Override // java.lang.Runnable
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void run() {
        /*
            Method dump skipped, instruction units count: 560
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.ajya.run():void");
    }
}
