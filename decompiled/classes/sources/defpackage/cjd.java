package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes.dex */
public final class cjd extends defpackage.cie implements j$.util.Map, defpackage.chn {
    private defpackage.cje f;

    public cjd(defpackage.cje cjeVar) {
        super(cjeVar);
        this.f = cjeVar;
    }

    @Override // defpackage.cie, java.util.AbstractMap, java.util.Map
    public final boolean containsKey(java.lang.Object obj) {
        if (obj instanceof defpackage.cbd) {
            return super.containsKey((defpackage.cbd) obj);
        }
        return false;
    }

    @Override // java.util.AbstractMap, java.util.Map
    public final boolean containsValue(java.lang.Object obj) {
        if (obj instanceof defpackage.cew) {
            return super.containsValue((defpackage.cew) obj);
        }
        return false;
    }

    @Override // defpackage.cie, java.util.AbstractMap, java.util.Map
    public final /* bridge */ /* synthetic */ java.lang.Object get(java.lang.Object obj) {
        if (obj instanceof defpackage.cbd) {
            return (defpackage.cew) super.get((defpackage.cbd) obj);
        }
        return null;
    }

    @Override // defpackage.cie, java.util.Map
    public final /* bridge */ /* synthetic */ java.lang.Object getOrDefault(java.lang.Object obj, java.lang.Object obj2) {
        return obj instanceof defpackage.cbd ? (defpackage.cew) j$.util.Map.-CC.$default$getOrDefault(this, (defpackage.cbd) obj, (defpackage.cew) obj2) : obj2;
    }

    @Override // defpackage.cie
    /* JADX INFO: renamed from: h, reason: merged with bridge method [inline-methods] */
    public final defpackage.cje a() {
        defpackage.cil cilVar = this.a;
        defpackage.cje cjeVar = this.f;
        if (cilVar != cjeVar.b) {
            this.e = new defpackage.cfd();
            cjeVar = new defpackage.cje(cilVar, this.d);
        }
        this.f = cjeVar;
        return cjeVar;
    }

    @Override // defpackage.cie, java.util.AbstractMap, java.util.Map
    public final /* bridge */ /* synthetic */ java.lang.Object remove(java.lang.Object obj) {
        if (obj instanceof defpackage.cbd) {
            return (defpackage.cew) super.remove((defpackage.cbd) obj);
        }
        return null;
    }
}
