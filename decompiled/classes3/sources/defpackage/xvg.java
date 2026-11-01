package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes3.dex */
public final class xvg {
    private static final defpackage.xvc a = new defpackage.xve();
    private final java.util.Map b = new java.util.HashMap();

    public final synchronized defpackage.xvd a(java.lang.Object obj) {
        defpackage.xvc xvcVar;
        anty.aI(obj, "Argument must not be null");
        java.util.Map map = this.b;
        xvcVar = (defpackage.xvc) map.get(obj.getClass());
        if (xvcVar == null) {
            for (defpackage.xvc xvcVar2 : map.values()) {
                if (xvcVar2.b().isAssignableFrom(obj.getClass())) {
                    xvcVar = xvcVar2;
                    break;
                }
            }
        }
        if (xvcVar == null) {
            xvcVar = a;
        }
        return xvcVar.a(obj);
    }

    public final synchronized void b(defpackage.xvc xvcVar) {
        this.b.put(xvcVar.b(), xvcVar);
    }
}
