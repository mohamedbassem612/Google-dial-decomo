package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes.dex */
final class nxk extends defpackage.gfi {
    public nxk(defpackage.nxm nxmVar) {
        j$.util.Objects.requireNonNull(nxmVar);
    }

    @Override // defpackage.gfi
    protected final java.lang.String a() {
        return "DELETE FROM `meet_reachability_data` WHERE `normalized_phone_number` = ?";
    }

    @Override // defpackage.gfi
    protected final /* bridge */ /* synthetic */ void b(defpackage.gin ginVar, java.lang.Object obj) {
        ginVar.j(1, ((defpackage.nxp) obj).a);
    }
}
