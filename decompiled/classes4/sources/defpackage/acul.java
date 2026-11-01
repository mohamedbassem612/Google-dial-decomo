package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes4.dex */
public final /* synthetic */ class acul implements java.util.function.Supplier {
    private final /* synthetic */ int $cid;
    public final /* synthetic */ java.lang.Object a;

    public /* synthetic */ acul(java.lang.Object obj, int i) {
        this.$cid = i;
        this.a = obj;
    }

    @Override // java.util.function.Supplier
    public final java.lang.Object get() {
        java.lang.Object objM;
        int i = this.$cid;
        if (i == 0) {
            return this.a;
        }
        if (i == 1) {
            return java.lang.Boolean.valueOf(((zqj) this.a).d);
        }
        if (i == 2) {
            return new java.lang.IllegalArgumentException(java.lang.String.format("robot intent spec does not contain intent with name %s.", this.a));
        }
        java.lang.Object obj = this.a;
        try {
            if (i != 3) {
                return ((defpackage.amcx) obj).b();
            }
            try {
                j$.util.Optional optionalOfNullable = ((defpackage.amey) obj).b;
                defpackage.amck amckVar = new defpackage.amck(obj, 2);
                if (true == optionalOfNullable.isPresent()) {
                    optionalOfNullable = j$.util.Optional.ofNullable((java.io.InputStream) ahzq.c(new defpackage.amex((defpackage.amey) amckVar.a, (alqd) optionalOfNullable.get(), 0)));
                }
                if (true == optionalOfNullable.isPresent()) {
                    objM = optionalOfNullable.get();
                } else {
                    defpackage.amey.a.d().l("com/google/quality/views/extraction/kcube/bg/ondevice/modules/vc/VcAssetsModelsRepository", "amCacheDatabase", 96, "VcAssetsModelsRepository.java").v("FileGetter missing.");
                    objM = ae$.ExternalSyntheticApiModelOutline0.m();
                }
                java.io.InputStream inputStream = (java.io.InputStream) objM;
                try {
                    defpackage.amey.a.b().l("com/google/quality/views/extraction/kcube/bg/ondevice/modules/vc/VcAssetsModelsRepository", "amCacheDatabase", 100, "VcAssetsModelsRepository.java").v("Attempting to unobfuscate cache file.");
                    return defpackage.amjk.j(inputStream);
                } catch (defpackage.amca e) {
                    defpackage.amey.a.c().k(e).l("com/google/quality/views/extraction/kcube/bg/ondevice/modules/vc/VcAssetsModelsRepository", "amCacheDatabase", 103, "VcAssetsModelsRepository.java").v("Failed to unobfuscate AM cache.");
                    return defpackage.amfk.a;
                }
            } catch (ahzq e2) {
                defpackage.amey.a.d().k((java.io.IOException) e2.b(java.io.IOException.class)).l("com/google/quality/views/extraction/kcube/bg/ondevice/modules/vc/VcAssetsModelsRepository", "amCacheDatabase", 107, "VcAssetsModelsRepository.java").v("No Am cache file.");
            }
        } catch (java.io.IOException unused) {
            return defpackage.amfk.a;
        }
    }
}
