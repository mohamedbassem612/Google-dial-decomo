package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes.dex */
final class oeg extends defpackage.gfj {
    public oeg(defpackage.oej oejVar) {
        j$.util.Objects.requireNonNull(oejVar);
    }

    @Override // defpackage.gfj
    public final java.lang.String a() {
        return "INSERT OR ABORT INTO `expresso_call_log_data` (`call_creation_time_millis`,`call_type`) VALUES (?,?)";
    }

    @Override // defpackage.gfj
    public final /* bridge */ /* synthetic */ void b(defpackage.gin ginVar, java.lang.Object obj) {
        defpackage.oel oelVar = (defpackage.oel) obj;
        ginVar.h(1, oelVar.a);
        ginVar.j(2, defpackage.oej.k(oelVar.b));
    }
}
