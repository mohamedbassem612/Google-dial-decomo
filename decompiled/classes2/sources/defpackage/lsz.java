package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes2.dex */
final class lsz extends gfi {
    public lsz(defpackage.ltb ltbVar) {
        j$.util.Objects.requireNonNull(ltbVar);
    }

    protected final java.lang.String a() {
        return "DELETE FROM `contact_checker_call_log_data` WHERE `caller_number` = ?";
    }

    protected final /* bridge */ /* synthetic */ void b(gin ginVar, java.lang.Object obj) {
        ginVar.j(1, ((defpackage.ltc) obj).a);
    }
}
