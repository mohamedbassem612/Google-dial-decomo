package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes.dex */
public final /* synthetic */ class adkl implements defpackage.adih {
    private final /* synthetic */ int $cid;
    public final /* synthetic */ com.google.android.libraries.micore.superpacks.common.PackManifest a;
    public final /* synthetic */ java.lang.Object b;
    public final /* synthetic */ java.lang.Object c;

    public /* synthetic */ adkl(defpackage.adkk adkkVar, com.google.android.libraries.micore.superpacks.common.PackManifest packManifest, java.io.File file, int i) {
        this.$cid = i;
        this.c = adkkVar;
        this.a = packManifest;
        this.b = file;
    }

    /* JADX INFO: Thrown type has an unknown type hierarchy: adhm */
    @Override // defpackage.adih
    public final java.lang.Object a(defpackage.adhh adhhVar) throws adhm, defpackage.adiq, java.io.IOException {
        if (this.$cid != 0) {
            adhhVar.a();
            defpackage.adkk adkkVar = (defpackage.adkk) this.c;
            android.content.res.AssetManager assetManager = adkkVar.a;
            java.lang.String strE = adkkVar.e(this.a);
            try {
                java.lang.String[] list = assetManager.list(strE);
                java.lang.Object obj = this.b;
                if (list == null || (list.length) == 0) {
                    java.io.File parentFile = ((java.io.File) obj).getParentFile();
                    if (parentFile != null) {
                        parentFile.mkdirs();
                    }
                    defpackage.agab.cq(assetManager, strE, (java.io.File) obj);
                } else {
                    ((java.io.File) obj).mkdirs();
                    for (java.lang.String str : list) {
                        defpackage.agab.cq(assetManager, strE + '/' + str, new java.io.File((java.io.File) obj, str));
                    }
                }
                return new defpackage.adio("assets://".concat(strE));
            } catch (java.lang.SecurityException e) {
                throw new java.io.IOException(e);
            }
        }
        java.lang.Object obj2 = this.b;
        java.lang.String str2 = (java.lang.String) obj2;
        java.lang.String strConcat = str2.concat("_checksum");
        com.google.android.libraries.micore.superpacks.common.PackManifest packManifest = this.a;
        java.lang.String strB = packManifest.o().b(strConcat, null);
        if (strB == null) {
            throw new adhm(java.lang.String.format(java.util.Locale.US, "Manifest for pack %s is missing expected extra '%s'", packManifest, strConcat));
        }
        defpackage.adkn adknVarCi = defpackage.agab.ci(str2);
        if (adknVarCi == null) {
            throw new java.lang.IllegalStateException(java.lang.String.format(java.util.Locale.US, "Unsupported validation scheme %s for pack %s", obj2, packManifest));
        }
        java.lang.Object obj3 = this.c;
        java.io.FileInputStream fileInputStream = new java.io.FileInputStream((java.io.File) obj3);
        try {
            java.lang.String strA = adknVarCi.a(fileInputStream, adhhVar);
            defpackage.aiof aiofVar = defpackage.adhn.a;
            defpackage.adik.d((java.io.File) obj3);
            fileInputStream.close();
            if (defpackage.adik.h(strA).equalsIgnoreCase(defpackage.adik.h(strB))) {
                return null;
            }
            java.lang.String str3 = java.lang.String.format(java.util.Locale.US, "Pack %s checksum validation failed, expected: %s, actual: %s", packManifest, strB, strA);
            packManifest.p();
            throw new defpackage.adiq(str3);
        } catch (java.lang.Throwable th) {
            try {
                fileInputStream.close();
            } catch (java.lang.Throwable th2) {
                th.addSuppressed(th2);
            }
            throw th;
        }
    }

    public /* synthetic */ adkl(com.google.android.libraries.micore.superpacks.common.PackManifest packManifest, java.lang.String str, java.io.File file, int i) {
        this.$cid = i;
        this.a = packManifest;
        this.b = str;
        this.c = file;
    }
}
