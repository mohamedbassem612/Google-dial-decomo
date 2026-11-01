package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes.dex */
public final class daq {
    private final defpackage.dde a = new defpackage.dde(defpackage.dar.a);

    public final defpackage.dbk a() {
        defpackage.dbk dbkVar = (defpackage.dbk) this.a.first();
        e(dbkVar);
        return dbkVar;
    }

    public final void b(defpackage.dbk dbkVar) {
        if (!dbkVar.al()) {
            defpackage.cwh.d("DepthSortedSet.add called on an unattached node");
        }
        this.a.add(dbkVar);
    }

    public final boolean c(defpackage.dbk dbkVar) {
        return this.a.contains(dbkVar);
    }

    public final boolean d() {
        return this.a.isEmpty();
    }

    public final void e(defpackage.dbk dbkVar) {
        if (!dbkVar.al()) {
            defpackage.cwh.d("DepthSortedSet.remove called on an unattached node");
        }
        this.a.remove(dbkVar);
    }

    public final java.lang.String toString() {
        return this.a.toString();
    }
}
