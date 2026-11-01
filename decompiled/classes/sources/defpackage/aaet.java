package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes.dex */
public final class aaet implements android.os.Handler.Callback {
    public static defpackage.aaet d;
    public final android.content.Context g;
    public final defpackage.aabx h;
    public final defpackage.aaha i;
    public final java.util.Set p;
    public final java.util.Set q;
    public final android.os.Handler r;
    public volatile boolean s;
    private com.google.android.gms.common.internal.TelemetryData v;
    private defpackage.aahq w;
    private android.util.SparseArray x;
    private aagj y;
    private volatile uzx z;
    public static final com.google.android.gms.common.api.Status a = new com.google.android.gms.common.api.Status(4, "Sign-out occurred while this API call was in progress.", null, null);
    public static final com.google.android.gms.common.api.Status b = new com.google.android.gms.common.api.Status(4, "The user must be signed in to make this API call.", null, null);
    public static final java.lang.Object c = new java.lang.Object();
    private static final java.lang.Object t = new java.lang.Object();
    private static volatile boolean u = false;
    public long e = 10000;
    public boolean f = false;
    public final java.util.concurrent.atomic.AtomicInteger j = new java.util.concurrent.atomic.AtomicInteger(1);
    public final java.util.concurrent.atomic.AtomicInteger k = new java.util.concurrent.atomic.AtomicInteger(0);
    public final java.util.Map l = new j$.util.concurrent.ConcurrentHashMap(5, 0.75f, 1);
    public aael m = null;
    public final java.util.Set n = new defpackage.acc(0);
    public final java.util.Set o = new defpackage.acc(0);

    private aaet(android.content.Context context, android.os.Looper looper, defpackage.aabx aabxVar) {
        new java.util.WeakHashMap();
        this.p = java.util.Collections.newSetFromMap(new java.util.WeakHashMap());
        this.q = java.util.Collections.newSetFromMap(new java.util.WeakHashMap());
        this.s = true;
        this.g = context;
        defpackage.aanh aanhVar = new defpackage.aanh(looper, this);
        this.r = aanhVar;
        this.h = aabxVar;
        this.i = new defpackage.aaha(aabxVar);
        if (defpackage.aain.a(context)) {
            this.s = false;
        }
        aanhVar.sendMessage(aanhVar.obtainMessage(6));
    }

    public static com.google.android.gms.common.api.Status a(defpackage.aadx aadxVar, com.google.android.gms.common.ConnectionResult connectionResult) {
        return new com.google.android.gms.common.api.Status(connectionResult, "API: " + aadxVar.a() + " is not available on this device. Connection failed with: " + java.lang.String.valueOf(connectionResult));
    }

    public static defpackage.aaet c(android.content.Context context) {
        defpackage.aaet aaetVar;
        synchronized (c) {
            aaetVar = d;
            if (aaetVar == null) {
                android.os.Looper looper = defpackage.aagv.a().getLooper();
                boolean zA = defpackage.aagt.a(context.getPackageName());
                u = zA;
                defpackage.aaet aaetVar2 = new defpackage.aaet(context.getApplicationContext(), looper, defpackage.aabx.a);
                if (zA) {
                    defpackage.aagp.t = defpackage.aagr.a(aaetVar2.g);
                }
                d = aaetVar2;
                aaetVar = aaetVar2;
            }
        }
        return aaetVar;
    }

    private final defpackage.aaeo k(defpackage.aada aadaVar) {
        java.util.Map map = this.l;
        defpackage.aadx aadxVar = aadaVar.f;
        defpackage.aaeo aaeoVar = (defpackage.aaeo) map.get(aadxVar);
        if (aaeoVar == null) {
            aaeoVar = new defpackage.aaeo(this, aadaVar);
            map.put(aadxVar, aaeoVar);
            this.p.remove(aadxVar);
            this.q.remove(aadxVar);
        }
        if (aaeoVar.q()) {
            this.o.add(aadxVar);
        }
        aaeoVar.d();
        return aaeoVar;
    }

    private final defpackage.aahq l() {
        if (this.w == null) {
            this.w = new defpackage.aaid(this.g, defpackage.aahr.a);
        }
        return this.w;
    }

    private final void m() {
        com.google.android.gms.common.internal.TelemetryData telemetryData = this.v;
        if (telemetryData != null) {
            if (telemetryData.a > 0 || g()) {
                l().a(telemetryData);
            }
            this.v = null;
        }
    }

    private final void n() {
        android.util.SparseArray sparseArray = this.x;
        if (sparseArray != null) {
            if (sparseArray.size() > 0) {
                java.util.ArrayList arrayList = new java.util.ArrayList(sparseArray.size());
                android.content.Context context = this.g;
                java.lang.String packageName = context.getPackageName();
                for (int i = 0; i < sparseArray.size(); i++) {
                    int iKeyAt = sparseArray.keyAt(i);
                    aaes aaesVar = (aaes) sparseArray.valueAt(i);
                    arrayList.add(new com.google.android.gms.common.internal.ClientThrottlingTelemetryData.ClientThrottlingEventData(iKeyAt, packageName, aaesVar.a, aaesVar.b));
                }
                if (this.y == null) {
                    this.y = new aaib(context);
                }
                this.y.a(new com.google.android.gms.common.internal.ClientThrottlingTelemetryData(arrayList));
            }
            this.x = null;
        }
    }

    final defpackage.aaeo b(defpackage.aadx aadxVar) {
        return (defpackage.aaeo) this.l.get(aadxVar);
    }

    public final void d(com.google.android.gms.common.ConnectionResult connectionResult, int i) {
        if (h(connectionResult, i)) {
            return;
        }
        android.os.Handler handler = this.r;
        handler.sendMessage(handler.obtainMessage(5, i, 0, connectionResult));
    }

    public final void e() {
        android.os.Handler handler = this.r;
        handler.sendMessage(handler.obtainMessage(3));
    }

    public final void f(aael aaelVar) {
        synchronized (c) {
            if (this.m != aaelVar) {
                this.m = aaelVar;
                this.n.clear();
            }
            this.n.addAll(aaelVar.e);
        }
    }

    final boolean g() {
        if (this.f) {
            return false;
        }
        com.google.android.gms.common.internal.RootTelemetryConfiguration rootTelemetryConfiguration = defpackage.aaho.a().a;
        if (rootTelemetryConfiguration != null && !rootTelemetryConfiguration.b) {
            return false;
        }
        int iB = this.i.b(203400000);
        return iB == -1 || iB == 0;
    }

    final boolean h(com.google.android.gms.common.ConnectionResult connectionResult, int i) {
        android.app.PendingIntent pendingIntentA;
        android.os.Bundle bundle;
        defpackage.aabx aabxVar = this.h;
        int i2 = connectionResult.c;
        if (!aabxVar.f(i2)) {
            android.util.Log.w("GoogleApiManager", "Not showing notification since connectionResult is not user-facing: ".concat(java.lang.String.valueOf(java.lang.String.valueOf(connectionResult))));
            return false;
        }
        android.content.Context context = this.g;
        if (defpackage.aehj.bN(context) || (pendingIntentA = aabxVar.a(context, connectionResult)) == null) {
            return false;
        }
        android.content.Intent intentA = com.google.android.gms.common.api.GoogleApiActivity.a(context, pendingIntentA, i, true);
        int i3 = aane.b | 134217728;
        boolean z = aane.a;
        android.app.PendingIntent activity = android.app.PendingIntent.getActivity(context, 0, intentA, i3);
        android.os.Bundle bundle2 = connectionResult.f;
        if (bundle2 != null) {
            bundle = new android.os.Bundle(bundle2);
            if (bundle2.containsKey("pendingIntent")) {
                bundle.putParcelable("pendingIntent", activity);
            }
        } else {
            bundle = null;
        }
        aabxVar.j(context, new com.google.android.gms.common.ConnectionResult(connectionResult.b, i2, activity, connectionResult.d, connectionResult.e, bundle));
        return true;
    }

    /* JADX WARN: Code duplicated, block: B:148:0x0352  */
    /* JADX WARN: Code duplicated, block: B:157:0x037a  */
    /* JADX WARN: Code duplicated, block: B:159:0x0380  */
    /* JADX WARN: Code duplicated, block: B:160:0x03a8  */
    /* JADX WARN: Code duplicated, block: B:161:0x03b3  */
    /* JADX WARN: Type inference failed for: r3v30, types: [java.lang.Object, java.util.Map] */
    /* JADX WARN: Type inference failed for: r4v19, types: [java.lang.Object, java.util.Map] */
    /*  JADX ERROR: JadxRuntimeException in pass: IfRegionVisitor
        jadx.core.utils.exceptions.JadxRuntimeException: Can't remove SSA var: r3v16 aaeo, still in use, count: 2, list:
          (r3v16 aaeo) from 0x0372: IGET (r3v16 aaeo) A[WRAPPED] (LINE:883) aaeo.g int
          (r3v16 aaeo) from 0x0378: PHI (r3 I:??) = (r3v13 aaeo), (r3v16 aaeo) binds: [B:155:0x0377, B:223:0x0378] A[DONT_GENERATE, DONT_INLINE]
        	at jadx.core.utils.InsnRemover.removeSsaVar(InsnRemover.java:164)
        	at jadx.core.utils.InsnRemover.unbindResult(InsnRemover.java:129)
        	at jadx.core.utils.InsnRemover.unbindInsn(InsnRemover.java:93)
        	at jadx.core.dex.visitors.regions.TernaryMod.makeTernaryInsn(TernaryMod.java:132)
        	at jadx.core.dex.visitors.regions.TernaryMod.processRegion(TernaryMod.java:67)
        	at jadx.core.dex.visitors.regions.TernaryMod.enterRegion(TernaryMod.java:50)
        	at jadx.core.dex.visitors.regions.DepthRegionTraversal.traverseInternal(DepthRegionTraversal.java:96)
        	at jadx.core.dex.visitors.regions.DepthRegionTraversal.traverse(DepthRegionTraversal.java:27)
        	at jadx.core.dex.visitors.regions.TernaryMod.process(TernaryMod.java:36)
        	at jadx.core.dex.visitors.regions.IfRegionVisitor.process(IfRegionVisitor.java:44)
        	at jadx.core.dex.visitors.regions.IfRegionVisitor.visit(IfRegionVisitor.java:30)
        */
    @Override // android.os.Handler.Callback
    public final boolean handleMessage(android.os.Message r18) {
        /*
            Method dump skipped, instruction units count: 1294
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.aaet.handleMessage(android.os.Message):boolean");
    }

    /* JADX WARN: Code duplicated, block: B:21:0x0044  */
    public final void i(defpackage.zzx zzxVar, int i, defpackage.aada aadaVar) {
        defpackage.aaet aaetVar;
        long j;
        long jElapsedRealtime;
        if (i != 0) {
            defpackage.aadx aadxVar = aadaVar.f;
            defpackage.aaff aaffVar = null;
            if (g()) {
                com.google.android.gms.common.internal.RootTelemetryConfiguration rootTelemetryConfiguration = defpackage.aaho.a().a;
                boolean z = true;
                if (rootTelemetryConfiguration != null) {
                    if (rootTelemetryConfiguration.b) {
                        boolean z2 = rootTelemetryConfiguration.c;
                        defpackage.aaeo aaeoVarB = b(aadxVar);
                        if (aaeoVarB != null) {
                            java.lang.Object obj = aaeoVarB.b;
                            if (obj instanceof defpackage.aagf) {
                                defpackage.aagf aagfVar = (defpackage.aagf) obj;
                                if (!aagfVar.H() || aagfVar.p()) {
                                    z = z2;
                                } else {
                                    com.google.android.gms.common.internal.ConnectionTelemetryConfiguration connectionTelemetryConfigurationB = defpackage.aaff.b(aaeoVarB, aagfVar, i);
                                    if (connectionTelemetryConfigurationB != null) {
                                        aaeoVarB.k++;
                                        z = connectionTelemetryConfigurationB.c;
                                    }
                                }
                            }
                        } else {
                            z = z2;
                        }
                    }
                    aaetVar = this;
                }
                if (z) {
                    long jCurrentTimeMillis = java.lang.System.currentTimeMillis();
                    jElapsedRealtime = android.os.SystemClock.elapsedRealtime();
                    j = jCurrentTimeMillis;
                } else {
                    j = 0;
                    jElapsedRealtime = 0;
                }
                aaetVar = this;
                aaffVar = new defpackage.aaff(aaetVar, i, aadxVar, j, jElapsedRealtime);
            } else {
                aaetVar = this;
            }
            if (aaffVar != null) {
                java.lang.Object obj2 = zzxVar.a;
                android.os.Handler handler = aaetVar.r;
                j$.util.Objects.requireNonNull(handler);
                ((defpackage.aaum) obj2).n(new fbk(handler, 3), aaffVar);
            }
        }
    }

    public final uzx j() {
        uzx uzxVar = this.z;
        if (uzxVar == null) {
            synchronized (t) {
                uzxVar = this.z;
                if (uzxVar == null) {
                    uzxVar = new uzx((byte[]) null, (byte[]) null);
                    this.z = uzxVar;
                }
            }
        }
        return uzxVar;
    }
}
