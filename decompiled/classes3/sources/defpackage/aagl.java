package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes3.dex */
public final class aagl extends defpackage.aago {
    final /* synthetic */ android.content.Intent a;
    final /* synthetic */ android.app.Activity b;
    final /* synthetic */ int c;

    public aagl(android.content.Intent intent, android.app.Activity activity, int i) {
        this.a = intent;
        this.b = activity;
        this.c = i;
    }

    @Override // defpackage.aago
    public final void a() {
        android.content.Intent intent = this.a;
        if (intent != null) {
            this.b.startActivityForResult(intent, this.c);
        }
    }
}
