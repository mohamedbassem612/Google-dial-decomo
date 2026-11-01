package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes2.dex */
final class ltg extends gfi {
    public ltg(defpackage.lti ltiVar) {
        j$.util.Objects.requireNonNull(ltiVar);
    }

    protected final java.lang.String a() {
        return "DELETE FROM `contact_check_spoof_call_log_data` WHERE `call_creation_time_millis` = ?";
    }

    protected final /* bridge */ /* synthetic */ void b(gin ginVar, java.lang.Object obj) {
        ginVar.h(1, ((defpackage.lsv) obj).a);
    }
}
