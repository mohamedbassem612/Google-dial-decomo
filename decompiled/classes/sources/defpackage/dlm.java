package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes.dex */
public final class dlm {
    public static final java.lang.ThreadLocal a = new java.lang.ThreadLocal();

    public static final android.text.TextDirectionHeuristic a(int i) {
        if (i == 0) {
            return android.text.TextDirectionHeuristics.LTR;
        }
        if (i != 1) {
            return i != 2 ? android.text.TextDirectionHeuristics.FIRSTSTRONG_RTL : android.text.TextDirectionHeuristics.FIRSTSTRONG_LTR;
        }
        return android.text.TextDirectionHeuristics.RTL;
    }
}
