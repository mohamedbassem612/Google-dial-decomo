package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes3.dex */
final class ackj extends dye {
    final /* synthetic */ ahyn a;
    final /* synthetic */ defpackage.ackk b;

    public ackj(defpackage.ackk ackkVar, ahyn ahynVar) {
        this.a = ahynVar;
        j$.util.Objects.requireNonNull(ackkVar);
        this.b = ackkVar;
    }

    public final void b(android.view.View view, android.view.accessibility.AccessibilityEvent accessibilityEvent) {
        super.b(view, accessibilityEvent);
        if (accessibilityEvent.getEventType() == 65536) {
            this.b.b();
        }
    }

    /* JADX WARN: Type inference failed for: r1v6, types: [java.lang.CharSequence, java.lang.Object] */
    public final void c(android.view.View view, ebd ebdVar) {
        super.c(view, ebdVar);
        if (android.text.TextUtils.isEmpty(ebdVar.f())) {
            ebdVar.S((java.lang.CharSequence) this.a.b());
            return;
        }
        ebdVar.S(java.lang.String.valueOf(ebdVar.f()) + ", " + ((java.lang.String) this.a.b()));
    }
}
