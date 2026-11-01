package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes3.dex */
public final class aeki implements ajcb {
    private final /* synthetic */ int $cid;
    final java.lang.Object a;

    public aeki(defpackage.aekj aekjVar, int i) {
        this.$cid = i;
        this.a = new java.lang.ref.WeakReference(aekjVar);
    }

    public final void a(java.lang.Throwable th) {
        if (this.$cid != 0) {
            throw new java.lang.IllegalStateException("Unable to mark coalesced row as out-of-date", th);
        }
        android.util.Log.e(defpackage.aekj.a, "ContinueWithAccountListener execution threw an exception", th);
    }

    public final /* synthetic */ void b(java.lang.Object obj) {
        if (this.$cid != 0) {
            ((defpackage.pgi) this.a).t();
            return;
        }
        java.lang.Boolean bool = (java.lang.Boolean) obj;
        defpackage.aekj aekjVar = (defpackage.aekj) ((java.lang.ref.WeakReference) this.a).get();
        if (aekjVar == null || bool.booleanValue()) {
            return;
        }
        aesg.i(new defpackage.absj(aekjVar, 16));
    }

    public aeki(defpackage.pgi pgiVar, int i) {
        this.$cid = i;
        this.a = pgiVar;
    }
}
