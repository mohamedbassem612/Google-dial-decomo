package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes4.dex */
public final class apjb {
    public final java.lang.Object a;
    public final java.lang.Object b;

    public apjb(agzc agzcVar, aw awVar) {
        aooh.f(agzcVar, "localSubscriptionMixin");
        aooh.f(awVar, "fragment");
        this.b = agzcVar;
        aoir aoirVarAh = aooc.ah(3, new agob(new agob(awVar, 9), 10));
        aopu[] aopuVarArr = aoou.a;
        this.a = zb.k(awVar, new aooa(defpackage.ahaa.class), new agob(aoirVarAh, 11), new agob(aoirVarAh, 12), new jll(awVar, aoirVarAh, 6));
    }

    private static java.lang.String H(apoy apoyVar) {
        long j = apoyVar.b;
        return j <= 64 ? apoyVar.t().g() : apoyVar.u((int) java.lang.Math.min(j, 64L)).g().concat("...");
    }

    public final com.google.android.gms.feedback.FeedbackOptions A(android.content.Context context, ahih ahihVar, ahif ahifVar) {
        aalu aaluVar = new aalu(context);
        ahyn ahynVar = ahifVar.c;
        if (ahynVar.f()) {
            aaluVar.a = (android.graphics.Bitmap) ahynVar.b();
        }
        aaluVar.d = ahihVar.a;
        ahyn ahynVar2 = ahihVar.b;
        if (ahynVar2.f()) {
            aaluVar.c = (java.lang.String) ahynVar2.b();
        }
        boolean z = false;
        com.google.android.gms.feedback.ThemeSettings themeSettings = new com.google.android.gms.feedback.ThemeSettings(3, 0);
        int i = ahihVar.f;
        if (i == 0) {
            throw null;
        }
        if (i - 1 != 0) {
            throw new java.lang.RuntimeException(null, null);
        }
        themeSettings.a = 3;
        aaluVar.e = themeSettings;
        ahyn ahynVar3 = ahifVar.a;
        if (ahynVar3.f()) {
            aaluVar.b = (java.lang.String) ahynVar3.b();
        }
        ailj ailjVarK = ahifVar.b.c().k();
        while (ailjVarK.hasNext()) {
            if (((ahar) ailjVarK.next()).c) {
                aaluVar.b(new ahii(this, ahifVar), z);
                return aaluVar.a();
            }
        }
        z = true;
        aaluVar.b(new ahii(this, ahifVar), z);
        return aaluVar.a();
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, java.util.Map] */
    /* JADX WARN: Type inference failed for: r3v3, types: [aoin, java.lang.Object] */
    public final java.lang.Object B(com.google.apps.tiktok.account.AccountId accountId) {
        java.lang.Object obj;
        ?? r0 = this.b;
        synchronized (r0) {
            if (!r0.containsKey(accountId)) {
                hjx hjxVar = (hjx) this.a.a();
                hjxVar.a = accountId;
                r0.put(accountId, new hkr((him) hjxVar.b, (com.google.apps.tiktok.account.AccountId) hjxVar.a));
            }
            obj = r0.get(accountId);
        }
        return obj;
    }

    public final void C() {
        ahoq ahoqVarW = ahvr.W(1284, "onBeforeNoAccountAvailable");
        try {
            ailj ailjVarK = ((aile) this.a).k();
            while (ailjVarK.hasNext()) {
                agnu agnuVar = (agnu) ailjVarK.next();
                if (agnuVar instanceof defpackage.agnv) {
                    ((defpackage.agnv) agnuVar).f();
                }
            }
            for (agnu agnuVar2 : (java.util.ArrayList) this.b) {
                if (agnuVar2 instanceof defpackage.agnv) {
                    ((defpackage.agnv) agnuVar2).f();
                }
            }
            ahoqVarW.close();
        } catch (java.lang.Throwable th) {
            try {
                ahoqVarW.close();
            } catch (java.lang.Throwable th2) {
                th.addSuppressed(th2);
            }
            throw th;
        }
    }

    public final void D() {
        ahoq ahoqVarW = ahvr.W(1285, "onBeforeAccountLoading");
        try {
            ailj ailjVarK = ((aile) this.a).k();
            while (ailjVarK.hasNext()) {
                agnu agnuVar = (agnu) ailjVarK.next();
                if (agnuVar instanceof defpackage.agnv) {
                    ((defpackage.agnv) agnuVar).e();
                }
            }
            for (agnu agnuVar2 : (java.util.ArrayList) this.b) {
                if (agnuVar2 instanceof defpackage.agnv) {
                    ((defpackage.agnv) agnuVar2).e();
                }
            }
            ahoqVarW.close();
        } catch (java.lang.Throwable th) {
            try {
                ahoqVarW.close();
            } catch (java.lang.Throwable th2) {
                th.addSuppressed(th2);
            }
            throw th;
        }
    }

    /* JADX WARN: Type inference failed for: r3v1, types: [java.lang.Object, java.util.List] */
    public final void E(agoq agoqVar) {
        ahvr.bY(agoqVar != null);
        ahvr.bY(!agoqVar.equals(agoq.a));
        ahvr.bY((agoqVar.b & 256) != 0);
        java.lang.String str = agoqVar.j;
        ailj ailjVarK = ((aile) this.a).k();
        while (ailjVarK.hasNext()) {
            ((agnu) ailjVarK.next()).b();
        }
        ?? r3 = this.b;
        int size = r3.size();
        for (int i = 0; i < size; i++) {
            ((agnu) r3.get(i)).b();
        }
    }

    public final void F(agoq agoqVar) {
        ahoq ahoqVarW = ahvr.W(1283, "onBeforeActivityAccountReady");
        try {
            java.lang.String str = agoqVar.j;
            ailj ailjVarK = ((aile) this.a).k();
            while (ailjVarK.hasNext()) {
                agnu agnuVar = (agnu) ailjVarK.next();
                if (agnuVar instanceof defpackage.agnv) {
                    ((defpackage.agnv) agnuVar).g();
                }
            }
            for (agnu agnuVar2 : (java.util.ArrayList) this.b) {
                if (agnuVar2 instanceof defpackage.agnv) {
                    ((defpackage.agnv) agnuVar2).g();
                }
            }
            ahoqVarW.close();
        } catch (java.lang.Throwable th) {
            try {
                ahoqVarW.close();
            } catch (java.lang.Throwable th2) {
                th.addSuppressed(th2);
            }
            throw th;
        }
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [aoir, java.lang.Object] */
    public final zoe G(int i, agyz agyzVar) {
        java.util.Map map = ((defpackage.ahaa) this.a.a()).a;
        java.lang.Integer numValueOf = java.lang.Integer.valueOf(i);
        java.lang.Object obj = map.get(numValueOf);
        if (obj == null) {
            androidx.compose.runtime.ParcelableSnapshotMutableState parcelableSnapshotMutableState = new androidx.compose.runtime.ParcelableSnapshotMutableState(defpackage.agzz.a, cdu.c);
            map.put(numValueOf, parcelableSnapshotMutableState);
            obj = parcelableSnapshotMutableState;
        }
        java.lang.Object obj2 = this.b;
        ccp ccpVar = (ccp) obj;
        aooh.f(obj2, "localSubscriptionMixin");
        ((agzc) obj2).g(i, agyzVar, new agzy(ccpVar));
        return new zoe(ccpVar);
    }

    public final boolean a() {
        return ((java.util.logging.Logger) this.b).isLoggable((java.util.logging.Level) this.a);
    }

    public final void b(int i, int i2, apoy apoyVar, int i3, boolean z) {
        if (a()) {
            java.lang.Object obj = this.b;
            java.util.logging.Logger logger = (java.util.logging.Logger) obj;
            logger.logp((java.util.logging.Level) this.a, "io.grpc.okhttp.OkHttpFrameLogger", "logData", anty.t(i) + " DATA: streamId=" + i2 + " endStream=" + z + " length=" + i3 + " bytes=" + H(apoyVar));
        }
    }

    public final void c(int i, int i2, defpackage.aogl aoglVar, appb appbVar) {
        if (a()) {
            java.lang.Object obj = this.b;
            java.lang.Object obj2 = this.a;
            java.lang.String strT = anty.t(i);
            java.lang.String string = aoglVar.toString();
            int iC = appbVar.c();
            apoy apoyVar = new apoy();
            apoyVar.I(appbVar);
            java.util.logging.Logger logger = (java.util.logging.Logger) obj;
            logger.logp((java.util.logging.Level) obj2, "io.grpc.okhttp.OkHttpFrameLogger", "logGoAway", strT + " GO_AWAY: lastStreamId=" + i2 + " errorCode=" + string + " length=" + iC + " bytes=" + H(apoyVar));
        }
    }

    public final void d(int i, long j) {
        if (a()) {
            java.lang.Object obj = this.b;
            java.util.logging.Logger logger = (java.util.logging.Logger) obj;
            logger.logp((java.util.logging.Level) this.a, "io.grpc.okhttp.OkHttpFrameLogger", "logPing", anty.t(i) + " PING: ack=false bytes=" + j);
        }
    }

    public final void e(int i, int i2, defpackage.aogl aoglVar) {
        if (a()) {
            java.lang.Object obj = this.b;
            java.util.logging.Logger logger = (java.util.logging.Logger) obj;
            logger.logp((java.util.logging.Level) this.a, "io.grpc.okhttp.OkHttpFrameLogger", "logRstStream", anty.t(i) + " RST_STREAM: streamId=" + i2 + " errorCode=" + aoglVar.toString());
        }
    }

    public final void f(int i, aogy aogyVar) {
        if (a()) {
            java.lang.Object obj = this.b;
            java.lang.Object obj2 = this.a;
            java.lang.String strT = anty.t(i);
            java.util.EnumMap enumMap = new java.util.EnumMap(defpackage.aofl.class);
            for (defpackage.aofl aoflVar : defpackage.aofl.values()) {
                int i2 = aoflVar.g;
                if (aogyVar.c(i2)) {
                    enumMap.put(aoflVar, java.lang.Integer.valueOf(aogyVar.a(i2)));
                }
            }
            ((java.util.logging.Logger) obj).logp((java.util.logging.Level) obj2, "io.grpc.okhttp.OkHttpFrameLogger", "logSettings", strT + " SETTINGS: ack=false settings=" + enumMap.toString());
        }
    }

    public final void g(int i, int i2, long j) {
        if (a()) {
            java.lang.Object obj = this.b;
            java.util.logging.Logger logger = (java.util.logging.Logger) obj;
            logger.logp((java.util.logging.Level) this.a, "io.grpc.okhttp.OkHttpFrameLogger", "logWindowsUpdate", anty.t(i) + " WINDOW_UPDATE: streamId=" + i2 + " windowSizeIncrement=" + j);
        }
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    /* JADX WARN: Type inference failed for: r5v2, types: [aomy, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r5v6, types: [aowi, java.lang.Object] */
    public final java.lang.Object h(aoln aolnVar) {
        defpackage.aoeg aoegVar;
        if (aolnVar instanceof defpackage.aoeg) {
            aoegVar = (defpackage.aoeg) aolnVar;
            int i = aoegVar.b;
            if ((i & Integer.MIN_VALUE) != 0) {
                aoegVar.b = i - Integer.MIN_VALUE;
            } else {
                aoegVar = new defpackage.aoeg(this, aolnVar);
            }
        } else {
            aoegVar = new defpackage.aoeg(this, aolnVar);
        }
        java.lang.Object obj = aoegVar.a;
        aolu aoluVar = aolu.a;
        int i2 = aoegVar.b;
        if (i2 != 0 && i2 != 1) {
            throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
        aooc.af(obj);
        while (!((java.lang.Boolean) this.a.a()).booleanValue()) {
            ?? r5 = this.b;
            aoegVar.b = 1;
            if (r5.i(aoegVar) == aoluVar) {
                return aoluVar;
            }
        }
        return aojh.a;
    }

    /* JADX WARN: Type inference failed for: r1v1, types: [aowi, java.lang.Object] */
    public final void i() throws java.lang.Throwable {
        java.lang.Object objB = this.b.b(aojh.a);
        if (objB instanceof aowl) {
            java.lang.Throwable thB = aowm.b(objB);
            if (thB != null) {
                throw thB;
            }
            throw new java.lang.AssertionError("Should be impossible; a CONFLATED channel should never return false on offer");
        }
    }

    /* JADX WARN: Type inference failed for: r2v1, types: [java.lang.Object, java.util.concurrent.ScheduledFuture] */
    public final void j() {
        ((defpackage.anrb) this.a).b = true;
        this.b.cancel(false);
    }

    public final boolean k() {
        defpackage.anrb anrbVar = (defpackage.anrb) this.a;
        return (anrbVar.c || anrbVar.b) ? false : true;
    }

    /* JADX WARN: Type inference failed for: r0v1, types: [java.lang.Object, java.util.List] */
    public final void l(defpackage.anpk anpkVar) {
        this.b.add(anpkVar);
    }

    public final boolean m() {
        return this.b != null;
    }

    public final boolean n() {
        return this.a != null;
    }

    public final aify o(int i) {
        java.lang.Integer numValueOf = java.lang.Integer.valueOf(i);
        java.util.LinkedHashMap linkedHashMap = (java.util.LinkedHashMap) this.a;
        if (!linkedHashMap.containsKey(numValueOf)) {
            return aike.a;
        }
        defpackage.amcs amcsVar = (defpackage.amcs) linkedHashMap.get(numValueOf);
        aift aiftVar = new aift(4);
        aiftVar.i(amcsVar.a);
        while (true) {
            j$.util.Optional optional = amcsVar.b;
            if (!optional.isPresent()) {
                return aiftVar.h();
            }
            amcsVar = (defpackage.amcs) linkedHashMap.get(optional.get());
            aiftVar.i(amcsVar.a);
        }
    }

    public final j$.util.Optional p(int i) {
        return ((defpackage.amcs) ((java.util.LinkedHashMap) this.a).get(java.lang.Integer.valueOf(i))).b;
    }

    /* JADX WARN: Type inference failed for: r0v1, types: [aizr, java.lang.Object] */
    public final j$.time.Instant q() {
        return this.b.a();
    }

    /* JADX WARN: Type inference failed for: r2v3, types: [aljg, java.lang.Object] */
    public final j$.time.Duration r() {
        return j$.time.Duration.ofMillis(((xtq) this.a).a.a());
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [alkw, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r1v1, types: [java.lang.Object, java.util.concurrent.BlockingQueue] */
    public final void s(defpackage.almy almyVar) {
        this.b.a(almyVar);
        aiql.n((java.util.concurrent.BlockingQueue) this.a, almyVar);
    }

    /* JADX WARN: Type inference failed for: r4v0, types: [java.lang.Object, java.util.Map] */
    /* JADX WARN: Type inference failed for: r4v1, types: [java.lang.Object, java.util.Map] */
    public final j$.util.Optional t(defpackage.almm almmVar, final java.util.function.Consumer consumer) {
        java.lang.Object obj = this.b;
        final alln allnVar = (alln) obj;
        int iAN = a.aN(allnVar.d(almmVar.c).h);
        if (iAN != 0) {
            int i = 2;
            if (iAN == 2) {
                java.lang.String str = almmVar.c;
                defpackage.amhb amhbVar = (defpackage.amhb) ((java.util.Iterator) j$.util.Map.-EL.computeIfAbsent((java.util.Map) this.a, str, new defpackage.allm(this, str, i))).next();
                aigf aigfVar = (aigf) j$.util.Map.-EL.computeIfAbsent((java.util.Map) allnVar.d, str, new defpackage.allm(obj, str, 0));
                defpackage.amhc amhcVar = ((defpackage.amhd) j$.util.Collection.-EL.stream(amhbVar.b).filter(new java.util.function.Predicate() { // from class: alll
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

                    @Override // java.util.function.Predicate
                    public final boolean test(java.lang.Object obj2) {
                        defpackage.amhd amhdVar = (defpackage.amhd) obj2;
                        defpackage.amhe amheVar = amhdVar.c;
                        if (amheVar == null) {
                            amheVar = defpackage.amhe.a;
                        }
                        if ((amheVar.b & 2) != 0) {
                            alln allnVar2 = allnVar;
                            defpackage.amhe amheVar2 = amhdVar.c;
                            if (amheVar2 == null) {
                                amheVar2 = defpackage.amhe.a;
                            }
                            java.lang.Object obj3 = allnVar2.e;
                            if (((defpackage.alkf) obj3).a(amheVar2.c, consumer)) {
                                return true;
                            }
                        }
                        return false;
                    }
                }).findFirst().orElse((defpackage.amhd) j$.util.Collection.-EL.stream(amhbVar.b).filter(new defpackage.altw(1)).findFirst().get())).d;
                if (amhcVar == null) {
                    amhcVar = defpackage.amhc.a;
                }
                defpackage.amgx amgxVar = (defpackage.amgx) aigfVar.get(amhcVar.c);
                ahvr.ci(amgxVar);
                java.lang.String str2 = almmVar.c;
                ahvr.bM(amgxVar.d.size() == 1);
                defpackage.amgw amgwVar = (defpackage.amgw) amgxVar.d.get(0);
                akzx akzxVarM = defpackage.alsn.a.m();
                akzxVarM.u();
                defpackage.alsn alsnVar = (defpackage.alsn) akzxVarM.b;
                j$.util.Objects.requireNonNull(str2);
                alsnVar.b |= 1;
                alsnVar.c = str2;
                akzx akzxVarM2 = defpackage.alsm.a.m();
                akzxVarM2.u();
                defpackage.alsm alsmVar = (defpackage.alsm) akzxVarM2.b;
                alsmVar.b |= 4;
                alsmVar.e = false;
                java.lang.String str3 = amgwVar.e;
                akzxVarM2.u();
                defpackage.alsm alsmVar2 = (defpackage.alsm) akzxVarM2.b;
                j$.util.Objects.requireNonNull(str3);
                alsmVar2.b |= 1;
                alsmVar2.c = str3;
                java.lang.String str4 = amgwVar.c == 2 ? (java.lang.String) amgwVar.d : "";
                akzxVarM2.u();
                defpackage.alsm alsmVar3 = (defpackage.alsm) akzxVarM2.b;
                j$.util.Objects.requireNonNull(str4);
                alsmVar3.b |= 2;
                alsmVar3.d = str4;
                akzxVarM.u();
                defpackage.alsn alsnVar2 = (defpackage.alsn) akzxVarM.b;
                defpackage.alsm alsmVar4 = (defpackage.alsm) akzxVarM2.p();
                j$.util.Objects.requireNonNull(alsmVar4);
                alsnVar2.d = alsmVar4;
                alsnVar2.b |= 2;
                return j$.util.Optional.of((defpackage.alsn) akzxVarM.p());
            }
        }
        return j$.util.Optional.empty();
    }

    public final aaum u() {
        return (aaum) ((zzx) this.a).a;
    }

    public final void v() {
        ((zzx) this.a).i((java.lang.Object) null);
    }

    /* JADX WARN: Type inference failed for: r0v1, types: [boolean, int] */
    public final int w(java.lang.Object obj, int i) {
        ahvr.bP((boolean) ((i ^ (-1)) >>> 31), "Expected nonnegative limit, but found %s.", i);
        return ((ailq) this.b).a(((aimg) this.a).b(obj), i);
    }

    public final java.lang.String x(java.util.Map map) {
        ailj ailjVarK = ((aikj) map).e().k();
        java.lang.StringBuilder sb = new java.lang.StringBuilder();
        z(sb, ailjVarK);
        return sb.toString();
    }

    public final void y(java.lang.StringBuilder sb, java.lang.Iterable iterable) {
        z(sb, iterable.iterator());
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r4v2, types: [java.lang.CharSequence, java.lang.Object] */
    public final void z(java.lang.StringBuilder sb, java.util.Iterator it) {
        try {
            if (it.hasNext()) {
                java.util.Map.Entry entry = (java.util.Map.Entry) it.next();
                java.lang.Object obj = this.b;
                sb.append(((ahyj) obj).a(entry.getKey()));
                ?? r4 = this.a;
                sb.append((java.lang.CharSequence) r4);
                sb.append(((ahyj) obj).a(entry.getValue()));
                while (it.hasNext()) {
                    sb.append((java.lang.CharSequence) ((ahyj) obj).c);
                    java.util.Map.Entry entry2 = (java.util.Map.Entry) it.next();
                    sb.append(((ahyj) obj).a(entry2.getKey()));
                    sb.append((java.lang.CharSequence) r4);
                    sb.append(((ahyj) obj).a(entry2.getValue()));
                }
            }
        } catch (java.io.IOException e) {
            throw new java.lang.AssertionError(e);
        }
    }

    public apjb(ahyj ahyjVar) {
        this.b = ahyjVar;
        this.a = "=";
    }

    public apjb(aimg aimgVar, ailq ailqVar) {
        this.b = ailqVar;
        this.a = aimgVar;
    }

    public apjb(defpackage.ammv ammvVar) {
        this.a = ammvVar;
        this.b = null;
    }

    public apjb(amwp amwpVar) {
        this.a = null;
        this.b = amwpVar;
    }

    public apjb(android.content.Intent intent) {
        this.a = new zzx((char[]) null);
        this.b = intent;
    }

    public apjb(android.content.Intent intent, java.lang.String str) {
        this.a = intent;
        this.b = str;
    }

    public apjb(java.lang.Object obj, java.lang.Object obj2) {
        this.a = obj;
        this.b = obj2;
    }

    public apjb(java.lang.Object obj, java.lang.Object obj2, byte[] bArr) {
        this.b = obj;
        this.a = obj2;
    }

    public apjb() {
        this.a = new j$.util.concurrent.ConcurrentLinkedQueue();
        this.b = new java.util.concurrent.atomic.AtomicLong();
    }

    public apjb(anqw anqwVar, anph anphVar, byte[] bArr) {
        ahvr.ci(anqwVar);
        this.a = anqwVar;
        ahvr.ci(anphVar);
        this.b = anphVar;
    }

    public apjb(anqw anqwVar, java.lang.Object obj) {
        ahvr.cj(anqwVar, "status");
        this.a = anqwVar;
        this.b = obj;
    }

    public apjb(java.util.Set set) {
        new java.util.Random();
        this.a = set;
        this.b = new java.util.ArrayList(2);
    }

    public apjb(defpackage.anqq anqqVar, java.util.Map map) {
        this.a = anqqVar;
        this.b = j$.util.DesugarCollections.unmodifiableMap(new java.util.HashMap(map));
    }

    public apjb(aawd aawdVar, java.util.concurrent.Executor executor) {
        this.b = aawdVar;
        this.a = executor;
    }

    public apjb(alln allnVar) {
        this.a = new java.util.HashMap();
        this.b = allnVar;
    }

    public apjb(anqw anqwVar, anph anphVar) {
        ahvr.bZ(!anqwVar.h(), "Error status must not be OK");
        this.a = anqwVar;
        this.b = anphVar;
    }

    public apjb(java.lang.String str) {
        this.b = new java.util.ArrayList();
        this.a = str;
    }

    public apjb(defpackage.anrb anrbVar, java.util.concurrent.ScheduledFuture scheduledFuture) {
        this.a = anrbVar;
        ahvr.cj(scheduledFuture, "future");
        this.b = scheduledFuture;
    }

    public apjb(aigf aigfVar) {
        int i = anrs.a;
        this.b = new anrr();
        this.a = aigfVar;
    }

    public apjb(defpackage.aocs aocsVar, defpackage.aocg aocgVar, defpackage.anqm anqmVar) {
        j$.util.Objects.requireNonNull(aocsVar);
        this.b = aocgVar;
        this.a = anqmVar;
    }

    public apjb(aoin aoinVar) {
        this.b = new java.util.HashMap();
        this.a = aoinVar;
    }

    public apjb(aomy aomyVar) {
        this.a = aomyVar;
        this.b = aooh.H(-1, 0, (aonj) null, 6);
    }

    public apjb(java.util.logging.Level level, java.lang.Class cls) {
        java.util.logging.Logger logger = java.util.logging.Logger.getLogger(cls.getName());
        ahvr.cj(level, "level");
        this.a = level;
        ahvr.cj(logger, "logger");
        this.b = logger;
    }
}
