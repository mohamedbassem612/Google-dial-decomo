package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes.dex */
public final class ajns {
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
        ajmfVar.b(defpackage.ajnu.a);
        ajmfVar.a(defpackage.ajnu.b);
        ajmfVar.b(defpackage.ajnm.a);
        int i = defpackage.ajno.f;
        if (!defpackage.ajsz.u(i)) {
            throw new java.security.GeneralSecurityException("Can not use HMAC in FIPS-mode, as BoringCrypto module is not available.");
        }
        defpackage.ajmk ajmkVar = defpackage.ajny.a;
        defpackage.ajmg ajmgVar = defpackage.ajmg.a;
        ajmgVar.a(defpackage.ajny.a);
        ajmgVar.b(defpackage.ajny.b);
        ajmgVar.c(defpackage.ajny.c);
        ajmgVar.d(defpackage.ajny.d);
        ajmfVar.a(defpackage.ajno.a);
        ajmfVar.a(defpackage.ajno.b);
        defpackage.ajme ajmeVar = defpackage.ajme.a;
        java.util.HashMap map = new java.util.HashMap();
        map.put("HMAC_SHA256_128BITTAG", defpackage.ajnv.a);
        defpackage.annk annkVar = new defpackage.annk((byte[]) null);
        annkVar.d(32);
        annkVar.e(16);
        defpackage.ajnq ajnqVar = defpackage.ajnq.d;
        annkVar.a = ajnqVar;
        defpackage.ajnp ajnpVar = defpackage.ajnp.c;
        annkVar.c = ajnpVar;
        map.put("HMAC_SHA256_128BITTAG_RAW", annkVar.c());
        defpackage.annk annkVar2 = new defpackage.annk((byte[]) null);
        annkVar2.d(32);
        annkVar2.e(32);
        defpackage.ajnq ajnqVar2 = defpackage.ajnq.a;
        annkVar2.a = ajnqVar2;
        annkVar2.c = ajnpVar;
        map.put("HMAC_SHA256_256BITTAG", annkVar2.c());
        defpackage.annk annkVar3 = new defpackage.annk((byte[]) null);
        annkVar3.d(32);
        annkVar3.e(32);
        annkVar3.a = ajnqVar;
        annkVar3.c = ajnpVar;
        map.put("HMAC_SHA256_256BITTAG_RAW", annkVar3.c());
        defpackage.annk annkVar4 = new defpackage.annk((byte[]) null);
        annkVar4.d(64);
        annkVar4.e(16);
        annkVar4.a = ajnqVar2;
        defpackage.ajnp ajnpVar2 = defpackage.ajnp.e;
        annkVar4.c = ajnpVar2;
        map.put("HMAC_SHA512_128BITTAG", annkVar4.c());
        defpackage.annk annkVar5 = new defpackage.annk((byte[]) null);
        annkVar5.d(64);
        annkVar5.e(16);
        annkVar5.a = ajnqVar;
        annkVar5.c = ajnpVar2;
        map.put("HMAC_SHA512_128BITTAG_RAW", annkVar5.c());
        defpackage.annk annkVar6 = new defpackage.annk((byte[]) null);
        annkVar6.d(64);
        annkVar6.e(32);
        annkVar6.a = ajnqVar2;
        annkVar6.c = ajnpVar2;
        map.put("HMAC_SHA512_256BITTAG", annkVar6.c());
        defpackage.annk annkVar7 = new defpackage.annk((byte[]) null);
        annkVar7.d(64);
        annkVar7.e(32);
        annkVar7.a = ajnqVar;
        annkVar7.c = ajnpVar2;
        map.put("HMAC_SHA512_256BITTAG_RAW", annkVar7.c());
        map.put("HMAC_SHA512_512BITTAG", defpackage.ajnv.b);
        defpackage.annk annkVar8 = new defpackage.annk((byte[]) null);
        annkVar8.d(64);
        annkVar8.e(64);
        annkVar8.a = ajnqVar;
        annkVar8.c = ajnpVar2;
        map.put("HMAC_SHA512_512BITTAG_RAW", annkVar8.c());
        ajmeVar.a(j$.util.DesugarCollections.unmodifiableMap(map));
        defpackage.ajma ajmaVar = defpackage.ajma.a;
        ajmaVar.a(defpackage.ajno.e, defpackage.ajnr.class);
        defpackage.ajmc.a.a(defpackage.ajno.d, defpackage.ajnr.class);
        defpackage.ajlr ajlrVar = defpackage.ajlr.a;
        ajlrVar.d(defpackage.ajno.c, i, true);
        if (defpackage.ajir.a()) {
            return;
        }
        defpackage.ajlq ajlqVar = defpackage.ajnh.a;
        if (!defpackage.ajsz.u(1)) {
            throw new java.security.GeneralSecurityException("Registering AES CMAC is not supported in FIPS mode");
        }
        ajmgVar.a(defpackage.ajnw.a);
        ajmgVar.b(defpackage.ajnw.b);
        ajmgVar.c(defpackage.ajnw.c);
        ajmgVar.d(defpackage.ajnw.d);
        ajmaVar.a(defpackage.ajnh.a, defpackage.ajnk.class);
        ajmfVar.a(defpackage.ajnh.b);
        ajmfVar.a(defpackage.ajnh.c);
        java.util.HashMap map2 = new java.util.HashMap();
        defpackage.ajnk ajnkVar = defpackage.ajnv.c;
        map2.put("AES_CMAC", ajnkVar);
        map2.put("AES256_CMAC", ajnkVar);
        defpackage.ajni ajniVar = new defpackage.ajni();
        ajniVar.b(32);
        ajniVar.c(16);
        ajniVar.c = defpackage.ajnj.d;
        map2.put("AES256_CMAC_RAW", ajniVar.a());
        ajmeVar.a(j$.util.DesugarCollections.unmodifiableMap(map2));
        ajlrVar.c(defpackage.ajnh.d, true);
    }
}
