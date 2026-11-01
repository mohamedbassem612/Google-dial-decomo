package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes2.dex */
public final class doc extends android.text.style.ClickableSpan {
    private final defpackage.djw a;

    public doc(defpackage.djw djwVar) {
        this.a = djwVar;
    }

    @Override // android.text.style.ClickableSpan
    public final void onClick(android.view.View view) {
        defpackage.djw djwVar = this.a;
        defpackage.djx djxVarA = djwVar.a();
        if (djxVarA != null) {
            djxVarA.a(djwVar);
        }
    }
}
