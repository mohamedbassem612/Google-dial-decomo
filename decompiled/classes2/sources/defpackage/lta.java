package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes2.dex */
final class lta extends gfi {
    public lta(defpackage.ltb ltbVar) {
        j$.util.Objects.requireNonNull(ltbVar);
    }

    protected final java.lang.String a() {
        return "UPDATE OR ABORT `contact_checker_call_log_data` SET `caller_number` = ?,`verification_state` = ? WHERE `caller_number` = ?";
    }

    protected final /* bridge */ /* synthetic */ void b(gin ginVar, java.lang.Object obj) {
        defpackage.ltc ltcVar = (defpackage.ltc) obj;
        java.lang.String str = ltcVar.a;
        ginVar.j(1, str);
        ginVar.j(2, mni.bY(ltcVar.b));
        ginVar.j(3, str);
    }
}
