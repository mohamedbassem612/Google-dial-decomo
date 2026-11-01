package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes.dex */
public final class ajfu {
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
        ajmfVar.b(defpackage.ajfw.a);
        ajmfVar.a(defpackage.ajfw.b);
        defpackage.ajns.a();
        int i = defpackage.ajfz.e;
        if (!defpackage.ajsz.u(i)) {
            throw new java.security.GeneralSecurityException("Can not use AES-CTR-HMAC in FIPS-mode, as BoringCrypto module is not available.");
        }
        defpackage.ajmg ajmgVar = defpackage.ajmg.a;
        ajmgVar.a(defpackage.ajhv.a);
        ajmgVar.b(defpackage.ajhv.b);
        ajmgVar.c(defpackage.ajhv.c);
        ajmgVar.d(defpackage.ajhv.d);
        ajmfVar.a(defpackage.ajfz.a);
        defpackage.ajme ajmeVar = defpackage.ajme.a;
        java.util.HashMap map = new java.util.HashMap();
        map.put("AES128_CTR_HMAC_SHA256", defpackage.ajhm.e);
        defpackage.ajje ajjeVar = new defpackage.ajje((byte[]) null);
        ajjeVar.c(16);
        ajjeVar.d(32);
        ajjeVar.f(16);
        ajjeVar.e(16);
        defpackage.ajga ajgaVar = defpackage.ajga.c;
        ajjeVar.d = ajgaVar;
        defpackage.ajgb ajgbVar = defpackage.ajgb.c;
        ajjeVar.a = ajgbVar;
        map.put("AES128_CTR_HMAC_SHA256_RAW", ajjeVar.b());
        map.put("AES256_CTR_HMAC_SHA256", defpackage.ajhm.f);
        defpackage.ajje ajjeVar2 = new defpackage.ajje((byte[]) null);
        ajjeVar2.c(32);
        ajjeVar2.d(32);
        ajjeVar2.f(32);
        ajjeVar2.e(16);
        ajjeVar2.d = ajgaVar;
        ajjeVar2.a = ajgbVar;
        map.put("AES256_CTR_HMAC_SHA256_RAW", ajjeVar2.b());
        ajmeVar.a(j$.util.DesugarCollections.unmodifiableMap(map));
        defpackage.ajmc ajmcVar = defpackage.ajmc.a;
        ajmcVar.a(defpackage.ajfz.c, defpackage.ajgc.class);
        defpackage.ajma ajmaVar = defpackage.ajma.a;
        ajmaVar.a(defpackage.ajfz.d, defpackage.ajgc.class);
        defpackage.ajlr ajlrVar = defpackage.ajlr.a;
        ajlrVar.d(defpackage.ajfz.b, i, true);
        int i2 = defpackage.ajgk.e;
        if (!defpackage.ajsz.u(i2)) {
            throw new java.security.GeneralSecurityException("Can not use AES-GCM in FIPS-mode, as BoringCrypto module is not available.");
        }
        ajmgVar.a(defpackage.ajhz.a);
        ajmgVar.b(defpackage.ajhz.b);
        ajmgVar.c(defpackage.ajhz.c);
        ajmgVar.d(defpackage.ajhz.d);
        ajmfVar.a(defpackage.ajgk.a);
        java.util.HashMap map2 = new java.util.HashMap();
        map2.put("AES128_GCM", defpackage.ajhm.a);
        defpackage.annk annkVar = new defpackage.annk(null, null);
        annkVar.g();
        annkVar.h(16);
        annkVar.i();
        defpackage.ajgl ajglVar = defpackage.ajgl.c;
        annkVar.c = ajglVar;
        map2.put("AES128_GCM_RAW", annkVar.f());
        map2.put("AES256_GCM", defpackage.ajhm.b);
        defpackage.annk annkVar2 = new defpackage.annk(null, null);
        annkVar2.g();
        annkVar2.h(32);
        annkVar2.i();
        annkVar2.c = ajglVar;
        map2.put("AES256_GCM_RAW", annkVar2.f());
        ajmeVar.a(j$.util.DesugarCollections.unmodifiableMap(map2));
        ajmcVar.a(defpackage.ajgk.c, defpackage.ajgm.class);
        ajmaVar.a(defpackage.ajgk.d, defpackage.ajgm.class);
        ajlrVar.d(defpackage.ajgk.b, i2, true);
        if (defpackage.ajir.a()) {
            return;
        }
        defpackage.ajmo ajmoVar = defpackage.ajgf.a;
        if (!defpackage.ajsz.u(1)) {
            throw new java.security.GeneralSecurityException("Registering AES EAX is not supported in FIPS mode");
        }
        ajmgVar.a(defpackage.ajhw.a);
        ajmgVar.b(defpackage.ajhw.b);
        ajmgVar.c(defpackage.ajhw.c);
        ajmgVar.d(defpackage.ajhw.d);
        ajmfVar.a(defpackage.ajgf.a);
        java.util.HashMap map3 = new java.util.HashMap();
        map3.put("AES128_EAX", defpackage.ajhm.c);
        defpackage.annk annkVar3 = new defpackage.annk((char[]) null);
        annkVar3.k(16);
        annkVar3.l(16);
        annkVar3.m();
        defpackage.ajgg ajggVar = defpackage.ajgg.c;
        annkVar3.a = ajggVar;
        map3.put("AES128_EAX_RAW", annkVar3.j());
        map3.put("AES256_EAX", defpackage.ajhm.d);
        defpackage.annk annkVar4 = new defpackage.annk((char[]) null);
        annkVar4.k(16);
        annkVar4.l(32);
        annkVar4.m();
        annkVar4.a = ajggVar;
        map3.put("AES256_EAX_RAW", annkVar4.j());
        ajmeVar.a(j$.util.DesugarCollections.unmodifiableMap(map3));
        ajmaVar.a(defpackage.ajgf.c, defpackage.ajgh.class);
        ajlrVar.c(defpackage.ajgf.b, true);
        defpackage.ajmo ajmoVar2 = defpackage.ajgo.a;
        if (!defpackage.ajsz.u(1)) {
            throw new java.security.GeneralSecurityException("Registering AES GCM SIV is not supported in FIPS mode");
        }
        ajmgVar.a(defpackage.ajib.a);
        ajmgVar.b(defpackage.ajib.b);
        ajmgVar.c(defpackage.ajib.c);
        ajmgVar.d(defpackage.ajib.d);
        java.util.HashMap map4 = new java.util.HashMap();
        defpackage.ajiu ajiuVar = new defpackage.ajiu((byte[]) null);
        ajiuVar.d(16);
        defpackage.ajgp ajgpVar = defpackage.ajgp.a;
        ajiuVar.a = ajgpVar;
        map4.put("AES128_GCM_SIV", ajiuVar.c());
        defpackage.ajiu ajiuVar2 = new defpackage.ajiu((byte[]) null);
        ajiuVar2.d(16);
        defpackage.ajgp ajgpVar2 = defpackage.ajgp.c;
        ajiuVar2.a = ajgpVar2;
        map4.put("AES128_GCM_SIV_RAW", ajiuVar2.c());
        defpackage.ajiu ajiuVar3 = new defpackage.ajiu((byte[]) null);
        ajiuVar3.d(32);
        ajiuVar3.a = ajgpVar;
        map4.put("AES256_GCM_SIV", ajiuVar3.c());
        defpackage.ajiu ajiuVar4 = new defpackage.ajiu((byte[]) null);
        ajiuVar4.d(32);
        ajiuVar4.a = ajgpVar2;
        map4.put("AES256_GCM_SIV_RAW", ajiuVar4.c());
        ajmeVar.a(j$.util.DesugarCollections.unmodifiableMap(map4));
        ajmcVar.a(defpackage.ajgo.c, defpackage.ajgq.class);
        ajmaVar.a(defpackage.ajgo.b, defpackage.ajgq.class);
        ajmfVar.a(defpackage.ajgo.a);
        ajlrVar.c(defpackage.ajgo.d, true);
        defpackage.ajmo ajmoVar3 = defpackage.ajgs.a;
        if (!defpackage.ajsz.u(1)) {
            throw new java.security.GeneralSecurityException("Registering ChaCha20Poly1305 is not supported in FIPS mode");
        }
        ajmgVar.a(defpackage.ajid.a);
        ajmgVar.b(defpackage.ajid.b);
        ajmgVar.c(defpackage.ajid.c);
        ajmgVar.d(defpackage.ajid.d);
        ajmfVar.a(defpackage.ajgs.a);
        ajmaVar.a(defpackage.ajgs.b, defpackage.ajgu.class);
        java.util.HashMap map5 = new java.util.HashMap();
        map5.put("CHACHA20_POLY1305", new defpackage.ajgu(defpackage.ajgt.a));
        map5.put("CHACHA20_POLY1305_RAW", new defpackage.ajgu(defpackage.ajgt.c));
        ajmeVar.a(j$.util.DesugarCollections.unmodifiableMap(map5));
        ajlrVar.c(defpackage.ajgs.c, true);
        defpackage.ajmo ajmoVar4 = defpackage.ajgv.a;
        if (!defpackage.ajsz.u(1)) {
            throw new java.security.GeneralSecurityException("Registering KMS AEAD is not supported in FIPS mode");
        }
        ajmgVar.a(defpackage.ajhb.a);
        ajmgVar.b(defpackage.ajhb.b);
        ajmgVar.c(defpackage.ajhb.c);
        ajmgVar.d(defpackage.ajhb.d);
        ajmfVar.a(defpackage.ajgv.a);
        ajmaVar.a(defpackage.ajgv.c, defpackage.ajha.class);
        ajlrVar.c(defpackage.ajgv.b, true);
        defpackage.ajep ajepVar = defpackage.ajgx.a;
        if (!defpackage.ajsz.u(1)) {
            throw new java.security.GeneralSecurityException("Registering KMS Envelope AEAD is not supported in FIPS mode");
        }
        ajmgVar.a(defpackage.ajhk.a);
        ajmgVar.b(defpackage.ajhk.b);
        ajmgVar.c(defpackage.ajhk.c);
        ajmgVar.d(defpackage.ajhk.d);
        ajmaVar.a(defpackage.ajgx.b, defpackage.ajhf.class);
        ajmfVar.a(defpackage.ajgx.c);
        ajlrVar.c(defpackage.ajgx.a, true);
        defpackage.ajmo ajmoVar5 = defpackage.ajhs.a;
        if (!defpackage.ajsz.u(1)) {
            throw new java.security.GeneralSecurityException("Registering XChaCha20Poly1305 is not supported in FIPS mode");
        }
        ajmgVar.a(defpackage.ajin.a);
        ajmgVar.b(defpackage.ajin.b);
        ajmgVar.c(defpackage.ajin.c);
        ajmgVar.d(defpackage.ajin.d);
        ajmfVar.a(defpackage.ajhs.a);
        java.util.HashMap map6 = new java.util.HashMap();
        map6.put("XCHACHA20_POLY1305", new defpackage.ajhu(defpackage.ajht.a));
        map6.put("XCHACHA20_POLY1305_RAW", new defpackage.ajhu(defpackage.ajht.c));
        ajmeVar.a(j$.util.DesugarCollections.unmodifiableMap(map6));
        ajmaVar.a(defpackage.ajhs.d, defpackage.ajhu.class);
        ajmcVar.a(defpackage.ajhs.c, defpackage.ajhu.class);
        ajlrVar.c(defpackage.ajhs.b, true);
        ajmgVar.a(defpackage.ajim.a);
        ajmgVar.b(defpackage.ajim.b);
        ajmgVar.c(defpackage.ajim.c);
        ajmgVar.d(defpackage.ajim.d);
        java.util.HashMap map7 = new java.util.HashMap();
        map7.put("XAES_256_GCM_192_BIT_NONCE", defpackage.ajhm.g);
        map7.put("XAES_256_GCM_192_BIT_NONCE_NO_PREFIX", defpackage.ajhm.h);
        map7.put("XAES_256_GCM_160_BIT_NONCE_NO_PREFIX", defpackage.ajhm.i);
        map7.put("X_AES_GCM_8_BYTE_SALT_NO_PREFIX", defpackage.ajhm.j);
        ajmeVar.a(j$.util.DesugarCollections.unmodifiableMap(map7));
        ajmfVar.a(defpackage.ajho.b);
        ajmaVar.a(defpackage.ajho.a, defpackage.ajhq.class);
    }
}
