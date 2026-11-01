package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes.dex */
public final class bti {
    public final defpackage.bfx a;
    public final defpackage.bfx b;
    public final defpackage.bfx c;
    public final defpackage.bfx d;
    public final defpackage.bfx e;
    public final defpackage.bfx f;
    public final defpackage.bfx g;
    public final defpackage.bfx h;
    public bnv i;
    public brc j;

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public bti() {
        this(defpackage.bth.a, defpackage.bth.b, defpackage.bth.c, defpackage.bth.d, defpackage.bth.f, defpackage.bth.e, defpackage.bth.g, defpackage.bth.h);
        defpackage.bfx bfxVar = defpackage.bth.a;
    }

    public final boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof defpackage.bti) {
            defpackage.bti btiVar = (defpackage.bti) obj;
            if (defpackage.aooh.n(this.a, btiVar.a) && defpackage.aooh.n(this.b, btiVar.b) && defpackage.aooh.n(this.c, btiVar.c) && defpackage.aooh.n(this.d, btiVar.d) && defpackage.aooh.n(this.e, btiVar.e) && defpackage.aooh.n(this.f, btiVar.f) && defpackage.aooh.n(this.g, btiVar.g) && defpackage.aooh.n(this.h, btiVar.h)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return (((((((((((((this.a.hashCode() * 31) + this.b.hashCode()) * 31) + this.c.hashCode()) * 31) + this.d.hashCode()) * 31) + this.e.hashCode()) * 31) + this.f.hashCode()) * 31) + this.g.hashCode()) * 31) + this.h.hashCode();
    }

    public final java.lang.String toString() {
        return "Shapes(extraSmall=" + this.a + ", small=" + this.b + ", medium=" + this.c + ", large=" + this.d + ", largeIncreased=" + this.f + ", extraLarge=" + this.e + ", extralargeIncreased=" + this.g + ", extraExtraLarge=" + this.h + ')';
    }

    public bti(defpackage.bfx bfxVar, defpackage.bfx bfxVar2, defpackage.bfx bfxVar3, defpackage.bfx bfxVar4, defpackage.bfx bfxVar5, defpackage.bfx bfxVar6, defpackage.bfx bfxVar7, defpackage.bfx bfxVar8) {
        this.a = bfxVar;
        this.b = bfxVar2;
        this.c = bfxVar3;
        this.d = bfxVar4;
        this.e = bfxVar5;
        this.f = bfxVar6;
        this.g = bfxVar7;
        this.h = bfxVar8;
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ bti(byte[] bArr) {
        this(defpackage.bth.a, defpackage.bth.b, defpackage.bth.c, defpackage.bth.d, defpackage.bth.f, defpackage.bth.e, defpackage.bth.g, defpackage.bth.h);
        defpackage.bfx bfxVar = defpackage.bth.a;
    }
}
