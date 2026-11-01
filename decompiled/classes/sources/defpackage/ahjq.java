package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes.dex */
public class ahjq extends android.content.BroadcastReceiver implements defpackage.ahjm {
    public static final defpackage.aimz a = defpackage.aimz.i("com/google/apps/tiktok/receiver/IntentFilterAcledReceiver");
    public long b;
    public defpackage.ajcu c;
    private final java.lang.Class d;
    private defpackage.aoin e;

    protected ahjq(java.lang.Class cls) {
        this.d = cls;
    }

    protected defpackage.ahjr a(java.lang.Object obj) {
        throw null;
    }

    @Override // defpackage.ahjm
    public final /* synthetic */ long b() {
        return -1L;
    }

    @Override // defpackage.ahjm
    public final /* synthetic */ long c() {
        return -1L;
    }

    @Override // android.content.BroadcastReceiver
    public final void onReceive(android.content.Context context, final android.content.Intent intent) {
        android.content.pm.ResolveInfo resolveInfo;
        java.lang.String name;
        ahmt ahmxVar;
        defpackage.ahpj ahpjVar;
        defpackage.ajcq ajddVar;
        java.util.List list;
        java.lang.String str;
        if (context.getApplicationContext().getClass() == android.app.Application.class && (str = context.getApplicationInfo().className) != null && !android.app.Application.class.getName().equals(str)) {
            android.util.Log.e("BroadcastError", "While attempting to launch " + getClass().getName() + " the Application class " + str + " was not created. This is known to happen with backup/restore operations. To avoid breaking an in-progress restore, this broadcast will be dropped and not processed.");
            return;
        }
        defpackage.ahjp ahjpVar = (defpackage.ahjp) defpackage.agab.aH(context, defpackage.ahjp.class);
        ahjpVar.mv();
        this.b = j$.time.Duration.ofMillis(android.os.SystemClock.uptimeMillis()).toMillis();
        this.c = ahjpVar.fL();
        this.e = ahjpVar.hX();
        ahjpVar.jg();
        defpackage.ahou ahouVar = defpackage.ahot.a;
        ahjpVar.jf();
        try {
            intent.hasExtra("foo");
            java.util.List<android.content.pm.ResolveInfo> listQueryBroadcastReceivers = context.getPackageManager().queryBroadcastReceivers(new android.content.Intent(context, getClass()), 786432);
            int i = 0;
            defpackage.ahpj ahpjVar2 = null;
            android.content.pm.ResolveInfo resolveInfo2 = listQueryBroadcastReceivers.isEmpty() ? null : listQueryBroadcastReceivers.get(0);
            try {
                java.lang.String name2 = getClass().getName();
                if (resolveInfo2 == null) {
                    resolveInfo = null;
                } else {
                    if (!name2.equals(resolveInfo2.activityInfo.name)) {
                        throw new java.lang.IllegalArgumentException("ResolveInfo did not match receiver name: " + java.lang.String.valueOf(getClass()) + " != " + resolveInfo2.activityInfo.name);
                    }
                    resolveInfo = resolveInfo2;
                }
                if (resolveInfo != null && resolveInfo.activityInfo.exported) {
                    android.content.pm.PackageManager packageManager = context.getPackageManager();
                    android.content.Intent intentCloneFilter = intent.setComponent(null).cloneFilter();
                    intentCloneFilter.setSelector(null);
                    intentCloneFilter.setPackage(context.getPackageName());
                    java.util.Iterator<android.content.pm.ResolveInfo> it = packageManager.queryBroadcastReceivers(intentCloneFilter, 269221952).iterator();
                    while (true) {
                        if (it.hasNext()) {
                            android.content.pm.ResolveInfo next = it.next();
                            if (name2.equals(next.activityInfo.name)) {
                                android.content.IntentFilter intentFilter = next.filter;
                                if (intentFilter == null) {
                                    throw null;
                                }
                                if (!intentFilter.matchAction(intent.getAction())) {
                                    throw new defpackage.afaq(intent);
                                }
                                if (intentFilter.matchCategories(intent.getCategories()) != null) {
                                    throw new defpackage.afaq(intent);
                                }
                                java.lang.String type = intent.getType();
                                int iMatchData = intentFilter.matchData(type, intent.getScheme(), intent.getData());
                                if (iMatchData == -2) {
                                    throw new defpackage.afaq(intent);
                                }
                                if (iMatchData != -1) {
                                    break;
                                }
                                if (type != null) {
                                    throw new defpackage.afaq(intent);
                                }
                                int iMatchData2 = intentFilter.matchData(intent.resolveType(context), intent.getScheme(), intent.getData());
                                if (iMatchData2 != -1 && iMatchData2 != -2) {
                                    break;
                                } else {
                                    throw new defpackage.afaq(intent);
                                }
                            }
                        } else {
                            android.content.pm.PackageManager packageManager2 = context.getPackageManager();
                            synchronized (defpackage.afar.a) {
                                if (defpackage.afar.b == null) {
                                    android.content.Intent intent2 = new android.content.Intent();
                                    intent2.setPackage(context.getPackageName());
                                    defpackage.afar.b = packageManager2.queryBroadcastReceivers(intent2, 0);
                                }
                                list = defpackage.afar.b;
                            }
                            java.util.Iterator it2 = list.iterator();
                            while (it2.hasNext()) {
                                if (name2.equals(((android.content.pm.ResolveInfo) it2.next()).activityInfo.name)) {
                                    throw new defpackage.afaq(intent);
                                }
                            }
                        }
                    }
                }
                try {
                    defpackage.ahda ahdaVarMu = ahjpVar.mu();
                    if (context == null) {
                        defpackage.aooh.i("context");
                    }
                    if (intent == null) {
                        defpackage.aooh.i("intent");
                    }
                    if (resolveInfo2 != null) {
                        name = getClass().getName();
                        if (name == null) {
                            defpackage.aooh.g();
                        }
                    } else {
                        name = "anonymous";
                    }
                    java.lang.String str2 = "Broadcast to " + name + (intent.getAction() != null ? " ".concat(java.lang.String.valueOf(intent.getAction())) : "");
                    long j = defpackage.ahqx.a;
                    defpackage.ahpj ahpjVarP = defpackage.ahqx.p(intent);
                    if (ahpjVarP != null) {
                        ahmxVar = new ahmt(defpackage.ahda.c(str2), defpackage.ahns.d((defpackage.ahpe) defpackage.ahns.d.get(), ahpjVarP), 4);
                    } else {
                        if (defpackage.afec.h(java.lang.Thread.currentThread()) && !defpackage.ahns.q() && (ahpjVar = defpackage.ahns.k) != null) {
                            defpackage.ahns.k = null;
                            ahpjVar2 = ahpjVar;
                        }
                        if (ahpjVar2 != null) {
                            defpackage.ahns.d((defpackage.ahpe) defpackage.ahns.d.get(), ahpjVar2);
                            ahmxVar = new ahmt(defpackage.ahda.c(str2), ahpjVar2, 5);
                        } else {
                            ahmxVar = new defpackage.ahmx(((defpackage.ahpz) ahdaVarMu.a).g(1420, str2), 0);
                        }
                    }
                    try {
                        isOrderedBroadcast();
                        defpackage.ahoq ahoqVarX = defpackage.ahvr.X(1400, "getEntryPoint", defpackage.ahot.a, true);
                        try {
                            try {
                                java.lang.Object objAH = defpackage.agab.aH(context, this.d);
                                ajddVar = objAH == null ? defpackage.ajcm.a : new defpackage.ajcm(objAH);
                            } catch (java.lang.IllegalStateException e) {
                                ajddVar = new defpackage.ajdd(new java.lang.IllegalStateException("Missing entry point. If you're in a test with explicit entry points specified in your @TestRoot, check that you're not missing the one for this class.", e));
                            }
                            ahoqVarX.a(ajddVar);
                            ahoqVarX.close();
                            final int resultCode = getResultCode();
                            defpackage.ahoq ahoqVarX2 = defpackage.ahvr.X(1401, "handleBroadcast", ahouVar, true);
                            try {
                                int i2 = 3;
                                j$.lang.Iterable.-EL.forEach((java.util.Set) ((defpackage.amyw) this.e).b, new defpackage.agyk(3));
                                defpackage.ajax ajaxVar = new defpackage.ajax(defpackage.ahns.c(false), new defpackage.ajat() { // from class: ahjo
                                    @Override // defpackage.ajat
                                    public final defpackage.ajcq a(java.lang.Object obj) {
                                        long jC;
                                        defpackage.ahjq ahjqVar = this.a;
                                        defpackage.ahjr ahjrVarA = ahjqVar.a(obj);
                                        if (ahjrVarA == null) {
                                            ((defpackage.aimw) ((defpackage.aimw) defpackage.ahjq.a.c()).l("com/google/apps/tiktok/receiver/IntentFilterAcledReceiver", "handleUnorderedBroadcast", 196, "IntentFilterAcledReceiver.java")).v("Ordered receiver got unordered broadcast.");
                                            return defpackage.ajcm.a;
                                        }
                                        int i3 = resultCode;
                                        android.content.Intent intent3 = intent;
                                        defpackage.ajcq ajcqVarA = ahjrVarA.a(intent3, i3);
                                        if (ajcqVarA == null) {
                                            throw new java.lang.NullPointerException("onReceive must return a ListenableFuture.");
                                        }
                                        if (ahjrVarA instanceof defpackage.ahjm) {
                                            defpackage.ahjm ahjmVar = (defpackage.ahjm) ahjrVarA;
                                            jC = (intent3.getFlags() & 268435456) != 0 ? ahjmVar.c() : ahjmVar.b();
                                        } else {
                                            jC = -1;
                                        }
                                        if (jC <= 0) {
                                            return ajcqVarA;
                                        }
                                        return defpackage.ahvr.C(defpackage.aiql.G(ajcqVarA, jC - (j$.time.Duration.ofMillis(android.os.SystemClock.uptimeMillis()).toMillis() - ahjqVar.b), java.util.concurrent.TimeUnit.MILLISECONDS, ahjqVar.c), java.util.concurrent.TimeoutException.class, new agvj(2), defpackage.ajbm.INSTANCE);
                                    }
                                }, 1);
                                defpackage.ajbm ajbmVar = defpackage.ajbm.INSTANCE;
                                int i3 = defpackage.ajan.c;
                                defpackage.ajal ajalVar = new defpackage.ajal(ajddVar, ajaxVar);
                                ajddVar.c(ajalVar, defpackage.aiql.t(ajbmVar, ajalVar));
                                ahoqVarX2.a(ajalVar);
                                ahoqVarX2.close();
                                if (!ajalVar.isDone()) {
                                    android.content.BroadcastReceiver.PendingResult pendingResultGoAsync = goAsync();
                                    j$.util.Objects.requireNonNull(pendingResultGoAsync);
                                    ajalVar.c(defpackage.ahqx.h(new defpackage.ahjn(pendingResultGoAsync, i2)), defpackage.ajbm.INSTANCE);
                                }
                                ajalVar.c(defpackage.ahqx.h(new defpackage.ahjn(ajalVar, i)), defpackage.ajbm.INSTANCE);
                                ahmxVar.close();
                            } catch (java.lang.Throwable th) {
                                try {
                                    ahoqVarX2.close();
                                    throw th;
                                } catch (java.lang.Throwable th2) {
                                    th.addSuppressed(th2);
                                    throw th;
                                }
                            }
                        } catch (java.lang.Throwable th3) {
                            try {
                                ahoqVarX.close();
                                throw th3;
                            } catch (java.lang.Throwable th4) {
                                th3.addSuppressed(th4);
                                throw th3;
                            }
                        }
                    } catch (java.lang.Throwable th5) {
                        try {
                            ahmxVar.close();
                            throw th5;
                        } catch (java.lang.Throwable th6) {
                            th5.addSuppressed(th6);
                            throw th5;
                        }
                    }
                } catch (java.lang.Throwable th7) {
                    ahzn.c(th7);
                    throw new java.lang.RuntimeException(th7);
                }
            } catch (defpackage.afaq e2) {
                ((defpackage.aimw) ((defpackage.aimw) ((defpackage.aimw) a.c()).k(e2)).l("com/google/apps/tiktok/receiver/IntentFilterAcledReceiver", "onReceive", 136, "IntentFilterAcledReceiver.java")).y("Got unexpected intent: %s", intent);
            }
        } catch (java.lang.Throwable th8) {
            ((defpackage.aimw) ((defpackage.aimw) ((defpackage.aimw) a.c()).k(th8)).l("com/google/apps/tiktok/receiver/IntentFilterAcledReceiver", "onReceive", 'x', "IntentFilterAcledReceiver.java")).v("Got invalid intent");
        }
    }
}
