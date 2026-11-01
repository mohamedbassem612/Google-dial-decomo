package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes.dex */
public final class kag {
    public static final defpackage.aimz a = defpackage.aimz.i("com/android/dialer/calllog/compose/data/realtime/CallLogRealtimeDataFetcher");
    public final defpackage.sqo b;
    public final defpackage.srv c;
    public final defpackage.zjm d;
    public final defpackage.rsr e;
    private final defpackage.sod f;
    private final defpackage.aoir g;

    public kag(defpackage.sqo sqoVar, defpackage.srv srvVar, defpackage.rsr rsrVar, defpackage.gus gusVar, defpackage.zjm zjmVar, defpackage.sod sodVar) {
        if (sqoVar == null) {
            defpackage.aooh.i("cp2Contributor");
        }
        if (gusVar == null) {
            defpackage.aooh.i("numberAttributesBuilder");
        }
        this.b = sqoVar;
        this.c = srvVar;
        this.e = rsrVar;
        this.d = zjmVar;
        this.f = sodVar;
        this.g = new defpackage.aoiy(new defpackage.jza(this, 5));
    }

    /* JADX WARN: Code duplicated, block: B:35:0x00af  */
    /* JADX WARN: Code duplicated, block: B:37:0x00c1  */
    /* JADX WARN: Code duplicated, block: B:40:0x00d1  */
    /* JADX WARN: Code duplicated, block: B:41:0x00d4  */
    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r10v3, types: [java.lang.Iterable] */
    /* JADX WARN: Type inference failed for: r10v8 */
    /* JADX WARN: Type inference failed for: r10v9 */
    /* JADX WARN: Type inference failed for: r1v0, types: [aolu] */
    /* JADX WARN: Type inference failed for: r1v2, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r1v3, types: [java.util.ArrayList, java.util.Collection] */
    public final java.lang.Object a(java.util.List list, defpackage.aoln aolnVar) throws java.lang.Exception {
        kaf kafVar;
        defpackage.kgz kgzVar;
        java.lang.Object obj;
        java.util.Map map;
        ?? r10;
        java.util.Map map2;
        soe soeVar;
        kas karVar;
        if (aolnVar instanceof kaf) {
            kafVar = (kaf) aolnVar;
            int i = kafVar.e;
            if ((i & Integer.MIN_VALUE) != 0) {
                kafVar.e = i - Integer.MIN_VALUE;
            } else {
                kafVar = new kaf(this, aolnVar);
            }
        } else {
            kafVar = new kaf(this, aolnVar);
        }
        java.lang.Object obj2 = kafVar.c;
        ?? arrayList = defpackage.aolu.a;
        int i2 = kafVar.e;
        if (i2 == 0) {
            defpackage.aooc.af(obj2);
            if (list.isEmpty()) {
                return defpackage.aokc.a;
            }
            defpackage.kgz kgzVarB = b();
            if (kgzVarB == null) {
                throw new java.lang.IllegalStateException("Requested VoIP contact realtime data while Halo feature is disabled.");
            }
            defpackage.sod sodVar = this.f;
            java.util.ArrayList arrayList2 = new java.util.ArrayList(defpackage.ajsz.bl(list, 10));
            java.util.Iterator it = list.iterator();
            while (it.hasNext()) {
                arrayList2.add(defpackage.kcq.j((kap) it.next()));
            }
            kafVar.a = list;
            kafVar.b = kgzVarB;
            kafVar.e = 1;
            java.lang.Object objA = sodVar.a(arrayList2, kafVar);
            if (objA != arrayList) {
                obj2 = objA;
                kgzVar = kgzVarB;
                obj = list;
            }
            return arrayList;
        }
        if (i2 == 1) {
            kgzVar = (defpackage.kgz) kafVar.b;
            java.lang.Object obj3 = kafVar.a;
            defpackage.aooc.af(obj2);
            obj = obj3;
        } else {
            if (i2 != 2) {
                throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            map = (java.util.Map) kafVar.b;
            java.lang.Object obj4 = kafVar.a;
            defpackage.aooc.af(obj2);
            r10 = obj4;
        }
        map2 = (java.util.Map) obj2;
        arrayList = new java.util.ArrayList(defpackage.ajsz.bl(r10, 10));
        for (kap kapVar : r10) {
            soeVar = (soe) map.get(defpackage.kcq.j(kapVar));
            if (soeVar == null) {
                soeVar = soe.a;
            }
            if (defpackage.aooh.n((soe) map2.get(kapVar.a), soeVar)) {
                karVar = kas.a;
            } else {
                karVar = new kar(new kan(kapVar, soeVar));
            }
            arrayList.add(new defpackage.aoiu(kapVar, karVar));
        }
        return arrayList;
        java.util.Map map3 = (java.util.Map) obj2;
        kafVar.a = obj;
        kafVar.b = map3;
        kafVar.e = 2;
        java.lang.Object objC = kgzVar.c(kafVar);
        if (objC != arrayList) {
            obj2 = objC;
            map = map3;
            r10 = obj;
            map2 = (java.util.Map) obj2;
            arrayList = new java.util.ArrayList(defpackage.ajsz.bl(r10, 10));
            while (r10.hasNext()) {
                soeVar = (soe) map.get(defpackage.kcq.j(kapVar));
                if (soeVar == null) {
                    soeVar = soe.a;
                }
                if (defpackage.aooh.n((soe) map2.get(kapVar.a), soeVar)) {
                    karVar = kas.a;
                } else {
                    karVar = new kar(new kan(kapVar, soeVar));
                }
                arrayList.add(new defpackage.aoiu(kapVar, karVar));
            }
        }
        return arrayList;
    }

    public final defpackage.kgz b() {
        return (defpackage.kgz) this.g.a();
    }
}
