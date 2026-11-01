package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes3.dex */
public final class ygn {
    public java.util.List a = null;

    public final void a(defpackage.ygn ygnVar) {
        java.util.List list = ygnVar.a;
        if (list != null) {
            if (this.a == null) {
                this.a = new java.util.ArrayList(list.size());
            }
            java.util.Iterator it = ygnVar.a.iterator();
            while (it.hasNext()) {
                this.a.add((defpackage.ygm) it.next());
            }
        }
    }

    public final java.lang.String toString() {
        if (this.a == null) {
            return "";
        }
        java.lang.StringBuilder sb = new java.lang.StringBuilder();
        java.util.Iterator it = this.a.iterator();
        while (it.hasNext()) {
            sb.append(((defpackage.ygm) it.next()).toString());
            sb.append('\n');
        }
        return sb.toString();
    }
}
