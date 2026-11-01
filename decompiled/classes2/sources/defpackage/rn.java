package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes2.dex */
public final class rn {
    public static defpackage.ph a(android.app.appsearch.AppSearchSchema.BlobHandlePropertyConfig blobHandlePropertyConfig) {
        java.lang.String name = blobHandlePropertyConfig.getName();
        dzk.x(name);
        int cardinality = blobHandlePropertyConfig.getCardinality();
        dzk.w(cardinality, 1, 3, "cardinality");
        return new defpackage.ph(new defpackage.sj((java.lang.String) j$.util.Objects.requireNonNull(name), 8, cardinality, null, null, null, null, null, (java.lang.String) j$.util.Objects.requireNonNull(""), null, false));
    }

    public static defpackage.pk b(android.app.appsearch.AppSearchSchema.EmbeddingPropertyConfig embeddingPropertyConfig) {
        java.lang.String name = embeddingPropertyConfig.getName();
        dzk.x(name);
        int cardinality = embeddingPropertyConfig.getCardinality();
        dzk.w(cardinality, 1, 3, "cardinality");
        int indexingType = embeddingPropertyConfig.getIndexingType();
        dzk.w(indexingType, 0, 2, "indexingType");
        int quantizationType = embeddingPropertyConfig.getQuantizationType();
        dzk.w(quantizationType, 0, 1, "quantizationType");
        return new defpackage.pk(new defpackage.sj((java.lang.String) j$.util.Objects.requireNonNull(name), 7, cardinality, null, null, null, null, null, (java.lang.String) j$.util.Objects.requireNonNull(""), new defpackage.sf(indexingType, quantizationType), false));
    }
}
