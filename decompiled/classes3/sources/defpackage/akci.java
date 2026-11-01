package defpackage;

/* JADX WARN: Enum visitor error
jadx.core.utils.exceptions.JadxRuntimeException: Can't remove SSA var: r9v3 akci[], still in use, count: 1, list:
  (r9v3 akci[]) from 0x004b: INVOKE (r9v3 akci[]) STATIC call: ajsz.am(java.lang.Enum[]):aomi (LINE:76)
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
public final class akci {
    SUCCESS("success"),
    FAILURE("failure"),
    OK_HTTP_FALLBACK("ok_http_fallback"),
    CRONET_LOAD_EXCEPTION("cronet_load_exception"),
    JAVA_FALLBACK("java_fallback");

    public final java.lang.String f;

    static {
        ajsz.am(akciVarArr);
    }

    private akci(java.lang.String str) {
        super(str, i);
        this.f = str;
    }

    public static defpackage.akci[] values() {
        return (defpackage.akci[]) g.clone();
    }
}
