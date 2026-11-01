package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes2.dex */
public final class fwl {
    public final izg a;

    public fwl(izg izgVar) {
        this.a = izgVar;
    }

    public final void a(java.lang.String str) {
        aooh.f(str, "key");
        izg izgVar = this.a;
        ((adw) izgVar.a).i(str);
        defpackage.eou eouVarV = izgVar.v();
        defpackage.eot eotVar = (defpackage.eot) eouVarV.a.a(str);
        if (eotVar != null) {
            eotVar.a();
            if (eotVar.c) {
                eouVarV.a(str);
            }
        }
    }

    public final java.lang.String toString() {
        return "NavControllerViewModel(provider=" + this.a + ')';
    }
}
