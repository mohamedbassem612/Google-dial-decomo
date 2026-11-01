package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes2.dex */
public final class iso implements defpackage.kep {
    private static final aimz a = aimz.i("com/android/dialer/beesly/impl/calllog/BeeslyCallLogInsertListener");
    private final ojo b;
    private final kgl c;

    public iso(kgl kglVar, ojo ojoVar) {
        aooh.f(kglVar, "beeslySot");
        aooh.f(ojoVar, "dialerContentResolver");
        this.c = kglVar;
        this.b = ojoVar;
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r9v13 */
    /* JADX WARN: Type inference failed for: r9v8 */
    /* JADX WARN: Type inference failed for: r9v9, types: [java.util.Map] */
    @Override // defpackage.kep
    public final java.lang.Object a(java.util.Collection collection, aoln aolnVar) {
        defpackage.isn isnVar;
        ?? r9;
        if (aolnVar instanceof defpackage.isn) {
            isnVar = (defpackage.isn) aolnVar;
            int i = isnVar.d;
            if ((i & Integer.MIN_VALUE) != 0) {
                isnVar.d = i - Integer.MIN_VALUE;
            } else {
                isnVar = new defpackage.isn(this, aolnVar);
            }
        } else {
            isnVar = new defpackage.isn(this, aolnVar);
        }
        java.lang.Object objQ = isnVar.b;
        aolu aoluVar = aolu.a;
        int i2 = isnVar.d;
        try {
            if (i2 != 0) {
                if (i2 == 1) {
                    java.lang.Object obj = isnVar.a;
                    aooc.af(objQ);
                    r9 = obj;
                } else {
                    if (i2 != 2) {
                        throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    aooc.af(objQ);
                }
                return aojh.a;
            }
            aooc.af(objQ);
            java.util.LinkedHashMap linkedHashMap = new java.util.LinkedHashMap(aooc.t(ajsz.aL(ajsz.bl(collection, 10)), 16));
            java.util.Iterator it = collection.iterator();
            while (it.hasNext()) {
                defpackage.kec kecVar = (defpackage.kec) it.next();
                aoiu aoiuVar = new aoiu(new defpackage.ity(kecVar.b), new java.lang.Long(kecVar.a));
                linkedHashMap.put(aoiuVar.a, aoiuVar.b);
            }
            kgl kglVar = this.c;
            java.util.Set setKeySet = linkedHashMap.keySet();
            isnVar.a = linkedHashMap;
            isnVar.d = 1;
            objQ = kglVar.q(setKeySet, isnVar);
            if (objQ == aoluVar) {
                return aoluVar;
            }
            r9 = linkedHashMap;
            java.util.Map map = (java.util.Map) objQ;
            if (!map.isEmpty()) {
                java.util.ArrayList arrayList = new java.util.ArrayList(map.size());
                for (java.util.Map.Entry entry : map.entrySet()) {
                    java.lang.Object obj2 = r9.get(entry.getKey());
                    if (obj2 == null) {
                        throw new java.lang.IllegalStateException("Required value was null.");
                    }
                    arrayList.add(android.content.ContentProviderOperation.newUpdate(android.content.ContentUris.withAppendedId(android.provider.CallLog.Calls.CONTENT_URI, ((java.lang.Number) obj2).longValue())).withValue("type", ((defpackage.itc) entry.getValue()).j).build());
                }
                ojo ojoVar = this.b;
                isnVar.a = null;
                isnVar.d = 2;
                objQ = ojoVar.o(arrayList, isnVar);
                if (objQ == aoluVar) {
                    return aoluVar;
                }
            }
        } catch (java.lang.Exception e) {
            a.d().k(e).l("com/android/dialer/beesly/impl/calllog/BeeslyCallLogInsertListener", "onInsert", 56, "BeeslyCallLogInsertListener.kt").v("Failed to apply batch update to system call log");
        }
        return aojh.a;
    }
}
