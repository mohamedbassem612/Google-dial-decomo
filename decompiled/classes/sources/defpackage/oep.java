package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes.dex */
final class oep extends defpackage.gfi {
    public oep(defpackage.oer oerVar) {
        j$.util.Objects.requireNonNull(oerVar);
    }

    @Override // defpackage.gfi
    protected final java.lang.String a() {
        return "DELETE FROM `expresso_handshake_data` WHERE `caller_number` = ?";
    }

    @Override // defpackage.gfi
    protected final /* bridge */ /* synthetic */ void b(defpackage.gin ginVar, java.lang.Object obj) {
        ginVar.j(1, ((defpackage.oes) obj).a);
    }
}
