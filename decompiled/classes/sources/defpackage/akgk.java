package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes.dex */
public final class akgk implements defpackage.akfl {
    private static final java.util.logging.Logger a = java.util.logging.Logger.getLogger(defpackage.akgk.class.getName());
    private final android.content.res.AssetManager b;

    public akgk(android.content.res.AssetManager assetManager) {
        this.b = assetManager;
    }

    /* JADX INFO: Thrown type has an unknown type hierarchy: akgl */
    @Override // defpackage.akfl
    public final java.io.InputStream a(java.lang.String str) throws akgl {
        try {
            return this.b.open(str, 3);
        } catch (java.io.FileNotFoundException unused) {
            a.logp(java.util.logging.Level.WARNING, "com.google.i18n.phonenumbers.metadata.init.AndroidAssetMetadataLoader", "loadMetadata", java.lang.String.format("File %s not found", str));
            return null;
        } catch (java.io.IOException e) {
            throw new akgl(java.lang.String.format("Error while opening %s: ", str), e);
        }
    }
}
