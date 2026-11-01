package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes3.dex */
public final class wyf {
    public static final aimz a = aimz.i("com/android/incallui/atlas/ui/impl/audioassets/local/HoldForMeLocalAudioAssetFetcher");
    public final android.content.Context b;
    public final ajct c;
    private final java.util.Map d;

    public wyf(android.content.Context context, ajct ajctVar, java.util.Map map) {
        this.b = context;
        this.c = ajctVar;
        this.d = map;
    }

    private final j$.util.Optional b(java.io.File file, int i) {
        try {
            java.io.InputStream inputStreamOpenRawResource = this.b.getResources().openRawResource(i);
            try {
                j$.nio.file.Files.copy(inputStreamOpenRawResource, j$.io.FileRetargetClass.toPath(file), new j$.nio.file.CopyOption[]{j$.nio.file.StandardCopyOption.REPLACE_EXISTING});
                if (inputStreamOpenRawResource != null) {
                    inputStreamOpenRawResource.close();
                }
                return j$.util.Optional.of(file);
            } catch (java.lang.Throwable th) {
                if (inputStreamOpenRawResource == null) {
                    throw th;
                }
                try {
                    inputStreamOpenRawResource.close();
                    throw th;
                } catch (java.lang.Throwable th2) {
                    th.addSuppressed(th2);
                    throw th;
                }
            }
        } catch (android.content.res.Resources.NotFoundException | java.io.IOException e) {
            hgb.g(a.c(), "failed to create cache file for %s", file.getName(), "com/android/incallui/atlas/ui/impl/audioassets/local/HoldForMeLocalAudioAssetFetcher", "createCacheFile", 'n', "HoldForMeLocalAudioAssetFetcher.java", e, zct.b);
            file.delete();
            return j$.util.Optional.empty();
        }
    }

    public final j$.util.Optional a(int i, defpackage.wyg wygVar) {
        j$.util.Optional optionalOfNullable = j$.util.Optional.ofNullable((defpackage.wyj) this.d.get(wygVar));
        if (!optionalOfNullable.isPresent()) {
            a.bt(a.c().m(aioa.b), "no asset found for language: %s", wygVar, "com/android/incallui/atlas/ui/impl/audioassets/local/HoldForMeLocalAudioAssetFetcher", "getOrCreateCacheFile", 'Z', "HoldForMeLocalAudioAssetFetcher.java", zct.b);
            return j$.util.Optional.empty();
        }
        defpackage.wyi wyiVarA = ((defpackage.wyj) optionalOfNullable.orElseThrow()).a(i);
        android.content.Context context = this.b;
        j$.util.Optional optional = wyiVarA.b;
        java.lang.String strH = wsc.h(i);
        java.io.File cacheDir = context.getCacheDir();
        java.lang.String str = java.lang.String.format(java.util.Locale.US, "hfm-audio-%s-%s", ahvr.p(strH), ahvr.q(wygVar.name()));
        if (optional.isPresent()) {
            str = str + '-' + ((java.lang.String) optional.orElseThrow());
        }
        java.io.File file = new java.io.File(cacheDir, str);
        return file.exists() ? j$.util.Optional.of(file) : b(file, wyiVarA.a);
    }
}
