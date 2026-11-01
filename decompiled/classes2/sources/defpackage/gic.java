package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes2.dex */
public final class gic implements gig {
    public final java.util.Set a = new java.util.LinkedHashSet();

    public gic(aaha aahaVar) {
        aahaVar.e("androidx.savedstate.Restarter", this);
    }

    public final android.os.Bundle a() {
        android.os.Bundle bundleR = dpe.r((aoiu[]) java.util.Arrays.copyOf(new aoiu[0], 0));
        gij.e(bundleR, "classes_to_restore", ajsz.bZ(this.a));
        return bundleR;
    }
}
