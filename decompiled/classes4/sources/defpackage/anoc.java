package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes4.dex */
public final class anoc {
    public final java.util.List a;
    public final defpackage.anlw b;
    public final java.lang.Object[][] c;

    public anoc(java.util.List list, defpackage.anlw anlwVar, java.lang.Object[][] objArr) {
        ahvr.cj(list, "addresses are not set");
        this.a = list;
        ahvr.cj(anlwVar, "attrs");
        this.b = anlwVar;
        ahvr.cj(objArr, "customOptions");
        this.c = objArr;
    }

    public final java.lang.String toString() {
        ahym ahymVarL = ahvr.l(this);
        ahymVarL.b("addrs", this.a);
        ahymVarL.b("attrs", this.b);
        ahymVarL.b("customOptions", java.util.Arrays.deepToString(this.c));
        return ahymVarL.toString();
    }
}
