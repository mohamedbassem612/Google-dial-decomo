package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes2.dex */
public final class ebb extends android.text.style.ClickableSpan {
    private final int a;
    private final defpackage.ebd b;
    private final int c;

    public ebb(int i, defpackage.ebd ebdVar, int i2) {
        this.a = i;
        this.b = ebdVar;
        this.c = i2;
    }

    @Override // android.text.style.ClickableSpan
    public final void onClick(android.view.View view) {
        android.os.Bundle bundle = new android.os.Bundle();
        bundle.putInt("ACCESSIBILITY_CLICKABLE_SPAN_ID", this.a);
        this.b.a.performAction(this.c, bundle);
    }
}
