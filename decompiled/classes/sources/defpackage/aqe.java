package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes.dex */
public final class aqe {
    public final defpackage.aomy a;
    public final defpackage.aosb b;

    public aqe(defpackage.aomy aomyVar, defpackage.aosb aosbVar) {
        this.a = aomyVar;
        this.b = aosbVar;
    }

    public final java.lang.String toString() {
        java.lang.String str;
        defpackage.aosb aosbVar = this.b;
        defpackage.aosr aosrVar = (defpackage.aosr) ((defpackage.aosc) aosbVar).b.get(defpackage.aosr.b);
        java.lang.String str2 = aosrVar != null ? aosrVar.a : null;
        java.lang.String string = java.lang.Integer.toString(hashCode(), 16);
        defpackage.aooh.e(string, "toString(...)");
        if (str2 != null) {
            str = "[" + str2 + "](";
        } else {
            str = "(";
        }
        return "Request@" + string + str + "currentBounds()=" + this.a.a() + ", continuation=" + aosbVar + ')';
    }
}
