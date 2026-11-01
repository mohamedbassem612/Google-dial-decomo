package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes3.dex */
public final class ahyd extends ahxt implements java.io.Serializable {
    private static final long serialVersionUID = 0;
    private final ahyc a;
    private final ahxt b;

    public ahyd(ahyc ahycVar, ahxt ahxtVar) {
        this.a = ahycVar;
        this.b = ahxtVar;
    }

    protected final int a(java.lang.Object obj) {
        return this.b.c(this.a.apply(obj));
    }

    protected final boolean b(java.lang.Object obj, java.lang.Object obj2) {
        ahyc ahycVar = this.a;
        return this.b.d(ahycVar.apply(obj), ahycVar.apply(obj2));
    }

    public final boolean equals(java.lang.Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof defpackage.ahyd) {
            defpackage.ahyd ahydVar = (defpackage.ahyd) obj;
            if (this.a.equals(ahydVar.a) && this.b.equals(ahydVar.b)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return j$.util.Objects.hash(new java.lang.Object[]{this.a, this.b});
    }

    public final java.lang.String toString() {
        ahyc ahycVar = this.a;
        return this.b.toString() + ".onResultOf(" + ahycVar.toString() + ')';
    }
}
