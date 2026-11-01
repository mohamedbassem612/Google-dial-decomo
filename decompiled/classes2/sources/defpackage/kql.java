package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes2.dex */
public final class kql {
    public static final aimz a = aimz.i("com/android/dialer/callnotesinfra/summarizer/callaction/CallActionValidation");
    public static final alcf b;
    public static final java.util.regex.Pattern c;

    static {
        alcf alcfVar = aldi.b;
        aooh.e(alcfVar, "EPOCH");
        b = alcfVar;
        java.util.regex.Pattern patternCompile = java.util.regex.Pattern.compile("^[\\+\\-0-9]+$");
        aooh.e(patternCompile, "compile(...)");
        c = patternCompile;
    }
}
