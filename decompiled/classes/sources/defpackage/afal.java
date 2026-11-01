package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes.dex */
public final class afal implements defpackage.afah {
    private final defpackage.aoin a;

    public afal(defpackage.aoin aoinVar) {
        this.a = aoinVar;
    }

    @Override // defpackage.afah
    public final void a() {
        java.lang.Thread.setDefaultUncaughtExceptionHandler(new defpackage.afak(this, java.lang.Thread.getDefaultUncaughtExceptionHandler(), 0));
    }

    /* JADX WARN: Code duplicated, block: B:68:0x012e  */
    /* JADX WARN: Multi-variable type inference failed */
    public final /* synthetic */ void b(java.lang.Thread.UncaughtExceptionHandler uncaughtExceptionHandler, java.lang.Thread thread, java.lang.Throwable th) {
        boolean z;
        long jElapsedRealtime = android.os.SystemClock.elapsedRealtime();
        try {
            java.util.ArrayList arrayList = new java.util.ArrayList();
            if (thread == android.os.Looper.getMainLooper().getThread()) {
                java.util.Set set = (java.util.Set) this.a.a();
                java.util.ArrayList arrayList2 = new java.util.ArrayList(set.size());
                java.util.Iterator it = set.iterator();
                while (true) {
                    int i = 0;
                    if (!it.hasNext()) {
                        break;
                    }
                    try {
                        defpackage.ahqm ahqmVar = ((defpackage.ahnz) it.next()).a;
                        if (!ahqmVar.d().isEmpty() && android.util.Log.isLoggable("trace_manager", 4)) {
                            android.util.Log.i("trace_manager", "The following traces were active when the app crashed:");
                            defpackage.ailk ailkVarListIterator = ((defpackage.aify) ahqmVar.d()).listIterator(0);
                            while (ailkVarListIterator.hasNext()) {
                                defpackage.ahra ahraVar = (defpackage.ahra) ailkVarListIterator.next();
                                android.util.Log.println(4, "trace_manager", defpackage.a.bj(i, "Trace: "));
                                defpackage.ahnz.b(ahraVar.c, 4);
                                i++;
                            }
                        }
                        defpackage.ajcq ajcqVar = defpackage.ajcm.a;
                        arrayList2.add(ajcqVar);
                    } catch (java.lang.Throwable th2) {
                        arrayList.add(th2);
                    }
                    if (uncaughtExceptionHandler != null) {
                        uncaughtExceptionHandler.uncaughtException(thread, th);
                    }
                    throw th;
                }
                defpackage.ajcq[] ajcqVarArr = (defpackage.ajcq[]) arrayList2.toArray(new defpackage.ajcq[0]);
                ajcf ajcfVar = new ajcf(ajcqVarArr);
                defpackage.aift aiftVarD = defpackage.aify.d(ajcqVarArr.length);
                for (int i2 = 0; i2 < ajcqVarArr.length; i2++) {
                    aiftVarD.i(new ajce(ajcfVar));
                }
                defpackage.aify aifyVarG = aiftVarD.g();
                for (int i3 = 0; i3 < ajcqVarArr.length; i3++) {
                    ajcqVarArr[i3].c(new mo(ajcfVar, aifyVarG, i3, 17), defpackage.ajbm.INSTANCE);
                }
                defpackage.ailk ailkVarListIterator2 = aifyVarG.listIterator(0);
                while (ailkVarListIterator2.hasNext()) {
                    defpackage.ajcq ajcqVar2 = (defpackage.ajcq) ailkVarListIterator2.next();
                    try {
                        try {
                            long nanos = java.util.concurrent.TimeUnit.MILLISECONDS.toNanos(4000 - (android.os.SystemClock.elapsedRealtime() - jElapsedRealtime));
                            long jNanoTime = java.lang.System.nanoTime() + nanos;
                            z = false;
                            while (true) {
                                try {
                                    try {
                                        ajcqVar2.get(nanos, java.util.concurrent.TimeUnit.NANOSECONDS);
                                        break;
                                    } catch (java.lang.InterruptedException unused) {
                                        z = true;
                                        nanos = jNanoTime - java.lang.System.nanoTime();
                                    }
                                } catch (java.lang.Throwable th3) {
                                    th = th3;
                                    if (z) {
                                        java.lang.Thread.currentThread().interrupt();
                                    }
                                    throw th;
                                }
                            }
                            if (z) {
                                java.lang.Thread.currentThread().interrupt();
                            }
                        } catch (java.lang.Throwable th4) {
                            th = th4;
                            z = false;
                        }
                    } catch (java.util.concurrent.TimeoutException e) {
                        arrayList.add(e);
                    } catch (java.lang.Throwable th5) {
                        arrayList.add(th5);
                    }
                }
            }
            java.util.Iterator it2 = arrayList.iterator();
            while (it2.hasNext()) {
                ((java.lang.Throwable) it2.next()).printStackTrace();
            }
            if (uncaughtExceptionHandler != null) {
                uncaughtExceptionHandler.uncaughtException(thread, th);
            }
        } catch (java.lang.Throwable th6) {
            if (uncaughtExceptionHandler != null) {
                uncaughtExceptionHandler.uncaughtException(thread, th);
            }
            throw th6;
        }
    }
}
