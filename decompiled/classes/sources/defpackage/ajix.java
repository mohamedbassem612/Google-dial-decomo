package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes.dex */
public final class ajix {
    static {
        defpackage.ajqi ajqiVar = defpackage.ajqi.a;
        try {
            a();
        } catch (java.security.GeneralSecurityException e) {
            throw new java.lang.ExceptionInInitializerError(e);
        }
    }

    public static void a() throws java.security.GeneralSecurityException {
        defpackage.ajmf ajmfVar = defpackage.ajmf.a;
        ajmfVar.b(defpackage.ajiy.a);
        ajmfVar.a(defpackage.ajiy.b);
        if (defpackage.ajir.a()) {
            return;
        }
        defpackage.ajmo ajmoVar = defpackage.ajit.a;
        if (!defpackage.ajsz.u(1)) {
            throw new java.security.GeneralSecurityException("Registering AES SIV is not supported in FIPS mode");
        }
        defpackage.ajmk ajmkVar = defpackage.ajja.a;
        defpackage.ajmg ajmgVar = defpackage.ajmg.a;
        ajmgVar.a(defpackage.ajja.a);
        ajmgVar.b(defpackage.ajja.b);
        ajmgVar.c(defpackage.ajja.c);
        ajmgVar.d(defpackage.ajja.d);
        ajmfVar.a(defpackage.ajit.a);
        defpackage.ajme ajmeVar = defpackage.ajme.a;
        java.util.HashMap map = new java.util.HashMap();
        map.put("AES256_SIV", defpackage.ajiz.a);
        defpackage.ajiu ajiuVar = new defpackage.ajiu();
        ajiuVar.b(64);
        ajiuVar.a = defpackage.ajiv.c;
        map.put("AES256_SIV_RAW", ajiuVar.a());
        ajmeVar.a(j$.util.DesugarCollections.unmodifiableMap(map));
        defpackage.ajmc.a.a(defpackage.ajit.c, defpackage.ajiw.class);
        defpackage.ajma.a.a(defpackage.ajit.d, defpackage.ajiw.class);
        defpackage.ajlr.a.c(defpackage.ajit.b, true);
    }
}
