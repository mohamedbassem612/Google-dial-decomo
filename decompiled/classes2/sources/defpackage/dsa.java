package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes2.dex */
final class dsa extends drt {
    public final void a(dsb dsbVar, dsb dsbVar2) {
        dsbVar.next = dsbVar2;
    }

    public final void b(dsb dsbVar, java.lang.Thread thread) {
        dsbVar.thread = thread;
    }

    public final boolean c(dsc dscVar, drx drxVar, drx drxVar2) {
        synchronized (dscVar) {
            if (dscVar.listeners != drxVar) {
                return false;
            }
            dscVar.listeners = drxVar2;
            return true;
        }
    }

    public final boolean d(dsc dscVar, java.lang.Object obj, java.lang.Object obj2) {
        synchronized (dscVar) {
            if (dscVar.value != obj) {
                return false;
            }
            dscVar.value = obj2;
            return true;
        }
    }

    public final boolean e(dsc dscVar, dsb dsbVar, dsb dsbVar2) {
        synchronized (dscVar) {
            if (dscVar.waiters != dsbVar) {
                return false;
            }
            dscVar.waiters = dsbVar2;
            return true;
        }
    }
}
