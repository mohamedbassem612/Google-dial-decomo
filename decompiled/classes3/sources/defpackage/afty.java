package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes3.dex */
public final class afty extends dye {
    final /* synthetic */ com.google.android.material.internal.CheckableImageButton a;

    public afty(com.google.android.material.internal.CheckableImageButton checkableImageButton) {
        j$.util.Objects.requireNonNull(checkableImageButton);
        this.a = checkableImageButton;
    }

    public final void b(android.view.View view, android.view.accessibility.AccessibilityEvent accessibilityEvent) {
        super.b(view, accessibilityEvent);
        accessibilityEvent.setChecked(this.a.a);
    }

    public final void c(android.view.View view, ebd ebdVar) {
        super.c(view, ebdVar);
        com.google.android.material.internal.CheckableImageButton checkableImageButton = this.a;
        ebdVar.q(checkableImageButton.b);
        ebdVar.r(checkableImageButton.a);
    }
}
