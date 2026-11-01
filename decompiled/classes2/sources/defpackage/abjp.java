package defpackage;

/* JADX WARN: Enum visitor error
jadx.core.utils.exceptions.JadxRuntimeException: Can't remove SSA var: r7v2 abjp[], still in use, count: 1, list:
  (r7v2 abjp[]) from 0x0035: INVOKE (r7v2 abjp[]) STATIC call: ajsz.am(java.lang.Enum[]):aomi (LINE:54)
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
public final class abjp {
    Top(true, false),
    Middle(false, false),
    Bottom(false, true),
    Standalone(true, true);

    public final boolean e;
    public final boolean f;

    static {
        ajsz.am(abjpVarArr);
    }

    private abjp(boolean z, boolean z2) {
        super(str, i);
        this.e = z;
        this.f = z2;
    }

    public static defpackage.abjp[] values() {
        return (defpackage.abjp[]) g.clone();
    }
}
