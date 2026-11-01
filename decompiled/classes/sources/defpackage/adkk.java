package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes.dex */
public final class adkk implements defpackage.adip {
    public final android.content.res.AssetManager a;
    private final java.lang.String b;
    private final defpackage.aogc c;

    /* JADX WARN: Type inference failed for: r3v1, types: [ajct, java.lang.Object] */
    public adkk(defpackage.ajni ajniVar) {
        this.b = (java.lang.String) ajniVar.c;
        this.a = (android.content.res.AssetManager) ajniVar.b;
        this.c = new defpackage.aogc((defpackage.ajct) ajniVar.a, (java.lang.String) null);
    }

    @Override // defpackage.adhp
    public final java.lang.String a() {
        return "AssetFetcher";
    }

    @Override // defpackage.adhi
    public final defpackage.ajcq b(defpackage.adhw adhwVar) {
        return this.c.ag(adhwVar);
    }

    /* JADX WARN: Code duplicated, block: B:38:0x0061 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v0 */
    /* JADX WARN: Type inference failed for: r0v1, types: [java.io.InputStream] */
    /* JADX WARN: Type inference failed for: r0v2 */
    @Override // defpackage.adip
    public final defpackage.adim c(com.google.android.libraries.micore.superpacks.common.PackManifest packManifest) throws java.lang.Throwable {
        java.lang.Throwable th;
        java.io.InputStream inputStreamOpen;
        ?? r0 = 0;
        try {
            try {
                java.lang.String strE = e(packManifest);
                defpackage.aiof aiofVar = defpackage.adhn.a;
                android.content.res.AssetManager assetManager = this.a;
                java.lang.String[] list = assetManager.list(strE);
                if (list == null || list.length <= 0) {
                    inputStreamOpen = assetManager.open(strE);
                    try {
                        if (inputStreamOpen == null) {
                            defpackage.aiof aiofVar2 = defpackage.adhn.a;
                            return null;
                        }
                        defpackage.aiof aiofVar3 = defpackage.adhn.a;
                        try {
                            inputStreamOpen.close();
                        } catch (java.io.IOException unused) {
                        }
                    } catch (java.io.IOException unused2) {
                        defpackage.aiof aiofVar4 = defpackage.adhn.a;
                        if (inputStreamOpen == null) {
                            return null;
                        }
                        try {
                            inputStreamOpen.close();
                            return null;
                        } catch (java.io.IOException unused3) {
                            return null;
                        }
                    }
                } else {
                    defpackage.aiof aiofVar5 = defpackage.adhn.a;
                }
                if (packManifest.l() == null) {
                    int i = defpackage.adho.a;
                    java.util.Set set = defpackage.adik.a;
                    return new defpackage.adim(0L, null);
                }
                long jC = packManifest.c();
                java.lang.String strL = packManifest.l();
                int i2 = defpackage.adho.a;
                if (strL != null) {
                    defpackage.adho.e(strL);
                }
                defpackage.adik.k("compressedSize", jC);
                return new defpackage.adim(jC, strL);
            } catch (java.lang.Throwable th2) {
                th = th2;
                r0 = this;
                if (r0 != 0) {
                    try {
                        r0.close();
                    } catch (java.io.IOException unused4) {
                    }
                }
                throw th;
            }
        } catch (java.io.IOException unused5) {
            inputStreamOpen = null;
        } catch (java.lang.Throwable th3) {
            th = th3;
            if (r0 != 0) {
                r0.close();
            }
            throw th;
        }
    }

    @Override // defpackage.adip
    public final defpackage.ajcq d(com.google.android.libraries.micore.superpacks.common.PackManifest packManifest, defpackage.adin adinVar, java.io.File file) {
        ((defpackage.aiob) ((defpackage.aiob) defpackage.adhn.a.b()).l("com/google/android/libraries/micore/superpacks/packs/AssetFetcher", "fetch", 80, "AssetFetcher.java")).I("Fetching %s from assets with params: %s", packManifest.p().e(true), adinVar);
        return this.c.ah(packManifest.p(), new defpackage.adkl(this, packManifest, file, 1));
    }

    final java.lang.String e(com.google.android.libraries.micore.superpacks.common.PackManifest packManifest) {
        defpackage.adhb adhbVar = (defpackage.adhb) packManifest.p();
        java.lang.String str = adhbVar.a;
        java.lang.String str2 = adhbVar.b;
        java.lang.String strL = packManifest.l();
        java.lang.String str3 = str + '/' + str2.concat(strL != null ? ".".concat(strL) : "");
        java.lang.String str4 = this.b;
        return str4 != null ? defpackage.a.bE(str3, (byte) 47, str4) : str3;
    }
}
