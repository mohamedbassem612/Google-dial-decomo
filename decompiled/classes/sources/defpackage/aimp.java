package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes.dex */
public abstract class aimp {
    public final defpackage.aion a;

    protected aimp(defpackage.aion aionVar) {
        defpackage.aiql.l(aionVar, "backend");
        this.a = aionVar;
    }

    public static void f(java.lang.String str, defpackage.aiom aiomVar) {
        java.lang.StringBuilder sb = new java.lang.StringBuilder();
        java.util.concurrent.TimeUnit timeUnit = java.util.concurrent.TimeUnit.NANOSECONDS;
        sb.append(new java.text.SimpleDateFormat("yyyy-MM-dd'T'HH:mm:ss.SSSZ").format(new java.util.Date(aiomVar.e() / 1000000)));
        sb.append(": logging error [");
        defpackage.aiql.f(1, aiomVar.f(), sb);
        sb.append("]: ");
        sb.append(str);
        java.lang.System.err.println(sb);
        java.lang.System.err.flush();
    }

    public abstract defpackage.ainm a(java.util.logging.Level level);

    public final defpackage.ainm b() {
        return a(java.util.logging.Level.INFO);
    }

    public final defpackage.ainm c() {
        return a(java.util.logging.Level.SEVERE);
    }

    public final defpackage.ainm d() {
        return a(java.util.logging.Level.WARNING);
    }

    protected final java.lang.String e() {
        return this.a.d();
    }

    protected final boolean g(java.util.logging.Level level) {
        return this.a.b(level);
    }
}
