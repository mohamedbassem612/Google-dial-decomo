package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes3.dex */
public final class agmz extends eoa {
    public defpackage.agne a;
    public boolean b;
    public boolean c;
    public final defpackage.agmy d;

    public agmz(enr enrVar, aoin aoinVar) {
        aooh.f(enrVar, "savedStateHandle");
        aooh.f(aoinVar, "disableForMigration");
        final boolean zBooleanValue = ((java.lang.Boolean) ((ahyn) ((amyw) aoinVar).b).d(java.lang.Boolean.FALSE)).booleanValue();
        defpackage.agmy agmyVar = new defpackage.agmy();
        this.d = agmyVar;
        android.os.Bundle bundle = (android.os.Bundle) enrVar.a("tiktok_account_controller_saved_instance_state");
        agmyVar.a = bundle;
        if (bundle != null) {
            this.c = true;
            albh albhVarP = defpackage.akmr.p(bundle, "state_latest_operation", defpackage.agne.a, akzq.a());
            aooh.e(albhVarP, "getTrusted(...)");
            b((defpackage.agne) albhVarP);
            this.b = bundle.getBoolean("state_pending_op");
        }
        enrVar.e("tiktok_account_controller_saved_instance_state", new gig() { // from class: agmx
            public final android.os.Bundle a() {
                android.os.Bundle bundle2 = new android.os.Bundle();
                defpackage.agmz agmzVar = this.a;
                bundle2.putBoolean("state_pending_op", agmzVar.b);
                defpackage.akmr.u(bundle2, "state_latest_operation", agmzVar.a());
                bundle2.putBoolean("tiktok_accounts_disabled", zBooleanValue);
                return bundle2;
            }
        });
    }

    public final defpackage.agne a() {
        defpackage.agne agneVar = this.a;
        if (agneVar != null) {
            return agneVar;
        }
        aooh.j("latestOperation");
        return null;
    }

    public final void b(defpackage.agne agneVar) {
        aooh.f(agneVar, "<set-?>");
        this.a = agneVar;
    }
}
