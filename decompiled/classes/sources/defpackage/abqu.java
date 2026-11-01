package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes.dex */
public final /* synthetic */ class abqu implements java.lang.Runnable {
    private final /* synthetic */ int $cid;
    public final /* synthetic */ java.lang.Object a;
    public final /* synthetic */ java.lang.Object b;

    public abqu(defpackage.ahpj ahpjVar, java.lang.Runnable runnable, int i) {
        this.$cid = i;
        this.a = ahpjVar;
        this.b = runnable;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v1, types: [java.lang.Object, java.lang.Runnable] */
    /* JADX WARN: Type inference failed for: r0v21, types: [android.view.ViewTreeObserver$OnDrawListener, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r0v29, types: [java.lang.Object, java.util.concurrent.Executor] */
    /* JADX WARN: Type inference failed for: r0v30, types: [ajcq, java.lang.Object, java.util.concurrent.Future] */
    /* JADX WARN: Type inference failed for: r0v33, types: [ajcq, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r0v34, types: [ajcq, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r0v35, types: [ajcq, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r0v56, types: [java.lang.Object, java.lang.Runnable] */
    /* JADX WARN: Type inference failed for: r0v6, types: [adfq, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r0v65, types: [java.lang.Object, java.lang.Runnable] */
    /* JADX WARN: Type inference failed for: r1v10, types: [aoin, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r1v32, types: [java.lang.Object, java.lang.Runnable] */
    /* JADX WARN: Type inference failed for: r1v33, types: [java.lang.Object, java.util.concurrent.Future] */
    /* JADX WARN: Type inference failed for: r1v36, types: [ajcq, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r1v4, types: [java.lang.Object, java.lang.Runnable] */
    /* JADX WARN: Type inference failed for: r1v40, types: [aepd, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r1v5, types: [ajcq, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r1v7, types: [java.lang.Object, java.lang.Runnable] */
    /* JADX WARN: Type inference failed for: r3v2, types: [ahpj, java.lang.Object] */
    @Override // java.lang.Runnable
    public final void run() {
        android.content.pm.PackageManager.NameNotFoundException nameNotFoundException;
        switch (this.$cid) {
            case 0:
                ((defpackage.abqx) this.a).a.removeCallbacks(this.b);
                return;
            case 1:
                ((defpackage.ajbw) this.a).execute(this.b);
                return;
            case 2:
                ((defpackage.adnp) this.a).d(this.b);
                return;
            case 3:
                this.a.a(this.b);
                return;
            case 4:
                this.b.run();
                ((defpackage.aelg) this.a).a = false;
                return;
            case 5:
                boolean zBooleanValue = ((java.lang.Boolean) ((defpackage.ahys) this.b).a.a()).booleanValue();
                java.lang.Object obj = this.a;
                if (zBooleanValue) {
                    synchronized (obj) {
                        ((defpackage.aesf) obj).a = true;
                        android.app.Activity activity = ((defpackage.aesf) obj).b;
                        if (activity != null) {
                            ((defpackage.aesf) obj).c(activity);
                        }
                        ((defpackage.aesf) obj).b = null;
                        break;
                    }
                    return;
                }
                return;
            case defpackage.eft.STRING_SET_FIELD_NUMBER /* 6 */:
                ((defpackage.aeta) this.b).c.d.a(6, ((defpackage.aenj) this.a).a);
                return;
            case defpackage.eft.DOUBLE_FIELD_NUMBER /* 7 */:
                ((android.view.View) this.a).getViewTreeObserver().removeOnDrawListener(this.b);
                return;
            case defpackage.eft.BYTES_FIELD_NUMBER /* 8 */:
                java.util.Map mapA = defpackage.aezd.a(((defpackage.aewq) this.a).c);
                java.lang.Object obj2 = this.b;
                if (mapA.containsKey(obj2)) {
                    return;
                }
                android.util.Log.e("FilePhenotypeFlags", defpackage.a.bk((java.lang.String) obj2, "Config package ", " cannot use FILE backing without declarative registration. See go/phenotype-android-integration#phenotype for more information. This will lead to stale flags."));
                return;
            case 9:
                if (((defpackage.ajcr) this.b).isCancelled()) {
                    ((android.os.CancellationSignal) ((defpackage.adag) this.a).b).cancel();
                    return;
                }
                return;
            case 10:
                this.b.execute(this.a);
                return;
            case 11:
                this.b.cancel(true);
                ?? r0 = this.a;
                if (r0.isCancelled()) {
                    return;
                }
                try {
                    defpackage.ahvr.cc(r0.isDone(), "Future was expected to be done: %s", r0);
                    defpackage.a.h(r0);
                    return;
                } catch (java.util.concurrent.ExecutionException e) {
                    defpackage.ahrc.k(e.getCause());
                    return;
                }
            case 12:
                if (this.a.isCancelled()) {
                    this.b.cancel(true);
                    return;
                }
                return;
            case 13:
                defpackage.agtg.b(this.a, (java.lang.String) this.b);
                return;
            case 14:
                com.google.apps.tiktok.contrib.work.TikTokListenableWorker.c(this.b, this.a);
                return;
            case 15:
                java.lang.Object obj3 = this.b;
                java.lang.Object obj4 = this.a;
                try {
                    try {
                        try {
                            android.content.pm.ServiceInfo serviceInfo = ((defpackage.agvd) obj4).e.getServiceInfo(new android.content.ComponentName(((defpackage.agvd) obj4).b, "androidx.work.impl.background.systemjob.SystemJobService"), 262144);
                            boolean zEquals = j$.util.Objects.equals(serviceInfo.processName, obj3);
                            ((defpackage.aimw) ((defpackage.aimw) defpackage.agvd.a.b()).l("com/google/apps/tiktok/contrib/work/impl/DefaultProcessValidator", "validateInternal", 91, "DefaultProcessValidator.java")).N("Processes: %s, %s, %s, %s", ((defpackage.agvd) obj4).f, java.lang.Boolean.valueOf(zEquals), serviceInfo.processName, obj3);
                            if (zEquals) {
                                return;
                            }
                            int iOrdinal = ((defpackage.agvd) obj4).f.ordinal();
                            if (iOrdinal == 1) {
                                ((defpackage.aimw) ((defpackage.aimw) defpackage.agvd.a.c()).l("com/google/apps/tiktok/contrib/work/impl/DefaultProcessValidator", "validateInternal", 118, "DefaultProcessValidator.java")).I("WorkManager's Manifest components must have the same process as the configured defaultProcessName (%s). It was found in (%s). If you are moving the WorkManager defaultProcess, use both TikTokWorkManagerClientConfiguration#setDefaultProcessName() and Manifest overrides to set the processes for the components defined in android/platform/frameworks/support/androidx-main/work/work-runtime/src/main/AndroidManifest.xml", obj3, serviceInfo.processName);
                                return;
                            } else {
                                if (iOrdinal == 2) {
                                    ((defpackage.aimw) ((defpackage.aimw) defpackage.agvd.a.d()).l("com/google/apps/tiktok/contrib/work/impl/DefaultProcessValidator", "validateInternal", 113, "DefaultProcessValidator.java")).v("Invalid process");
                                    throw new java.lang.IllegalStateException(java.lang.String.format("WorkManager's Manifest components must have the same process as the configured defaultProcessName (%s). It was found in (%s). If you are moving the WorkManager defaultProcess, use both TikTokWorkManagerClientConfiguration#setDefaultProcessName() and Manifest overrides to set the processes for the components defined in android/platform/frameworks/support/androidx-main/work/work-runtime/src/main/AndroidManifest.xml", obj3, serviceInfo.processName));
                                }
                                return;
                            }
                        } catch (android.content.pm.PackageManager.NameNotFoundException e2) {
                            nameNotFoundException = e2;
                            ((defpackage.aimw) ((defpackage.aimw) ((defpackage.aimw) defpackage.agvd.a.d()).k(nameNotFoundException)).l("com/google/apps/tiktok/contrib/work/impl/DefaultProcessValidator", "validateInternal", 'd', "DefaultProcessValidator.java")).v("The WorkManager SystemJobService could not be found. If you are trying to disable WorkManager, make sure not to initialize it.");
                            return;
                        }
                    } catch (android.content.pm.PackageManager.NameNotFoundException e3) {
                        nameNotFoundException = e3;
                    }
                } catch (java.lang.RuntimeException e4) {
                    ((defpackage.aimw) ((defpackage.aimw) ((defpackage.aimw) defpackage.agvd.a.d()).k(e4)).l("com/google/apps/tiktok/contrib/work/impl/DefaultProcessValidator", "validateInternal", 'j', "DefaultProcessValidator.java")).v("Failed to look up WorkManager manifest process");
                    return;
                }
                break;
            case 16:
                defpackage.ahpe ahpeVar = (defpackage.ahpe) defpackage.ahns.d.get();
                defpackage.ahpj ahpjVar = ahpeVar.d;
                ahpeVar.d = this.a;
                try {
                    this.b.run();
                    defpackage.ahpj ahpjVar2 = ahpeVar.d;
                    ahpeVar.d = ahpjVar;
                    return;
                } catch (java.lang.Throwable th) {
                    try {
                        ahnn.b(th);
                        throw th;
                    } catch (java.lang.Throwable th2) {
                        defpackage.ahpj ahpjVar3 = ahpeVar.d;
                        ahpeVar.d = ahpjVar;
                        throw th2;
                    }
                }
            case 17:
                defpackage.ajcp ajcpVar = defpackage.ajbg.a;
                defpackage.ajyk ajykVar = new defpackage.ajyk(this.b, (byte[]) null);
                java.lang.Object obj5 = ((defpackage.apnt) this.a).a;
                synchronized (((defpackage.agxr) obj5).a) {
                    ((defpackage.agxr) obj5).c = ajykVar;
                    break;
                }
                return;
            default:
                defpackage.ajul ajulVar = (defpackage.ajul) this.a;
                android.os.Process.setThreadPriority(ajulVar.a);
                android.os.StrictMode.ThreadPolicy threadPolicy = ajulVar.b;
                if (threadPolicy != null) {
                    android.os.StrictMode.setThreadPolicy(threadPolicy);
                }
                this.b.run();
                return;
        }
    }

    public /* synthetic */ abqu(java.lang.Object obj, java.lang.Object obj2, int i) {
        this.$cid = i;
        this.a = obj;
        this.b = obj2;
    }

    public /* synthetic */ abqu(java.lang.Object obj, java.lang.Object obj2, int i, byte[] bArr) {
        this.$cid = i;
        this.b = obj;
        this.a = obj2;
    }
}
