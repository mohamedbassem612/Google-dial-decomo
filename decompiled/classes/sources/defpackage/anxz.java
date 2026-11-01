package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes.dex */
public final class anxz implements java.lang.Runnable {
    private final /* synthetic */ int $cid;
    final /* synthetic */ java.lang.Object a;
    final /* synthetic */ java.lang.Object b;

    public anxz(anyh anyhVar, defpackage.anqw anqwVar, int i, byte[] bArr) {
        this.$cid = i;
        this.a = anqwVar;
        j$.util.Objects.requireNonNull(anyhVar);
        this.b = anyhVar;
    }

    /* JADX WARN: Type inference failed for: r0v15, types: [java.lang.Object, java.lang.Runnable] */
    /* JADX WARN: Type inference failed for: r0v58, types: [aodl, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r0v69, types: [apwn, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r0v71, types: [apwn, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r0v76, types: [apwn, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r6v41, types: [aosb, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r6v47, types: [java.lang.Object, java.lang.Runnable] */
    /* JADX WARN: Type inference failed for: r6v58, types: [java.lang.Object, java.lang.Runnable] */
    @Override // java.lang.Runnable
    public final void run() {
        aobt aobtVar;
        boolean z = true;
        aobo aoboVar = null;
        switch (this.$cid) {
            case 0:
                java.util.ArrayList arrayList = new java.util.ArrayList(((anyh) this.b).l);
                int size = arrayList.size();
                for (int i = 0; i < size; i++) {
                    ((defpackage.anzu) arrayList.get(i)).r((defpackage.anqw) this.a);
                }
                return;
            case 1:
                anyh anyhVar = (anyh) this.b;
                defpackage.anmm anmmVar = anyhVar.p.a;
                defpackage.anmm anmmVar2 = defpackage.anmm.e;
                if (anmmVar != anmmVar2) {
                    defpackage.anqw anqwVar = (defpackage.anqw) this.a;
                    anyhVar.q = anqwVar;
                    defpackage.anzu anzuVar = anyhVar.o;
                    anwc anwcVar = anyhVar.n;
                    anyhVar.o = null;
                    anyh.j(anyhVar);
                    anyhVar.d(anmmVar2);
                    anyhVar.h.c();
                    if (anyhVar.l.isEmpty()) {
                        anyhVar.f();
                    }
                    anyhVar.g.c();
                    apjb apjbVar = anyhVar.v;
                    if (apjbVar != null) {
                        apjbVar.j();
                        anyhVar.v = null;
                        anyhVar.u = null;
                    }
                    apjb apjbVar2 = anyhVar.w;
                    if (apjbVar2 != null) {
                        apjbVar2.j();
                        anyhVar.k.q(anqwVar);
                        anyhVar.w = null;
                        anyhVar.k = null;
                    }
                    if (anzuVar != null) {
                        anzuVar.q(anqwVar);
                    }
                    if (anwcVar != null) {
                        anwcVar.q(anqwVar);
                        return;
                    }
                    return;
                }
                return;
            case 2:
                ((anyz) this.b).g((defpackage.anqw) this.a);
                return;
            case 3:
                defpackage.anzd anzdVar = (defpackage.anzd) this.b;
                if (anzdVar.a.get() != defpackage.anzg.f) {
                    ((anzc) this.a).dO();
                    return;
                }
                defpackage.anzg anzgVar = anzdVar.c;
                if (anzgVar.x == null) {
                    anzgVar.x = new java.util.LinkedHashSet();
                    anzgVar.S.c(anzgVar.y, true);
                }
                java.util.Collection collection = anzgVar.x;
                java.lang.Object obj = this.a;
                collection.add(obj);
                ((anzc) obj).dN();
                return;
            case 4:
                this.b.run();
                anzc anzcVar = (anzc) this.a;
                anzcVar.m.c.n.execute(new anwo(anzcVar, 20));
                return;
            case 5:
                java.lang.Object obj2 = this.a;
                java.lang.Object obj3 = ((aaed) obj2).b;
                java.lang.Object obj4 = ((aobu) obj3).m;
                synchronized (obj4) {
                    if (!((aobo) ((aaed) obj2).a).c) {
                        ((aobu) obj3).r = ((aobu) obj3).r.a((aobs) this.b);
                        if (((aobu) obj3).w(((aobu) obj3).r) && ((aobtVar = ((aobu) obj3).p) == null || aobtVar.a())) {
                            aoboVar = new aobo(obj4);
                            ((aobu) obj3).y = aoboVar;
                        } else {
                            ((aobu) obj3).r = ((aobu) obj3).r.b();
                            ((aobu) obj3).y = null;
                        }
                        z = false;
                    }
                    break;
                }
                if (z) {
                    aobs aobsVar = (aobs) this.b;
                    aobsVar.a.m(new aobr((aobu) ((aaed) this.a).b, aobsVar));
                    aobsVar.a.c(defpackage.anqw.c.f("Unneeded hedging"));
                    return;
                }
                if (aoboVar != null) {
                    aobu aobuVar = (aobu) ((aaed) this.a).b;
                    aoboVar.b(aobuVar.i.schedule(new aaed(aobuVar, aoboVar, 2), aobuVar.k.b, java.util.concurrent.TimeUnit.NANOSECONDS));
                }
                ((aobu) ((aaed) this.a).b).t((aobs) this.b);
                return;
            case defpackage.eft.STRING_SET_FIELD_NUMBER /* 6 */:
                ((aobr) this.b).b.w.c((defpackage.anph) this.a);
                return;
            case defpackage.eft.DOUBLE_FIELD_NUMBER /* 7 */:
                ((aobr) ((apwa) this.a).a).b.t((aobs) this.b);
                return;
            case defpackage.eft.BYTES_FIELD_NUMBER /* 8 */:
                ((aobr) this.a).b.t((aobs) this.b);
                return;
            case 9:
                ((aobr) this.a).b.w.d((aodl) this.b);
                return;
            case 10:
                try {
                    ((java.util.concurrent.CyclicBarrier) this.b).await(1000L, java.util.concurrent.TimeUnit.MILLISECONDS);
                    ((java.util.concurrent.CountDownLatch) this.a).await();
                    return;
                } catch (java.lang.InterruptedException unused) {
                    java.lang.Thread.currentThread().interrupt();
                    return;
                } catch (java.util.concurrent.BrokenBarrierException | java.util.concurrent.TimeoutException unused2) {
                    return;
                }
            case 11:
                this.a.f((defpackage.aosp) this.b, defpackage.aojh.a);
                return;
            case 12:
                ((defpackage.apdm) this.b).g(this.a, defpackage.aojh.a);
                return;
            case 13:
                int i2 = aput.b;
                try {
                    ((apww) this.b).onRequestFinished((org.chromium.net.RequestFinishedInfo) this.a);
                    return;
                } catch (java.lang.Exception e) {
                    android.util.Log.e("cn_HttpEngineWrapper", "Exception thrown from observation task", e);
                    return;
                }
            case 14:
                new xkn("JavaUploadDataSinkBase#executeOnExecutor " + ((java.lang.String) this.b) + " running callback", 3, (byte[]) null);
                try {
                    this.a.run();
                    android.os.Trace.endSection();
                    return;
                } catch (java.lang.Throwable th) {
                    try {
                        android.os.Trace.endSection();
                        break;
                    } catch (java.lang.Throwable th2) {
                        th.addSuppressed(th2);
                    }
                    throw th;
                }
            case 15:
                try {
                    this.b.a();
                    return;
                } catch (java.lang.Throwable th3) {
                    ((apwm) this.a).b(new apvl("System error", th3));
                    return;
                }
            case 16:
                try {
                    this.b.a();
                    return;
                } catch (java.lang.Throwable th4) {
                    ((apwm) this.a).c(th4);
                    return;
                }
            case 17:
                apwm apwmVar = (apwm) this.b;
                java.lang.String str = apwmVar.p;
                apwk apwkVar = apwmVar.b;
                apwkVar.a(new apwj(apwkVar, (org.chromium.net.UrlResponseInfo) this.a, str, 0), "onRedirectReceived");
                return;
            case 18:
                try {
                    this.b.a();
                    return;
                } catch (java.lang.Throwable th5) {
                    java.lang.Object obj5 = this.a;
                    aobd aobdVar = new aobd(obj5, 17);
                    apwm apwmVar2 = (apwm) obj5;
                    apwmVar2.d(aobdVar, "enterUserErrorState");
                    apwmVar2.b(new apvh("Exception received from UrlRequest.Callback", th5));
                    return;
                }
            case 19:
                java.lang.String str2 = apwm.a;
                new xkn("Cronet JavaUrlRequest#executeOnExecutor " + ((java.lang.String) this.b) + " running callback", 3, (byte[]) null);
                try {
                    this.a.run();
                    android.os.Trace.endSection();
                    return;
                } catch (java.lang.Throwable th6) {
                    try {
                        android.os.Trace.endSection();
                        break;
                    } catch (java.lang.Throwable th7) {
                        th6.addSuppressed(th7);
                    }
                    throw th6;
                }
            default:
                java.lang.Object obj6 = this.b;
                java.lang.Object obj7 = this.a;
                ((apwm) obj7).d(new defpackage.anxz(obj7, obj6, 15), "read");
                return;
        }
    }

    public /* synthetic */ anxz(java.lang.Object obj, java.lang.Object obj2, int i, byte[] bArr) {
        this.$cid = i;
        this.b = obj;
        this.a = obj2;
    }

    public /* synthetic */ anxz(java.lang.Object obj, java.lang.Object obj2, int i) {
        this.$cid = i;
        this.a = obj;
        this.b = obj2;
    }

    public anxz(anyh anyhVar, defpackage.anqw anqwVar, int i) {
        this.$cid = i;
        this.a = anqwVar;
        j$.util.Objects.requireNonNull(anyhVar);
        this.b = anyhVar;
    }

    public anxz(anyz anyzVar, defpackage.anqw anqwVar, int i) {
        this.$cid = i;
        this.a = anqwVar;
        j$.util.Objects.requireNonNull(anyzVar);
        this.b = anyzVar;
    }

    public anxz(defpackage.anzd anzdVar, anzc anzcVar, int i) {
        this.$cid = i;
        this.a = anzcVar;
        j$.util.Objects.requireNonNull(anzdVar);
        this.b = anzdVar;
    }

    public anxz(anzc anzcVar, java.lang.Runnable runnable, int i) {
        this.$cid = i;
        this.b = runnable;
        j$.util.Objects.requireNonNull(anzcVar);
        this.a = anzcVar;
    }

    public anxz(aaed aaedVar, aobs aobsVar, int i) {
        this.$cid = i;
        this.b = aobsVar;
        j$.util.Objects.requireNonNull(aaedVar);
        this.a = aaedVar;
    }

    public anxz(aobr aobrVar, defpackage.anph anphVar, int i) {
        this.$cid = i;
        this.a = anphVar;
        j$.util.Objects.requireNonNull(aobrVar);
        this.b = aobrVar;
    }

    public anxz(apwa apwaVar, aobs aobsVar, int i) {
        this.$cid = i;
        this.b = aobsVar;
        j$.util.Objects.requireNonNull(apwaVar);
        this.a = apwaVar;
    }

    public anxz(aobr aobrVar, aobs aobsVar, int i) {
        this.$cid = i;
        this.b = aobsVar;
        j$.util.Objects.requireNonNull(aobrVar);
        this.a = aobrVar;
    }

    public anxz(aobr aobrVar, aodl aodlVar, int i) {
        this.$cid = i;
        this.b = aodlVar;
        j$.util.Objects.requireNonNull(aobrVar);
        this.a = aobrVar;
    }

    public anxz(aofk aofkVar, java.util.concurrent.CyclicBarrier cyclicBarrier, java.util.concurrent.CountDownLatch countDownLatch, int i) {
        this.$cid = i;
        this.b = cyclicBarrier;
        this.a = countDownLatch;
        j$.util.Objects.requireNonNull(aofkVar);
    }
}
