package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes.dex */
final class ucx extends defpackage.gfj {
    public ucx(defpackage.ucy ucyVar) {
        j$.util.Objects.requireNonNull(ucyVar);
    }

    @Override // defpackage.gfj
    public final java.lang.String a() {
        return "INSERT OR ABORT INTO `SpamCall` (`id`,`persistableSpamStatus`) VALUES (?,?)";
    }

    @Override // defpackage.gfj
    public final /* bridge */ /* synthetic */ void b(defpackage.gin ginVar, java.lang.Object obj) {
        taq taqVar = (taq) obj;
        ginVar.j(1, (java.lang.String) taqVar.b);
        ginVar.f(2, ((defpackage.akym) taqVar.a).i());
    }
}
