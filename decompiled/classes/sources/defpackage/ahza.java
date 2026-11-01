package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes.dex */
final class ahza extends defpackage.ahwu {
    final /* synthetic */ defpackage.ahxn g;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ahza(defpackage.ahzf ahzfVar, java.lang.CharSequence charSequence, defpackage.ahxn ahxnVar) {
        super(ahzfVar, charSequence);
        this.g = ahxnVar;
    }

    @Override // defpackage.ahwu
    public final int a(int i) {
        return i + 1;
    }

    @Override // defpackage.ahwu
    public final int b(int i) {
        return this.g.e(this.b, i);
    }
}
