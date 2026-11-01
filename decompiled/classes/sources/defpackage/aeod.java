package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes.dex */
public final class aeod {
    public final java.util.concurrent.Executor a;
    public final java.util.Set b;
    public defpackage.akzx c;
    public final defpackage.aevd d;
    private final java.util.concurrent.Executor e;

    public aeod(java.util.concurrent.Executor executor, java.util.Set set, defpackage.aevd aevdVar) {
        this.a = executor;
        this.d = aevdVar;
        this.e = new defpackage.ajdc(executor);
        this.b = set;
    }

    public final defpackage.ajcq a(aeob aeobVar) {
        return defpackage.aiql.C(new aeoc(this, aeobVar), this.e);
    }
}
