package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes.dex */
public final class ajma {
    private final java.util.Map c = new java.util.HashMap();
    private static final defpackage.ajlq b = new defpackage.ajge(12);
    public static final defpackage.ajma a = c();

    private static defpackage.ajma c() {
        defpackage.ajma ajmaVar = new defpackage.ajma();
        try {
            ajmaVar.a(b, defpackage.ajly.class);
            return ajmaVar;
        } catch (java.security.GeneralSecurityException e) {
            throw new java.lang.IllegalStateException("unexpected error.", e);
        }
    }

    public final synchronized void a(defpackage.ajlq ajlqVar, java.lang.Class cls) {
        java.util.Map map = this.c;
        defpackage.ajlq ajlqVar2 = (defpackage.ajlq) map.get(cls);
        if (ajlqVar2 != null && !ajlqVar2.equals(ajlqVar)) {
            throw new java.security.GeneralSecurityException(defpackage.a.bJ(cls, "Different key creator for parameters class ", " already inserted"));
        }
        map.put(cls, ajlqVar);
    }

    public final synchronized defpackage.aiql b(defpackage.ajsz ajszVar, java.lang.Integer num) {
        defpackage.ajlq ajlqVar;
        ajlqVar = (defpackage.ajlq) this.c.get(ajszVar.getClass());
        if (ajlqVar == null) {
            throw new java.security.GeneralSecurityException(defpackage.a.bJ(ajszVar, "Cannot create a new key for parameters ", ": no key creator for this class was registered."));
        }
        return ajlqVar.a(ajszVar, num);
    }
}
