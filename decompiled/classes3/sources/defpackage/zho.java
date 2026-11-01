package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes3.dex */
public final class zho {
    public static final aimz a = aimz.i("com/google/android/callingshared/telephony/CallingSubscriptionManager");
    public static final android.content.ComponentName b = new android.content.ComponentName("com.android.phone", "com.android.services.telephony.TelephonyConnectionService");
    public final android.telephony.SubscriptionManager c;
    public final defpackage.zhp d;
    public final aolr e;

    public zho(android.telephony.SubscriptionManager subscriptionManager, defpackage.zhp zhpVar, aolr aolrVar) {
        aooh.f(zhpVar, "callingTelecom");
        aooh.f(aolrVar, "blockingContext");
        this.c = subscriptionManager;
        this.d = zhpVar;
        this.e = aolrVar;
    }
}
