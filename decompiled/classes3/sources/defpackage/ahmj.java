package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes3.dex */
public final class ahmj implements ahmi {
    final /* synthetic */ ahla a;
    final /* synthetic */ defpackage.akxm b;
    final /* synthetic */ apjb c;

    public ahmj(ahmk ahmkVar, defpackage.akxm akxmVar, ahla ahlaVar, apjb apjbVar) {
        this.b = akxmVar;
        this.a = ahlaVar;
        this.c = apjbVar;
        j$.util.Objects.requireNonNull(ahmkVar);
    }

    /* JADX WARN: Type inference failed for: r8v1, types: [java.lang.Object, java.util.concurrent.Executor] */
    public final ajcq a(ajcq ajcqVar, j$.time.Duration duration) {
        java.lang.String strB = this.a.b();
        defpackage.akxm akxmVar = this.b;
        return !((java.lang.Boolean) akxmVar.b).booleanValue() ? ajcm.a : ajan.f(((defpackage.ahid) akxmVar.a).a(), ahqx.a(new defpackage.ahmm(akxmVar, ajcqVar, duration, strB, 0)), (java.util.concurrent.Executor) akxmVar.c);
    }

    /* JADX WARN: Type inference failed for: r0v1, types: [java.lang.Object, java.util.concurrent.Executor] */
    public final ajcq b() {
        defpackage.akxm akxmVar = this.b;
        if (!((java.lang.Boolean) akxmVar.b).booleanValue()) {
            return ajcm.a;
        }
        return ajan.f(((defpackage.ahid) akxmVar.a).a(), ahqx.a(new defpackage.ahml(akxmVar, this.a, this.c, 0)), (java.util.concurrent.Executor) akxmVar.c);
    }
}
