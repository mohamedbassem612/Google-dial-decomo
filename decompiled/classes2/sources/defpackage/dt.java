package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes2.dex */
public class dt extends defpackage.al {
    @Override // defpackage.al
    public android.app.Dialog eb(android.os.Bundle bundle) {
        return new defpackage.ds(z(), ec());
    }

    @Override // defpackage.al
    public final void p(android.app.Dialog dialog, int i) {
        if (!(dialog instanceof defpackage.ds)) {
            super.p(dialog, i);
            return;
        }
        defpackage.ds dsVar = (defpackage.ds) dialog;
        if (i != 1 && i != 2) {
            if (i != 3) {
                return;
            } else {
                dialog.getWindow().addFlags(24);
            }
        }
        dsVar.g();
    }
}
