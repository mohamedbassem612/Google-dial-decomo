package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes2.dex */
@java.lang.Deprecated
public final class hsm {
    public static final aimz a = aimz.i("com/android/dialer/app/calllog/CallLogNotificationsQueryHelper");
    public final ojo b;
    private final android.content.Context c;
    private final ajct d;

    public hsm(android.content.Context context, ajct ajctVar, ojo ojoVar) {
        this.c = context;
        this.d = ajctVar;
        this.b = ojoVar;
    }

    private final ajcq c(android.content.Context context, android.net.Uri uri) {
        return ahvr.F(new defpackage.hsl(this, context, uri, 0), this.d);
    }

    final void a() {
        agsm.i(81, c(this.c, null), "\"Mark all missed calls in call log as read\" failed.", new java.lang.Object[0]);
    }

    public final void b(android.net.Uri uri) {
        if (uri == null) {
            a.bI(a.c().m(aioa.b), "call URI is null, unable to mark call as read", "com/android/dialer/app/calllog/CallLogNotificationsQueryHelper", "markSingleMissedCallInCallLogAsRead", 'M', "CallLogNotificationsQueryHelper.java", zct.b);
        } else {
            agsm.i(82, c(this.c, uri), "\"Mark all missed calls in call log as read\" failed.", new java.lang.Object[0]);
        }
    }
}
