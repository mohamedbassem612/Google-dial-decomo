package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes3.dex */
public final class agkt extends dca {
    public static final java.lang.String a;
    private final defpackage.agja b;
    private final defpackage.agiz d;
    private final java.util.Map e;
    private final aonn f;
    private final java.util.concurrent.Executor g;
    private final defpackage.agja h;
    private final aomy i;
    private final java.lang.Long j;
    private final boolean k;
    private final kaw l;

    static {
        aooh.e("agkt", "getSimpleName(...)");
        a = "agkt";
    }

    public agkt(defpackage.agja agjaVar, defpackage.agiz agizVar, java.util.Map map, aonn aonnVar, java.util.concurrent.Executor executor, aomy aomyVar) {
        aooh.f(agizVar, "state");
        aooh.f(map, "stateMap");
        aooh.f(aonnVar, "onStateAnimationFinished");
        aooh.f(aomyVar, "timeSupplierMs");
        this.b = agjaVar;
        this.d = agizVar;
        this.e = map;
        this.f = aonnVar;
        this.g = executor;
        this.h = null;
        this.i = aomyVar;
        this.j = null;
        this.k = false;
        this.l = null;
    }

    public final /* synthetic */ cmv d() {
        java.util.Set linkedHashSet = new java.util.LinkedHashSet();
        defpackage.agle agleVar = defpackage.agln.a;
        linkedHashSet.addAll(defpackage.agln.bl);
        linkedHashSet.add(defpackage.agln.a);
        defpackage.agja agjaVar = this.b;
        if (agjaVar.b != null) {
            linkedHashSet.addAll(defpackage.agln.bm);
        }
        if (agjaVar.c != null) {
            linkedHashSet.addAll(defpackage.agln.bn);
        }
        if (agjaVar.d != null) {
            linkedHashSet.addAll(defpackage.agln.bo);
        }
        if (agjaVar.e != null) {
            linkedHashSet.addAll(defpackage.agln.bp);
        }
        defpackage.agiw agiwVar = agjaVar.f;
        if (agiwVar != null) {
            linkedHashSet.addAll(new defpackage.aglm(agiwVar.a).m);
        }
        defpackage.agiw agiwVar2 = agjaVar.g;
        if (agiwVar2 != null) {
            linkedHashSet.addAll(new defpackage.aglm(agiwVar2.a).m);
        }
        if (agjaVar.h != null) {
            linkedHashSet.addAll(defpackage.agln.bq);
        }
        if (agjaVar.i != null) {
            linkedHashSet.addAll(defpackage.agln.br);
        }
        if (agjaVar.j != null) {
            linkedHashSet.addAll(defpackage.agln.bs);
            linkedHashSet.add(defpackage.agln.b);
        }
        if (agjaVar.k != null) {
            linkedHashSet.addAll(defpackage.agln.bt);
        }
        if (agjaVar.l != null) {
            linkedHashSet.add(defpackage.agln.bg);
            linkedHashSet.add(defpackage.agln.bh);
            linkedHashSet.add(defpackage.agln.bi);
            linkedHashSet.add(defpackage.agln.bj);
            linkedHashSet.add(defpackage.agln.bk);
        }
        java.util.Map map = this.e;
        java.util.LinkedHashMap linkedHashMap = new java.util.LinkedHashMap(ajsz.aL(map.size()));
        java.util.Iterator it = map.entrySet().iterator();
        while (it.hasNext()) {
            java.util.Map.Entry entry = (java.util.Map.Entry) it.next();
            java.lang.Object key = entry.getKey();
            defpackage.agiz agizVar = (defpackage.agiz) entry.getKey();
            defpackage.agju agjuVar = (defpackage.agju) entry.getValue();
            java.util.List<defpackage.agjx> list = agjuVar.a;
            java.util.ArrayList arrayList = new java.util.ArrayList(ajsz.bl(list, 10));
            for (defpackage.agjx agjxVar : list) {
                java.util.List list2 = agjxVar.d;
                java.util.ArrayList arrayList2 = new java.util.ArrayList();
                for (java.lang.Object obj : list2) {
                    defpackage.aglv aglvVar = ((defpackage.agjt) obj).a;
                    if (linkedHashSet.contains(aglvVar)) {
                        arrayList2.add(obj);
                    } else {
                        android.util.Log.w(a, "State " + agizVar + ": Filtering out keyframe for uniform '" + aglvVar.a() + "' as it's not active in the current shader config.");
                        linkedHashSet = linkedHashSet;
                    }
                }
                java.util.Set set = linkedHashSet;
                long j = agjxVar.a;
                long j2 = agjxVar.b;
                ajh ajhVar = agjxVar.c;
                aooh.f(ajhVar, "easing");
                arrayList.add(new defpackage.agjx(j, j2, ajhVar, arrayList2));
                it = it;
                linkedHashSet = set;
            }
            linkedHashMap.put(key, new defpackage.agju(arrayList, agjuVar.b, agjuVar.c));
            it = it;
            linkedHashSet = linkedHashSet;
        }
        return new defpackage.agks(agjaVar, this.d, linkedHashMap, this.f, this.i);
    }

    public final /* synthetic */ void e(cmv cmvVar) {
        defpackage.agks agksVar = (defpackage.agks) cmvVar;
        aooh.f(agksVar, com.android.onboarding.config.foregroundpriority.ForegroundPriority.KEY_NODE);
        defpackage.agiz agizVar = agksVar.b;
        defpackage.agiz agizVar2 = this.d;
        if (agizVar2 != agizVar) {
            agksVar.e(agizVar2);
            aooh.f(agizVar2, "<set-?>");
            agksVar.b = agizVar2;
        }
        boolean zN = aooh.n((java.lang.Object) null, (java.lang.Object) null);
        boolean zN2 = aooh.n((java.lang.Object) null, (java.lang.Object) null);
        if (!zN) {
            if (!zN2) {
                agksVar.m = aokd.a;
                defpackage.agja agjaVar = agksVar.a;
                agksVar.f = new defpackage.aglb(agjaVar);
                agksVar.g = new cqe(agksVar.f);
                agksVar.n = new defpackage.amdx(agjaVar);
                int i = defpackage.agjj.a;
                agksVar.h = null;
                aoub aoubVar = agksVar.e;
                if (aoubVar != null) {
                    aoubVar.s((java.util.concurrent.CancellationException) null);
                }
                agksVar.b();
            }
            int i2 = defpackage.agjj.a;
            agksVar.h = null;
            defpackage.agja agjaVar2 = agksVar.a;
            agksVar.i = agjaVar2.a();
            agksVar.n.a = agjaVar2;
            agksVar.b();
        }
        if (aooh.n((java.lang.Object) null, (java.lang.Object) null) || !((cmv) agksVar).D) {
            return;
        }
        agksVar.b();
    }

    public final boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof defpackage.agkt) {
            defpackage.agkt agktVar = (defpackage.agkt) obj;
            if (aooh.n(this.b, agktVar.b) && this.d == agktVar.d && aooh.n(this.e, agktVar.e) && aooh.n(this.f, agktVar.f) && aooh.n(this.g, agktVar.g)) {
                defpackage.agja agjaVar = agktVar.h;
                if (aooh.n((java.lang.Object) null, (java.lang.Object) null) && aooh.n(this.i, agktVar.i)) {
                    java.lang.Long l = agktVar.j;
                    if (aooh.n((java.lang.Object) null, (java.lang.Object) null)) {
                        boolean z = agktVar.k;
                        kaw kawVar = agktVar.l;
                        if (aooh.n((java.lang.Object) null, (java.lang.Object) null)) {
                            return true;
                        }
                    }
                }
            }
        }
        return false;
    }

    public final int hashCode() {
        int iHashCode = (((((this.b.hashCode() * 31) + this.d.hashCode()) * 31) + this.e.hashCode()) * 31) + this.f.hashCode();
        java.util.concurrent.Executor executor = this.g;
        return ((((((iHashCode * 31) + (executor == null ? 0 : executor.hashCode())) * 961) + this.i.hashCode()) * 961) + 1237) * 31;
    }

    public final java.lang.String toString() {
        return "EnergyShaderNodeElement(initialConfig=" + this.b + ", state=" + this.d + ", stateMap=" + this.e + ", onStateAnimationFinished=" + this.f + ", mainExecutor=" + this.g + ", debugConfig=null, timeSupplierMs=" + this.i + ", timeOffsetMs=null, updateImmediately=false, interactionSource=null)";
    }
}
