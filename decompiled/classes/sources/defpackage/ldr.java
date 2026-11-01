package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes.dex */
public final /* synthetic */ class ldr implements defpackage.aoin {
    private final /* synthetic */ int $cid;
    public final /* synthetic */ android.content.Context a;
    public final /* synthetic */ java.lang.Object b;
    public final /* synthetic */ java.lang.Object c;
    public final /* synthetic */ java.lang.Object d;
    public final /* synthetic */ java.lang.Object e;
    public final /* synthetic */ java.lang.Object f;
    public final /* synthetic */ java.lang.Object g;
    public final /* synthetic */ java.lang.Object h;

    public /* synthetic */ ldr(defpackage.aogc aogcVar, defpackage.ajct ajctVar, android.content.Context context, defpackage.ahzi ahziVar, defpackage.ahbz ahbzVar, defpackage.adae adaeVar, defpackage.aoin aoinVar, defpackage.jvp jvpVar, int i) {
        this.$cid = i;
        this.h = aogcVar;
        this.d = ajctVar;
        this.a = context;
        this.e = ahziVar;
        this.b = ahbzVar;
        this.g = adaeVar;
        this.c = aoinVar;
        this.f = jvpVar;
    }

    /* JADX WARN: Type inference failed for: r0v10, types: [java.lang.Object, java.util.concurrent.Executor] */
    /* JADX WARN: Type inference failed for: r0v6, types: [java.lang.Object, java.util.concurrent.Executor] */
    @Override // defpackage.aoin, defpackage.aoim
    public final java.lang.Object a() {
        if (this.$cid == 0) {
            ((defpackage.aimw) ((defpackage.aimw) defpackage.lds.a.b()).l("com/android/dialer/callscreen/impl/mdd/FileGroupPopulatorModule", "provideFileGroupPopulator", 51, "FileGroupPopulatorModule.java")).v("providing ManifestFileGroupPopulator");
            ?? r0 = this.c;
            java.lang.Object obj = this.b;
            defpackage.adao adaoVar = new defpackage.adao((defpackage.aogc) obj, (java.util.concurrent.Executor) r0);
            defpackage.adcm adcmVar = new defpackage.adcm();
            adcmVar.b(this.a);
            adcmVar.c = this.d;
            adcmVar.h = adaoVar;
            adcmVar.e = r0;
            adcmVar.g = this.e;
            adcmVar.d = obj;
            adcmVar.i = this.h;
            adcmVar.b = new exm(this.f, 9);
            adcmVar.f = defpackage.ahyn.h(this.g);
            return adcmVar.a();
        }
        ?? r1 = this.d;
        java.lang.Object obj2 = this.h;
        defpackage.adao adaoVar2 = new defpackage.adao((defpackage.aogc) obj2, (java.util.concurrent.Executor) r1);
        defpackage.adcm adcmVar2 = new defpackage.adcm();
        adcmVar2.b(this.a);
        adcmVar2.c = this.e;
        adcmVar2.h = adaoVar2;
        adcmVar2.e = r1;
        adcmVar2.g = this.b;
        adcmVar2.d = obj2;
        adcmVar2.i = this.g;
        java.lang.Object obj3 = this.c;
        j$.util.Objects.requireNonNull(obj3);
        adcmVar2.b = new defpackage.hlv(obj3, 4);
        adcmVar2.f = defpackage.ahyn.h(this.f);
        return adcmVar2.a();
    }

    public /* synthetic */ ldr(defpackage.aogc aogcVar, defpackage.ajct ajctVar, android.content.Context context, defpackage.ahzi ahziVar, defpackage.ahbz ahbzVar, defpackage.adae adaeVar, defpackage.lcx lcxVar, defpackage.ldu lduVar, int i) {
        this.$cid = i;
        this.b = aogcVar;
        this.c = ajctVar;
        this.a = context;
        this.d = ahziVar;
        this.e = ahbzVar;
        this.h = adaeVar;
        this.f = lcxVar;
        this.g = lduVar;
    }
}
