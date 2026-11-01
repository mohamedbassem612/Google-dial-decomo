package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes2.dex */
public final class lyt {
    public final java.lang.Object a;
    public final java.lang.Object b;
    public final java.lang.Object c;

    public lyt(android.content.Context context, aoss aossVar, met metVar) {
        aooh.f(context, "appContext");
        aooh.f(aossVar, "lightweightScope");
        this.a = context;
        this.b = aossVar;
        this.c = metVar;
    }

    /* JADX WARN: Type inference failed for: r4v1, types: [java.lang.Object, java.util.concurrent.Executor] */
    public final ajcq a() {
        ajcq ajcqVarB = ((lht) this.a).b();
        java.lang.Object obj = this.c;
        j$.util.Objects.requireNonNull(obj);
        return ahvr.I(ajcqVarB, new defpackage.kxm(obj, 15), (java.util.concurrent.Executor) this.b);
    }

    public lyt(llz llzVar, lht lhtVar, ajct ajctVar) {
        this.c = llzVar;
        this.a = lhtVar;
        this.b = ajctVar;
    }

    public lyt(defpackage.lyq lyqVar, ucm ucmVar, rlv rlvVar) {
        aooh.f(ucmVar, "tikTokAlertDialogs");
        aooh.f(rlvVar, "loggingBindings");
        this.a = lyqVar;
        this.b = ucmVar;
        this.c = rlvVar;
    }

    public lyt(aoin aoinVar, aoin aoinVar2, aoin aoinVar3) {
        this.a = aoinVar;
        aoinVar2.getClass();
        this.c = aoinVar2;
        aoinVar3.getClass();
        this.b = aoinVar3;
    }
}
