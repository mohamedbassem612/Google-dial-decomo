package defpackage;

/* JADX WARN: Enum visitor error
jadx.core.utils.exceptions.JadxRuntimeException: Can't remove SSA var: r5v3 ukv[], still in use, count: 1, list:
  (r5v3 ukv[]) from 0x002f: INVOKE (r0v1 aojo) = (r5v3 ukv[]) STATIC call: ajsz.am(java.lang.Enum[]):aomi (LINE:48)
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
public final class ukv {
    BLOCK_AND_REPORT_AS_SPAM("com.android.dialer.spamnotification.BLOCK_AND_REPORT_AS_SPAM"),
    ENABLE_SPAM_BLOCKING("com.android.dialer.spamnotification.ENABLE_SPAM_BLOCKING"),
    REPORT_AS_NOT_SPAM("com.android.dialer.spamnotification.REPORT_AS_NOT_SPAM");

    public static final java.util.Map a;
    private static final /* synthetic */ aomi g;
    public final java.lang.String e;

    static {
        aojo aojoVarAm = ajsz.am(ukvVarArr);
        g = aojoVarAm;
        java.util.LinkedHashMap linkedHashMap = new java.util.LinkedHashMap(aooc.t(ajsz.aL(ajsz.bl(aojoVarAm, 10)), 16));
        aojl aojlVar = new aojl(aojoVarAm);
        while (aojlVar.hasNext()) {
            java.lang.Object next = aojlVar.next();
            linkedHashMap.put(((defpackage.ukv) next).e, next);
        }
        a = linkedHashMap;
    }

    private ukv(java.lang.String str) {
        super(str, i);
        this.e = str;
    }

    public static defpackage.ukv[] values() {
        return (defpackage.ukv[]) f.clone();
    }
}
