package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes.dex */
public final class cjs implements defpackage.cdv {
    public defpackage.ckb a;
    public defpackage.cjx b;
    public java.lang.String c;
    public java.lang.Object d;
    public java.lang.Object[] e;
    public defpackage.adkz f;
    private final defpackage.aomy g = new defpackage.bpa(this, 4);

    public cjs(defpackage.ckb ckbVar, defpackage.cjx cjxVar, java.lang.String str, java.lang.Object obj, java.lang.Object[] objArr) {
        this.a = ckbVar;
        this.b = cjxVar;
        this.c = str;
        this.d = obj;
        this.e = objArr;
    }

    public final void a() {
        java.lang.String strO;
        defpackage.cjx cjxVar = this.b;
        defpackage.adkz adkzVar = this.f;
        if (adkzVar != null) {
            throw new java.lang.IllegalArgumentException(defpackage.a.bg(adkzVar, "entry(", ") is not null"));
        }
        if (cjxVar != null) {
            defpackage.aomy aomyVar = this.g;
            java.lang.Object objA = aomyVar.a();
            if (objA == null || cjxVar.e(objA)) {
                this.f = cjxVar.f(this.c, aomyVar);
                return;
            }
            if (objA instanceof defpackage.clb) {
                defpackage.clb clbVar = (defpackage.clb) objA;
                if (clbVar.f() == defpackage.cdu.b || clbVar.f() == defpackage.cdu.c || clbVar.f() == defpackage.cdu.a) {
                    strO = "MutableState containing " + clbVar.a() + " cannot be saved using the current SaveableStateRegistry. The default implementation only supports types which can be stored inside the Bundle. Please consider implementing a custom Saver for this class and pass it as a stateSaver parameter to rememberSaveable().";
                } else {
                    strO = "If you use a custom SnapshotMutationPolicy for your MutableState you have to write a custom Saver";
                }
            } else {
                strO = defpackage.cfd.o(objA);
            }
            throw new java.lang.IllegalArgumentException(strO);
        }
    }

    @Override // defpackage.cdv
    public final void h() {
        defpackage.adkz adkzVar = this.f;
        if (adkzVar != null) {
            adkzVar.b();
        }
    }

    @Override // defpackage.cdv
    public final void i() {
        defpackage.adkz adkzVar = this.f;
        if (adkzVar != null) {
            adkzVar.b();
        }
    }

    @Override // defpackage.cdv
    public final void j() {
        a();
    }
}
