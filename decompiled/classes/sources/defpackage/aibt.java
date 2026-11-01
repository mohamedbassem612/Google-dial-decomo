package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes.dex */
public final class aibt extends java.util.AbstractMap implements java.util.concurrent.ConcurrentMap, j$.util.concurrent.ConcurrentMap {
    static final java.util.logging.Logger a = java.util.logging.Logger.getLogger(defpackage.aibt.class.getName());
    public static final defpackage.aibi b = new defpackage.aiac();
    static final java.util.Queue c = new defpackage.aiad();
    private static final boolean x = ((java.lang.String) j$.util.Objects.requireNonNull(java.lang.System.getProperty("java.runtime.name", ""))).contains("Android");
    final int d;
    final int e;
    final defpackage.aiaz[] f;
    final int g;
    public final defpackage.ahxt h;
    final defpackage.ahxt i;
    final defpackage.aibb j;
    final defpackage.aibb k;
    final long l;
    final long m;
    final long n;
    final java.util.Queue o;
    final defpackage.aibv p;
    public final defpackage.ahzp q;
    final defpackage.aiap r;
    java.util.Set s;
    java.util.Collection t;
    java.util.Set u;
    final defpackage.ahzz v;
    final aprf w;

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r1v0, types: [aibt, java.util.AbstractMap] */
    public aibt(defpackage.aiaa aiaaVar) {
        long j;
        ?? abstractMap = new java.util.AbstractMap();
        int i = aiaaVar.d;
        abstractMap.g = java.lang.Math.min(i == -1 ? 4 : i, 65536);
        defpackage.aibb aibbVarB = aiaaVar.b();
        abstractMap.j = aibbVarB;
        abstractMap.k = aiaaVar.c();
        abstractMap.h = (defpackage.ahxt) defpackage.ahvr.m(aiaaVar.k, aiaaVar.b().a());
        abstractMap.i = (defpackage.ahxt) defpackage.ahvr.m(aiaaVar.l, aiaaVar.c().a());
        if (aiaaVar.i == 0 || aiaaVar.j == 0) {
            j = 0;
        } else {
            j = aiaaVar.p == null ? aiaaVar.e : aiaaVar.f;
        }
        abstractMap.l = j;
        abstractMap.v = (defpackage.ahzz) defpackage.ahvr.m(aiaaVar.p, defpackage.ahzz.INSTANCE);
        long j2 = aiaaVar.j;
        abstractMap.m = j2 == -1 ? 0L : j2;
        long j3 = aiaaVar.i;
        abstractMap.n = j3 != -1 ? j3 : 0L;
        defpackage.aibv aibvVar = aiaaVar.m;
        defpackage.ahzy ahzyVar = defpackage.ahzy.INSTANCE;
        defpackage.aibv aibvVar2 = (defpackage.aibv) defpackage.ahvr.m(aibvVar, ahzyVar);
        abstractMap.p = aibvVar2;
        abstractMap.o = aibvVar2 == ahzyVar ? c : new j$.util.concurrent.ConcurrentLinkedQueue();
        int i2 = 0;
        int i3 = 1;
        boolean z = abstractMap.l() || abstractMap.i();
        defpackage.ahzp ahzpVar = aiaaVar.n;
        if (ahzpVar == null) {
            ahzpVar = z ? defpackage.ahzp.a : defpackage.aiaa.b;
        }
        abstractMap.q = ahzpVar;
        char c2 = (abstractMap.m() || abstractMap.i()) ? (char) 1 : (char) 0;
        boolean z2 = abstractMap.j() || abstractMap.l();
        defpackage.aiap aiapVar = defpackage.aiap.a;
        abstractMap.r = defpackage.aiap.i[(aibbVarB != defpackage.aibb.c ? (char) 0 : (char) 4) | c2 | (true != z2 ? 0 : 2)];
        abstractMap.w = null;
        int iMin = (!abstractMap.h() || abstractMap.g()) ? 16 : (int) java.lang.Math.min(16L, j);
        int i4 = 0;
        int i5 = 1;
        while (i5 < abstractMap.g && (!abstractMap.h() || ((long) i5) * 20 <= abstractMap.l)) {
            i4++;
            i5 <<= 1;
        }
        abstractMap.e = 32 - i4;
        abstractMap.d = i5 - 1;
        abstractMap.f = new defpackage.aiaz[i5];
        int i6 = iMin / i5;
        while (i3 < (i6 * i5 < iMin ? i6 + 1 : i6)) {
            i3 <<= 1;
        }
        if (abstractMap.h()) {
            long j4 = i5;
            long j5 = abstractMap.l;
            long j6 = (j5 / j4) + 1;
            long j7 = j5 % j4;
            while (true) {
                defpackage.aiaz[] aiazVarArr = abstractMap.f;
                if (i2 >= aiazVarArr.length) {
                    return;
                }
                if (i2 == j7) {
                    j6--;
                }
                long j8 = j6;
                aiazVarArr[i2] = new defpackage.aiaz(abstractMap, i3, j8, (defpackage.ahvr) ((defpackage.ahzm) aiaaVar.o).a);
                i2++;
                j6 = j8;
            }
        } else {
            int i7 = i3;
            defpackage.aibt aibtVar = abstractMap;
            while (true) {
                defpackage.aiaz[] aiazVarArr2 = aibtVar.f;
                if (i2 >= aiazVarArr2.length) {
                    return;
                }
                aiazVarArr2[i2] = new defpackage.aiaz(aibtVar, i7, -1L, (defpackage.ahvr) ((defpackage.ahzm) aiaaVar.o).a);
                i2++;
                aibtVar = this;
            }
        }
    }

    static void c(defpackage.aibu aibuVar, defpackage.aibu aibuVar2) {
        aibuVar.l(aibuVar2);
        aibuVar2.n(aibuVar);
    }

    static void d(defpackage.aibu aibuVar, defpackage.aibu aibuVar2) {
        aibuVar.m(aibuVar2);
        aibuVar2.o(aibuVar);
    }

    static void e(defpackage.aibu aibuVar) {
        defpackage.aiay aiayVar = defpackage.aiay.INSTANCE;
        aibuVar.l(aiayVar);
        aibuVar.n(aiayVar);
    }

    static void f(defpackage.aibu aibuVar) {
        defpackage.aiay aiayVar = defpackage.aiay.INSTANCE;
        aibuVar.m(aiayVar);
        aibuVar.o(aiayVar);
    }

    /* JADX WARN: Failed to restore switch over string. Please report as a decompilation issue */
    public static void p(java.lang.Object obj) {
        if (obj == null || x) {
            return;
        }
        java.lang.String name = obj.getClass().getName();
        switch (name.hashCode()) {
            case -2123038604:
                if (!name.equals("java.time.chrono.HijrahDate")) {
                    return;
                }
                break;
            case -2073921873:
                if (!name.equals("java.util.OptionalInt")) {
                    return;
                }
                break;
            case -1917484011:
                if (!name.equals("java.time.OffsetTime")) {
                    return;
                }
                break;
            case -1246518012:
                if (!name.equals("java.time.LocalDate")) {
                    return;
                }
                break;
            case -1246033885:
                if (!name.equals("java.time.LocalTime")) {
                    return;
                }
                break;
            case -1244060399:
                if (!name.equals("java.util.OptionalDouble")) {
                    return;
                }
                break;
            case -1062742510:
                if (!name.equals("java.time.Year")) {
                    return;
                }
                break;
            case -1023498007:
                if (!name.equals("java.time.Duration")) {
                    return;
                }
                break;
            case -1022890317:
                if (!name.equals("java.time.chrono.MinguoDate")) {
                    return;
                }
                break;
            case -761719520:
                if (!name.equals("java.util.Optional")) {
                    return;
                }
                break;
            case -537503858:
                if (!name.equals("java.time.YearMonth")) {
                    return;
                }
                break;
            case -515992664:
                if (!name.equals("java.lang.Short")) {
                    return;
                }
                break;
            case 133021628:
                if (!name.equals("java.util.OptionalLong")) {
                    return;
                }
                break;
            case 155276373:
                if (!name.equals("java.lang.Character")) {
                    return;
                }
                break;
            case 398507100:
                if (!name.equals("java.lang.Byte")) {
                    return;
                }
                break;
            case 649475153:
                if (!name.equals("java.time.MonthDay")) {
                    return;
                }
                break;
            case 649503318:
                if (!name.equals("java.time.Period")) {
                    return;
                }
                break;
            case 761287205:
                if (!name.equals("java.lang.Double")) {
                    return;
                }
                break;
            case 968136245:
                if (!name.equals("java.time.chrono.JapaneseDate")) {
                    return;
                }
                break;
            case 1296075756:
                if (!name.equals("java.time.Instant")) {
                    return;
                }
                break;
            case 1505337278:
                if (!name.equals("java.time.ZonedDateTime")) {
                    return;
                }
                break;
            case 1518087925:
                if (!name.equals("java.time.chrono.ThaiBuddhistDate")) {
                    return;
                }
                break;
            default:
                return;
        }
        throw new java.lang.IllegalArgumentException("Cannot create a weak or soft reference to a value class: ".concat(java.lang.String.valueOf(obj.getClass().getName())));
    }

    public final int a(java.lang.Object obj) {
        int iC = this.h.c(obj);
        int i = iC + ((iC << 15) ^ (-12931));
        int i2 = i ^ (i >>> 10);
        int i3 = i2 + (i2 << 3);
        int i4 = i3 ^ (i3 >>> 6);
        int i5 = i4 + (i4 << 2) + (i4 << 14);
        return i5 ^ (i5 >>> 16);
    }

    public final defpackage.aiaz b(int i) {
        return this.f[(i >>> this.e) & this.d];
    }

    @Override // java.util.AbstractMap, java.util.Map
    public final void clear() {
        for (defpackage.aiaz aiazVar : this.f) {
            if (aiazVar.b != 0) {
                aiazVar.lock();
                try {
                    defpackage.aibt aibtVar = aiazVar.a;
                    aiazVar.s(aibtVar.q.a());
                    java.util.concurrent.atomic.AtomicReferenceArray atomicReferenceArray = aiazVar.f;
                    for (int i = 0; i < atomicReferenceArray.length(); i++) {
                        for (defpackage.aibu aibuVarE = (defpackage.aibu) atomicReferenceArray.get(i); aibuVarE != null; aibuVarE = aibuVarE.e()) {
                            if (aibuVarE.d().f()) {
                                java.lang.Object objJ = aibuVarE.j();
                                java.lang.Object obj = aibuVarE.d().get();
                                int i2 = 3;
                                if (objJ != null && obj != null) {
                                    i2 = 1;
                                }
                                aibuVarE.a();
                                aiazVar.x(objJ, obj, aibuVarE.d().a(), i2);
                            }
                        }
                    }
                    for (int i3 = 0; i3 < atomicReferenceArray.length(); i3++) {
                        atomicReferenceArray.set(i3, null);
                    }
                    if (aibtVar.n()) {
                        while (aiazVar.h.poll() != null) {
                        }
                    }
                    if (aibtVar.o()) {
                        while (aiazVar.i.poll() != null) {
                        }
                    }
                    aiazVar.l.clear();
                    aiazVar.m.clear();
                    aiazVar.k.set(0);
                    aiazVar.d++;
                    aiazVar.b = 0;
                    aiazVar.unlock();
                    aiazVar.t();
                } catch (java.lang.Throwable th) {
                    aiazVar.unlock();
                    aiazVar.t();
                    throw th;
                }
            }
        }
    }

    @Override // java.util.Map, java.util.concurrent.ConcurrentMap
    public final /* synthetic */ java.lang.Object compute(java.lang.Object obj, java.util.function.BiFunction biFunction) {
        return j$.util.concurrent.ConcurrentMap.-CC.$default$compute(this, obj, biFunction);
    }

    @Override // java.util.Map, java.util.concurrent.ConcurrentMap
    public final /* synthetic */ java.lang.Object computeIfAbsent(java.lang.Object obj, java.util.function.Function function) {
        return j$.util.concurrent.ConcurrentMap.-CC.$default$computeIfAbsent(this, obj, function);
    }

    @Override // java.util.Map, java.util.concurrent.ConcurrentMap
    public final /* synthetic */ java.lang.Object computeIfPresent(java.lang.Object obj, java.util.function.BiFunction biFunction) {
        return j$.util.concurrent.ConcurrentMap.-CC.$default$computeIfPresent(this, obj, biFunction);
    }

    @Override // java.util.AbstractMap, java.util.Map
    public final boolean containsKey(java.lang.Object obj) {
        defpackage.aibu aibuVarC;
        boolean z = false;
        if (obj != null) {
            int iA = a(obj);
            defpackage.aiaz aiazVarB = b(iA);
            try {
                if (aiazVarB.b != 0 && (aibuVarC = aiazVarB.c(obj, iA, aiazVarB.a.q.a())) != null && aibuVarC.d().get() != null) {
                    z = true;
                }
            } finally {
                aiazVarB.o();
            }
        }
        return z;
    }

    @Override // java.util.AbstractMap, java.util.Map
    public final boolean containsValue(java.lang.Object obj) {
        if (obj != null) {
            defpackage.ahzp ahzpVar = this.q;
            defpackage.aiaz[] aiazVarArr = this.f;
            long jA = ahzpVar.a();
            long j = -1;
            int i = 0;
            while (i < 3) {
                int length = aiazVarArr.length;
                long j2 = 0;
                int i2 = 0;
                while (i2 < length) {
                    defpackage.aiaz aiazVar = aiazVarArr[i2];
                    int i3 = aiazVar.b;
                    java.util.concurrent.atomic.AtomicReferenceArray atomicReferenceArray = aiazVar.f;
                    for (int i4 = 0; i4 < atomicReferenceArray.length(); i4++) {
                        defpackage.aibu aibuVarE = (defpackage.aibu) atomicReferenceArray.get(i4);
                        while (aibuVarE != null) {
                            int i5 = i;
                            java.lang.Object objG = aiazVar.g(aibuVarE, jA);
                            defpackage.aibu aibuVar = aibuVarE;
                            if (objG != null && this.i.d(obj, objG)) {
                                return true;
                            }
                            aibuVarE = aibuVar.e();
                            i = i5;
                        }
                    }
                    j2 += (long) aiazVar.d;
                    i2++;
                    i = i;
                }
                int i6 = i;
                if (j2 == j) {
                    break;
                }
                i = i6 + 1;
                j = j2;
            }
        }
        return false;
    }

    @Override // java.util.AbstractMap, java.util.Map
    public final java.util.Set entrySet() {
        java.util.Set set = this.u;
        if (set != null) {
            return set;
        }
        aiar aiarVar = new aiar(this);
        this.u = aiarVar;
        return aiarVar;
    }

    @Override // java.util.Map, java.util.concurrent.ConcurrentMap
    public final /* synthetic */ void forEach(java.util.function.BiConsumer biConsumer) {
        j$.util.concurrent.ConcurrentMap.-CC.$default$forEach(this, biConsumer);
    }

    final boolean g() {
        return this.v != defpackage.ahzz.INSTANCE;
    }

    @Override // java.util.AbstractMap, java.util.Map
    public final java.lang.Object get(java.lang.Object obj) {
        if (obj == null) {
            return null;
        }
        int iA = a(obj);
        return b(iA).f(obj, iA);
    }

    @Override // java.util.Map, java.util.concurrent.ConcurrentMap
    public final java.lang.Object getOrDefault(java.lang.Object obj, java.lang.Object obj2) {
        java.lang.Object obj3 = get(obj);
        return obj3 != null ? obj3 : obj2;
    }

    final boolean h() {
        return this.l >= 0;
    }

    final boolean i() {
        return this.m > 0;
    }

    @Override // java.util.AbstractMap, java.util.Map
    public final boolean isEmpty() {
        defpackage.aiaz[] aiazVarArr = this.f;
        long j = 0;
        for (defpackage.aiaz aiazVar : aiazVarArr) {
            if (aiazVar.b != 0) {
                return false;
            }
            j += (long) aiazVar.d;
        }
        if (j != 0) {
            for (defpackage.aiaz aiazVar2 : aiazVarArr) {
                if (aiazVar2.b != 0) {
                    return false;
                }
                j -= (long) aiazVar2.d;
            }
            if (j != 0) {
                return false;
            }
        }
        return true;
    }

    final boolean j() {
        return this.n > 0;
    }

    public final boolean k(defpackage.aibu aibuVar, long j) {
        aibuVar.getClass();
        if (!i() || j - aibuVar.b() < this.m) {
            return j() && j - aibuVar.c() >= this.n;
        }
        return true;
    }

    @Override // java.util.AbstractMap, java.util.Map
    public final java.util.Set keySet() {
        java.util.Set set = this.s;
        if (set != null) {
            return set;
        }
        aiau aiauVar = new aiau(this);
        this.s = aiauVar;
        return aiauVar;
    }

    final boolean l() {
        return j();
    }

    final boolean m() {
        return i() || h();
    }

    @Override // java.util.Map, java.util.concurrent.ConcurrentMap
    public final /* synthetic */ java.lang.Object merge(java.lang.Object obj, java.lang.Object obj2, java.util.function.BiFunction biFunction) {
        return j$.util.concurrent.ConcurrentMap.-CC.$default$merge(this, obj, obj2, biFunction);
    }

    final boolean n() {
        return this.j != defpackage.aibb.a;
    }

    final boolean o() {
        return this.k != defpackage.aibb.a;
    }

    @Override // java.util.AbstractMap, java.util.Map
    public final java.lang.Object put(java.lang.Object obj, java.lang.Object obj2) {
        obj.getClass();
        obj2.getClass();
        int iA = a(obj);
        return b(iA).h(obj, iA, obj2, false);
    }

    @Override // java.util.AbstractMap, java.util.Map
    public final void putAll(java.util.Map map) {
        for (java.util.Map.Entry entry : map.entrySet()) {
            put(entry.getKey(), entry.getValue());
        }
    }

    @Override // java.util.Map, java.util.concurrent.ConcurrentMap
    public final java.lang.Object putIfAbsent(java.lang.Object obj, java.lang.Object obj2) {
        defpackage.ahvr.ci(obj);
        defpackage.ahvr.ci(obj2);
        int iA = a(obj);
        return b(iA).h(obj, iA, obj2, true);
    }

    @Override // java.util.Map, java.util.concurrent.ConcurrentMap
    public final boolean remove(java.lang.Object obj, java.lang.Object obj2) {
        int i;
        boolean z = false;
        if (obj != null && obj2 != null) {
            int iA = a(obj);
            defpackage.aiaz aiazVarB = b(iA);
            aiazVarB.lock();
            try {
                defpackage.aibt aibtVar = aiazVarB.a;
                aiazVarB.s(aibtVar.q.a());
                java.util.concurrent.atomic.AtomicReferenceArray atomicReferenceArray = aiazVarB.f;
                int length = iA & (atomicReferenceArray.length() - 1);
                defpackage.aibu aibuVar = (defpackage.aibu) atomicReferenceArray.get(length);
                for (defpackage.aibu aibuVarE = aibuVar; aibuVarE != null; aibuVarE = aibuVarE.e()) {
                    java.lang.Object objJ = aibuVarE.j();
                    if (aibuVarE.a() == iA && objJ != null && aibtVar.h.d(obj, objJ)) {
                        defpackage.aibi aibiVarD = aibuVarE.d();
                        java.lang.Object obj3 = aibiVarD.get();
                        if (!aibtVar.i.d(obj2, obj3)) {
                            if (obj3 != null || !aibiVarD.f()) {
                                break;
                                break;
                            }
                            obj3 = null;
                            i = 3;
                        } else {
                            i = 1;
                        }
                        aiazVarB.d++;
                        atomicReferenceArray.set(length, aiazVarB.y(aibuVar, aibuVarE, objJ, obj3, aibiVarD, i));
                        aiazVarB.b--;
                        if (i != 1) {
                            break;
                        }
                        z = true;
                        break;
                    }
                }
            } finally {
                aiazVarB.unlock();
                aiazVarB.t();
            }
        }
        return z;
    }

    @Override // java.util.Map, java.util.concurrent.ConcurrentMap
    public final boolean replace(java.lang.Object obj, java.lang.Object obj2, java.lang.Object obj3) {
        defpackage.ahvr.ci(obj);
        defpackage.ahvr.ci(obj3);
        boolean z = false;
        if (obj2 != null) {
            int iA = a(obj);
            defpackage.aiaz aiazVarB = b(iA);
            aiazVarB.lock();
            try {
                defpackage.aibt aibtVar = aiazVarB.a;
                long jA = aibtVar.q.a();
                aiazVarB.s(jA);
                java.util.concurrent.atomic.AtomicReferenceArray atomicReferenceArray = aiazVarB.f;
                int length = iA & (atomicReferenceArray.length() - 1);
                defpackage.aibu aibuVar = (defpackage.aibu) atomicReferenceArray.get(length);
                long j = jA;
                defpackage.aibu aibuVarE = aibuVar;
                while (aibuVarE != null) {
                    defpackage.aibu aibuVar2 = aibuVar;
                    java.lang.Object objJ = aibuVarE.j();
                    if (aibuVarE.a() == iA && objJ != null && aibtVar.h.d(obj, objJ)) {
                        long j2 = j;
                        defpackage.aibi aibiVarD = aibuVarE.d();
                        java.lang.Object obj4 = aibiVarD.get();
                        if (obj4 != null) {
                            if (!aibtVar.i.d(obj2, obj4)) {
                                aiazVarB.p(aibuVarE, j2);
                                break;
                            }
                            aiazVarB.d++;
                            aiazVarB.x(obj, obj4, aibiVarD.a(), 2);
                            aiazVarB.z(aibuVarE, obj3, j2);
                            aiazVarB.l(aibuVarE);
                            z = true;
                            break;
                        }
                        if (!aibiVarD.f()) {
                            break;
                        }
                        aiazVarB.d++;
                        atomicReferenceArray.set(length, aiazVarB.y(aibuVar2, aibuVarE, objJ, null, aibiVarD, 3));
                        aiazVarB.b--;
                        break;
                    }
                    aibuVar = aibuVar2;
                    long j3 = j;
                    aibuVarE = aibuVarE.e();
                    j = j3;
                }
            } finally {
                aiazVarB.unlock();
                aiazVarB.t();
            }
        }
        return z;
    }

    @Override // java.util.Map, java.util.concurrent.ConcurrentMap
    public final /* synthetic */ void replaceAll(java.util.function.BiFunction biFunction) {
        j$.util.concurrent.ConcurrentMap.-CC.$default$replaceAll(this, biFunction);
    }

    @Override // java.util.AbstractMap, java.util.Map
    public final int size() {
        long jMax = 0;
        for (defpackage.aiaz aiazVar : this.f) {
            jMax += (long) java.lang.Math.max(0, aiazVar.b);
        }
        return defpackage.aiql.T(jMax);
    }

    @Override // java.util.AbstractMap, java.util.Map
    public final java.util.Collection values() {
        java.util.Collection collection = this.t;
        if (collection != null) {
            return collection;
        }
        aibj aibjVar = new aibj(this);
        this.t = aibjVar;
        return aibjVar;
    }

    @Override // java.util.AbstractMap, java.util.Map
    public final java.lang.Object remove(java.lang.Object obj) {
        int i;
        java.lang.Object obj2 = null;
        if (obj != null) {
            int iA = a(obj);
            defpackage.aiaz aiazVarB = b(iA);
            aiazVarB.lock();
            try {
                defpackage.aibt aibtVar = aiazVarB.a;
                aiazVarB.s(aibtVar.q.a());
                java.util.concurrent.atomic.AtomicReferenceArray atomicReferenceArray = aiazVarB.f;
                int length = iA & (atomicReferenceArray.length() - 1);
                defpackage.aibu aibuVar = (defpackage.aibu) atomicReferenceArray.get(length);
                for (defpackage.aibu aibuVarE = aibuVar; aibuVarE != null; aibuVarE = aibuVarE.e()) {
                    java.lang.Object objJ = aibuVarE.j();
                    if (aibuVarE.a() == iA && objJ != null && aibtVar.h.d(obj, objJ)) {
                        defpackage.aibi aibiVarD = aibuVarE.d();
                        java.lang.Object obj3 = aibiVarD.get();
                        if (obj3 == null) {
                            if (!aibiVarD.f()) {
                                break;
                            }
                            i = 3;
                        } else {
                            i = 1;
                        }
                        aiazVarB.d++;
                        atomicReferenceArray.set(length, aiazVarB.y(aibuVar, aibuVarE, objJ, obj3, aibiVarD, i));
                        aiazVarB.b--;
                        obj2 = obj3;
                        break;
                    }
                }
            } finally {
                aiazVarB.unlock();
                aiazVarB.t();
            }
        }
        return obj2;
    }

    @Override // java.util.Map, java.util.concurrent.ConcurrentMap
    public final java.lang.Object replace(java.lang.Object obj, java.lang.Object obj2) {
        java.lang.Object obj3;
        defpackage.ahvr.ci(obj);
        defpackage.ahvr.ci(obj2);
        int iA = a(obj);
        defpackage.aiaz aiazVarB = b(iA);
        aiazVarB.lock();
        try {
            defpackage.aibt aibtVar = aiazVarB.a;
            long jA = aibtVar.q.a();
            aiazVarB.s(jA);
            java.util.concurrent.atomic.AtomicReferenceArray atomicReferenceArray = aiazVarB.f;
            int length = iA & (atomicReferenceArray.length() - 1);
            defpackage.aibu aibuVar = (defpackage.aibu) atomicReferenceArray.get(length);
            long j = jA;
            defpackage.aibu aibuVarE = aibuVar;
            while (true) {
                obj3 = null;
                if (aibuVarE == null) {
                    break;
                }
                defpackage.aibu aibuVar2 = aibuVar;
                java.lang.Object objJ = aibuVarE.j();
                if (aibuVarE.a() == iA && objJ != null && aibtVar.h.d(obj, objJ)) {
                    long j2 = j;
                    defpackage.aibi aibiVarD = aibuVarE.d();
                    java.lang.Object obj4 = aibiVarD.get();
                    if (obj4 == null) {
                        if (!aibiVarD.f()) {
                            break;
                        }
                        aiazVarB.d++;
                        atomicReferenceArray.set(length, aiazVarB.y(aibuVar2, aibuVarE, objJ, null, aibiVarD, 3));
                        aiazVarB.b--;
                        break;
                    }
                    aiazVarB.d++;
                    aiazVarB.x(obj, obj4, aibiVarD.a(), 2);
                    aiazVarB.z(aibuVarE, obj2, j2);
                    aiazVarB.l(aibuVarE);
                    obj3 = obj4;
                    break;
                }
                long j3 = j;
                aibuVarE = aibuVarE.e();
                aibuVar = aibuVar2;
                j = j3;
            }
            return obj3;
        } finally {
            aiazVarB.unlock();
            aiazVarB.t();
        }
    }
}
