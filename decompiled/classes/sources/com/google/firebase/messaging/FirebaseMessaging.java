package com.google.firebase.messaging;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes.dex */
public class FirebaseMessaging {
    public static defpackage.ajwe a;
    static java.util.concurrent.ScheduledExecutorService b;
    private static final long i;
    private static defpackage.ajyk p;
    public final defpackage.ajtc c;
    public final android.content.Context d;
    public final defpackage.ajxm e;
    public final java.util.concurrent.Executor f;
    public final defpackage.ajxo g;
    public final defpackage.gou h;
    private final defpackage.ajxk j;
    private final java.util.concurrent.Executor k;
    private final defpackage.aaum l;
    private final defpackage.ajwi m;
    private boolean n = false;
    private final android.app.Application.ActivityLifecycleCallbacks o;
    private final defpackage.apni q;

    static {
        java.util.concurrent.TimeUnit timeUnit = java.util.concurrent.TimeUnit.HOURS;
        i = 28800L;
        a = new defpackage.ajur(5);
    }

    public FirebaseMessaging(defpackage.ajtc ajtcVar, defpackage.ajwd ajwdVar, defpackage.ajwe ajweVar, defpackage.ajvo ajvoVar, defpackage.ajxo ajxoVar, defpackage.ajxm ajxmVar, defpackage.ajwi ajwiVar, java.util.concurrent.Executor executor, java.util.concurrent.Executor executor2, java.util.concurrent.Executor executor3) {
        int i2 = 0;
        a = ajweVar;
        this.c = ajtcVar;
        this.j = new defpackage.ajxk(this, ajvoVar);
        android.content.Context contextA = ajtcVar.a();
        this.d = contextA;
        defpackage.ajxg ajxgVar = new defpackage.ajxg();
        this.o = ajxgVar;
        this.g = ajxoVar;
        this.e = ajxmVar;
        this.m = ajwiVar;
        defpackage.gou gouVar = new defpackage.gou(contextA, ajtcVar, ajwiVar, ajxmVar, ajxoVar);
        this.h = gouVar;
        this.q = new defpackage.apni(executor);
        this.k = executor2;
        this.f = executor3;
        android.content.Context contextA2 = ajtcVar.a();
        if (contextA2 instanceof android.app.Application) {
            ((android.app.Application) contextA2).registerActivityLifecycleCallbacks(ajxgVar);
        } else {
            android.util.Log.w("FirebaseMessaging", defpackage.a.bJ(contextA2, "Context ", " was not an application, can't register for lifecycle callbacks. Some notification events may be dropped as a result."));
        }
        if (ajwdVar != null && !gouVar.v()) {
            ajwdVar.a(new defpackage.apnt(this));
        }
        if (gouVar.v()) {
            ajwiVar.m(new aprf(this));
        }
        executor2.execute(new defpackage.ahjn(this, 10));
        java.util.concurrent.ScheduledThreadPoolExecutor scheduledThreadPoolExecutor = new java.util.concurrent.ScheduledThreadPoolExecutor(1, new defpackage.aaiv("Firebase-Messaging-Topics-Io"));
        int i3 = defpackage.ajxy.d;
        defpackage.aaum aaumVarQ = defpackage.aazc.q(scheduledThreadPoolExecutor, new defpackage.ajxx(contextA, scheduledThreadPoolExecutor, ajxoVar, ajtcVar, this, ajwiVar, 0));
        this.l = aaumVarQ;
        aaumVarQ.p(executor2, new defpackage.ajxh(this, i2));
        executor2.execute(new defpackage.ahjn(this, 11));
    }

    @java.lang.Deprecated
    static synchronized com.google.firebase.messaging.FirebaseMessaging getInstance(defpackage.ajtc ajtcVar) {
        com.google.firebase.messaging.FirebaseMessaging firebaseMessaging;
        firebaseMessaging = (com.google.firebase.messaging.FirebaseMessaging) ajtcVar.d(com.google.firebase.messaging.FirebaseMessaging.class);
        defpackage.aais.at(firebaseMessaging, "Firebase Messaging component is not present");
        return firebaseMessaging;
    }

    public static final void l(java.lang.Runnable runnable, long j) {
        synchronized (com.google.firebase.messaging.FirebaseMessaging.class) {
            if (b == null) {
                b = new java.util.concurrent.ScheduledThreadPoolExecutor(1, new defpackage.aaiv("TAG"));
            }
            b.schedule(runnable, j, java.util.concurrent.TimeUnit.SECONDS);
        }
    }

    public static synchronized defpackage.ajyk n(android.content.Context context) {
        defpackage.ajyk ajykVar;
        ajykVar = p;
        if (ajykVar == null) {
            ajykVar = new defpackage.ajyk(context);
            p = ajykVar;
        }
        return ajykVar;
    }

    public final defpackage.ajxs a() {
        return n(this.d).b(b(), defpackage.a.f(this.c));
    }

    public final java.lang.String b() {
        defpackage.ajtc ajtcVar = this.c;
        return "[DEFAULT]".equals(ajtcVar.e()) ? "" : ajtcVar.f();
    }

    public final void c() {
        defpackage.aabo aaboVar = (defpackage.aabo) this.e.c;
        (aaboVar.e.a() >= 241100000 ? afiq.c(aaboVar.d).b(5, android.os.Bundle.EMPTY).b(defpackage.aabo.a, new aabm(0)) : defpackage.aazc.r(new java.io.IOException("SERVICE_NOT_AVAILABLE"))).p(this.k, new riw(this, 3));
    }

    public final synchronized void d(boolean z) {
        this.n = z;
    }

    public final synchronized void e() {
        if (!this.n) {
            g(0L);
        }
    }

    public final void f() {
        if (j(a())) {
            e();
        }
    }

    public final synchronized void g(long j) {
        l(new ajxu(this, java.lang.Math.min(java.lang.Math.max(30L, j << 1), i)), j);
        this.n = true;
    }

    public final boolean h() {
        return this.j.b();
    }

    public final boolean i() {
        android.content.Context context = this.d;
        defpackage.ajsz.x(context);
        if (!defpackage.ajsz.y(context)) {
            android.util.Log.e("FirebaseMessaging", "error retrieving notification delegate for package ".concat(java.lang.String.valueOf(context.getPackageName())));
            return false;
        }
        if (!"com.google.android.gms".equals(da$.ExternalSyntheticApiModelOutline0.m((android.app.NotificationManager) context.getSystemService(android.app.NotificationManager.class)))) {
            return false;
        }
        if (android.util.Log.isLoggable("FirebaseMessaging", 3)) {
            android.util.Log.d("FirebaseMessaging", "GMS core is set for proxying");
        }
        return this.c.d(defpackage.ajti.class) != null || (defpackage.ajsz.D() && a != null);
    }

    final boolean j(defpackage.ajxs ajxsVar) {
        java.lang.String str;
        if (ajxsVar == null) {
            return true;
        }
        defpackage.ajxo ajxoVar = this.g;
        long j = ajxsVar.d;
        java.lang.String strC = ajxoVar.c();
        if (java.lang.System.currentTimeMillis() > j + defpackage.ajxs.a || !strC.equals(ajxsVar.c)) {
            return true;
        }
        if (this.h.v()) {
            try {
                str = (java.lang.String) defpackage.aazc.t(this.m.a());
            } catch (java.lang.InterruptedException | java.util.concurrent.ExecutionException unused) {
                str = null;
            }
            if (!ajxsVar.b.equalsIgnoreCase(str)) {
                return true;
            }
        } else if (ajxsVar.b.length() <= 22) {
            return true;
        }
        return false;
    }

    public final java.lang.String k() throws java.io.IOException {
        defpackage.ajxs ajxsVarA = a();
        if (!j(ajxsVarA)) {
            return ajxsVarA.b;
        }
        defpackage.ajtc ajtcVar = this.c;
        defpackage.apni apniVar = this.q;
        java.lang.String strF = defpackage.a.f(ajtcVar);
        try {
            return (java.lang.String) defpackage.aazc.t(apniVar.c(strF, new ajxi(this, strF, ajxsVarA)));
        } catch (java.lang.InterruptedException | java.util.concurrent.ExecutionException e) {
            throw new java.io.IOException("FCM Registration failed!", e);
        }
    }

    public final void m(java.lang.String str) {
        defpackage.ajtc ajtcVar = this.c;
        if ("[DEFAULT]".equals(ajtcVar.e())) {
            if (android.util.Log.isLoggable("FirebaseMessaging", 3)) {
                android.util.Log.d("FirebaseMessaging", "Invoking onNewToken for app: ".concat(java.lang.String.valueOf(ajtcVar.e())));
            }
            boolean zV = this.h.v();
            android.content.Intent intent = new android.content.Intent();
            intent.putExtra("token", str);
            if (zV) {
                intent.setAction("com.google.firebase.messaging.FCM_REGISTERED");
            } else {
                intent.setAction("com.google.firebase.messaging.NEW_TOKEN");
            }
            ajxf.b(intent, this.d, new fjq(8));
        }
    }
}
