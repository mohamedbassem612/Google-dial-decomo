package defpackage;

/* JADX WARN: Enum visitor error
jadx.core.utils.exceptions.JadxRuntimeException: Can't remove SSA var: r5v3 tud[], still in use, count: 1, list:
  (r5v3 tud[]) from 0x002f: INVOKE (r5v3 tud[]) STATIC call: ajsz.am(java.lang.Enum[]):aomi A[WRAPPED] (LINE:48)
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
public final class tud {
    UNKNOWN("unknown"),
    SCAM("scam"),
    NOT_SCAM("not_scam");

    public static final /* synthetic */ aomi d;
    public final java.lang.String e;

    static {
        d = ajsz.am(tudVarArr);
    }

    private tud(java.lang.String str) {
        super(str, i);
        this.e = str;
    }

    public static defpackage.tud[] values() {
        return (defpackage.tud[]) f.clone();
    }
}
