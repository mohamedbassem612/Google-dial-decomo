package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes3.dex */
public final /* synthetic */ class ahdt extends aoof implements aonn {
    public static final defpackage.ahdt a = new defpackage.ahdt();

    public ahdt() {
        super(2, ahda.class, "<init>", "<init>(Ljava/util/Map;Lcom/google/apps/tiktok/experiments/phenotype/MendelPackageState$Metadata;)V", 0);
    }

    public final /* bridge */ /* synthetic */ java.lang.Object a(java.lang.Object obj, java.lang.Object obj2) {
        java.util.Map map = (java.util.Map) obj;
        ahcd ahcdVar = (ahcd) obj2;
        aooh.f(map, "p0");
        aooh.f(ahcdVar, "p1");
        return new ahda(map, ahcdVar);
    }
}
