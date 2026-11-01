package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes.dex */
final class oeq extends defpackage.gfi {
    public oeq(defpackage.oer oerVar) {
        j$.util.Objects.requireNonNull(oerVar);
    }

    @Override // defpackage.gfi
    protected final java.lang.String a() {
        return "UPDATE OR ABORT `expresso_handshake_data` SET `caller_number` = ? WHERE `caller_number` = ?";
    }

    @Override // defpackage.gfi
    protected final /* bridge */ /* synthetic */ void b(defpackage.gin ginVar, java.lang.Object obj) {
        java.lang.String str = ((defpackage.oes) obj).a;
        ginVar.j(1, str);
        ginVar.j(2, str);
    }
}
