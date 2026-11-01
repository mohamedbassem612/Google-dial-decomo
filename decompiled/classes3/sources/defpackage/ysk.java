package defpackage;

/* JADX WARN: Enum visitor error
jadx.core.utils.exceptions.JadxRuntimeException: Can't remove SSA var: r2v6 ysk[], still in use, count: 1, list:
  (r2v6 ysk[]) from 0x0124: INVOKE (r1v5 aojo) = (r2v6 ysk[]) STATIC call: ajsz.am(java.lang.Enum[]):aomi (LINE:293)
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
public final class ysk {
    DIALER_SMART_NOTES(208),
    DIALER_SMART_NOTES_2(217),
    DIALER_SMART_NOTES_3(218),
    DIALER_SMART_NOTES_4(219),
    DIALER_SMART_REPLY(209),
    DIALER_BEESLY(290),
    DIALER_SCAM_GUARD(237),
    DIALER_SCAM_GUARD_LLM(309),
    DIALER_SCAM_GUARD_US(401),
    DIALER_SCAM_GUARD_IN(402),
    DIALER_SCAM_GUARD_JP(403),
    DIALER_CALL_SCREEN_LITE(307),
    DIALER_AGENTIC_CALL_SCREEN(305),
    DIALER_CALL_CONTEXT(306),
    LLM_IT_PER_LAYER_GEM(108),
    TEST_DIALER_AI_CORE_FEATURE(9999),
    UNKNOWN(-1);

    public static final java.util.Map a;
    private static final /* synthetic */ aomi t;
    private final int u;

    static {
        aojo aojoVarAm = ajsz.am(yskVarArr);
        t = aojoVarAm;
        java.util.LinkedHashMap linkedHashMap = new java.util.LinkedHashMap(aooc.t(ajsz.aL(ajsz.bl(aojoVarAm, 10)), 16));
        aojl aojlVar = new aojl(aojoVarAm);
        while (aojlVar.hasNext()) {
            java.lang.Object next = aojlVar.next();
            linkedHashMap.put(java.lang.Integer.valueOf(((defpackage.ysk) next).u), next);
        }
        a = linkedHashMap;
    }

    private ysk(int i) {
        super(str, i);
        this.u = i;
    }

    public static defpackage.ysk[] values() {
        return (defpackage.ysk[]) s.clone();
    }
}
