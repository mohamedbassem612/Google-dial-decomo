package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes.dex */
public final class affr implements defpackage.afef {
    private boolean a = false;

    public final void b() {
        this.a = true;
    }

    /* JADX WARN: Type inference failed for: r0v4, types: [java.lang.Object, java.util.List] */
    /* JADX WARN: Type inference failed for: r1v0, types: [affu, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r1v1, types: [java.lang.Object, java.util.List] */
    @Override // defpackage.afef
    /* JADX INFO: renamed from: c, reason: merged with bridge method [inline-methods] */
    public final java.io.InputStream a(defpackage.ahbz ahbzVar) {
        java.io.InputStream inputStreamD = ahbzVar.b.d((android.net.Uri) ahbzVar.c);
        if (this.a) {
            inputStreamD = new java.io.BufferedInputStream(inputStreamD);
        }
        java.util.ArrayList arrayList = new java.util.ArrayList();
        arrayList.add(inputStreamD);
        ?? r1 = ahbzVar.f;
        if (!r1.isEmpty()) {
            int i = afed.a;
            java.util.ArrayList arrayList2 = new java.util.ArrayList();
            java.util.Iterator it = r1.iterator();
            while (it.hasNext()) {
                ((defpackage.affy) it.next()).f();
            }
            afed afedVar = !arrayList2.isEmpty() ? new afed(inputStreamD, arrayList2) : null;
            if (afedVar != null) {
                arrayList.add(afedVar);
            }
        }
        java.util.Iterator it2 = ahbzVar.d.iterator();
        while (it2.hasNext()) {
            arrayList.add(((defpackage.affz) it2.next()).a((android.net.Uri) ahbzVar.e, (java.io.InputStream) defpackage.ahvr.bk(arrayList)));
        }
        java.util.Collections.reverse(arrayList);
        return (java.io.InputStream) arrayList.get(0);
    }
}
