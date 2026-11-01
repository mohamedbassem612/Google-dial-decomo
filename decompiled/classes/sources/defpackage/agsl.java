package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes.dex */
public final class agsl implements defpackage.ajcb {
    private final /* synthetic */ int $cid;
    final /* synthetic */ java.lang.Object a;

    public agsl(defpackage.agpb agpbVar, int i) {
        this.$cid = i;
        j$.util.Objects.requireNonNull(agpbVar);
        this.a = agpbVar;
    }

    @Override // defpackage.ajcb
    public final void a(java.lang.Throwable th) {
        int i = this.$cid;
        if (i == 0) {
            if (th instanceof java.util.concurrent.TimeoutException) {
                ((defpackage.aimw) ((defpackage.aimw) ((defpackage.aimw) defpackage.agsm.a.d()).k(th)).l("com/google/apps/tiktok/concurrent/AndroidFutures$1", "onFailure", 213, "AndroidFutures.java")).y("exceeded timeout: %s", this.a);
            }
        } else if (i != 1) {
            defpackage.aooh.f(th, "e");
            android.util.Log.e("MendelPackageState", (java.lang.String) this.a, th);
        }
    }

    @Override // defpackage.ajcb
    public final void b(java.lang.Object obj) {
        if (this.$cid == 1) {
            java.util.Iterator it = ((java.util.Set) ((defpackage.agpb) this.a).b.a()).iterator();
            while (it.hasNext()) {
                java.lang.Object obj2 = ((defpackage.apnt) it.next()).a;
                defpackage.ajcq ajcqVarZ = defpackage.aiql.z(null);
                ((defpackage.aogc) obj2).s(ajcqVarZ, "com.google.apps.tiktok.account.data.AllAccounts");
                defpackage.agsm.i(1293, ajcqVarZ, "AvailableAccountsInvalidatedObserver failed", new java.lang.Object[0]);
            }
        }
    }

    public agsl(java.lang.String str, int i) {
        this.$cid = i;
        this.a = str;
    }

    public agsl(defpackage.agsm agsmVar, java.lang.String str, int i) {
        this.$cid = i;
        this.a = str;
        j$.util.Objects.requireNonNull(agsmVar);
    }
}
