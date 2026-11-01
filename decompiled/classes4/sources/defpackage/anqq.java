package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes4.dex */
public final class anqq {
    public final java.lang.String a;
    public final java.util.Collection b;

    /* JADX WARN: Type inference failed for: r1v0, types: [java.lang.Object, java.util.Collection] */
    /* JADX WARN: Type inference failed for: r8v1, types: [java.lang.Object, java.util.Collection] */
    public anqq(defpackage.apjb apjbVar) {
        java.lang.String str = (java.lang.String) apjbVar.a;
        this.a = str;
        ?? r1 = apjbVar.b;
        java.util.HashSet hashSet = new java.util.HashSet(r1.size());
        for (defpackage.anpk anpkVar : r1) {
            ahvr.cj(anpkVar, "method");
            java.lang.String str2 = anpkVar.c;
            ahvr.bW(str.equals(str2), "service names %s != %s", str2, str);
            ahvr.bR(hashSet.add(anpkVar.b), "duplicate name %s", anpkVar.b);
        }
        this.b = j$.util.DesugarCollections.unmodifiableList(new java.util.ArrayList((java.util.Collection) apjbVar.b));
    }

    public final java.lang.String toString() {
        ahym ahymVarL = ahvr.l(this);
        ahymVarL.b("name", this.a);
        ahymVarL.b("schemaDescriptor", (java.lang.Object) null);
        ahymVarL.b("methods", this.b);
        ahymVarL.c();
        return ahymVarL.toString();
    }
}
