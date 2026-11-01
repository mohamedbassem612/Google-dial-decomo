package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes4.dex */
final class aocc extends defpackage.aoca {
    @Override // defpackage.aoca
    public final boolean a(defpackage.aocd aocdVar) {
        synchronized (aocdVar) {
            if (aocdVar.a != 0) {
                return false;
            }
            aocdVar.a = -1;
            return true;
        }
    }

    @Override // defpackage.aoca
    public final void b(defpackage.aocd aocdVar) {
        synchronized (aocdVar) {
            aocdVar.a = 0;
        }
    }
}
