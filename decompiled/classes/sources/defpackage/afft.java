package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes.dex */
public final class afft implements defpackage.afef {
    public defpackage.ajiu[] a;

    /* JADX WARN: Type inference failed for: r0v3, types: [java.lang.Object, java.util.List] */
    /* JADX WARN: Type inference failed for: r1v0, types: [affu, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r2v0, types: [java.lang.Object, java.util.List] */
    @Override // defpackage.afef
    public final /* bridge */ /* synthetic */ java.lang.Object a(defpackage.ahbz ahbzVar) {
        java.io.OutputStream outputStreamF = ahbzVar.b.f((android.net.Uri) ahbzVar.c);
        java.util.ArrayList arrayList = new java.util.ArrayList();
        arrayList.add(outputStreamF);
        ?? r2 = ahbzVar.f;
        if (!r2.isEmpty()) {
            java.lang.Object obj = ahbzVar.e;
            int i = afee.a;
            java.util.ArrayList arrayList2 = new java.util.ArrayList();
            java.util.Iterator it = r2.iterator();
            while (it.hasNext()) {
                affx affxVarB = ((defpackage.affy) it.next()).b((android.net.Uri) obj);
                if (affxVarB != null) {
                    arrayList2.add(affxVarB);
                }
            }
            afee afeeVar = !arrayList2.isEmpty() ? new afee(outputStreamF, arrayList2) : null;
            if (afeeVar != null) {
                arrayList.add(afeeVar);
            }
        }
        java.util.Iterator it2 = ahbzVar.d.iterator();
        while (it2.hasNext()) {
            arrayList.add(((defpackage.affz) it2.next()).b((android.net.Uri) ahbzVar.e, (java.io.OutputStream) defpackage.ahvr.bk(arrayList)));
        }
        java.util.Collections.reverse(arrayList);
        defpackage.ajiu[] ajiuVarArr = this.a;
        if (ajiuVarArr != null) {
            defpackage.ajiu ajiuVar = ajiuVarArr[0];
            java.io.Closeable closeable = (java.io.OutputStream) defpackage.ahvr.bk(arrayList);
            if (closeable instanceof defpackage.afez) {
                ajiuVar.a = (defpackage.afez) closeable;
                ajiuVar.b = (java.io.OutputStream) arrayList.get(0);
            }
        }
        return (java.io.OutputStream) arrayList.get(0);
    }
}
