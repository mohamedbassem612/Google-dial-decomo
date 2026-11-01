package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes.dex */
public final class cje extends defpackage.cic implements j$.util.Map, defpackage.cho {
    public static final defpackage.cje d = new defpackage.cje(defpackage.cil.a, 0);

    @Override // defpackage.cic, defpackage.cho
    public final /* synthetic */ defpackage.chn a() {
        return new defpackage.cjd(this);
    }

    @Override // defpackage.cic, defpackage.aojp, java.util.Map
    public final boolean containsKey(java.lang.Object obj) {
        if (obj instanceof defpackage.cbd) {
            return super.containsKey((defpackage.cbd) obj);
        }
        return false;
    }

    @Override // defpackage.aojp, java.util.Map
    public final boolean containsValue(java.lang.Object obj) {
        if (obj instanceof defpackage.cew) {
            return super.containsValue((defpackage.cew) obj);
        }
        return false;
    }

    @Override // defpackage.cic
    /* JADX INFO: renamed from: d */
    public final /* synthetic */ defpackage.cie a() {
        return new defpackage.cjd(this);
    }

    @Override // defpackage.cic, defpackage.aojp, java.util.Map
    public final /* bridge */ /* synthetic */ java.lang.Object get(java.lang.Object obj) {
        if (obj instanceof defpackage.cbd) {
            return (defpackage.cew) super.get((defpackage.cbd) obj);
        }
        return null;
    }

    @Override // defpackage.aojp, java.util.Map
    public final /* bridge */ /* synthetic */ java.lang.Object getOrDefault(java.lang.Object obj, java.lang.Object obj2) {
        return obj instanceof defpackage.cbd ? (defpackage.cew) j$.util.Map.-CC.$default$getOrDefault(this, (defpackage.cbd) obj, (defpackage.cew) obj2) : obj2;
    }

    public final java.lang.Object h(defpackage.cbd cbdVar) {
        return defpackage.den.aa(this, cbdVar);
    }

    public final defpackage.cje i(defpackage.cbd cbdVar, defpackage.cew cewVar) {
        defpackage.cik cikVarD = this.b.d(cbdVar.hashCode(), cbdVar, cewVar, 0);
        if (cikVarD == null) {
            return this;
        }
        return new defpackage.cje(cikVarD.a, this.c + cikVarD.b);
    }
}
