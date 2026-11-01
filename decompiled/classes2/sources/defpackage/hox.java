package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes2.dex */
public final class hox extends na {
    final /* synthetic */ defpackage.hoy a;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public hox(defpackage.hoy hoyVar) {
        super(true);
        this.a = hoyVar;
    }

    public final void b() {
        defpackage.hoy hoyVar = this.a;
        if (hoyVar.i.c(zpo.h).size() == 0) {
            java.util.Collection collectionB = ((defpackage.uc) hoyVar.a.a(defpackage.uc.class)).b();
            java.util.ArrayList arrayList = new java.util.ArrayList();
            for (java.lang.Object obj : collectionB) {
                if (aooh.n(((defpackage.ub) obj).c, "inCall")) {
                    arrayList.add(obj);
                }
            }
            java.util.Iterator it = arrayList.iterator();
            while (it.hasNext()) {
                ((defpackage.ub) it.next()).c();
            }
        }
        hoyVar.f.c.a();
        hoyVar.h.f(false);
    }
}
