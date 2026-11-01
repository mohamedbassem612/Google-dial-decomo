package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes.dex */
public final class ansx extends defpackage.anpw {
    private static android.content.Intent g(java.lang.String str) {
        try {
            return android.content.Intent.parseUri(str, 1);
        } catch (java.net.URISyntaxException e) {
            throw new java.lang.IllegalArgumentException(e);
        }
    }

    @Override // defpackage.anps
    public final defpackage.anpv a(defpackage.anrg anrgVar, defpackage.anpq anpqVar) {
        if (j$.util.Objects.equals(anrgVar.k, "intent")) {
            return new answ(g(anrgVar.toString()), anpqVar);
        }
        return null;
    }

    @Override // defpackage.anps
    public final defpackage.anpv b(java.net.URI uri, defpackage.anpq anpqVar) {
        if (j$.util.Objects.equals(uri.getScheme(), "intent")) {
            return new answ(g(uri.toString()), anpqVar);
        }
        return null;
    }

    @Override // defpackage.anps
    public final java.lang.String c() {
        return "intent";
    }

    @Override // defpackage.anpw
    public final int d() {
        return 3;
    }

    @Override // defpackage.anpw
    public final /* synthetic */ java.util.Collection e() {
        return new defpackage.aile(defpackage.anrk.class);
    }

    @Override // defpackage.anpw
    public final void f() {
    }
}
