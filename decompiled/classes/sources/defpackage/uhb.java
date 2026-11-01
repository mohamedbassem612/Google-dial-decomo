package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes.dex */
final class uhb extends defpackage.gfj {
    public uhb(defpackage.uhc uhcVar) {
        j$.util.Objects.requireNonNull(uhcVar);
    }

    @Override // defpackage.gfj
    public final java.lang.String a() {
        return "INSERT OR REPLACE INTO `moirai_data` (`client_role`,`protection_token`) VALUES (?,?)";
    }

    @Override // defpackage.gfj
    public final /* bridge */ /* synthetic */ void b(defpackage.gin ginVar, java.lang.Object obj) {
        uhd uhdVar = (uhd) obj;
        ginVar.j(1, uhdVar.a);
        defpackage.akzc akzcVar = uhdVar.b;
        defpackage.aooh.f(akzcVar, "value");
        ginVar.f(2, akzcVar.D());
    }
}
