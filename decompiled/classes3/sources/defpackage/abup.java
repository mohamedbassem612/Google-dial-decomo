package defpackage;

/* JADX WARN: Enum visitor error
jadx.core.utils.exceptions.JadxRuntimeException: Can't remove SSA var: r7v2 abup[], still in use, count: 1, list:
  (r7v2 abup[]) from 0x0035: INVOKE (r7v2 abup[]) STATIC call: ajsz.am(java.lang.Enum[]):aomi A[WRAPPED] (LINE:54)
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
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes3.dex */
public final class abup {
    UNKNOWN(0),
    CONTACT(1),
    MCC(2),
    SELF(3);

    public static final /* synthetic */ aomi e;
    public final int f;

    static {
        e = ajsz.am(abupVarArr);
    }

    private abup(int i) {
        super(str, i);
        this.f = i;
    }

    public static defpackage.abup[] values() {
        return (defpackage.abup[]) g.clone();
    }
}
