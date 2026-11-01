package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes.dex */
public class adql implements defpackage.adqq {
    protected final defpackage.adqj a;

    public adql(defpackage.adqj adqjVar) {
        this.a = adqjVar;
    }

    @Override // defpackage.adqq
    public final defpackage.ajcq b(defpackage.aihd aihdVar) {
        java.util.Set set = (java.util.Set) j$.util.Collection.-EL.stream(aihdVar).filter(new abdh(this, 8)).collect(j$.util.stream.Collectors.toSet());
        return set.isEmpty() ? defpackage.aiql.z(null) : defpackage.aiql.y(new defpackage.adnt(set));
    }

    @Override // defpackage.adqq
    public j$.util.Optional c(defpackage.adnv adnvVar) {
        java.io.File fileA = this.a.a(adnvVar.a, adnvVar.b);
        return fileA.isFile() ? j$.util.Optional.of(fileA) : j$.util.Optional.empty();
    }

    @Override // defpackage.adqq
    public final boolean e(defpackage.adnv adnvVar) {
        return c(adnvVar).isPresent();
    }
}
