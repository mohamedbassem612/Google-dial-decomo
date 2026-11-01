package defpackage;

/* JADX WARN: Enum visitor error
jadx.core.utils.exceptions.JadxRuntimeException: Can't remove SSA var: r9v2 adzy[], still in use, count: 1, list:
  (r9v2 adzy[]) from 0x0041: INVOKE (r9v2 adzy[]) STATIC call: ajsz.am(java.lang.Enum[]):aomi A[MD:(java.lang.Enum[]):aomi (m), WRAPPED] (LINE:66)
	at jadx.core.utils.InsnRemover.removeSsaVar(InsnRemover.java:164)
	at jadx.core.utils.InsnRemover.unbindResult(InsnRemover.java:129)
	at jadx.core.utils.InsnRemover.lambda$unbindInsns$1(InsnRemover.java:101)
	at java.base/java.util.ArrayList.forEach(ArrayList.java:1596)
	at jadx.core.utils.InsnRemover.unbindInsns(InsnRemover.java:100)
	at jadx.core.utils.InsnRemover.removeAllAndUnbind(InsnRemover.java:257)
	at jadx.core.dex.visitors.EnumVisitor.convertToEnum(EnumVisitor.java:187)
	at jadx.core.dex.visitors.EnumVisitor.visit(EnumVisitor.java:102)
 */
/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes.dex */
public final class adzy {
    UNKNOWN(0),
    SIGNED_IN(1),
    SIGNED_OUT_ZWIEBACK(2),
    SIGNED_OUT_YOUTUBE_VISITOR(3),
    SIGNED_IN_FITBIT(4);

    public static final /* synthetic */ defpackage.aomi f;
    public final int g;

    static {
        f = defpackage.ajsz.am(adzyVarArr);
    }

    private adzy(int i) {
        super(str, i);
        this.g = i;
    }

    public static defpackage.adzy[] values() {
        return (defpackage.adzy[]) h.clone();
    }
}
