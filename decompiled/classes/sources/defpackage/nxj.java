package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes.dex */
final class nxj extends defpackage.gfj {
    public nxj(defpackage.nxm nxmVar) {
        j$.util.Objects.requireNonNull(nxmVar);
    }

    @Override // defpackage.gfj
    public final java.lang.String a() {
        return "INSERT OR ABORT INTO `meet_reachability_data` (`normalized_phone_number`,`meet_reachability`,`last_queried`,`revision`) VALUES (?,?,?,?)";
    }

    @Override // defpackage.gfj
    public final /* bridge */ /* synthetic */ void b(defpackage.gin ginVar, java.lang.Object obj) {
        defpackage.nxp nxpVar = (defpackage.nxp) obj;
        ginVar.j(1, nxpVar.a);
        ginVar.j(2, defpackage.nxm.k(nxpVar.b));
        ginVar.h(3, nxpVar.c);
        ginVar.h(4, nxpVar.d);
    }
}
