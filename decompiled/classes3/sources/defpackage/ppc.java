package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes3.dex */
public final /* synthetic */ class ppc implements java.util.function.Function {
    private final /* synthetic */ int $cid;
    public final /* synthetic */ java.lang.Object a;
    public final /* synthetic */ java.lang.Object b;
    public final /* synthetic */ java.lang.Object c;
    public final /* synthetic */ java.lang.Object d;

    public /* synthetic */ ppc(j$.util.Optional optional, j$.util.Optional optional2, android.content.Context context, j$.util.Optional optional3, int i) {
        this.$cid = i;
        this.a = optional;
        this.b = optional2;
        this.c = context;
        this.d = optional3;
    }

    @Override // java.util.function.Function
    public final /* synthetic */ java.util.function.Function andThen(java.util.function.Function function) {
        return this.$cid != 0 ? j$.util.function.Function.-CC.$default$andThen(this, function) : j$.util.function.Function.-CC.$default$andThen(this, function);
    }

    /* JADX WARN: Type inference failed for: r0v3, types: [java.lang.Object, java.lang.Runnable] */
    /* JADX WARN: Type inference failed for: r1v5, types: [ajcq, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r5v8, types: [java.lang.Object, java.util.concurrent.Executor] */
    @Override // java.util.function.Function
    public final java.lang.Object apply(java.lang.Object obj) {
        if (this.$cid != 0) {
            ?? r5 = ((oq) this.c).a;
            this.a.c((java.lang.Runnable) this.d, (java.util.concurrent.Executor) r5);
            return this.b;
        }
        defpackage.amdx amdxVar = (defpackage.amdx) obj;
        j$.util.Optional optional = (j$.util.Optional) this.a;
        if (!optional.isPresent()) {
            amdxVar.a = "No connection label.";
            return j$.util.Optional.empty();
        }
        java.lang.Object obj2 = this.d;
        java.lang.Object obj3 = this.c;
        j$.util.Optional optional2 = (j$.util.Optional) this.b;
        if (optional2.isPresent()) {
            int iOrdinal = ((defpackage.svi) optional2.orElseThrow()).ordinal();
            if (iOrdinal == 1) {
                amdxVar.a = "Intra carrier.";
                return j$.util.Optional.of(pez.W((android.content.Context) obj3, 2132019031, (java.lang.String) optional.orElseThrow(), (j$.util.Optional) obj2));
            }
            if (iOrdinal == 2) {
                amdxVar.a = "Frequent SIM suggestion.";
                return j$.util.Optional.of(pez.W((android.content.Context) obj3, 2132019030, (java.lang.String) optional.orElseThrow(), (j$.util.Optional) obj2));
            }
        }
        amdxVar.a = "Calling via connection label";
        return j$.util.Optional.of(pez.W((android.content.Context) obj3, 2132019032, (java.lang.String) optional.orElseThrow(), (j$.util.Optional) obj2));
    }

    @Override // java.util.function.Function
    public final /* synthetic */ java.util.function.Function compose(java.util.function.Function function) {
        return this.$cid != 0 ? j$.util.function.Function.-CC.$default$compose(this, function) : j$.util.function.Function.-CC.$default$compose(this, function);
    }

    public /* synthetic */ ppc(oq oqVar, ajcq ajcqVar, java.lang.Runnable runnable, java.lang.Object obj, int i) {
        this.$cid = i;
        this.c = oqVar;
        this.a = ajcqVar;
        this.d = runnable;
        this.b = obj;
    }
}
