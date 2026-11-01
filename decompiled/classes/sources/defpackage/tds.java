package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes.dex */
public final class tds implements defpackage.keo {
    private final android.content.Context a;
    private final defpackage.teb b;
    private final defpackage.aoin c;

    public tds(android.content.Context context, defpackage.teb tebVar, defpackage.aoin aoinVar) {
        defpackage.aooh.f(context, "context");
        defpackage.aooh.f(aoinVar, "enableCancelMissedCallNotificationByCreationTime");
        this.a = context;
        this.b = tebVar;
        this.c = aoinVar;
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    @Override // defpackage.keo
    public final java.lang.Object a(java.util.Collection collection, defpackage.aoln aolnVar) {
        tdr tdrVar;
        java.util.ArrayList arrayList;
        if (aolnVar instanceof tdr) {
            tdrVar = (tdr) aolnVar;
            int i = tdrVar.c;
            if ((i & Integer.MIN_VALUE) != 0) {
                tdrVar.c = i - Integer.MIN_VALUE;
            } else {
                tdrVar = new tdr(this, aolnVar);
            }
        } else {
            tdrVar = new tdr(this, aolnVar);
        }
        java.lang.Object obj = tdrVar.a;
        defpackage.aolu aoluVar = defpackage.aolu.a;
        int i2 = tdrVar.c;
        if (i2 == 0) {
            defpackage.aooc.af(obj);
            if (((java.lang.Boolean) this.c.a()).booleanValue()) {
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
                defpackage.ajcq ajcqVarF = defpackage.ahvr.F(new syg(this.a, defpackage.ahvr.bv(arrayList), 7), this.b.b);
                tdrVar.c = 1;
                if (defpackage.aosv.D(ajcqVarF, tdrVar) == aoluVar) {
                    return aoluVar;
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
