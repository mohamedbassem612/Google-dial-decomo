package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes2.dex */
public final class lyo {
    public final java.lang.Object a;
    public final java.lang.Object b;
    public final java.lang.Object c;
    public java.lang.Object d;
    public final java.lang.Object e;
    public final java.lang.Object f;
    public final java.lang.Object g;

    public lyo(zpz zpzVar, aoss aossVar, aolr aolrVar, ahbv ahbvVar, qbe qbeVar) {
        aooh.f(zpzVar, "inCallUpdatePropagator");
        aooh.f(aossVar, "lightweightScope");
        aooh.f(aolrVar, "lightweightContext");
        aooh.f(ahbvVar, "dialerPhoneNumbers");
        aooh.f(qbeVar, "inCallLogging");
        this.b = zpzVar;
        this.c = aossVar;
        this.e = aolrVar;
        this.g = ahbvVar;
        this.a = qbeVar;
        this.f = new ahda((byte[]) null);
        defpackage.hkd hkdVar = defpackage.hkd.a;
        aooh.e(hkdVar, "getDefaultInstance(...)");
        this.d = new defpackage.ofv(null, hkdVar);
    }

    public static final android.content.Intent a(android.content.Context context, kiu kiuVar) {
        aooh.f(kiuVar, "coalescedRow");
        android.content.Intent intent = new android.content.Intent(context, (java.lang.Class<?>) com.android.dialer.conversationhistorycalldetails.ConversationHistoryCallDetailsWrapperActivity.class);
        akmr.t(intent, "coalesced_row", kiuVar);
        intent.putExtra("should_destroy_on_large_screen_landscape ", true);
        return intent;
    }

    public lyo(com.android.dialer.conversationhistorycalldetails.ConversationHistoryCallDetailsWrapperActivity conversationHistoryCallDetailsWrapperActivity, zjm zjmVar, ttj ttjVar, rhx rhxVar, ipc ipcVar, aoin aoinVar) {
        aooh.f(aoinVar, "enableMeetApiIntegration");
        this.a = conversationHistoryCallDetailsWrapperActivity;
        this.e = zjmVar;
        this.f = ttjVar;
        this.b = rhxVar;
        this.g = ipcVar;
        this.c = aoinVar;
    }
}
