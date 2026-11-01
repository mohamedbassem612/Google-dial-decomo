package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes2.dex */
public final class fwo {
    public static final java.util.Map a = new java.util.LinkedHashMap();
    private final java.util.Map b = new java.util.LinkedHashMap();

    public final defpackage.fwn a(java.lang.Class cls) {
        return b(defpackage.hgt.R(cls));
    }

    public final defpackage.fwn b(java.lang.String str) {
        if (str == null) {
            aooh.i("name");
        }
        if (!defpackage.hgt.Q(str)) {
            throw new java.lang.IllegalArgumentException("navigator name cannot be an empty string");
        }
        defpackage.fwn fwnVar = (defpackage.fwn) this.b.get(str);
        if (fwnVar != null) {
            return fwnVar;
        }
        throw new java.lang.IllegalStateException(a.bk(str, "Could not find Navigator with name \"", "\". You must call NavController.addNavigator() for each navigation type."));
    }

    public final java.util.Map c() {
        return ajsz.aS(this.b);
    }

    public final void d(defpackage.fwn fwnVar) {
        if (fwnVar == null) {
            aooh.i("navigator");
        }
        java.lang.String strR = defpackage.hgt.R(fwnVar.getClass());
        if (strR == null) {
            aooh.i("name");
        }
        if (fwnVar == null) {
            aooh.i("navigator");
        }
        if (!defpackage.hgt.Q(strR)) {
            throw new java.lang.IllegalArgumentException("navigator name cannot be an empty string");
        }
        java.util.Map map = this.b;
        defpackage.fwn fwnVar2 = (defpackage.fwn) map.get(strR);
        if (aooh.n(fwnVar2, fwnVar)) {
            return;
        }
        if (fwnVar2 != null && fwnVar2.b) {
            throw new java.lang.IllegalStateException(a.bi(fwnVar2, fwnVar, "Navigator ", " is replacing an already attached "));
        }
        if (fwnVar.b) {
            throw new java.lang.IllegalStateException(a.bg(fwnVar, "Navigator ", " is already attached to another NavController"));
        }
    }
}
