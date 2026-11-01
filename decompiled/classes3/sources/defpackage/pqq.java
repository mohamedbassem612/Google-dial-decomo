package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes3.dex */
public final class pqq implements znb {
    public final java.util.concurrent.atomic.AtomicReference a = new java.util.concurrent.atomic.AtomicReference(defpackage.zmz.a);
    private final defpackage.pub b;

    public pqq(defpackage.pub pubVar) {
        this.b = pubVar;
    }

    public final void a(java.lang.String str, android.os.Bundle bundle) {
        int iHashCode = str.hashCode();
        if (iHashCode == -1863773007) {
            if (str.equals("android.telecom.event.MERGE_START")) {
                this.a.set(defpackage.zmz.b);
                defpackage.pub pubVar = this.b;
                ((defpackage.ptw) pubVar.b).a(new defpackage.ptm(11));
                return;
            }
            return;
        }
        if (iHashCode == -240628118) {
            if (str.equals("android.telecom.event.MERGE_COMPLETE")) {
                this.a.set(defpackage.zmz.c);
                defpackage.pub pubVar2 = this.b;
                ((defpackage.ptw) pubVar2.g).a(new defpackage.ptm(7));
                return;
            }
            return;
        }
        if (iHashCode == 1161109851 && str.equals("android.telecom.event.CALL_MERGE_FAILED")) {
            this.a.set(defpackage.zmz.a);
            defpackage.pub pubVar3 = this.b;
            ((defpackage.ptw) pubVar3.c).a(new defpackage.ptm(6));
        }
    }
}
