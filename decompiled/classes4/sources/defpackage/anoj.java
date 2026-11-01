package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes4.dex */
public final class anoj {
    public final java.util.List a;
    public final defpackage.anlw b;
    public final java.lang.Object c;

    public anoj(java.util.List list, defpackage.anlw anlwVar, java.lang.Object obj) {
        ahvr.cj(list, "addresses");
        this.a = j$.util.DesugarCollections.unmodifiableList(new java.util.ArrayList(list));
        ahvr.cj(anlwVar, "attributes");
        this.b = anlwVar;
        this.c = obj;
    }

    public final boolean equals(java.lang.Object obj) {
        if (!(obj instanceof defpackage.anoj)) {
            return false;
        }
        defpackage.anoj anojVar = (defpackage.anoj) obj;
        return j$.util.Objects.equals(this.a, anojVar.a) && j$.util.Objects.equals(this.b, anojVar.b) && j$.util.Objects.equals(this.c, anojVar.c);
    }

    public final int hashCode() {
        return j$.util.Objects.hash(new java.lang.Object[]{this.a, this.b, this.c});
    }

    public final java.lang.String toString() {
        ahym ahymVarL = ahvr.l(this);
        ahymVarL.b("addresses", this.a);
        ahymVarL.b("loadBalancingPolicyConfig", this.c);
        ahymVarL.b("attributes", this.b);
        return ahymVarL.toString();
    }
}
