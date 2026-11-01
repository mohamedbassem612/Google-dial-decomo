package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes3.dex */
public final class vaw implements ahjr {
    private static final aimz a = aimz.i("com/android/dialer/voicemail/notification/receivers/MwiNotificationDismissalReceiver");
    private final zjv b;
    private final zjm c;

    public vaw(zjm zjmVar, zjv zjvVar) {
        this.c = zjmVar;
        this.b = zjvVar;
    }

    /* JADX WARN: Type inference failed for: r4v2, types: [java.lang.Object, java.util.concurrent.Executor] */
    public final ajcq a(android.content.Intent intent, int i) {
        a.b().l("com/android/dialer/voicemail/notification/receivers/MwiNotificationDismissalReceiver", "onReceive", 46, "MwiNotificationDismissalReceiver.java").v("enter");
        ahvr.cj(intent.getAction(), "action is null");
        ahvr.bN(intent.hasExtra("PHONE_ACCOUNT_HANDLE"), "phone account doesn't exist");
        android.telecom.PhoneAccountHandle phoneAccountHandle = (android.telecom.PhoneAccountHandle) intent.getParcelableExtra("PHONE_ACCOUNT_HANDLE");
        this.b.d(getClass(), intent, aify.p(aais.aE(phoneAccountHandle)));
        defpackage.van vanVar = new defpackage.van(phoneAccountHandle, 8);
        zjm zjmVar = this.c;
        return ((afhf) zjmVar.a).a(vanVar, (java.util.concurrent.Executor) zjmVar.b);
    }
}
