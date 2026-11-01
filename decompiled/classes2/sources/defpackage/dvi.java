package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes2.dex */
public final class dvi {
    private final java.lang.CharSequence a;
    private final long b;
    private final defpackage.dvv c;
    private final android.os.Bundle d = new android.os.Bundle();

    public dvi(java.lang.CharSequence charSequence, long j, defpackage.dvv dvvVar) {
        this.a = charSequence;
        this.b = j;
        this.c = dvvVar;
    }

    final android.app.Notification.MessagingStyle.Message a() {
        android.app.Notification.MessagingStyle.Message messageA = defpackage.dvh.a(this.a, this.b, defpackage.dux.d(this.c));
        defpackage.dvh.b(messageA, this.d);
        return messageA;
    }
}
