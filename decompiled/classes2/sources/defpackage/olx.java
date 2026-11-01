package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes2.dex */
public final /* synthetic */ class olx implements dxx {
    private final /* synthetic */ int $cid;
    public final /* synthetic */ java.lang.Object a;
    public final /* synthetic */ java.lang.Object b;

    public /* synthetic */ olx(java.lang.Object obj, java.lang.Object obj2, int i) {
        this.$cid = i;
        this.a = obj;
        this.b = obj2;
    }

    public final java.lang.Object a(java.lang.Object obj) {
        if (this.$cid != 0) {
            akzx akzxVarP = ((lhs) obj).p();
            java.lang.String str = ((akff) ((j$.util.Optional) this.a).orElseThrow()).q;
            j$.util.Objects.requireNonNull(str);
            java.lang.Object obj2 = this.b;
            j$.util.Objects.requireNonNull(obj2);
            akzxVarP.u();
            lhs lhsVar = akzxVarP.b;
            albe albeVar = lhsVar.c;
            if (!albeVar.b) {
                lhsVar.c = albeVar.a();
            }
            lhsVar.c.put(str, obj2);
            return akzxVarP.p();
        }
        olw olwVar = (olw) obj;
        aiho aihoVarM = ((aihm) this.b).m();
        java.util.LinkedHashMap linkedHashMap = new java.util.LinkedHashMap();
        j$.lang.Iterable.-EL.forEach(aihoVarM, new defpackage.fcg(linkedHashMap, 16));
        akzx akzxVarM = olv.a.m();
        akzxVarM.u();
        olv olvVar = akzxVarM.b;
        albe albeVar2 = olvVar.c;
        if (!albeVar2.b) {
            olvVar.c = albeVar2.a();
        }
        java.lang.Object obj3 = this.a;
        olvVar.c.putAll(linkedHashMap);
        alcf alcfVarE = aldi.e(j$.time.Instant.now().toEpochMilli());
        akzxVarM.u();
        olv olvVar2 = akzxVarM.b;
        j$.util.Objects.requireNonNull(alcfVarE);
        olvVar2.d = alcfVarE;
        olvVar2.b |= 1;
        olv olvVarP = akzxVarM.p();
        java.util.concurrent.atomic.AtomicInteger atomicInteger = new java.util.concurrent.atomic.AtomicInteger(0);
        j$.lang.Iterable.-EL.forEach(olwVar.b, new defpackage.rh(obj3, atomicInteger, 8));
        java.lang.Integer numValueOf = java.lang.Integer.valueOf(atomicInteger.getAndAdd(1));
        android.util.LruCache lruCache = ((defpackage.olz) obj3).b;
        lruCache.put(numValueOf, olvVarP);
        while (atomicInteger.get() > 10) {
            lruCache.remove(java.lang.Integer.valueOf(atomicInteger.decrementAndGet() - 10));
        }
        akzx akzxVarM2 = olw.a.m();
        java.util.ArrayList arrayList = new java.util.ArrayList();
        java.util.Iterator it = lruCache.snapshot().keySet().iterator();
        while (it.hasNext()) {
            arrayList.add((olv) lruCache.get((java.lang.Integer) it.next()));
        }
        akzxVarM2.M(arrayList);
        return akzxVarM2.p();
    }
}
