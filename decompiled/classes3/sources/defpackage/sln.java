package defpackage;

/* JADX WARN: Enum visitor error
jadx.core.utils.exceptions.JadxRuntimeException: Can't remove SSA var: r4v4 sln[], still in use, count: 1, list:
  (r4v4 sln[]) from 0x0059: INVOKE (r4v4 sln[]) STATIC call: ajsz.am(java.lang.Enum[]):aomi A[WRAPPED] (LINE:90)
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
public final class sln {
    TEAL(-63508358556024832L, 2132018217),
    OLIVE(-54244178523062272L, 2132018216),
    CORAL(-19039899260813312L, 2132018215),
    VIOLET(-42102924452560896L, 2132018218);

    public static final /* synthetic */ aomi e;
    public final long f;
    public final int g;

    static {
        e = ajsz.am(slnVarArr);
    }

    private sln(long j, int i) {
        super(str, i);
        this.f = j;
        this.g = i;
    }

    public static defpackage.sln[] values() {
        return (defpackage.sln[]) h.clone();
    }
}
