package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes.dex */
public final class rwj {
    public static final defpackage.aimz a = defpackage.aimz.i("com/android/dialer/notification/DialerNotificationManagerSync");
    public final defpackage.rwi b;
    public final defpackage.rwq c;

    public rwj(defpackage.rwi rwiVar, defpackage.rwq rwqVar) {
        this.b = rwiVar;
        this.c = rwqVar;
    }

    public final void a(java.lang.String str, android.app.Notification notification) {
        defpackage.ahvr.bM(!android.text.TextUtils.isEmpty(str));
        defpackage.ahvr.bM(!android.text.TextUtils.isEmpty(aa$.ExternalSyntheticApiModelOutline0.m(notification)));
        this.c.h();
        this.b.k(str, 1, notification);
    }
}
