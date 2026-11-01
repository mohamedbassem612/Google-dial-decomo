package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes2.dex */
public final class dvj extends defpackage.dvk {
    private final java.util.List a = new java.util.ArrayList();
    private final java.util.List b = new java.util.ArrayList();
    private defpackage.dvv f;
    private java.lang.Boolean g;

    public dvj(defpackage.dvv dvvVar) {
        if (android.text.TextUtils.isEmpty(dvvVar.a)) {
            throw new java.lang.IllegalArgumentException("User's name must not be empty.");
        }
        this.f = dvvVar;
    }

    @Override // defpackage.dvk
    protected final java.lang.String a() {
        return "androidx.core.app.NotificationCompat$MessagingStyle";
    }

    @Override // defpackage.dvk
    public final void b(izg izgVar) {
        java.lang.Boolean bool;
        defpackage.dva dvaVar = this.c;
        boolean zBooleanValue = false;
        if ((dvaVar == null || dvaVar.a.getApplicationInfo().targetSdkVersion >= 28 || this.g != null) && (bool = this.g) != null) {
            zBooleanValue = bool.booleanValue();
        }
        this.g = java.lang.Boolean.valueOf(zBooleanValue);
        android.app.Notification.MessagingStyle messagingStyleA = defpackage.dvg.a(defpackage.dux.d(this.f));
        java.util.Iterator it = this.a.iterator();
        while (it.hasNext()) {
            defpackage.dve.a(messagingStyleA, ((defpackage.dvi) it.next()).a());
        }
        java.util.Iterator it2 = this.b.iterator();
        while (it2.hasNext()) {
            dvf.a(messagingStyleA, ((defpackage.dvi) it2.next()).a());
        }
        this.g.booleanValue();
        defpackage.dve.b(messagingStyleA, null);
        defpackage.dvg.b(messagingStyleA, this.g.booleanValue());
        messagingStyleA.setBuilder((android.app.Notification.Builder) izgVar.a);
    }

    public final void d(java.lang.CharSequence charSequence, long j, defpackage.dvv dvvVar) {
        defpackage.dvi dviVar = new defpackage.dvi(charSequence, j, dvvVar);
        java.util.List list = this.a;
        list.add(dviVar);
        if (list.size() > 25) {
            list.remove(0);
        }
    }
}
