package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes.dex */
public final class anrz implements defpackage.anvv {
    final android.content.Context a;
    final java.util.concurrent.Executor b;
    final defpackage.aoag c;
    final defpackage.aoag d;
    final defpackage.anrt e;
    final defpackage.anro f;
    final defpackage.anrq g;
    java.util.concurrent.ScheduledExecutorService h;
    java.util.concurrent.Executor i;
    private boolean j;

    /* JADX WARN: Type inference failed for: r4v4, types: [java.lang.Object, java.util.concurrent.Executor] */
    public anrz(defpackage.anry anryVar) {
        android.content.Context context = anryVar.a;
        context.getClass();
        this.a = context;
        anryVar.i.getClass();
        java.util.concurrent.Executor executor = anryVar.c;
        this.b = executor == null ? ft$.ExternalSyntheticApiModelOutline0.m(context) : executor;
        defpackage.aoag aoagVar = anryVar.d;
        aoagVar.getClass();
        this.c = aoagVar;
        defpackage.aoag aoagVar2 = anryVar.b;
        aoagVar2.getClass();
        this.d = aoagVar2;
        defpackage.anrt anrtVar = anryVar.e;
        anrtVar.getClass();
        this.e = anrtVar;
        defpackage.anro anroVar = anryVar.f;
        anroVar.getClass();
        this.f = anroVar;
        defpackage.anrq anrqVar = anryVar.g;
        anrqVar.getClass();
        this.g = anrqVar;
        this.h = (java.util.concurrent.ScheduledExecutorService) aoagVar.a();
        this.i = aoagVar2.a();
    }

    @Override // defpackage.anvv
    public final /* bridge */ /* synthetic */ anwc a(java.net.SocketAddress socketAddress, anvu anvuVar, defpackage.anmd anmdVar) {
        if (this.j) {
            throw new java.lang.IllegalStateException("The transport factory is closed.");
        }
        return new anrx(this, (defpackage.anrk) socketAddress, anvuVar);
    }

    @Override // defpackage.anvv
    public final java.util.Collection b() {
        return java.util.Collections.singleton(defpackage.anrk.class);
    }

    @Override // defpackage.anvv
    public final java.util.concurrent.ScheduledExecutorService c() {
        return this.h;
    }

    @Override // defpackage.anvv, java.io.Closeable, java.lang.AutoCloseable
    public final void close() {
        if (this.j) {
            return;
        }
        this.j = true;
        this.c.b(this.h);
        this.h = null;
        this.d.b(this.i);
        this.i = null;
    }
}
