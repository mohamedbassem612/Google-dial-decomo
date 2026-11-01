package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes2.dex */
final class atz {
    public final long a;
    public final long b;
    public final boolean c;

    public atz(long j, long j2, boolean z) {
        this.a = j;
        this.b = j2;
        this.c = z;
    }

    public final defpackage.atz a(defpackage.atz atzVar) {
        long jBl = mni.bl(this.a, atzVar.a);
        long jMax = java.lang.Math.max(this.b, atzVar.b);
        boolean z = true;
        if (!this.c && !atzVar.c) {
            z = false;
        }
        return new defpackage.atz(jBl, jMax, z);
    }
}
