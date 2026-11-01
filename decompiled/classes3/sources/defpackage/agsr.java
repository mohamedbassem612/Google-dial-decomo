package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes3.dex */
public final class agsr {
    public final android.app.Notification a;
    final int b;
    final java.lang.String c;

    public agsr(android.app.Notification notification, int i, java.lang.String str) {
        this.a = notification;
        this.b = i;
        this.c = str;
    }

    public final java.lang.String toString() {
        return "Trace=[" + this.c + "], importance=[" + this.b + ']' + (", notification=[" + this.a.getChannelId() + ']');
    }
}
