package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes3.dex */
public class vij extends defpackage.vih {
    public static final defpackage.vij b = new defpackage.vii();
    private final java.util.ArrayList c = new java.util.ArrayList();

    @Override // defpackage.vih
    public final void c(defpackage.vhg vhgVar, defpackage.vin vinVar) {
        vhgVar.c("(");
        int i = 0;
        while (true) {
            java.util.ArrayList arrayList = this.c;
            if (i >= arrayList.size()) {
                vhgVar.c(")");
                return;
            }
            ((defpackage.vih) arrayList.get(i)).c(vhgVar, vinVar);
            if (i != arrayList.size() - 1) {
                vhgVar.c(" ");
            }
            i++;
        }
    }

    public void d(defpackage.vih vihVar) {
        if (vihVar == null) {
            throw new defpackage.ahzr("Can't add null");
        }
        this.c.add(vihVar);
    }

    public final int e() {
        return this.c.size();
    }

    public final defpackage.vih f(int i) {
        java.util.ArrayList arrayList = this.c;
        return i >= arrayList.size() ? defpackage.vih.a : (defpackage.vih) arrayList.get(i);
    }

    final defpackage.vih g(java.lang.String str, boolean z) {
        for (int i = 1; i < e(); i += 2) {
            if (k(i - 1, str, z)) {
                return (defpackage.vih) this.c.get(i);
            }
        }
        return null;
    }

    public final defpackage.vij h(int i) {
        defpackage.vih vihVarF = f(i);
        return vihVarF.s() ? (defpackage.vij) vihVarF : b;
    }

    public final defpackage.viq i(java.lang.String str, boolean z) {
        defpackage.vih vihVarG = g(str, z);
        return vihVarG != null ? (defpackage.viq) vihVarG : defpackage.viq.c;
    }

    public final defpackage.viq j(int i) {
        defpackage.vih vihVarF = f(i);
        return vihVarF.t() ? (defpackage.viq) vihVarF : defpackage.viq.c;
    }

    public final boolean k(int i, java.lang.String str, boolean z) {
        if (!z) {
            return j(i).e(str);
        }
        java.lang.String strB = j(i).b();
        if (strB.length() < str.length()) {
            return false;
        }
        return ahvr.r(strB.substring(0, str.length()), str);
    }

    public final boolean l() {
        return e() == 0;
    }

    public final defpackage.vij m(java.lang.String str) {
        defpackage.vih vihVarG = g(str, false);
        return vihVarG != null ? (defpackage.vij) vihVarG : b;
    }

    @Override // defpackage.vih
    public final boolean s() {
        return true;
    }

    @Override // defpackage.vih
    public final boolean t() {
        return false;
    }

    public java.lang.String toString() {
        return this.c.toString();
    }
}
