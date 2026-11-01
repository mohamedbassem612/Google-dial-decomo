package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes.dex */
public final class eew implements defpackage.efa {
    private final defpackage.albh a;
    private final defpackage.akzq b;

    public eew(defpackage.albh albhVar, defpackage.akzq akzqVar) {
        if (albhVar == null) {
            defpackage.aooh.i("defaultValue");
        }
        if (akzqVar == null) {
            defpackage.aooh.i("extensionRegistryLite");
        }
        this.a = albhVar;
        this.b = akzqVar;
    }

    @Override // defpackage.efa
    public final /* synthetic */ java.lang.Object a() {
        return this.a;
    }

    @Override // defpackage.efa
    public final java.lang.Object b(java.io.InputStream inputStream) throws defpackage.ecp {
        try {
            java.lang.Object objI = this.a.N().i(inputStream, this.b);
            if (objI == null) {
                defpackage.aooh.h("null cannot be cast to non-null type T of androidx.datastore.core.ProtoSerializer");
            }
            return objI;
        } catch (defpackage.alaz e) {
            throw new defpackage.ecp("Cannot read proto.", e);
        }
    }

    @Override // defpackage.efa
    public final /* bridge */ /* synthetic */ java.lang.Object c(java.lang.Object obj, java.io.OutputStream outputStream) {
        ((defpackage.albh) obj).h(outputStream);
        return defpackage.aojh.a;
    }

    /* JADX WARN: Illegal instructions before constructor call */
    public /* synthetic */ eew(defpackage.albh albhVar) {
        defpackage.akzq akzqVar = defpackage.akzq.a;
        defpackage.aooh.e(akzqVar, "getEmptyRegistry(...)");
        this(albhVar, akzqVar);
    }
}
