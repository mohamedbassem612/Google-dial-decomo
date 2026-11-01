package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes.dex */
public final class cqa extends defpackage.cqh {
    public final int a;
    private final long c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public cqa(long j, int i) {
        super(new android.graphics.BlendModeColorFilter((int) (defpackage.cqg.e(j, defpackage.crp.e) >>> 32), defpackage.rz.i(i)));
        float[] fArr = defpackage.crp.a;
        this.c = j;
        this.a = i;
    }

    public final boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof defpackage.cqa) {
            defpackage.cqa cqaVar = (defpackage.cqa) obj;
            if (this.c == cqaVar.c && this.a == cqaVar.a) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        long j = this.c;
        return (((int) (j ^ (j >>> 32))) * 31) + this.a;
    }

    public final java.lang.String toString() {
        return "BlendModeColorFilter(color=" + defpackage.cqg.g(this.c) + ", blendMode=" + defpackage.cpz.a(this.a) + ')';
    }
}
