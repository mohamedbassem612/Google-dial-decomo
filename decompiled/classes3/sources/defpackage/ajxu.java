package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes3.dex */
public final class ajxu implements java.lang.Runnable {
    public final com.google.firebase.messaging.FirebaseMessaging a;
    final java.util.concurrent.ExecutorService b = new java.util.concurrent.ThreadPoolExecutor(0, 1, 30L, java.util.concurrent.TimeUnit.SECONDS, (java.util.concurrent.BlockingQueue<java.lang.Runnable>) new java.util.concurrent.LinkedBlockingQueue(), (java.util.concurrent.ThreadFactory) new aaiv("firebase-iid-executor"));
    private final long c;
    private final android.os.PowerManager.WakeLock d;

    public ajxu(com.google.firebase.messaging.FirebaseMessaging firebaseMessaging, long j) {
        this.a = firebaseMessaging;
        this.c = j;
        android.os.PowerManager.WakeLock wakeLockNewWakeLock = ((android.os.PowerManager) a().getSystemService("power")).newWakeLock(1, "fiid-sync");
        this.d = wakeLockNewWakeLock;
        wakeLockNewWakeLock.setReferenceCounted(false);
    }

    final android.content.Context a() {
        return this.a.d;
    }

    final boolean b() {
        android.net.ConnectivityManager connectivityManager = (android.net.ConnectivityManager) a().getSystemService("connectivity");
        android.net.NetworkInfo activeNetworkInfo = connectivityManager != null ? connectivityManager.getActiveNetworkInfo() : null;
        return activeNetworkInfo != null && activeNetworkInfo.isConnected();
    }

    @Override // java.lang.Runnable
    public final void run() {
        if (defpackage.ajxr.a().c(a())) {
            this.d.acquire();
        }
        try {
            try {
                com.google.firebase.messaging.FirebaseMessaging firebaseMessaging = this.a;
                firebaseMessaging.d(true);
                if (firebaseMessaging.g.e()) {
                    defpackage.ajxr ajxrVarA = defpackage.ajxr.a();
                    android.content.Context contextA = a();
                    if (ajxrVarA.b == null) {
                        ajxrVarA.b = java.lang.Boolean.valueOf(contextA.checkCallingOrSelfPermission("android.permission.ACCESS_NETWORK_STATE") == 0);
                    }
                    if (!ajxrVarA.a.booleanValue() && android.util.Log.isLoggable("FirebaseMessaging", 3)) {
                        android.util.Log.d("FirebaseMessaging", "Missing Permission: android.permission.ACCESS_NETWORK_STATE this should normally be included by the manifest merger, but may needed to be manually added to your manifest");
                    }
                    if (!ajxrVarA.b.booleanValue() || b()) {
                        try {
                            if (firebaseMessaging.k() == null) {
                                android.util.Log.e("FirebaseMessaging", "Token retrieval failed: null");
                                this.a.g(this.c);
                            } else {
                                if (android.util.Log.isLoggable("FirebaseMessaging", 3)) {
                                    android.util.Log.d("FirebaseMessaging", "Token successfully retrieved");
                                }
                                this.a.d(false);
                            }
                        } catch (java.io.IOException e) {
                            java.lang.String message = e.getMessage();
                            if ("SERVICE_NOT_AVAILABLE".equals(message) || "INTERNAL_SERVER_ERROR".equals(message) || "InternalServerError".equals(message)) {
                                android.util.Log.w("FirebaseMessaging", "Token retrieval failed: " + e.getMessage() + ". Will retry token retrieval");
                            } else {
                                if (e.getMessage() != null) {
                                    throw e;
                                }
                                android.util.Log.w("FirebaseMessaging", "Token retrieval failed without exception message. Will retry token retrieval");
                            }
                        } catch (java.lang.SecurityException unused) {
                            android.util.Log.w("FirebaseMessaging", "Token retrieval failed with SecurityException. Will retry token retrieval");
                        }
                    } else {
                        defpackage.ajxt ajxtVar = new defpackage.ajxt(this);
                        if (defpackage.agmc.ae()) {
                            android.util.Log.d("FirebaseMessaging", "Connectivity change received registered");
                        }
                        android.content.IntentFilter intentFilter = new android.content.IntentFilter("android.net.conn.CONNECTIVITY_CHANGE");
                        defpackage.ajxu ajxuVar = ajxtVar.a;
                        if (ajxuVar != null) {
                            ajxtVar.b = ajxuVar.a();
                            ajxtVar.b.registerReceiver(ajxtVar, intentFilter);
                        }
                    }
                } else {
                    firebaseMessaging.d(false);
                }
            } catch (java.io.IOException e2) {
                android.util.Log.e("FirebaseMessaging", "Topic sync or token retrieval failed on hard failure exceptions: " + e2.getMessage() + ". Won't retry the operation.");
                this.a.d(false);
            }
            if (defpackage.ajxr.a().c(a())) {
                this.d.release();
            }
        } catch (java.lang.Throwable th) {
            if (defpackage.ajxr.a().c(a())) {
                this.d.release();
            }
            throw th;
        }
    }
}
