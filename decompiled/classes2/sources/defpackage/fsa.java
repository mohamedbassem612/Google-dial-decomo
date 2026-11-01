package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes2.dex */
public final class fsa {
    public static final java.util.Comparator a = new defpackage.djh(16);
    public final defpackage.ess b;
    public final int c;

    public fsa(java.lang.CharSequence charSequence, android.text.Layout.Alignment alignment, float f, int i, float f2, int i2, boolean z, int i3, int i4) {
        defpackage.esr esrVar = new defpackage.esr();
        esrVar.d(charSequence);
        esrVar.b = alignment;
        esrVar.c(f, 0);
        esrVar.d = i;
        esrVar.e = f2;
        esrVar.f = i2;
        esrVar.g = -3.4028235E38f;
        if (z) {
            esrVar.f(i3);
        }
        this.b = esrVar.a();
        this.c = i4;
    }
}
