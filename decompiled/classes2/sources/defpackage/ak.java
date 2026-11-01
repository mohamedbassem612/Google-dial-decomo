package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes2.dex */
final class ak extends bb {
    final /* synthetic */ bb a;
    final /* synthetic */ defpackage.al b;

    public ak(defpackage.al alVar, bb bbVar) {
        this.a = bbVar;
        this.b = alVar;
    }

    public final android.view.View a(int i) {
        bb bbVar = this.a;
        if (bbVar.b()) {
            return bbVar.a(i);
        }
        android.app.Dialog dialog = this.b.d;
        if (dialog != null) {
            return dialog.findViewById(i);
        }
        return null;
    }

    public final boolean b() {
        return this.a.b() || this.b.e;
    }
}
