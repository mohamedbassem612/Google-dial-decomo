package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes.dex */
public final class sry {
    public static final /* synthetic */ int b = 0;
    private static final java.util.Set c = defpackage.ajsz.cW(new defpackage.rmt[]{defpackage.rmt.SOURCE_TYPE_PLACES, defpackage.rmt.SOURCE_TYPE_CNAP, defpackage.rmt.SOURCE_TYPE_CEQUINT_CALLER_ID, defpackage.rmt.SOURCE_TYPE_REMOTE_OTHER, defpackage.rmt.SOURCE_TYPE_REMOTE_MANUAL, defpackage.rmt.SOURCE_TYPE_REMOTE_GOOGLE_VOICE, defpackage.rmt.SOURCE_TYPE_REMOTE_CSA, defpackage.rmt.SOURCE_TYPE_REMOTE_KNOWLEDGE_GRAPH, defpackage.rmt.SOURCE_TYPE_B2C_ENRICHED_CALLING});
    public final defpackage.oko a;
    private final defpackage.aoin d;
    private final j$.util.concurrent.ConcurrentHashMap e;

    public sry(defpackage.oko okoVar, defpackage.aoin aoinVar) {
        if (aoinVar == null) {
            defpackage.aooh.i("ignoreCnapPhoneNumber");
        }
        this.a = okoVar;
        this.d = aoinVar;
        this.e = new j$.util.concurrent.ConcurrentHashMap();
    }

    public final boolean a(defpackage.rmt rmtVar, android.telecom.PhoneAccountHandle phoneAccountHandle, boolean z) {
        defpackage.aooh.f(rmtVar, "sourceType");
        defpackage.aooh.f(phoneAccountHandle, "phoneAccountHandle");
        return !(((java.lang.Boolean) this.d.a()).booleanValue() && rmtVar == defpackage.rmt.SOURCE_TYPE_CNAP && z) && c.contains(rmtVar) && defpackage.aooh.n((java.lang.String) j$.util.concurrent.ConcurrentMap.-EL.computeIfAbsent(this.e, phoneAccountHandle, new pei(new skx(this, 16), 17)), "IN");
    }
}
