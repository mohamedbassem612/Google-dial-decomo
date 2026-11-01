package defpackage;

/* JADX WARN: Enum visitor error
jadx.core.utils.exceptions.JadxRuntimeException: Can't remove SSA var: r6v3 kbg[], still in use, count: 1, list:
  (r6v3 kbg[]) from 0x0041: INVOKE (r6v3 kbg[]) STATIC call: ajsz.am(java.lang.Enum[]):aomi (LINE:66)
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
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes2.dex */
public final class kbg {
    INCOMING(2131231344),
    OUTGOING(2131231341),
    MISSED(2131231343),
    BLOCKED(2131231319);

    public final int e;

    static {
        ajsz.am(kbgVarArr);
    }

    private kbg(int i) {
        super(str, i);
        this.e = i;
    }

    public static defpackage.kbg[] values() {
        return (defpackage.kbg[]) f.clone();
    }
}
