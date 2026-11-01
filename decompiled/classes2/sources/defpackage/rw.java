package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes2.dex */
final class rw {
    static void a(android.app.appsearch.SearchSpec.Builder builder, java.util.List list, defpackage.rf rfVar) {
        android.app.appsearch.EmbeddingVector[] embeddingVectorArr = new android.app.appsearch.EmbeddingVector[list.size()];
        for (int i = 0; i < list.size(); i++) {
            defpackage.pu puVar = (defpackage.pu) list.get(i);
            embeddingVectorArr[i] = new android.app.appsearch.EmbeddingVector(puVar.a, puVar.b);
        }
        builder.addEmbeddingParameters(embeddingVectorArr);
    }

    static void b(android.app.appsearch.SearchSpec.Builder builder, int i) {
        builder.setDefaultEmbeddingSearchMetricType(i);
    }
}
