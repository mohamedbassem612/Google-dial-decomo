package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes3.dex */
public final /* synthetic */ class pmx implements java.lang.Runnable {
    private final /* synthetic */ int $cid;
    public final /* synthetic */ java.lang.Object a;

    public /* synthetic */ pmx(java.lang.Object obj, int i) {
        this.$cid = i;
        this.a = obj;
    }

    /* JADX WARN: Type inference failed for: r0v19, types: [aonj, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r0v34, types: [java.lang.Object, java.util.concurrent.ConcurrentMap] */
    /* JADX WARN: Type inference failed for: r15v16, types: [java.lang.Object, znc] */
    /* JADX WARN: Type inference failed for: r15v17, types: [java.lang.Object, znd] */
    /* JADX WARN: Type inference failed for: r15v18, types: [java.lang.Object, znf] */
    /* JADX WARN: Type inference failed for: r15v19, types: [java.lang.Object, puw] */
    /* JADX WARN: Type inference failed for: r15v5, types: [aonj, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r15v6, types: [java.lang.Object, java.util.List] */
    @Override // java.lang.Runnable
    public final void run() {
        switch (this.$cid) {
            case 0:
                defpackage.pnb pnbVar = (defpackage.pnb) this.a;
                java.lang.String str = pnbVar.f.a;
                pnbVar.f(mce.aF, str);
                pnbVar.h(str, qbc.fF, null, false);
                break;
            case 1:
                defpackage.pnb.a.b().l("com/android/dialer/incall/contactgrid/ContactGridSubscriber", "attemptEmittingFirstContactDisplayedEvent$<anonymous>$<anonymous>", 450, "ContactGridSubscriber.kt").v("ContactGrid middle row shown");
                java.lang.Object obj = this.a;
                defpackage.pnb pnbVar2 = (defpackage.pnb) obj;
                java.lang.String str2 = pnbVar2.f.a;
                if (!pnbVar2.h.contains(defpackage.pmz.g)) {
                    j$.util.Optional optionalE = pnbVar2.k.e(str2);
                    defpackage.pmv pmvVar = new defpackage.pmv(new oen(obj, str2, 12), 2);
                    if (true == optionalE.isPresent()) {
                        pmvVar.a.a(optionalE.get());
                    }
                }
                break;
            case 2:
                ?? r15 = this.a;
                java.util.Iterator it = r15.iterator();
                while (it.hasNext()) {
                    ((dsd) it.next()).b((java.lang.Object) null);
                }
                r15.clear();
                break;
            case 3:
                ailj ailjVarK = ((defpackage.pqm) this.a).v.e().k();
                while (ailjVarK.hasNext()) {
                    ((defpackage.zny) ailjVarK.next()).a();
                }
                break;
            case org.chromium.net.UrlRequest$Status.WAITING_FOR_CACHE /* 4 */:
                int i = defpackage.pti.b;
                ((defpackage.ptt) ((defpackage.oyx) this.a).a).a();
                break;
            case org.chromium.net.UrlRequest$Status.DOWNLOADING_PAC_FILE /* 5 */:
                this.a.a();
                break;
            case org.chromium.net.UrlRequest$Status.RESOLVING_PROXY_FOR_URL /* 6 */:
                this.a.a();
                break;
            case org.chromium.net.UrlRequest$Status.RESOLVING_HOST_IN_PAC_FILE /* 7 */:
                this.a.a();
                break;
            case org.chromium.net.UrlRequest$Status.ESTABLISHING_PROXY_TUNNEL /* 8 */:
                this.a.a();
                break;
            case org.chromium.net.UrlRequest$Status.RESOLVING_HOST /* 9 */:
                defpackage.puo puoVar = new defpackage.puo(new defpackage.pmu(17), 11);
                j$.util.Optional optional = (j$.util.Optional) this.a;
                if (true == optional.isPresent()) {
                    puoVar.a.a(optional.get());
                }
                break;
            case org.chromium.net.UrlRequest$Status.CONNECTING /* 10 */:
                defpackage.qar qarVar = (defpackage.qar) this.a;
                defpackage.rdp rdpVar = qarVar.p;
                long j = qarVar.b.d;
                java.lang.Object obj2 = rdpVar.d;
                java.lang.Long lValueOf = java.lang.Long.valueOf(j);
                java.lang.Object obj3 = rdpVar.c;
                ((j$.util.concurrent.ConcurrentHashMap) obj2).putIfAbsent(lValueOf, java.lang.Long.valueOf(android.os.SystemClock.elapsedRealtime()));
                break;
            case org.chromium.net.UrlRequest$Status.SSL_HANDSHAKE /* 11 */:
                defpackage.qci qciVar = (defpackage.qci) this.a;
                if (!qciVar.i) {
                    defpackage.qci.a.b().l("com/android/dialer/incall/onhold/ui/OnHoldViewPeer", "hide", 107, "OnHoldViewPeer.java").v("OnHoldView hide animation ends");
                    qciVar.e.setVisibility(8);
                } else {
                    defpackage.qci.a.b().l("com/android/dialer/incall/onhold/ui/OnHoldViewPeer", "hide", 105, "OnHoldViewPeer.java").v("OnHoldView hide animation ends but shown again");
                }
                break;
            case org.chromium.net.UrlRequest$Status.SENDING_REQUEST /* 12 */:
                java.util.concurrent.TimeUnit timeUnit = java.util.concurrent.TimeUnit.SECONDS;
                long jElapsedRealtime = android.os.SystemClock.elapsedRealtime();
                java.util.concurrent.TimeUnit timeUnit2 = java.util.concurrent.TimeUnit.MILLISECONDS;
                final long j2 = jElapsedRealtime / 1000;
                final defpackage.uss ussVar = (defpackage.uss) this.a;
                ?? r0 = ussVar.d;
                if (j$.util.Collection.-EL.stream(r0.values()).anyMatch(new java.util.function.Predicate() { // from class: qdf
                    @Override // java.util.function.Predicate
                    public final /* synthetic */ java.util.function.Predicate and(java.util.function.Predicate predicate) {
                        return j$.util.function.Predicate.-CC.$default$and(this, predicate);
                    }

                    @Override // java.util.function.Predicate
                    public final /* synthetic */ java.util.function.Predicate negate() {
                        return j$.util.function.Predicate.-CC.$default$negate(this);
                    }

                    @Override // java.util.function.Predicate
                    public final /* synthetic */ java.util.function.Predicate or(java.util.function.Predicate predicate) {
                        return j$.util.function.Predicate.-CC.$default$or(this, predicate);
                    }

                    /* JADX WARN: Type inference failed for: r4v2, types: [aoin, java.lang.Object] */
                    @Override // java.util.function.Predicate
                    public final boolean test(java.lang.Object obj4) {
                        return j2 - ((java.lang.Long) obj4).longValue() > ((java.lang.Long) ussVar.e.a()).longValue();
                    }
                })) {
                    android.os.Process.sendSignal(android.os.Process.myPid(), 3);
                }
                ((java.util.concurrent.atomic.AtomicReference) ussVar.c).set(null);
                if (!r0.isEmpty()) {
                    ussVar.g();
                }
                break;
            case org.chromium.net.UrlRequest$Status.WAITING_FOR_RESPONSE /* 13 */:
                aimz aimzVar = qdo.a;
                aimzVar.b().l("com/android/dialer/incall/proximitysensor/impl/incall/AccelerometerTracker", "disable", 158, "AccelerometerTracker.java").v("disable");
                qdo qdoVar = (qdo) this.a;
                qdoVar.c.unregisterListener(qdoVar.b);
                qdoVar.c();
                qdoVar.i = false;
                if (!((java.lang.Boolean) qdoVar.g.a()).booleanValue()) {
                    aimzVar.b().l("com/android/dialer/incall/proximitysensor/impl/incall/AccelerometerTracker", "disable", 167, "AccelerometerTracker.java").v("resetting orientation");
                    java.util.concurrent.atomic.AtomicReference atomicReference = qdoVar.k;
                    defpackage.qdn qdnVar = defpackage.qdn.a;
                    atomicReference.set(qdnVar);
                    qdoVar.j = qdnVar;
                }
                break;
            case org.chromium.net.UrlRequest$Status.READING_RESPONSE /* 14 */:
                aimz aimzVar2 = qdo.a;
                aimzVar2.b().l("com/android/dialer/incall/proximitysensor/impl/incall/AccelerometerTracker", "enable", 123, "AccelerometerTracker.java").v("enable");
                java.lang.Object obj4 = this.a;
                qdo qdoVar2 = (qdo) obj4;
                if (qdoVar2.i) {
                    aimzVar2.b().l("com/android/dialer/incall/proximitysensor/impl/incall/AccelerometerTracker", "enable", 125, "AccelerometerTracker.java").v("sensorEventListener already enabled.");
                } else if (qdoVar2.f.isEmpty()) {
                    aimzVar2.b().l("com/android/dialer/incall/proximitysensor/impl/incall/AccelerometerTracker", "enable", 130, "AccelerometerTracker.java").v("there is no call.");
                } else {
                    try {
                        android.hardware.SensorManager sensorManager = ((qdo) obj4).c;
                        ((qdo) obj4).i = sensorManager.registerListener(((qdo) obj4).b, sensorManager.getDefaultSensor(1), 3);
                    } catch (java.lang.IllegalStateException e) {
                        a.bq(qdo.a.d(), "could not register sensorEventListener. Values from the accelerometer are not tracked.", "com/android/dialer/incall/proximitysensor/impl/incall/AccelerometerTracker", "enable", (char) 145, "AccelerometerTracker.java", e, zct.b);
                        qdoVar2.l.set(true);
                        return;
                    }
                }
                break;
            case 15:
                ((defpackage.qeg) this.a).g.set(true);
                defpackage.qeg.a.b().l("com/android/dialer/incall/rtt/audiodetector/impl/AudioDetector", "listenToAudioTee", 166, "AudioDetector.java").v("audio detector started");
                break;
            case 16:
                java.lang.Object obj5 = this.a;
                defpackage.qfa qfaVar = (defpackage.qfa) obj5;
                agsm.i(600, ahvr.H(qfaVar.b(), new defpackage.phr(obj5, 18), qfaVar.c), "Failed to read message.", new java.lang.Object[0]);
                break;
            case 17:
                zjs zjsVar = ((defpackage.qnb) this.a).d;
                try {
                    zjv.i(zjsVar.g, mgv.aR, ajsz.aY(gus.ax(false)), (mhc) null, 0, 28);
                    zjsVar.i.showInCallScreen(false);
                } catch (java.lang.SecurityException e2) {
                    zjs.a.d().k(e2).l("com/google/android/dialershared/externals/androidapis/telecom/DialerTelecom", "showInCallScreen", 901, "DialerTelecom.kt").v("TelecomManager.showInCallScreen called without permission.");
                    return;
                }
                break;
            case 18:
                defpackage.qql.a.b().l("com/android/dialer/incall/video/service/FullscreenController", "resetAutoFullscreenTimer", 115, "FullscreenController.java").v("automatically enter fullscreen");
                ((defpackage.qql) this.a).b(true);
                break;
            case 19:
                aihd aihdVar = defpackage.qtd.a;
                ((android.view.View) this.a).setVisibility(0);
                break;
            default:
                android.view.View viewA = ((defpackage.pnb) this.a).a();
                if (viewA != null) {
                    viewA.setVisibility(0);
                }
                break;
        }
    }
}
