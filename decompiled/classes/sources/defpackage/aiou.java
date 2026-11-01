package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes.dex */
public final class aiou {
    private static final defpackage.aiox e = new defpackage.aios();
    private static final defpackage.aiow f = new defpackage.aiot();
    public final defpackage.aiox c;
    public final java.util.Map a = new java.util.HashMap();
    public final java.util.Map b = new java.util.HashMap();
    public defpackage.aiow d = null;

    public aiou(defpackage.aiox aioxVar) {
        this.c = aioxVar;
    }

    public final void a(java.lang.Iterable iterable) {
        java.util.Iterator it = iterable.iterator();
        while (it.hasNext()) {
            defpackage.ainp ainpVar = (defpackage.ainp) it.next();
            defpackage.aiql.l(ainpVar, "key");
            if (ainpVar.b) {
                defpackage.aiow aiowVar = f;
                defpackage.aiql.l(ainpVar, "key");
                this.a.remove(ainpVar);
                this.b.put(ainpVar, aiowVar);
            } else {
                defpackage.aiox aioxVar = e;
                defpackage.aiql.l(ainpVar, "key");
                this.b.remove(ainpVar);
                this.a.put(ainpVar, aioxVar);
            }
        }
    }
}
