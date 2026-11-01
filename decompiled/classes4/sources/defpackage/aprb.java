package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes4.dex */
public final class aprb {
    public final defpackage.aprc a;
    public final defpackage.aprc b;
    public final defpackage.aprc c;

    public aprb() {
        defpackage.aprc aprcVar = new defpackage.aprc();
        defpackage.aprc aprcVar2 = new defpackage.aprc();
        defpackage.aprc aprcVar3 = new defpackage.aprc();
        this.a = aprcVar;
        this.b = aprcVar2;
        this.c = aprcVar3;
    }

    public final boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof defpackage.aprb) {
            defpackage.aprb aprbVar = (defpackage.aprb) obj;
            if (j$.util.Objects.equals(this.a, aprbVar.a) && j$.util.Objects.equals(this.b, aprbVar.b) && j$.util.Objects.equals(this.c, aprbVar.c)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return j$.util.Objects.hash(new java.lang.Object[]{this.a, this.b, this.c});
    }

    public final java.lang.String toString() {
        return java.lang.String.format("%,d files, %,d directories, %,d bytes", java.lang.Long.valueOf(this.c.a), java.lang.Long.valueOf(this.b.a), java.lang.Long.valueOf(this.a.a));
    }
}
