package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes3.dex */
final class agdd extends defpackage.afvk {
    final /* synthetic */ defpackage.agdf a;

    public agdd(defpackage.agdf agdfVar) {
        j$.util.Objects.requireNonNull(agdfVar);
        this.a = agdfVar;
    }

    @Override // defpackage.afvk, android.text.TextWatcher
    public final void afterTextChanged(android.text.Editable editable) {
        this.a.c().l();
    }

    @Override // defpackage.afvk, android.text.TextWatcher
    public final void beforeTextChanged(java.lang.CharSequence charSequence, int i, int i2, int i3) {
        this.a.c().y();
    }
}
