package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes3.dex */
public final class aagm extends defpackage.aago {
    final /* synthetic */ android.content.Intent a;
    final /* synthetic */ defpackage.aaez b;

    public aagm(android.content.Intent intent, defpackage.aaez aaezVar) {
        this.a = intent;
        this.b = aaezVar;
    }

    @Override // defpackage.aago
    public final void a() {
        this.b.startActivityForResult(this.a, 2);
    }
}
