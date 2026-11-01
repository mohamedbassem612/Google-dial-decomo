package defpackage;

/* JADX WARN: Enum visitor error
jadx.core.utils.exceptions.JadxRuntimeException: Can't remove SSA var: r4v3 ruv[], still in use, count: 1, list:
  (r4v3 ruv[]) from 0x002d: INVOKE (r4v3 ruv[]) STATIC call: ajsz.am(java.lang.Enum[]):aomi (LINE:46)
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
public final class ruv {
    DARPA(0),
    TEST_HIGH_PRIORITY_BANNER(defpackage.aehk.NEXT_REQUEST_CODE),
    TEST_LOW_PRIORITY_BANNER(10001);

    public final int d;

    static {
        ajsz.am(ruvVarArr);
    }

    private ruv(int i) {
        super(str, i);
        this.d = i;
    }

    public static defpackage.ruv[] values() {
        return (defpackage.ruv[]) e.clone();
    }
}
