package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes2.dex */
public final class mog implements keo {
    private final nri a;

    public mog(nri nriVar) {
        aooh.f(nriVar, "dobbyDatabase");
        this.a = nriVar;
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    public final java.lang.Object a(java.util.Collection collection, aoln aolnVar) {
        defpackage.mof mofVar;
        if (aolnVar instanceof defpackage.mof) {
            mofVar = (defpackage.mof) aolnVar;
            int i = mofVar.c;
            if ((i & Integer.MIN_VALUE) != 0) {
                mofVar.c = i - Integer.MIN_VALUE;
            } else {
                mofVar = new defpackage.mof(this, aolnVar);
            }
        } else {
            mofVar = new defpackage.mof(this, aolnVar);
        }
        java.lang.Object objE = mofVar.a;
        aolu aoluVar = aolu.a;
        int i2 = mofVar.c;
        if (i2 == 0) {
            aooc.af(objE);
            if (collection.isEmpty()) {
                return aojh.a;
            }
            nri nriVar = this.a;
            java.util.ArrayList arrayList = new java.util.ArrayList(ajsz.bl(collection, 10));
            java.util.Iterator it = collection.iterator();
            while (it.hasNext()) {
                arrayList.add(new java.lang.Long(((defpackage.kdy) it.next()).b));
            }
            mofVar.c = 1;
            objE = nriVar.e(arrayList, mofVar);
            if (objE == aoluVar) {
                return aoluVar;
            }
        } else {
            if (i2 != 1) {
                throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            aooc.af(objE);
        }
        ((java.lang.Number) objE).intValue();
        return aojh.a;
    }
}
