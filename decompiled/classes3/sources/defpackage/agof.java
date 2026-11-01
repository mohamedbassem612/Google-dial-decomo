package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes3.dex */
public final class agof extends defpackage.agoh {
    public final int a;
    public final agoq b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public agof(int i, agoq agoqVar) {
        super(3);
        aooh.f(agoqVar, "accountInfo");
        this.a = i;
        this.b = agoqVar;
        if (i == -1) {
            throw new java.lang.IllegalStateException("Check failed.");
        }
        if (aooh.n(agoqVar, agoq.a)) {
            throw new java.lang.IllegalStateException("Check failed.");
        }
    }

    @Override // defpackage.agoh
    public final android.os.Bundle a() {
        android.os.Bundle bundleB = b();
        bundleB.putInt("state_account_id", this.a);
        defpackage.akmr.u(bundleB, "state_account_info", this.b);
        return bundleB;
    }

    public final boolean equals(java.lang.Object obj) {
        return obj != null && (obj instanceof defpackage.agof) && ((defpackage.agof) obj).a == this.a;
    }
}
