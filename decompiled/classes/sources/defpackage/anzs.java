package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes.dex */
public final class anzs {
    public final aobt a;
    public final java.lang.Object b;
    public final java.util.Map c;
    private final anzq d;
    private final java.util.Map e;
    private final java.util.Map f;

    public anzs(anzq anzqVar, java.util.Map map, java.util.Map map2, aobt aobtVar, java.lang.Object obj, java.util.Map map3) {
        this.d = anzqVar;
        this.e = j$.util.DesugarCollections.unmodifiableMap(new java.util.HashMap(map));
        this.f = j$.util.DesugarCollections.unmodifiableMap(new java.util.HashMap(map2));
        this.a = aobtVar;
        this.b = obj;
        this.c = map3 != null ? j$.util.DesugarCollections.unmodifiableMap(new java.util.HashMap(map3)) : null;
    }

    final defpackage.annp a() {
        if (this.f.isEmpty() && this.e.isEmpty() && this.d == null) {
            return null;
        }
        return new anzr(this);
    }

    final anzq b(anpk anpkVar) {
        anzq anzqVar = (anzq) this.e.get(anpkVar.b);
        if (anzqVar == null) {
            anzqVar = (anzq) this.f.get(anpkVar.c);
        }
        return anzqVar == null ? this.d : anzqVar;
    }

    public final boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && getClass() == obj.getClass()) {
            defpackage.anzs anzsVar = (defpackage.anzs) obj;
            if (j$.util.Objects.equals(this.d, anzsVar.d) && j$.util.Objects.equals(this.e, anzsVar.e) && j$.util.Objects.equals(this.f, anzsVar.f) && j$.util.Objects.equals(this.a, anzsVar.a) && j$.util.Objects.equals(this.b, anzsVar.b)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return j$.util.Objects.hash(new java.lang.Object[]{this.d, this.e, this.f, this.a, this.b});
    }

    public final java.lang.String toString() {
        defpackage.ahym ahymVarL = defpackage.ahvr.l(this);
        ahymVarL.b("defaultMethodConfig", this.d);
        ahymVarL.b("serviceMethodMap", this.e);
        ahymVarL.b("serviceMap", this.f);
        ahymVarL.b("retryThrottling", this.a);
        ahymVarL.b("loadBalancingConfig", this.b);
        return ahymVarL.toString();
    }
}
