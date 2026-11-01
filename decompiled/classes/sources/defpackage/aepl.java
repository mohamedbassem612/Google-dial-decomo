package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes.dex */
final class aepl extends defpackage.aeph {
    public final java.util.List b = new java.util.concurrent.CopyOnWriteArrayList();

    @Override // defpackage.aeph
    public final void g(defpackage.aenj aenjVar) {
        java.util.Iterator it = this.b.iterator();
        while (it.hasNext()) {
            ((defpackage.aepj) it.next()).g(aenjVar);
        }
    }

    @Override // defpackage.aeph
    public final void j(defpackage.aenj aenjVar) {
        java.util.Iterator it = this.b.iterator();
        while (it.hasNext()) {
            ((defpackage.aepj) it.next()).j(aenjVar);
        }
    }
}
