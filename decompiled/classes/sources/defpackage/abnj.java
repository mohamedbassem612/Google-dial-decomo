package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes.dex */
public final class abnj {
    public final defpackage.ajh a;
    public final defpackage.ajh b;
    public final defpackage.ajh c;
    public final defpackage.ajh d;
    public final defpackage.ajh e;
    private final defpackage.ajh f;
    private final defpackage.ajh g;

    public /* synthetic */ abnj(byte[] bArr) {
        defpackage.ajb ajbVar = new defpackage.ajb(0.2f, 0.0f, 0.0f, 1.0f);
        defpackage.ajb ajbVar2 = new defpackage.ajb(0.3f, 0.0f, 0.8f, 0.15f);
        defpackage.ajb ajbVar3 = new defpackage.ajb(0.05f, 0.7f, 0.1f, 1.0f);
        defpackage.ajh ajhVar = defpackage.ajk.d;
        defpackage.ajb ajbVar4 = new defpackage.ajb(0.2f, 0.0f, 0.0f, 1.0f);
        defpackage.ajb ajbVar5 = new defpackage.ajb(0.3f, 0.0f, 1.0f, 1.0f);
        defpackage.ajb ajbVar6 = new defpackage.ajb(0.0f, 0.0f, 0.0f, 1.0f);
        if (ajhVar == null) {
            defpackage.aooh.i("linear");
        }
        this.a = ajbVar;
        this.b = ajbVar2;
        this.f = ajbVar3;
        this.c = ajhVar;
        this.d = ajbVar4;
        this.g = ajbVar5;
        this.e = ajbVar6;
    }

    public final boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof defpackage.abnj) {
            defpackage.abnj abnjVar = (defpackage.abnj) obj;
            if (defpackage.aooh.n(this.a, abnjVar.a) && defpackage.aooh.n(this.b, abnjVar.b) && defpackage.aooh.n(this.f, abnjVar.f) && defpackage.aooh.n(this.c, abnjVar.c) && defpackage.aooh.n(this.d, abnjVar.d) && defpackage.aooh.n(this.g, abnjVar.g) && defpackage.aooh.n(this.e, abnjVar.e)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return (((((((((((this.a.hashCode() * 31) + this.b.hashCode()) * 31) + this.f.hashCode()) * 31) + this.c.hashCode()) * 31) + this.d.hashCode()) * 31) + this.g.hashCode()) * 31) + this.e.hashCode();
    }

    public final java.lang.String toString() {
        return "Easing(emphasized=" + this.a + ", emphasizedAccelerate=" + this.b + ", emphasizedDecelerate=" + this.f + ", linear=" + this.c + ", standard=" + this.d + ", standardAccelerate=" + this.g + ", standardDecelerate=" + this.e + ')';
    }

    public abnj() {
        this(null);
    }
}
