package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes.dex */
public final class aiqb extends defpackage.aipo {
    public static final java.util.Set a;
    public static final defpackage.aioy b;
    public static final defpackage.aipz c;
    private final java.lang.String d;
    private final java.util.logging.Level e;
    private final java.util.Set f;
    private final defpackage.aioy g;
    private final int h;

    static {
        java.util.Set setUnmodifiableSet = j$.util.DesugarCollections.unmodifiableSet(new java.util.HashSet(java.util.Arrays.asList(defpackage.ainc.a, defpackage.aiog.a, defpackage.aioh.a)));
        a = setUnmodifiableSet;
        defpackage.aiou aiouVar = new defpackage.aiou(defpackage.aipb.a);
        aiouVar.d = defpackage.aipb.b;
        aiouVar.a(setUnmodifiableSet);
        defpackage.aiov aiovVar = new defpackage.aiov(aiouVar);
        b = aiovVar;
        c = new defpackage.aipz("", true, 2, java.util.logging.Level.ALL, setUnmodifiableSet, aiovVar);
    }

    public aiqb(java.lang.String str, java.lang.String str2, boolean z, int i, java.util.logging.Level level, java.util.Set set, defpackage.aioy aioyVar) {
        super(str2);
        java.lang.String strD = defpackage.aiql.d(str, str2);
        this.d = z ? strD.substring(0, java.lang.Math.min(strD.length(), 23)) : strD;
        this.h = i;
        this.e = level;
        this.f = set;
        this.g = aioyVar;
    }

    public static void e(defpackage.aiom aiomVar, java.lang.String str, int i, java.util.logging.Level level, java.util.Set set, defpackage.aioy aioyVar) {
        java.lang.String string;
        java.lang.Boolean bool = (java.lang.Boolean) aiomVar.n().d(defpackage.aioh.a);
        if (bool == null || !bool.booleanValue()) {
            defpackage.aipi aipiVarG = defpackage.aipi.g(defpackage.aipl.f(), aiomVar.n());
            boolean z = aiomVar.r().intValue() < level.intValue();
            if (i != 2 || z || defpackage.aipm.b(aiomVar, aipiVarG, set)) {
                java.lang.StringBuilder sb = new java.lang.StringBuilder();
                if (defpackage.aiql.f(i, aiomVar.f(), sb)) {
                    sb.append(' ');
                }
                if (!z || aiomVar.o() == null) {
                    defpackage.aiqz.e(aiomVar, sb);
                    defpackage.aipm.c(aipiVarG, aioyVar, sb);
                } else {
                    sb.append("(REDACTED) ");
                    sb.append(aiomVar.o().b);
                }
                string = sb.toString();
            } else {
                string = defpackage.aipm.a(aiomVar);
            }
            java.lang.Throwable th = (java.lang.Throwable) aiomVar.n().d(defpackage.ainc.a);
            int iE = defpackage.aiql.e(aiomVar.r());
            if (iE == 2) {
                android.util.Log.v(str, string, th);
                return;
            }
            if (iE == 3) {
                android.util.Log.d(str, string, th);
                return;
            }
            if (iE == 4) {
                android.util.Log.i(str, string, th);
            } else if (iE != 5) {
                android.util.Log.e(str, string, th);
            } else {
                android.util.Log.w(str, string, th);
            }
        }
    }

    @Override // defpackage.aion
    public final void a(defpackage.aiom aiomVar) {
        e(aiomVar, this.d, this.h, this.e, this.f, this.g);
    }

    @Override // defpackage.aion
    public final boolean b(java.util.logging.Level level) {
        java.lang.String str = this.d;
        int iE = defpackage.aiql.e(level);
        return android.util.Log.isLoggable(str, iE) || android.util.Log.isLoggable("all", iE);
    }
}
