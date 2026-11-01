package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes.dex */
class eao extends defpackage.ean {
    public eao(defpackage.eax eaxVar, android.view.WindowInsets windowInsets) {
        super(eaxVar, windowInsets);
    }

    @Override // defpackage.eau
    public dyo A() {
        android.view.DisplayCutout displayCutoutM = ft$.ExternalSyntheticApiModelOutline0.m(this.a);
        if (displayCutoutM == null) {
            return null;
        }
        return new dyo(displayCutoutM);
    }

    @Override // defpackage.eau
    public defpackage.eax B() {
        return defpackage.eax.q(ft$.ExternalSyntheticApiModelOutline0.m(this.a), null);
    }

    @Override // defpackage.eam, defpackage.eau
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof defpackage.eao) {
            defpackage.eao eaoVar = (defpackage.eao) obj;
            if (j$.util.Objects.equals(this.a, eaoVar.a) && j$.util.Objects.equals(this.b, eaoVar.b) && v(this.c, eaoVar.c)) {
                return true;
            }
        }
        return false;
    }

    @Override // defpackage.eau
    public int hashCode() {
        return this.a.hashCode();
    }

    public eao(defpackage.eax eaxVar, defpackage.eao eaoVar) {
        super(eaxVar, eaoVar);
    }
}
