package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes3.dex */
public final class agoi extends eoa {
    public defpackage.agoh a;
    public boolean b;
    public final boolean c;

    public agoi(enr enrVar) {
        aooh.f(enrVar, "savedStateHandle");
        defpackage.agoh agofVar = defpackage.agog.a;
        this.a = agofVar;
        afec.c();
        android.os.Bundle bundle = (android.os.Bundle) enrVar.a("tiktok_activity_account_state_saved_instance_state");
        if (bundle != null) {
            this.c = true;
            android.os.Bundle bundle2 = bundle.getBundle("state_account_state_bundle");
            if (bundle2 == null) {
                throw new java.lang.IllegalStateException("Failed to get the CurrentViewModel.State bundle from saved state");
            }
            int i = bundle2.getInt("state_account_state_type", 0);
            if (i != 0) {
                if (i == 1) {
                    agofVar = defpackage.agoe.a;
                } else if (i == 2) {
                    int i2 = bundle2.getInt("state_account_id", -1);
                    agoq agoqVarM = defpackage.akmr.m(bundle2, "state_account_info", agoq.a, akzq.a());
                    aooh.e(agoqVarM, "get(...)");
                    agofVar = new defpackage.agof(i2, agoqVarM);
                } else {
                    if (i != 3) {
                        throw new java.lang.IllegalStateException(a.bs(i, "unknown type value ", " during unparcelling"));
                    }
                    agofVar = defpackage.agod.a;
                }
            }
            this.a = agofVar;
            this.b = bundle.getBoolean("tiktok_accounts_disabled");
        } else {
            this.c = false;
        }
        enrVar.e("tiktok_activity_account_state_saved_instance_state", new defpackage.agol(this, 1));
    }
}
