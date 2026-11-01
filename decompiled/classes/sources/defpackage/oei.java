package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes.dex */
final class oei extends defpackage.gfi {
    public oei(defpackage.oej oejVar) {
        j$.util.Objects.requireNonNull(oejVar);
    }

    @Override // defpackage.gfi
    protected final java.lang.String a() {
        return "UPDATE OR ABORT `expresso_call_log_data` SET `call_creation_time_millis` = ?,`call_type` = ? WHERE `call_creation_time_millis` = ?";
    }

    @Override // defpackage.gfi
    protected final /* bridge */ /* synthetic */ void b(defpackage.gin ginVar, java.lang.Object obj) {
        defpackage.oel oelVar = (defpackage.oel) obj;
        long j = oelVar.a;
        ginVar.h(1, j);
        ginVar.j(2, defpackage.oej.k(oelVar.b));
        ginVar.h(3, j);
    }
}
