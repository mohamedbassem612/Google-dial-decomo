package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes3.dex */
public final class rsc extends pez {
    public final int a;

    public rsc(int i) {
        super((short[]) null);
        this.a = i;
    }

    public final boolean equals(java.lang.Object obj) {
        if (this != obj) {
            return (obj instanceof defpackage.rsc) && this.a == ((defpackage.rsc) obj).a;
        }
        return true;
    }

    public final int hashCode() {
        return this.a;
    }

    public final java.lang.String toString() {
        return "ImageResource(imageId=" + this.a + ')';
    }
}
