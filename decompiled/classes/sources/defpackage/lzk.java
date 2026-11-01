package defpackage;

/* JADX WARN: Enum visitor error
jadx.core.utils.exceptions.JadxRuntimeException: Can't remove SSA var: r9v3 lzk[], still in use, count: 1, list:
  (r9v3 lzk[]) from 0x004b: INVOKE (r9v3 lzk[]) STATIC call: ajsz.am(java.lang.Enum[]):aomi A[MD:(java.lang.Enum[]):aomi (m)] (LINE:76)
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
public final class lzk {
    HALO("halo"),
    WIFI_CALLING_ICONS("wifi_calling_icons"),
    BEESLY("beesly"),
    STIR_SHAKEN("stir_shaken"),
    TEST_ONLY_KEY("test_only_key");

    public final java.lang.String f;

    static {
        defpackage.ajsz.am(lzkVarArr);
    }

    private lzk(java.lang.String str) {
        super(str, i);
        this.f = str;
    }

    public static defpackage.lzk[] values() {
        return (defpackage.lzk[]) g.clone();
    }
}
