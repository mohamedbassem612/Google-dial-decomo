package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes.dex */
public final /* synthetic */ class ahjn implements java.lang.Runnable {
    private final /* synthetic */ int $cid;
    public final /* synthetic */ java.lang.Object a;

    public ahjn(defpackage.ahoh ahohVar, int i) {
        this.$cid = i;
        j$.util.Objects.requireNonNull(ahohVar);
        this.a = ahohVar;
    }

    /* JADX WARN: Code duplicated, block: B:76:0x01bb A[LOOP:5: B:74:0x01b5->B:76:0x01bb, LOOP_END] */
    /* JADX WARN: Type inference failed for: r0v20, types: [ajcq, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r0v28, types: [aoin, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r0v37, types: [java.lang.Object, java.util.concurrent.Future] */
    /* JADX WARN: Type inference failed for: r0v49, types: [ajcq, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r0v53, types: [java.lang.AutoCloseable, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r0v65, types: [anzt, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r0v66, types: [anzt, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r1v15, types: [aoir, java.lang.Object] */
    @Override // java.lang.Runnable
    public final void run() {
        java.util.Iterator it;
        defpackage.aaum aaumVarR;
        defpackage.apjz apjzVarA;
        long jNanoTime;
        int i = 2;
        switch (this.$cid) {
            case 0:
                ?? r0 = this.a;
                if (r0.isCancelled()) {
                    return;
                }
                defpackage.afec.a().post(defpackage.ahqx.h(new defpackage.ahjn((java.lang.Object) r0, i)));
                return;
            case 1:
                java.lang.Object obj = this.a;
                try {
                    if (((j$.util.Optional) ((defpackage.ajxm) obj).b.a()).isPresent()) {
                        final defpackage.ajxm ajxmVar = (defpackage.ajxm) obj;
                        ((defpackage.aewq) ((defpackage.ajxm) obj).c).h.a(defpackage.ajsw.TIKTOK, new defpackage.aezg() { // from class: ahcf
                            /* JADX WARN: Type inference failed for: r2v3, types: [java.lang.Object, java.util.Set] */
                            @Override // defpackage.aezg
                            public final boolean a(java.util.List list) {
                                defpackage.ajxm ajxmVar2;
                                defpackage.aooh.c(list);
                                java.util.ArrayList<java.lang.String> arrayList = new java.util.ArrayList();
                                java.util.Iterator it2 = list.iterator();
                                while (true) {
                                    ajxmVar2 = ajxmVar;
                                    if (!it2.hasNext()) {
                                        break;
                                    }
                                    java.lang.Object next = it2.next();
                                    java.lang.String str = (java.lang.String) next;
                                    java.lang.Object obj2 = ajxmVar2.e;
                                    defpackage.aooh.c(str);
                                    ((defpackage.ahda) obj2).b(str);
                                    arrayList.add(next);
                                }
                                if (arrayList.isEmpty()) {
                                    return false;
                                }
                                for (java.lang.String str2 : arrayList) {
                                    java.lang.Object obj3 = ajxmVar2.a;
                                    defpackage.aooh.c(str2);
                                    defpackage.aooh.f(str2, "updatedPackage");
                                    if (((defpackage.zzx) obj3).a.contains(str2)) {
                                        return true;
                                    }
                                }
                                return false;
                            }
                        });
                        return;
                    }
                    return;
                } catch (java.lang.Throwable th) {
                    ((defpackage.aimw) ((defpackage.aimw) ((defpackage.aimz) ((defpackage.ajxm) obj).f.a()).c()).k(th).l("com/google/apps/tiktok/experiments/phenotype/PackageChangedListener", "maybeRegisterListener$<anonymous>", 42, "PackageChangedListener.kt")).v("Failed to register flag update listener");
                    return;
                }
            case 2:
                ?? r1 = this.a;
                try {
                    defpackage.ahvr.cc(r1.isDone(), "Future was expected to be done: %s", r1);
                    defpackage.a.h(r1);
                    return;
                } catch (java.util.concurrent.ExecutionException e) {
                    if (e.getCause() instanceof agpf) {
                        ((defpackage.aimw) ((defpackage.aimw) ((defpackage.aimw) defpackage.ahjq.a.c()).k(e)).l("com/google/apps/tiktok/receiver/IntentFilterAcledReceiver", "crashOnException", (char) 296, "IntentFilterAcledReceiver.java")).v("Got unexpected accountId. Was the account removed?");
                        return;
                    }
                    if (!(e.getCause() instanceof java.util.concurrent.TimeoutException)) {
                        defpackage.ahrc.k(e.getCause());
                        return;
                    }
                    java.lang.Throwable cause = e.getCause();
                    int i2 = defpackage.ahrc.a;
                    ahnn.a(cause);
                    defpackage.ahpj ahpjVar = ((defpackage.ahpe) defpackage.ahns.d.get()).c;
                    defpackage.ahrc ahrcVar = new defpackage.ahrc(cause, defpackage.ahrc.l(ahpjVar, null));
                    defpackage.ahrc.i(ahpjVar, ahrcVar);
                    defpackage.ahrc.g(ahpjVar, ahrcVar);
                    throw ahrcVar;
                } catch (java.lang.Throwable th2) {
                    defpackage.ahrc.k(th2);
                    return;
                }
            case 3:
                ((android.content.BroadcastReceiver.PendingResult) this.a).finish();
                return;
            case 4:
                defpackage.ahlt.j(this.a);
                return;
            case 5:
                ((defpackage.ahmw) this.a).a = null;
                return;
            case defpackage.eft.STRING_SET_FIELD_NUMBER /* 6 */:
                break;
            case defpackage.eft.DOUBLE_FIELD_NUMBER /* 7 */:
                defpackage.ajcp ajcpVar = defpackage.ajbg.a;
                try {
                    this.a.close();
                    return;
                } catch (java.lang.Exception e2) {
                    defpackage.aiql.p(e2);
                    defpackage.ajbg.a.a().logp(java.util.logging.Level.WARNING, "com.google.common.util.concurrent.ClosingFuture", "closeQuietly", "thrown by close()", (java.lang.Throwable) e2);
                    return;
                }
            case defpackage.eft.BYTES_FIELD_NUMBER /* 8 */:
                java.lang.Object obj2 = this.a;
                defpackage.ajbf ajbfVar = defpackage.ajbf.c;
                defpackage.ajbf ajbfVar2 = defpackage.ajbf.d;
                defpackage.ajbe ajbeVar = (defpackage.ajbe) obj2;
                ajbeVar.b(ajbfVar, ajbfVar2);
                ajbeVar.c();
                ajbeVar.b(ajbfVar2, defpackage.ajbf.e);
                return;
            case 9:
                ((defpackage.ajwh) this.a).k();
                return;
            case 10:
                com.google.firebase.messaging.FirebaseMessaging firebaseMessaging = (com.google.firebase.messaging.FirebaseMessaging) this.a;
                if (firebaseMessaging.h()) {
                    firebaseMessaging.f();
                    return;
                }
                return;
            case 11:
                com.google.firebase.messaging.FirebaseMessaging firebaseMessaging2 = (com.google.firebase.messaging.FirebaseMessaging) this.a;
                android.content.Context context = firebaseMessaging2.d;
                defpackage.ajsz.x(context);
                boolean zI = firebaseMessaging2.i();
                android.content.SharedPreferences sharedPreferencesW = defpackage.ajsz.w(context);
                if (!sharedPreferencesW.contains("proxy_retention") || sharedPreferencesW.getBoolean("proxy_retention", false) != zI) {
                    defpackage.aabo aaboVar = (defpackage.aabo) firebaseMessaging2.e.c;
                    if (aaboVar.e.a() >= 241100000) {
                        android.os.Bundle bundle = new android.os.Bundle();
                        bundle.putBoolean("proxy_retention", zI);
                        aaumVarR = afiq.c(aaboVar.d).a(4, bundle);
                    } else {
                        aaumVarR = defpackage.aazc.r(new java.io.IOException("SERVICE_NOT_AVAILABLE"));
                    }
                    aaumVarR.p(new fjq(10), new ajxp(context, zI));
                }
                if (firebaseMessaging2.i()) {
                    firebaseMessaging2.c();
                    return;
                }
                return;
            case 12:
                this.a.a(true);
                return;
            case 13:
                this.a.a(false);
                return;
            case 14:
                defpackage.anzg anzgVar = ((defpackage.anyv) this.a).a;
                defpackage.ahvr.bZ(anzgVar.B.get(), "Channel must have been shut down");
                anzgVar.D = true;
                anzgVar.k(false);
                anzgVar.h();
                anzgVar.i();
                return;
            case 15:
                defpackage.anzg anzgVar2 = (defpackage.anzg) this.a;
                if (anzgVar2.u != null) {
                    anzgVar2.k(true);
                    defpackage.anwn anwnVar = anzgVar2.z;
                    anwnVar.a(null);
                    anzgVar2.K.c(defpackage.anzg.f);
                    anzgVar2.I.a(2, "Entering IDLE state");
                    anzgVar2.p.a(defpackage.anmm.d);
                    defpackage.anxt anxtVar = anzgVar2.S;
                    java.lang.Object[] objArr = {anzgVar2.y, anwnVar};
                    for (int i3 = 0; i3 < 2; i3++) {
                        if (anxtVar.a.contains(objArr[i3])) {
                            anzgVar2.g();
                            return;
                        }
                    }
                    return;
                }
                return;
            default:
                java.lang.Object obj3 = this.a;
                synchronized (obj3) {
                    ((defpackage.apkc) obj3).c++;
                    apjzVarA = ((defpackage.apkc) obj3).a();
                }
                if (apjzVarA != null) {
                    java.lang.Thread threadCurrentThread = java.lang.Thread.currentThread();
                    java.lang.String name = threadCurrentThread.getName();
                    do {
                        defpackage.apjz apjzVar = apjzVarA;
                        try {
                            threadCurrentThread.setName(apjzVar.a);
                            java.lang.Object obj4 = this.a;
                            java.util.logging.Logger logger = ((defpackage.apkc) obj4).b;
                            defpackage.apkb apkbVar = apjzVar.c;
                            if (apkbVar == null) {
                                defpackage.aooh.g();
                            }
                            boolean zIsLoggable = logger.isLoggable(java.util.logging.Level.FINE);
                            if (zIsLoggable) {
                                defpackage.apkc apkcVar = apkbVar.a;
                                jNanoTime = java.lang.System.nanoTime();
                                antw.v(logger, apjzVar, apkbVar, "starting");
                            } else {
                                jNanoTime = -1;
                            }
                            try {
                                long jA = apjzVar.a();
                                if (zIsLoggable) {
                                    defpackage.apkc apkcVar2 = apkbVar.a;
                                    antw.v(logger, apjzVar, apkbVar, "finished run in " + antw.u(java.lang.System.nanoTime() - jNanoTime));
                                }
                                synchronized (obj4) {
                                    ((defpackage.apkc) obj4).c(apjzVar, jA, true);
                                    apjzVarA = ((defpackage.apkc) obj4).a();
                                }
                            } catch (java.lang.Throwable th3) {
                                if (zIsLoggable) {
                                    defpackage.apkc apkcVar3 = apkbVar.a;
                                    antw.v(logger, apjzVar, apkbVar, "failed a run in " + antw.u(java.lang.System.nanoTime() - jNanoTime));
                                }
                                throw th3;
                            }
                        } catch (java.lang.Throwable th4) {
                            try {
                                java.lang.Object obj5 = this.a;
                                synchronized (obj5) {
                                    ((defpackage.apkc) obj5).c(apjzVar, -1L, false);
                                    if (!(th4 instanceof java.lang.InterruptedException)) {
                                        throw th4;
                                    }
                                    java.lang.Thread.currentThread().interrupt();
                                }
                            } catch (java.lang.Throwable th5) {
                                threadCurrentThread.setName(name);
                                throw th5;
                            }
                        }
                    } while (apjzVarA != null);
                    threadCurrentThread.setName(name);
                    return;
                }
                return;
        }
        while (true) {
            try {
                try {
                    java.lang.Object obj6 = this.a;
                    if (((defpackage.ahoh) obj6).c.isShutdown()) {
                        try {
                            ((defpackage.ahoh) this.a).c.execute(this);
                            return;
                        } catch (java.util.concurrent.RejectedExecutionException e3) {
                            java.util.Iterator it2 = defpackage.ahoh.a.keySet().iterator();
                            while (it2.hasNext()) {
                                ((defpackage.ahog) it2.next()).a.p(e3);
                            }
                            return;
                        }
                    }
                    defpackage.ahof ahofVar = ((defpackage.ahog) ((defpackage.ahoh) obj6).b.remove()).a;
                    int i4 = defpackage.ahof.b;
                    ahofVar.o(null);
                } catch (java.util.concurrent.RejectedExecutionException e4) {
                    it = defpackage.ahoh.a.keySet().iterator();
                    while (it.hasNext()) {
                        ((defpackage.ahog) it.next()).a.p(e4);
                    }
                    return;
                }
            } catch (java.lang.InterruptedException unused) {
                ((defpackage.ahoh) this.a).c.execute(this);
                return;
            } catch (java.lang.Throwable th6) {
                try {
                    ((defpackage.ahoh) this.a).c.execute(this);
                    throw th6;
                } catch (java.util.concurrent.RejectedExecutionException e5) {
                    java.util.Iterator it3 = defpackage.ahoh.a.keySet().iterator();
                    while (it3.hasNext()) {
                        ((defpackage.ahog) it3.next()).a.p(e5);
                    }
                    throw th6;
                }
            }
            it = defpackage.ahoh.a.keySet().iterator();
            while (it.hasNext()) {
                ((defpackage.ahog) it.next()).a.p(e4);
            }
            return;
        }
    }

    public /* synthetic */ ahjn(java.lang.Object obj, int i) {
        this.$cid = i;
        this.a = obj;
    }

    public ahjn(defpackage.apkc apkcVar, int i) {
        this.$cid = i;
        this.a = apkcVar;
    }

    public ahjn(defpackage.anwn anwnVar, defpackage.anzt anztVar, int i) {
        this.$cid = i;
        this.a = anztVar;
        j$.util.Objects.requireNonNull(anwnVar);
    }

    public ahjn(defpackage.anwn anwnVar, defpackage.anzt anztVar, int i, byte[] bArr) {
        this.$cid = i;
        this.a = anztVar;
        j$.util.Objects.requireNonNull(anwnVar);
    }

    public ahjn(defpackage.anwn anwnVar, defpackage.anzt anztVar, int i, char[] cArr) {
        this.$cid = i;
        this.a = anztVar;
        j$.util.Objects.requireNonNull(anwnVar);
    }

    public ahjn(defpackage.anzg anzgVar, int i) {
        this.$cid = i;
        j$.util.Objects.requireNonNull(anzgVar);
        this.a = anzgVar;
    }
}
