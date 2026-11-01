package defpackage;

/* JADX WARN: Enum visitor error
jadx.core.utils.exceptions.JadxRuntimeException: Can't remove SSA var: r8v3 ozp[], still in use, count: 1, list:
  (r8v3 ozp[]) from 0x004b: INVOKE (r8v3 ozp[]) STATIC call: ajsz.am(java.lang.Enum[]):aomi (LINE:76)
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
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes4.dex */
public final class ozp {
    ANSWER(amnv.b),
    REJECT(amnv.c),
    NO_ACTION(amnv.d),
    CANCELED(amnv.e),
    TOUCHED_OUTSIDE_PUCK(amnv.f);

    public final amnv f;

    static {
        ajsz.am(ozpVarArr);
    }

    private ozp(amnv amnvVar) {
        super(str, i);
        this.f = amnvVar;
    }

    public static defpackage.ozp[] values() {
        return (defpackage.ozp[]) g.clone();
    }
}
