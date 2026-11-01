package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes2.dex */
public class aigq {
    public java.util.Map a;
    public java.util.Comparator b;
    public java.util.Comparator c;

    public aifn e(int i) {
        return aify.d(i);
    }

    final java.util.Map f() {
        java.util.Map map = this.a;
        if (map != null) {
            return map;
        }
        aieb aiebVar = new aieb();
        this.a = aiebVar;
        return aiebVar;
    }

    public final void g(java.lang.Object obj, java.lang.Object obj2) {
        ahvr.bB(obj, obj2);
        aifn aifnVarE = (aifn) f().get(obj);
        if (aifnVarE == null) {
            aifnVarE = e(4);
            f().put(obj, aifnVarE);
        }
        aifnVarE.c(obj2);
    }

    public final void h(java.lang.Object obj, java.lang.Iterable iterable) {
        if (obj == null) {
            throw new java.lang.NullPointerException("null key in entry: null=".concat(ahvr.bn(iterable)));
        }
        java.util.Iterator it = iterable.iterator();
        if (it.hasNext()) {
            aifn aifnVarE = (aifn) f().get(obj);
            if (aifnVarE == null) {
                aifnVarE = e(i(iterable));
                f().put(obj, aifnVarE);
            }
            while (it.hasNext()) {
                java.lang.Object next = it.next();
                ahvr.bB(obj, next);
                aifnVarE.c(next);
            }
        }
    }

    public int i(java.lang.Iterable iterable) {
        if (iterable instanceof java.util.Collection) {
            return java.lang.Math.max(4, ((java.util.Collection) iterable).size());
        }
        return 4;
    }
}
