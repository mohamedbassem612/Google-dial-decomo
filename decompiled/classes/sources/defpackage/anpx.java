package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes.dex */
final class anpx extends defpackage.anps {
    final /* synthetic */ defpackage.anpy a;

    public anpx(defpackage.anpy anpyVar) {
        j$.util.Objects.requireNonNull(anpyVar);
        this.a = anpyVar;
    }

    @Override // defpackage.anps
    public final defpackage.anpv b(java.net.URI uri, defpackage.anpq anpqVar) {
        defpackage.anpw anpwVarA = this.a.a(uri.getScheme());
        if (anpwVarA == null) {
            return null;
        }
        return anpwVarA.b(uri, anpqVar);
    }

    @Override // defpackage.anps
    public final java.lang.String c() {
        throw null;
    }
}
