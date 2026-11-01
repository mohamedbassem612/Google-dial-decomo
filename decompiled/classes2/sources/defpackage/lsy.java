package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes2.dex */
final class lsy extends gfj {
    public lsy(defpackage.ltb ltbVar) {
        j$.util.Objects.requireNonNull(ltbVar);
    }

    public final java.lang.String a() {
        return "INSERT OR ABORT INTO `contact_checker_call_log_data` (`caller_number`,`verification_state`) VALUES (?,?)";
    }

    public final /* bridge */ /* synthetic */ void b(gin ginVar, java.lang.Object obj) {
        defpackage.ltc ltcVar = (defpackage.ltc) obj;
        ginVar.j(1, ltcVar.a);
        ginVar.j(2, mni.bY(ltcVar.b));
    }
}
