package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes.dex */
public final class eoh {
    public final java.util.Map a = new java.util.LinkedHashMap();

    public final void a() {
        java.util.Map map = this.a;
        java.util.Map mapAS = defpackage.ajsz.aS(map);
        map.clear();
        java.util.Iterator it = mapAS.values().iterator();
        while (it.hasNext()) {
            ((defpackage.eoa) it.next()).g();
        }
    }

    public final java.lang.String toString() {
        defpackage.aopu[] aopuVarArr = defpackage.aoou.a;
        java.lang.String strC = new defpackage.aooa(getClass()).c();
        if (strC == null) {
            strC = "ViewModelStore";
        }
        java.lang.String string = java.lang.Integer.toString(hashCode(), 16);
        defpackage.aooh.e(string, "toString(...)");
        return strC + '@' + string + "(keys=" + defpackage.ajsz.cf(this.a.keySet()) + ')';
    }
}
