package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes2.dex */
public final class hhr {
    public androidx.car.app.model.Header a;
    public java.lang.String b;
    public final androidx.car.app.model.Action c;
    public defpackage.hhm d;
    public final defpackage.xe e;
    public final java.util.Map f = new java.util.HashMap(13);

    public hhr(androidx.car.app.model.Action action, defpackage.hhs hhsVar) {
        com.android.car.libraries.apphost.external.model.TelephoneKeypadTemplate.KEYPAD_TEMPLATE_ACTION_CONSTRAINTS.a(java.util.Collections.singletonList(action));
        this.c = action;
        this.e = androidx.car.app.model.InputCallbackDelegateImpl.create(new defpackage.hhq(this, hhsVar));
    }

    public final com.android.car.libraries.apphost.external.model.TelephoneKeypadTemplate a() {
        androidx.car.app.model.Action startHeaderAction;
        androidx.car.app.model.Header header = this.a;
        if (header != null && (startHeaderAction = header.getStartHeaderAction()) != null) {
            com.android.car.libraries.apphost.external.model.TelephoneKeypadTemplate.HEADER_ACTION_CONSTRAINT.a(java.util.Collections.singletonList(startHeaderAction));
        }
        return new com.android.car.libraries.apphost.external.model.TelephoneKeypadTemplate(this, null);
    }

    public final void b(defpackage.hhl hhlVar) {
        if (hhlVar == null) {
            this.d = null;
        } else {
            this.d = new com.android.car.libraries.apphost.external.model.TelephoneKeypadEventListenerDelegateImpl(hhlVar);
        }
    }
}
