package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes.dex */
public final class amo {
    private final android.content.Context a;
    private final defpackage.dpf b;
    private final long c = -43234558140743680L;
    private final defpackage.ayy d;

    public amo(android.content.Context context, defpackage.dpf dpfVar, defpackage.ayy ayyVar) {
        this.a = context;
        this.b = dpfVar;
        this.d = ayyVar;
    }

    public final defpackage.amn a() {
        return new defpackage.amn(this.a, this.b, this.d);
    }

    public final boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (defpackage.aooh.n(getClass(), obj != null ? obj.getClass() : null)) {
            if (obj == null) {
                defpackage.aooh.h("null cannot be cast to non-null type androidx.compose.foundation.AndroidEdgeEffectOverscrollFactory");
            }
            defpackage.amo amoVar = (defpackage.amo) obj;
            if (defpackage.aooh.n(this.a, amoVar.a) && defpackage.aooh.n(this.b, amoVar.b)) {
                long j = amoVar.c;
                if (defpackage.aooh.n(this.d, amoVar.d)) {
                    return true;
                }
            }
        }
        return false;
    }

    public final int hashCode() {
        return (((((this.a.hashCode() * 31) + this.b.hashCode()) * 31) - 10066330) * 31) + this.d.hashCode();
    }
}
