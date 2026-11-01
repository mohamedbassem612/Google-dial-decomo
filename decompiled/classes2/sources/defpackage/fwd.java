package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes2.dex */
public class fwd {
    public final java.lang.String a;
    private final defpackage.fwn c;
    private final java.util.Map d = new java.util.LinkedHashMap();
    public final java.util.List b = new java.util.ArrayList();
    private final java.util.Map e = new java.util.LinkedHashMap();

    public fwd(defpackage.fwn fwnVar, java.lang.String str) {
        this.c = fwnVar;
        this.a = str;
    }

    public defpackage.fwc a() {
        java.util.Map map = this.d;
        defpackage.fwc fwcVarB = b();
        for (java.util.Map.Entry entry : map.entrySet()) {
            java.lang.String str = (java.lang.String) entry.getKey();
            defpackage.fvr fvrVar = (defpackage.fvr) entry.getValue();
            if (str == null) {
                aooh.i("argumentName");
            }
            if (fvrVar == null) {
                aooh.i("argument");
            }
            defpackage.fxu fxuVar = fwcVarB.b;
            aooh.f(str, "argumentName");
            aooh.f(fvrVar, "argument");
            fxuVar.c.put(str, fvrVar);
        }
        for (defpackage.fvz fvzVar : this.b) {
            aooh.f(fvzVar, "navDeepLink");
            defpackage.fxu fxuVar2 = fwcVarB.b;
            aooh.f(fvzVar, "navDeepLink");
            java.util.List listAb = defpackage.hgt.ab(fxuVar2.c, new defpackage.fxs(fvzVar, 0));
            if (!listAb.isEmpty()) {
                throw new java.lang.IllegalArgumentException("Deep link " + fvzVar.c + " can't be used to open destination " + fxuVar2.a + ".\nFollowing required arguments are missing: " + listAb);
            }
            fxuVar2.b.add(fvzVar);
        }
        for (java.util.Map.Entry entry2 : this.e.entrySet()) {
            int iIntValue = ((java.lang.Number) entry2.getKey()).intValue();
            defpackage.fvq fvqVar = (defpackage.fvq) entry2.getValue();
            if (fvqVar == null) {
                aooh.i("action");
            }
            if (!fwcVarB.a()) {
                throw new java.lang.UnsupportedOperationException("Cannot add action " + iIntValue + " to " + fwcVarB + " as it does not support actions, indicating that it is a terminal destination in your navigation graph and will never trigger actions.");
            }
            if (iIntValue == 0) {
                throw new java.lang.IllegalArgumentException("Cannot have an action with actionId 0");
            }
            fwcVarB.d.f(iIntValue, fvqVar);
        }
        java.lang.String str2 = this.a;
        if (str2 != null) {
            defpackage.fxu fxuVar3 = fwcVarB.b;
            if (aoov.H(str2)) {
                throw new java.lang.IllegalArgumentException("Cannot have an empty route");
            }
            java.lang.String strX = defpackage.hgt.X(str2);
            java.util.List listAb2 = defpackage.hgt.ab(fxuVar3.c, new defpackage.fxs(defpackage.hgt.Z(strX), 3));
            if (!listAb2.isEmpty()) {
                throw new java.lang.IllegalArgumentException("Cannot set route \"" + str2 + "\" for destination " + fxuVar3.a + ". Following required arguments are missing: " + listAb2);
            }
            fxuVar3.f = aooc.ag(new defpackage.fxt(strX, 0));
            fxuVar3.d = strX.hashCode();
            fxuVar3.e = str2;
        }
        return fwcVarB;
    }

    protected defpackage.fwc b() {
        return this.c.a();
    }
}
