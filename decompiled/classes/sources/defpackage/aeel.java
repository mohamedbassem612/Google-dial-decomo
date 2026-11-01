package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes.dex */
public final class aeel implements defpackage.aeeh {
    public final defpackage.gfj a = new defpackage.aeej(this);
    public final defpackage.gfi b = new defpackage.aeek(this);
    private final defpackage.gfy c;

    public aeel(defpackage.gfy gfyVar) {
        this.c = gfyVar;
    }

    @Override // defpackage.aeeh
    public final java.lang.Object a(defpackage.aoln aolnVar) {
        return defpackage.dez.o(this.c, true, false, new defpackage.rou(13), aolnVar);
    }

    @Override // defpackage.aeeh
    public final java.lang.Object b(java.util.List list, defpackage.aoln aolnVar) {
        return defpackage.dez.o(this.c, false, true, new abdu(this, list, 12, (byte[]) null), aolnVar);
    }

    @Override // defpackage.aeeh
    public final java.lang.Object c(java.util.List list, defpackage.aoln aolnVar) {
        list.getClass();
        return defpackage.dez.o(this.c, false, true, new abdu(this, list, 11, (byte[]) null), aolnVar);
    }

    @Override // defpackage.aeeh
    public final java.lang.Object d(int i, java.lang.String str, defpackage.aoln aolnVar) {
        return defpackage.dez.o(this.c, false, true, new bxc(i, str, 7), aolnVar);
    }

    @Override // defpackage.aeeh
    public final java.lang.Object e(final int i, final java.lang.String str, defpackage.aoln aolnVar) {
        return defpackage.dez.o(this.c, true, false, new defpackage.aonj() { // from class: aeei
            /* JADX WARN: Multi-variable type inference failed */
            @Override // defpackage.aonj
            public final java.lang.Object a(java.lang.Object obj) {
                defpackage.gin ginVarA = ((defpackage.gjh) obj).a("SELECT * FROM gnp_accounts WHERE account_type = ? AND account_specific_id = ?");
                try {
                    ginVarA.h(1, i);
                    java.lang.String str2 = str;
                    if (str2 == null) {
                        ginVarA.i(2);
                    } else {
                        ginVarA.j(2, str2);
                    }
                    int iS = defpackage.dzk.S(ginVarA, "id");
                    int iS2 = defpackage.dzk.S(ginVarA, "account_specific_id");
                    int iS3 = defpackage.dzk.S(ginVarA, "account_type");
                    int iS4 = defpackage.dzk.S(ginVarA, "obfuscated_gaia_id");
                    int iS5 = defpackage.dzk.S(ginVarA, "actual_account_name");
                    int iS6 = defpackage.dzk.S(ginVarA, "actual_account_oid");
                    int iS7 = defpackage.dzk.S(ginVarA, "registration_status");
                    int iS8 = defpackage.dzk.S(ginVarA, "registration_id");
                    int iS9 = defpackage.dzk.S(ginVarA, "sync_sources");
                    int iS10 = defpackage.dzk.S(ginVarA, "representative_target_id");
                    int iS11 = defpackage.dzk.S(ginVarA, "sync_version");
                    int iS12 = defpackage.dzk.S(ginVarA, "last_registration_time_ms");
                    int iS13 = defpackage.dzk.S(ginVarA, "last_registration_request_hash");
                    int iS14 = defpackage.dzk.S(ginVarA, "first_registration_version");
                    int iS15 = defpackage.dzk.S(ginVarA, "internal_target_id");
                    int iS16 = defpackage.dzk.S(ginVarA, "fitbit_decoded_id");
                    java.lang.Object objD = null;
                    if (ginVarA.m()) {
                        objD = defpackage.aduy.d(ginVarA.c(iS), ginVarA.l(iS2) ? null : ginVarA.e(iS2), defpackage.agab.bH((int) ginVarA.c(iS3)), ginVarA.l(iS4) ? null : ginVarA.e(iS4), ginVarA.l(iS5) ? null : ginVarA.e(iS5), ginVarA.l(iS6) ? null : ginVarA.e(iS6), (int) ginVarA.c(iS7), ginVarA.l(iS8) ? null : ginVarA.e(iS8), defpackage.agab.bF(ginVarA.l(iS9) ? null : ginVarA.e(iS9)), ginVarA.l(iS10) ? null : ginVarA.e(iS10), ginVarA.c(iS11), ginVarA.c(iS12), (int) ginVarA.c(iS13), ginVarA.c(iS14), ginVarA.l(iS15) ? null : ginVarA.e(iS15), ginVarA.c(iS16));
                    }
                    return objD;
                } finally {
                    ginVarA.close();
                }
            }
        }, aolnVar);
    }
}
