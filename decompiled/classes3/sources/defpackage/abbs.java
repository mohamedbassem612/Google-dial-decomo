package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes3.dex */
public final class abbs implements java.io.Closeable, defpackage.abbo {
    private static final aimz a = aimz.i("com/google/android/libraries/abuse/hades/moirai/service/MoiraiExecutor");
    private final defpackage.abbn b;

    public abbs(defpackage.abbn abbnVar) {
        aooh.f(abbnVar, "protections");
        this.b = abbnVar;
    }

    /* JADX INFO: Thrown type has an unknown type hierarchy: abbe */
    /* JADX INFO: Thrown type has an unknown type hierarchy: com.google.android.libraries.abuse.hades.tartarus.core.F */
    @Override // defpackage.abbo
    public final defpackage.abbb a(defpackage.abba abbaVar, aolr aolrVar) throws com.google.android.libraries.abuse.hades.tartarus.core.F, abbe {
        aooh.f(abbaVar, "request");
        aooh.f(aolrVar, "coroutineContext");
        int i = aork.a;
        defpackage.aorl aorlVar = new defpackage.aorl(aork.a());
        defpackage.ajyu ajyuVarC = abbaVar.c();
        aooh.f(ajyuVarC, "request");
        aooh.f(aolrVar, "coroutineContext");
        aooh.f(ajyuVarC, "request");
        aooh.f(aolrVar, "coroutineContext");
        defpackage.abbn abbnVar = this.b;
        defpackage.abck abckVar = abbnVar.c.a;
        if (abckVar.b) {
            throw new com.google.android.libraries.abuse.hades.tartarus.core.F(alez.j, aley.p);
        }
        com.google.android.libraries.abuse.hades.tartarus.core.E e = abckVar.a;
        aooh.f(ajyuVarC, "request");
        aooh.f(aolrVar, "coroutineContext");
        com.google.android.libraries.abuse.hades.tartarus.core.C cCI = afsq.cI(ajyuVarC);
        com.google.android.libraries.abuse.hades.tartarus.core.images.U u = (com.google.android.libraries.abuse.hades.tartarus.core.images.U) aolrVar.get(com.google.android.libraries.abuse.hades.tartarus.core.images.U.a);
        if (u == null) {
            u = (com.google.android.libraries.abuse.hades.tartarus.core.images.U) aooh.q(e.a);
        }
        com.google.android.libraries.abuse.hades.tartarus.core.C cJ = e.j(cCI, u);
        defpackage.ajyu ajyuVar = new defpackage.ajyu();
        int i2 = cJ.d;
        java.nio.ByteBuffer byteBuffer = cJ.c;
        aooh.f(byteBuffer, "_bb");
        aooh.f(byteBuffer, "_bb");
        ajyuVar.l(i2, byteBuffer);
        defpackage.aorm aormVar = new defpackage.aorm(ajyuVar, defpackage.aorl.a(aorlVar.a));
        defpackage.ajyu ajyuVar2 = (defpackage.ajyu) aormVar.a;
        if (ajyuVar2.D() == null) {
            throw new abbe(alez.g, aley.l, (java.lang.String) null, (java.lang.Throwable) null, abbnVar.a, abbnVar.b, defpackage.abay.b, 12);
        }
        defpackage.ajyu ajyuVarD = ajyuVar2.D();
        aooh.c(ajyuVarD);
        a.b().l("com/google/android/libraries/abuse/hades/moirai/service/MoiraiExecutor", "logVerdict", 37, "MoiraiExecutor.kt").v("Classification performed");
        aish aishVarF = aish.g.f();
        akzc akzcVar = abbnVar.a;
        aishVarF.k(akzcVar.D());
        defpackage.ajyu.J(ajyuVarD);
        ajyuVarD.o();
        long j = aormVar.b;
        j$.time.Duration durationOfSeconds = j$.time.Duration.ofSeconds(aorh.i(j), aorh.c(j));
        aooh.e(durationOfSeconds, "toComponents-impl(...)");
        return new defpackage.abbb(ajyuVar2, durationOfSeconds, akzcVar, abbnVar.b, defpackage.abay.b);
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public final void close() {
        this.b.close();
    }
}
