package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes2.dex */
final class gef implements android.content.DialogInterface.OnMultiChoiceClickListener {
    final /* synthetic */ defpackage.geg a;

    public gef(defpackage.geg gegVar) {
        this.a = gegVar;
    }

    @Override // android.content.DialogInterface.OnMultiChoiceClickListener
    public final void onClick(android.content.DialogInterface dialogInterface, int i, boolean z) {
        defpackage.geg gegVar = this.a;
        boolean z2 = gegVar.al;
        if (z) {
            gegVar.al = z2 | gegVar.ak.add(gegVar.an[i].toString());
        } else {
            gegVar.al = z2 | gegVar.ak.remove(gegVar.an[i].toString());
        }
    }
}
