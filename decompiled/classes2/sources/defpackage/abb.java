package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes2.dex */
public final /* synthetic */ class abb implements java.lang.Runnable {
    private final /* synthetic */ int $cid;
    public final /* synthetic */ java.lang.Object a;
    public final /* synthetic */ java.lang.Object b;
    public final /* synthetic */ java.lang.Object c;
    public final /* synthetic */ java.lang.Object d;

    public abb(anur anurVar, anqw anqwVar, anvq anvqVar, anph anphVar, int i) {
        this.$cid = i;
        this.d = anqwVar;
        this.c = anvqVar;
        this.b = anphVar;
        j$.util.Objects.requireNonNull(anurVar);
        this.a = anurVar;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v1, types: [abc, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r0v21, types: [java.lang.Object, java.util.concurrent.Executor] */
    /* JADX WARN: Type inference failed for: r0v31, types: [aoin, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r0v37, types: [java.lang.Object, yfa] */
    /* JADX WARN: Type inference failed for: r0v47, types: [java.lang.Object, java.util.List] */
    /* JADX WARN: Type inference failed for: r0v5, types: [android.view.MenuItem, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r0v61, types: [ahzi, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r0v82, types: [java.lang.Object, java.util.List] */
    /* JADX WARN: Type inference failed for: r13v39, types: [java.lang.Object, java.util.concurrent.Executor] */
    /* JADX WARN: Type inference failed for: r13v42, types: [agxi, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r13v59, types: [java.lang.Object, java.util.List] */
    /* JADX WARN: Type inference failed for: r1v39, types: [agye, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r2v1, types: [androidx.car.app.IOnDoneCallback, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r2v23, types: [aoss, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r2v45, types: [aode, java.lang.Object] */
    @Override // java.lang.Runnable
    public final void run() {
        boolean zB;
        int i = 3;
        switch (this.$cid) {
            case 0:
                ?? r0 = this.d;
                java.lang.Object obj = this.c;
                ?? r2 = this.b;
                java.lang.Object obj2 = this.a;
                if (obj2 != null && ((ems) obj2).a().a(emq.c)) {
                    defpackage.rx.f(r2, (java.lang.String) obj, r0);
                    return;
                } else {
                    java.util.Objects.toString(r0);
                    defpackage.rx.j(r2, (java.lang.String) obj, new java.lang.IllegalStateException("Lifecycle is not at least created when dispatching ".concat(r0.toString())));
                    return;
                }
            case 1:
                java.lang.Object obj3 = this.d;
                if (obj3 != null) {
                    defpackage.fn fnVar = ((defpackage.fm) this.b).a;
                    fnVar.f = true;
                    ((ft) ((alic) obj3).b).i(false);
                    fnVar.f = false;
                }
                ?? r1 = this.c;
                if (r1.isEnabled() && r1.hasSubMenu()) {
                    ((ft) this.a).B((android.view.MenuItem) r1, (ge) null, 4);
                    return;
                }
                return;
            case 2:
                android.util.Pair pair = (android.util.Pair) this.b;
                ((defpackage.eyw) this.d).a.i.N(((java.lang.Integer) pair.first).intValue(), (defpackage.ffu) pair.second, (defpackage.ffl) this.a, (defpackage.ffq) this.c);
                return;
            case 3:
                android.util.Pair pair2 = (android.util.Pair) this.b;
                ((defpackage.eyw) this.d).a.i.O(((java.lang.Integer) pair2.first).intValue(), (defpackage.ffu) pair2.second, (defpackage.ffl) this.a, (defpackage.ffq) this.c);
                return;
            case 4:
                aimz aimzVar = jna.a;
                aimw aimwVarL = aimzVar.b().l("com/android/dialer/broadcastreceiverstrategy/impl/BroadcastReceiverStrategyImpl", "backgroundThenInlineThenForeground", 105, "BroadcastReceiverStrategyImpl.java");
                java.lang.Object obj4 = this.d;
                jna jnaVar = (jna) obj4;
                aimwVarL.x("it has been %d milliseconds. Starting a ForegroundService to continue work", jnaVar.f.h());
                if (((java.lang.Boolean) jnaVar.e.a()).booleanValue()) {
                    android.content.Context context = jnaVar.b;
                    if (android.os.Build.VERSION.SDK_INT >= 31 && ((android.app.ActivityManager) context.getSystemService(android.app.ActivityManager.class)) != null) {
                        android.app.ActivityManager.RunningAppProcessInfo runningAppProcessInfo = new android.app.ActivityManager.RunningAppProcessInfo();
                        android.app.ActivityManager.getMyMemoryState(runningAppProcessInfo);
                        if (runningAppProcessInfo.importance > 100) {
                            aimzVar.b().l("com/android/dialer/broadcastreceiverstrategy/impl/BroadcastReceiverStrategyImpl", "backgroundThenInlineThenForeground", 110, "BroadcastReceiverStrategyImpl.java").v("Foreground service start disallowed due to process state or background restrictions; skipping attachForegroundService.");
                            return;
                        }
                    }
                }
                defpackage.jmz jmzVar = (defpackage.jmz) this.b;
                if (jnaVar.a(jmzVar)) {
                    jnaVar.b(jmzVar, 4);
                }
                java.lang.Object obj5 = this.a;
                java.lang.Object obj6 = this.c;
                aogc aogcVar = (aogc) obj5;
                ajcq ajcqVarH = ahvr.H(((rwo) aogcVar.b).c(), new defpackage.hup(obj5, 15), (java.util.concurrent.Executor) aogcVar.a);
                defpackage.idd iddVar = new defpackage.idd(obj4, obj6, i);
                ajcu ajcuVar = jnaVar.d;
                agsm.i(160, ahvr.B(ahvr.I(ajcqVarH, iddVar, ajcuVar), java.lang.Throwable.class, new defpackage.hup(obj4, 14), ajcuVar), "BroadcastReceiverStrategy doing work using a ForegroundService failed", new java.lang.Object[0]);
                return;
            case 5:
                java.lang.Object obj7 = this.b;
                java.lang.Object obj8 = this.d;
                android.content.ComponentName componentNameResolveActivity = ((android.content.Intent) obj7).resolveActivity(((az) obj8).getPackageManager());
                java.lang.Object obj9 = this.c;
                java.lang.Object obj10 = this.a;
                if (componentNameResolveActivity == null) {
                    ((mau) obj9).o((androidx.coordinatorlayout.widget.CoordinatorLayout) obj10);
                    return;
                }
                try {
                    ahqx.l((android.content.Context) obj8, (android.content.Intent) obj7);
                    maw mawVar = ((mau) obj9).d;
                    if (((java.lang.Boolean) mawVar.c.a()).booleanValue()) {
                        java.lang.Object obj11 = mawVar.e;
                        ((apni) mawVar.b).i(ahvr.ag((aoss) mawVar.a, (ahda) mawVar.f, new defpackage.kdr(mawVar, j$.time.Instant.now(), (aoln) null, 9)));
                        return;
                    }
                    return;
                } catch (java.lang.SecurityException e) {
                    a.by(mau.a.b(), "start activity error", "com/android/dialer/conversationhistoryutil/ConversationHistoryActionProvider", "onReverseLookupButtonClickedEvent", (char) 445, "ConversationHistoryActionProvider.java", e);
                    ((mau) obj9).o((androidx.coordinatorlayout.widget.CoordinatorLayout) obj10);
                    return;
                }
            case 6:
                ((xsx) this.c).h((yfa) this.a);
                ((ops) this.d).f.remove(this.b);
                return;
            case 7:
                java.lang.Object obj12 = this.d;
                java.lang.Object obj13 = this.c;
                java.lang.Object obj14 = this.b;
                pzg pzgVar = (pzg) this.a;
                aoov.an(pzgVar.b, (aolr) null, 0, new abvi(pzgVar, (pyy) obj14, (vqu) obj13, (pzd) obj12, (aoln) null, 1), 3);
                return;
            case 8:
                if (((java.util.concurrent.atomic.AtomicBoolean) this.c).getAndSet(true)) {
                    return;
                }
                java.lang.Object obj15 = this.b;
                java.lang.Object obj16 = this.a;
                java.lang.Object obj17 = this.d;
                java.lang.String str = (java.lang.String) obj16;
                apkl.h(((aagf) obj15).b, str, 1030);
                ((aaap) obj17).d((aaag) obj15, str);
                return;
            case 9:
                java.lang.Object obj18 = this.b;
                ?? r3 = this.c;
                java.lang.Object obj19 = this.d;
                try {
                    abcw abcwVarI = ((afpl) this.a).I((java.util.List) r3);
                    ((abcw) obj19).a |= abcwVarI.a;
                    ((abcw) obj19).b |= abcwVarI.b;
                    if (zB) {
                        return;
                    } else {
                        return;
                    }
                } finally {
                    abcw abcwVar = (abcw) obj19;
                    if (abcwVar.b()) {
                        abcwVar.a(((abcv) obj18).b);
                    }
                }
            case 10:
                ((afip) ((ahix) ((adai) this.b).a.eZ()).b.eZ()).b(1L, new java.lang.Object[]{this.d, this.a, this.c});
                return;
            case 11:
                this.c.execute(new acxq(this.d, this.a, this.b, 6, (byte[]) null));
                return;
            case 12:
                defpackage.aexc.a.h((java.util.logging.Level) this.a).k((java.lang.Throwable) this.d).l("com/google/android/libraries/phenotype/client/Phlogger", "logInternal", 44, "Phlogger.java").S((java.lang.String) this.b, (java.lang.Object[]) this.c);
                return;
            case androidx.car.app.navigation.model.Maneuver.TYPE_ON_RAMP_SLIGHT_LEFT /* 13 */:
                java.lang.Object obj20 = ((ajwr) this.c).a;
                final defpackage.agya agyaVar = (defpackage.agya) this.d;
                ((agyj) obj20).a((agxi) this.b, new agyn() { // from class: agxl
                    public final int a(j$.time.Instant instant, agxh agxhVar, boolean z) {
                        if (agxhVar.e() && agxhVar.f()) {
                            if (!agxhVar.c().isBefore(instant.minus(agyaVar.k))) {
                                return 2;
                            }
                        }
                        if (z || !agxhVar.e()) {
                            return agxhVar.e() ? 3 : 1;
                        }
                        return 2;
                    }
                }, (agye) this.a);
                return;
            case androidx.car.app.navigation.model.Maneuver.TYPE_ON_RAMP_SLIGHT_RIGHT /* 14 */:
                alzd alzdVar = (alzd) this.c;
                java.util.Set set = alzdVar.c;
                alxf alxfVar = (alxf) this.d;
                boolean zContains = set.contains(alzd.g(alxfVar));
                java.lang.Object obj21 = this.b;
                if (!zContains) {
                    alzdVar.m(alxfVar, (almy) obj21, (alxu) this.a);
                    return;
                }
                almz almzVar = ((almy) obj21).h;
                if (almzVar == null) {
                    almzVar = almz.a;
                }
                apdi apdiVar = aloi.e;
                almzVar.c(apdiVar);
                java.lang.Object objJ = ((alaa) almzVar).n.j((alac) apdiVar.a);
                if (objJ == null) {
                    objJ = apdiVar.b;
                } else {
                    apdiVar.c(objJ);
                }
                alxf alxfVar2 = ((aloi) objJ).c;
                if (alxfVar2 == null) {
                    alxfVar2 = alxf.a;
                }
                alzdVar.b.put(alzd.g(alxfVar2), obj21);
                return;
            case androidx.car.app.navigation.model.Maneuver.TYPE_ON_RAMP_NORMAL_LEFT /* 15 */:
                ?? r4 = this.a;
                java.lang.Object obj22 = this.b;
                java.lang.Object obj23 = this.d;
                int size = r4.size();
                for (int i2 = 0; i2 < size; i2++) {
                    anst anstVar = (anst) r4.get(i2);
                    synchronized (anstVar) {
                        anstVar.h((anqw) obj22, (anqw) obj22, false);
                    }
                }
                ?? r13 = this.c;
                int size2 = r13.size();
                for (int i3 = 0; i3 < size2; i3++) {
                    ((java.util.concurrent.Future) r13.get(i3)).cancel(false);
                }
                ansf ansfVar = (ansf) obj23;
                ansfVar.fv();
                synchronized (obj23) {
                    ((ansf) obj23).k();
                    break;
                }
                ansfVar.p();
                return;
            case 16:
                ((anur) this.a).j((anqw) this.d, (anvq) this.c, (anph) this.b);
                return;
            case androidx.car.app.navigation.model.Maneuver.TYPE_ON_RAMP_SHARP_LEFT /* 17 */:
                ((anwp) this.c).a.a((anqw) this.d, (anvq) this.a, (anph) this.b);
                return;
            case androidx.car.app.navigation.model.Maneuver.TYPE_ON_RAMP_SHARP_RIGHT /* 18 */:
                aobu aobuVar = (aobu) this.c;
                aobu.y(aobuVar);
                aobuVar.w.a((anqw) this.d, (anvq) this.a, (anph) this.b);
                return;
            default:
                java.lang.Object obj24 = this.a;
                synchronized (obj24) {
                    if (((aodd) this.b).b != 0) {
                        return;
                    }
                    java.util.IdentityHashMap identityHashMap = ((aodf) obj24).b;
                    ?? r5 = this.d;
                    identityHashMap.remove(r5);
                    if (identityHashMap.isEmpty()) {
                        ((aodf) obj24).c.shutdown();
                        ((aodf) obj24).c = null;
                    }
                    r5.b(this.c);
                    return;
                }
        }
    }

    public /* synthetic */ abb(afpl afplVar, abcw abcwVar, java.util.List list, abcv abcvVar, int i) {
        this.$cid = i;
        this.a = afplVar;
        this.d = abcwVar;
        this.c = list;
        this.b = abcvVar;
    }

    public /* synthetic */ abb(alzd alzdVar, alxf alxfVar, almy almyVar, alxu alxuVar, int i) {
        this.$cid = i;
        this.c = alzdVar;
        this.d = alxfVar;
        this.b = almyVar;
        this.a = alxuVar;
    }

    public /* synthetic */ abb(defpackage.eyw eywVar, android.util.Pair pair, defpackage.ffl fflVar, defpackage.ffq ffqVar, int i) {
        this.$cid = i;
        this.d = eywVar;
        this.b = pair;
        this.a = fflVar;
        this.c = ffqVar;
    }

    public abb(defpackage.fm fmVar, alic alicVar, android.view.MenuItem menuItem, ft ftVar, int i) {
        this.$cid = i;
        this.d = alicVar;
        this.c = menuItem;
        this.a = ftVar;
        this.b = fmVar;
    }

    public /* synthetic */ abb(java.lang.Object obj, java.lang.Object obj2, java.lang.Object obj3, java.lang.Object obj4, int i) {
        this.$cid = i;
        this.a = obj;
        this.b = obj2;
        this.c = obj3;
        this.d = obj4;
    }

    public /* synthetic */ abb(java.lang.Object obj, java.lang.Object obj2, java.lang.Object obj3, java.lang.Object obj4, int i, byte[] bArr) {
        this.$cid = i;
        this.c = obj;
        this.b = obj2;
        this.d = obj3;
        this.a = obj4;
    }

    public /* synthetic */ abb(java.lang.Object obj, java.lang.Object obj2, java.lang.Object obj3, java.lang.Object obj4, int i, char[] cArr) {
        this.$cid = i;
        this.d = obj;
        this.c = obj2;
        this.a = obj3;
        this.b = obj4;
    }

    public /* synthetic */ abb(java.lang.Object obj, java.lang.Object obj2, java.lang.Object obj3, java.lang.Object obj4, int i, short[] sArr) {
        this.$cid = i;
        this.d = obj;
        this.a = obj2;
        this.b = obj3;
        this.c = obj4;
    }

    public /* synthetic */ abb(java.util.logging.Level level, java.lang.Throwable th, java.lang.String str, java.lang.Object[] objArr, int i) {
        this.$cid = i;
        this.a = level;
        this.d = th;
        this.b = str;
        this.c = objArr;
    }

    public /* synthetic */ abb(adai adaiVar, java.lang.String str, java.lang.String str2, java.lang.String str3, int i) {
        this.$cid = i;
        this.b = adaiVar;
        this.d = str;
        this.a = str2;
        this.c = str3;
    }

    public abb(anwp anwpVar, anqw anqwVar, anvq anvqVar, anph anphVar, int i) {
        this.$cid = i;
        this.d = anqwVar;
        this.a = anvqVar;
        this.b = anphVar;
        j$.util.Objects.requireNonNull(anwpVar);
        this.c = anwpVar;
    }

    public abb(aobu aobuVar, anqw anqwVar, anvq anvqVar, anph anphVar, int i) {
        this.$cid = i;
        this.d = anqwVar;
        this.a = anvqVar;
        this.b = anphVar;
        j$.util.Objects.requireNonNull(aobuVar);
        this.c = aobuVar;
    }

    public abb(aodf aodfVar, aodd aoddVar, aode aodeVar, java.lang.Object obj, int i) {
        this.$cid = i;
        this.b = aoddVar;
        this.d = aodeVar;
        this.c = obj;
        j$.util.Objects.requireNonNull(aodfVar);
        this.a = aodfVar;
    }
}
