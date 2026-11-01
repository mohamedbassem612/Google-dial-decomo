package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes.dex */
public final class crf extends defpackage.cqd implements defpackage.cqq {
    public final long a;

    public crf(long j) {
        this.a = j;
    }

    @Override // defpackage.cqd
    public final void a(long j, defpackage.cpv cpvVar, float f) {
        cpvVar.h(1.0f);
        long jN = this.a;
        if (f != 1.0f) {
            float fA = defpackage.cqg.a(jN) * f;
            float fD = defpackage.cqg.d(jN);
            float fC = defpackage.cqg.c(jN);
            float fB = defpackage.cqg.b(jN);
            float[] fArr = defpackage.crp.a;
            jN = defpackage.cfd.N(fD, fC, fB, fA, defpackage.crp.y[(int) (jN & 63)]);
        }
        cpvVar.j(jN);
        if (cpvVar.c != null) {
            cpvVar.m(null);
        }
    }

    @Override // defpackage.cqq
    public final java.lang.Object c(java.lang.Object obj, float f) {
        throw null;
    }

    public final boolean equals(java.lang.Object obj) {
        if (this != obj) {
            return (obj instanceof defpackage.crf) && this.a == ((defpackage.crf) obj).a;
        }
        return true;
    }

    public final int hashCode() {
        long j = this.a;
        return (int) (j ^ (j >>> 32));
    }

    public final java.lang.String toString() {
        return "SolidColor(value=" + defpackage.cqg.g(this.a) + ')';
    }
}
