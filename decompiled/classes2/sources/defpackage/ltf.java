package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes2.dex */
final class ltf extends gfj {
    public ltf(defpackage.lti ltiVar) {
        j$.util.Objects.requireNonNull(ltiVar);
    }

    public final java.lang.String a() {
        return "INSERT OR ABORT INTO `contact_check_spoof_call_log_data` (`call_creation_time_millis`,`caller_number`) VALUES (?,?)";
    }

    public final /* bridge */ /* synthetic */ void b(gin ginVar, java.lang.Object obj) {
        defpackage.lsv lsvVar = (defpackage.lsv) obj;
        ginVar.h(1, lsvVar.a);
        ginVar.j(2, lsvVar.b);
    }
}
