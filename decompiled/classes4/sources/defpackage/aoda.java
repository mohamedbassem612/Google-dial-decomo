package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes4.dex */
public final class aoda {
    public final java.lang.String a;
    public final java.util.Map b;

    public aoda(java.lang.String str, java.util.Map map) {
        ahvr.cj(str, "policyName");
        this.a = str;
        ahvr.cj(map, "rawConfigValue");
        this.b = map;
    }

    public final boolean equals(java.lang.Object obj) {
        if (!(obj instanceof defpackage.aoda)) {
            return false;
        }
        defpackage.aoda aodaVar = (defpackage.aoda) obj;
        return this.a.equals(aodaVar.a) && this.b.equals(aodaVar.b);
    }

    public final int hashCode() {
        return j$.util.Objects.hash(new java.lang.Object[]{this.a, this.b});
    }

    public final java.lang.String toString() {
        ahym ahymVarL = ahvr.l(this);
        ahymVarL.b("policyName", this.a);
        ahymVarL.b("rawConfigValue", this.b);
        return ahymVarL.toString();
    }
}
