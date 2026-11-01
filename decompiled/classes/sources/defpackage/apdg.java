package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes.dex */
public final /* synthetic */ class apdg extends defpackage.aoof implements defpackage.aono {
    public static final defpackage.apdg a = new defpackage.apdg();

    public apdg() {
        super(3, defpackage.apdh.class, "register", "register(Lkotlinx/coroutines/selects/SelectInstance;Ljava/lang/Object;)V", 0);
    }

    @Override // defpackage.aono
    public final /* synthetic */ java.lang.Object a(java.lang.Object obj, java.lang.Object obj2, java.lang.Object obj3) {
        defpackage.apdh apdhVar = (defpackage.apdh) obj;
        defpackage.apdm apdmVar = (defpackage.apdm) obj2;
        long j = apdhVar.a;
        if (j <= 0) {
            apdmVar.e = defpackage.aojh.a;
        } else {
            defpackage.anxz anxzVar = new defpackage.anxz(apdmVar, apdhVar, 12, (byte[]) null);
            defpackage.aooh.d(apdmVar, "null cannot be cast to non-null type kotlinx.coroutines.selects.SelectImplementation<*>");
            defpackage.aolr aolrVar = apdmVar.a;
            apdmVar.c = defpackage.aosv.l(aolrVar).c(j, anxzVar, aolrVar);
        }
        return defpackage.aojh.a;
    }
}
