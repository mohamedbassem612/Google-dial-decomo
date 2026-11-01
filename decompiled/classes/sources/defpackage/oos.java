package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes.dex */
public final class oos extends defpackage.aipo {
    private static final defpackage.ajmk c = defpackage.aipm.a;
    private final defpackage.soj a;
    private final java.lang.String b;

    public oos(defpackage.soj sojVar, java.lang.String str) {
        super(str);
        this.a = sojVar;
        java.lang.String strD = defpackage.aiql.d("", str);
        this.b = strD.substring(0, java.lang.Math.min(strD.length(), 23));
    }

    @Override // defpackage.aion
    public final void a(defpackage.aiom aiomVar) {
        java.lang.String str;
        java.lang.Boolean bool = (java.lang.Boolean) aiomVar.n().d(defpackage.zct.a);
        if (bool == null || !bool.booleanValue()) {
            return;
        }
        defpackage.aipi aipiVarG = defpackage.aipi.g(defpackage.aipl.f(), aiomVar.n());
        java.lang.StringBuilder sb = new java.lang.StringBuilder();
        if (defpackage.aiql.f(1, aiomVar.f(), sb)) {
            sb.append(' ');
        }
        c.a(aiomVar, aipiVarG, sb);
        defpackage.soj sojVar = this.a;
        int iE = defpackage.aiql.e(aiomVar.r());
        if (iE == 3) {
            str = "DEBUG";
        } else if (iE == 4) {
            str = "INFO";
        } else if (iE != 5) {
            str = iE != 6 ? "VERBOSE" : "ERROR";
        } else {
            str = "WARN";
        }
        char cCharAt = str.charAt(0);
        java.lang.StringBuilder sb2 = new java.lang.StringBuilder();
        sb2.append(cCharAt);
        sb2.append('/');
        java.lang.String string = sb2.toString();
        java.lang.String strD = d();
        java.lang.String string2 = sb.toString();
        java.lang.Throwable th = (java.lang.Throwable) aiomVar.n().d(defpackage.ainc.a);
        java.util.concurrent.TimeUnit timeUnit = java.util.concurrent.TimeUnit.NANOSECONDS;
        long jE = aiomVar.e() / 1000000;
        java.lang.StringBuilder sb3 = new java.lang.StringBuilder();
        sb3.append(defpackage.soj.a.withLocale(java.util.Locale.getDefault()).withZone(j$.time.ZoneId.systemDefault()).format(j$.time.Instant.ofEpochMilli(jE)));
        sb3.append(' ');
        sb3.append(string);
        sb3.append(strD);
        sb3.append(':');
        sb3.append(string2);
        if (th != null) {
            sb3.append(' ');
            sb3.append(th);
        }
        sojVar.g.add(sb3.toString().getBytes(java.nio.charset.StandardCharsets.UTF_8));
        java.util.concurrent.atomic.AtomicReference atomicReference = sojVar.h;
        ((defpackage.ajcq) atomicReference.get()).cancel(false);
        defpackage.ajwr ajwrVar = sojVar.i;
        defpackage.nya nyaVar = new defpackage.nya(sojVar, 2);
        defpackage.ajbm ajbmVar = defpackage.ajbm.INSTANCE;
        defpackage.ajcq ajcqVarE = ajwrVar.e(nyaVar, ajbmVar);
        atomicReference.set(ajcqVarE);
        defpackage.acgy acgyVar = new defpackage.acgy(sojVar, ajcqVarE, 1);
        long j = defpackage.ahqx.a;
        ajcqVarE.c(new defpackage.ajcc(ajcqVarE, new defpackage.sqh(defpackage.ahns.c(false), new defpackage.sqh(defpackage.ahns.c(false), acgyVar, 2), 2)), ajbmVar);
    }

    @Override // defpackage.aion
    public final boolean b(java.util.logging.Level level) {
        return android.util.Log.isLoggable(this.b, defpackage.aiql.e(level));
    }
}
