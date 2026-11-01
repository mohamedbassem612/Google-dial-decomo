package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes.dex */
public final class ahvr {
    public static long A(defpackage.ahqy ahqyVar) {
        return z(ahqyVar.c, ahqyVar.d);
    }

    public static defpackage.ajcq B(defpackage.ajcq ajcqVar, java.lang.Class cls, defpackage.ahyc ahycVar, java.util.concurrent.Executor executor) {
        long j = defpackage.ahqx.a;
        defpackage.ahqv ahqvVar = new defpackage.ahqv(defpackage.ahns.c(false), ahycVar);
        int i = defpackage.aizu.d;
        defpackage.aizt aiztVar = new defpackage.aizt(ajcqVar, cls, ahqvVar);
        ajcqVar.c(aiztVar, defpackage.aiql.t(executor, aiztVar));
        return aiztVar;
    }

    public static defpackage.ajcq C(defpackage.ajcq ajcqVar, java.lang.Class cls, defpackage.ajat ajatVar, java.util.concurrent.Executor executor) {
        return defpackage.aizu.g(ajcqVar, cls, defpackage.ahqx.c(ajatVar), executor);
    }

    public static defpackage.ajcq D(defpackage.ajas ajasVar, long j, java.util.concurrent.TimeUnit timeUnit, java.util.concurrent.ScheduledExecutorService scheduledExecutorService) {
        return defpackage.aiql.B(defpackage.ahqx.b(ajasVar), j, timeUnit, scheduledExecutorService);
    }

    public static defpackage.ajcq E(java.lang.Runnable runnable, java.util.concurrent.Executor executor) {
        defpackage.ajdk ajdkVar = new defpackage.ajdk(java.util.concurrent.Executors.callable(defpackage.ahqx.h(runnable), null));
        executor.execute(ajdkVar);
        return ajdkVar;
    }

    public static defpackage.ajcq F(java.util.concurrent.Callable callable, java.util.concurrent.Executor executor) {
        long j = defpackage.ahqx.a;
        defpackage.ajdk ajdkVar = new defpackage.ajdk(new defpackage.ajav(defpackage.ahns.c(false), callable, 1));
        executor.execute(ajdkVar);
        return ajdkVar;
    }

    public static defpackage.ajcq G(defpackage.ajas ajasVar, java.util.concurrent.Executor executor) {
        long j = defpackage.ahqx.a;
        defpackage.ajdk ajdkVar = new defpackage.ajdk(new defpackage.ahqt(defpackage.ahns.c(false), ajasVar, 0));
        executor.execute(ajdkVar);
        return ajdkVar;
    }

    public static defpackage.ajcq H(defpackage.ajcq ajcqVar, defpackage.ahyc ahycVar, java.util.concurrent.Executor executor) {
        long j = defpackage.ahqx.a;
        if (ahycVar == null) {
            defpackage.aooh.i("function");
        }
        defpackage.ahqv ahqvVar = new defpackage.ahqv(defpackage.ahns.c(false), ahycVar);
        int i = defpackage.ajan.c;
        defpackage.ajam ajamVar = new defpackage.ajam(ajcqVar, ahqvVar);
        ajcqVar.c(ajamVar, defpackage.aiql.t(executor, ajamVar));
        return ajamVar;
    }

    public static defpackage.ajcq I(defpackage.ajcq ajcqVar, defpackage.ajat ajatVar, java.util.concurrent.Executor executor) {
        long j = defpackage.ahqx.a;
        defpackage.ajax ajaxVar = new defpackage.ajax(defpackage.ahns.c(false), ajatVar, 1);
        int i = defpackage.ajan.c;
        defpackage.ajal ajalVar = new defpackage.ajal(ajcqVar, ajaxVar);
        ajcqVar.c(ajalVar, defpackage.aiql.t(executor, ajalVar));
        return ajalVar;
    }

    public static void J(defpackage.ajcq ajcqVar, defpackage.ajcb ajcbVar, java.util.concurrent.Executor executor) {
        long j = defpackage.ahqx.a;
        if (ajcbVar == null) {
            defpackage.aooh.i("callback");
        }
        ajcqVar.c(new defpackage.ajcc(ajcqVar, new defpackage.sqh(defpackage.ahns.c(false), ajcbVar, 2)), executor);
    }

    public static defpackage.ajcq K(defpackage.ajcq ajcqVar, java.util.concurrent.Callable callable, java.util.concurrent.Executor executor) {
        return defpackage.agab.bc(ajcqVar, defpackage.ahqx.i(callable), executor);
    }

    public static defpackage.ajcq L(defpackage.ajcq ajcqVar, defpackage.ajas ajasVar, java.util.concurrent.Executor executor) {
        defpackage.ajcq ajcqVarE = defpackage.aiql.E(new defpackage.ahqt(defpackage.ahqx.b(ajasVar), ajcqVar, 1), new defpackage.agqe(ajcqVar, executor, 2));
        ajcqVarE.c(new defpackage.abqu(ajcqVarE, ajcqVar, 12), defpackage.ajbm.INSTANCE);
        return ajcqVarE;
    }

    public static defpackage.ahrv M(java.lang.Iterable iterable) {
        return defpackage.ahrv.g(defpackage.aiql.v(iterable));
    }

    public static defpackage.ahrv N(java.lang.Object obj) {
        return defpackage.ahrv.g(defpackage.aiql.z(obj));
    }

    public static defpackage.ahrv O(java.lang.Runnable runnable, java.util.concurrent.Executor executor) {
        return defpackage.ahrv.g(E(runnable, executor));
    }

    public static defpackage.ahrv P(java.util.concurrent.Callable callable, java.util.concurrent.Executor executor) {
        return Q(new ahrw(callable, 0), executor);
    }

    public static defpackage.ahrv Q(defpackage.ajas ajasVar, java.util.concurrent.Executor executor) {
        return defpackage.ahrv.g(G(ajasVar, executor));
    }

    public static final boolean R(defpackage.aolr aolrVar) {
        if (aolrVar == null) {
            defpackage.aooh.i("<this>");
        }
        return aolrVar.get(defpackage.ahrd.b) != null;
    }

    public static java.lang.String S() {
        defpackage.ahpj ahpjVarB = defpackage.ahns.b();
        return ahpjVarB == null ? "<no trace>" : defpackage.ahns.j(ahpjVarB);
    }

    public static void T() {
        defpackage.ahns.t(false);
    }

    public static boolean U(defpackage.ahpj ahpjVar) {
        return (ahpjVar == null || (ahpjVar instanceof defpackage.ahnj) || (ahpjVar instanceof defpackage.ahod) || (ahpjVar instanceof defpackage.ahoo) || (ahpjVar instanceof defpackage.ahoi)) ? false : true;
    }

    public static defpackage.ahoq V(int i, java.lang.Enum r3) {
        return X(i, r3.name(), defpackage.ahot.a, true);
    }

    public static defpackage.ahoq W(int i, java.lang.String str) {
        return X(i, str, defpackage.ahot.a, true);
    }

    public static defpackage.ahoq X(int i, java.lang.String str, defpackage.ahou ahouVar, boolean z) {
        boolean z2;
        defpackage.ahpj ahpjVarC;
        boolean z3;
        defpackage.ahoc ahocVar;
        defpackage.ahpe ahpeVar = (defpackage.ahpe) defpackage.ahns.d.get();
        defpackage.ahpj ahpjVar = ahpeVar.c;
        if (ahpjVar == defpackage.ahoo.a) {
            ahpjVar = null;
            defpackage.ahns.d(ahpeVar, null);
            z2 = true;
        } else {
            z2 = false;
        }
        if (ahpjVar == null) {
            java.util.UUID uuidB = defpackage.ahnt.a.b();
            java.lang.String strFo = defpackage.ahms.fo(uuidB);
            if (defpackage.ahpl.a()) {
                defpackage.ahnh ahnhVar = new defpackage.ahnh();
                defpackage.ahoc.m();
                z3 = z;
                ahocVar = new defpackage.ahoc(uuidB, strFo, str, ahouVar, ahnhVar, z3, defpackage.ahns.p(ahnhVar), ahpeVar);
            } else {
                z3 = z;
                defpackage.ahnh ahnhVar2 = defpackage.ahob.a;
                defpackage.ahoc.m();
                ahocVar = new defpackage.ahoc(uuidB, strFo, str, ahouVar, ahnhVar2, z3, false, ahpeVar);
            }
            boolean z4 = ahocVar.a;
            ahpjVarC = ahocVar;
            ahpjVarC = ahocVar;
            if (!z4 && z3) {
                defpackage.ahns.t(true);
                ahpjVarC = ahocVar;
            }
        } else {
            ahpjVarC = ahpjVar instanceof defpackage.ahnj ? ((defpackage.ahnj) ahpjVar).c(str, ahouVar, z, ahpeVar) : ahpjVar.r(str, i, ahouVar, ahpeVar);
        }
        defpackage.ahns.d(ahpeVar, ahpjVarC);
        return new defpackage.ahoq(ahpjVarC, z2);
    }

    public static defpackage.ahoq Y(int i, java.lang.Class cls, java.lang.String str) {
        return X(i, cls.getName() + ": " + str, defpackage.ahot.a, true);
    }

    public static defpackage.ahoq Z(int i, java.lang.String str) {
        return X(i, str, defpackage.ahot.a, true);
    }

    public static void a(android.content.Context context) {
        ((defpackage.ahtr) defpackage.agab.aH(context, defpackage.ahtr.class)).iN();
    }

    public static int aA(int i) {
        if (i < 3) {
            bC(i, "expectedSize");
            return i + 1;
        }
        if (i < 1073741824) {
            return (int) java.lang.Math.ceil(((double) i) / 0.75d);
        }
        return Integer.MAX_VALUE;
    }

    public static defpackage.ahyc aB(aiiy aiiyVar) {
        ci(aiiyVar);
        return new ahds(aiiyVar, 11);
    }

    public static defpackage.aigf aC(java.lang.Iterable iterable, defpackage.ahyc ahycVar) {
        return ((iterable instanceof java.util.List) || (iterable instanceof defpackage.aifo)) ? cv(((defpackage.aify) iterable).listIterator(0), ahycVar, defpackage.aigf.g(((defpackage.aike) iterable).d)) : cv(((defpackage.aify) iterable).listIterator(0), ahycVar, new defpackage.aigb(4));
    }

    public static java.lang.Object aD(java.util.Map.Entry entry) {
        if (entry == null) {
            return null;
        }
        return entry.getKey();
    }

    public static java.lang.Object aE(java.util.Map map, java.lang.Object obj) {
        ci(map);
        try {
            return map.get(obj);
        } catch (java.lang.ClassCastException | java.lang.NullPointerException unused) {
            return null;
        }
    }

    public static java.lang.String aF(java.util.Map map) {
        int size = map.size();
        bC(size, "size");
        java.lang.StringBuilder sb = new java.lang.StringBuilder((int) java.lang.Math.min(((long) size) << 3, 1073741824L));
        sb.append('{');
        boolean z = true;
        for (java.util.Map.Entry entry : map.entrySet()) {
            if (!z) {
                sb.append(", ");
            }
            sb.append(entry.getKey());
            sb.append('=');
            sb.append(entry.getValue());
            z = false;
        }
        sb.append('}');
        return sb.toString();
    }

    public static java.util.HashMap aG(int i) {
        return new java.util.HashMap(aA(i));
    }

    public static java.util.LinkedHashMap aH(int i) {
        return new java.util.LinkedHashMap(aA(i));
    }

    public static java.util.Map aI(java.util.Map map, defpackage.ahyc ahycVar) {
        return new aijc(map, new aijj(ahycVar, 1));
    }

    public static boolean aJ(java.util.Map map, java.lang.Object obj) {
        if (map == obj) {
            return true;
        }
        if (obj instanceof java.util.Map) {
            return map.entrySet().equals(((java.util.Map) obj).entrySet());
        }
        return false;
    }

    public static java.util.ArrayList aK(java.lang.Iterable iterable) {
        return aL(iterable.iterator());
    }

    public static java.util.ArrayList aL(java.util.Iterator it) {
        java.util.ArrayList arrayList = new java.util.ArrayList();
        bd(arrayList, it);
        return arrayList;
    }

    @java.lang.SafeVarargs
    public static java.util.ArrayList aM(java.lang.Object... objArr) {
        java.util.ArrayList arrayList = new java.util.ArrayList(defpackage.aiql.T(((long) objArr.length) + 5));
        java.util.Collections.addAll(arrayList, objArr);
        return arrayList;
    }

    public static java.util.List aN(java.util.List list) {
        if (list instanceof defpackage.aify) {
            return ((defpackage.aify) list).a();
        }
        if (list instanceof aiin) {
            return ((aiin) list).a;
        }
        return list instanceof java.util.RandomAccess ? new aiil(list) : new aiin(list);
    }

    public static java.util.List aO(java.util.List list, defpackage.ahyc ahycVar) {
        return list instanceof java.util.RandomAccess ? new aiip(list, ahycVar) : new aiir(list, ahycVar);
    }

    public static boolean aP(java.util.List list, java.lang.Object obj) {
        if (obj == list) {
            return true;
        }
        if (obj instanceof java.util.List) {
            java.util.List list2 = (java.util.List) obj;
            int size = list.size();
            if (size == list2.size()) {
                if (list2 instanceof java.util.RandomAccess) {
                    for (int i = 0; i < size; i++) {
                        if (j$.util.Objects.equals(list.get(i), list2.get(i))) {
                        }
                    }
                    return true;
                }
                java.util.Iterator it = list.iterator();
                java.util.Iterator it2 = list2.iterator();
                while (it.hasNext()) {
                    if (!it2.hasNext() || !j$.util.Objects.equals(it.next(), it2.next())) {
                    }
                }
                if (!it2.hasNext()) {
                    return true;
                }
            }
        }
        return false;
    }

    public static java.util.List aQ(java.util.List list) {
        ci(list);
        return list instanceof java.util.RandomAccess ? new aiik(list) : new aiij(list);
    }

    public static int aR(java.util.Iterator it, int i) {
        it.getClass();
        if (i < 0) {
            throw new java.lang.IllegalArgumentException("numberToAdvance must be nonnegative");
        }
        int i2 = 0;
        while (i2 < i && it.hasNext()) {
            it.next();
            i2++;
        }
        return i2;
    }

    public static int aS(java.util.Iterator it, defpackage.ahyp ahypVar) {
        cj(ahypVar, "predicate");
        int i = 0;
        while (it.hasNext()) {
            if (ahypVar.a(it.next())) {
                return i;
            }
            i++;
        }
        return -1;
    }

    public static defpackage.ahyn aT(java.util.Iterator it, defpackage.ahyp ahypVar) {
        it.getClass();
        while (it.hasNext()) {
            java.lang.Object next = it.next();
            if (ahypVar.a(next)) {
                next.getClass();
                return new defpackage.ahys(next);
            }
        }
        return defpackage.ahwt.a;
    }

    public static defpackage.ailj aU(java.util.Iterator it, defpackage.ahyp ahypVar) {
        ci(it);
        ci(ahypVar);
        return new aiia(it, ahypVar);
    }

    public static defpackage.ailj aV(java.util.Iterator it) {
        ci(it);
        return it instanceof defpackage.ailj ? (defpackage.ailj) it : new aihx(it);
    }

    public static java.lang.Object aW(java.util.Iterator it, defpackage.ahyp ahypVar) {
        ci(it);
        ci(ahypVar);
        while (it.hasNext()) {
            java.lang.Object next = it.next();
            if (ahypVar.a(next)) {
                return next;
            }
        }
        throw new java.util.NoSuchElementException();
    }

    public static java.lang.Object aX(java.util.Iterator it) {
        java.lang.Object next;
        do {
            next = it.next();
        } while (it.hasNext());
        return next;
    }

    public static java.lang.Object aY(java.util.Iterator it, java.lang.Object obj) {
        return it.hasNext() ? it.next() : obj;
    }

    public static java.lang.Object aZ(java.util.Iterator it) {
        java.lang.Object next = it.next();
        if (!it.hasNext()) {
            return next;
        }
        java.lang.StringBuilder sb = new java.lang.StringBuilder("expected one element but was: <");
        sb.append(next);
        for (int i = 0; i < 4 && it.hasNext(); i++) {
            sb.append(", ");
            sb.append(it.next());
        }
        if (it.hasNext()) {
            sb.append(", ...");
        }
        sb.append('>');
        throw new java.lang.IllegalArgumentException(sb.toString());
    }

    public static final boolean aa(long j, float f) {
        return (((int) j) & 1073741823) < ((int) (f * 1.0737418E9f));
    }

    public static defpackage.ahpz ab(android.content.Context context) {
        return ((defpackage.ahqb) defpackage.aooc.ar(context, defpackage.ahqb.class)).fh();
    }

    public static defpackage.ahpz ac(android.content.Context context) {
        return ((ahqc) defpackage.aooc.ar(context, ahqc.class)).fh();
    }

    public static java.util.Set ad(android.content.Context context) {
        return ((ahqc) defpackage.aooc.ar(context, ahqc.class)).hu();
    }

    public static defpackage.ahda ae(java.lang.Iterable iterable) {
        return new defpackage.ahda(aj(iterable), (byte[]) null);
    }

    @java.lang.SafeVarargs
    public static defpackage.ahda af(defpackage.ajcq... ajcqVarArr) {
        return new defpackage.ahda(new defpackage.ahda(new defpackage.anpu(true, defpackage.aify.o(ajcqVarArr)), (byte[]) null), (byte[]) null);
    }

    public static final defpackage.aosy ag(defpackage.aoss aossVar, defpackage.ahda ahdaVar, defpackage.aonn aonnVar) {
        if (aossVar == null) {
            defpackage.aooh.i("<this>");
        }
        if (ahdaVar == null) {
            defpackage.aooh.i("coroutineSequence");
        }
        return defpackage.aoov.ak(aossVar, defpackage.aols.a, 4, new defpackage.ahvq(ahdaVar, aonnVar, (defpackage.aoln) null, 0));
    }

    public static defpackage.ahda ah(java.lang.Iterable iterable) {
        return new defpackage.ahda(new defpackage.anpu(false, defpackage.aify.j(iterable)), (byte[]) null);
    }

    @java.lang.SafeVarargs
    public static defpackage.ahda ai(defpackage.ajcq... ajcqVarArr) {
        return new defpackage.ahda(new defpackage.anpu(false, defpackage.aify.o(ajcqVarArr)), (byte[]) null);
    }

    public static defpackage.ahda aj(java.lang.Iterable iterable) {
        return new defpackage.ahda(new defpackage.anpu(true, defpackage.aify.j(iterable)), (byte[]) null);
    }

    @java.lang.SafeVarargs
    public static defpackage.ahda ak(defpackage.ajcq... ajcqVarArr) {
        return new defpackage.ahda(new defpackage.anpu(true, defpackage.aify.o(ajcqVarArr)), (byte[]) null);
    }

    public static int al(java.util.Set set) {
        java.util.Iterator it = set.iterator();
        int iHashCode = 0;
        while (it.hasNext()) {
            java.lang.Object next = it.next();
            iHashCode += next != null ? next.hashCode() : 0;
        }
        return iHashCode;
    }

    public static defpackage.aild am(java.util.Set set, java.util.Set set2) {
        cj(set, "set1");
        cj(set2, "set2");
        return new defpackage.aikx(set, set2);
    }

    public static defpackage.aild an(java.util.Set set, java.util.Set set2) {
        cj(set, "set1");
        cj(set2, "set2");
        return new aikv(set, set2);
    }

    public static defpackage.aild ao(java.util.Set set, java.util.Set set2) {
        if (set == null) {
            throw new java.lang.NullPointerException("set1");
        }
        if (set2 != null) {
            return new defpackage.aikt(set, set2);
        }
        throw new java.lang.NullPointerException("set2");
    }

    public static java.util.HashSet ap(int i) {
        return new java.util.HashSet(aA(i));
    }

    /* JADX WARN: Type inference failed for: r1v2, types: [java.util.Collection, java.util.Set] */
    public static java.util.Set aq(java.util.Set set, defpackage.ahyp ahypVar) {
        if (!(set instanceof java.util.SortedSet)) {
            if (!(set instanceof aila)) {
                ci(set);
                return new aila(set, ahypVar);
            }
            aila ailaVar = (aila) set;
            return new aila((java.util.Set) ailaVar.a, ahus.s(ailaVar.b, ahypVar));
        }
        aila ailaVar2 = (java.util.SortedSet) set;
        if (!(ailaVar2 instanceof aila)) {
            ci(ailaVar2);
            return new ailb(ailaVar2, ahypVar);
        }
        aila ailaVar3 = ailaVar2;
        return new ailb((java.util.SortedSet) ailaVar3.a, ahus.s(ailaVar3.b, ahypVar));
    }

    public static java.util.Set ar() {
        return java.util.Collections.newSetFromMap(new j$.util.concurrent.ConcurrentHashMap());
    }

    public static java.util.Set as() {
        return java.util.Collections.newSetFromMap(new java.util.IdentityHashMap());
    }

    public static boolean at(java.util.Set set, java.lang.Object obj) {
        if (set == obj) {
            return true;
        }
        if (obj instanceof java.util.Set) {
            java.util.Set set2 = (java.util.Set) obj;
            try {
                if (set.size() == set2.size() && set.containsAll(set2)) {
                    return true;
                }
            } catch (java.lang.ClassCastException | java.lang.NullPointerException unused) {
            }
        }
        return false;
    }

    public static boolean au(java.util.Set set, java.util.Collection collection) {
        ci(collection);
        if (collection instanceof defpackage.aijo) {
            collection = ((defpackage.aijo) collection).i();
        }
        if (!(collection instanceof java.util.Set) || collection.size() <= set.size()) {
            return av(set, collection.iterator());
        }
        java.util.Iterator it = set.iterator();
        ci(collection);
        boolean z = false;
        while (it.hasNext()) {
            if (collection.contains(it.next())) {
                it.remove();
                z = true;
            }
        }
        return z;
    }

    public static boolean av(java.util.Set set, java.util.Iterator it) {
        boolean zRemove = false;
        while (it.hasNext()) {
            zRemove |= set.remove(it.next());
        }
        return zRemove;
    }

    public static java.lang.Object[] aw(java.lang.Object[] objArr, int i) {
        if (objArr.length != 0) {
            objArr = java.util.Arrays.copyOf(objArr, 0);
        }
        return java.util.Arrays.copyOf(objArr, i);
    }

    public static void ax(java.lang.Object obj, int i) {
        if (obj == null) {
            throw new java.lang.NullPointerException(defpackage.a.bj(i, "at index "));
        }
    }

    public static void ay(java.lang.Object[] objArr, int i) {
        for (int i2 = 0; i2 < i; i2++) {
            ax(objArr[i2], i2);
        }
    }

    public static final defpackage.aiii az(defpackage.aiji aijiVar) {
        return new defpackage.aijk(aijiVar.a(), new defpackage.aijh());
    }

    public static void b(android.content.Context context) {
        ((defpackage.ahtr) defpackage.agab.aH(context, defpackage.ahtr.class)).iN();
    }

    public static int bA(int i) {
        int iMax = java.lang.Math.max(i, 2);
        int iHighestOneBit = java.lang.Integer.highestOneBit(iMax);
        if (iMax <= iHighestOneBit) {
            return iHighestOneBit;
        }
        int i2 = iHighestOneBit << 1;
        if (i2 <= 0) {
            return 1073741824;
        }
        return i2;
    }

    public static void bB(java.lang.Object obj, java.lang.Object obj2) {
        if (obj == null) {
            throw new java.lang.NullPointerException("null key in entry: null=".concat(java.lang.String.valueOf(java.lang.String.valueOf(obj2))));
        }
        if (obj2 == null) {
            throw new java.lang.NullPointerException(defpackage.a.bJ(obj, "null value in entry: ", "=null"));
        }
    }

    public static void bC(int i, java.lang.String str) {
        if (i >= 0) {
            return;
        }
        throw new java.lang.IllegalArgumentException(str + " cannot be negative but was: " + i);
    }

    /* JADX INFO: Thrown type has an unknown type hierarchy: ahzr */
    public static void bD(boolean z) throws ahzr {
        if (!z) {
            throw new ahzr();
        }
    }

    /* JADX INFO: Thrown type has an unknown type hierarchy: ahzr */
    public static void bE(boolean z, java.lang.String str, java.lang.Object obj) throws ahzr {
        if (!z) {
            throw new ahzr(bK(str, obj));
        }
    }

    /* JADX INFO: Thrown type has an unknown type hierarchy: ahzr */
    public static void bF(boolean z, java.lang.String str, java.lang.Object... objArr) throws ahzr {
        if (!z) {
            throw new ahzr(bK(str, objArr));
        }
    }

    /* JADX INFO: Thrown type has an unknown type hierarchy: ahzr */
    public static void bG(java.lang.Object obj, java.lang.Object... objArr) throws ahzr {
        if (obj == null) {
            throw new ahzr(bK("expected a non-null reference", objArr));
        }
    }

    /* JADX INFO: Thrown type has an unknown type hierarchy: ahzr */
    public static void bH(java.lang.Object obj) throws ahzr {
        bG(obj, new java.lang.Object[0]);
    }

    public static defpackage.ahzi bI(defpackage.ahzi ahziVar) {
        if ((ahziVar instanceof defpackage.ahzl) || (ahziVar instanceof defpackage.ahzk)) {
            return ahziVar;
        }
        return ahziVar instanceof java.io.Serializable ? new defpackage.ahzk(ahziVar) : new defpackage.ahzl(ahziVar);
    }

    public static defpackage.ahzi bJ(defpackage.ahzi ahziVar, j$.time.Duration duration) {
        boolean z = false;
        if (!duration.isNegative() && !duration.isZero()) {
            z = true;
        }
        bR(z, "duration (%s) must be > 0", duration);
        return new defpackage.ahzj(ahziVar, n(duration));
    }

    public static java.lang.String bK(java.lang.String str, java.lang.Object... objArr) {
        int length;
        int iIndexOf;
        int i = 0;
        if (objArr == null) {
            objArr = new java.lang.Object[]{"(Object[])null"};
        }
        java.lang.StringBuilder sb = new java.lang.StringBuilder(str.length() + (objArr.length << 4));
        int i2 = 0;
        while (true) {
            length = objArr.length;
            if (i >= length || (iIndexOf = str.indexOf("%s", i2)) == -1) {
                break;
            }
            sb.append((java.lang.CharSequence) str, i2, iIndexOf);
            sb.append(cy(objArr[i]));
            i2 = iIndexOf + 2;
            i++;
        }
        sb.append((java.lang.CharSequence) str, i2, str.length());
        if (i < length) {
            java.lang.String str2 = " [";
            while (i < objArr.length) {
                sb.append(str2);
                sb.append(cy(objArr[i]));
                i++;
                str2 = ", ";
            }
            sb.append(']');
        }
        return sb.toString();
    }

    public static boolean bL(java.lang.CharSequence charSequence, int i) {
        return i >= 0 && i <= charSequence.length() + (-2) && java.lang.Character.isHighSurrogate(charSequence.charAt(i)) && java.lang.Character.isLowSurrogate(charSequence.charAt(i + 1));
    }

    public static void bM(boolean z) {
        if (!z) {
            throw new java.lang.IllegalArgumentException();
        }
    }

    public static void bN(boolean z, java.lang.Object obj) {
        if (!z) {
            throw new java.lang.IllegalArgumentException((java.lang.String) obj);
        }
    }

    public static void bO(boolean z, java.lang.String str, char c) {
        if (!z) {
            throw new java.lang.IllegalArgumentException(bK(str, java.lang.Character.valueOf(c)));
        }
    }

    public static void bP(boolean z, java.lang.String str, int i) {
        if (!z) {
            throw new java.lang.IllegalArgumentException(bK(str, java.lang.Integer.valueOf(i)));
        }
    }

    public static void bQ(boolean z, java.lang.String str, long j) {
        if (!z) {
            throw new java.lang.IllegalArgumentException(bK(str, java.lang.Long.valueOf(j)));
        }
    }

    public static void bR(boolean z, java.lang.String str, java.lang.Object obj) {
        if (!z) {
            throw new java.lang.IllegalArgumentException(bK(str, obj));
        }
    }

    public static void bS(boolean z, java.lang.String str, java.lang.Object... objArr) {
        if (!z) {
            throw new java.lang.IllegalArgumentException(bK(str, objArr));
        }
    }

    public static void bT(boolean z, java.lang.String str, int i, int i2) {
        if (!z) {
            throw new java.lang.IllegalArgumentException(bK(str, java.lang.Integer.valueOf(i), java.lang.Integer.valueOf(i2)));
        }
    }

    public static void bU(boolean z, java.lang.String str, long j, long j2) {
        if (!z) {
            throw new java.lang.IllegalArgumentException(bK(str, java.lang.Long.valueOf(j), java.lang.Long.valueOf(j2)));
        }
    }

    public static void bV(boolean z, java.lang.String str, java.lang.Object obj, int i) {
        if (!z) {
            throw new java.lang.IllegalArgumentException(bK(str, obj, java.lang.Integer.valueOf(i)));
        }
    }

    public static void bW(boolean z, java.lang.String str, java.lang.Object obj, java.lang.Object obj2) {
        if (!z) {
            throw new java.lang.IllegalArgumentException(bK(str, obj, obj2));
        }
    }

    public static void bX(int i, int i2, int i3) {
        java.lang.String strCz;
        if (i < 0 || i2 < i || i2 > i3) {
            if (i < 0 || i > i3) {
                strCz = cz(i, i3, "start index");
            } else {
                strCz = (i2 < 0 || i2 > i3) ? cz(i2, i3, "end index") : bK("end index (%s) must not be less than start index (%s)", java.lang.Integer.valueOf(i2), java.lang.Integer.valueOf(i));
            }
            throw new java.lang.IndexOutOfBoundsException(strCz);
        }
    }

    public static void bY(boolean z) {
        if (!z) {
            throw new java.lang.IllegalStateException();
        }
    }

    public static void bZ(boolean z, java.lang.Object obj) {
        if (!z) {
            throw new java.lang.IllegalStateException(java.lang.String.valueOf(obj));
        }
    }

    public static java.lang.Object ba(java.util.Iterator it) {
        if (!it.hasNext()) {
            return null;
        }
        java.lang.Object next = it.next();
        it.remove();
        return next;
    }

    public static java.util.Iterator bb(java.util.Iterator it, defpackage.ahyc ahycVar) {
        ahycVar.getClass();
        return new defpackage.aiib(it, ahycVar);
    }

    public static void bc(java.util.Iterator it) {
        while (it.hasNext()) {
            it.next();
            it.remove();
        }
    }

    public static boolean bd(java.util.Collection collection, java.util.Iterator it) {
        ci(collection);
        ci(it);
        boolean zAdd = false;
        while (it.hasNext()) {
            zAdd |= collection.add(it.next());
        }
        return zAdd;
    }

    public static boolean be(java.util.Iterator it, java.lang.Object obj) {
        if (obj == null) {
            while (it.hasNext()) {
                if (it.next() == null) {
                    return true;
                }
            }
        } else {
            while (it.hasNext()) {
                if (obj.equals(it.next())) {
                    return true;
                }
            }
        }
        return false;
    }

    public static java.lang.Iterable bf(java.lang.Iterable iterable, int i) {
        iterable.getClass();
        if (i > 0) {
            return new defpackage.aihr(iterable, i);
        }
        throw new java.lang.IllegalArgumentException();
    }

    /* JADX WARN: Type inference failed for: r0v1, types: [boolean, int] */
    public static java.lang.Iterable bg(java.lang.Iterable iterable, int i) {
        ci(iterable);
        bN((i ^ (-1)) >>> 31, "number to skip cannot be negative");
        return new aihv(iterable, i);
    }

    public static java.lang.Object bh(java.lang.Iterable iterable, int i) {
        iterable.getClass();
        if (iterable instanceof java.util.List) {
            return ((java.util.List) iterable).get(i);
        }
        java.util.Iterator it = iterable.iterator();
        int iAR = aR(it, i);
        if (it.hasNext()) {
            return it.next();
        }
        throw new java.lang.IndexOutOfBoundsException(defpackage.a.bv((byte) 41, iAR, i, "position (", ") must be less than the number of elements that remained ("));
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static java.lang.Object bi(java.lang.Iterable iterable, int i, java.lang.Object obj) {
        ci(iterable);
        if (i < 0) {
            throw new java.lang.IndexOutOfBoundsException(defpackage.a.bj(i, "position cannot be negative but was: "));
        }
        if (iterable instanceof java.util.List) {
            return i < iterable.size() ? iterable.get(i) : obj;
        }
        java.util.Iterator it = iterable.iterator();
        aR(it, i);
        return aY(it, obj);
    }

    public static java.lang.Object bj(java.lang.Iterable iterable, java.lang.Object obj) {
        return aY(iterable.iterator(), obj);
    }

    public static java.lang.Object bk(java.lang.Iterable iterable) {
        if (!(iterable instanceof java.util.List)) {
            return iterable instanceof java.util.SortedSet ? ((java.util.SortedSet) iterable).last() : aX(iterable.iterator());
        }
        java.util.List list = (java.util.List) iterable;
        if (list.isEmpty()) {
            throw new java.util.NoSuchElementException();
        }
        return cw(list);
    }

    public static java.lang.Object bl(java.lang.Iterable iterable, java.lang.Object obj) {
        if (iterable instanceof java.util.Collection) {
            if (((java.util.Collection) iterable).isEmpty()) {
                return obj;
            }
            if (iterable instanceof java.util.List) {
                return cw((java.util.List) iterable);
            }
            if (iterable instanceof java.util.SortedSet) {
                return ((java.util.SortedSet) iterable).last();
            }
        }
        java.util.Iterator it = iterable.iterator();
        return it.hasNext() ? aX(it) : obj;
    }

    public static java.lang.Object bm(java.lang.Iterable iterable) {
        return aZ(iterable.iterator());
    }

    public static java.lang.String bn(java.lang.Iterable iterable) {
        java.util.Iterator it = iterable.iterator();
        java.lang.StringBuilder sb = new java.lang.StringBuilder("[");
        boolean z = true;
        while (it.hasNext()) {
            if (!z) {
                sb.append(", ");
            }
            sb.append(it.next());
            z = false;
        }
        sb.append(']');
        return sb.toString();
    }

    public static java.util.Collection bo(java.lang.Iterable iterable) {
        return iterable instanceof java.util.Collection ? (java.util.Collection) iterable : aL(iterable.iterator());
    }

    public static boolean bp(java.util.Collection collection, java.lang.Iterable iterable) {
        return iterable instanceof java.util.Collection ? collection.addAll((java.util.Collection) iterable) : bd(collection, iterable.iterator());
    }

    public static boolean bq(java.lang.Iterable iterable, defpackage.ahyp ahypVar) {
        return aS(iterable.iterator(), ahypVar) != -1;
    }

    public static java.lang.Object[] br(java.lang.Iterable iterable) {
        return bo(iterable).toArray();
    }

    public static java.lang.Object[] bs(java.lang.Iterable iterable, java.lang.Class cls) {
        return bt(iterable, (java.lang.Object[]) java.lang.reflect.Array.newInstance((java.lang.Class<?>) cls, 0));
    }

    public static java.lang.Object[] bt(java.lang.Iterable iterable, java.lang.Object[] objArr) {
        return bo(iterable).toArray(objArr);
    }

    public static void bu(java.util.List list, defpackage.ahyp ahypVar) {
        int i = 0;
        for (int i2 = 0; i2 < list.size(); i2++) {
            java.lang.Object obj = list.get(i2);
            if (!ahypVar.a(obj)) {
                if (i2 > i) {
                    try {
                        list.set(i, obj);
                    } catch (java.lang.IllegalArgumentException unused) {
                        cx(list, ahypVar, i, i2);
                        return;
                    } catch (java.lang.UnsupportedOperationException unused2) {
                        cx(list, ahypVar, i, i2);
                        return;
                    }
                }
                i++;
            }
        }
        list.subList(i, list.size()).clear();
    }

    public static final /* synthetic */ defpackage.aify bv(java.util.Collection collection) {
        defpackage.aooh.f(collection, "<this>");
        defpackage.aify aifyVarN = defpackage.aify.n(collection);
        defpackage.aooh.e(aifyVarN, "copyOf(...)");
        return aifyVarN;
    }

    public static final /* synthetic */ defpackage.aigf bw(java.util.Map map) {
        if (map == null) {
            defpackage.aooh.i("<this>");
        }
        defpackage.aigf aigfVarI = defpackage.aigf.i(map);
        defpackage.aooh.e(aigfVarI, "copyOf(...)");
        return aigfVarI;
    }

    public static final /* synthetic */ defpackage.aihd bx(java.util.Collection collection) {
        if (collection == null) {
            defpackage.aooh.i("<this>");
        }
        defpackage.aihd aihdVarO = defpackage.aihd.o(collection);
        defpackage.aooh.e(aihdVarO, "copyOf(...)");
        return aihdVarO;
    }

    public static int by(int i) {
        return (int) (((long) java.lang.Integer.rotateLeft((int) (((long) i) * (-862048943)), 15)) * 461845907);
    }

    public static int bz(java.lang.Object obj) {
        return by(obj == null ? 0 : obj.hashCode());
    }

    /* JADX INFO: Thrown type has an unknown type hierarchy: afeb */
    public static void c(android.app.Activity activity, java.lang.Class cls, defpackage.ahtl ahtlVar) throws afeb {
        android.view.View viewFindViewById = activity.findViewById(android.R.id.content);
        if (viewFindViewById == null) {
            throw new java.lang.NullPointerException("Activity must have a content view to add a listener!");
        }
        ct(2131429274, viewFindViewById, cls, ahtlVar);
    }

    public static void ca(boolean z, java.lang.String str, int i) {
        if (!z) {
            throw new java.lang.IllegalStateException(bK(str, java.lang.Integer.valueOf(i)));
        }
    }

    public static void cb(boolean z, java.lang.String str, long j) {
        if (!z) {
            throw new java.lang.IllegalStateException(bK(str, java.lang.Long.valueOf(j)));
        }
    }

    public static void cc(boolean z, java.lang.String str, java.lang.Object obj) {
        if (!z) {
            throw new java.lang.IllegalStateException(bK(str, obj));
        }
    }

    public static void cd(boolean z, java.lang.String str, int i, int i2) {
        if (!z) {
            throw new java.lang.IllegalStateException(bK(str, java.lang.Integer.valueOf(i), java.lang.Integer.valueOf(i2)));
        }
    }

    public static void ce(boolean z, java.lang.String str, java.lang.Object obj, java.lang.Object obj2) {
        if (!z) {
            throw new java.lang.IllegalStateException(bK(str, obj, obj2));
        }
    }

    public static void cf(boolean z, java.lang.String str, java.lang.Object obj, java.lang.Object obj2, java.lang.Object obj3) {
        if (!z) {
            throw new java.lang.IllegalStateException(bK(str, obj, obj2, obj3));
        }
    }

    public static void cg(boolean z, long j, java.lang.Object obj) {
        if (!z) {
            throw new java.lang.IllegalArgumentException(bK("duration cannot be negative: %s %s", java.lang.Long.valueOf(j), obj));
        }
    }

    public static void ch(int i, int i2) {
        java.lang.String strBK;
        if (i < 0 || i >= i2) {
            if (i < 0) {
                strBK = bK("%s (%s) must not be negative", "index", java.lang.Integer.valueOf(i));
            } else {
                if (i2 < 0) {
                    throw new java.lang.IllegalArgumentException(defpackage.a.bj(i2, "negative size: "));
                }
                strBK = bK("%s (%s) must be less than size (%s)", "index", java.lang.Integer.valueOf(i), java.lang.Integer.valueOf(i2));
            }
            throw new java.lang.IndexOutOfBoundsException(strBK);
        }
    }

    public static void ci(java.lang.Object obj) {
        obj.getClass();
    }

    public static void cj(java.lang.Object obj, java.lang.Object obj2) {
        if (obj == null) {
            throw new java.lang.NullPointerException((java.lang.String) obj2);
        }
    }

    public static void ck(java.lang.Object obj, java.lang.String str, int i) {
        if (obj == null) {
            throw new java.lang.NullPointerException(bK(str, java.lang.Integer.valueOf(i)));
        }
    }

    public static void cl(java.lang.Object obj, java.lang.String str, java.lang.Object obj2) {
        if (obj == null) {
            throw new java.lang.NullPointerException(bK(str, obj2));
        }
    }

    public static void cm(int i, int i2) {
        if (i < 0 || i > i2) {
            throw new java.lang.IndexOutOfBoundsException(cz(i, i2, "index"));
        }
    }

    public static java.lang.String cn(java.lang.String str) {
        if (cp(str)) {
            return null;
        }
        return str;
    }

    public static java.lang.String co(java.lang.String str) {
        return str == null ? "" : str;
    }

    public static boolean cp(java.lang.String str) {
        return str == null || str.isEmpty();
    }

    public static defpackage.ahor cq(defpackage.agab agabVar) {
        defpackage.ahpj ahpjVarB = defpackage.ahns.b();
        java.util.List list = ahnb.b;
        if (ahpjVarB == null) {
            return defpackage.ahor.d(2);
        }
        defpackage.ahor ahorVarD = defpackage.ahor.d(3);
        loop0: while (ahpjVarB != null) {
            java.util.Iterator it = list.iterator();
            while (it.hasNext()) {
                if (ahpjVarB.k((defpackage.agab) it.next()).b()) {
                    break loop0;
                }
            }
            ahorVarD = ahpjVarB.k(agabVar);
            if (ahorVarD.c() - 1 == 0) {
                break;
            }
            ahpjVarB = ahpjVarB.b();
        }
        return ahorVarD;
    }

    /* JADX WARN: Multi-variable type inference failed */
    private static android.view.View cr(android.view.ViewParent viewParent) {
        if (viewParent instanceof android.view.View) {
            return (android.view.View) viewParent;
        }
        if (viewParent != 0) {
            return cr(viewParent.getParent());
        }
        return null;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v1, types: [ahth, java.lang.Object] */
    private static defpackage.ahyn cs(int i, android.view.View view, defpackage.ahyn ahynVar) {
        ahtm ahtmVarA;
        if (!ahynVar.f()) {
            return ahynVar;
        }
        ?? B = ahynVar.b();
        defpackage.aec aecVar = (defpackage.aec) view.getTag(i);
        if (aecVar != null && !aecVar.isEmpty()) {
            java.lang.Class<?> cls = B.getClass();
            int i2 = 0;
            while (true) {
                if (i2 >= aecVar.d) {
                    ahtmVarA = ahtm.b;
                    break;
                }
                java.lang.Class cls2 = (java.lang.Class) aecVar.d(i2);
                defpackage.ahtl ahtlVar = (defpackage.ahtl) aecVar.g(i2);
                if (cls2.isAssignableFrom(cls)) {
                    ahtmVarA = ahtlVar.a(B);
                    ci(ahtmVarA);
                    break;
                }
                i2++;
            }
        } else {
            ahtmVarA = ahtm.b;
        }
        if (ahtmVarA == ahtm.a) {
            return defpackage.ahwt.a;
        }
        return ahtmVarA != ahtm.b ? defpackage.ahyn.h(ahtmVarA.c) : ahynVar;
    }

    /* JADX INFO: Thrown type has an unknown type hierarchy: afeb */
    private static void ct(int i, android.view.View view, java.lang.Class cls, defpackage.ahtl ahtlVar) throws afeb {
        defpackage.afec.c();
        defpackage.aec acaVar = (defpackage.aec) view.getTag(i);
        if (acaVar == null) {
            acaVar = new defpackage.aca();
            view.setTag(i, acaVar);
        }
        for (int i2 = 0; i2 < acaVar.d; i2++) {
            java.lang.Class<?> cls2 = (java.lang.Class) acaVar.d(i2);
            if (cls.equals(cls2)) {
                throw new java.lang.IllegalArgumentException(java.lang.String.format(java.util.Locale.US, "Class %s is already registered as a listener. Are you adding the same View instance twice?", cls.getSimpleName()));
            }
            if (cls.isAssignableFrom(cls2)) {
                throw new java.lang.IllegalArgumentException(java.lang.String.format(java.util.Locale.US, "For class %s, a listener is already registered as a subtype: %s", cls.getSimpleName(), cls2.getSimpleName()));
            }
            if (cls2.isAssignableFrom(cls)) {
                throw new java.lang.IllegalArgumentException(java.lang.String.format(java.util.Locale.US, "For class %s, a listener is already registered as a supertype: %s", cls.getSimpleName(), cls2.getSimpleName()));
            }
        }
        acaVar.put(cls, ahtlVar);
    }

    /* JADX INFO: Thrown type has an unknown type hierarchy: afeb */
    private static void cu(int i, defpackage.ahth ahthVar, android.view.View view) throws afeb {
        defpackage.afec.c();
        defpackage.ahyn ahynVarH = defpackage.ahyn.h(ahthVar);
        android.view.View viewCr = view;
        while (viewCr != null) {
            if (viewCr != view || i == 2131429278) {
                ahynVarH = cs(2131429278, viewCr, ahynVarH);
            }
            if (viewCr != view || i != 2131429274) {
                ahynVarH = cs(2131429275, viewCr, ahynVarH);
            }
            ahynVarH = cs(2131429274, viewCr, ahynVarH);
            if (!ahynVarH.f()) {
                return;
            }
            java.lang.Object tag = viewCr.getTag(2131429277);
            if (tag != null && !(tag instanceof android.view.View)) {
                throw new java.lang.IllegalStateException("Invalid tag returned: " + java.lang.String.valueOf(tag.getClass()) + tag.toString() + " for view " + viewCr.toString());
            }
            android.view.View view2 = (android.view.View) tag;
            viewCr = view2 != null ? view2 : cr(viewCr.getParent());
        }
    }

    private static defpackage.aigf cv(java.util.Iterator it, defpackage.ahyc ahycVar, defpackage.aigb aigbVar) {
        while (it.hasNext()) {
            java.lang.Object next = it.next();
            aigbVar.i(ahycVar.apply(next), next);
        }
        try {
            return aigbVar.e(true);
        } catch (java.lang.IllegalArgumentException e) {
            throw new java.lang.IllegalArgumentException(java.lang.String.valueOf(e.getMessage()).concat(". To index multiple values under a key, use Multimaps.index."));
        }
    }

    private static java.lang.Object cw(java.util.List list) {
        return list.get(list.size() - 1);
    }

    private static void cx(java.util.List list, defpackage.ahyp ahypVar, int i, int i2) {
        int size = list.size();
        while (true) {
            size--;
            if (size <= i2) {
                break;
            } else if (ahypVar.a(list.get(size))) {
                list.remove(size);
            }
        }
        while (true) {
            i2--;
            if (i2 < i) {
                return;
            } else {
                list.remove(i2);
            }
        }
    }

    private static java.lang.String cy(java.lang.Object obj) {
        if (obj == null) {
            return "null";
        }
        try {
            return obj.toString();
        } catch (java.lang.Exception e) {
            java.lang.String str = obj.getClass().getName() + '@' + java.lang.Integer.toHexString(java.lang.System.identityHashCode(obj));
            java.util.logging.Logger.getLogger("com.google.common.base.Strings").logp(java.util.logging.Level.WARNING, "com.google.common.base.Strings", "lenientToString", "Exception during lenientFormat for ".concat(str), (java.lang.Throwable) e);
            return "<" + str + " threw " + e.getClass().getName() + '>';
        }
    }

    private static java.lang.String cz(int i, int i2, java.lang.String str) {
        if (i < 0) {
            return bK("%s (%s) must not be negative", str, java.lang.Integer.valueOf(i));
        }
        if (i2 >= 0) {
            return bK("%s (%s) must not be greater than size (%s)", str, java.lang.Integer.valueOf(i), java.lang.Integer.valueOf(i2));
        }
        throw new java.lang.IllegalArgumentException(defpackage.a.bj(i2, "negative size: "));
    }

    /* JADX INFO: Thrown type has an unknown type hierarchy: afeb */
    public static void d(al alVar, java.lang.Class cls, defpackage.ahtl ahtlVar) throws afeb {
        android.view.View viewI = ahus.i(alVar);
        cj(viewI, "DialogFragment must have content or dialog view to add a listener!");
        ct(2131429275, viewI, cls, ahtlVar);
    }

    /* JADX INFO: Thrown type has an unknown type hierarchy: afeb */
    /* JADX WARN: Multi-variable type inference failed */
    public static void e(defpackage.aw awVar, java.lang.Class cls, defpackage.ahtl ahtlVar) throws afeb {
        android.view.View view = awVar.Q;
        if (view != null) {
            ct(2131429275, view, cls, ahtlVar);
        } else {
            if (!(awVar instanceof defpackage.ahtq)) {
                throw new java.lang.IllegalArgumentException("Fragments without views must implement EventReceiver to add a listener!");
            }
            ((defpackage.ahtq) awVar).q(cls, ahtlVar);
        }
    }

    /* JADX INFO: Thrown type has an unknown type hierarchy: afeb */
    public static void f(android.view.View view, java.lang.Class cls, defpackage.ahtl ahtlVar) throws afeb {
        ci(view);
        ct(2131429278, view, cls, ahtlVar);
    }

    /* JADX INFO: Thrown type has an unknown type hierarchy: afeb */
    public static void g(defpackage.ahth ahthVar, android.app.Activity activity) throws afeb {
        android.view.View viewFindViewById = activity.findViewById(android.R.id.content);
        cj(viewFindViewById, "Activity must have content view to send an event!");
        cu(2131429274, ahthVar, viewFindViewById);
    }

    /* JADX INFO: Thrown type has an unknown type hierarchy: afeb */
    public static void h(defpackage.ahth ahthVar, al alVar) throws afeb {
        android.view.View viewI = ahus.i(alVar);
        cj(viewI, "DialogFragment must have content or dialog view to send an event!");
        cu(2131429275, ahthVar, viewI);
    }

    /* JADX INFO: Thrown type has an unknown type hierarchy: afeb */
    /* JADX WARN: Multi-variable type inference failed */
    public static void i(defpackage.ahth ahthVar, defpackage.aw awVar) throws afeb {
        android.view.View view = awVar.Q;
        if (view != null) {
            cu(2131429275, ahthVar, view);
            return;
        }
        defpackage.afec.c();
        if (awVar instanceof defpackage.ahtq) {
            ahtm ahtmVarF = ((defpackage.ahtq) awVar).f(ahthVar);
            if (ahtmVarF == ahtm.a) {
                return;
            }
            if (ahtmVarF != ahtm.b) {
                ahthVar = ahtmVarF.c;
            }
        }
        defpackage.aw awVar2 = awVar.E;
        if (awVar2 != null) {
            i(ahthVar, awVar2);
            return;
        }
        defpackage.az azVarG = awVar.G();
        bN(azVarG != null, "Fragments must be attached to an Activity to receive events!");
        g(ahthVar, azVarG);
    }

    /* JADX INFO: Thrown type has an unknown type hierarchy: afeb */
    public static void j(defpackage.ahth ahthVar, android.view.View view) throws afeb {
        ci(view);
        cu(2131429278, ahthVar, view);
    }

    public static defpackage.ahym k(java.lang.Class cls) {
        return new defpackage.ahym(cls.getSimpleName());
    }

    public static defpackage.ahym l(java.lang.Object obj) {
        return new defpackage.ahym(obj.getClass().getSimpleName());
    }

    public static java.lang.Object m(java.lang.Object obj, java.lang.Object obj2) {
        if (obj != null) {
            return obj;
        }
        if (obj2 != null) {
            return obj2;
        }
        throw new java.lang.NullPointerException("Both parameters are null");
    }

    public static long n(j$.time.Duration duration) {
        try {
            return duration.toNanos();
        } catch (java.lang.ArithmeticException unused) {
            return duration.isNegative() ? Long.MIN_VALUE : Long.MAX_VALUE;
        }
    }

    public static char o(char c) {
        return s(c) ? (char) (c ^ ' ') : c;
    }

    public static java.lang.String p(java.lang.String str) {
        int length = str.length();
        int i = 0;
        while (i < length) {
            if (t(str.charAt(i))) {
                char[] charArray = str.toCharArray();
                while (i < length) {
                    char c = charArray[i];
                    if (t(c)) {
                        charArray[i] = (char) (c ^ ' ');
                    }
                    i++;
                }
                return java.lang.String.valueOf(charArray);
            }
            i++;
        }
        return str;
    }

    public static java.lang.String q(java.lang.String str) {
        int length = str.length();
        int i = 0;
        while (i < length) {
            if (s(str.charAt(i))) {
                char[] charArray = str.toCharArray();
                while (i < length) {
                    char c = charArray[i];
                    if (s(c)) {
                        charArray[i] = (char) (c ^ ' ');
                    }
                    i++;
                }
                return java.lang.String.valueOf(charArray);
            }
            i++;
        }
        return str;
    }

    public static boolean r(java.lang.CharSequence charSequence, java.lang.CharSequence charSequence2) {
        char c;
        int length = charSequence.length();
        if (charSequence == charSequence2) {
            return true;
        }
        if (length == charSequence2.length()) {
            for (int i = 0; i < length; i++) {
                char cCharAt = charSequence.charAt(i);
                char cCharAt2 = charSequence2.charAt(i);
                if (cCharAt == cCharAt2 || ((c = (char) ((cCharAt | ' ') - 97)) < 26 && c == ((char) ((cCharAt2 | ' ') - 97)))) {
                }
            }
            return true;
        }
        return false;
    }

    public static boolean s(char c) {
        return c >= 'a' && c <= 'z';
    }

    public static boolean t(char c) {
        return c >= 'A' && c <= 'Z';
    }

    public static final java.lang.String u(java.lang.String str) {
        defpackage.aooh.f(str, "<this>");
        java.lang.String strP = p(str);
        defpackage.aooh.e(strP, "toLowerCase(...)");
        return strP;
    }

    public static final java.lang.String v(java.lang.String str) {
        if (str == null) {
            defpackage.aooh.i("<this>");
        }
        java.lang.String strQ = q(str);
        defpackage.aooh.e(strQ, "toUpperCase(...)");
        return strQ;
    }

    public static defpackage.ajwr w(android.app.Activity activity) {
        return ((defpackage.ahti) defpackage.aooc.ar(activity, defpackage.ahti.class)).b();
    }

    public static defpackage.ajwr x(defpackage.aw awVar) {
        return ((defpackage.ahtj) defpackage.aooc.ar(awVar, defpackage.ahtj.class)).dp();
    }

    public static defpackage.ajwr y(android.view.View view) {
        return ((ahtk) defpackage.aooc.ar(view, ahtk.class)).Z();
    }

    public static long z(long j, long j2) {
        long j3 = (j ^ j2) & Long.MAX_VALUE;
        if (j3 == 0) {
            return 1L;
        }
        return j3;
    }
}
