package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes3.dex */
final class wdy extends dye {
    final /* synthetic */ boolean a;
    final /* synthetic */ com.android.dialer.widget.bubble.impl.CheckableButton b;

    public wdy(com.android.dialer.widget.bubble.impl.CheckableButton checkableButton, boolean z) {
        this.a = z;
        j$.util.Objects.requireNonNull(checkableButton);
        this.b = checkableButton;
    }

    public final void b(android.view.View view, android.view.accessibility.AccessibilityEvent accessibilityEvent) {
        super.b(view, accessibilityEvent);
        if (this.a) {
            accessibilityEvent.setChecked(this.b.b);
        }
    }

    public final void c(android.view.View view, ebd ebdVar) {
        super.c(view, ebdVar);
        boolean z = this.a;
        ebdVar.q(z);
        if (z) {
            ebdVar.r(this.b.b);
        }
    }
}
