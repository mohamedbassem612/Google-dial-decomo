package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes4.dex */
public final class dzc implements dze {
    private final android.view.ScrollFeedbackProvider a;

    public dzc(android.view.View view) {
        this.a = android.view.ScrollFeedbackProvider.createProvider(view);
    }

    public final void a(int i, int i2, int i3, boolean z) {
        this.a.onScrollLimit(i, i2, i3, z);
    }

    public final void b(int i, int i2, int i3, int i4) {
        this.a.onScrollProgress(i, i2, i3, i4);
    }
}
