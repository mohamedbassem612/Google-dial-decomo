package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes2.dex */
final class lth extends gfi {
    public lth(defpackage.lti ltiVar) {
        j$.util.Objects.requireNonNull(ltiVar);
    }

    protected final java.lang.String a() {
        return "UPDATE OR ABORT `contact_check_spoof_call_log_data` SET `call_creation_time_millis` = ?,`caller_number` = ? WHERE `call_creation_time_millis` = ?";
    }

    protected final /* bridge */ /* synthetic */ void b(gin ginVar, java.lang.Object obj) {
        defpackage.lsv lsvVar = (defpackage.lsv) obj;
        long j = lsvVar.a;
        ginVar.h(1, j);
        ginVar.j(2, lsvVar.b);
        ginVar.h(3, j);
    }
}
