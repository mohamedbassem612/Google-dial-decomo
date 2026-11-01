package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes.dex */
final class oeh extends defpackage.gfi {
    public oeh(defpackage.oej oejVar) {
        j$.util.Objects.requireNonNull(oejVar);
    }

    @Override // defpackage.gfi
    protected final java.lang.String a() {
        return "DELETE FROM `expresso_call_log_data` WHERE `call_creation_time_millis` = ?";
    }

    @Override // defpackage.gfi
    protected final /* bridge */ /* synthetic */ void b(defpackage.gin ginVar, java.lang.Object obj) {
        ginVar.h(1, ((defpackage.oel) obj).a);
    }
}
