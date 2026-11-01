package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes.dex */
public final class cka implements defpackage.cjx, defpackage.gii {
    public defpackage.kaw a;
    private final /* synthetic */ defpackage.cjx b;
    private defpackage.emy c;

    public cka(defpackage.cjx cjxVar) {
        this.b = cjxVar;
        java.lang.Object objA = a("androidx.savedstate.SavedStateRegistry");
        android.os.Bundle bundle = objA instanceof android.os.Bundle ? (android.os.Bundle) objA : null;
        if (bundle != null) {
            c(bundle);
        }
        f("androidx.savedstate.SavedStateRegistry", new defpackage.bpa(this, 5));
    }

    private final defpackage.kaw c(android.os.Bundle bundle) {
        defpackage.kaw kawVar = this.a;
        if (kawVar != null) {
            return kawVar;
        }
        defpackage.kaw kawVarU = defpackage.dzk.U(this);
        this.a = kawVarU;
        kawVarU.ae(bundle);
        return kawVarU;
    }

    @Override // defpackage.emx
    public final /* synthetic */ defpackage.ems P() {
        defpackage.emy emyVar = this.c;
        if (emyVar != null) {
            return emyVar;
        }
        defpackage.emy emyVar2 = new defpackage.emy(this, false);
        this.c = emyVar2;
        return emyVar2;
    }

    @Override // defpackage.cjx
    public final java.lang.Object a(java.lang.String str) {
        return this.b.a(str);
    }

    @Override // defpackage.gii
    public final defpackage.aaha aT() {
        return c(null).ap();
    }

    @Override // defpackage.cjx
    public final java.util.Map b() {
        return this.b.b();
    }

    @Override // defpackage.cjx
    public final boolean e(java.lang.Object obj) {
        return this.b.e(obj);
    }

    @Override // defpackage.cjx
    public final defpackage.adkz f(java.lang.String str, defpackage.aomy aomyVar) {
        return this.b.f(str, aomyVar);
    }
}
