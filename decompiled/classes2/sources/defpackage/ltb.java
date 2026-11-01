package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes2.dex */
public final class ltb implements lsx {
    public final gfj a = new defpackage.lsy(this);
    public final gfi b = new defpackage.lsz(this);
    public final gfi c = new defpackage.lta(this);
    private final gfy d;

    public ltb(gfy gfyVar) {
        this.d = gfyVar;
    }

    public static final defpackage.ltc k(gin ginVar) {
        int iQ = dzk.Q(ginVar, "caller_number");
        int iQ2 = dzk.Q(ginVar, "verification_state");
        defpackage.ltj ltjVar = null;
        java.lang.Object obj = null;
        java.lang.String strE = iQ == -1 ? null : ginVar.e(iQ);
        if (iQ2 != -1) {
            java.lang.String strE2 = ginVar.e(iQ2);
            aooh.f(strE2, "nameInStorage");
            aojl aojlVar = new aojl(defpackage.ltj.c);
            boolean z = false;
            while (aojlVar.hasNext()) {
                java.lang.Object next = aojlVar.next();
                if (aooh.n(((defpackage.ltj) next).d, strE2)) {
                    if (z) {
                        throw new java.lang.IllegalArgumentException("Collection contains more than one matching element.");
                    }
                    z = true;
                    obj = next;
                }
            }
            if (!z) {
                throw new java.util.NoSuchElementException("Collection contains no element matching the predicate.");
            }
            ltjVar = (defpackage.ltj) obj;
        }
        return new defpackage.ltc(strE, ltjVar);
    }

    public final java.lang.Object a(java.util.List list, java.util.List list2, java.util.List list3, aoln aolnVar) {
        return dez.n(this.d, new defpackage.aju(this, list, list2, list3, 9), aolnVar);
    }

    public final java.lang.Object b(java.util.Collection collection, aoln aolnVar) {
        collection.getClass();
        return dez.o(this.d, false, true, new defpackage.khx(this, collection, 13), aolnVar);
    }

    public final java.lang.Object c(giv givVar, aoln aolnVar) {
        java.util.TreeMap treeMap = ggd.a;
        rsr rsrVarI = dez.t(givVar).i();
        return dez.o(this.d, true, false, new defpackage.khx(rsrVarI.a, rsrVarI, 16, null), aolnVar);
    }

    public final java.lang.Object d(java.lang.String str, aoln aolnVar) {
        return dez.n(this.d, new defpackage.khx(this, str, 15), aolnVar);
    }

    public final /* bridge */ /* synthetic */ java.lang.Object e(java.lang.String str, java.lang.String str2, java.lang.Object obj, aonj aonjVar, aoln aolnVar) {
        return dez.n(this.d, new defpackage.dqw(this, str, str2, (java.lang.String) obj, aonjVar, 11), aolnVar);
    }

    public final java.lang.Object f(java.lang.String str, java.lang.String str2, java.util.Set set, aonj aonjVar, aoln aolnVar) {
        return dez.n(this.d, new defpackage.dqw(this, str, str2, set, aonjVar, 10), aolnVar);
    }

    public final java.lang.Object g(giv givVar, aoln aolnVar) {
        java.util.TreeMap treeMap = ggd.a;
        rsr rsrVarI = dez.t(givVar).i();
        return dez.o(this.d, true, false, new defpackage.khx(rsrVarI.a, rsrVarI, 18, null), aolnVar);
    }

    public final java.lang.Object h(giv givVar, aoln aolnVar) {
        java.util.TreeMap treeMap = ggd.a;
        rsr rsrVarI = dez.t(givVar).i();
        return dez.o(this.d, true, false, new defpackage.khx(rsrVarI.a, rsrVarI, 12, null), aolnVar);
    }

    public final java.lang.Object i(java.util.Collection collection, aoln aolnVar) {
        collection.getClass();
        return dez.o(this.d, false, true, new defpackage.khx(this, collection, 17), aolnVar);
    }

    public final java.lang.Object j(java.util.Collection collection, aoln aolnVar) {
        collection.getClass();
        return dez.o(this.d, false, true, new defpackage.khx(this, collection, 14), aolnVar);
    }
}
