package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes.dex */
public final /* synthetic */ class ahbu extends defpackage.aoof implements defpackage.aonn {
    public static final defpackage.ahbu a = new defpackage.ahbu();

    public ahbu() {
        super(2, defpackage.ahda.class, "<init>", "<init>(Ljava/util/Map;Lcom/google/apps/tiktok/experiments/phenotype/MendelPackageState$Metadata;)V", 0);
    }

    @Override // defpackage.aonn
    public final /* bridge */ /* synthetic */ java.lang.Object a(java.lang.Object obj, java.lang.Object obj2) {
        java.util.Map map = (java.util.Map) obj;
        defpackage.ahcd ahcdVar = (defpackage.ahcd) obj2;
        if (map == null) {
            defpackage.aooh.i("p0");
        }
        if (ahcdVar == null) {
            defpackage.aooh.i("p1");
        }
        return new defpackage.ahda(map, ahcdVar);
    }
}
