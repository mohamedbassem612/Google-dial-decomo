package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes.dex */
public final class ajwp {
    public static final long a;
    public static final java.util.regex.Pattern b;
    private static defpackage.ajwp c;

    static {
        java.util.concurrent.TimeUnit timeUnit = java.util.concurrent.TimeUnit.HOURS;
        a = 3600L;
        b = java.util.regex.Pattern.compile("\\AA[\\w-]{38}\\z");
    }

    public static defpackage.ajwp b() {
        if (defpackage.ajsz.h == null) {
            defpackage.ajsz.h = new defpackage.ajsz((float[]) null);
        }
        defpackage.ajwp ajwpVar = c;
        if (ajwpVar != null) {
            return ajwpVar;
        }
        defpackage.ajwp ajwpVar2 = new defpackage.ajwp();
        c = ajwpVar2;
        return ajwpVar2;
    }

    public final long a() {
        java.util.concurrent.TimeUnit timeUnit = java.util.concurrent.TimeUnit.MILLISECONDS;
        return java.lang.System.currentTimeMillis() / 1000;
    }

    public final boolean c(defpackage.ajwt ajwtVar) {
        if (android.text.TextUtils.isEmpty(ajwtVar.b)) {
            return true;
        }
        return ajwtVar.e + ajwtVar.d < a() + a;
    }
}
