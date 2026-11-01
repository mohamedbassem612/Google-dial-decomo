package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes4.dex */
public final class amcx implements defpackage.amcg {
    private final java.util.Map G;
    private j$.util.Optional I;
    private defpackage.ameo J;
    private j$.util.Optional K;
    private j$.util.Optional L;
    private j$.util.Optional M;
    private j$.util.Optional N;
    private boolean O;
    private j$.util.Optional P;
    private final defpackage.amdr Q;
    private final defpackage.amey R;
    private final defpackage.alty S;
    private final defpackage.amac T;
    public defpackage.amen i;
    public final java.util.function.Supplier j;
    public final defpackage.alpn l;
    public final aizr m;
    public final defpackage.amci r;
    public defpackage.amdf s;
    public defpackage.amcj t;
    public j$.util.Optional v;
    public j$.util.Optional w;
    public final java.util.concurrent.atomic.AtomicInteger x;
    public final defpackage.alqf y;
    public static final aimz a = aimz.i("com/google/quality/views/extraction/kcube/bg/ondevice/modules/vc/CacheSupportedAmStateManager");
    public static final defpackage.amen b = defpackage.amen.a;
    public static final j$.time.Duration c = j$.time.Duration.ofSeconds(20);
    public static final j$.time.Duration d = j$.time.Duration.ofSeconds(1);
    private static final j$.time.Duration z = j$.time.Duration.ofSeconds(7);
    private static final j$.time.Duration A = j$.time.Duration.ofSeconds(5);
    private static final j$.time.Duration B = j$.time.Duration.ofSeconds(5);
    private static final j$.time.Duration C = j$.time.Duration.ofSeconds(2);
    public static final j$.time.Duration e = j$.time.Duration.ofSeconds(2);
    public static final ahzf f = ahzf.c(ahxm.b).a().f();
    public final java.util.concurrent.atomic.AtomicBoolean g = new java.util.concurrent.atomic.AtomicBoolean(false);
    public final java.util.concurrent.atomic.AtomicBoolean h = new java.util.concurrent.atomic.AtomicBoolean(false);
    private final java.util.concurrent.atomic.AtomicBoolean D = new java.util.concurrent.atomic.AtomicBoolean(false);
    public final java.util.concurrent.locks.ReentrantLock k = new java.util.concurrent.locks.ReentrantLock();
    public int n = 0;
    private boolean E = false;
    private boolean F = false;
    public boolean o = false;
    private final java.util.concurrent.atomic.AtomicBoolean H = new java.util.concurrent.atomic.AtomicBoolean(true);
    public final java.util.concurrent.atomic.AtomicReference p = new java.util.concurrent.atomic.AtomicReference(j$.util.Optional.empty());
    public boolean q = false;
    public defpackage.amcm u = new defpackage.amcm();

    public amcx(java.util.Map map, aizr aizrVar, defpackage.amac amacVar, defpackage.alpg alpgVar, defpackage.alqf alqfVar, defpackage.alty altyVar, defpackage.amen amenVar, java.util.function.Supplier supplier, defpackage.amey ameyVar, defpackage.amci amciVar) {
        aify aifyVar = aike.a;
        this.J = new defpackage.ameo("", aifyVar, aifyVar, false);
        this.v = j$.util.Optional.empty();
        this.K = j$.util.Optional.empty();
        this.L = j$.util.Optional.empty();
        this.M = j$.util.Optional.empty();
        this.N = j$.util.Optional.empty();
        this.O = true;
        this.P = j$.util.Optional.empty();
        this.w = j$.util.Optional.empty();
        this.x = new java.util.concurrent.atomic.AtomicInteger(0);
        this.G = map;
        this.T = amacVar;
        this.m = aizrVar;
        this.S = altyVar;
        this.i = amenVar;
        this.j = supplier;
        this.R = ameyVar;
        this.Q = new defpackage.amdr(aizrVar);
        this.y = alqfVar;
        this.r = amciVar;
        defpackage.alpn alpnVar = new defpackage.alpn(alpgVar, alqfVar);
        this.l = alpnVar;
        alpnVar.c(1);
    }

    private static int p(java.lang.String str) {
        return f.j(str).size();
    }

    private final defpackage.amdq q(defpackage.ameo ameoVar, aify aifyVar) {
        if (this.v.isEmpty()) {
            return defpackage.amdq.a(10002);
        }
        defpackage.antt anttVar = new defpackage.antt((byte[]) null);
        anttVar.f(defpackage.amdp.a);
        anttVar.e(j$.util.Optional.empty());
        anttVar.f(defpackage.amdp.d);
        defpackage.amdq amdqVarB = ((defpackage.ambu) this.v.get()).b(ameoVar, aifyVar, anttVar.d());
        j$.util.Optional optional = amdqVarB.a;
        if (optional.isEmpty()) {
            return amdqVarB;
        }
        optional.get();
        return amdqVarB;
    }

    private final defpackage.amdq r(defpackage.ameo ameoVar, aify aifyVar, defpackage.amdp amdpVar) {
        if (this.v.isEmpty()) {
            return defpackage.amdq.a(10002);
        }
        if (ameoVar.d) {
            defpackage.amdo amdoVar = new defpackage.amdo(amdpVar);
            amdoVar.l(0);
            amdoVar.n(5);
            amdpVar = amdoVar.a();
        }
        defpackage.antt anttVar = new defpackage.antt((byte[]) null);
        anttVar.f(amdpVar);
        if (y(z)) {
            anttVar.e(this.N);
        }
        return ((defpackage.ambu) this.v.get()).b(ameoVar, aifyVar, anttVar.d());
    }

    private final defpackage.ameo s(defpackage.ameo ameoVar, aify aifyVar) {
        j$.util.Optional optionalN = this.u.n(aifyVar);
        if (!optionalN.isPresent() || ((defpackage.amce) optionalN.get()).c.intValue() <= 0) {
            return ameoVar.b(aifyVar);
        }
        if (((defpackage.amce) optionalN.get()).g()) {
            a.b().l("com/google/quality/views/extraction/kcube/bg/ondevice/modules/vc/CacheSupportedAmStateManager", "preprocessTranscriptionForCache", 723, "CacheSupportedAmStateManager.java").v("Completely final volatile item!");
        }
        return ameoVar.a((defpackage.amce) optionalN.get());
    }

    private final void t(defpackage.amcm amcmVar, defpackage.amdq amdqVar, defpackage.ameo ameoVar, defpackage.ameo ameoVar2, boolean z2) {
        defpackage.amcx amcxVar;
        if (amcmVar.s() || this.v.isEmpty()) {
            return;
        }
        if (z2) {
            amcxVar = this;
            amcxVar.z(3, amcmVar, this.u, amdqVar, ameoVar.a, ameoVar2.a, true);
        } else {
            amcxVar = this;
        }
        java.lang.Object obj = amcxVar.v.get();
        akzx akzxVarM = defpackage.amgo.a.m();
        akzx akzxVarM2 = defpackage.amgm.a.m();
        defpackage.ambu ambuVar = (defpackage.ambu) obj;
        long j = ambuVar.b;
        akzxVarM2.u();
        defpackage.amgm amgmVar = (defpackage.amgm) akzxVarM2.b;
        amgmVar.b |= 1;
        amgmVar.c = j;
        java.lang.String str = ambuVar.c;
        akzxVarM2.u();
        defpackage.amgm amgmVar2 = (defpackage.amgm) akzxVarM2.b;
        j$.util.Objects.requireNonNull(str);
        amgmVar2.b |= 2;
        amgmVar2.d = str;
        akzxVarM.u();
        defpackage.amgo amgoVar = (defpackage.amgo) akzxVarM.b;
        defpackage.amgm amgmVar3 = (defpackage.amgm) akzxVarM2.p();
        j$.util.Objects.requireNonNull(amgmVar3);
        amgoVar.c = amgmVar3;
        amgoVar.b = 3;
        amcxVar.M = j$.util.Optional.of((defpackage.amgo) akzxVarM.p());
    }

    /* JADX WARN: Type inference failed for: r4v2, types: [java.lang.Object, java.util.function.Consumer] */
    private final void u() {
        this.r.b(a(), j$.util.Optional.empty(), false);
        j$.util.Optional optional = this.I;
        defpackage.alui aluiVar = new defpackage.alui(this, 16);
        if (true == optional.isPresent()) {
            optional.get().accept(((defpackage.amcx) aluiVar.a).a());
        }
    }

    private final void v(j$.util.Optional optional) {
        this.k.lock();
        try {
            aimw aimwVarL = a.b().l("com/google/quality/views/extraction/kcube/bg/ondevice/modules/vc/CacheSupportedAmStateManager", "registerUserPress", 1528, "CacheSupportedAmStateManager.java");
            aizr aizrVar = this.m;
            aimwVarL.y("Registered user press at time: %s", aizrVar.a());
            this.K = j$.util.Optional.of(aizrVar.a());
            this.N = optional;
            this.O = false;
            this.u.r();
        } finally {
            this.k.unlock();
        }
    }

    private final void w(aify aifyVar, aify aifyVar2) {
        long epochMilli = this.m.a().toEpochMilli();
        aift aiftVar = new aift(4);
        int i = 0;
        while (i < ((aike) aifyVar).d) {
            defpackage.amce amceVar = (defpackage.amce) aifyVar.get(i);
            defpackage.amcd amcdVar = new defpackage.amcd(amceVar);
            akzx akzxVarP = amceVar.b.p();
            akzxVarP.u();
            defpackage.amft amftVar = (defpackage.amft) akzxVarP.b;
            amftVar.b |= 2;
            amftVar.f = epochMilli;
            amcdVar.c((defpackage.amft) akzxVarP.p());
            aiftVar.i(amcdVar.a());
            i++;
            epochMilli = 1 + epochMilli;
        }
        this.u = this.u.k(aifyVar2, aiftVar.h());
    }

    private final boolean x(j$.time.Duration duration) {
        return y(duration) || (this.L.isPresent() && this.m.a().isBefore(((j$.time.Instant) this.L.get()).plus(duration)));
    }

    private final boolean y(j$.time.Duration duration) {
        return this.K.isPresent() && this.m.a().isBefore(((j$.time.Instant) this.K.get()).plus(duration));
    }

    private final void z(int i, defpackage.amcm amcmVar, defpackage.amcm amcmVar2, defpackage.amdq amdqVar, java.lang.String str, java.lang.String str2, boolean z2) {
        j$.util.Optional optional;
        aify aifyVar = (aify) j$.util.Collection.-EL.stream(amdqVar.b).map(new defpackage.amcu(7)).collect(aido.a);
        akzx akzxVarM = defpackage.aman.a.m();
        akzxVarM.u();
        defpackage.aman amanVar = (defpackage.aman) akzxVarM.b;
        amanVar.c = a.R(i);
        amanVar.b |= 1;
        aify aifyVarH = amcmVar.h();
        akzxVarM.u();
        defpackage.aman amanVar2 = (defpackage.aman) akzxVarM.b;
        alat alatVar = amanVar2.d;
        if (!alatVar.c()) {
            amanVar2.d = alad.J(alatVar);
        }
        akyl.i(aifyVarH, amanVar2.d);
        aify aifyVarH2 = amcmVar2.h();
        akzxVarM.u();
        defpackage.aman amanVar3 = (defpackage.aman) akzxVarM.b;
        alat alatVar2 = amanVar3.e;
        if (!alatVar2.c()) {
            amanVar3.e = alad.J(alatVar2);
        }
        akyl.i(aifyVarH2, amanVar3.e);
        akzxVarM.u();
        defpackage.aman amanVar4 = (defpackage.aman) akzxVarM.b;
        alat alatVar3 = amanVar4.f;
        if (!alatVar3.c()) {
            amanVar4.f = alad.J(alatVar3);
        }
        akyl.i(aifyVar, amanVar4.f);
        int i2 = amdqVar.c;
        akzxVarM.u();
        defpackage.aman amanVar5 = (defpackage.aman) akzxVarM.b;
        amanVar5.g = defpackage.amjk.k(i2);
        amanVar5.b |= 2;
        akzxVarM.u();
        defpackage.aman amanVar6 = (defpackage.aman) akzxVarM.b;
        j$.util.Objects.requireNonNull(str);
        amanVar6.b |= 4;
        amanVar6.h = str;
        akzxVarM.u();
        defpackage.aman amanVar7 = (defpackage.aman) akzxVarM.b;
        j$.util.Objects.requireNonNull(str2);
        amanVar7.b |= 8;
        amanVar7.i = str2;
        akzxVarM.u();
        defpackage.aman amanVar8 = (defpackage.aman) akzxVarM.b;
        amanVar8.b |= 16;
        amanVar8.j = z2;
        defpackage.aman amanVar9 = (defpackage.aman) akzxVarM.p();
        try {
            defpackage.amci amciVar = this.r;
            akzz akzzVarM = defpackage.almz.a.m();
            defpackage.alnb alnbVar = defpackage.alnb.EVENT_CACHE_STATE_UPDATE;
            akzzVarM.u();
            defpackage.almz almzVar = akzzVarM.b;
            almzVar.c = alnbVar.aN;
            almzVar.b |= 1;
            akzzVarM.bV(defpackage.almq.b, amanVar9);
            defpackage.almz almzVar2 = (defpackage.almz) akzzVarM.p();
            j$.util.Optional.empty();
            synchronized (amciVar.a) {
                optional = amciVar.c;
            }
            amciVar.d(almzVar2, optional);
        } catch (defpackage.aljs e2) {
            a.by(a.c(), "Failed to send CacheStateUpdate.", "com/google/quality/views/extraction/kcube/bg/ondevice/modules/vc/CacheSupportedAmStateManager", "sendCacheStateUpdateEvent", (char) 951, "CacheSupportedAmStateManager.java", e2);
        }
    }

    @Override // defpackage.amcg
    public final defpackage.amfv a() {
        boolean z2;
        java.util.concurrent.locks.ReentrantLock reentrantLock = this.k;
        reentrantLock.lock();
        try {
            reentrantLock.lock();
            try {
                defpackage.amcm amcmVar = this.u;
                if (this.E) {
                    defpackage.amcm amcmVar2 = new defpackage.amcm(aike.a, amcmVar.b, amcmVar.c, amcmVar.d);
                    java.util.ArrayList arrayList = amcmVar.a;
                    if (!arrayList.isEmpty()) {
                        boolean zI = ((defpackage.amce) arrayList.get(0)).i();
                        int size = arrayList.size();
                        int i = 10000;
                        int i2 = 0;
                        while (i2 < size) {
                            defpackage.amce amceVar = (defpackage.amce) arrayList.get(i2);
                            boolean zI2 = amceVar.i();
                            if (zI) {
                                z2 = zI2;
                            } else {
                                if (zI2) {
                                    amcmVar2.t(defpackage.amcm.v(3, i));
                                } else {
                                    z2 = false;
                                }
                                i++;
                                amcmVar2.t(amceVar);
                                i2++;
                                zI = zI2;
                            }
                            if (zI && !z2) {
                                amcmVar2.t(defpackage.amcm.v(2, i));
                                i++;
                            }
                            amcmVar2.t(amceVar);
                            i2++;
                            zI = zI2;
                        }
                    }
                    amcmVar = amcmVar2;
                }
                if (this.D.get()) {
                    defpackage.amcm amcmVar3 = new defpackage.amcm(amcmVar.a, amcmVar.b, amcmVar.c, amcmVar.d);
                    akzx akzxVarM = defpackage.amft.a.m();
                    defpackage.amfr amfrVar = defpackage.amfr.a;
                    akzxVarM.u();
                    defpackage.amft amftVar = (defpackage.amft) akzxVarM.b;
                    j$.util.Objects.requireNonNull(amfrVar);
                    amftVar.d = amfrVar;
                    amftVar.c = 5;
                    defpackage.amft amftVar2 = (defpackage.amft) akzxVarM.p();
                    defpackage.amcd amcdVarA = defpackage.amce.a();
                    amcdVarA.c(amftVar2);
                    amcdVarA.a = true;
                    amcmVar3.u(amcdVarA.a());
                    amcmVar = amcmVar3;
                }
                this.k.unlock();
                akzx akzxVarM2 = defpackage.amfv.a.m();
                akzx akzxVarM3 = defpackage.amfu.a.m();
                java.util.ArrayList arrayList2 = amcmVar.a;
                int i3 = 15;
                j$.util.stream.Stream map = j$.util.Collection.-EL.stream(arrayList2).map(new defpackage.alzr(15));
                j$.util.stream.Collector collector = aido.a;
                java.lang.Iterable iterable = (java.lang.Iterable) map.collect(collector);
                akzxVarM3.u();
                defpackage.amfu amfuVar = (defpackage.amfu) akzxVarM3.b;
                alat alatVar = amfuVar.b;
                if (!alatVar.c()) {
                    amfuVar.b = alad.J(alatVar);
                }
                akyl.i(iterable, amfuVar.b);
                akzxVarM2.u();
                defpackage.amfv amfvVar = (defpackage.amfv) akzxVarM2.b;
                defpackage.amfu amfuVar2 = (defpackage.amfu) akzxVarM3.p();
                j$.util.Objects.requireNonNull(amfuVar2);
                amfvVar.c = amfuVar2;
                amfvVar.b |= 1;
                akzx akzxVarM4 = defpackage.amga.a.m();
                java.lang.Iterable iterable2 = (java.lang.Iterable) j$.util.Collection.-EL.stream(arrayList2).map(new defpackage.alzr(14)).filter(new defpackage.alzc(i3)).collect(collector);
                akzxVarM4.u();
                defpackage.amga amgaVar = (defpackage.amga) akzxVarM4.b;
                alat alatVar2 = amgaVar.b;
                if (!alatVar2.c()) {
                    amgaVar.b = alad.J(alatVar2);
                }
                akyl.i(iterable2, amgaVar.b);
                akzxVarM2.u();
                defpackage.amfv amfvVar2 = (defpackage.amfv) akzxVarM2.b;
                defpackage.amga amgaVar2 = (defpackage.amga) akzxVarM4.p();
                j$.util.Objects.requireNonNull(amgaVar2);
                amfvVar2.d = amgaVar2;
                amfvVar2.b |= 2;
                return (defpackage.amfv) akzxVarM2.p();
            } finally {
                this.k.unlock();
            }
        } catch (java.lang.Throwable th) {
            this.k.unlock();
            throw th;
        }
    }

    @Override // defpackage.amcg
    public final j$.util.Optional b() {
        this.k.lock();
        try {
            j$.util.Optional optional = this.M;
            this.M = j$.util.Optional.empty();
            return optional;
        } finally {
            this.k.unlock();
        }
    }

    @Override // defpackage.amcg
    public final void c(defpackage.amfl amflVar) {
        boolean zIsPresent = this.v.isPresent();
        aimz aimzVar = a;
        if (zIsPresent) {
            aimzVar.b().l("com/google/quality/views/extraction/kcube/bg/ondevice/modules/vc/CacheSupportedAmStateManager", "handleCacheInfoUpdate", 1541, "CacheSupportedAmStateManager.java").v("Ignoring cache info update as it is already initialized.");
            return;
        }
        aimzVar.b().l("com/google/quality/views/extraction/kcube/bg/ondevice/modules/vc/CacheSupportedAmStateManager", "handleCacheInfoUpdate", 1544, "CacheSupportedAmStateManager.java").v("Resetting new cache info");
        try {
            this.v = j$.util.Optional.of(new defpackage.ambu(amflVar));
        } catch (defpackage.amde e2) {
            a.by(a.d(), "Cache is malformed - AmCache not initialized", "com/google/quality/views/extraction/kcube/bg/ondevice/modules/vc/CacheSupportedAmStateManager", "handleCacheInfoUpdate", (char) 1548, "CacheSupportedAmStateManager.java", e2);
            this.v = j$.util.Optional.empty();
        }
    }

    @Override // defpackage.amcg
    public final void d(java.lang.String str) {
        j$.util.Optional optionalEmpty;
        this.k.lock();
        try {
            try {
                defpackage.amdr amdrVar = this.Q;
                defpackage.amcm amcmVar = this.u;
                j$.time.Instant instant = amdrVar.c;
                aizr aizrVar = amdrVar.b;
                amdrVar.c = aizrVar.a();
                if (!aizrVar.a().isBefore(instant.plus(defpackage.amdr.a))) {
                    java.util.HashSet hashSet = new java.util.HashSet();
                    aify aifyVarA = amcmVar.e().a();
                    int size = aifyVarA.size();
                    int i = 0;
                    int i2 = 0;
                    while (true) {
                        if (i >= size) {
                            optionalEmpty = j$.util.Optional.empty();
                            break;
                        }
                        defpackage.amce amceVar = (defpackage.amce) aifyVarA.get(i);
                        if (!amceVar.n()) {
                            if (!amceVar.q()) {
                                if (amceVar.l() && (i2 = i2 + 1) > 2) {
                                    optionalEmpty = j$.util.Optional.empty();
                                    break;
                                }
                                i++;
                            } else {
                                optionalEmpty = j$.util.Optional.empty();
                                break;
                            }
                        } else {
                            defpackage.amft amftVar = amceVar.b;
                            int iAN = a.aN((amftVar.c == 2 ? (defpackage.amgc) amftVar.d : defpackage.amgc.a).g);
                            if (iAN == 0 || iAN != 3) {
                                optionalEmpty = j$.util.Optional.empty();
                                break;
                            }
                            java.lang.String str2 = (amftVar.c == 2 ? (defpackage.amgc) amftVar.d : defpackage.amgc.a).c;
                            if (str2.equals(str)) {
                                optionalEmpty = j$.util.Optional.of(java.lang.Long.valueOf(amftVar.e));
                                break;
                            } else if (hashSet.contains(str2)) {
                                optionalEmpty = j$.util.Optional.empty();
                                break;
                            } else {
                                hashSet.add(str2);
                                i++;
                            }
                        }
                    }
                }
                optionalEmpty = j$.util.Optional.empty();
                if (this.F && optionalEmpty.isPresent()) {
                    a.b().l("com/google/quality/views/extraction/kcube/bg/ondevice/modules/vc/CacheSupportedAmStateManager", "handleDtmfKey", 297, "CacheSupportedAmStateManager.java").y("Found option matching last key press: %d", optionalEmpty.get());
                    e(((java.lang.Long) optionalEmpty.get()).longValue());
                } else {
                    v(j$.util.Optional.of(str));
                }
            } catch (defpackage.alio unused) {
                v(j$.util.Optional.of(str));
            }
        } finally {
            this.k.unlock();
        }
    }

    @Override // defpackage.amcg
    public final void e(final long j) {
        defpackage.amft amftVar;
        int i;
        j$.util.Optional optionalEmpty;
        java.util.concurrent.locks.ReentrantLock reentrantLock = this.k;
        reentrantLock.lock();
        try {
            defpackage.amcm amcmVarK = this.u;
            java.lang.Integer num = (java.lang.Integer) amcmVarK.o(j).orElseThrow(new java.util.function.Supplier() { // from class: amcl
                @Override // java.util.function.Supplier
                public final java.lang.Object get() {
                    return new defpackage.alio("Did not find any item with id: ".concat(java.lang.String.valueOf(java.lang.Long.toString(j))));
                }
            });
            java.util.ArrayList arrayList = new java.util.ArrayList(amcmVarK.a);
            defpackage.amce amceVar = (defpackage.amce) arrayList.get(num.intValue());
            defpackage.amft amftVar2 = amceVar.b;
            if (amftVar2.e == j) {
                if (!amceVar.i() || amceVar.j()) {
                    int iIntValue = num.intValue();
                    long j2 = amftVar2.e;
                    if (defpackage.amjk.e(amftVar2.c) != 2) {
                        throw new defpackage.alio(java.lang.String.format("Selected item id %d is not an IVR option.", java.lang.Long.valueOf(j2)));
                    }
                    defpackage.amcd amcdVar = new defpackage.amcd(amceVar);
                    akzx akzxVarP = amftVar2.p();
                    akzx akzxVarP2 = (amftVar2.c == 2 ? (defpackage.amgc) amftVar2.d : defpackage.amgc.a).p();
                    akzxVarP2.u();
                    defpackage.amgc amgcVar = (defpackage.amgc) akzxVarP2.b;
                    amgcVar.g = 1;
                    amgcVar.b |= 32;
                    akzxVarP.u();
                    defpackage.amft amftVar3 = (defpackage.amft) akzxVarP.b;
                    defpackage.amgc amgcVar2 = (defpackage.amgc) akzxVarP2.p();
                    j$.util.Objects.requireNonNull(amgcVar2);
                    amftVar3.d = amgcVar2;
                    amftVar3.c = 2;
                    amcdVar.c((defpackage.amft) akzxVarP.p());
                    arrayList.set(iIntValue, amcdVar.a());
                }
                amcmVarK = amcmVarK.k(arrayList, aike.a);
            }
            this.u = amcmVarK;
            this.x.getAndIncrement();
            defpackage.amcm amcmVar = this.u;
            j$.util.Optional optionalO = amcmVar.o(j);
            if (!optionalO.isEmpty() && (i = (amftVar = ((defpackage.amce) amcmVar.a.get(((java.lang.Integer) optionalO.get()).intValue())).b).c) == 2) {
                optionalEmpty = j$.util.Optional.of((i == 2 ? (defpackage.amgc) amftVar.d : defpackage.amgc.a).c);
            } else {
                optionalEmpty = j$.util.Optional.empty();
            }
            v(optionalEmpty);
            reentrantLock.unlock();
        } catch (java.lang.Throwable th) {
            this.k.unlock();
            throw th;
        }
    }

    @Override // defpackage.amcg
    public final void f() {
        this.k.lock();
        try {
            this.t = new defpackage.amcj(this.S, this.m);
            this.g.set(false);
            this.u = new defpackage.amcm();
            this.I = j$.util.Optional.empty();
            this.H.set(true);
            this.D.set(false);
            this.v = j$.util.Optional.empty();
            this.n = 0;
        } finally {
            this.l.b();
            this.r.f();
            this.k.unlock();
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r4v3, types: [java.util.concurrent.locks.ReentrantLock] */
    @Override // defpackage.amcg
    public final void g(boolean z2) {
        this.k.lock();
        try {
            try {
                this.D.set(z2);
                u();
            } catch (defpackage.aljs e2) {
                a.c().k(e2).l("com/google/quality/views/extraction/kcube/bg/ondevice/modules/vc/CacheSupportedAmStateManager", "setMusicPlaying", 1367, "CacheSupportedAmStateManager.java").v("Failed to publish AmState for music start/stop.");
            }
        } finally {
            this.k.unlock();
        }
    }

    @Override // defpackage.amcg
    public final void h(boolean z2) {
        a.b().l("com/google/quality/views/extraction/kcube/bg/ondevice/modules/vc/CacheSupportedAmStateManager", "setTranscriptionEnabled", 1347, "CacheSupportedAmStateManager.java").y("Setting transcription enabled to: %b", java.lang.Boolean.valueOf(z2));
        this.k.lock();
        try {
            try {
                this.H.set(z2);
                u();
            } catch (defpackage.aljs e2) {
                a.c().k(e2).l("com/google/quality/views/extraction/kcube/bg/ondevice/modules/vc/CacheSupportedAmStateManager", "setTranscriptionEnabled", 1353, "CacheSupportedAmStateManager.java").v("Failed to publish AmState for transcription enabled/disabled.");
            }
        } finally {
            this.k.unlock();
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r5v3, types: [java.util.concurrent.locks.ReentrantLock] */
    @Override // defpackage.amcg
    public final void i() {
        this.k.lock();
        try {
            try {
                this.g.set(true);
                this.T.c(new java.util.concurrent.Callable() { // from class: amcv
                    /* JADX WARN: Code duplicated, block: B:117:0x05da A[Catch: all -> 0x06f3, TryCatch #6 {all -> 0x06f3, blocks: (B:59:0x02ad, B:61:0x02b3, B:63:0x02e1, B:73:0x0336, B:77:0x0374, B:85:0x0398, B:89:0x03ee, B:91:0x0426, B:93:0x042e, B:95:0x0440, B:97:0x0448, B:98:0x0479, B:100:0x0497, B:102:0x049f, B:104:0x04bb, B:106:0x04dd, B:107:0x04f5, B:115:0x05c2, B:117:0x05da, B:119:0x05e1, B:121:0x05ed, B:123:0x05fb, B:127:0x0624, B:129:0x062c, B:131:0x0646, B:138:0x067f, B:125:0x060d, B:108:0x0510, B:110:0x0551, B:111:0x05a7, B:113:0x05af, B:114:0x05ba, B:88:0x03d4, B:76:0x0345, B:62:0x02b6), top: B:202:0x02ad }] */
                    /* JADX WARN: Code duplicated, block: B:119:0x05e1 A[Catch: all -> 0x06f3, TryCatch #6 {all -> 0x06f3, blocks: (B:59:0x02ad, B:61:0x02b3, B:63:0x02e1, B:73:0x0336, B:77:0x0374, B:85:0x0398, B:89:0x03ee, B:91:0x0426, B:93:0x042e, B:95:0x0440, B:97:0x0448, B:98:0x0479, B:100:0x0497, B:102:0x049f, B:104:0x04bb, B:106:0x04dd, B:107:0x04f5, B:115:0x05c2, B:117:0x05da, B:119:0x05e1, B:121:0x05ed, B:123:0x05fb, B:127:0x0624, B:129:0x062c, B:131:0x0646, B:138:0x067f, B:125:0x060d, B:108:0x0510, B:110:0x0551, B:111:0x05a7, B:113:0x05af, B:114:0x05ba, B:88:0x03d4, B:76:0x0345, B:62:0x02b6), top: B:202:0x02ad }] */
                    /* JADX WARN: Code duplicated, block: B:125:0x060d A[Catch: all -> 0x06f3, TryCatch #6 {all -> 0x06f3, blocks: (B:59:0x02ad, B:61:0x02b3, B:63:0x02e1, B:73:0x0336, B:77:0x0374, B:85:0x0398, B:89:0x03ee, B:91:0x0426, B:93:0x042e, B:95:0x0440, B:97:0x0448, B:98:0x0479, B:100:0x0497, B:102:0x049f, B:104:0x04bb, B:106:0x04dd, B:107:0x04f5, B:115:0x05c2, B:117:0x05da, B:119:0x05e1, B:121:0x05ed, B:123:0x05fb, B:127:0x0624, B:129:0x062c, B:131:0x0646, B:138:0x067f, B:125:0x060d, B:108:0x0510, B:110:0x0551, B:111:0x05a7, B:113:0x05af, B:114:0x05ba, B:88:0x03d4, B:76:0x0345, B:62:0x02b6), top: B:202:0x02ad }] */
                    /* JADX WARN: Code duplicated, block: B:127:0x0624 A[Catch: all -> 0x06f3, TryCatch #6 {all -> 0x06f3, blocks: (B:59:0x02ad, B:61:0x02b3, B:63:0x02e1, B:73:0x0336, B:77:0x0374, B:85:0x0398, B:89:0x03ee, B:91:0x0426, B:93:0x042e, B:95:0x0440, B:97:0x0448, B:98:0x0479, B:100:0x0497, B:102:0x049f, B:104:0x04bb, B:106:0x04dd, B:107:0x04f5, B:115:0x05c2, B:117:0x05da, B:119:0x05e1, B:121:0x05ed, B:123:0x05fb, B:127:0x0624, B:129:0x062c, B:131:0x0646, B:138:0x067f, B:125:0x060d, B:108:0x0510, B:110:0x0551, B:111:0x05a7, B:113:0x05af, B:114:0x05ba, B:88:0x03d4, B:76:0x0345, B:62:0x02b6), top: B:202:0x02ad }] */
                    /* JADX WARN: Code duplicated, block: B:129:0x062c A[Catch: all -> 0x06f3, TryCatch #6 {all -> 0x06f3, blocks: (B:59:0x02ad, B:61:0x02b3, B:63:0x02e1, B:73:0x0336, B:77:0x0374, B:85:0x0398, B:89:0x03ee, B:91:0x0426, B:93:0x042e, B:95:0x0440, B:97:0x0448, B:98:0x0479, B:100:0x0497, B:102:0x049f, B:104:0x04bb, B:106:0x04dd, B:107:0x04f5, B:115:0x05c2, B:117:0x05da, B:119:0x05e1, B:121:0x05ed, B:123:0x05fb, B:127:0x0624, B:129:0x062c, B:131:0x0646, B:138:0x067f, B:125:0x060d, B:108:0x0510, B:110:0x0551, B:111:0x05a7, B:113:0x05af, B:114:0x05ba, B:88:0x03d4, B:76:0x0345, B:62:0x02b6), top: B:202:0x02ad }] */
                    /* JADX WARN: Code duplicated, block: B:213:0x06a6 A[EXC_TOP_SPLITTER, SYNTHETIC] */
                    /* JADX WARN: Code duplicated, block: B:225:0x067f A[SYNTHETIC] */
                    /* JADX WARN: Code duplicated, block: B:226:0x067f A[SYNTHETIC] */
                    /* JADX WARN: Code duplicated, block: B:227:0x067f A[SYNTHETIC] */
                    /* JADX WARN: Code duplicated, block: B:228:0x0646 A[SYNTHETIC] */
                    /* JADX WARN: Code duplicated, block: B:41:0x0124 A[Catch: aljs -> 0x0705, RuntimeException -> 0x0707, InterruptedException -> 0x0740, all -> 0x0779, TRY_ENTER, TryCatch #16 {aljs -> 0x0705, InterruptedException -> 0x0740, RuntimeException -> 0x0707, blocks: (B:6:0x0011, B:9:0x002e, B:14:0x0064, B:27:0x00d4, B:29:0x00e9, B:31:0x00f5, B:36:0x0113, B:33:0x00fc, B:35:0x0108, B:42:0x0128, B:46:0x0161, B:48:0x0167, B:58:0x02aa, B:66:0x0317, B:79:0x037a, B:132:0x065f, B:139:0x068d, B:142:0x0698, B:143:0x06a5, B:148:0x06bc, B:151:0x06bf, B:158:0x06f4, B:159:0x06f9, B:49:0x0173, B:53:0x01c7, B:57:0x01da, B:56:0x01d3, B:52:0x01c0, B:45:0x0132, B:37:0x0116, B:41:0x0124, B:165:0x06ff, B:166:0x0704), top: B:206:0x0011, outer: #9 }] */
                    /* JADX WARN: Type inference failed for: r4v73, types: [j$.time.temporal.Temporal, java.lang.Object] */
                    @Override // java.util.concurrent.Callable
                    public final java.lang.Object call() throws java.lang.Throwable {
                        java.lang.Throwable th;
                        boolean z2;
                        j$.util.Optional optionalOf;
                        int i;
                        aify aifyVarA;
                        java.lang.String str;
                        defpackage.amcm amcmVarJ;
                        aify aifyVarE;
                        aify aifyVarE2;
                        j$.time.Duration duration;
                        java.util.concurrent.atomic.AtomicReference atomicReference;
                        defpackage.amce amceVar;
                        aify aifyVar = aike.a;
                        while (true) {
                            defpackage.amcx amcxVar = this.a;
                            java.util.concurrent.atomic.AtomicBoolean atomicBoolean = amcxVar.g;
                            if (!atomicBoolean.get()) {
                                return null;
                            }
                            try {
                                try {
                                    defpackage.alpn alpnVar = amcxVar.l;
                                    alpnVar.a(j$.time.Duration.ofMinutes(5L));
                                    defpackage.amci amciVar = amcxVar.r;
                                    amciVar.b.a(j$.time.Duration.ofMinutes(5L));
                                    if (!atomicBoolean.get()) {
                                        defpackage.amcx.a.b().l("com/google/quality/views/extraction/kcube/bg/ondevice/modules/vc/CacheSupportedAmStateManager", "consumeStateUpdates", 396, "CacheSupportedAmStateManager.java").v("Logging state after parser stopped consuming updates.");
                                        amcxVar.o(false);
                                        try {
                                            amcxVar.o(true);
                                            return null;
                                        } catch (defpackage.aljs e2) {
                                            a.by(defpackage.amcx.a.c(), "Runtime exception while parsing options.", "com/google/quality/views/extraction/kcube/bg/ondevice/modules/vc/CacheSupportedAmStateManager", "consumeStateUpdates", (char) 483, "CacheSupportedAmStateManager.java", e2);
                                            return null;
                                        }
                                    }
                                    java.util.concurrent.locks.ReentrantLock reentrantLock = amcxVar.k;
                                    reentrantLock.lock();
                                    try {
                                        synchronized (amciVar.a) {
                                            try {
                                                amciVar.d = amciVar.c;
                                            } catch (java.lang.Throwable th2) {
                                                throw th2;
                                            }
                                        }
                                        defpackage.amcj amcjVar = amcxVar.t;
                                        j$.util.Optional optionalOfNullable = amcjVar.d;
                                        defpackage.amck amckVar = new defpackage.amck(amcjVar, 1);
                                        if (true == optionalOfNullable.isPresent()) {
                                            optionalOfNullable = j$.util.Optional.ofNullable(j$.time.Duration.between((j$.time.temporal.Temporal) optionalOfNullable.get(), ((defpackage.amcj) amckVar.a).c.a()));
                                        }
                                        int iCompareTo = ((j$.time.Duration) optionalOfNullable.orElse(j$.time.Duration.ZERO)).compareTo(defpackage.amcx.c);
                                        defpackage.amcm amcmVar = amcxVar.u;
                                        j$.util.Optional optionalM = amcmVar.m();
                                        aify aifyVarN = optionalM.isEmpty() ? aify.n(amcmVar.a) : aify.n(amcmVar.a.subList(0, ((java.lang.Integer) optionalM.get()).intValue()));
                                        java.util.concurrent.atomic.AtomicInteger atomicInteger = amcxVar.x;
                                        int i2 = atomicInteger.get();
                                        alpnVar.c(1);
                                        reentrantLock.unlock();
                                        java.lang.String strP = defpackage.amev.p(amcmVar.g(aifyVarN));
                                        java.util.ArrayList arrayList = amcmVar.a;
                                        if (arrayList.isEmpty()) {
                                            optionalOf = j$.util.Optional.empty();
                                        } else {
                                            try {
                                                if (!((defpackage.amce) ahvr.bk(arrayList)).i()) {
                                                    int size = arrayList.size();
                                                    while (true) {
                                                        size--;
                                                        if (size < 0) {
                                                            optionalOf = j$.util.Optional.of(0);
                                                            break;
                                                        }
                                                        if (((defpackage.amce) arrayList.get(size)).i()) {
                                                            optionalOf = j$.util.Optional.of(java.lang.Integer.valueOf(size + 1));
                                                            break;
                                                        }
                                                    }
                                                } else {
                                                    optionalOf = j$.util.Optional.empty();
                                                }
                                            } catch (java.lang.Throwable th3) {
                                                th = th3;
                                                z2 = true;
                                            }
                                        }
                                        int length = optionalOf.isEmpty() ? 0 : ((java.lang.String) j$.util.Collection.-EL.stream(arrayList.subList(((java.lang.Integer) optionalOf.get()).intValue(), arrayList.size())).map(new defpackage.alzr(14)).collect(j$.util.stream.Collectors.joining(" "))).length();
                                        if (strP.isEmpty()) {
                                            aifyVarA = aike.a;
                                            i = i2;
                                        } else {
                                            defpackage.amcp amcpVarL = amcmVar.l(amcxVar.i);
                                            aimz aimzVar = defpackage.amcx.a;
                                            aimw aimwVarL = aimzVar.b().l("com/google/quality/views/extraction/kcube/bg/ondevice/modules/vc/CacheSupportedAmStateManager", "getParserResultForState", 1695, "CacheSupportedAmStateManager.java");
                                            java.lang.String str2 = amcpVarL.b;
                                            aimwVarL.y("Full text used for parsing: '%s'", str2);
                                            defpackage.altp altpVarB = defpackage.altp.b(str2.length() - length, str2.length());
                                            java.lang.String strH = altpVarB.h(str2);
                                            int i3 = altpVarB.a;
                                            java.lang.String strSubstring = str2.substring(0, i3);
                                            j$.util.stream.Stream streamLimit = j$.util.Collection.-EL.stream(amcpVarL.c).skip(strSubstring.trim().isEmpty() ? 0 : strSubstring.split(" ").length).limit(strH.trim().isEmpty() ? 0 : strH.split(" ").length);
                                            j$.util.stream.Collector collector = aido.a;
                                            java.util.List list = (aify) streamLimit.collect(collector);
                                            i = i2;
                                            aigf aigfVarC = defpackage.amev.c((aigf) j$.util.Collection.-EL.stream(amcpVarL.d.e()).collect(aido.b(new defpackage.alzr(18), new defpackage.amcr(altpVarB, 1))));
                                            j$.util.stream.Stream stream = j$.util.Collection.-EL.stream(amcpVarL.e);
                                            j$.util.Objects.requireNonNull(altpVarB);
                                            java.lang.Iterable iterable = (aify) stream.filter(new defpackage.amcc(altpVarB, 7)).map(new defpackage.alyy(altpVarB, 12)).map(new defpackage.alyy(altpVarB, 13)).collect(collector);
                                            defpackage.amcn amcnVar = new defpackage.amcn(amcpVarL);
                                            amcnVar.e(altpVarB.h(str2));
                                            amcnVar.f(aigfVarC);
                                            amcnVar.d(iterable);
                                            amcnVar.g(list);
                                            defpackage.amcp amcpVarA = amcnVar.a();
                                            aimzVar.b().l("com/google/quality/views/extraction/kcube/bg/ondevice/modules/vc/CacheSupportedAmStateManager", "getParserResultForState", 1701, "CacheSupportedAmStateManager.java").y("Online text used for parsing: '%s'", amcpVarA.b);
                                            aimzVar.b().l("com/google/quality/views/extraction/kcube/bg/ondevice/modules/vc/CacheSupportedAmStateManager", "getParserResultForState", 1702, "CacheSupportedAmStateManager.java").y("Endpoints used for parsing: '%s'", amcpVarA.a());
                                            aifyVarA = amcxVar.s.a(amcpVarA, defpackage.altp.b(length - strP.length(), length), i3);
                                        }
                                        reentrantLock.lock();
                                        try {
                                            aify aifyVar2 = aifyVarA.isEmpty() ? aike.a : (aify) j$.util.Collection.-EL.stream(aifyVarA.b(0, aifyVarA.size() - 1)).map(new defpackage.amcu(1)).map(new defpackage.amcu(0)).collect(aido.a);
                                            defpackage.amcx.a.b().l("com/google/quality/views/extraction/kcube/bg/ondevice/modules/vc/CacheSupportedAmStateManager", "consumeStateUpdates", 430, "CacheSupportedAmStateManager.java").y("Got suspected split points from parser: %s", aifyVar2);
                                            defpackage.amcm amcmVar2 = amcxVar.u;
                                            defpackage.amcm amcmVar3 = new defpackage.amcm(amcmVar2.a, amcmVar2.b, amcmVar2.c, defpackage.amcm.c(aifyVar2, amcmVar2.q()));
                                            if (i != atomicInteger.get()) {
                                                reentrantLock.unlock();
                                                try {
                                                    amcxVar.o(true);
                                                } catch (defpackage.aljs e3) {
                                                    a.by(defpackage.amcx.a.c(), "Runtime exception while parsing options.", "com/google/quality/views/extraction/kcube/bg/ondevice/modules/vc/CacheSupportedAmStateManager", "consumeStateUpdates", (char) 483, "CacheSupportedAmStateManager.java", e3);
                                                }
                                            } else {
                                                defpackage.amcm amcmVar4 = amcxVar.u;
                                                j$.util.Optional optionalM2 = amcmVar4.m();
                                                if (optionalM2.isEmpty()) {
                                                    str = "";
                                                } else {
                                                    java.util.ArrayList arrayList2 = amcmVar4.a;
                                                    str = (java.lang.String) j$.util.Collection.-EL.stream(arrayList2.subList(((java.lang.Integer) optionalM2.get()).intValue(), arrayList2.size())).map(new defpackage.alzr(14)).collect(j$.util.stream.Collectors.joining(" "));
                                                }
                                                if (str.isEmpty()) {
                                                    amcxVar.k.unlock();
                                                    try {
                                                        amcxVar.o(true);
                                                    } catch (defpackage.aljs e4) {
                                                        a.by(defpackage.amcx.a.c(), "Runtime exception while parsing options.", "com/google/quality/views/extraction/kcube/bg/ondevice/modules/vc/CacheSupportedAmStateManager", "consumeStateUpdates", (char) 483, "CacheSupportedAmStateManager.java", e4);
                                                    }
                                                } else {
                                                    defpackage.amcp amcpVarL2 = amcmVar.l(amcxVar.i);
                                                    defpackage.amcp amcpVarL3 = amcmVar3.l(amcxVar.i);
                                                    aimz aimzVar2 = defpackage.amcx.a;
                                                    aimw aimwVarL2 = aimzVar2.b().l("com/google/quality/views/extraction/kcube/bg/ondevice/modules/vc/CacheSupportedAmStateManager", "updateStateWithNewParserResult", 1728, "CacheSupportedAmStateManager.java");
                                                    java.lang.String str3 = amcpVarL3.b;
                                                    aimwVarL2.y("Full text used after parser result: '%s'", str3);
                                                    java.util.List listJ = ahzf.d(" ").j(str3);
                                                    int length2 = listJ.size() < 3 ? 0 : new ahyj(" ").b(listJ.subList(0, listJ.size() - 2)).length();
                                                    j$.util.stream.Stream stream2 = j$.util.Collection.-EL.stream(aifyVarA);
                                                    j$.util.Objects.requireNonNull(defpackage.amdv.class);
                                                    j$.util.stream.Stream map = stream2.filter(j$.util.function.Predicate.-CC.not(new defpackage.amcc(defpackage.amdv.class, 9))).filter(new sst(length2, 6)).map(new defpackage.amcr(amcpVarL3, 2));
                                                    j$.util.stream.Collector collector2 = aido.a;
                                                    aify aifyVarH = (aify) map.collect(collector2);
                                                    if (amcxVar.o) {
                                                        java.lang.String str4 = amcpVarL2.b;
                                                        if (!aifyVarH.isEmpty()) {
                                                            defpackage.amdz amdzVarD = (defpackage.amdz) ahvr.bk(aifyVarH);
                                                            int length3 = str4.length();
                                                            if (length3 < str3.length() && amdzVarD.a().b >= length3) {
                                                                defpackage.amdz.a.b().l("com/google/quality/views/extraction/kcube/bg/ondevice/modules/vc/ParsedOption", "extendToUnparsedSuffix", 272, "ParsedOption.java").M("Extending parsed option to cover unparsed tokens: %d->%d '%s'", java.lang.Integer.valueOf(length3), java.lang.Integer.valueOf(str3.length()), str3.substring(length3));
                                                                amdzVarD = amdzVarD.d(str3, str3.length());
                                                            }
                                                            aift aiftVar = new aift(4);
                                                            aiftVar.k(aifyVarH.b(0, aifyVarH.size() - 1));
                                                            aiftVar.i(amdzVarD);
                                                            aifyVarH = aiftVar.h();
                                                        }
                                                    }
                                                    int i4 = 0;
                                                    while (true) {
                                                        try {
                                                            if (i4 < aifyVarH.size() - 1) {
                                                                int i5 = ((defpackage.amdz) aifyVarH.get(i4)).a().b;
                                                                i4++;
                                                                int i6 = ((defpackage.amdz) aifyVarH.get(i4)).a().a;
                                                                if (i5 > i6) {
                                                                    aimzVar2.d().l("com/google/quality/views/extraction/kcube/bg/ondevice/modules/vc/CacheSupportedAmStateManager", "isBadOptionSpans", 1668, "CacheSupportedAmStateManager.java").z("Found overlapping options. End: %d, next start: %d.", i5, i6);
                                                                    int i7 = amcxVar.n + 1;
                                                                    amcxVar.n = i7;
                                                                    if (i7 > 2) {
                                                                        aimzVar2.c().l("com/google/quality/views/extraction/kcube/bg/ondevice/modules/vc/CacheSupportedAmStateManager", "updateStateWithNewParserResult", 1754, "CacheSupportedAmStateManager.java").v("Too many parser failures were ignored, not ignoring.");
                                                                    } else {
                                                                        aimzVar2.d().l("com/google/quality/views/extraction/kcube/bg/ondevice/modules/vc/CacheSupportedAmStateManager", "updateStateWithNewParserResult", 1757, "CacheSupportedAmStateManager.java").B("Ignoring parser failure due to known issue. Attempt number: %d. Options: %s", amcxVar.n, aifyVarH);
                                                                    }
                                                                    amcmVarJ = amcmVar3.j();
                                                                    aifyVarE = amcxVar.u.e();
                                                                    aifyVarE2 = amcmVarJ.e();
                                                                    if (aifyVarE.size() <= aifyVarE2.size()) {
                                                                        if (new aitr(aitt.n(aifyVarE, aifyVarE2)).b(true, new defpackage.ameq())) {
                                                                            if (amcxVar.w.isPresent()) {
                                                                                if (amcxVar.m.a().isBefore(((j$.time.Instant) amcxVar.w.get()).plus(defpackage.amcx.e))) {
                                                                                    aimzVar2.b().l("com/google/quality/views/extraction/kcube/bg/ondevice/modules/vc/CacheSupportedAmStateManager", "consumeStateUpdates", 457, "CacheSupportedAmStateManager.java").I("Skipping update due to unstable options. State before: %s\n State after: %s", amcxVar.u, amcmVarJ);
                                                                                    amcxVar.k.unlock();
                                                                                    try {
                                                                                        amcxVar.o(true);
                                                                                    } catch (defpackage.aljs e5) {
                                                                                        a.by(defpackage.amcx.a.c(), "Runtime exception while parsing options.", "com/google/quality/views/extraction/kcube/bg/ondevice/modules/vc/CacheSupportedAmStateManager", "consumeStateUpdates", (char) 483, "CacheSupportedAmStateManager.java", e5);
                                                                                    }
                                                                                }
                                                                            }
                                                                        }
                                                                    } else {
                                                                        if (aifyVarE.size() >= 2) {
                                                                            amceVar = (defpackage.amce) ahvr.bk(aifyVarE);
                                                                            if (amceVar.m() && amceVar.e().split(" ").length <= 3 && ((defpackage.amce) aifyVarE.get(aifyVarE.size() - 2)).m()) {
                                                                                if (new aitr(aitt.n(aifyVarE, aifyVarE2)).b(true, new defpackage.ameq())) {
                                                                                }
                                                                            }
                                                                        }
                                                                        if (amcxVar.w.isPresent()) {
                                                                            if (amcxVar.m.a().isBefore(((j$.time.Instant) amcxVar.w.get()).plus(defpackage.amcx.e))) {
                                                                                aimzVar2.b().l("com/google/quality/views/extraction/kcube/bg/ondevice/modules/vc/CacheSupportedAmStateManager", "consumeStateUpdates", 457, "CacheSupportedAmStateManager.java").I("Skipping update due to unstable options. State before: %s\n State after: %s", amcxVar.u, amcmVarJ);
                                                                                amcxVar.k.unlock();
                                                                                amcxVar.o(true);
                                                                            }
                                                                        }
                                                                    }
                                                                    amcxVar.w = j$.util.Optional.of(amcxVar.m.a());
                                                                    amcxVar.u = amcmVarJ;
                                                                    amcxVar.k.unlock();
                                                                    if (amcxVar.q && iCompareTo > 0) {
                                                                        duration = defpackage.amcx.d;
                                                                        amcxVar.j();
                                                                        amcxVar.l.c(1);
                                                                        atomicReference = amcxVar.p;
                                                                        synchronized (atomicReference) {
                                                                            try {
                                                                                atomicReference.set(j$.util.Optional.ofNullable(amcxVar.y.b(new defpackage.alvr(amcxVar, 4), duration)));
                                                                            } catch (java.lang.Throwable th4) {
                                                                                throw th4;
                                                                            }
                                                                        }
                                                                    }
                                                                    defpackage.amcx.a.b().l("com/google/quality/views/extraction/kcube/bg/ondevice/modules/vc/CacheSupportedAmStateManager", "consumeStateUpdates", 472, "CacheSupportedAmStateManager.java").v("Successfully updated menu state after text state update.");
                                                                    amcxVar.o(true);
                                                                }
                                                            }
                                                            amcxVar.o(true);
                                                        } catch (defpackage.aljs e6) {
                                                            a.by(defpackage.amcx.a.c(), "Runtime exception while parsing options.", "com/google/quality/views/extraction/kcube/bg/ondevice/modules/vc/CacheSupportedAmStateManager", "consumeStateUpdates", (char) 483, "CacheSupportedAmStateManager.java", e6);
                                                        }
                                                        int i8 = 0;
                                                        amcxVar.n = 0;
                                                        aify aifyVar3 = aifyVarN;
                                                        aify aifyVarG = amcmVar3.g(aifyVar3);
                                                        java.util.List list2 = (aify) j$.util.Collection.-EL.stream(aifyVarH).map(new defpackage.alzr(20)).collect(collector2);
                                                        int length4 = str3.length() - defpackage.amev.p(aifyVarG).length();
                                                        aizr aizrVar = amcxVar.m;
                                                        aift aiftVar2 = new aift(4);
                                                        long epochMilli = aizrVar.a().toEpochMilli();
                                                        int size2 = list2.size();
                                                        while (i8 < size2) {
                                                            defpackage.amdz amdzVar = (defpackage.amdz) list2.get(i8);
                                                            int i9 = amdzVar.a().a;
                                                            java.util.List list3 = list2;
                                                            int i10 = amdzVar.a().b;
                                                            aike aikeVarA = defpackage.amev.a(amcpVarL3, length4, i9, epochMilli);
                                                            aiftVar2.k(aikeVarA);
                                                            long j = epochMilli + ((long) aikeVarA.d);
                                                            akzx akzxVarC = amdzVar.c();
                                                            akzxVarC.u();
                                                            defpackage.amft amftVar = (defpackage.amft) akzxVarC.b;
                                                            defpackage.amft amftVar2 = defpackage.amft.a;
                                                            amftVar.b |= 2;
                                                            amftVar.f = j;
                                                            defpackage.amft amftVar3 = (defpackage.amft) akzxVarC.p();
                                                            defpackage.amcd amcdVarA = defpackage.amce.a();
                                                            amcdVarA.c(amftVar3);
                                                            aiftVar2.i(amcdVarA.a());
                                                            epochMilli = j + 1;
                                                            i8++;
                                                            length4 = i10;
                                                            list2 = list3;
                                                        }
                                                        if (length4 < str3.length() - 1) {
                                                            aiftVar2.k(defpackage.amev.a(amcpVarL3, length4, str3.length(), epochMilli));
                                                        }
                                                        amcmVar3 = amcmVar3.k(aifyVar3, aiftVar2.h());
                                                        amcmVarJ = amcmVar3.j();
                                                        aifyVarE = amcxVar.u.e();
                                                        aifyVarE2 = amcmVarJ.e();
                                                        if (aifyVarE.size() <= aifyVarE2.size()) {
                                                            if (new aitr(aitt.n(aifyVarE, aifyVarE2)).b(true, new defpackage.ameq())) {
                                                                if (amcxVar.w.isPresent()) {
                                                                    if (amcxVar.m.a().isBefore(((j$.time.Instant) amcxVar.w.get()).plus(defpackage.amcx.e))) {
                                                                        aimzVar2.b().l("com/google/quality/views/extraction/kcube/bg/ondevice/modules/vc/CacheSupportedAmStateManager", "consumeStateUpdates", 457, "CacheSupportedAmStateManager.java").I("Skipping update due to unstable options. State before: %s\n State after: %s", amcxVar.u, amcmVarJ);
                                                                        amcxVar.k.unlock();
                                                                        amcxVar.o(true);
                                                                    }
                                                                }
                                                            }
                                                        } else {
                                                            if (aifyVarE.size() >= 2) {
                                                                amceVar = (defpackage.amce) ahvr.bk(aifyVarE);
                                                                if (amceVar.m()) {
                                                                }
                                                            }
                                                            if (amcxVar.w.isPresent()) {
                                                                if (amcxVar.m.a().isBefore(((j$.time.Instant) amcxVar.w.get()).plus(defpackage.amcx.e))) {
                                                                    aimzVar2.b().l("com/google/quality/views/extraction/kcube/bg/ondevice/modules/vc/CacheSupportedAmStateManager", "consumeStateUpdates", 457, "CacheSupportedAmStateManager.java").I("Skipping update due to unstable options. State before: %s\n State after: %s", amcxVar.u, amcmVarJ);
                                                                    amcxVar.k.unlock();
                                                                    amcxVar.o(true);
                                                                }
                                                            }
                                                        }
                                                        amcxVar.w = j$.util.Optional.of(amcxVar.m.a());
                                                        amcxVar.u = amcmVarJ;
                                                        amcxVar.k.unlock();
                                                        if (amcxVar.q) {
                                                            duration = defpackage.amcx.d;
                                                            amcxVar.j();
                                                            amcxVar.l.c(1);
                                                            atomicReference = amcxVar.p;
                                                            synchronized (atomicReference) {
                                                                atomicReference.set(j$.util.Optional.ofNullable(amcxVar.y.b(new defpackage.alvr(amcxVar, 4), duration)));
                                                            }
                                                        }
                                                        defpackage.amcx.a.b().l("com/google/quality/views/extraction/kcube/bg/ondevice/modules/vc/CacheSupportedAmStateManager", "consumeStateUpdates", 472, "CacheSupportedAmStateManager.java").v("Successfully updated menu state after text state update.");
                                                    }
                                                }
                                            }
                                        } catch (java.lang.Throwable th5) {
                                            amcxVar.k.unlock();
                                            throw th5;
                                        }
                                    } catch (java.lang.Throwable th6) {
                                        amcxVar.k.unlock();
                                        throw th6;
                                    }
                                    th = th3;
                                    z2 = true;
                                } catch (java.lang.Throwable th7) {
                                    th = th7;
                                    z2 = true;
                                }
                            } catch (defpackage.aljs e7) {
                                e = e7;
                                defpackage.amcx.a.c().k(e).l("com/google/quality/views/extraction/kcube/bg/ondevice/modules/vc/CacheSupportedAmStateManager", "consumeStateUpdates", 477, "CacheSupportedAmStateManager.java").v("Runtime exception while parsing options.");
                                try {
                                    amcxVar.o(true);
                                    return null;
                                } catch (defpackage.aljs e8) {
                                    a.by(defpackage.amcx.a.c(), "Runtime exception while parsing options.", "com/google/quality/views/extraction/kcube/bg/ondevice/modules/vc/CacheSupportedAmStateManager", "consumeStateUpdates", (char) 483, "CacheSupportedAmStateManager.java", e8);
                                    return null;
                                }
                            } catch (java.lang.InterruptedException e9) {
                                defpackage.amcx.a.d().k(e9).l("com/google/quality/views/extraction/kcube/bg/ondevice/modules/vc/CacheSupportedAmStateManager", "consumeStateUpdates", 474, "CacheSupportedAmStateManager.java").v("Interruped while consuming state updates");
                                try {
                                    amcxVar.o(true);
                                    return null;
                                } catch (defpackage.aljs e10) {
                                    a.by(defpackage.amcx.a.c(), "Runtime exception while parsing options.", "com/google/quality/views/extraction/kcube/bg/ondevice/modules/vc/CacheSupportedAmStateManager", "consumeStateUpdates", (char) 483, "CacheSupportedAmStateManager.java", e10);
                                    return null;
                                }
                            } catch (java.lang.RuntimeException e11) {
                                e = e11;
                                defpackage.amcx.a.c().k(e).l("com/google/quality/views/extraction/kcube/bg/ondevice/modules/vc/CacheSupportedAmStateManager", "consumeStateUpdates", 477, "CacheSupportedAmStateManager.java").v("Runtime exception while parsing options.");
                                amcxVar.o(true);
                                return null;
                            }
                            try {
                                amcxVar.o(z2);
                                throw th;
                            } catch (defpackage.aljs e12) {
                                a.by(defpackage.amcx.a.c(), "Runtime exception while parsing options.", "com/google/quality/views/extraction/kcube/bg/ondevice/modules/vc/CacheSupportedAmStateManager", "consumeStateUpdates", (char) 483, "CacheSupportedAmStateManager.java", e12);
                                throw th;
                            }
                        }
                    }
                }, j$.util.Optional.empty());
            } catch (defpackage.aljs e2) {
                a.c().k(e2).l("com/google/quality/views/extraction/kcube/bg/ondevice/modules/vc/CacheSupportedAmStateManager", "startConsumingStateUpdates", 1386, "CacheSupportedAmStateManager.java").v("Failed to start consuming state updates.");
            }
        } finally {
            this.k.unlock();
        }
    }

    @Override // defpackage.amcg
    public final void j() {
        n();
        this.g.set(false);
        this.l.b();
        this.r.f();
    }

    /* JADX WARN: Code duplicated, block: B:135:0x04bf A[Catch: all -> 0x0bff, PHI: r2 r3 r4 r5
      0x04bf: PHI (r2v12 amcm) = (r2v11 amcm), (r2v131 amcm), (r2v11 amcm), (r2v11 amcm) binds: [B:94:0x0306, B:133:0x04b0, B:97:0x0310, B:99:0x0314] A[DONT_GENERATE, DONT_INLINE]
      0x04bf: PHI (r3v9 aify) = (r3v8 aify), (r3v74 aify), (r3v8 aify), (r3v8 aify) binds: [B:94:0x0306, B:133:0x04b0, B:97:0x0310, B:99:0x0314] A[DONT_GENERATE, DONT_INLINE]
      0x04bf: PHI (r4v26 amdq) = (r4v25 amdq), (r4v78 amdq), (r4v25 amdq), (r4v25 amdq) binds: [B:94:0x0306, B:133:0x04b0, B:97:0x0310, B:99:0x0314] A[DONT_GENERATE, DONT_INLINE]
      0x04bf: PHI (r5v23 ameo) = (r5v22 ameo), (r5v67 ameo), (r5v22 ameo), (r5v22 ameo) binds: [B:94:0x0306, B:133:0x04b0, B:97:0x0310, B:99:0x0314] A[DONT_GENERATE, DONT_INLINE], TryCatch #11 {all -> 0x0bff, blocks: (B:48:0x01ac, B:50:0x01b3, B:52:0x01bb, B:54:0x01d5, B:56:0x01f6, B:58:0x0212, B:60:0x0216, B:73:0x0296, B:75:0x02a5, B:79:0x02c7, B:81:0x02cd, B:88:0x02e1, B:90:0x02ed, B:92:0x02f3, B:93:0x0300, B:96:0x030a, B:98:0x0312, B:100:0x0316, B:107:0x0344, B:102:0x0329, B:104:0x0335, B:106:0x033b, B:109:0x034b, B:124:0x0411, B:126:0x0423, B:128:0x042f, B:131:0x0442, B:130:0x0435, B:132:0x044c, B:134:0x04b2, B:112:0x035a, B:113:0x0394, B:115:0x039a, B:118:0x03c8, B:123:0x03f8, B:122:0x03d4, B:108:0x0347, B:135:0x04bf, B:137:0x04d1, B:139:0x04da, B:141:0x04e6, B:151:0x04f9, B:153:0x04ff, B:155:0x050e, B:157:0x054b, B:159:0x056b, B:163:0x057d, B:165:0x0591, B:184:0x064b, B:186:0x0691, B:188:0x06d2, B:198:0x0741, B:189:0x06e8, B:190:0x06ef, B:192:0x06f5, B:194:0x0707, B:195:0x0717, B:196:0x071d, B:197:0x072c, B:166:0x05b3, B:169:0x05c0, B:171:0x05d2, B:173:0x05e8, B:175:0x05f2, B:176:0x0604, B:178:0x060a, B:180:0x0617, B:182:0x0622, B:183:0x062b, B:162:0x0577, B:203:0x076f, B:205:0x0785, B:207:0x0798, B:209:0x07b6, B:211:0x07c5, B:213:0x07cf, B:215:0x07e3, B:217:0x080b, B:219:0x0840, B:221:0x084f, B:223:0x085b, B:225:0x088e, B:226:0x08a4, B:228:0x08c2, B:229:0x08c4, B:231:0x08d4, B:254:0x0994, B:258:0x09b0, B:262:0x09c3, B:257:0x099e, B:232:0x08dc, B:234:0x08fb, B:235:0x0901, B:237:0x0921, B:239:0x0930, B:241:0x0936, B:243:0x093c, B:245:0x0948, B:247:0x0957, B:253:0x0990, B:252:0x0978, B:238:0x0926, B:220:0x084d, B:206:0x0788, B:82:0x02d0, B:84:0x02d8, B:86:0x02dc, B:87:0x02df, B:61:0x022e, B:63:0x023f, B:65:0x0249, B:67:0x024f, B:69:0x0255, B:70:0x027f, B:71:0x0282), top: B:393:0x01ac }] */
    /* JADX WARN: Code duplicated, block: B:137:0x04d1 A[Catch: all -> 0x0bff, TryCatch #11 {all -> 0x0bff, blocks: (B:48:0x01ac, B:50:0x01b3, B:52:0x01bb, B:54:0x01d5, B:56:0x01f6, B:58:0x0212, B:60:0x0216, B:73:0x0296, B:75:0x02a5, B:79:0x02c7, B:81:0x02cd, B:88:0x02e1, B:90:0x02ed, B:92:0x02f3, B:93:0x0300, B:96:0x030a, B:98:0x0312, B:100:0x0316, B:107:0x0344, B:102:0x0329, B:104:0x0335, B:106:0x033b, B:109:0x034b, B:124:0x0411, B:126:0x0423, B:128:0x042f, B:131:0x0442, B:130:0x0435, B:132:0x044c, B:134:0x04b2, B:112:0x035a, B:113:0x0394, B:115:0x039a, B:118:0x03c8, B:123:0x03f8, B:122:0x03d4, B:108:0x0347, B:135:0x04bf, B:137:0x04d1, B:139:0x04da, B:141:0x04e6, B:151:0x04f9, B:153:0x04ff, B:155:0x050e, B:157:0x054b, B:159:0x056b, B:163:0x057d, B:165:0x0591, B:184:0x064b, B:186:0x0691, B:188:0x06d2, B:198:0x0741, B:189:0x06e8, B:190:0x06ef, B:192:0x06f5, B:194:0x0707, B:195:0x0717, B:196:0x071d, B:197:0x072c, B:166:0x05b3, B:169:0x05c0, B:171:0x05d2, B:173:0x05e8, B:175:0x05f2, B:176:0x0604, B:178:0x060a, B:180:0x0617, B:182:0x0622, B:183:0x062b, B:162:0x0577, B:203:0x076f, B:205:0x0785, B:207:0x0798, B:209:0x07b6, B:211:0x07c5, B:213:0x07cf, B:215:0x07e3, B:217:0x080b, B:219:0x0840, B:221:0x084f, B:223:0x085b, B:225:0x088e, B:226:0x08a4, B:228:0x08c2, B:229:0x08c4, B:231:0x08d4, B:254:0x0994, B:258:0x09b0, B:262:0x09c3, B:257:0x099e, B:232:0x08dc, B:234:0x08fb, B:235:0x0901, B:237:0x0921, B:239:0x0930, B:241:0x0936, B:243:0x093c, B:245:0x0948, B:247:0x0957, B:253:0x0990, B:252:0x0978, B:238:0x0926, B:220:0x084d, B:206:0x0788, B:82:0x02d0, B:84:0x02d8, B:86:0x02dc, B:87:0x02df, B:61:0x022e, B:63:0x023f, B:65:0x0249, B:67:0x024f, B:69:0x0255, B:70:0x027f, B:71:0x0282), top: B:393:0x01ac }] */
    /* JADX WARN: Code duplicated, block: B:139:0x04da A[Catch: all -> 0x0bff, TryCatch #11 {all -> 0x0bff, blocks: (B:48:0x01ac, B:50:0x01b3, B:52:0x01bb, B:54:0x01d5, B:56:0x01f6, B:58:0x0212, B:60:0x0216, B:73:0x0296, B:75:0x02a5, B:79:0x02c7, B:81:0x02cd, B:88:0x02e1, B:90:0x02ed, B:92:0x02f3, B:93:0x0300, B:96:0x030a, B:98:0x0312, B:100:0x0316, B:107:0x0344, B:102:0x0329, B:104:0x0335, B:106:0x033b, B:109:0x034b, B:124:0x0411, B:126:0x0423, B:128:0x042f, B:131:0x0442, B:130:0x0435, B:132:0x044c, B:134:0x04b2, B:112:0x035a, B:113:0x0394, B:115:0x039a, B:118:0x03c8, B:123:0x03f8, B:122:0x03d4, B:108:0x0347, B:135:0x04bf, B:137:0x04d1, B:139:0x04da, B:141:0x04e6, B:151:0x04f9, B:153:0x04ff, B:155:0x050e, B:157:0x054b, B:159:0x056b, B:163:0x057d, B:165:0x0591, B:184:0x064b, B:186:0x0691, B:188:0x06d2, B:198:0x0741, B:189:0x06e8, B:190:0x06ef, B:192:0x06f5, B:194:0x0707, B:195:0x0717, B:196:0x071d, B:197:0x072c, B:166:0x05b3, B:169:0x05c0, B:171:0x05d2, B:173:0x05e8, B:175:0x05f2, B:176:0x0604, B:178:0x060a, B:180:0x0617, B:182:0x0622, B:183:0x062b, B:162:0x0577, B:203:0x076f, B:205:0x0785, B:207:0x0798, B:209:0x07b6, B:211:0x07c5, B:213:0x07cf, B:215:0x07e3, B:217:0x080b, B:219:0x0840, B:221:0x084f, B:223:0x085b, B:225:0x088e, B:226:0x08a4, B:228:0x08c2, B:229:0x08c4, B:231:0x08d4, B:254:0x0994, B:258:0x09b0, B:262:0x09c3, B:257:0x099e, B:232:0x08dc, B:234:0x08fb, B:235:0x0901, B:237:0x0921, B:239:0x0930, B:241:0x0936, B:243:0x093c, B:245:0x0948, B:247:0x0957, B:253:0x0990, B:252:0x0978, B:238:0x0926, B:220:0x084d, B:206:0x0788, B:82:0x02d0, B:84:0x02d8, B:86:0x02dc, B:87:0x02df, B:61:0x022e, B:63:0x023f, B:65:0x0249, B:67:0x024f, B:69:0x0255, B:70:0x027f, B:71:0x0282), top: B:393:0x01ac }] */
    /* JADX WARN: Code duplicated, block: B:141:0x04e6 A[Catch: all -> 0x0bff, TryCatch #11 {all -> 0x0bff, blocks: (B:48:0x01ac, B:50:0x01b3, B:52:0x01bb, B:54:0x01d5, B:56:0x01f6, B:58:0x0212, B:60:0x0216, B:73:0x0296, B:75:0x02a5, B:79:0x02c7, B:81:0x02cd, B:88:0x02e1, B:90:0x02ed, B:92:0x02f3, B:93:0x0300, B:96:0x030a, B:98:0x0312, B:100:0x0316, B:107:0x0344, B:102:0x0329, B:104:0x0335, B:106:0x033b, B:109:0x034b, B:124:0x0411, B:126:0x0423, B:128:0x042f, B:131:0x0442, B:130:0x0435, B:132:0x044c, B:134:0x04b2, B:112:0x035a, B:113:0x0394, B:115:0x039a, B:118:0x03c8, B:123:0x03f8, B:122:0x03d4, B:108:0x0347, B:135:0x04bf, B:137:0x04d1, B:139:0x04da, B:141:0x04e6, B:151:0x04f9, B:153:0x04ff, B:155:0x050e, B:157:0x054b, B:159:0x056b, B:163:0x057d, B:165:0x0591, B:184:0x064b, B:186:0x0691, B:188:0x06d2, B:198:0x0741, B:189:0x06e8, B:190:0x06ef, B:192:0x06f5, B:194:0x0707, B:195:0x0717, B:196:0x071d, B:197:0x072c, B:166:0x05b3, B:169:0x05c0, B:171:0x05d2, B:173:0x05e8, B:175:0x05f2, B:176:0x0604, B:178:0x060a, B:180:0x0617, B:182:0x0622, B:183:0x062b, B:162:0x0577, B:203:0x076f, B:205:0x0785, B:207:0x0798, B:209:0x07b6, B:211:0x07c5, B:213:0x07cf, B:215:0x07e3, B:217:0x080b, B:219:0x0840, B:221:0x084f, B:223:0x085b, B:225:0x088e, B:226:0x08a4, B:228:0x08c2, B:229:0x08c4, B:231:0x08d4, B:254:0x0994, B:258:0x09b0, B:262:0x09c3, B:257:0x099e, B:232:0x08dc, B:234:0x08fb, B:235:0x0901, B:237:0x0921, B:239:0x0930, B:241:0x0936, B:243:0x093c, B:245:0x0948, B:247:0x0957, B:253:0x0990, B:252:0x0978, B:238:0x0926, B:220:0x084d, B:206:0x0788, B:82:0x02d0, B:84:0x02d8, B:86:0x02dc, B:87:0x02df, B:61:0x022e, B:63:0x023f, B:65:0x0249, B:67:0x024f, B:69:0x0255, B:70:0x027f, B:71:0x0282), top: B:393:0x01ac }] */
    /* JADX WARN: Code duplicated, block: B:144:0x04eb A[LOOP:3: B:138:0x04d8->B:144:0x04eb, LOOP_END] */
    /* JADX WARN: Code duplicated, block: B:148:0x04f4  */
    /* JADX WARN: Code duplicated, block: B:149:0x04f6  */
    /* JADX WARN: Code duplicated, block: B:151:0x04f9 A[Catch: all -> 0x0bff, TryCatch #11 {all -> 0x0bff, blocks: (B:48:0x01ac, B:50:0x01b3, B:52:0x01bb, B:54:0x01d5, B:56:0x01f6, B:58:0x0212, B:60:0x0216, B:73:0x0296, B:75:0x02a5, B:79:0x02c7, B:81:0x02cd, B:88:0x02e1, B:90:0x02ed, B:92:0x02f3, B:93:0x0300, B:96:0x030a, B:98:0x0312, B:100:0x0316, B:107:0x0344, B:102:0x0329, B:104:0x0335, B:106:0x033b, B:109:0x034b, B:124:0x0411, B:126:0x0423, B:128:0x042f, B:131:0x0442, B:130:0x0435, B:132:0x044c, B:134:0x04b2, B:112:0x035a, B:113:0x0394, B:115:0x039a, B:118:0x03c8, B:123:0x03f8, B:122:0x03d4, B:108:0x0347, B:135:0x04bf, B:137:0x04d1, B:139:0x04da, B:141:0x04e6, B:151:0x04f9, B:153:0x04ff, B:155:0x050e, B:157:0x054b, B:159:0x056b, B:163:0x057d, B:165:0x0591, B:184:0x064b, B:186:0x0691, B:188:0x06d2, B:198:0x0741, B:189:0x06e8, B:190:0x06ef, B:192:0x06f5, B:194:0x0707, B:195:0x0717, B:196:0x071d, B:197:0x072c, B:166:0x05b3, B:169:0x05c0, B:171:0x05d2, B:173:0x05e8, B:175:0x05f2, B:176:0x0604, B:178:0x060a, B:180:0x0617, B:182:0x0622, B:183:0x062b, B:162:0x0577, B:203:0x076f, B:205:0x0785, B:207:0x0798, B:209:0x07b6, B:211:0x07c5, B:213:0x07cf, B:215:0x07e3, B:217:0x080b, B:219:0x0840, B:221:0x084f, B:223:0x085b, B:225:0x088e, B:226:0x08a4, B:228:0x08c2, B:229:0x08c4, B:231:0x08d4, B:254:0x0994, B:258:0x09b0, B:262:0x09c3, B:257:0x099e, B:232:0x08dc, B:234:0x08fb, B:235:0x0901, B:237:0x0921, B:239:0x0930, B:241:0x0936, B:243:0x093c, B:245:0x0948, B:247:0x0957, B:253:0x0990, B:252:0x0978, B:238:0x0926, B:220:0x084d, B:206:0x0788, B:82:0x02d0, B:84:0x02d8, B:86:0x02dc, B:87:0x02df, B:61:0x022e, B:63:0x023f, B:65:0x0249, B:67:0x024f, B:69:0x0255, B:70:0x027f, B:71:0x0282), top: B:393:0x01ac }] */
    /* JADX WARN: Code duplicated, block: B:152:0x04fe  */
    /* JADX WARN: Code duplicated, block: B:155:0x050e A[Catch: all -> 0x0bff, TryCatch #11 {all -> 0x0bff, blocks: (B:48:0x01ac, B:50:0x01b3, B:52:0x01bb, B:54:0x01d5, B:56:0x01f6, B:58:0x0212, B:60:0x0216, B:73:0x0296, B:75:0x02a5, B:79:0x02c7, B:81:0x02cd, B:88:0x02e1, B:90:0x02ed, B:92:0x02f3, B:93:0x0300, B:96:0x030a, B:98:0x0312, B:100:0x0316, B:107:0x0344, B:102:0x0329, B:104:0x0335, B:106:0x033b, B:109:0x034b, B:124:0x0411, B:126:0x0423, B:128:0x042f, B:131:0x0442, B:130:0x0435, B:132:0x044c, B:134:0x04b2, B:112:0x035a, B:113:0x0394, B:115:0x039a, B:118:0x03c8, B:123:0x03f8, B:122:0x03d4, B:108:0x0347, B:135:0x04bf, B:137:0x04d1, B:139:0x04da, B:141:0x04e6, B:151:0x04f9, B:153:0x04ff, B:155:0x050e, B:157:0x054b, B:159:0x056b, B:163:0x057d, B:165:0x0591, B:184:0x064b, B:186:0x0691, B:188:0x06d2, B:198:0x0741, B:189:0x06e8, B:190:0x06ef, B:192:0x06f5, B:194:0x0707, B:195:0x0717, B:196:0x071d, B:197:0x072c, B:166:0x05b3, B:169:0x05c0, B:171:0x05d2, B:173:0x05e8, B:175:0x05f2, B:176:0x0604, B:178:0x060a, B:180:0x0617, B:182:0x0622, B:183:0x062b, B:162:0x0577, B:203:0x076f, B:205:0x0785, B:207:0x0798, B:209:0x07b6, B:211:0x07c5, B:213:0x07cf, B:215:0x07e3, B:217:0x080b, B:219:0x0840, B:221:0x084f, B:223:0x085b, B:225:0x088e, B:226:0x08a4, B:228:0x08c2, B:229:0x08c4, B:231:0x08d4, B:254:0x0994, B:258:0x09b0, B:262:0x09c3, B:257:0x099e, B:232:0x08dc, B:234:0x08fb, B:235:0x0901, B:237:0x0921, B:239:0x0930, B:241:0x0936, B:243:0x093c, B:245:0x0948, B:247:0x0957, B:253:0x0990, B:252:0x0978, B:238:0x0926, B:220:0x084d, B:206:0x0788, B:82:0x02d0, B:84:0x02d8, B:86:0x02dc, B:87:0x02df, B:61:0x022e, B:63:0x023f, B:65:0x0249, B:67:0x024f, B:69:0x0255, B:70:0x027f, B:71:0x0282), top: B:393:0x01ac }] */
    /* JADX WARN: Code duplicated, block: B:157:0x054b A[Catch: all -> 0x0bff, TryCatch #11 {all -> 0x0bff, blocks: (B:48:0x01ac, B:50:0x01b3, B:52:0x01bb, B:54:0x01d5, B:56:0x01f6, B:58:0x0212, B:60:0x0216, B:73:0x0296, B:75:0x02a5, B:79:0x02c7, B:81:0x02cd, B:88:0x02e1, B:90:0x02ed, B:92:0x02f3, B:93:0x0300, B:96:0x030a, B:98:0x0312, B:100:0x0316, B:107:0x0344, B:102:0x0329, B:104:0x0335, B:106:0x033b, B:109:0x034b, B:124:0x0411, B:126:0x0423, B:128:0x042f, B:131:0x0442, B:130:0x0435, B:132:0x044c, B:134:0x04b2, B:112:0x035a, B:113:0x0394, B:115:0x039a, B:118:0x03c8, B:123:0x03f8, B:122:0x03d4, B:108:0x0347, B:135:0x04bf, B:137:0x04d1, B:139:0x04da, B:141:0x04e6, B:151:0x04f9, B:153:0x04ff, B:155:0x050e, B:157:0x054b, B:159:0x056b, B:163:0x057d, B:165:0x0591, B:184:0x064b, B:186:0x0691, B:188:0x06d2, B:198:0x0741, B:189:0x06e8, B:190:0x06ef, B:192:0x06f5, B:194:0x0707, B:195:0x0717, B:196:0x071d, B:197:0x072c, B:166:0x05b3, B:169:0x05c0, B:171:0x05d2, B:173:0x05e8, B:175:0x05f2, B:176:0x0604, B:178:0x060a, B:180:0x0617, B:182:0x0622, B:183:0x062b, B:162:0x0577, B:203:0x076f, B:205:0x0785, B:207:0x0798, B:209:0x07b6, B:211:0x07c5, B:213:0x07cf, B:215:0x07e3, B:217:0x080b, B:219:0x0840, B:221:0x084f, B:223:0x085b, B:225:0x088e, B:226:0x08a4, B:228:0x08c2, B:229:0x08c4, B:231:0x08d4, B:254:0x0994, B:258:0x09b0, B:262:0x09c3, B:257:0x099e, B:232:0x08dc, B:234:0x08fb, B:235:0x0901, B:237:0x0921, B:239:0x0930, B:241:0x0936, B:243:0x093c, B:245:0x0948, B:247:0x0957, B:253:0x0990, B:252:0x0978, B:238:0x0926, B:220:0x084d, B:206:0x0788, B:82:0x02d0, B:84:0x02d8, B:86:0x02dc, B:87:0x02df, B:61:0x022e, B:63:0x023f, B:65:0x0249, B:67:0x024f, B:69:0x0255, B:70:0x027f, B:71:0x0282), top: B:393:0x01ac }] */
    /* JADX WARN: Code duplicated, block: B:158:0x0569  */
    /* JADX WARN: Code duplicated, block: B:161:0x0575  */
    /* JADX WARN: Code duplicated, block: B:162:0x0577 A[Catch: all -> 0x0bff, TryCatch #11 {all -> 0x0bff, blocks: (B:48:0x01ac, B:50:0x01b3, B:52:0x01bb, B:54:0x01d5, B:56:0x01f6, B:58:0x0212, B:60:0x0216, B:73:0x0296, B:75:0x02a5, B:79:0x02c7, B:81:0x02cd, B:88:0x02e1, B:90:0x02ed, B:92:0x02f3, B:93:0x0300, B:96:0x030a, B:98:0x0312, B:100:0x0316, B:107:0x0344, B:102:0x0329, B:104:0x0335, B:106:0x033b, B:109:0x034b, B:124:0x0411, B:126:0x0423, B:128:0x042f, B:131:0x0442, B:130:0x0435, B:132:0x044c, B:134:0x04b2, B:112:0x035a, B:113:0x0394, B:115:0x039a, B:118:0x03c8, B:123:0x03f8, B:122:0x03d4, B:108:0x0347, B:135:0x04bf, B:137:0x04d1, B:139:0x04da, B:141:0x04e6, B:151:0x04f9, B:153:0x04ff, B:155:0x050e, B:157:0x054b, B:159:0x056b, B:163:0x057d, B:165:0x0591, B:184:0x064b, B:186:0x0691, B:188:0x06d2, B:198:0x0741, B:189:0x06e8, B:190:0x06ef, B:192:0x06f5, B:194:0x0707, B:195:0x0717, B:196:0x071d, B:197:0x072c, B:166:0x05b3, B:169:0x05c0, B:171:0x05d2, B:173:0x05e8, B:175:0x05f2, B:176:0x0604, B:178:0x060a, B:180:0x0617, B:182:0x0622, B:183:0x062b, B:162:0x0577, B:203:0x076f, B:205:0x0785, B:207:0x0798, B:209:0x07b6, B:211:0x07c5, B:213:0x07cf, B:215:0x07e3, B:217:0x080b, B:219:0x0840, B:221:0x084f, B:223:0x085b, B:225:0x088e, B:226:0x08a4, B:228:0x08c2, B:229:0x08c4, B:231:0x08d4, B:254:0x0994, B:258:0x09b0, B:262:0x09c3, B:257:0x099e, B:232:0x08dc, B:234:0x08fb, B:235:0x0901, B:237:0x0921, B:239:0x0930, B:241:0x0936, B:243:0x093c, B:245:0x0948, B:247:0x0957, B:253:0x0990, B:252:0x0978, B:238:0x0926, B:220:0x084d, B:206:0x0788, B:82:0x02d0, B:84:0x02d8, B:86:0x02dc, B:87:0x02df, B:61:0x022e, B:63:0x023f, B:65:0x0249, B:67:0x024f, B:69:0x0255, B:70:0x027f, B:71:0x0282), top: B:393:0x01ac }] */
    /* JADX WARN: Code duplicated, block: B:165:0x0591 A[Catch: all -> 0x0bff, TryCatch #11 {all -> 0x0bff, blocks: (B:48:0x01ac, B:50:0x01b3, B:52:0x01bb, B:54:0x01d5, B:56:0x01f6, B:58:0x0212, B:60:0x0216, B:73:0x0296, B:75:0x02a5, B:79:0x02c7, B:81:0x02cd, B:88:0x02e1, B:90:0x02ed, B:92:0x02f3, B:93:0x0300, B:96:0x030a, B:98:0x0312, B:100:0x0316, B:107:0x0344, B:102:0x0329, B:104:0x0335, B:106:0x033b, B:109:0x034b, B:124:0x0411, B:126:0x0423, B:128:0x042f, B:131:0x0442, B:130:0x0435, B:132:0x044c, B:134:0x04b2, B:112:0x035a, B:113:0x0394, B:115:0x039a, B:118:0x03c8, B:123:0x03f8, B:122:0x03d4, B:108:0x0347, B:135:0x04bf, B:137:0x04d1, B:139:0x04da, B:141:0x04e6, B:151:0x04f9, B:153:0x04ff, B:155:0x050e, B:157:0x054b, B:159:0x056b, B:163:0x057d, B:165:0x0591, B:184:0x064b, B:186:0x0691, B:188:0x06d2, B:198:0x0741, B:189:0x06e8, B:190:0x06ef, B:192:0x06f5, B:194:0x0707, B:195:0x0717, B:196:0x071d, B:197:0x072c, B:166:0x05b3, B:169:0x05c0, B:171:0x05d2, B:173:0x05e8, B:175:0x05f2, B:176:0x0604, B:178:0x060a, B:180:0x0617, B:182:0x0622, B:183:0x062b, B:162:0x0577, B:203:0x076f, B:205:0x0785, B:207:0x0798, B:209:0x07b6, B:211:0x07c5, B:213:0x07cf, B:215:0x07e3, B:217:0x080b, B:219:0x0840, B:221:0x084f, B:223:0x085b, B:225:0x088e, B:226:0x08a4, B:228:0x08c2, B:229:0x08c4, B:231:0x08d4, B:254:0x0994, B:258:0x09b0, B:262:0x09c3, B:257:0x099e, B:232:0x08dc, B:234:0x08fb, B:235:0x0901, B:237:0x0921, B:239:0x0930, B:241:0x0936, B:243:0x093c, B:245:0x0948, B:247:0x0957, B:253:0x0990, B:252:0x0978, B:238:0x0926, B:220:0x084d, B:206:0x0788, B:82:0x02d0, B:84:0x02d8, B:86:0x02dc, B:87:0x02df, B:61:0x022e, B:63:0x023f, B:65:0x0249, B:67:0x024f, B:69:0x0255, B:70:0x027f, B:71:0x0282), top: B:393:0x01ac }] */
    /* JADX WARN: Code duplicated, block: B:166:0x05b3 A[Catch: all -> 0x0bff, TryCatch #11 {all -> 0x0bff, blocks: (B:48:0x01ac, B:50:0x01b3, B:52:0x01bb, B:54:0x01d5, B:56:0x01f6, B:58:0x0212, B:60:0x0216, B:73:0x0296, B:75:0x02a5, B:79:0x02c7, B:81:0x02cd, B:88:0x02e1, B:90:0x02ed, B:92:0x02f3, B:93:0x0300, B:96:0x030a, B:98:0x0312, B:100:0x0316, B:107:0x0344, B:102:0x0329, B:104:0x0335, B:106:0x033b, B:109:0x034b, B:124:0x0411, B:126:0x0423, B:128:0x042f, B:131:0x0442, B:130:0x0435, B:132:0x044c, B:134:0x04b2, B:112:0x035a, B:113:0x0394, B:115:0x039a, B:118:0x03c8, B:123:0x03f8, B:122:0x03d4, B:108:0x0347, B:135:0x04bf, B:137:0x04d1, B:139:0x04da, B:141:0x04e6, B:151:0x04f9, B:153:0x04ff, B:155:0x050e, B:157:0x054b, B:159:0x056b, B:163:0x057d, B:165:0x0591, B:184:0x064b, B:186:0x0691, B:188:0x06d2, B:198:0x0741, B:189:0x06e8, B:190:0x06ef, B:192:0x06f5, B:194:0x0707, B:195:0x0717, B:196:0x071d, B:197:0x072c, B:166:0x05b3, B:169:0x05c0, B:171:0x05d2, B:173:0x05e8, B:175:0x05f2, B:176:0x0604, B:178:0x060a, B:180:0x0617, B:182:0x0622, B:183:0x062b, B:162:0x0577, B:203:0x076f, B:205:0x0785, B:207:0x0798, B:209:0x07b6, B:211:0x07c5, B:213:0x07cf, B:215:0x07e3, B:217:0x080b, B:219:0x0840, B:221:0x084f, B:223:0x085b, B:225:0x088e, B:226:0x08a4, B:228:0x08c2, B:229:0x08c4, B:231:0x08d4, B:254:0x0994, B:258:0x09b0, B:262:0x09c3, B:257:0x099e, B:232:0x08dc, B:234:0x08fb, B:235:0x0901, B:237:0x0921, B:239:0x0930, B:241:0x0936, B:243:0x093c, B:245:0x0948, B:247:0x0957, B:253:0x0990, B:252:0x0978, B:238:0x0926, B:220:0x084d, B:206:0x0788, B:82:0x02d0, B:84:0x02d8, B:86:0x02dc, B:87:0x02df, B:61:0x022e, B:63:0x023f, B:65:0x0249, B:67:0x024f, B:69:0x0255, B:70:0x027f, B:71:0x0282), top: B:393:0x01ac }] */
    /* JADX WARN: Code duplicated, block: B:216:0x0809 A[PHI: r6
      0x0809: PHI (r6v21 java.lang.Object) = (r6v74 java.lang.Object), (r6v75 java.lang.Object) binds: [B:212:0x07cd, B:214:0x07e1] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Code duplicated, block: B:313:0x0ab2 A[Catch: all -> 0x0bf0, TryCatch #0 {all -> 0x0bf0, blocks: (B:311:0x0a91, B:313:0x0ab2, B:314:0x0abd, B:322:0x0aef, B:325:0x0b09, B:310:0x0a82, B:321:0x0adc), top: B:376:0x09cd }] */
    /* JADX WARN: Code duplicated, block: B:406:0x04ef A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:407:0x04f1 A[EDGE_INSN: B:407:0x04f1->B:146:0x04f1 BREAK  A[LOOP:3: B:138:0x04d8->B:144:0x04eb], SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:72:0x0295 A[EDGE_INSN: B:71:0x0282->B:72:0x0295 BREAK  A[LOOP:6: B:62:0x023d->B:70:0x027f], EDGE_INSN: B:69:0x0255->B:72:0x0295 BREAK  A[LOOP:6: B:62:0x023d->B:70:0x027f]] */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r11v1, types: [java.lang.String] */
    /* JADX WARN: Type inference failed for: r13v3, types: [java.lang.Object, java.util.Map] */
    /* JADX WARN: Type inference failed for: r24v10 */
    /* JADX WARN: Type inference failed for: r24v13 */
    /* JADX WARN: Type inference failed for: r24v14 */
    /* JADX WARN: Type inference failed for: r24v2 */
    /* JADX WARN: Type inference failed for: r24v3 */
    /* JADX WARN: Type inference failed for: r24v4 */
    /* JADX WARN: Type inference failed for: r24v5 */
    /* JADX WARN: Type inference failed for: r24v9 */
    /* JADX WARN: Type inference failed for: r5v34, types: [java.lang.Object, java.util.List] */
    /* JADX WARN: Type inference failed for: r6v26, types: [amcm] */
    /* JADX WARN: Type inference failed for: r9v0, types: [java.lang.String] */
    /* JADX WARN: Type inference failed for: r9v105 */
    /* JADX WARN: Type inference failed for: r9v106, types: [java.lang.String] */
    /* JADX WARN: Type inference failed for: r9v107 */
    /* JADX WARN: Type inference failed for: r9v108 */
    /* JADX WARN: Type inference failed for: r9v109 */
    /* JADX WARN: Type inference failed for: r9v110 */
    /* JADX WARN: Type inference failed for: r9v111 */
    /* JADX WARN: Type inference failed for: r9v2 */
    /* JADX WARN: Type inference failed for: r9v3, types: [java.lang.String] */
    /* JADX WARN: Type inference failed for: r9v38 */
    /* JADX WARN: Type inference failed for: r9v4 */
    /* JADX WARN: Type inference failed for: r9v5, types: [java.lang.String] */
    /* JADX WARN: Type inference failed for: r9v78 */
    /* JADX WARN: Type inference failed for: r9v79, types: [java.lang.String] */
    /* JADX WARN: Type inference failed for: r9v80 */
    /* JADX WARN: Type inference failed for: r9v81 */
    /* JADX WARN: Type inference failed for: r9v82 */
    /* JADX WARN: Type inference failed for: r9v83 */
    /*  JADX ERROR: JadxRuntimeException in pass: RegionMakerVisitor
        jadx.core.utils.exceptions.JadxRuntimeException: Not found exit edge by exit block: B:167:0x05bc
        	at jadx.core.dex.visitors.regions.maker.LoopRegionMaker.checkLoopExits(LoopRegionMaker.java:272)
        	at jadx.core.dex.visitors.regions.maker.LoopRegionMaker.makeLoopRegion(LoopRegionMaker.java:237)
        	at jadx.core.dex.visitors.regions.maker.LoopRegionMaker.process(LoopRegionMaker.java:80)
        	at jadx.core.dex.visitors.regions.maker.RegionMaker.traverse(RegionMaker.java:92)
        	at jadx.core.dex.visitors.regions.maker.RegionMaker.makeRegion(RegionMaker.java:69)
        	at jadx.core.dex.visitors.regions.maker.IfRegionMaker.process(IfRegionMaker.java:117)
        	at jadx.core.dex.visitors.regions.maker.RegionMaker.traverse(RegionMaker.java:109)
        	at jadx.core.dex.visitors.regions.maker.RegionMaker.makeRegion(RegionMaker.java:69)
        	at jadx.core.dex.visitors.regions.maker.IfRegionMaker.process(IfRegionMaker.java:111)
        	at jadx.core.dex.visitors.regions.maker.RegionMaker.traverse(RegionMaker.java:109)
        	at jadx.core.dex.visitors.regions.maker.RegionMaker.makeRegion(RegionMaker.java:69)
        	at jadx.core.dex.visitors.regions.maker.IfRegionMaker.process(IfRegionMaker.java:111)
        	at jadx.core.dex.visitors.regions.maker.RegionMaker.traverse(RegionMaker.java:109)
        	at jadx.core.dex.visitors.regions.maker.RegionMaker.makeRegion(RegionMaker.java:69)
        	at jadx.core.dex.visitors.regions.maker.IfRegionMaker.process(IfRegionMaker.java:117)
        	at jadx.core.dex.visitors.regions.maker.RegionMaker.traverse(RegionMaker.java:109)
        	at jadx.core.dex.visitors.regions.maker.RegionMaker.makeRegion(RegionMaker.java:69)
        	at jadx.core.dex.visitors.regions.maker.IfRegionMaker.process(IfRegionMaker.java:117)
        	at jadx.core.dex.visitors.regions.maker.RegionMaker.traverse(RegionMaker.java:109)
        	at jadx.core.dex.visitors.regions.maker.RegionMaker.makeRegion(RegionMaker.java:69)
        	at jadx.core.dex.visitors.regions.maker.IfRegionMaker.process(IfRegionMaker.java:111)
        	at jadx.core.dex.visitors.regions.maker.RegionMaker.traverse(RegionMaker.java:109)
        	at jadx.core.dex.visitors.regions.maker.RegionMaker.makeRegion(RegionMaker.java:69)
        	at jadx.core.dex.visitors.regions.maker.IfRegionMaker.process(IfRegionMaker.java:117)
        	at jadx.core.dex.visitors.regions.maker.RegionMaker.traverse(RegionMaker.java:109)
        	at jadx.core.dex.visitors.regions.maker.RegionMaker.makeRegion(RegionMaker.java:69)
        	at jadx.core.dex.visitors.regions.maker.IfRegionMaker.process(IfRegionMaker.java:111)
        	at jadx.core.dex.visitors.regions.maker.RegionMaker.traverse(RegionMaker.java:109)
        	at jadx.core.dex.visitors.regions.maker.RegionMaker.makeRegion(RegionMaker.java:69)
        	at jadx.core.dex.visitors.regions.maker.IfRegionMaker.process(IfRegionMaker.java:111)
        	at jadx.core.dex.visitors.regions.maker.RegionMaker.traverse(RegionMaker.java:109)
        	at jadx.core.dex.visitors.regions.maker.RegionMaker.makeRegion(RegionMaker.java:69)
        	at jadx.core.dex.visitors.regions.maker.RegionMaker.makeMthRegion(RegionMaker.java:49)
        	at jadx.core.dex.visitors.regions.RegionMakerVisitor.visit(RegionMakerVisitor.java:25)
        */
    @Override // defpackage.amcg
    public final void k(alqu r32) {
        /*
            Method dump skipped, instruction units count: 3187
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.amcx.k(alqu):void");
    }

    /* JADX WARN: Type inference failed for: r5v29, types: [java.lang.Object, java.util.concurrent.Executor] */
    @Override // defpackage.amcg
    public final void l(final defpackage.alqh alqhVar, defpackage.alqk alqkVar, j$.util.Optional optional, final j$.util.Optional optional2, defpackage.almb almbVar) throws java.lang.Throwable {
        java.lang.Object bufferedReader;
        this.I = optional;
        this.n = 0;
        apdi apdiVar = amgg.y;
        alqkVar.c(apdiVar);
        java.lang.Object objJ = ((alaa) alqkVar).n.j((alac) apdiVar.a);
        if (objJ == null) {
            objJ = apdiVar.b;
        } else {
            apdiVar.c(objJ);
        }
        amgg amggVar = (amgg) objJ;
        this.E = amggVar.r;
        this.F = amggVar.v;
        this.o = amggVar.x;
        java.util.Map map = this.G;
        defpackage.amdd amddVar = defpackage.amdd.b;
        if (map.containsKey(amddVar) && amggVar.c) {
            a.b().l("com/google/quality/views/extraction/kcube/bg/ondevice/modules/vc/CacheSupportedAmStateManager", "init", 1423, "CacheSupportedAmStateManager.java").v("Creating learned intent extractor.");
            this.s = (defpackage.amdf) map.get(amddVar);
        } else {
            a.b().l("com/google/quality/views/extraction/kcube/bg/ondevice/modules/vc/CacheSupportedAmStateManager", "init", 1426, "CacheSupportedAmStateManager.java").v("Creating regexp intent extractor.");
            this.s = (defpackage.amdf) map.get(defpackage.amdd.a);
        }
        this.q = amggVar.h;
        defpackage.amey ameyVar = this.R;
        ameyVar.b = j$.util.Optional.of(optional2.get());
        j$.util.Optional optionalOf = j$.util.Optional.of(almbVar.d);
        optionalOf.isPresent();
        if (true != anty.aD((java.lang.String) optionalOf.get())) {
            optionalOf = j$.util.Optional.empty();
        }
        ameyVar.c = optionalOf;
        j$.util.Optional optionalOf2 = j$.util.Optional.of(almbVar.c);
        optionalOf2.isPresent();
        if (true != anty.aD((java.lang.String) optionalOf2.get())) {
            optionalOf2 = j$.util.Optional.empty();
        }
        ameyVar.d = optionalOf2;
        j$.util.Optional optionalOf3 = j$.util.Optional.of(almbVar.e);
        optionalOf3.isPresent();
        if (true != anty.aD((java.lang.String) optionalOf3.get())) {
            optionalOf3 = j$.util.Optional.empty();
        }
        ameyVar.e = optionalOf3;
        j$.util.Optional optionalOf4 = j$.util.Optional.of(almbVar.i);
        optionalOf4.isPresent();
        if (true != anty.aD((java.lang.String) optionalOf4.get())) {
            optionalOf4 = j$.util.Optional.empty();
        }
        ameyVar.f = optionalOf4;
        j$.util.Optional optionalOf5 = j$.util.Optional.of(almbVar.j);
        optionalOf5.isPresent();
        if (true != anty.aD((java.lang.String) optionalOf5.get())) {
            optionalOf5 = j$.util.Optional.empty();
        }
        ameyVar.g = optionalOf5;
        if (amggVar.w) {
            defpackage.ameh amehVar = new defpackage.ameh(this.i);
            amehVar.a = new defpackage.amem(1);
            amehVar.e(5);
            this.i = amehVar.a();
        } else {
            try {
                defpackage.ameh amehVar2 = new defpackage.ameh(this.i);
                aihb aihbVar = new aihb();
                java.io.BufferedReader bufferedReader2 = null;
                try {
                    try {
                        j$.util.Optional optionalOfNullable = ameyVar.b;
                        defpackage.amck amckVar = new defpackage.amck(ameyVar, 4);
                        if (true == optionalOfNullable.isPresent()) {
                            optionalOfNullable = j$.util.Optional.ofNullable((java.io.BufferedReader) ahzq.c(new defpackage.amex((defpackage.amey) amckVar.a, (alqd) optionalOfNullable.get(), 2)));
                        }
                        if (true == optionalOfNullable.isPresent()) {
                            bufferedReader = optionalOfNullable.get();
                        } else {
                            defpackage.amey.a.d().l("com/google/quality/views/extraction/kcube/bg/ondevice/modules/vc/VcAssetsModelsRepository", "endpointingWordsVocab", 167, "VcAssetsModelsRepository.java").v("FileGetter missing.");
                            bufferedReader = new java.io.BufferedReader(ae$.ExternalSyntheticApiModelOutline0.m());
                        }
                        java.io.BufferedReader bufferedReader3 = (java.io.BufferedReader) bufferedReader;
                        while (bufferedReader3.ready()) {
                            try {
                                aihbVar.i(bufferedReader3.readLine());
                            } catch (ahzq e2) {
                                e = e2;
                                throw e.d(java.io.IOException.class);
                            } catch (java.lang.Throwable th) {
                                th = th;
                                bufferedReader2 = bufferedReader3;
                                if (bufferedReader2 != null) {
                                    bufferedReader2.close();
                                }
                                throw th;
                            }
                        }
                        bufferedReader3.close();
                        amehVar2.a = new defpackage.amek(aihbVar.h());
                        this.i = amehVar2.a();
                    } catch (java.lang.Throwable th2) {
                        th = th2;
                    }
                } catch (ahzq e3) {
                    e = e3;
                }
            } catch (java.io.IOException e4) {
                a.by(a.c(), "Failed to fetch endpointing_words_vocab.", "com/google/quality/views/extraction/kcube/bg/ondevice/modules/vc/CacheSupportedAmStateManager", "init", (char) 1449, "CacheSupportedAmStateManager.java", e4);
            }
        }
        this.k.lock();
        try {
            this.t = new defpackage.amcj(this.S, this.m);
            this.k.unlock();
            if (amggVar.i) {
                this.T.c(new java.util.concurrent.Callable() { // from class: amcw
                    @Override // java.util.concurrent.Callable
                    public final java.lang.Object call() {
                        j$.util.Optional optionalEmpty;
                        java.util.concurrent.locks.ReentrantLock reentrantLock;
                        j$.util.Optional optionalEmpty2;
                        defpackage.alqh alqhVar2 = alqhVar;
                        java.lang.Object obj = optional2.get();
                        java.lang.String str = alqhVar2.b;
                        defpackage.amcx amcxVar = this.a;
                        defpackage.amfk amfkVar = (defpackage.amfk) amcxVar.j.get();
                        defpackage.amcx.a.b().l("com/google/quality/views/extraction/kcube/bg/ondevice/modules/vc/CacheSupportedAmStateManager", "initializeAmCache", 1497, "CacheSupportedAmStateManager.java").v("Fetching cache entry for call");
                        try {
                            j$.nio.file.Path pathOf = j$.nio.file.Path.-CC.of("..", new java.lang.String[]{"am_cache/am_cache.pb"});
                            defpackage.amdc.a.b().l("com/google/quality/views/extraction/kcube/bg/ondevice/modules/vc/DownloadedAmCacheFetcher", "getAmCacheFromModelPath", 51, "DownloadedAmCacheFetcher.java").y("Looking for cache at path: %s", pathOf);
                            try {
                                optionalEmpty2 = j$.util.Optional.of((defpackage.amfk) alad.B(defpackage.amfk.a, ((alqd) obj).e(pathOf.toString()), akzq.a()));
                            } catch (java.io.IOException unused) {
                                defpackage.amdc.a.d().l("com/google/quality/views/extraction/kcube/bg/ondevice/modules/vc/DownloadedAmCacheFetcher", "getAmCacheFromModelPath", 57, "DownloadedAmCacheFetcher.java").v("AM cache not found.");
                                optionalEmpty2 = j$.util.Optional.empty();
                            }
                            defpackage.amfk amfkVar2 = (defpackage.amfk) optionalEmpty2.orElse(amfkVar);
                            j$.util.Objects.requireNonNull(str);
                            defpackage.amfl amflVar = (defpackage.amfl) amfkVar2.b.get(str);
                            if (amflVar == null) {
                                amflVar = null;
                            }
                            if (amflVar != null) {
                                optionalEmpty = j$.util.Optional.of(amflVar);
                            } else {
                                defpackage.amdc.a.b().l("com/google/quality/views/extraction/kcube/bg/ondevice/modules/vc/DownloadedAmCacheFetcher", "findAmCacheInfo", 71, "DownloadedAmCacheFetcher.java").v("Original number not found in cache DB. Trying with appended international dial code");
                                java.lang.String numberToE164 = android.telephony.PhoneNumberUtils.formatNumberToE164(str, "US");
                                j$.util.Objects.requireNonNull(numberToE164);
                                defpackage.amfl amflVar2 = (defpackage.amfl) amfkVar2.b.get(numberToE164);
                                if (amflVar2 == null) {
                                    amflVar2 = null;
                                }
                                optionalEmpty = j$.util.Optional.ofNullable(amflVar2);
                            }
                            if (optionalEmpty.isEmpty()) {
                                defpackage.amdc.a.b().l("com/google/quality/views/extraction/kcube/bg/ondevice/modules/vc/DownloadedAmCacheFetcher", "fetchAmCache", 35, "DownloadedAmCacheFetcher.java").v("No AM cache entry for business.");
                                optionalEmpty = j$.util.Optional.empty();
                            }
                        } catch (java.lang.Exception e5) {
                            a.by(defpackage.amdc.a.c(), "Failed to fetch AM cache.", "com/google/quality/views/extraction/kcube/bg/ondevice/modules/vc/DownloadedAmCacheFetcher", "fetchAmCache", '(', "DownloadedAmCacheFetcher.java", e5);
                            optionalEmpty = j$.util.Optional.empty();
                        }
                        if (optionalEmpty.isPresent()) {
                            amcxVar.k.lock();
                            try {
                                try {
                                    amcxVar.v = j$.util.Optional.of(new defpackage.ambu((defpackage.amfl) optionalEmpty.get()));
                                    defpackage.amcx.a.b().l("com/google/quality/views/extraction/kcube/bg/ondevice/modules/vc/CacheSupportedAmStateManager", "initializeAmCache", 1503, "CacheSupportedAmStateManager.java").v("Successfully initiailzed cache");
                                    reentrantLock = amcxVar.k;
                                } catch (java.lang.Throwable th3) {
                                    amcxVar.k.unlock();
                                    throw th3;
                                }
                            } catch (defpackage.amde e6) {
                                defpackage.amcx.a.d().k(e6).l("com/google/quality/views/extraction/kcube/bg/ondevice/modules/vc/CacheSupportedAmStateManager", "initializeAmCache", 1505, "CacheSupportedAmStateManager.java").v("Cache is malformed - AmCache not initialized");
                                amcxVar.v = j$.util.Optional.empty();
                                reentrantLock = amcxVar.k;
                            }
                            reentrantLock.unlock();
                        }
                        return null;
                    }
                }, j$.util.Optional.empty());
            }
            defpackage.amac amacVar = this.T;
            ajcq ajcqVarB = this.s.b(alqkVar);
            ahds ahdsVar = new ahds(this, 15);
            j$.util.Optional optionalOf6 = j$.util.Optional.of(new defpackage.aljn(this, 4));
            amacVar.e();
            amacVar.d(ajan.f(ajcqVarB, ahdsVar, (java.util.concurrent.Executor) ((j$.util.Optional) amacVar.b).get()), optionalOf6, ((defpackage.alpg) amacVar.a).a());
        } catch (java.lang.Throwable th3) {
            this.k.unlock();
            throw th3;
        }
    }

    public final void n() {
        j$.util.Optional optional = (j$.util.Optional) this.p.getAndSet(j$.util.Optional.empty());
        defpackage.alqf alqfVar = this.y;
        j$.util.Objects.requireNonNull(alqfVar);
        defpackage.alui aluiVar = new defpackage.alui(alqfVar, 15);
        if (true == optional.isPresent()) {
            java.lang.Object obj = optional.get();
            ((defpackage.alqf) aluiVar.a).a((java.lang.String) obj);
        }
    }

    /* JADX WARN: Type inference failed for: r1v5, types: [java.lang.Object, java.util.function.Consumer] */
    public final void o(boolean z2) {
        defpackage.amfv amfvVarA = a();
        defpackage.amfu amfuVar = amfvVarA.c;
        if (amfuVar == null) {
            amfuVar = defpackage.amfu.a;
        }
        aify.n(amfuVar.b);
        j$.util.Optional optional = this.I;
        defpackage.alui aluiVar = new defpackage.alui(amfvVarA, 18);
        if (true == optional.isPresent()) {
            optional.get().accept(aluiVar.a);
        }
        defpackage.amci amciVar = this.r;
        if (!z2) {
            amciVar.h(defpackage.alnb.EVENT_CALL_MENU_STATE, amfvVarA, new defpackage.acul(this, 4));
        } else {
            defpackage.acul aculVar = new defpackage.acul(this, 4);
            amciVar.b.c(1);
            amciVar.h(defpackage.alnb.EVENT_CALL_MENU_STATE_PARSING_RESULT, amfvVarA, aculVar);
        }
    }

    @Override // defpackage.amcg
    public final void m() {
    }
}
