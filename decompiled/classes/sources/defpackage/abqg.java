package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes.dex */
public final /* synthetic */ class abqg implements java.lang.Runnable {
    private final /* synthetic */ int $cid;
    public final /* synthetic */ java.lang.Object a;

    public /* synthetic */ abqg(java.lang.Object obj, int i) {
        this.$cid = i;
        this.a = obj;
    }

    /* JADX INFO: Thrown type has an unknown type hierarchy: afeb */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v12, types: [aoin, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r0v8, types: [aoin, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r13v19, types: [android.app.Application$ActivityLifecycleCallbacks, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r13v33, types: [java.lang.Object, java.util.concurrent.Future] */
    /* JADX WARN: Type inference failed for: r13v36, types: [java.lang.Object, java.util.concurrent.Future] */
    /* JADX WARN: Type inference failed for: r13v38, types: [java.lang.Object, java.util.concurrent.Future] */
    /* JADX WARN: Type inference failed for: r13v4, types: [java.lang.Object, java.lang.Runnable] */
    /* JADX WARN: Type inference failed for: r13v47, types: [android.content.ComponentCallbacks, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r3v1, types: [aoin, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r6v2, types: [ajcu, java.lang.Object] */
    @Override // java.lang.Runnable
    public final void run() throws afeb {
        switch (this.$cid) {
            case 0:
                ((defpackage.abqh) this.a).a.cancel(false);
                return;
            case 1:
                defpackage.abqz.a.set(java.lang.Boolean.TRUE);
                this.a.run();
                return;
            case 2:
                ((defpackage.adqu) this.a).e();
                return;
            case 3:
                defpackage.aepu aepuVar = (defpackage.aepu) this.a;
                defpackage.aenj aenjVar = aepuVar.h;
                defpackage.ahvr.ci(aenjVar);
                if (aepuVar.b == 0) {
                    aepuVar.c = true;
                    java.util.Iterator it = aepuVar.g.iterator();
                    while (it.hasNext()) {
                        ((defpackage.aepi) it.next()).k(aenjVar);
                    }
                }
                defpackage.ahvr.ci(aepuVar.h);
                aepuVar.a();
                return;
            case 4:
                defpackage.aerx aerxVar = (defpackage.aerx) this.a;
                if (((java.lang.Boolean) aerxVar.h.a()).booleanValue()) {
                    defpackage.aeod aeodVar = aerxVar.j;
                    java.util.Iterator it2 = aeodVar.b.iterator();
                    while (it2.hasNext()) {
                        defpackage.ajan.g(((defpackage.aeoh) it2.next()).a(), new defpackage.adfd(aeodVar, 11), aeodVar.a);
                    }
                }
                defpackage.ahbz ahbzVar = aerxVar.k;
                if (((java.lang.Boolean) ahbzVar.e.a()).booleanValue()) {
                    double dLongValue = ((java.lang.Long) ahbzVar.a.a()).longValue();
                    java.lang.Object obj = ahbzVar.c;
                    ?? r3 = ahbzVar.d;
                    ahbzVar.b.scheduleWithFixedDelay(new absj(ahbzVar, 19), java.lang.Math.round(dLongValue + (((java.util.Random) obj).nextDouble() * ((java.lang.Long) r3.a()).longValue())), ((java.lang.Long) r3.a()).longValue(), java.util.concurrent.TimeUnit.MILLISECONDS);
                    return;
                }
                return;
            case 5:
                ((defpackage.aeud) this.a).a(0);
                return;
            case defpackage.eft.STRING_SET_FIELD_NUMBER /* 6 */:
                int i = defpackage.aeua.b;
                defpackage.afec.c();
                defpackage.aeud aeudVar = ((defpackage.aeuc) this.a).b;
                if (aeudVar.h == null) {
                    aeudVar.h = new defpackage.aera(android.os.SystemClock.elapsedRealtime(), android.os.SystemClock.uptimeMillis());
                    return;
                }
                return;
            case defpackage.eft.DOUBLE_FIELD_NUMBER /* 7 */:
                int i2 = defpackage.aeua.b;
                defpackage.afec.c();
                ?? r13 = this.a;
                defpackage.aeuc aeucVar = (defpackage.aeuc) r13;
                defpackage.aeud aeudVar2 = aeucVar.b;
                if (aeudVar2.i == null) {
                    aeudVar2.i = new defpackage.aera(android.os.SystemClock.elapsedRealtime(), android.os.SystemClock.uptimeMillis());
                    da$.ExternalSyntheticApiModelOutline0.m("Primes-ttfdd-end-and-length-ms", aeudVar2.i.a - aa$.ExternalSyntheticApiModelOutline1.m());
                    da$.ExternalSyntheticApiModelOutline0.m("Primes-ttfdd-end-and-length-ms", 0L);
                    aeucVar.a.unregisterActivityLifecycleCallbacks(r13);
                    return;
                }
                return;
            case defpackage.eft.BYTES_FIELD_NUMBER /* 8 */:
                defpackage.afec.c();
                defpackage.aeud aeudVar3 = ((defpackage.aeuc) this.a).b;
                if (aeudVar3.k == null) {
                    aeudVar3.k = new defpackage.aera(android.os.SystemClock.elapsedRealtime(), android.os.SystemClock.uptimeMillis());
                    return;
                }
                return;
            case 9:
                defpackage.afec.c();
                defpackage.aeud aeudVar4 = ((defpackage.aeuc) this.a).b;
                if (aeudVar4.j == null) {
                    aeudVar4.j = new defpackage.aera(android.os.SystemClock.elapsedRealtime(), android.os.SystemClock.uptimeMillis());
                    return;
                }
                return;
            case 10:
                defpackage.aeyy aeyyVar = (defpackage.aeyy) this.a;
                if (aeyyVar.f) {
                    defpackage.aewq aewqVar = aeyyVar.c;
                    if (!defpackage.abyl.h(aewqVar.c)) {
                        defpackage.aeyy.a.b(aewqVar);
                        return;
                    }
                }
                aeyyVar.d();
                return;
            case 11:
                ((defpackage.aeyy) this.a).c.h.a(defpackage.ajsw.FILE, new defpackage.aeys());
                return;
            case 12:
                ?? r14 = this.a;
                try {
                    defpackage.ahvr.cc(r14.isDone(), "Future was expected to be done: %s", r14);
                    defpackage.a.h(r14);
                    return;
                } catch (java.util.concurrent.ExecutionException e) {
                    defpackage.afec.a().post(new defpackage.aetv(e, 14));
                    return;
                }
            case 13:
                try {
                    defpackage.aiql.H(this.a);
                    return;
                } catch (java.lang.Exception e2) {
                    android.util.Log.i("PhFlagUpdateRegistry", "Failed to register flag update listener which may lead to stale flags.", e2);
                    return;
                }
            case 14:
                ?? r15 = this.a;
                try {
                    defpackage.ahvr.cc(r15.isDone(), "Future was expected to be done: %s", r15);
                    defpackage.a.h(r15);
                    return;
                } catch (java.lang.Exception e3) {
                    if (android.util.Log.isLoggable("StorageInfoHandler", 3)) {
                        android.util.Log.d("StorageInfoHandler", "Failed to get storage info from GMS", e3);
                        return;
                    }
                    return;
                }
            case 15:
                java.lang.Object obj2 = this.a;
                java.lang.Object obj3 = ((defpackage.afgx) obj2).g;
                synchronized (obj3) {
                    ((defpackage.afgx) obj2).h = null;
                    ((defpackage.afgx) obj2).i = true;
                    synchronized (obj3) {
                        try {
                        } catch (java.lang.Throwable th) {
                            throw th;
                        }
                        break;
                    }
                    return;
                }
                return;
            case 16:
                java.lang.Object obj4 = this.a;
                synchronized (((defpackage.afhx) obj4).i) {
                    if (((defpackage.afhx) obj4).l == 0) {
                        ((defpackage.afhx) obj4).d();
                    }
                    break;
                }
                return;
            case 17:
                ?? r16 = this.a;
                defpackage.afhx afhxVar = (defpackage.afhx) r16;
                synchronized (afhxVar.i) {
                    defpackage.ajcq ajcqVar = ((defpackage.afhx) r16).k;
                    if (((defpackage.afhx) r16).l != 0 || ajcqVar == null) {
                        return;
                    }
                    ((defpackage.afhx) r16).k = null;
                    if (!ajcqVar.cancel(true)) {
                        try {
                            defpackage.ahvr.cc(ajcqVar.isDone(), "Future was expected to be done: %s", ajcqVar);
                            ((android.database.sqlite.SQLiteDatabase) defpackage.a.h(ajcqVar)).close();
                            break;
                        } catch (java.util.concurrent.ExecutionException unused) {
                        }
                    }
                    afhxVar.b.unregisterComponentCallbacks(r16);
                    java.util.Iterator it3 = afhxVar.h.iterator();
                    while (it3.hasNext()) {
                        if (((java.lang.ref.WeakReference) it3.next()).get() == null) {
                            it3.remove();
                        }
                    }
                    return;
                }
            case 18:
                ((defpackage.afiv) this.a).b();
                return;
            case 19:
                ((android.os.PowerManager.WakeLock) this.a).release();
                return;
            default:
                defpackage.agym agymVar = ((defpackage.agyl) this.a).a;
                defpackage.agxv agxvVar = (defpackage.agxv) agymVar.d.getAndSet(null);
                defpackage.agyb agybVar = agymVar.f;
                long j = agybVar.d;
                boolean z = j != Long.MAX_VALUE;
                j$.time.Instant instantNow = j$.time.Instant.now();
                defpackage.ahvr.bZ(z, "You've just overflowed a long. Consider upgrading to a BigDecimal, if this happens more than once.");
                defpackage.agxi agxiVar = agybVar.a;
                agymVar.f = new defpackage.agyb(agxiVar, agybVar.b, agybVar.c, j, agybVar.f, agybVar.e.a(agxiVar, instantNow));
                if (defpackage.agxv.a.equals(agxvVar)) {
                    agymVar.e(agymVar.f.e);
                    return;
                } else {
                    if (!defpackage.agxv.b.equals(agxvVar)) {
                        throw new java.lang.IllegalStateException("Invalidation was ".concat(java.lang.String.valueOf(java.lang.String.valueOf(agxvVar))));
                    }
                    agymVar.d(agymVar.f.e);
                    return;
                }
        }
    }
}
