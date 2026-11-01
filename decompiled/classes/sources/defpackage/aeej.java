package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes.dex */
final class aeej extends defpackage.gfj {
    public aeej(defpackage.aeel aeelVar) {
        j$.util.Objects.requireNonNull(aeelVar);
    }

    @Override // defpackage.gfj
    public final java.lang.String a() {
        return "INSERT OR ABORT INTO `gnp_accounts` (`id`,`account_specific_id`,`account_type`,`obfuscated_gaia_id`,`actual_account_name`,`actual_account_oid`,`registration_status`,`registration_id`,`sync_sources`,`representative_target_id`,`sync_version`,`last_registration_time_ms`,`last_registration_request_hash`,`first_registration_version`,`internal_target_id`,`fitbit_decoded_id`) VALUES (nullif(?, 0),?,?,?,?,?,?,?,?,?,?,?,?,?,?,?)";
    }

    @Override // defpackage.gfj
    public final /* synthetic */ void b(defpackage.gin ginVar, java.lang.Object obj) {
        defpackage.aduy aduyVar = (defpackage.aduy) obj;
        ginVar.h(1, aduyVar.a);
        java.lang.String str = aduyVar.b;
        if (str == null) {
            ginVar.i(2);
        } else {
            ginVar.j(2, str);
        }
        ginVar.h(3, defpackage.agab.bI(aduyVar.p));
        java.lang.String str2 = aduyVar.c;
        if (str2 == null) {
            ginVar.i(4);
        } else {
            ginVar.j(4, str2);
        }
        java.lang.String str3 = aduyVar.d;
        if (str3 == null) {
            ginVar.i(5);
        } else {
            ginVar.j(5, str3);
        }
        java.lang.String str4 = aduyVar.e;
        if (str4 == null) {
            ginVar.i(6);
        } else {
            ginVar.j(6, str4);
        }
        ginVar.h(7, aduyVar.f);
        java.lang.String str5 = aduyVar.g;
        if (str5 == null) {
            ginVar.i(8);
        } else {
            ginVar.j(8, str5);
        }
        ginVar.j(9, defpackage.agab.bG(aduyVar.h));
        java.lang.String str6 = aduyVar.i;
        if (str6 == null) {
            ginVar.i(10);
        } else {
            ginVar.j(10, str6);
        }
        ginVar.h(11, aduyVar.j);
        ginVar.h(12, aduyVar.k);
        ginVar.h(13, aduyVar.l);
        ginVar.h(14, aduyVar.m);
        java.lang.String str7 = aduyVar.n;
        if (str7 == null) {
            ginVar.i(15);
        } else {
            ginVar.j(15, str7);
        }
        ginVar.h(16, aduyVar.o);
    }
}
