package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes.dex */
public final class annd extends defpackage.annc {
    public final defpackage.anzn a;
    public final defpackage.anry b;

    public annd(defpackage.anrk anrkVar, android.content.Context context, defpackage.ajsz ajszVar) {
        defpackage.anry anryVar = new defpackage.anry();
        context.getClass();
        anryVar.a = context;
        anryVar.i = ajszVar;
        this.b = anryVar;
        this.a = new defpackage.anzn(anrkVar, anrkVar.c(), anryVar);
        h(60L, java.util.concurrent.TimeUnit.SECONDS);
    }

    @Override // defpackage.annc, defpackage.anot
    public final defpackage.anor a() {
        defpackage.anzn anznVar = this.a;
        defpackage.aoag aoagVar = anznVar.g;
        if (aoagVar == null) {
            throw new java.lang.NullPointerException("offloadExecutorPool");
        }
        defpackage.anry anryVar = this.b;
        anryVar.b = aoagVar;
        defpackage.anpp anppVar = defpackage.anrl.a;
        android.content.Context context = anryVar.a;
        if (anznVar.l == null) {
            anznVar.l = new java.util.IdentityHashMap();
        }
        java.util.IdentityHashMap identityHashMap = anznVar.l;
        if (context == null) {
            throw new java.lang.NullPointerException("value");
        }
        identityHashMap.put(anppVar, context);
        return super.a();
    }

    @Override // defpackage.annc
    public final defpackage.anot b() {
        return this.a;
    }

    public final void h(long j, java.util.concurrent.TimeUnit timeUnit) {
        this.a.d(j, timeUnit);
    }
}
