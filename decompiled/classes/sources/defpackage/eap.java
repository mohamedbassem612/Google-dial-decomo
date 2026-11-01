package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes.dex */
class eap extends defpackage.eao {
    private defpackage.dwn g;
    private defpackage.dwn h;
    private defpackage.dwn k;

    public eap(defpackage.eax eaxVar, android.view.WindowInsets windowInsets) {
        super(eaxVar, windowInsets);
        this.g = null;
        this.h = null;
        this.k = null;
    }

    @Override // defpackage.eau
    public defpackage.dwn C() {
        defpackage.dwn dwnVar = this.h;
        if (dwnVar != null) {
            return dwnVar;
        }
        defpackage.dwn dwnVarE = defpackage.dwn.e(da$.ExternalSyntheticApiModelOutline0.m(this.a));
        this.h = dwnVarE;
        return dwnVarE;
    }

    @Override // defpackage.eau
    public defpackage.dwn D() {
        defpackage.dwn dwnVar = this.g;
        if (dwnVar != null) {
            return dwnVar;
        }
        android.graphics.Insets insetsM = fn$.ExternalSyntheticApiModelOutline0.m(this.a);
        defpackage.dwn dwnVarD = defpackage.dwn.d(da$.ExternalSyntheticApiModelOutline0.m$1(insetsM), da$.ExternalSyntheticApiModelOutline0.m$2(insetsM), da$.ExternalSyntheticApiModelOutline0.m$3(insetsM), da$.ExternalSyntheticApiModelOutline0.m(insetsM));
        this.g = dwnVarD;
        return dwnVarD;
    }

    @Override // defpackage.eau
    public defpackage.dwn E() {
        defpackage.dwn dwnVar = this.k;
        if (dwnVar != null) {
            return dwnVar;
        }
        defpackage.dwn dwnVarE = defpackage.dwn.e(fn$.ExternalSyntheticApiModelOutline0.m$1(this.a));
        this.k = dwnVarE;
        return dwnVarE;
    }

    @Override // defpackage.eam, defpackage.eau
    public defpackage.eax e(int i, int i2, int i3, int i4) {
        return defpackage.eax.q(fn$.ExternalSyntheticApiModelOutline0.m(this.a, i, i2, i3, i4), null);
    }

    public eap(defpackage.eax eaxVar, defpackage.eap eapVar) {
        super(eaxVar, eapVar);
        this.g = null;
        this.h = null;
        this.k = null;
    }
}
