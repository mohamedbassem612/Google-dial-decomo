package defpackage;

/* JADX INFO: renamed from: if, reason: invalid class name */
/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes.dex */
final class Cif extends defpackage.dwj {
    final /* synthetic */ int a;
    final /* synthetic */ int b;
    final /* synthetic */ java.lang.ref.WeakReference c;
    final /* synthetic */ defpackage.ii d;

    public Cif(defpackage.ii iiVar, int i, int i2, java.lang.ref.WeakReference weakReference) {
        this.a = i;
        this.b = i2;
        this.c = weakReference;
        this.d = iiVar;
    }

    @Override // defpackage.dwj
    public final void b(android.graphics.Typeface typeface) {
        int i = this.a;
        if (i != -1) {
            typeface = ft$.ExternalSyntheticApiModelOutline0.m(typeface, i, (this.b & 2) != 0);
        }
        defpackage.ii iiVar = this.d;
        java.lang.ref.WeakReference weakReference = this.c;
        if (iiVar.c) {
            iiVar.b = typeface;
            android.widget.TextView textView = (android.widget.TextView) weakReference.get();
            if (textView != null) {
                if (textView.isAttachedToWindow()) {
                    textView.post(new mo(textView, typeface, iiVar.a, 1));
                } else {
                    defpackage.ii.b(textView, typeface, iiVar.a);
                }
            }
        }
    }

    @Override // defpackage.dwj
    public final void a(int i) {
    }
}
