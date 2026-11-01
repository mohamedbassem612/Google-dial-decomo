package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes2.dex */
public final class ajrc {
    static {
        ajqi ajqiVar = ajqi.a;
        try {
            a();
        } catch (java.security.GeneralSecurityException e) {
            throw new java.lang.ExceptionInInitializerError(e);
        }
    }

    public static void a() throws java.security.GeneralSecurityException {
        ajmf ajmfVar = ajmf.a;
        ajmfVar.b(defpackage.ajrd.a);
        ajmfVar.a(defpackage.ajrd.b);
        if (ajir.a()) {
            return;
        }
        ajmo ajmoVar = defpackage.ajqp.a;
        if (!ajsz.u(1)) {
            throw new java.security.GeneralSecurityException("Registering AES CTR HMAC Streaming AEAD is not supported in FIPS mode");
        }
        ajmg ajmgVar = ajmg.a;
        ajmgVar.a(defpackage.ajre.a);
        ajmgVar.b(defpackage.ajre.b);
        ajmgVar.c(defpackage.ajre.c);
        ajmgVar.d(defpackage.ajre.d);
        ajme ajmeVar = ajme.a;
        java.util.HashMap map = new java.util.HashMap();
        map.put("AES128_CTR_HMAC_SHA256_4KB", defpackage.ajra.a);
        map.put("AES128_CTR_HMAC_SHA256_1MB", defpackage.ajra.b);
        map.put("AES256_CTR_HMAC_SHA256_4KB", defpackage.ajra.c);
        map.put("AES256_CTR_HMAC_SHA256_1MB", defpackage.ajra.d);
        ajmeVar.a(j$.util.DesugarCollections.unmodifiableMap(map));
        ajma ajmaVar = ajma.a;
        ajmaVar.a(defpackage.ajqp.b, defpackage.ajqs.class);
        ajmfVar.a(defpackage.ajqp.a);
        ajlr ajlrVar = ajlr.a;
        ajlrVar.c(defpackage.ajqp.c, true);
        ajmo ajmoVar2 = defpackage.ajqv.a;
        if (!ajsz.u(1)) {
            throw new java.security.GeneralSecurityException("Registering AES-GCM HKDF Streaming AEAD is not supported in FIPS mode");
        }
        ajmgVar.a(defpackage.ajrj.a);
        ajmgVar.b(defpackage.ajrj.b);
        ajmgVar.c(defpackage.ajrj.c);
        ajmgVar.d(defpackage.ajrj.d);
        java.util.HashMap map2 = new java.util.HashMap();
        map2.put("AES128_GCM_HKDF_4KB", defpackage.ajra.e);
        map2.put("AES128_GCM_HKDF_1MB", defpackage.ajra.f);
        map2.put("AES256_GCM_HKDF_4KB", defpackage.ajra.g);
        map2.put("AES256_GCM_HKDF_1MB", defpackage.ajra.h);
        ajmeVar.a(j$.util.DesugarCollections.unmodifiableMap(map2));
        ajmc.a.a(defpackage.ajqv.d, defpackage.ajqy.class);
        ajmaVar.a(defpackage.ajqv.c, defpackage.ajqy.class);
        ajmfVar.a(defpackage.ajqv.a);
        ajlrVar.c(defpackage.ajqv.b, true);
    }
}
