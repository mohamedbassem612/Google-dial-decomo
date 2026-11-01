package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes2.dex */
public final class ism implements keo {
    private final rxa a;
    private final kgl b;

    public ism(kgl kglVar, rxa rxaVar) {
        aooh.f(kglVar, "beeslySot");
        this.b = kglVar;
        this.a = rxaVar;
    }

    /* JADX WARN: Code duplicated, block: B:25:0x007d  */
    /* JADX WARN: Code duplicated, block: B:31:0x0094 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:33:? A[LOOP:0: B:23:0x0077->B:33:?, LOOP_END, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    public final java.lang.Object a(java.util.Collection collection, aoln aolnVar) {
        defpackage.isl islVar;
        java.util.Iterator it;
        rxa rxaVar;
        long j;
        if (aolnVar instanceof defpackage.isl) {
            islVar = (defpackage.isl) aolnVar;
            int i = islVar.d;
            if ((i & Integer.MIN_VALUE) != 0) {
                islVar.d = i - Integer.MIN_VALUE;
            } else {
                islVar = new defpackage.isl(this, aolnVar);
            }
        } else {
            islVar = new defpackage.isl(this, aolnVar);
        }
        java.lang.Object obj = islVar.b;
        aolu aoluVar = aolu.a;
        int i2 = islVar.d;
        if (i2 != 0) {
            if (i2 == 1) {
                collection = (java.util.Collection) islVar.a;
                aooc.af(obj);
            } else {
                if (i2 != 2) {
                    throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                it = (java.util.Iterator) islVar.a;
                aooc.af(obj);
            }
            while (it.hasNext()) {
                defpackage.kdy kdyVar = (defpackage.kdy) it.next();
                rxaVar = this.a;
                j = kdyVar.b;
                islVar.a = it;
                islVar.d = 2;
                if (rxaVar.d(j, islVar) == aoluVar) {
                    return aoluVar;
                }
            }
            return aojh.a;
        }
        aooc.af(obj);
        kgl kglVar = this.b;
        java.util.ArrayList arrayList = new java.util.ArrayList(ajsz.bl(collection, 10));
        java.util.Iterator it2 = collection.iterator();
        while (it2.hasNext()) {
            arrayList.add(new java.lang.Long(((defpackage.kdy) it2.next()).b));
        }
        islVar.a = collection;
        islVar.d = 1;
        if (kglVar.n(arrayList, islVar) == aoluVar) {
            return aoluVar;
        }
        it = collection.iterator();
        while (it.hasNext()) {
            defpackage.kdy kdyVar2 = (defpackage.kdy) it.next();
            rxaVar = this.a;
            j = kdyVar2.b;
            islVar.a = it;
            islVar.d = 2;
            if (rxaVar.d(j, islVar) == aoluVar) {
                return aoluVar;
            }
        }
        return aojh.a;
    }
}
