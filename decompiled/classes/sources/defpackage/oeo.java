package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes.dex */
final class oeo extends defpackage.gfj {
    public oeo(defpackage.oer oerVar) {
        j$.util.Objects.requireNonNull(oerVar);
    }

    @Override // defpackage.gfj
    public final java.lang.String a() {
        return "INSERT OR ABORT INTO `expresso_handshake_data` (`caller_number`) VALUES (?)";
    }

    @Override // defpackage.gfj
    public final /* bridge */ /* synthetic */ void b(defpackage.gin ginVar, java.lang.Object obj) {
        ginVar.j(1, ((defpackage.oes) obj).a);
    }
}
