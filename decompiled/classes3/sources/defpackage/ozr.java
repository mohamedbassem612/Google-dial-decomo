package defpackage;

/* JADX WARN: Enum visitor error
jadx.core.utils.exceptions.JadxRuntimeException: Can't remove SSA var: r4v3 ozr[], still in use, count: 1, list:
  (r4v3 ozr[]) from 0x002f: INVOKE (r4v3 ozr[]) STATIC call: ajsz.am(java.lang.Enum[]):aomi (LINE:48)
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
public final class ozr {
    ANSWER(defpackage.amnx.TAP_ANSWER),
    REJECT(defpackage.amnx.TAP_REJECT),
    TOUCHED_OUTSIDE_BUTTONS(defpackage.amnx.TOUCHED_OUTSIDE_BUTTONS);

    public final defpackage.amnx d;

    static {
        ajsz.am(ozrVarArr);
    }

    private ozr(defpackage.amnx amnxVar) {
        super(str, i);
        this.d = amnxVar;
    }

    public static defpackage.ozr[] values() {
        return (defpackage.ozr[]) e.clone();
    }
}
