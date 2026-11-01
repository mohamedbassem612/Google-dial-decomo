package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes2.dex */
public final class ebt {
    public int a = -1;
    public dwn b = dwn.a;
    public boolean c = false;
    public android.graphics.drawable.Drawable d = null;
    public float e = 0.0f;
    public float f = 1.0f;
    public defpackage.ebw g;

    public final void a(defpackage.ebw ebwVar) {
        if (this.g != null && ebwVar != null) {
            throw new java.lang.IllegalStateException("Trying to overwrite the existing callback. Did you send one protection to multiple ProtectionLayouts?");
        }
        this.g = ebwVar;
    }
}
