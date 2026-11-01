package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes.dex */
final class nxl extends defpackage.gfi {
    public nxl(defpackage.nxm nxmVar) {
        j$.util.Objects.requireNonNull(nxmVar);
    }

    @Override // defpackage.gfi
    protected final java.lang.String a() {
        return "UPDATE OR ABORT `meet_reachability_data` SET `normalized_phone_number` = ?,`meet_reachability` = ?,`last_queried` = ?,`revision` = ? WHERE `normalized_phone_number` = ?";
    }

    @Override // defpackage.gfi
    protected final /* bridge */ /* synthetic */ void b(defpackage.gin ginVar, java.lang.Object obj) {
        defpackage.nxp nxpVar = (defpackage.nxp) obj;
        java.lang.String str = nxpVar.a;
        ginVar.j(1, str);
        ginVar.j(2, defpackage.nxm.k(nxpVar.b));
        ginVar.h(3, nxpVar.c);
        ginVar.h(4, nxpVar.d);
        ginVar.j(5, str);
    }
}
