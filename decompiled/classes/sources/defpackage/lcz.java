package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes.dex */
public final class lcz implements defpackage.keo {
    private final j$.util.Optional a;
    private final defpackage.aoin b;

    public lcz(j$.util.Optional optional, defpackage.aoin aoinVar) {
        defpackage.aooh.f(aoinVar, "enableCancelMissedCallNotificationByCreationTime");
        this.a = optional;
        this.b = aoinVar;
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    @Override // defpackage.keo
    public final java.lang.Object a(java.util.Collection collection, defpackage.aoln aolnVar) {
        lcy lcyVar;
        java.util.ArrayList arrayList;
        if (aolnVar instanceof lcy) {
            lcyVar = (lcy) aolnVar;
            int i = lcyVar.c;
            if ((i & Integer.MIN_VALUE) != 0) {
                lcyVar.c = i - Integer.MIN_VALUE;
            } else {
                lcyVar = new lcy(this, aolnVar);
            }
        } else {
            lcyVar = new lcy(this, aolnVar);
        }
        java.lang.Object obj = lcyVar.a;
        defpackage.aolu aoluVar = defpackage.aolu.a;
        int i2 = lcyVar.c;
        if (i2 == 0) {
            defpackage.aooc.af(obj);
            defpackage.ldb ldbVar = (defpackage.ldb) defpackage.aooh.q(this.a);
            if (ldbVar != null) {
                if (((java.lang.Boolean) this.b.a()).booleanValue()) {
                    arrayList = new java.util.ArrayList(defpackage.ajsz.bl(collection, 10));
                    java.util.Iterator it = collection.iterator();
                    while (it.hasNext()) {
                        arrayList.add(java.lang.String.valueOf(((kdy) it.next()).b));
                    }
                } else {
                    arrayList = new java.util.ArrayList();
                    java.util.Iterator it2 = collection.iterator();
                    while (it2.hasNext()) {
                        java.lang.String str = ((kdy) it2.next()).s;
                        if (str != null) {
                            arrayList.add(str);
                        }
                    }
                }
                if (!arrayList.isEmpty()) {
                    defpackage.ajcq ajcqVarI = defpackage.ahvr.I(ldbVar.d.b(defpackage.ahvr.bv(arrayList)), new ldp(ldbVar, 1), ldbVar.b);
                    lcyVar.c = 1;
                    if (defpackage.aosv.D(ajcqVarI, lcyVar) == aoluVar) {
                        return aoluVar;
                    }
                }
            }
        } else {
            if (i2 != 1) {
                throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            defpackage.aooc.af(obj);
        }
        return defpackage.aojh.a;
    }
}
