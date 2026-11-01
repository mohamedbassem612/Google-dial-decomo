package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes.dex */
public final class aiov extends defpackage.aioy {
    private final java.util.Map a;
    private final java.util.Map b;
    private final defpackage.aiox c;
    private final defpackage.aiow d;

    public aiov(defpackage.aiou aiouVar) {
        java.util.HashMap map = new java.util.HashMap();
        this.a = map;
        java.util.HashMap map2 = new java.util.HashMap();
        this.b = map2;
        map.putAll(aiouVar.a);
        map2.putAll(aiouVar.b);
        this.c = aiouVar.c;
        this.d = aiouVar.d;
    }

    @Override // defpackage.aioy
    protected final void a(defpackage.ainp ainpVar, java.lang.Object obj, java.lang.Object obj2) {
        defpackage.aiox aioxVar = (defpackage.aiox) this.a.get(ainpVar);
        if (aioxVar != null) {
            aioxVar.a(ainpVar, obj, obj2);
        } else {
            this.c.a(ainpVar, obj, obj2);
        }
    }

    @Override // defpackage.aioy
    protected final void b(defpackage.ainp ainpVar, java.util.Iterator it, java.lang.Object obj) {
        defpackage.aiow aiowVar = (defpackage.aiow) this.b.get(ainpVar);
        if (aiowVar != null) {
            aiowVar.a(ainpVar, it, obj);
            return;
        }
        defpackage.aiow aiowVar2 = this.d;
        if (aiowVar2 != null && !this.a.containsKey(ainpVar)) {
            aiowVar2.a(ainpVar, it, obj);
        } else {
            while (it.hasNext()) {
                a(ainpVar, it.next(), obj);
            }
        }
    }
}
