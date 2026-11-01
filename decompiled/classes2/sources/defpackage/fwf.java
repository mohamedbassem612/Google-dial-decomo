package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes2.dex */
public final class fwf extends defpackage.fwd {
    public final defpackage.fwo c;
    public final java.util.List d;
    private final java.lang.String e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public fwf(defpackage.fwo fwoVar) {
        super(fwoVar.a(defpackage.fwg.class), null);
        aooh.f(fwoVar, "provider");
        this.d = new java.util.ArrayList();
        this.c = fwoVar;
        this.e = "GooglePhotosHome";
    }

    public final defpackage.fwe c() {
        defpackage.fwe fweVar = (defpackage.fwe) super.a();
        defpackage.fxw fxwVar = fweVar.f;
        for (defpackage.fwc fwcVar : this.d) {
            if (fwcVar != null) {
                int iB = fwcVar.b();
                java.lang.String strF = fwcVar.f();
                if (iB == 0) {
                    if (strF == null) {
                        throw new java.lang.IllegalArgumentException("Destinations must have an id or route. Call setId(), setRoute(), or include an android:id or app:route in your navigation XML.");
                    }
                    iB = 0;
                }
                defpackage.fwe fweVar2 = fxwVar.a;
                if (fweVar2.f() != null && aooh.n(strF, fweVar2.f())) {
                    throw new java.lang.IllegalArgumentException(a.bi(fweVar2, fwcVar, "Destination ", " cannot have the same route as graph "));
                }
                if (iB == fweVar2.b()) {
                    throw new java.lang.IllegalArgumentException(a.bi(fweVar2, fwcVar, "Destination ", " cannot have the same id as graph "));
                }
                aed aedVar = fxwVar.b;
                defpackage.fwc fwcVar2 = (defpackage.fwc) defpackage.aee.a(aedVar, iB);
                if (fwcVar2 == fwcVar) {
                    continue;
                } else {
                    if (fwcVar.c != null) {
                        throw new java.lang.IllegalStateException("Destination already has a parent set. Call NavGraph.remove() to remove the previous parent.");
                    }
                    if (fwcVar2 != null) {
                        fwcVar2.c = null;
                    }
                    fwcVar.c = fweVar2;
                    aedVar.f(fwcVar.b(), fwcVar);
                }
            }
        }
        java.lang.String str = this.e;
        defpackage.fwe fweVar3 = fxwVar.a;
        if (aooh.n(str, fweVar3.f())) {
            throw new java.lang.IllegalArgumentException(a.bo(fweVar3, str, "Start destination ", " cannot use the same route as the graph "));
        }
        if (aoov.H(str)) {
            throw new java.lang.IllegalArgumentException("Cannot have an empty start destination route");
        }
        fxwVar.c = defpackage.hgt.X(str).hashCode();
        fxwVar.e = str;
        return fweVar;
    }
}
